package com.instagram.debug.image;

import X.AbstractC166997dE;
import X.AbstractC81033jX;
import X.C5GF;
import X.InterfaceC114695Fz;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class DebugImageViewsTrackerImpl implements InterfaceC114695Fz {
    public ImageViewRunnable mImageViewInitializer;
    public ImageViewRunnable mImageViewResetter;
    public final Map mUrlToViews = new HashMap();

    /* loaded from: classes11.dex */
    public interface ImageViewRunnable {
        void run(IgImageView igImageView);
    }

    public void updateDebugInfo(String str, C5GF c5gf) {
    }

    private void iterateAllImageViews(ImageViewRunnable imageViewRunnable) {
        if (imageViewRunnable != null) {
            Iterator A16 = AbstractC166997dE.A16(this.mUrlToViews);
            while (A16.hasNext()) {
                Set set = (Set) A16.next();
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        imageViewRunnable.run((IgImageView) it.next());
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC114695Fz
    public void registerView(ImageView imageView) {
        ImageViewRunnable imageViewRunnable = this.mImageViewInitializer;
        if (imageViewRunnable != null && (imageView instanceof IgImageView)) {
            imageViewRunnable.run((IgImageView) imageView);
        }
    }

    public void reset() {
        iterateAllImageViews(this.mImageViewResetter);
        this.mUrlToViews.clear();
    }

    public void setImageViewInitializer(ImageViewInitializer imageViewInitializer) {
        iterateAllImageViews(this.mImageViewResetter);
        ImageViewRunnable imageViewRunnable = imageViewInitializer.mImageViewInitializer;
        this.mImageViewInitializer = imageViewRunnable;
        this.mImageViewResetter = imageViewInitializer.mImageViewResetter;
        iterateAllImageViews(imageViewRunnable);
    }

    @Override // X.InterfaceC114695Fz
    public void unregisterView(ImageView imageView) {
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            removeViewFromUrl(igImageView, igImageView.A0C);
        }
    }

    private void removeViewFromUrl(IgImageView igImageView, ImageUrl imageUrl) {
        if (!AbstractC81033jX.A03(imageUrl)) {
            Map map = this.mUrlToViews;
            String url = imageUrl.getUrl();
            Set set = (Set) map.get(url);
            if (set != null) {
                set.remove(igImageView);
                if (set.isEmpty()) {
                    this.mUrlToViews.remove(url);
                }
            }
        }
    }

    @Override // X.InterfaceC114695Fz
    public void updateUrl(ImageView imageView, ImageUrl imageUrl, ImageUrl imageUrl2) {
        registerView(imageView);
        if (imageView instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) imageView;
            removeViewFromUrl(igImageView, imageUrl);
            Set set = (Set) this.mUrlToViews.get(imageUrl2);
            if (set == null) {
                set = new HashSet();
                this.mUrlToViews.put(imageUrl2.getUrl(), set);
            }
            set.add(igImageView);
        }
    }
}
