package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.155, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass155 {
    public static AnonymousClass155 A05;
    public C0Gd A00;
    public boolean A03;
    public Map A02 = new HashMap();
    public Map A01 = new HashMap();
    public boolean A04 = true;

    public static String A00(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "No Message supplied by the error";
        }
        return AnonymousClass001.A13("MobileBoost | ", str, " | ", C2050395s.A00(i), " | ", str2);
    }

    public static void A01(AnonymousClass155 anonymousClass155, Throwable th) {
        if (anonymousClass155.A04) {
        } else {
            throw new RuntimeException("Mobile Boost: Forced fallthrough crash! Error State Handler turned off!", th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.15Q] */
    public final void A03(InterfaceC219914z interfaceC219914z) {
        int i;
        if (interfaceC219914z != null && interfaceC219914z.AhK() != -1) {
            AbstractC219814y abstractC219814y = (AbstractC219814y) interfaceC219914z;
            synchronized (interfaceC219914z) {
                i = abstractC219814y.A00;
            }
            if (i != 0) {
                if (abstractC219814y.A01 == null) {
                    abstractC219814y.A01 = new Object();
                }
                Map map = this.A01;
                if (map.containsKey(interfaceC219914z) && map.get(interfaceC219914z) != null && 5 < ((Number) map.get(interfaceC219914z)).intValue()) {
                    map.get(interfaceC219914z);
                    synchronized (interfaceC219914z) {
                    }
                }
                Map map2 = this.A02;
                if (map2.containsKey(interfaceC219914z) && map2.get(interfaceC219914z) != null && 5 < ((Number) map2.get(interfaceC219914z)).intValue()) {
                    map2.get(interfaceC219914z);
                    synchronized (interfaceC219914z) {
                    }
                }
            }
        }
    }

    public final void A04(InterfaceC219914z interfaceC219914z, Throwable th) {
        int i;
        if (interfaceC219914z != null) {
            i = interfaceC219914z.AhK();
            if (i != -1) {
                A02(interfaceC219914z, this.A01);
            }
        } else {
            C219714x c219714x = C219714x.A00;
            i = -1;
        }
        A01(this, th);
        this.A00.EmQ(A00("BoosterFailsReleaseWithException", th.getMessage(), i), th);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0Gd] */
    public AnonymousClass155(C0Gd c0Gd) {
        this.A03 = false;
        if (c0Gd != null) {
            this.A00 = c0Gd;
            this.A03 = true;
        } else {
            this.A00 = new Object();
        }
    }

    public static void A02(InterfaceC219914z interfaceC219914z, Map map) {
        if (interfaceC219914z.AhK() != -1) {
            int i = 1;
            if (map.containsKey(interfaceC219914z) && map.get(interfaceC219914z) != null) {
                i = ((Number) map.get(interfaceC219914z)).intValue() + 1;
            }
            map.put(interfaceC219914z, Integer.valueOf(i));
        }
    }
}
