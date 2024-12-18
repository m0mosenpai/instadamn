package X;

import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class ST0 {
    public static int A00(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static void A01(Parcel parcel, int i, int i2) {
        int A00 = A00(parcel, i);
        if (A00 == i2) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AbstractC111324zv.A00(3605));
        A1C.append(i2);
        A1C.append(" got ");
        A1C.append(A00);
        A1C.append(" (0x");
        AbstractC58318PtA.A1T(A1C, A00);
        throw new RuntimeException(AbstractC166997dE.A0x(")", A1C));
    }
}
