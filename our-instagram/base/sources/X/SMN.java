package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SMN {
    public final double A00;
    public final List A01;
    public final char A02;
    public final String A03;
    public final String A04;

    public final int hashCode() {
        char c = this.A02;
        return AbstractC25226BEj.A03(this.A04, AbstractC166997dE.A0K(this.A03, c * 31));
    }

    public SMN(String str, String str2, List list, char c, double d) {
        this.A01 = list;
        this.A02 = c;
        this.A00 = d;
        this.A04 = str;
        this.A03 = str2;
    }
}
