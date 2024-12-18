package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: classes4.dex */
public abstract class A23 {
    public static final C9Rz A00(Bitmap bitmap, Integer num, float f, int i, int i2) {
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        C9Rz c9Rz = new C9Rz(bitmap, A0Q, f, 15);
        int A0K = AbstractC167017dG.A0K(num);
        c9Rz.setBounds(A0K, A0K, i, i2);
        return c9Rz;
    }
}
