package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import X.C41164IKd;
import X.HoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class IGCTMessagingAdsInfoDict extends C0T6 implements IGCTMessagingAdsInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(15);
    public final OnFeedMessages A00;
    public final PrivacyDisclosureInfo A01;
    public final SocialProofInfo A02;
    public final WhatsAppAttributionInfo A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final IGCTMessagingAdsInfoDict EuZ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCTMessagingAdsInfoDict) {
                IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) obj;
                if (!C14360o3.A0K(this.A08, iGCTMessagingAdsInfoDict.A08) || !C14360o3.A0K(this.A04, iGCTMessagingAdsInfoDict.A04) || !C14360o3.A0K(this.A05, iGCTMessagingAdsInfoDict.A05) || !C14360o3.A0K(this.A00, iGCTMessagingAdsInfoDict.A00) || !C14360o3.A0K(this.A09, iGCTMessagingAdsInfoDict.A09) || !C14360o3.A0K(this.A01, iGCTMessagingAdsInfoDict.A01) || !C14360o3.A0K(this.A0A, iGCTMessagingAdsInfoDict.A0A) || !C14360o3.A0K(this.A0B, iGCTMessagingAdsInfoDict.A0B) || !C14360o3.A0K(this.A06, iGCTMessagingAdsInfoDict.A06) || !C14360o3.A0K(this.A07, iGCTMessagingAdsInfoDict.A07) || !C14360o3.A0K(this.A02, iGCTMessagingAdsInfoDict.A02) || !C14360o3.A0K(this.A03, iGCTMessagingAdsInfoDict.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A08;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.A04;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A05;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OnFeedMessages onFeedMessages = this.A00;
        int hashCode4 = (hashCode3 + (onFeedMessages == null ? 0 : onFeedMessages.hashCode())) * 31;
        String str2 = this.A09;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PrivacyDisclosureInfo privacyDisclosureInfo = this.A01;
        int hashCode6 = (hashCode5 + (privacyDisclosureInfo == null ? 0 : privacyDisclosureInfo.hashCode())) * 31;
        String str3 = this.A0A;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0B;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.A06;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A07;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        SocialProofInfo socialProofInfo = this.A02;
        int hashCode11 = (hashCode10 + (socialProofInfo == null ? 0 : socialProofInfo.hashCode())) * 31;
        WhatsAppAttributionInfo whatsAppAttributionInfo = this.A03;
        return hashCode11 + (whatsAppAttributionInfo != null ? whatsAppAttributionInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        Boolean bool3 = this.A06;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A07;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final /* bridge */ /* synthetic */ C41164IKd AKM() {
        return new C41164IKd(this);
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String BFQ() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final /* bridge */ /* synthetic */ OnFeedMessagesIntf BUJ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String Bay() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final PrivacyDisclosureInfo Bgc() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String Bon() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final String BrS() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean BvD() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean Bvq() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final SocialProofInfo ByW() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final WhatsAppAttributionInfo CHW() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean CPO() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final Boolean CTO() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGCTMessagingAdsInfoDict", HoC.A00(this));
    }

    public IGCTMessagingAdsInfoDict(OnFeedMessages onFeedMessages, PrivacyDisclosureInfo privacyDisclosureInfo, SocialProofInfo socialProofInfo, WhatsAppAttributionInfo whatsAppAttributionInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4) {
        this.A08 = str;
        this.A04 = bool;
        this.A05 = bool2;
        this.A00 = onFeedMessages;
        this.A09 = str2;
        this.A01 = privacyDisclosureInfo;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = bool3;
        this.A07 = bool4;
        this.A02 = socialProofInfo;
        this.A03 = whatsAppAttributionInfo;
    }
}
