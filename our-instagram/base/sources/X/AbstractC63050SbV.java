package X;

import android.os.Parcel;

/* renamed from: X.SbV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63050SbV {
    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(Parcel parcel, Boolean bool) {
        byte b;
        if (bool == null) {
            b = 2;
        } else {
            b = bool.booleanValue();
        }
        parcel.writeByte(b);
    }

    public static void A02(Parcel parcel, Float f) {
        if (f == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static Boolean A00(Parcel parcel) {
        byte readByte = parcel.readByte();
        boolean z = false;
        if (readByte != 0) {
            z = true;
            if (readByte != 1) {
                return null;
            }
        }
        return Boolean.valueOf(z);
    }
}
