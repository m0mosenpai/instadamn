package X;

import android.widget.ImageView;

/* renamed from: X.5x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131695x5 {
    public static final InterfaceC59242nQ A00(ImageView imageView) {
        Object drawable = imageView.getDrawable();
        if (drawable != null) {
            return (InterfaceC59242nQ) drawable;
        }
        throw new IllegalStateException("imageView.drawable is null");
    }
}
