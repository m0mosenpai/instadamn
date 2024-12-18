package X;

import java.util.List;

/* renamed from: X.GtZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38339GtZ extends AbstractC66542zW {
    public List A00;
    public List A01;
    public final C2US A02;

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
        this.A01.get(i);
        this.A00.get(i2);
        return false;
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        C41218IMh c41218IMh = (C41218IMh) this.A01.get(i);
        C41218IMh c41218IMh2 = (C41218IMh) this.A00.get(i2);
        if (c41218IMh.A00 == c41218IMh2.A00 && C14360o3.A0K(c41218IMh.A01, c41218IMh2.A01)) {
            return true;
        }
        return false;
    }

    public C38339GtZ(C2US c2us) {
        this.A02 = c2us;
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = c16930sl;
        this.A00 = c16930sl;
    }
}
