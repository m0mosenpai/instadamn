package X;

import java.io.StringWriter;

/* renamed from: X.5NJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NJ {
    public int A00;
    public int A01;
    public C22880A7a A02;
    public C5NP A03;
    public C5NM A04;
    public String A05;
    public String A06;
    public java.util.Set A07;

    public C5NJ(C22880A7a c22880A7a, C5NP c5np, String str, String str2, java.util.Set set) {
        this.A03 = c5np;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = set;
        this.A02 = c22880A7a;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && hashCode() == obj.hashCode();
        }
        return true;
    }

    public final int hashCode() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            C5NI.A00(A0A, this);
            A0A.close();
            return stringWriter.toString().hashCode();
        } catch (Exception unused) {
            return super.hashCode();
        }
    }

    public C5NJ() {
    }
}
