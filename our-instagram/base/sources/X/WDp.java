package X;

import android.os.Parcel;

/* loaded from: classes11.dex */
public final class WDp {
    public static Boolean A00(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return Boolean.valueOf(AbstractC58320PtC.A1T(parcel));
        }
        return null;
    }

    public static void A01(Parcel parcel, Boolean bool) {
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, bool) ? 1 : 0);
    }

    public static boolean A02(Parcel parcel) {
        return AbstractC58320PtC.A1T(parcel);
    }
}
