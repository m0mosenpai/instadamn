package X;

/* renamed from: X.Jww, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45067Jww extends C0T6 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C45067Jww(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        AbstractC25234BEr.A0k(1, num, str2, str3, str4);
        this.A02 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45067Jww) {
                C45067Jww c45067Jww = (C45067Jww) obj;
                if (this.A02 != c45067Jww.A02 || this.A01 != c45067Jww.A01 || this.A00 != c45067Jww.A00 || !C14360o3.A0K(this.A03, c45067Jww.A03) || !C14360o3.A0K(this.A06, c45067Jww.A06) || !C14360o3.A0K(this.A07, c45067Jww.A07) || !C14360o3.A0K(this.A08, c45067Jww.A08) || !C14360o3.A0K(this.A04, c45067Jww.A04) || !C14360o3.A0K(this.A05, c45067Jww.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "EXPANDER";
                break;
            case 2:
                str = "RESTYLE";
                break;
            case 3:
                str = "SEGMENTATION_MASK";
                break;
            case 4:
                str = "SEMANTIC_SEGMENTATION";
                break;
            case 5:
                str = "IMAGINE";
                break;
            case 6:
                str = "CONTEXTUAL_BACKGROUNDS";
                break;
            case 7:
                str = "IMAGINE_ME";
                break;
            default:
                str = "BACKDROP";
                break;
        }
        return ((AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, (((((AbstractC25228BEl.A0F(str, intValue) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31))) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05);
    }
}
