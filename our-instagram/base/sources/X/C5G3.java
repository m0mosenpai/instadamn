package X;

import com.instagram.api.schemas.OverlayAdTapDestinationEnum;
import com.instagram.api.schemas.OverlayAdsFormatEnum;

/* renamed from: X.5G3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G3 extends C0T6 implements C5G4 {
    public final OverlayAdTapDestinationEnum A00;
    public final OverlayAdsFormatEnum A01;
    public final InterfaceC31125Dm8 A02;
    public final InterfaceC31125Dm8 A03;
    public final InterfaceC31125Dm8 A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;

    @Override // X.C5G4
    public final C5G3 Exp() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5G3) {
                C5G3 c5g3 = (C5G3) obj;
                if (!C14360o3.A0K(this.A05, c5g3.A05) || !C14360o3.A0K(this.A06, c5g3.A06) || !C14360o3.A0K(this.A07, c5g3.A07) || !C14360o3.A0K(this.A08, c5g3.A08) || !C14360o3.A0K(this.A0F, c5g3.A0F) || !C14360o3.A0K(this.A02, c5g3.A02) || !C14360o3.A0K(this.A09, c5g3.A09) || !C14360o3.A0K(this.A0A, c5g3.A0A) || !C14360o3.A0K(this.A0K, c5g3.A0K) || this.A01 != c5g3.A01 || !C14360o3.A0K(this.A0G, c5g3.A0G) || !C14360o3.A0K(this.A0L, c5g3.A0L) || this.A00 != c5g3.A00 || !C14360o3.A0K(this.A0H, c5g3.A0H) || !C14360o3.A0K(this.A0B, c5g3.A0B) || !C14360o3.A0K(this.A0C, c5g3.A0C) || !C14360o3.A0K(this.A0D, c5g3.A0D) || !C14360o3.A0K(this.A0E, c5g3.A0E) || !C14360o3.A0K(this.A03, c5g3.A03) || !C14360o3.A0K(this.A0I, c5g3.A0I) || !C14360o3.A0K(this.A0J, c5g3.A0J) || !C14360o3.A0K(this.A04, c5g3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A05;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A06;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.A0F;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        InterfaceC31125Dm8 interfaceC31125Dm8 = this.A02;
        int hashCode6 = (hashCode5 + (interfaceC31125Dm8 == null ? 0 : interfaceC31125Dm8.hashCode())) * 31;
        Boolean bool5 = this.A09;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0A;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.A0K;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        OverlayAdsFormatEnum overlayAdsFormatEnum = this.A01;
        int hashCode10 = (hashCode9 + (overlayAdsFormatEnum == null ? 0 : overlayAdsFormatEnum.hashCode())) * 31;
        Integer num2 = this.A0G;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A0L;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OverlayAdTapDestinationEnum overlayAdTapDestinationEnum = this.A00;
        int hashCode13 = (hashCode12 + (overlayAdTapDestinationEnum == null ? 0 : overlayAdTapDestinationEnum.hashCode())) * 31;
        Integer num3 = this.A0H;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool7 = this.A0B;
        int hashCode15 = (hashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A0C;
        int hashCode16 = (hashCode15 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A0D;
        int hashCode17 = (hashCode16 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A0E;
        int hashCode18 = (hashCode17 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        InterfaceC31125Dm8 interfaceC31125Dm82 = this.A03;
        int hashCode19 = (hashCode18 + (interfaceC31125Dm82 == null ? 0 : interfaceC31125Dm82.hashCode())) * 31;
        Integer num4 = this.A0I;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A0J;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        InterfaceC31125Dm8 interfaceC31125Dm83 = this.A04;
        return hashCode21 + (interfaceC31125Dm83 != null ? interfaceC31125Dm83.hashCode() : 0);
    }

    public C5G3(OverlayAdTapDestinationEnum overlayAdTapDestinationEnum, OverlayAdsFormatEnum overlayAdsFormatEnum, InterfaceC31125Dm8 interfaceC31125Dm8, InterfaceC31125Dm8 interfaceC31125Dm82, InterfaceC31125Dm8 interfaceC31125Dm83, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2) {
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A08 = bool4;
        this.A0F = num;
        this.A02 = interfaceC31125Dm8;
        this.A09 = bool5;
        this.A0A = bool6;
        this.A0K = str;
        this.A01 = overlayAdsFormatEnum;
        this.A0G = num2;
        this.A0L = str2;
        this.A00 = overlayAdTapDestinationEnum;
        this.A0H = num3;
        this.A0B = bool7;
        this.A0C = bool8;
        this.A0D = bool9;
        this.A0E = bool10;
        this.A03 = interfaceC31125Dm82;
        this.A0I = num4;
        this.A0J = num5;
        this.A04 = interfaceC31125Dm83;
    }
}
