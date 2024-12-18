package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardOverlayType;
import java.util.List;

/* renamed from: X.BhK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26133BhK extends C0T6 implements InterfaceC31116Dly {
    public final MidCardClipsClickedAction A00;
    public final C26134BhL A01;
    public final C26134BhL A02;
    public final C26135BhM A03;
    public final MidCardOverlayType A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final C26134BhL A0C;

    public C26133BhK(MidCardClipsClickedAction midCardClipsClickedAction, C26134BhL c26134BhL, C26134BhL c26134BhL2, C26134BhL c26134BhL3, C26135BhM c26135BhM, MidCardOverlayType midCardOverlayType, String str, String str2, List list, List list2, List list3, List list4, List list5) {
        AbstractC25234BEr.A0j(2, midCardClipsClickedAction, list, list2, list3);
        AbstractC25229BEm.A1M(c26134BhL, 10, str2);
        this.A05 = str;
        this.A00 = midCardClipsClickedAction;
        this.A07 = list;
        this.A08 = list2;
        this.A09 = list3;
        this.A0A = list4;
        this.A04 = midCardOverlayType;
        this.A0B = list5;
        this.A03 = c26135BhM;
        this.A01 = c26134BhL;
        this.A0C = c26134BhL2;
        this.A02 = c26134BhL3;
        this.A06 = str2;
    }

    @Override // X.InterfaceC31116Dly
    public final C26133BhK Ewk(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26133BhK) {
                C26133BhK c26133BhK = (C26133BhK) obj;
                if (!C14360o3.A0K(this.A05, c26133BhK.A05) || this.A00 != c26133BhK.A00 || !C14360o3.A0K(this.A07, c26133BhK.A07) || !C14360o3.A0K(this.A08, c26133BhK.A08) || !C14360o3.A0K(this.A09, c26133BhK.A09) || !C14360o3.A0K(this.A0A, c26133BhK.A0A) || this.A04 != c26133BhK.A04 || !C14360o3.A0K(this.A0B, c26133BhK.A0B) || !C14360o3.A0K(this.A03, c26133BhK.A03) || !C14360o3.A0K(this.A01, c26133BhK.A01) || !C14360o3.A0K(this.A0C, c26133BhK.A0C) || !C14360o3.A0K(this.A02, c26133BhK.A02) || !C14360o3.A0K(this.A06, c26133BhK.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A06, (((AbstractC166997dE.A0J(this.A01, (((((((AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0O(this.A05) * 31)))) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }

    @Override // X.InterfaceC31116Dly
    public final InterfaceC31116Dly E9I(C1DY c1dy) {
        return this;
    }
}
