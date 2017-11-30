package resources;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImageHandler {

	public static BufferedImage getProccessedImg(BufferedImage image1, BufferedImage image2) {
		
		final int width = image1.getWidth(), height = image1.getHeight(), highlight = Color.RED.getRGB();
		final int[] pixels1 = image1.getRGB(0, 0, width, height, null, 0, width);
		final int[] pixels2 = image2.getRGB(0, 0, width, height, null, 0, width);
		
		for (int i = 0; i < pixels1.length; i++) {
			if (pixels1[i] != pixels2[i]) {
				pixels1[i] = highlight;
			}
			
		}
		
		final BufferedImage out = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		out.setRGB(0, 0, width, height, pixels1, 0, width);
		return out;
	}
	

}