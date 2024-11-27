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
    
    public void ModificarArchivo(String Oldcadena, String Newcadena, File Oarchivo){
        File Narchivo = new File("D:\\DB\\temp.txt");

        try {
            Narchivo.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        BufferedReader br;
        try {
            if (Oarchivo.exists()) {

                br = new BufferedReader(new FileReader(Oarchivo));

                String linea;

                while ((linea = br.readLine()) != null) {

                    if (linea.equals(Oldcadena)) {
                        Guardar(Newcadena, Narchivo);
                    } else {
                        Guardar(linea, Narchivo);
                    }
                }
               
                br.close();

                BorrarArchivo(Oarchivo);
                Narchivo.renameTo(Oarchivo);

            } else {
                System.out.println("No existe el archivo");
            }

        } catch (IOException e) {
            System.out.println(e);
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
