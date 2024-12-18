package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.List;

/* renamed from: X.4sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107104sG extends C0T6 implements InterfaceC107114sH {
    public final InterfaceC107094sC A00;
    public final MoreInfoProductTagType A01;
    public final MoreInfoSUGPositionType A02;
    public final MoreInfoStickerCTAType A03;
    public final MoreInfoTextStyle A04;
    public final MoreInfoType A05;
    public final AdsRatingInfo A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;

    @Override // X.InterfaceC107114sH
    public final C107104sG Ewt() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C107104sG) {
                C107104sG c107104sG = (C107104sG) obj;
                if (!C14360o3.A0K(this.A06, c107104sG.A06) || this.A03 != c107104sG.A03 || !C14360o3.A0K(this.A0A, c107104sG.A0A) || !C14360o3.A0K(this.A00, c107104sG.A00) || !C14360o3.A0K(this.A07, c107104sG.A07) || !C14360o3.A0K(this.A08, c107104sG.A08) || this.A05 != c107104sG.A05 || this.A01 != c107104sG.A01 || !C14360o3.A0K(this.A0B, c107104sG.A0B) || this.A02 != c107104sG.A02 || this.A04 != c107104sG.A04 || !C14360o3.A0K(this.A09, c107104sG.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AdsRatingInfo adsRatingInfo = this.A06;
        int hashCode = (adsRatingInfo == null ? 0 : adsRatingInfo.hashCode()) * 31;
        MoreInfoStickerCTAType moreInfoStickerCTAType = this.A03;
        int hashCode2 = (hashCode + (moreInfoStickerCTAType == null ? 0 : moreInfoStickerCTAType.hashCode())) * 31;
        String str = this.A0A;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC107094sC interfaceC107094sC = this.A00;
        int hashCode4 = (hashCode3 + (interfaceC107094sC == null ? 0 : interfaceC107094sC.hashCode())) * 31;
        Boolean bool = this.A07;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A08;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MoreInfoType moreInfoType = this.A05;
        int hashCode7 = (hashCode6 + (moreInfoType == null ? 0 : moreInfoType.hashCode())) * 31;
        MoreInfoProductTagType moreInfoProductTagType = this.A01;
        int hashCode8 = (hashCode7 + (moreInfoProductTagType == null ? 0 : moreInfoProductTagType.hashCode())) * 31;
        List list = this.A0B;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        MoreInfoSUGPositionType moreInfoSUGPositionType = this.A02;
        int hashCode10 = (hashCode9 + (moreInfoSUGPositionType == null ? 0 : moreInfoSUGPositionType.hashCode())) * 31;
        MoreInfoTextStyle moreInfoTextStyle = this.A04;
        int hashCode11 = (hashCode10 + (moreInfoTextStyle == null ? 0 : moreInfoTextStyle.hashCode())) * 31;
        Integer num = this.A09;
        return hashCode11 + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC107114sH
    public final /* bridge */ /* synthetic */ AdsRatingInfoIntf AaE() {
        return this.A06;
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoStickerCTAType Atk() {
        return this.A03;
    }

    @Override // X.InterfaceC107114sH
    public final String Aya() {
        return this.A0A;
    }

    @Override // X.InterfaceC107114sH
    public final InterfaceC107094sC B44() {
        return this.A00;
    }

    @Override // X.InterfaceC107114sH
    public final Boolean BDp() {
        return this.A07;
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoType BUy() {
        return this.A05;
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoProductTagType BhL() {
        return this.A01;
    }

    @Override // X.InterfaceC107114sH
    public final List C3I() {
        return this.A0B;
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoSUGPositionType C3n() {
        return this.A02;
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoTextStyle C6o() {
        return this.A04;
    }

    @Override // X.InterfaceC107114sH
    public final Integer CED() {
        return this.A09;
    }

    @Override // X.InterfaceC107114sH
    public final Boolean CWn() {
        return this.A08;
    }

    @Override // X.InterfaceC107114sH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfoMetadata", CDN.A00(this));
    }

    public C107104sG(InterfaceC107094sC interfaceC107094sC, MoreInfoProductTagType moreInfoProductTagType, MoreInfoSUGPositionType moreInfoSUGPositionType, MoreInfoStickerCTAType moreInfoStickerCTAType, MoreInfoTextStyle moreInfoTextStyle, MoreInfoType moreInfoType, AdsRatingInfo adsRatingInfo, Boolean bool, Boolean bool2, Integer num, String str, List list) {
        this.A06 = adsRatingInfo;
        this.A03 = moreInfoStickerCTAType;
        this.A0A = str;
        this.A00 = interfaceC107094sC;
        this.A07 = bool;
        this.A08 = bool2;
        this.A05 = moreInfoType;
        this.A01 = moreInfoProductTagType;
        this.A0B = list;
        this.A02 = moreInfoSUGPositionType;
        this.A04 = moreInfoTextStyle;
        this.A09 = num;
    }
}
