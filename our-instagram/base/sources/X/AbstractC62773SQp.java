package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.SQp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62773SQp {
    public static void A01(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }

    public static Object A00(Parcel parcel, Parcelable.Creator creator) {
        return AbstractC58323PtF.A0j(parcel, creator);
    }
}
