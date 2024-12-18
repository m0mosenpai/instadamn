package X;

import java.util.List;

/* renamed from: X.Mx9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51926Mx9 extends C0T6 implements InterfaceC57867PlX {
    public final C51759Mti A00;
    public final C51759Mti A01;
    public final C51759Mti A02;
    public final O5W A03;
    public final List A04;

    public C51926Mx9(C51759Mti c51759Mti, C51759Mti c51759Mti2, C51759Mti c51759Mti3, O5W o5w, List list) {
        C14360o3.A0B(c51759Mti, 1);
        this.A02 = c51759Mti;
        this.A04 = list;
        this.A00 = c51759Mti2;
        this.A01 = c51759Mti3;
        this.A03 = o5w;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51926Mx9) {
                C51926Mx9 c51926Mx9 = (C51926Mx9) obj;
                if (!C14360o3.A0K(this.A02, c51926Mx9.A02) || !C14360o3.A0K(this.A04, c51926Mx9.A04) || !C14360o3.A0K(this.A00, c51926Mx9.A00) || !C14360o3.A0K(this.A01, c51926Mx9.A01) || !C14360o3.A0K(this.A03, c51926Mx9.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }
}
