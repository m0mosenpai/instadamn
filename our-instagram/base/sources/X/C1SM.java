package X;

import java.util.Map;

/* renamed from: X.1SM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SM {
    public final void A02(C1SJ c1sj, String str) {
        C14360o3.A0B(str, 1);
        byte[] bytes = str.getBytes(C1SL.A01);
        C14360o3.A07(bytes);
        int length = bytes.length;
        A00(c1sj, length);
        int i = c1sj.A00 + length;
        byte[] bArr = c1sj.A01;
        int length2 = bArr.length;
        if (i >= length2) {
            byte[] bArr2 = new byte[(length2 + length) * 2];
            c1sj.A01 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        System.arraycopy(bytes, 0, c1sj.A01, c1sj.A00, length);
        c1sj.A00 += length;
    }

    public final void A03(C1SJ c1sj, Map map) {
        if (map == null) {
            A00(c1sj, 0);
            return;
        }
        A00(c1sj, map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            A02(c1sj, str);
            A02(c1sj, str2);
        }
    }

    public static final void A00(C1SJ c1sj, int i) {
        c1sj.A00((byte) (i & 255));
        c1sj.A00((byte) ((65280 & i) >> 8));
        c1sj.A00((byte) ((16711680 & i) >> 16));
        c1sj.A00((byte) ((i & (-16777216)) >> 24));
    }

    public static final void A01(C1SJ c1sj, long j) {
        c1sj.A00((byte) (255 & j));
        c1sj.A00((byte) ((65280 & j) >> 8));
        c1sj.A00((byte) ((16711680 & j) >> 16));
        c1sj.A00((byte) ((4278190080L & j) >> 24));
        c1sj.A00((byte) ((1095216660480L & j) >> 32));
        c1sj.A00((byte) ((280375465082880L & j) >> 40));
        c1sj.A00((byte) ((71776119061217280L & j) >> 48));
        c1sj.A00((byte) ((j & (-72057594037927936L)) >> 56));
    }
}
