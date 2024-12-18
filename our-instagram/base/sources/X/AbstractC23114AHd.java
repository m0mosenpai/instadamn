package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;

/* renamed from: X.AHd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23114AHd {
    public static final C9Rz A00(Bitmap bitmap, float f, int i, int i2) {
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        C9Rz c9Rz = new C9Rz(bitmap, A0Q, f, 15);
        c9Rz.setBounds(0, 0, i, i2);
        return c9Rz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(Drawable drawable, C190888ck c190888ck) {
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof InterfaceC25199BCx) {
            ((InterfaceC25199BCx) drawable).setTextFormat(c190888ck);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A01(Drawable drawable) {
        C190888ck C6I;
        String str;
        if (!(drawable instanceof InterfaceC25199BCx) || (C6I = ((InterfaceC25199BCx) drawable).C6I()) == null || (str = C6I.A09) == null) {
            return null;
        }
        return str;
    }
}
