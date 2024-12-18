package X;

/* renamed from: X.BfQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26037BfQ extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26037BfQ) {
                C26037BfQ c26037BfQ = (C26037BfQ) obj;
                if (this.A03 != c26037BfQ.A03 || this.A04 != c26037BfQ.A04 || !C14360o3.A0K(this.A01, c26037BfQ.A01) || !C14360o3.A0K(this.A02, c26037BfQ.A02) || !C14360o3.A0K(this.A00, c26037BfQ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03)))));
    }

    public C26037BfQ(String str, String str2, String str3, boolean z, boolean z2) {
        this.A03 = z;
        this.A04 = z2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public C26037BfQ() {
        this("", "", "", false, false);
    }
}
