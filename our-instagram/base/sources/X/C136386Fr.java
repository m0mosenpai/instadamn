package X;

import android.util.SparseArray;

/* renamed from: X.6Fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136386Fr {
    public final SparseArray A00;
    public final SparseArray A01;
    public final SparseArray A02;

    public C136386Fr(C136386Fr c136386Fr) {
        int i;
        int i2;
        if (c136386Fr != null) {
            i = c136386Fr.A02.size();
        } else {
            i = 0;
        }
        this.A02 = new SparseArray(i);
        if (c136386Fr != null) {
            i2 = c136386Fr.A00.size();
        } else {
            i2 = 0;
        }
        this.A00 = new SparseArray(i2);
        this.A01 = new SparseArray(c136386Fr != null ? c136386Fr.A01.size() : 0);
    }
}
