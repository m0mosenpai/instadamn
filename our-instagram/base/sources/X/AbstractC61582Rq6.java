package X;

import android.util.Base64;

/* renamed from: X.Rq6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61582Rq6 {
    public final String toString() {
        String encodeToString;
        C60639REy c60639REy = (C60639REy) this;
        String str = c60639REy.A01;
        EnumC61103RfI enumC61103RfI = c60639REy.A00;
        byte[] bArr = c60639REy.A02;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return String.format("TransportContext(%s, %s, %s)", str, enumC61103RfI, encodeToString);
    }
}
