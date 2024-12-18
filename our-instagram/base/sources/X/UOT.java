package X;

import android.util.SparseIntArray;

/* loaded from: classes11.dex */
public final class UOT extends AbstractC70411WUo implements InterfaceC220315d, C1VS {
    public final int[] A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UOT(C1KI c1ki, Vh3 vh3, XF3 xf3) {
        super(c1ki, vh3, xf3);
        AbstractC167027dH.A13(c1ki, vh3, xf3);
        SparseIntArray sparseIntArray = vh3.A02;
        this.A00 = new int[sparseIntArray.size()];
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
        }
        this.A01.EDS(this);
    }
}
