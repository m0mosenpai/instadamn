package X;

import android.graphics.Color;

/* renamed from: X.5Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116025Nf {
    public static int A00(int i) {
        int A05 = AbstractC56842jH.A05(i, -1);
        int red = (int) ((Color.red(A05) * 0.2126f) + (Color.green(A05) * 0.7152f) + (Color.blue(A05) * 0.0722f));
        if (red < 0) {
            return 0;
        }
        if (red <= 255) {
            return red;
        }
        return 255;
    }
}
