package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E9N extends C0T6 implements InterfaceC37096GWf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public E9N(String str, String str2, String str3, List list, List list2) {
        AbstractC167027dH.A0a(1, str, list, str2, list2);
        C14360o3.A0B(str3, 5);
        this.A02 = str;
        this.A03 = list;
        this.A00 = str2;
        this.A04 = list2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9N) {
                E9N e9n = (E9N) obj;
                if (!C14360o3.A0K(this.A02, e9n.A02) || !C14360o3.A0K(this.A03, e9n.A03) || !C14360o3.A0K(this.A00, e9n.A00) || !C14360o3.A0K(this.A04, e9n.A04) || !C14360o3.A0K(this.A01, e9n.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A02)))));
    }
}
