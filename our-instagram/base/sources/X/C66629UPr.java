package X;

/* renamed from: X.UPr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66629UPr extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public String A0C;
    public boolean A0D;

    public static void A00(C66629UPr c66629UPr, String str) {
        c66629UPr.A08 = 0;
        c66629UPr.A0C = str;
        c66629UPr.A0A = 0;
        c66629UPr.A07 = 0;
        c66629UPr.A09 = 0;
        c66629UPr.A0B = 0;
        c66629UPr.A03 = 0.0f;
        c66629UPr.A04 = 0.0f;
        c66629UPr.A01 = 0.0f;
        c66629UPr.A02 = 0.0f;
        c66629UPr.A05 = 0.0f;
        c66629UPr.A06 = 0.0f;
        c66629UPr.A00 = 0.0f;
        c66629UPr.A0D = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66629UPr) {
                C66629UPr c66629UPr = (C66629UPr) obj;
                if (this.A08 != c66629UPr.A08 || !C14360o3.A0K(this.A0C, c66629UPr.A0C) || this.A0A != c66629UPr.A0A || this.A07 != c66629UPr.A07 || this.A09 != c66629UPr.A09 || this.A0B != c66629UPr.A0B || Float.compare(this.A03, c66629UPr.A03) != 0 || Float.compare(this.A04, c66629UPr.A04) != 0 || Float.compare(this.A01, c66629UPr.A01) != 0 || Float.compare(this.A02, c66629UPr.A02) != 0 || Float.compare(this.A05, c66629UPr.A05) != 0 || Float.compare(this.A06, c66629UPr.A06) != 0 || Float.compare(this.A00, c66629UPr.A00) != 0 || this.A0D != c66629UPr.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00((((((((AbstractC166997dE.A0K(this.A0C, this.A08 * 31) + this.A0A) * 31) + this.A07) * 31) + this.A09) * 31) + this.A0B) * 31, this.A03), this.A04), this.A01), this.A02), this.A05), this.A06), this.A00);
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        return A00 + i;
    }

    public C66629UPr() {
        A00(this, AbstractC167017dG.A0j());
    }
}
