package boot.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.File;

import boot.service.FileService;

@Controller
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@GetMapping("/all-files")
	public String allFiles(HttpServletRequest request){
		request.setAttribute("files", fileService.findAll());
		request.setAttribute("mode", "MODE_FILES");
		return "file";
	}
	
	@GetMapping("/new-file")
	public String newFile(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "file";
	}
	
	@PostMapping("/save-file")
	public String saveFile(@ModelAttribute File file, BindingResult bindingResult, HttpServletRequest request){
		fileService.save(file);
		request.setAttribute("files", fileService.findAll());
		request.setAttribute("mode", "MODE_FILES");
		return "file";
	}
	
	@GetMapping("/update-file")
	public String updateFile(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("file", fileService.findFile(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "file";
	}
	
	@GetMapping("/delete-file")
	public String deleteFile(@RequestParam int id, HttpServletRequest request){
		fileService.delete(id);
		request.setAttribute("files", fileService.findAll());
		request.setAttribute("mode", "MODE_FILES");
		return "file";
	}
}
