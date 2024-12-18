package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C41164IKd;
import X.HoC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGCTMessagingAdsInfoDict extends C17T implements IGCTMessagingAdsInfoDictIntf {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(97);

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final /* synthetic */ C41164IKd AKM() {
        return new C41164IKd(this);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final OnFeedMessagesIntf BUJ() {
        return (OnFeedMessagesIntf) A05(104069929, ImmutablePandoOnFeedMessages.class);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final PrivacyDisclosureInfo Bgc() {
        return (PrivacyDisclosureInfo) A05(-1212111389, ImmutablePandoPrivacyDisclosureInfo.class);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final SocialProofInfo ByW() {
        return (SocialProofInfo) A05(1972204325, ImmutablePandoSocialProofInfo.class);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final WhatsAppAttributionInfo CHW() {
        return (WhatsAppAttributionInfo) A05(1614568734, ImmutablePandoWhatsAppAttributionInfo.class);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HoC.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String BFQ() {
        return A0j(-985404444);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String Bay() {
        return A0j(-995752982);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String Bon() {
        return A0i(1471967704);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String BrS() {
        return A0i(-216554444);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean BvD() {
        return getOptionalBooleanValueByHashCode(1863941321);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean Bvq() {
        return getOptionalBooleanValueByHashCode(1789984418);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean CPO() {
        return getOptionalBooleanValueByHashCode(-748916528);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean CTO() {
        return getOptionalBooleanValueByHashCode(466272913);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final IGCTMessagingAdsInfoDict EuZ() {
        OnFeedMessages onFeedMessages;
        PrivacyDisclosureInfoImpl privacyDisclosureInfoImpl;
        SocialProofInfoImpl socialProofInfoImpl;
        String A0j = A0j(-985404444);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-748916528);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(466272913);
        OnFeedMessagesIntf BUJ = BUJ();
        WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = null;
        if (BUJ != null) {
            onFeedMessages = BUJ.ExU();
        } else {
            onFeedMessages = null;
        }
        String A0j2 = A0j(-995752982);
        PrivacyDisclosureInfo Bgc = Bgc();
        if (Bgc != null) {
            privacyDisclosureInfoImpl = Bgc.EyC();
        } else {
            privacyDisclosureInfoImpl = null;
        }
        String A0i = A0i(1471967704);
        String A0i2 = A0i(-216554444);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(1863941321);
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(1789984418);
        SocialProofInfo ByW = ByW();
        if (ByW != null) {
            socialProofInfoImpl = ByW.Ezh();
        } else {
            socialProofInfoImpl = null;
        }
        WhatsAppAttributionInfo CHW = CHW();
        if (CHW != null) {
            whatsAppAttributionInfoImpl = CHW.F3v();
        }
        return new IGCTMessagingAdsInfoDict(onFeedMessages, privacyDisclosureInfoImpl, socialProofInfoImpl, whatsAppAttributionInfoImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, A0j, A0j2, A0i, A0i2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
