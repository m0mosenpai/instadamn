package X;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class L38 {
    public InterfaceC50488MQq A00;
    public C47233Ku6 A01;
    public LKm A02;
    public String A03;
    public String A04;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.Ki5] */
    public static C46506Ki5 A00(L38 l38, C46513KiC c46513KiC, byte[] bArr, int i) {
        int i2;
        if (c46513KiC == null) {
            return null;
        }
        if (!c46513KiC.A00()) {
            throw AbstractC166987dD.A14("Cached token is not redeemable. Neither storage nor ACS should return unredeemable tokens; this should not happen.");
        }
        c46513KiC.A01++;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            if (i == i2) {
                Mac mac = Mac.getInstance("HmacSHA512");
                if (mac != null) {
                    mac.init(new SecretKeySpec(c46513KiC.A05, "HmacSHA512"));
                    byte[] doFinal = mac.doFinal(bArr);
                    if (doFinal != null) {
                        String str = l38.A04;
                        String str2 = l38.A03;
                        String str3 = c46513KiC.A03;
                        byte[] bArr2 = c46513KiC.A04;
                        byte[] bArr3 = c46513KiC.A05;
                        ?? obj = new Object();
                        obj.A01 = str;
                        obj.A00 = str2;
                        obj.A02 = str3;
                        obj.A06 = doFinal;
                        obj.A04 = bArr2;
                        obj.A05 = bArr;
                        obj.A03 = bArr3;
                        return obj;
                    }
                    throw new Exception("Generated tag is null.");
                }
                throw new Exception(AnonymousClass001.A0R("Invalid mac instance: ", "HmacSHA512"));
            }
        }
        throw new Exception(AnonymousClass001.A0O("Unknown cipher suite: ", i));
    }
}
