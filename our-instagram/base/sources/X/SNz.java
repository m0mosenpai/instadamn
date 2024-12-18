package X;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SNz {
    public Map A00;
    public Y1j[] A01;
    public final String A02;
    public final byte[] A03;

    public final void A00(EnumC61141Rfv enumC61141Rfv, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(EnumC61141Rfv.class);
            this.A00 = map;
        }
        map.put(enumC61141Rfv, obj);
    }

    public final String toString() {
        return this.A02;
    }

    public SNz(String str, byte[] bArr, Y1j[] y1jArr) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = y1jArr;
        this.A00 = null;
    }
}
