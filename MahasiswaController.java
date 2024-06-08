/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oryzac13.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oryzac11.model.Mahasiswa;
import oryzac12.view.FormMahasiswa;
import oryzac11.model.MahasiswaDao;

/**
 *
 * @author ORYZA CONSEVA
 */
public class MahasiswaController {
    FormMahasiswa formMahasiswa;
    Mahasiswa mahasiswa;
    MahasiswaDao mahasiswaDao;
    int index;
    
    public MahasiswaController(FormMahasiswa formMahasiswa){
        this.formMahasiswa = formMahasiswa;
        mahasiswaDao = new MahasiswaDao();
    }
    
    public void cancel(){
        formMahasiswa.getTxtNobp().setText("");
        formMahasiswa.getTxtNama().setText("");
        formMahasiswa.getTxtAlamat().setText("");
        formMahasiswa.getTxtTanggalLahir().setText("");
        isiJenisKelamin();
    }
    
    public void isiJenisKelamin(){
        formMahasiswa.getCboJenisKelamin().removeAllItems();
        formMahasiswa.getCboJenisKelamin().addItem("L");
        formMahasiswa.getCboJenisKelamin().addItem("P"); 
    }
    
    public void insert(){
        mahasiswa = new Mahasiswa();
        mahasiswa.setNobp(formMahasiswa.getTxtNobp().getText());
        mahasiswa.setNama(formMahasiswa.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTgllahir(formMahasiswa.getTxtTanggalLahir().getText());
        mahasiswaDao.insert(mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa, "Entri Data Ok");
    }
    
    public void getMahasiswa(){
        int index = formMahasiswa.getTabelMahasiswa().getSelectedRow();
        mahasiswa = mahasiswaDao.getMahasiswa(index);
        if(mahasiswa != null){
            formMahasiswa.getTxtNobp().setText(mahasiswa.getNobp());
            formMahasiswa.getTxtNama().setText(mahasiswa.getNama());
            formMahasiswa.getTxtAlamat().setText(mahasiswa.getAlamat());
            formMahasiswa.getCboJenisKelamin().setSelectedItem(mahasiswa.getJenisKelamin());
            formMahasiswa.getTxtTanggalLahir().setText(mahasiswa.getTgllahir());
        }else{
            JOptionPane.showMessageDialog(formMahasiswa, "Mahasiswa Tidak Ada");
        }
    }
    
    public void viewData(){
        DefaultTableModel tableModel = (DefaultTableModel)formMahasiswa.getTabelMahasiswa().getModel();
        tableModel.setRowCount(0);
        List<Mahasiswa> data = mahasiswaDao.getAllMahasiswa();
        for(Mahasiswa mhs : data) {
            Object[] row = {
                mhs.getNobp(),
                mhs.getNama(),
                mhs.getAlamat(),
                mhs.getJenisKelamin(),
                mhs.getTgllahir()
            };
            tableModel.addRow(row);
        }
    }
    
    public void update(){
        mahasiswa.setNobp(formMahasiswa.getTxtNobp().getText());
        mahasiswa.setNama(formMahasiswa.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTgllahir(formMahasiswa.getTxtTanggalLahir().getText());
        mahasiswaDao.update(index, mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa, "Update Data Ok");
    }
    
    public void delete(){
        mahasiswaDao.delete(index);
        JOptionPane.showMessageDialog(formMahasiswa, "Delete Data Ok");
    }

}
