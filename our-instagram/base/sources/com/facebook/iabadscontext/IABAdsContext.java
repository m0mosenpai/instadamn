package com.facebook.iabadscontext;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC43594JPz;
import X.AbstractC61701RsI;
import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import X.EnumC39621HeV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class IABAdsContext extends C0T6 implements Parcelable, IabAdsTrait {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(4);
    public final IABAdsBwIntegrationExtension A00;
    public final IABAdsMetaCheckoutDataExtension A01;
    public final IABAdsMetaCheckoutPaymentsSDKDataExtension A02;
    public final IABPostClickPersonalizationDataExtension A03;
    public final IgPromoAdsExtension A04;
    public final IABBwPExtension A05;
    public final ImmutableList A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final Map A0D;
    public final IABBwPayPalExtension A0E;
    public final IABWatchAndBrowseWebToWAExtension A0F;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABAdsContext) {
                IABAdsContext iABAdsContext = (IABAdsContext) obj;
                if (!C14360o3.A0K(this.A07, iABAdsContext.A07) || !C14360o3.A0K(this.A06, iABAdsContext.A06) || !C14360o3.A0K(this.A0A, iABAdsContext.A0A) || !C14360o3.A0K(this.A0D, iABAdsContext.A0D) || !C14360o3.A0K(this.A09, iABAdsContext.A09) || !C14360o3.A0K(this.A0C, iABAdsContext.A0C) || !C14360o3.A0K(this.A01, iABAdsContext.A01) || !C14360o3.A0K(this.A05, iABAdsContext.A05) || !C14360o3.A0K(this.A04, iABAdsContext.A04) || !C14360o3.A0K(this.A02, iABAdsContext.A02) || !C14360o3.A0K(this.A0F, iABAdsContext.A0F) || !C14360o3.A0K(this.A00, iABAdsContext.A00) || !C14360o3.A0K(this.A03, iABAdsContext.A03) || !C14360o3.A0K(this.A0E, iABAdsContext.A0E) || !C14360o3.A0K(this.A0B, iABAdsContext.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        parcel.writeSerializable(this.A06);
        parcel.writeString(this.A0A);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A0D);
        while (A0s.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A0s);
            AbstractC166997dE.A1I(parcel, (EnumC39621HeV) A1K.getKey());
            ((DisclaimerText) A1K.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeStringList(this.A0C);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A05, i);
        IgPromoAdsExtension igPromoAdsExtension = this.A04;
        if (igPromoAdsExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igPromoAdsExtension.writeToParcel(parcel, i);
        }
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = this.A02;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsMetaCheckoutPaymentsSDKDataExtension.writeToParcel(parcel, i);
        }
        IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension = this.A0F;
        if (iABWatchAndBrowseWebToWAExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABWatchAndBrowseWebToWAExtension.writeToParcel(parcel, i);
        }
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = this.A00;
        if (iABAdsBwIntegrationExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsBwIntegrationExtension.writeToParcel(parcel, i);
        }
        IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension = this.A03;
        if (iABPostClickPersonalizationDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABPostClickPersonalizationDataExtension.writeToParcel(parcel, i);
        }
        IABBwPayPalExtension iABBwPayPalExtension = this.A0E;
        if (iABBwPayPalExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABBwPayPalExtension.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
    }

    public IABAdsContext(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension, IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension, IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension, IABBwPayPalExtension iABBwPayPalExtension, IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension, IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension, IgPromoAdsExtension igPromoAdsExtension, IABBwPExtension iABBwPExtension, ImmutableList immutableList, Integer num, String str, String str2, String str3, List list, Map map) {
        AbstractC43594JPz.A1P(immutableList, map);
        AbstractC167017dG.A1U(list, iABAdsMetaCheckoutDataExtension);
        this.A07 = num;
        this.A06 = immutableList;
        this.A0A = str;
        this.A0D = map;
        this.A09 = str2;
        this.A0C = list;
        this.A01 = iABAdsMetaCheckoutDataExtension;
        this.A05 = iABBwPExtension;
        this.A04 = igPromoAdsExtension;
        this.A02 = iABAdsMetaCheckoutPaymentsSDKDataExtension;
        this.A0F = iABWatchAndBrowseWebToWAExtension;
        this.A00 = iABAdsBwIntegrationExtension;
        this.A03 = iABPostClickPersonalizationDataExtension;
        this.A0E = iABBwPayPalExtension;
        this.A0B = str3;
        this.A08 = C05F.A00;
    }

    public final IABAdsContext A00() {
        Integer num = this.A07;
        ImmutableList immutableList = this.A06;
        String str = this.A0A;
        Map map = this.A0D;
        String str2 = this.A09;
        List list = this.A0C;
        IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension = this.A01;
        IgPromoAdsExtension igPromoAdsExtension = this.A04;
        return new IABAdsContext(null, iABAdsMetaCheckoutDataExtension, this.A02, null, this.A03, this.A0F, igPromoAdsExtension, null, immutableList, num, str, str2, null, list, map);
    }

    @Override // com.facebook.browser.iabcontext.IabCommonTrait
    public final List Anm() {
        return this.A0C;
    }

    public final int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A0C, (AbstractC166997dE.A0J(this.A0D, (AbstractC166997dE.A0J(this.A06, AbstractC167017dG.A0M(this.A07) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31)) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC25227BEk.A07(this.A0B);
    }

    public final String toString() {
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("eligible_experience_types", this.A06, AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC61701RsI.A00(this.A08)), AbstractC166987dD.A1L("click_ids", this.A0C)));
        Integer num = this.A07;
        if (num != null) {
            A07.put("impression_time", num);
        }
        String str = this.A0A;
        if (str != null) {
            A07.put("ad_id", str);
        }
        String str2 = this.A0B;
        if (str2 != null) {
            A07.put("tracking_token", str2);
        }
        return A07.toString();
    }
}
