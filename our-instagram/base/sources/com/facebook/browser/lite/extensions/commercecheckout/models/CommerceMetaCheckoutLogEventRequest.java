package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC61734Rsp;
import X.C0T6;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;

/* loaded from: classes10.dex */
public final class CommerceMetaCheckoutLogEventRequest extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(18);
    public final IABAdsContext A00;
    public final MetaCheckoutExperienceType A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceMetaCheckoutLogEventRequest) {
                CommerceMetaCheckoutLogEventRequest commerceMetaCheckoutLogEventRequest = (CommerceMetaCheckoutLogEventRequest) obj;
                if (this.A02 != commerceMetaCheckoutLogEventRequest.A02 || !C14360o3.A0K(this.A00, commerceMetaCheckoutLogEventRequest.A00) || !C14360o3.A0K(this.A04, commerceMetaCheckoutLogEventRequest.A04) || !C14360o3.A0K(this.A06, commerceMetaCheckoutLogEventRequest.A06) || this.A01 != commerceMetaCheckoutLogEventRequest.A01 || !C14360o3.A0K(this.A05, commerceMetaCheckoutLogEventRequest.A05) || !C14360o3.A0K(this.A03, commerceMetaCheckoutLogEventRequest.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(AbstractC61734Rsp.A00(this.A02));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        Integer num = this.A02;
        return ((((((AbstractC166997dE.A0K(this.A04, ((AbstractC25230BEn.A0C(num, AbstractC61734Rsp.A00(num)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public CommerceMetaCheckoutLogEventRequest(IABAdsContext iABAdsContext, MetaCheckoutExperienceType metaCheckoutExperienceType, Integer num, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1Q(num, str);
        this.A02 = num;
        this.A00 = iABAdsContext;
        this.A04 = str;
        this.A06 = str2;
        this.A01 = metaCheckoutExperienceType;
        this.A05 = str3;
        this.A03 = str4;
    }
}
