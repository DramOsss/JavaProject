package ManejoArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.*;

public class Archivos {
    public void Guardar(String cadena, File archivo){
        try{            
            if(!archivo.exists()){
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "El archivo no existe y sera creado");
            }
            try (BufferedWriter w = new BufferedWriter(new FileWriter(archivo, true))) {
                w.write(cadena + "\r\n");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void ModificarArchivo(String Oldcadena, String Newcadena, File Oarchivo) {
       // Obtener la ruta del escritorio de manera programática
       String escritorio = System.getProperty("user.home") + File.separator + "Desktop";
       File Narchivo = new File(escritorio + File.separator + "temp.txt");

       // Crear el archivo temporal si no existe
       try {
           if (!Narchivo.exists()) {
               Narchivo.createNewFile();
           }
       } catch (IOException ex) {
           System.out.println("Error al crear el archivo temporal: " + ex);
           return;
       }

       // Usar BufferedReader para leer y BufferedWriter para escribir
       try (BufferedReader br = new BufferedReader(new FileReader(Oarchivo));
            BufferedWriter bw = new BufferedWriter(new FileWriter(Narchivo))) {

           String linea;
           // Leer línea por línea del archivo original
           while ((linea = br.readLine()) != null) {
               // Si la línea coincide con Oldcadena, escribe Newcadena, si no, escribe la línea original
               if (linea.equals(Oldcadena)) {
                   bw.write(Newcadena);
               } else {
                   bw.write(linea);
               }
               bw.newLine(); // Para añadir una nueva línea después de cada línea escrita
           }

       } catch (IOException e) {
           System.out.println("Error al procesar el archivo: " + e);
           return;
       }

       // Borrar el archivo original y renombrar el archivo temporal
       if (Oarchivo.exists()) {
           if (Oarchivo.delete()) {
               if (!Narchivo.renameTo(Oarchivo)) {
                   System.out.println("Error al renombrar el archivo temporal");
               }
           } else {
               System.out.println("No se pudo eliminar el archivo original");
           }
       } else {
           System.out.println("El archivo original no existe");
       }
   }
    
    public void BorrarArchivo(File f){
        try{
            if(f.exists()){
                f.delete();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }
}
