package X;

import java.util.Arrays;

/* renamed from: X.OKy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54820OKy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC58129Pps A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C54820OKy c54820OKy = (C54820OKy) obj;
            if (Float.compare(0.0f, 0.0f) != 0 || this.A01 != c54820OKy.A01 || this.A02 != c54820OKy.A02 || this.A04 != c54820OKy.A04 || this.A00 != c54820OKy.A00 || !this.A03.CcG(c54820OKy.A03) || !"1:1.5".equals("1:1.5")) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC58129Pps interfaceC58129Pps = this.A03;
        Float A0l = AbstractC25227BEk.A0l();
        Integer A0p = AbstractC25227BEk.A0p();
        return Arrays.hashCode(new Object[]{interfaceC58129Pps, A0l, A0l, A0p, "1:1.5", Integer.valueOf(this.A01), Integer.valueOf(this.A02), Float.valueOf(0.25f), Float.valueOf(0.35f), Float.valueOf(0.2f), Float.valueOf(0.9f), AbstractC166997dE.A0b(), A0p, A0p, A0p, Boolean.valueOf(this.A04), Integer.valueOf(this.A00)});
    }

    public C54820OKy(InterfaceC58129Pps interfaceC58129Pps, int i, int i2, int i3, boolean z) {
        this.A03 = interfaceC58129Pps;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = z;
        this.A00 = i3;
    }
}
