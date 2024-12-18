package X;

import java.util.List;

/* renamed from: X.Bh5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26120Bh5 extends C0T6 implements InterfaceC31085DlT {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C26120Bh5(String str, String str2, String str3, List list) {
        AbstractC167027dH.A0a(1, list, str, str2, str3);
        this.A03 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26120Bh5) {
                C26120Bh5 c26120Bh5 = (C26120Bh5) obj;
                if (!C14360o3.A0K(this.A03, c26120Bh5.A03) || !C14360o3.A0K(this.A00, c26120Bh5.A00) || !C14360o3.A0K(this.A01, c26120Bh5.A01) || !C14360o3.A0K(this.A02, c26120Bh5.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0G(this.A03))));
    }
}
