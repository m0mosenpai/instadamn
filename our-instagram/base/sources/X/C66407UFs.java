package X;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: X.UFs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66407UFs extends AbstractC69516Vqf {
    public long A00;
    public long[] A01;
    public long[] A02;

    public C66407UFs() {
        super(new WS4());
        this.A00 = -9223372036854775807L;
        this.A02 = new long[0];
        this.A01 = new long[0];
    }

    public static Object A00(WFa wFa, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(wFa.A0B()));
                                wFa.A0P(2);
                                return date;
                            }
                            int A07 = wFa.A07();
                            ArrayList arrayList = new ArrayList(A07);
                            for (int i2 = 0; i2 < A07; i2++) {
                                Object A00 = A00(wFa, wFa.A05());
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                            return arrayList;
                        }
                        return A02(wFa);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String A01 = A01(wFa);
                        int A05 = wFa.A05();
                        if (A05 != 9) {
                            Object A002 = A00(wFa, A05);
                            if (A002 != null) {
                                hashMap.put(A01, A002);
                            }
                        } else {
                            return hashMap;
                        }
                    }
                } else {
                    return A01(wFa);
                }
            } else {
                boolean z = true;
                if (wFa.A05() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(wFa.A0B()));
        }
    }

    public static String A01(WFa wFa) {
        int A08 = wFa.A08();
        int i = wFa.A01;
        wFa.A0P(A08);
        return new String(wFa.A02, i, A08);
    }

    public static HashMap A02(WFa wFa) {
        int A07 = wFa.A07();
        HashMap hashMap = new HashMap(A07);
        for (int i = 0; i < A07; i++) {
            String A01 = A01(wFa);
            Object A00 = A00(wFa, wFa.A05());
            if (A00 != null) {
                hashMap.put(A01, A00);
            }
        }
        return hashMap;
    }
}
