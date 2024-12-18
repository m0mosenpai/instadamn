package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.user.model.ProductCollection;
import java.util.List;

/* renamed from: X.H7m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38820H7m extends C0T6 implements InterfaceC43575JMj {
    public final DropsEventPageNavigationMetadata A00;
    public final DropsLaunchAnimation A01;
    public final ProductCollection A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    @Override // X.InterfaceC43575JMj
    public final C38820H7m F6J(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43575JMj
    public final C38820H7m F6K(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38820H7m) {
                C38820H7m c38820H7m = (C38820H7m) obj;
                if (!C14360o3.A0K(this.A02, c38820H7m.A02) || !C14360o3.A0K(this.A01, c38820H7m.A01) || !C14360o3.A0K(this.A00, c38820H7m.A00) || !C14360o3.A0K(this.A03, c38820H7m.A03) || !C14360o3.A0K(this.A04, c38820H7m.A04) || !C14360o3.A0K(this.A05, c38820H7m.A05) || !C14360o3.A0K(this.A0A, c38820H7m.A0A) || !C14360o3.A0K(this.A06, c38820H7m.A06) || !C14360o3.A0K(this.A07, c38820H7m.A07) || !C14360o3.A0K(this.A08, c38820H7m.A08) || !C14360o3.A0K(this.A09, c38820H7m.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43575JMj
    public final ProductCollection Ap9() {
        return this.A02;
    }

    @Override // X.InterfaceC43575JMj
    public final /* bridge */ /* synthetic */ DropsLaunchAnimationIntf Azc() {
        return this.A01;
    }

    @Override // X.InterfaceC43575JMj
    public final DropsEventPageNavigationMetadata B2m() {
        return this.A00;
    }

    @Override // X.InterfaceC43575JMj
    public final String BSZ() {
        return this.A05;
    }

    @Override // X.InterfaceC43575JMj
    public final List C0p() {
        return this.A0A;
    }

    @Override // X.InterfaceC43575JMj
    public final String C6J() {
        return this.A07;
    }

    @Override // X.InterfaceC43575JMj
    public final String CEu() {
        return this.A09;
    }

    @Override // X.InterfaceC43575JMj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStorySellerCollectionTappableData", I46.A00(this));
    }

    @Override // X.InterfaceC43575JMj
    public final String getId() {
        return this.A03;
    }

    @Override // X.InterfaceC43575JMj
    public final String getMediaId() {
        return this.A04;
    }

    @Override // X.InterfaceC43575JMj
    public final String getText() {
        return this.A06;
    }

    @Override // X.InterfaceC43575JMj
    public final String getUserId() {
        return this.A08;
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public C38820H7m(DropsEventPageNavigationMetadata dropsEventPageNavigationMetadata, DropsLaunchAnimation dropsLaunchAnimation, ProductCollection productCollection, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        this.A02 = productCollection;
        this.A01 = dropsLaunchAnimation;
        this.A00 = dropsEventPageNavigationMetadata;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A0A = list;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
    }

    @Override // X.InterfaceC43575JMj
    public final InterfaceC43575JMj EBr(C1DY c1dy) {
        return this;
    }
}
