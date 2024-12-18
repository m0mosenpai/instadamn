package X;

import android.content.Context;

/* loaded from: classes11.dex */
public abstract class VQE {
    /* JADX WARN: Type inference failed for: r0v10, types: [X.W4r, java.lang.Object] */
    public static final void A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String str;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A03(1)).A00;
        Context context = null;
        try {
            String A0g = AbstractC65702TsY.A0g(A0e);
            if (A0g.equals("ADS_TRACKING")) {
                num = C05F.A00;
            } else if (A0g.equals("LOCATION")) {
                num = C05F.A01;
            } else {
                throw new IllegalArgumentException(A0g);
            }
        } catch (IllegalArgumentException unused) {
            num = null;
        }
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        }
        Integer num2 = C05F.A0C;
        if (context != null && num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    num2 = C05F.A00;
                }
            } else {
                num2 = new Object().A01(context);
            }
        }
        C6FX c6fx = new C6FX();
        switch (num2.intValue()) {
            case 0:
                str = "os_granted";
                break;
            case 1:
                str = "os_restricted";
                break;
            default:
                str = "status_error";
                break;
        }
        c6fx.A03(str, 0);
        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
    }
}
