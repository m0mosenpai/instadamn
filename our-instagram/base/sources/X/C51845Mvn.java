package X;

import java.util.List;

/* renamed from: X.Mvn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51845Mvn extends C0T6 implements InterfaceC57956Pn2 {
    public final String A00;
    public final String A01;
    public final List A02;
    public final EnumC53172NfT A03 = EnumC53172NfT.A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51845Mvn) {
                C51845Mvn c51845Mvn = (C51845Mvn) obj;
                if (!C14360o3.A0K(this.A01, c51845Mvn.A01) || !C14360o3.A0K(this.A00, c51845Mvn.A00) || !C14360o3.A0K(this.A02, c51845Mvn.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57956Pn2
    public final EnumC53172NfT CBf() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public C51845Mvn(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }
}
