package com.instagram.model.shopping.drops;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class DropsLaunchAnimation extends C0T6 implements Parcelable, DropsLaunchAnimationIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(25);
    public final Boolean A00;

    @Override // com.instagram.model.shopping.drops.DropsLaunchAnimationIntf
    public final DropsLaunchAnimation F62() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DropsLaunchAnimation) && C14360o3.A0K(this.A00, ((DropsLaunchAnimation) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public DropsLaunchAnimation(Boolean bool) {
        this.A00 = bool;
    }

    @Override // com.instagram.model.shopping.drops.DropsLaunchAnimationIntf
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        Boolean bool = this.A00;
        if (bool != null) {
            A0X.put("show_animation", bool);
        }
        return AbstractC37300Gc1.A05("XDTDropsLaunchAnimation", AbstractC06930Yk.A0B(A0X));
    }
}
