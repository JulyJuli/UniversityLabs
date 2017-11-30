package resources;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Paths;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.imageio.ImageIO;

@ManagedBean
@SessionScoped
public class ImageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String image1, image2, message;
	private final File temp = Paths.get(".").toAbsolutePath().normalize().toFile();
	Logger log = Logger.getLogger(ImageBean.class.getName());

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String processImage() {

		try {
			
			ImageIO.write(ImageHandler.getProccessedImg(ImageIO.read(new File(image1)), ImageIO.read(new File(image2))),
					"png", new File("output.png"));
			setMessage("Success!");
			return "success.xhtml";
		} catch (IOException e) {
			log.throwing("ERROR", "getImage", e);
			setMessage("Error convert");
			return "fail.xhtml";
		}
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public File getTemp() {
		return temp;
	}

}
