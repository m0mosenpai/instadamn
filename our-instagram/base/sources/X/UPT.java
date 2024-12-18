package X;

/* loaded from: classes11.dex */
public final class UPT extends C0T6 {
    public final float A00;
    public final float A01;
    public final C69211Vje A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final float A08;
    public final float A09;

    public UPT(C69211Vje c69211Vje, String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, boolean z) {
        AbstractC25229BEm.A1J(c69211Vje, 2, str4);
        this.A07 = z;
        this.A02 = c69211Vje;
        this.A08 = f;
        this.A03 = str;
        this.A00 = f2;
        this.A04 = str2;
        this.A05 = str3;
        this.A09 = f3;
        this.A01 = f4;
        this.A06 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPT) {
                UPT upt = (UPT) obj;
                if (this.A07 != upt.A07 || !C14360o3.A0K(this.A02, upt.A02) || Float.compare(this.A08, upt.A08) != 0 || !C14360o3.A0K(this.A03, upt.A03) || Float.compare(this.A00, upt.A00) != 0 || !C14360o3.A0K(this.A04, upt.A04) || !C14360o3.A0K(this.A05, upt.A05) || Float.compare(this.A09, upt.A09) != 0 || Float.compare(this.A01, upt.A01) != 0 || !C14360o3.A0K(this.A06, upt.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = 0;
        int A00 = (AbstractC166997dE.A00((AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A02, i * 31), this.A08) + AbstractC167017dG.A0O(this.A03)) * 31, this.A00) + AbstractC167017dG.A0O(this.A04)) * 31;
        String str = this.A05;
        if (str != null) {
            i2 = str.hashCode();
        }
        return AbstractC166997dE.A00(AbstractC166997dE.A00((A00 + i2) * 31, this.A09), this.A01) + this.A06.hashCode();
    }
}
