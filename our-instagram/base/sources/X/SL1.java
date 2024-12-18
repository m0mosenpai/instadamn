package X;

import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class SL1 {
    public final C62750SPb A01 = new C62750SPb(1000);
    public final C02Q A00 = new C63591Spy(new C12550kz(10), new C63889SvN(this, 2), S6C.A00);

    public final String A00(InterfaceC65617To8 interfaceC65617To8) {
        String str;
        C62750SPb c62750SPb = this.A01;
        synchronized (c62750SPb) {
            str = (String) c62750SPb.A00(interfaceC65617To8);
        }
        if (str == null) {
            C02Q c02q = this.A00;
            Object A7H = c02q.A7H();
            Rs8.A00(A7H);
            C63890SvO c63890SvO = (C63890SvO) A7H;
            try {
                MessageDigest messageDigest = c63890SvO.A00;
                interfaceC65617To8.FAj(messageDigest);
                byte[] digest = messageDigest.digest();
                char[] cArr = C63375Sim.A01;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i * 2;
                        char[] cArr2 = C63375Sim.A00;
                        cArr[i3] = cArr2[i2 >>> 4];
                        AbstractC58318PtA.A1Z(cArr2, cArr, i2, i3 + 1);
                    }
                    str = new String(cArr);
                }
            } finally {
                c02q.EE6(c63890SvO);
            }
        }
        synchronized (c62750SPb) {
            c62750SPb.A03(interfaceC65617To8, str);
        }
        return str;
    }
}
