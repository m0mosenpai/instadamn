package X;

import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class M2F implements Runnable {
    public final /* synthetic */ ImageView A00;

    public M2F(ImageView imageView) {
        this.A00 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.A00;
        imageView.setScaleX(0.5f);
        imageView.setScaleY(0.5f);
        imageView.setAlpha(0.5f);
        imageView.setVisibility(0);
    }
}
