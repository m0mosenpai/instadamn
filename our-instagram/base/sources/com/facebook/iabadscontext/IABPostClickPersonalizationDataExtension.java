package com.facebook.iabadscontext;

import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class IABPostClickPersonalizationDataExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(10);
    public final List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABPostClickPersonalizationDataExtension) && C14360o3.A0K(this.A00, ((IABPostClickPersonalizationDataExtension) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            IabAdCreativeOptimizationConfigByType iabAdCreativeOptimizationConfigByType = (IabAdCreativeOptimizationConfigByType) A0u.next();
            if (iabAdCreativeOptimizationConfigByType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                iabAdCreativeOptimizationConfigByType.writeToParcel(parcel, i);
            }
        }
    }

    public IABPostClickPersonalizationDataExtension(List list) {
        this.A00 = list;
    }
}
