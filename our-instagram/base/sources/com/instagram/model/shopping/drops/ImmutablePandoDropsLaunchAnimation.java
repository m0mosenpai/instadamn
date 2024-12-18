package com.instagram.model.shopping.drops;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoDropsLaunchAnimation extends C17T implements DropsLaunchAnimationIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(55);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.drops.DropsLaunchAnimationIntf
    public final DropsLaunchAnimation F62() {
        return new DropsLaunchAnimation(getOptionalBooleanValueByHashCode(-769779518));
    }

    @Override // com.instagram.model.shopping.drops.DropsLaunchAnimationIntf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (getOptionalBooleanValueByHashCode(-769779518) != null) {
            A0X.put("show_animation", getOptionalBooleanValueByHashCode(-769779518));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
