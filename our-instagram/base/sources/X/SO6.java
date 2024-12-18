package X;

/* loaded from: classes10.dex */
public final class SO6 {
    public final int A00;
    public final C62881SVh A01;
    public final String A02;
    public final String A03;
    public final String A04 = "main.jsbundle";
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SO6 so6 = (SO6) obj;
            if (this.A00 != so6.A00 || !AbstractC50102Ry.A00(this.A03, so6.A03)) {
                return false;
            }
        }
        return true;
    }

    public SO6(C62881SVh c62881SVh, String str, String str2, int i) {
        this.A03 = str2;
        this.A00 = i;
        this.A02 = str;
        this.A01 = c62881SVh;
        StringBuilder A11 = AbstractC166997dE.A11("main.jsbundle");
        A11.append(":");
        A11.append(str2);
        this.A05 = AbstractC58320PtC.A12(":", A11, i);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06("main.jsbundle", this.A03, Integer.valueOf(this.A00));
    }
}
