package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H4H extends C0T6 implements InterfaceC43573JMh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C26123Bh8 A03;
    public final ClipsMidCardType A04;
    public final C51785Mup A05;
    public final C38749H4p A06;
    public final C26143BhU A07;
    public final C38770H5k A08;
    public final C38771H5l A09;
    public final C38786H6b A0A;
    public final String A0B;
    public final List A0C;

    public H4H(C26123Bh8 c26123Bh8, ClipsMidCardType clipsMidCardType, C51785Mup c51785Mup, C38749H4p c38749H4p, C26143BhU c26143BhU, C38770H5k c38770H5k, C38771H5l c38771H5l, C38786H6b c38786H6b, String str, List list, int i, int i2, int i3) {
        C14360o3.A0B(clipsMidCardType, 6);
        this.A0B = str;
        this.A00 = i;
        this.A03 = c26123Bh8;
        this.A05 = c51785Mup;
        this.A0C = list;
        this.A04 = clipsMidCardType;
        this.A06 = c38749H4p;
        this.A07 = c26143BhU;
        this.A08 = c38770H5k;
        this.A09 = c38771H5l;
        this.A01 = i2;
        this.A0A = c38786H6b;
        this.A02 = i3;
    }

    @Override // X.InterfaceC43573JMh
    public final H4H Ewn(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4H) {
                H4H h4h = (H4H) obj;
                if (!C14360o3.A0K(this.A0B, h4h.A0B) || this.A00 != h4h.A00 || !C14360o3.A0K(this.A03, h4h.A03) || !C14360o3.A0K(this.A05, h4h.A05) || !C14360o3.A0K(this.A0C, h4h.A0C) || this.A04 != h4h.A04 || !C14360o3.A0K(this.A06, h4h.A06) || !C14360o3.A0K(this.A07, h4h.A07) || !C14360o3.A0K(this.A08, h4h.A08) || !C14360o3.A0K(this.A09, h4h.A09) || this.A01 != h4h.A01 || !C14360o3.A0K(this.A0A, h4h.A0A) || this.A02 != h4h.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43573JMh
    public final String AgJ() {
        return this.A0B;
    }

    @Override // X.InterfaceC43573JMh
    public final int Ahx() {
        return this.A00;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ JJL Ak2() {
        return this.A03;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ JJN B5b() {
        return this.A05;
    }

    @Override // X.InterfaceC43573JMh
    public final List BNe() {
        return this.A0C;
    }

    @Override // X.InterfaceC43573JMh
    public final ClipsMidCardType BTg() {
        return this.A04;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ JJW Bih() {
        return this.A06;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ JJY Bl0() {
        return this.A07;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ JJZ C11() {
        return this.A08;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ InterfaceC43488JJa C12() {
        return this.A09;
    }

    @Override // X.InterfaceC43573JMh
    public final int C5R() {
        return this.A01;
    }

    @Override // X.InterfaceC43573JMh
    public final /* bridge */ /* synthetic */ InterfaceC43494JJg C5h() {
        return this.A0A;
    }

    @Override // X.InterfaceC43573JMh
    public final int getViewStateItemType() {
        return this.A02;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC166997dE.A0J(this.A04, ((((((((AbstractC167017dG.A0O(this.A0B) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + this.A01) * 31) + AbstractC166997dE.A0I(this.A0A)) * 31) + this.A02;
    }

    @Override // X.InterfaceC43573JMh
    public final InterfaceC43573JMh E9J(C1DY c1dy) {
        return this;
    }
}
