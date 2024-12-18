package X;

import android.os.Parcel;

/* renamed from: X.S5g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62287S5g {
    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(65535);
        return parcel.dataPosition();
    }
}
