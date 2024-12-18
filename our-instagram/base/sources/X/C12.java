package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoProductTagType;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.api.schemas.MoreInfoStickerCTAType;
import com.instagram.api.schemas.MoreInfoTextStyle;
import com.instagram.api.schemas.MoreInfoType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.ImmutablePandoAdsRatingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class C12 extends C17T implements InterfaceC107114sH {
    @Override // X.InterfaceC107114sH
    public final AdsRatingInfoIntf AaE() {
        return (AdsRatingInfoIntf) A05(-398367627, ImmutablePandoAdsRatingInfo.class);
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoStickerCTAType Atk() {
        return (MoreInfoStickerCTAType) A0N(-1670881216, C30006DKs.A00);
    }

    @Override // X.InterfaceC107114sH
    public final InterfaceC107094sC B44() {
        return (InterfaceC107094sC) A05(497541391, C10.class);
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoType BUy() {
        return (MoreInfoType) A0N(-1304465471, C30007DKt.A00);
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoProductTagType BhL() {
        return (MoreInfoProductTagType) A0N(1873197583, C30008DKu.A00);
    }

    @Override // X.InterfaceC107114sH
    public final List C3I() {
        return A08(-2070343296, C13.class);
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoSUGPositionType C3n() {
        return (MoreInfoSUGPositionType) A0N(-52999709, C30009DKv.A00);
    }

    @Override // X.InterfaceC107114sH
    public final MoreInfoTextStyle C6o() {
        return (MoreInfoTextStyle) A0N(-2100400097, C30010DKw.A00);
    }

    @Override // X.InterfaceC107114sH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDN.A00(this));
    }

    @Override // X.InterfaceC107114sH
    public final String Aya() {
        return A0i(1775846958);
    }

    @Override // X.InterfaceC107114sH
    public final Boolean BDp() {
        return getOptionalBooleanValueByHashCode(-1773577784);
    }

    @Override // X.InterfaceC107114sH
    public final Integer CED() {
        return getOptionalIntValueByHashCode(-168190952);
    }

    @Override // X.InterfaceC107114sH
    public final Boolean CWn() {
        return getOptionalBooleanValueByHashCode(296405837);
    }

    @Override // X.InterfaceC107114sH
    public final C107104sG Ewt() {
        AdsRatingInfo adsRatingInfo;
        C107084sB c107084sB;
        AdsRatingInfoIntf AaE = AaE();
        ArrayList arrayList = null;
        if (AaE != null) {
            adsRatingInfo = AaE.F7J();
        } else {
            adsRatingInfo = null;
        }
        MoreInfoStickerCTAType Atk = Atk();
        String A0i = A0i(1775846958);
        InterfaceC107094sC B44 = B44();
        if (B44 != null) {
            c107084sB = B44.Ews();
        } else {
            c107084sB = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1773577784);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(296405837);
        MoreInfoType BUy = BUy();
        MoreInfoProductTagType BhL = BhL();
        List C3I = C3I();
        if (C3I != null) {
            arrayList = AbstractC167017dG.A0q(C3I);
            Iterator it = C3I.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31123Dm6) it.next()).Ewu());
            }
        }
        return new C107104sG(c107084sB, BhL, C3n(), Atk, C6o(), BUy, adsRatingInfo, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, getOptionalIntValueByHashCode(-168190952), A0i, arrayList);
    }
}
