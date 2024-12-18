package com.instagram.api.schemas;

import X.AbstractC111324zv;
import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoSocialProofInfo extends C17T implements SocialProofInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(80);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final Integer BXn() {
        return getOptionalIntValueByHashCode(1696323444);
    }

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final SocialProofInfoImpl Ezh() {
        return new SocialProofInfoImpl(getOptionalIntValueByHashCode(1696323444));
    }

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalIntValueByHashCode(1696323444) != null) {
            A0X.put(AbstractC111324zv.A00(5002), getOptionalIntValueByHashCode(1696323444));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
