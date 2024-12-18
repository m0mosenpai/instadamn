package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class SuggestedPromotion implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(89);
    public InstagramPromoteSuggestionReason A00;
    public ImageUrl A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        String str2 = this.A03;
        if (str2 != null) {
            parcel.writeString(str2);
            String str3 = this.A05;
            if (str3 != null) {
                parcel.writeString(str3);
                String str4 = this.A04;
                if (str4 != null) {
                    parcel.writeString(str4);
                    ImageUrl imageUrl = this.A01;
                    if (imageUrl != null) {
                        parcel.writeParcelable(imageUrl, 0);
                        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason = this.A00;
                        if (instagramPromoteSuggestionReason != null) {
                            parcel.writeParcelable(instagramPromoteSuggestionReason, 0);
                            parcel.writeString(this.A02);
                            return;
                        }
                        str = "reason";
                    } else {
                        str = "thumbnailUrl";
                    }
                } else {
                    str = "organicMediaFbId";
                }
            } else {
                str = "organicMediaIgId";
            }
        } else {
            str = "displayTitle";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
