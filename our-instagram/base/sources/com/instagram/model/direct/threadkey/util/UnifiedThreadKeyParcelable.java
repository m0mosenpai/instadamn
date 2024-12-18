package com.instagram.model.direct.threadkey.util;

import X.C14360o3;
import X.C3o9;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* loaded from: classes8.dex */
public final class UnifiedThreadKeyParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(79);
    public final C3o9 A00;

    public UnifiedThreadKeyParcelable(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 1);
        this.A00 = c3o9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        C14360o3.A0B(parcel, 0);
        C3o9 c3o9 = this.A00;
        if (c3o9 instanceof DirectThreadKey) {
            parcel.writeInt(0);
            ((DirectThreadKey) c3o9).writeToParcel(parcel, i);
            return;
        }
        if (c3o9 instanceof MsysThreadId) {
            parcel.writeInt(1);
            parcelable = (MsysThreadId) c3o9;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            parcel.writeInt(2);
            parcelable = (Parcelable) c3o9;
        }
        parcel.writeParcelable(parcelable, i);
    }
}
