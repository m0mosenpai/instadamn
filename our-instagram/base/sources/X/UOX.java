package X;

import android.util.SparseIntArray;

/* loaded from: classes11.dex */
public abstract class UOX extends AbstractC70411WUo {
    public final int[] A00;

    public UOX(C1KI c1ki, Vh3 vh3, XF3 xf3) {
        super(c1ki, vh3, xf3);
        SparseIntArray sparseIntArray = vh3.A02;
        sparseIntArray.getClass();
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.A01.EDS(this);
                return;
            }
        }
    }
}
