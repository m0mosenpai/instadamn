package X;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XoW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72837XoW {
    public boolean A00;
    public final List A02;
    public final List A03;
    public final float[] A05;
    public final C178597wX A06;
    public final float[] A04 = new float[16];
    public final C201278vB A01 = new C201278vB();

    public final void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC73611YPy) it.next()).release();
        }
    }

    public C72837XoW(C178597wX c178597wX, List list) {
        float[] fArr = new float[16];
        this.A05 = fArr;
        this.A06 = c178597wX;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        A1E.clear();
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    A1E.add(obj);
                }
            }
        }
        this.A03 = AbstractC166987dD.A1E();
        this.A00 = false;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = this.A04;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }
}
