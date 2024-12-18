package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3G extends C0T6 implements InterfaceC31090DlY {
    public final float A00;
    public final long A01;
    public final InterfaceC39571se A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public H3G(InterfaceC39571se interfaceC39571se, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, float f, long j) {
        AbstractC25233BEq.A0w(1, str, list, str2);
        AbstractC25234BEr.A0l(6, str3, imageUrl, str4, imageUrl2);
        AbstractC25234BEr.A1Q(str5, str6, str7);
        this.A07 = str;
        this.A01 = j;
        this.A0E = list;
        this.A08 = str2;
        this.A05 = num;
        this.A09 = str3;
        this.A02 = interfaceC39571se;
        this.A00 = f;
        this.A03 = imageUrl;
        this.A0A = str4;
        this.A04 = imageUrl2;
        this.A0B = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A06 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3G) {
                H3G h3g = (H3G) obj;
                if (!C14360o3.A0K(this.A07, h3g.A07) || this.A01 != h3g.A01 || !C14360o3.A0K(this.A0E, h3g.A0E) || !C14360o3.A0K(this.A08, h3g.A08) || !C14360o3.A0K(this.A05, h3g.A05) || !C14360o3.A0K(this.A09, h3g.A09) || !C14360o3.A0K(this.A02, h3g.A02) || Float.compare(this.A00, h3g.A00) != 0 || !C14360o3.A0K(this.A03, h3g.A03) || !C14360o3.A0K(this.A0A, h3g.A0A) || !C14360o3.A0K(this.A04, h3g.A04) || !C14360o3.A0K(this.A0B, h3g.A0B) || !C14360o3.A0K(this.A0C, h3g.A0C) || !C14360o3.A0K(this.A0D, h3g.A0D) || !C14360o3.A0K(this.A06, h3g.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A0D, AbstractC166997dE.A0K(this.A0C, AbstractC166997dE.A0K(this.A0B, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A00((AbstractC166997dE.A0K(this.A09, (AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0J(this.A0E, AbstractC25236BEt.A01(this.A01, AbstractC166987dD.A0J(this.A07)))) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, this.A00))))))) + AbstractC166997dE.A0I(this.A06);
    }
}
