package X;

import android.os.Parcel;

/* renamed from: X.Scx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63097Scx {
    public static final ClassLoader A00 = C63097Scx.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw AbstractC58320PtC.A0E(dataAvail);
        }
    }
}
