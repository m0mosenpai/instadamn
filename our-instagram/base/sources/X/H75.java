package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H75 extends C0T6 implements InterfaceC43580JMo {
    public final WearablesAppAttributionType A00;
    public final WorldLocationPagesInfo A01;
    public final User A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    public H75(WearablesAppAttributionType wearablesAppAttributionType, WorldLocationPagesInfo worldLocationPagesInfo, User user, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(str2, str3, str4, str5, str6);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A00 = wearablesAppAttributionType;
        this.A03 = num;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A0I = z;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
        this.A0G = str13;
        this.A02 = user;
        this.A0H = str14;
        this.A01 = worldLocationPagesInfo;
    }

    @Override // X.InterfaceC43580JMo
    public final H75 F3t(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43580JMo
    public final H75 F3u(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H75) {
                H75 h75 = (H75) obj;
                if (!C14360o3.A0K(this.A04, h75.A04) || !C14360o3.A0K(this.A05, h75.A05) || !C14360o3.A0K(this.A06, h75.A06) || !C14360o3.A0K(this.A07, h75.A07) || !C14360o3.A0K(this.A08, h75.A08) || !C14360o3.A0K(this.A09, h75.A09) || this.A00 != h75.A00 || !C14360o3.A0K(this.A03, h75.A03) || !C14360o3.A0K(this.A0A, h75.A0A) || !C14360o3.A0K(this.A0B, h75.A0B) || !C14360o3.A0K(this.A0C, h75.A0C) || this.A0I != h75.A0I || !C14360o3.A0K(this.A0D, h75.A0D) || !C14360o3.A0K(this.A0E, h75.A0E) || !C14360o3.A0K(this.A0F, h75.A0F) || !C14360o3.A0K(this.A0G, h75.A0G) || !C14360o3.A0K(this.A02, h75.A02) || !C14360o3.A0K(this.A0H, h75.A0H) || !C14360o3.A0K(this.A01, h75.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43580JMo
    public final WearablesAppAttributionType AdN() {
        return this.A00;
    }

    @Override // X.InterfaceC43580JMo
    public final Integer BF1() {
        return this.A03;
    }

    @Override // X.InterfaceC43580JMo
    public final String BdQ() {
        return this.A0D;
    }

    @Override // X.InterfaceC43580JMo
    public final String BdR() {
        return this.A0E;
    }

    @Override // X.InterfaceC43580JMo
    public final String BdS() {
        return this.A0F;
    }

    @Override // X.InterfaceC43580JMo
    public final String BdU() {
        return this.A0G;
    }

    @Override // X.InterfaceC43580JMo
    public final User BdV() {
        return this.A02;
    }

    @Override // X.InterfaceC43580JMo
    public final String BdW() {
        return this.A0H;
    }

    @Override // X.InterfaceC43580JMo
    public final WorldLocationPagesInfo CHs() {
        return this.A01;
    }

    @Override // X.InterfaceC43580JMo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTWearablesAppAttribution", AbstractC40452Hwh.A00(this));
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionCtaActionUrl() {
        return this.A04;
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionCtaText() {
        return this.A05;
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionIconUrl() {
        return this.A06;
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionSubtitle() {
        return this.A07;
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionTitle() {
        return this.A08;
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionTopIconUrl() {
        return this.A09;
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldDeeplink() {
        return this.A0A;
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldId() {
        return this.A0B;
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldName() {
        return this.A0C;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC167007dF.A0D(this.A0I, (((((((((AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04)))))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0D)) * 31) + AbstractC167017dG.A0O(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0F)) * 31) + AbstractC167017dG.A0O(this.A0G)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    @Override // X.InterfaceC43580JMo
    public final boolean isWearableMediaProducer() {
        return this.A0I;
    }

    @Override // X.InterfaceC43580JMo
    public final InterfaceC43580JMo EBD(C1DY c1dy) {
        return this;
    }
}
