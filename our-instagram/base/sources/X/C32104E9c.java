package X;

import java.util.HashMap;

/* renamed from: X.E9c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32104E9c extends C0T6 implements InterfaceC37110GWv {
    public final C51759Mti A00;
    public final EnumC72355Xbr A01;
    public final String A02;
    public final HashMap A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32104E9c) {
                C32104E9c c32104E9c = (C32104E9c) obj;
                if (!C14360o3.A0K(this.A02, c32104E9c.A02) || !C14360o3.A0K(this.A00, c32104E9c.A00) || this.A01 != c32104E9c.A01 || !C14360o3.A0K(this.A03, c32104E9c.A03) || this.A04 != c32104E9c.A04 || this.A05 != c32104E9c.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A04, (((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31));
    }

    public C32104E9c(C51759Mti c51759Mti, EnumC72355Xbr enumC72355Xbr, String str, HashMap hashMap, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, c51759Mti);
        this.A02 = str;
        this.A00 = c51759Mti;
        this.A01 = enumC72355Xbr;
        this.A03 = hashMap;
        this.A04 = z;
        this.A05 = z2;
    }
}
