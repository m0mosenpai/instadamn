package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsCardBackgroundTypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerCTATypeEnum;
import com.instagram.api.schemas.IGAdsCardStickerClickAreaEnum;
import com.instagram.api.schemas.IGAdsCardStickerSizeEnum;
import com.instagram.api.schemas.IGAdsGenericCardFormatEnum;
import com.instagram.api.schemas.IGAdsGenericCardInfoTypeEnum;
import com.instagram.api.schemas.IGAdsStickerCardRevampTypographyHierarchyEnum;
import java.util.List;

/* renamed from: X.4ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105344ox extends C0T6 implements InterfaceC105354oy {
    public final IGAdsCardBackgroundTypeEnum A00;
    public final IGAdsCardStickerCTATypeEnum A01;
    public final IGAdsCardStickerClickAreaEnum A02;
    public final IGAdsCardStickerSizeEnum A03;
    public final IGAdsGenericCardFormatEnum A04;
    public final IGAdsGenericCardInfoTypeEnum A05;
    public final IGAdsStickerCardRevampTypographyHierarchyEnum A06;
    public final C105364p0 A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final List A0M;

    @Override // X.InterfaceC105354oy
    public final C105344ox F5g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105344ox) {
                C105344ox c105344ox = (C105344ox) obj;
                if (this.A00 != c105344ox.A00 || this.A02 != c105344ox.A02 || !C14360o3.A0K(this.A0B, c105344ox.A0B) || this.A01 != c105344ox.A01 || !C14360o3.A0K(this.A0C, c105344ox.A0C) || this.A04 != c105344ox.A04 || !C14360o3.A0K(this.A0E, c105344ox.A0E) || this.A05 != c105344ox.A05 || !C14360o3.A0K(this.A0M, c105344ox.A0M) || !C14360o3.A0K(this.A0F, c105344ox.A0F) || !C14360o3.A0K(this.A0D, c105344ox.A0D) || !C14360o3.A0K(this.A0G, c105344ox.A0G) || !C14360o3.A0K(this.A0H, c105344ox.A0H) || !C14360o3.A0K(this.A0I, c105344ox.A0I) || !C14360o3.A0K(this.A07, c105344ox.A07) || !C14360o3.A0K(this.A0J, c105344ox.A0J) || !C14360o3.A0K(this.A0K, c105344ox.A0K) || !C14360o3.A0K(this.A09, c105344ox.A09) || !C14360o3.A0K(this.A08, c105344ox.A08) || !C14360o3.A0K(this.A0A, c105344ox.A0A) || this.A03 != c105344ox.A03 || this.A06 != c105344ox.A06 || !C14360o3.A0K(this.A0L, c105344ox.A0L)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum = this.A00;
        int hashCode = (iGAdsCardBackgroundTypeEnum == null ? 0 : iGAdsCardBackgroundTypeEnum.hashCode()) * 31;
        IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum = this.A02;
        int hashCode2 = (hashCode + (iGAdsCardStickerClickAreaEnum == null ? 0 : iGAdsCardStickerClickAreaEnum.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum = this.A01;
        int hashCode4 = (hashCode3 + (iGAdsCardStickerCTATypeEnum == null ? 0 : iGAdsCardStickerCTATypeEnum.hashCode())) * 31;
        Integer num2 = this.A0C;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum = this.A04;
        int hashCode6 = (hashCode5 + (iGAdsGenericCardFormatEnum == null ? 0 : iGAdsGenericCardFormatEnum.hashCode())) * 31;
        String str = this.A0E;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum = this.A05;
        int hashCode8 = (hashCode7 + (iGAdsGenericCardInfoTypeEnum == null ? 0 : iGAdsGenericCardInfoTypeEnum.hashCode())) * 31;
        List list = this.A0M;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A0F;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.A0D;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.A0G;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0H;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0I;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C105364p0 c105364p0 = this.A07;
        int hashCode15 = (hashCode14 + (c105364p0 == null ? 0 : c105364p0.hashCode())) * 31;
        String str6 = this.A0J;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0K;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.A09;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode19 = (hashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A0A;
        int hashCode20 = (hashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum = this.A03;
        int hashCode21 = (hashCode20 + (iGAdsCardStickerSizeEnum == null ? 0 : iGAdsCardStickerSizeEnum.hashCode())) * 31;
        IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum = this.A06;
        int hashCode22 = (hashCode21 + (iGAdsStickerCardRevampTypographyHierarchyEnum == null ? 0 : iGAdsStickerCardRevampTypographyHierarchyEnum.hashCode())) * 31;
        String str8 = this.A0L;
        return hashCode22 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsCardBackgroundTypeEnum Af5() {
        return this.A00;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsCardStickerClickAreaEnum Ank() {
        return this.A02;
    }

    @Override // X.InterfaceC105354oy
    public final Integer Atf() {
        return this.A0B;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsCardStickerCTATypeEnum Atq() {
        return this.A01;
    }

    @Override // X.InterfaceC105354oy
    public final Integer B04() {
        return this.A0C;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsGenericCardFormatEnum B84() {
        return this.A04;
    }

    @Override // X.InterfaceC105354oy
    public final String BDM() {
        return this.A0E;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsGenericCardInfoTypeEnum BHZ() {
        return this.A05;
    }

    @Override // X.InterfaceC105354oy
    public final List BHb() {
        return this.A0M;
    }

    @Override // X.InterfaceC105354oy
    public final String BKK() {
        return this.A0F;
    }

    @Override // X.InterfaceC105354oy
    public final Integer BYE() {
        return this.A0D;
    }

    @Override // X.InterfaceC105354oy
    public final String Bbs() {
        return this.A0G;
    }

    @Override // X.InterfaceC105354oy
    public final String BgB() {
        return this.A0H;
    }

    @Override // X.InterfaceC105354oy
    public final String Bp2() {
        return this.A0I;
    }

    @Override // X.InterfaceC105354oy
    public final /* bridge */ /* synthetic */ InterfaceC105374p1 Bpm() {
        return this.A07;
    }

    @Override // X.InterfaceC105354oy
    public final String Bud() {
        return this.A0J;
    }

    @Override // X.InterfaceC105354oy
    public final String Bur() {
        return this.A0K;
    }

    @Override // X.InterfaceC105354oy
    public final Boolean Bve() {
        return this.A08;
    }

    @Override // X.InterfaceC105354oy
    public final Boolean Bvj() {
        return this.A09;
    }

    @Override // X.InterfaceC105354oy
    public final Boolean Bvm() {
        return this.A0A;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsCardStickerSizeEnum C0f() {
        return this.A03;
    }

    @Override // X.InterfaceC105354oy
    public final IGAdsStickerCardRevampTypographyHierarchyEnum CC2() {
        return this.A06;
    }

    @Override // X.InterfaceC105354oy
    public final String CHS() {
        return this.A0L;
    }

    @Override // X.InterfaceC105354oy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenericCardDict", Xj7.A00(this));
    }

    public C105344ox(IGAdsCardBackgroundTypeEnum iGAdsCardBackgroundTypeEnum, IGAdsCardStickerCTATypeEnum iGAdsCardStickerCTATypeEnum, IGAdsCardStickerClickAreaEnum iGAdsCardStickerClickAreaEnum, IGAdsCardStickerSizeEnum iGAdsCardStickerSizeEnum, IGAdsGenericCardFormatEnum iGAdsGenericCardFormatEnum, IGAdsGenericCardInfoTypeEnum iGAdsGenericCardInfoTypeEnum, IGAdsStickerCardRevampTypographyHierarchyEnum iGAdsStickerCardRevampTypographyHierarchyEnum, C105364p0 c105364p0, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        this.A00 = iGAdsCardBackgroundTypeEnum;
        this.A02 = iGAdsCardStickerClickAreaEnum;
        this.A0B = num;
        this.A01 = iGAdsCardStickerCTATypeEnum;
        this.A0C = num2;
        this.A04 = iGAdsGenericCardFormatEnum;
        this.A0E = str;
        this.A05 = iGAdsGenericCardInfoTypeEnum;
        this.A0M = list;
        this.A0F = str2;
        this.A0D = num3;
        this.A0G = str3;
        this.A0H = str4;
        this.A0I = str5;
        this.A07 = c105364p0;
        this.A0J = str6;
        this.A0K = str7;
        this.A09 = bool;
        this.A08 = bool2;
        this.A0A = bool3;
        this.A03 = iGAdsCardStickerSizeEnum;
        this.A06 = iGAdsStickerCardRevampTypographyHierarchyEnum;
        this.A0L = str8;
    }
}
