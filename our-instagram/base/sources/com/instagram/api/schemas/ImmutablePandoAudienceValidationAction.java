package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;

/* loaded from: classes11.dex */
public final class ImmutablePandoAudienceValidationAction extends C17T implements AudienceValidationAction {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(10);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudienceValidationAction
    public final String getCtaText() {
        return A0h(-815905284);
    }

    @Override // com.instagram.api.schemas.AudienceValidationAction
    public final String getUrl() {
        return A0V();
    }
}
