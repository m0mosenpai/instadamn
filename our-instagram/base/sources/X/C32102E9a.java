package X;

import java.util.HashMap;

/* renamed from: X.E9a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32102E9a extends C0T6 implements InterfaceC37110GWv {
    public final EnumC72355Xbr A00;
    public final String A01;
    public final HashMap A02;

    public C32102E9a(EnumC72355Xbr enumC72355Xbr, String str, HashMap hashMap) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = enumC72355Xbr;
        this.A02 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32102E9a) {
                C32102E9a c32102E9a = (C32102E9a) obj;
                if (!C14360o3.A0K(this.A01, c32102E9a.A01) || this.A00 != c32102E9a.A00 || !C14360o3.A0K(this.A02, c32102E9a.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
