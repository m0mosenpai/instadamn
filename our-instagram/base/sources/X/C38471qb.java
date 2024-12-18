package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* renamed from: X.1qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38471qb extends C0T6 implements InterfaceC38481qc {
    public final MultiAuthorStoryType A00;
    public final ImageUrl A01;
    public final LocationDict A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C38471qb(MultiAuthorStoryType multiAuthorStoryType, ImageUrl imageUrl, LocationDict locationDict, Float f, Float f2, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str3, 6);
        this.A05 = str;
        this.A03 = f;
        this.A04 = f2;
        this.A02 = locationDict;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = imageUrl;
        this.A08 = str4;
        this.A09 = str5;
        this.A00 = multiAuthorStoryType;
    }

    @Override // X.InterfaceC38481qc
    public final C38471qb Ez2() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38471qb) {
                C38471qb c38471qb = (C38471qb) obj;
                if (!C14360o3.A0K(this.A05, c38471qb.A05) || !C14360o3.A0K(this.A03, c38471qb.A03) || !C14360o3.A0K(this.A04, c38471qb.A04) || !C14360o3.A0K(this.A02, c38471qb.A02) || !C14360o3.A0K(this.A06, c38471qb.A06) || !C14360o3.A0K(this.A07, c38471qb.A07) || !C14360o3.A0K(this.A01, c38471qb.A01) || !C14360o3.A0K(this.A08, c38471qb.A08) || !C14360o3.A0K(this.A09, c38471qb.A09) || this.A00 != c38471qb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.A03;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A04;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        LocationDict locationDict = this.A02;
        int hashCode4 = (hashCode3 + (locationDict == null ? 0 : locationDict.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A07.hashCode()) * 31;
        ImageUrl imageUrl = this.A01;
        int hashCode6 = (hashCode5 + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MultiAuthorStoryType multiAuthorStoryType = this.A00;
        return hashCode8 + (multiAuthorStoryType != null ? multiAuthorStoryType.hashCode() : 0);
    }

    @Override // X.InterfaceC38481qc
    public final String Amu() {
        return this.A05;
    }

    @Override // X.InterfaceC38481qc
    public final Float BM8() {
        return this.A03;
    }

    @Override // X.InterfaceC38481qc
    public final Float BO9() {
        return this.A04;
    }

    @Override // X.InterfaceC38481qc
    public final /* bridge */ /* synthetic */ LocationDictIntf BON() {
        return this.A02;
    }

    @Override // X.InterfaceC38481qc
    public final ImageUrl Bhu() {
        return this.A01;
    }

    @Override // X.InterfaceC38481qc
    public final String Bhw() {
        return this.A08;
    }

    @Override // X.InterfaceC38481qc
    public final MultiAuthorStoryType CBY() {
        return this.A00;
    }

    @Override // X.InterfaceC38481qc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelMasOwnerClientDict", AbstractC40207HsW.A00(this));
    }

    @Override // X.InterfaceC38481qc
    public final String getName() {
        return this.A06;
    }

    @Override // X.InterfaceC38481qc
    public final String getPk() {
        return this.A07;
    }

    @Override // X.InterfaceC38481qc
    public final String getShortName() {
        return this.A09;
    }
}
