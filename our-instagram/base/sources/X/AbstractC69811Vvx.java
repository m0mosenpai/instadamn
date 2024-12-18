package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.Vvx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69811Vvx {
    public static void A00(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void A01(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }
}
