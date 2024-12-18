package X;

import java.util.List;

/* renamed from: X.Jyw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45156Jyw extends C0T6 implements InterfaceC50388MMq {
    public final C45127Jxw A00;
    public final Integer A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;

    public C45156Jyw(C45127Jxw c45127Jxw, Integer num, List list, boolean z, boolean z2) {
        AbstractC167007dF.A1G(list, 1, num);
        this.A02 = list;
        this.A04 = z;
        this.A00 = c45127Jxw;
        this.A03 = z2;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45156Jyw) {
                C45156Jyw c45156Jyw = (C45156Jyw) obj;
                if (!C14360o3.A0K(this.A02, c45156Jyw.A02) || this.A04 != c45156Jyw.A04 || !C14360o3.A0K(this.A00, c45156Jyw.A00) || this.A03 != c45156Jyw.A03 || this.A01 != c45156Jyw.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, (AbstractC167007dF.A0D(this.A04, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A01);
    }
}
