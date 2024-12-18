package X;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes5.dex */
public final class BIB implements InterfaceC114245Dn {
    public final float[] A00;
    public final int[] A01 = new int[2];

    public BIB(float[] fArr) {
        this.A00 = fArr;
    }

    private final void A00(View view, float[] fArr) {
        float[] fArr2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            A00((View) parent, fArr);
            fArr2 = this.A00;
            C5AJ.A02(fArr2);
            C5AJ.A04(fArr2, -view.getScrollX(), -view.getScrollY());
            C5BB.A01(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C5AJ.A02(fArr2);
            C5AJ.A04(fArr2, left, top);
            C5BB.A01(fArr, fArr2);
        } else {
            int[] iArr = this.A01;
            view.getLocationInWindow(iArr);
            fArr2 = this.A00;
            C5AJ.A02(fArr2);
            C5AJ.A04(fArr2, -view.getScrollX(), -view.getScrollY());
            C5BB.A01(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            C5AJ.A02(fArr2);
            C5AJ.A04(fArr2, f, f2);
            C5BB.A01(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            AbstractC130975vl.A01(matrix, fArr2);
            C5BB.A01(fArr, fArr2);
        }
    }

    @Override // X.InterfaceC114245Dn
    public final void AFD(View view, float[] fArr) {
        C5AJ.A02(fArr);
        A00(view, fArr);
    }
}
