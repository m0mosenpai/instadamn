package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Scv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63095Scv {
    public static final ClassLoader A00 = C63095Scv.class.getClassLoader();

    public static void A00(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
