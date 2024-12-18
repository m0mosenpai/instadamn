package com.instagram.shopping.model.recon;

import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public abstract class ShoppingReconFeedEndpoint implements Parcelable {

    /* loaded from: classes7.dex */
    public final class ReconDestinationFeedEndpoint extends ShoppingReconFeedEndpoint {
        public static final ReconDestinationFeedEndpoint A00 = new Object();
        public static final Parcelable.Creator CREATOR = C37324GcR.A00(86);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(1);
        }
    }
}
