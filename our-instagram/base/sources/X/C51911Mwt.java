package X;

import java.util.List;

/* renamed from: X.Mwt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51911Mwt extends C0T6 implements InterfaceC57860PlQ {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51911Mwt) {
                C51911Mwt c51911Mwt = (C51911Mwt) obj;
                if (!C14360o3.A0K(this.A00, c51911Mwt.A00) || !C14360o3.A0K(this.A01, c51911Mwt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C51911Mwt(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
