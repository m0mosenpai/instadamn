package X;

/* loaded from: classes6.dex */
public final class E87 extends C0T6 implements InterfaceC37251Gb4 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E87) {
                E87 e87 = (E87) obj;
                if (!C14360o3.A0K(this.A00, e87.A00) || !C14360o3.A0K(this.A01, e87.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public E87(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
