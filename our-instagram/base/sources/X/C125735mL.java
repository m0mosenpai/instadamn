package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: X.5mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125735mL {
    public static final ClassLoader A00 = C125735mL.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(AnonymousClass001.A0O("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
