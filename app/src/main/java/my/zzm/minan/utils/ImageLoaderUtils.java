package my.zzm.minan.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.PauseOnScrollListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

/**
 * Created by AlexanDaking on 17/7/1.
 */

public class ImageLoaderUtils {
    public static ImageLoader getImageLoader() {
        return ImageLoader.getInstance();
    }


    public static PauseOnScrollListener getPauseOnScrollListener() {
        return new PauseOnScrollListener(getImageLoader(), true, true);
    }


    public static void displayImage(String uri, ImageView view) {
        getImageLoader().displayImage(uri, view, ImageOptHelper.getImgOptions());
    }


    public static void displayAvatar(String uri, ImageView view) {
        getImageLoader().displayImage(uri, view, ImageOptHelper.getAvatarOptions());
    }

    public static void displayBigImage(String uri, ImageView view) {
        displayBigImage(uri, view, null);
    }

    public static void displayBigImage(String uri, ImageView view, SimpleImageLoadingListener listener) {
        getImageLoader().displayImage(uri, view, ImageOptHelper.getBigImgOptions(), listener);
    }

    public static void loadImage(String path, final SimpleImageLoadingListener listener) {
        getImageLoader().loadImage(path, listener);
    }

    public interface LoadingListener {
        void onLoadingComplete(Bitmap loadedImage);
    }
}
