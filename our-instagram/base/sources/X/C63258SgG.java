package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.SgG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63258SgG {
    public static final ClassLoader A00 = C63258SgG.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return AbstractC58320PtC.A0F(parcel, creator);
    }
}
