package X;

import com.instagram.api.schemas.IGNativeSmartTextOverlayBackgroundShape;

/* renamed from: X.Bez, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26011Bez extends C0T6 {
    public final int A00;
    public final IGNativeSmartTextOverlayBackgroundShape A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26011Bez) {
                C26011Bez c26011Bez = (C26011Bez) obj;
                if (this.A05 != c26011Bez.A05 || this.A00 != c26011Bez.A00 || !C14360o3.A0K(this.A09, c26011Bez.A09) || !C14360o3.A0K(this.A08, c26011Bez.A08) || this.A04 != c26011Bez.A04 || !C14360o3.A0K(this.A07, c26011Bez.A07) || !C14360o3.A0K(this.A02, c26011Bez.A02) || !C14360o3.A0K(this.A06, c26011Bez.A06) || !C14360o3.A0K(this.A03, c26011Bez.A03) || this.A01 != c26011Bez.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "SF_PRO_BOLD_TEXT";
                break;
            case 2:
                str = "ROBOTO";
                break;
            case 3:
                str = "ROBOTO_BOLD";
                break;
            case 4:
                str = "INSTAGRAM_SANS";
                break;
            default:
                str = "SF_PRO_TEXT";
                break;
        }
        int A0K = (AbstractC166997dE.A0K(this.A09, (AbstractC25228BEl.A0F(str, intValue) + this.A00) * 31) + AbstractC167017dG.A0O(this.A08)) * 31;
        int intValue2 = this.A04.intValue();
        switch (intValue2) {
            case 1:
                str2 = "CENTER";
                break;
            case 2:
                str2 = "END";
                break;
            default:
                str2 = "START";
                break;
        }
        return ((((((((AbstractC25231BEo.A0H(str2, intValue2, A0K) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C26011Bez(IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, int i) {
        this.A05 = num;
        this.A00 = i;
        this.A09 = str;
        this.A08 = str2;
        this.A04 = num2;
        this.A07 = num3;
        this.A02 = f;
        this.A06 = num4;
        this.A03 = f2;
        this.A01 = iGNativeSmartTextOverlayBackgroundShape;
    }
}
