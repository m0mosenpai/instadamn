package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JnI extends AbstractC66542zW {
    public final List A00;
    public final List A01;
    public final /* synthetic */ KNS A02;

    public JnI(KNS kns, List list, List list2) {
        C14360o3.A0B(list, 2);
        this.A02 = kns;
        this.A01 = list;
        this.A00 = list2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return C14360o3.A0K(this.A01.get(i), this.A00.get(i2));
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        C51756Mtf c51756Mtf = (C51756Mtf) this.A01.get(i);
        C51756Mtf c51756Mtf2 = (C51756Mtf) this.A00.get(i2);
        C8Z4 c8z4 = (C8Z4) c51756Mtf.A00;
        if (c8z4.getName().equals(c51756Mtf2) && c8z4.BF3() == ((C8Z4) c51756Mtf2.A00).BF3()) {
            return true;
        }
        return false;
    }
}
