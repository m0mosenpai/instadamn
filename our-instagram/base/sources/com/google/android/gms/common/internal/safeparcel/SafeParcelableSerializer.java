package com.google.android.gms.common.internal.safeparcel;

import X.C3U5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public abstract class SafeParcelableSerializer {
    public static SafeParcelable A00(Parcelable.Creator creator, byte[] bArr) {
        C3U5.A02(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
