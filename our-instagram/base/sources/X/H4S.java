package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H4S extends C0T6 implements InterfaceC43475JIn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public H4S(String str, String str2, String str3, List list) {
        AbstractC167027dH.A0a(1, str, str2, str3, list);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4S) {
                H4S h4s = (H4S) obj;
                if (!C14360o3.A0K(this.A00, h4s.A00) || !C14360o3.A0K(this.A01, h4s.A01) || !C14360o3.A0K(this.A02, h4s.A02) || !C14360o3.A0K(this.A03, h4s.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00))));
    }
}
