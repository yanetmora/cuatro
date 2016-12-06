package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="files")
public class File implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="folder_id")
	private int folderID;
	@Column(name="owner_id")
	private int ownerID; 
	@Column(name="owner_local_path")
	private String 	ownerLocalPath;
	@Column(name="file_name")
	private String fileName;
	@Column(length=45)
	private String description;
	




public File(int folderID, int ownerID, String ownerLocalPath, String fileName, String description) {
		super();
		this.folderID = folderID;
		this.ownerID = ownerID;
		this.ownerLocalPath = ownerLocalPath;
		this.fileName = fileName;
		this.description = description;
	}



public 	File(){
	this(0,0,"","","");
	}



	
	public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public int getFolderID() {
	return folderID;
}



public void setFolderID(int folderID) {
	this.folderID = folderID;
}



public int getOwnerID() {
	return ownerID;
}



public void setOwnerID(int ownerID) {
	this.ownerID = ownerID;
}



public String getOwnerLocalPath() {
	return ownerLocalPath;
}



public void setOwnerLocalPath(String ownerLocalPath) {
	this.ownerLocalPath = ownerLocalPath;
}



public String getFileName() {
	return fileName;
}



public void setFileName(String fileName) {
	this.fileName = fileName;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



@Override
public String toString() {
	return "File [id=" + id + ", folderID=" + folderID + ", ownerID=" + ownerID + ", ownerLocalPath=" + ownerLocalPath
			+ ", fileName=" + fileName + ", description=" + description + "]";
}



	
	
	
	
	
}	
	
	
	
	

