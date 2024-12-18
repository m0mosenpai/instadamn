package X;

import android.util.SparseArray;

/* renamed from: X.4ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98124ar {
    public int A00;
    public final SparseArray A01;
    public final InterfaceC98114aq A02;

    public final Object A00(int i) {
        SparseArray sparseArray;
        int i2 = this.A00;
        if (i2 == -1) {
            i2 = 0;
            this.A00 = 0;
        }
        while (i2 > 0 && i < this.A01.keyAt(i2)) {
            i2 = this.A00 - 1;
            this.A00 = i2;
        }
        while (true) {
            int i3 = this.A00;
            sparseArray = this.A01;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(i3 + 1)) {
                break;
            }
            this.A00++;
        }
        return sparseArray.valueAt(this.A00);
    }

    public C98124ar(InterfaceC98114aq interfaceC98114aq) {
        this.A01 = new SparseArray();
        this.A02 = interfaceC98114aq;
        this.A00 = -1;
    }

    public C98124ar() {
        this(new InterfaceC98114aq() { // from class: X.WcF
            @Override // X.InterfaceC98114aq
            public final void accept(Object obj) {
            }
        });
    }
}
