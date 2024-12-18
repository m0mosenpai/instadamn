package X;

import android.os.Parcel;

/* renamed from: X.Pz7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58636Pz7 {
    public static final ClassLoader A00 = C58636Pz7.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw AbstractC58320PtC.A0E(dataAvail);
        }
    }
}
