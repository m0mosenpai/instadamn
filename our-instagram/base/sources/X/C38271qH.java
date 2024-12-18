package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.util.List;

/* renamed from: X.1qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38271qH extends C0T6 implements InterfaceC38281qI {
    public final MetaGalleryAlbumType A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    @Override // X.InterfaceC38281qI
    public final C38271qH Ewe() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38271qH) {
                C38271qH c38271qH = (C38271qH) obj;
                if (!C14360o3.A0K(this.A02, c38271qH.A02) || !C14360o3.A0K(this.A03, c38271qH.A03) || !C14360o3.A0K(this.A01, c38271qH.A01) || !C14360o3.A0K(this.A04, c38271qH.A04) || !C14360o3.A0K(this.A05, c38271qH.A05) || !C14360o3.A0K(this.A09, c38271qH.A09) || !C14360o3.A0K(this.A0A, c38271qH.A0A) || this.A00 != c38271qH.A00 || !C14360o3.A0K(this.A06, c38271qH.A06) || !C14360o3.A0K(this.A07, c38271qH.A07) || !C14360o3.A0K(this.A08, c38271qH.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.A09;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A0A;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MetaGalleryAlbumType metaGalleryAlbumType = this.A00;
        int hashCode8 = (hashCode7 + (metaGalleryAlbumType == null ? 0 : metaGalleryAlbumType.hashCode())) * 31;
        String str5 = this.A06;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A07;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A08;
        return hashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // X.InterfaceC38281qI
    public final String Ah2() {
        return this.A02;
    }

    @Override // X.InterfaceC38281qI
    public final Integer Azn() {
        return this.A01;
    }

    @Override // X.InterfaceC38281qI
    public final String BDG() {
        return this.A04;
    }

    @Override // X.InterfaceC38281qI
    public final List BR4() {
        return this.A09;
    }

    @Override // X.InterfaceC38281qI
    public final List BRl() {
        return this.A0A;
    }

    @Override // X.InterfaceC38281qI
    public final MetaGalleryAlbumType BTH() {
        return this.A00;
    }

    @Override // X.InterfaceC38281qI
    public final String C93() {
        return this.A06;
    }

    @Override // X.InterfaceC38281qI
    public final String C9N() {
        return this.A07;
    }

    @Override // X.InterfaceC38281qI
    public final String CAR() {
        return this.A08;
    }

    @Override // X.InterfaceC38281qI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMetaGalleryNetegoInStory", AbstractC40074Hq0.A00(this));
    }

    @Override // X.InterfaceC38281qI
    public final String getCtaText() {
        return this.A03;
    }

    @Override // X.InterfaceC38281qI
    public final String getId() {
        return this.A05;
    }

    public C38271qH(MetaGalleryAlbumType metaGalleryAlbumType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A04 = str3;
        this.A05 = str4;
        this.A09 = list;
        this.A0A = list2;
        this.A00 = metaGalleryAlbumType;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
    }
}
