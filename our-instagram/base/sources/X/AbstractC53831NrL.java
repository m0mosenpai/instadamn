package X;

/* renamed from: X.NrL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53831NrL {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP c102884kP = (C102884kP) MSW.A10(c6fw, 0);
        if (c102884kP != null) {
            OFI ofi = new OFI();
            AbstractC12990ll A0B = C6BQ.A0B(c6fq);
            String str = "";
            c102884kP.A0L(36);
            String str2 = "";
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                str2 = A0E;
            }
            ofi.A04 = str2;
            ofi.A00 = Boolean.valueOf(c102884kP.A0S(41, false));
            ofi.A01 = Integer.valueOf(c102884kP.A03(38, 0));
            String str3 = "";
            String A0H = c102884kP.A0H();
            if (A0H != null) {
                str3 = A0H;
            }
            ofi.A07 = str3;
            String str4 = "";
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                str4 = A0F;
            }
            ofi.A06 = str4;
            String str5 = "";
            String A0K = c102884kP.A0K();
            if (A0K != null) {
                str5 = A0K;
            }
            ofi.A03 = str5;
            ofi.A02 = c102884kP.A0L(45);
            ofi.A08 = c102884kP.A0O(44);
            String A0L = c102884kP.A0L(46);
            if (A0L != null) {
                str = A0L;
            }
            ofi.A05 = str;
            AbstractC25651Mw.A00(A0B).E4s(new C56003Ota(ofi));
            return null;
        }
        return null;
    }
}
