package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BN7 {
    public static final BN7 A00 = new Object();

    public final C51722Yv A00(Context context, C51722Yv c51722Yv, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        if (A04(context) || A03(context)) {
            return AbstractC25232BEp.A15(c51722Yv, C05F.A0Y, EnumC77933eL.RELATIVE);
        }
        return c51722Yv;
    }

    public final C51722Yv A01(Context context, C51722Yv c51722Yv, UserSession userSession, InterfaceC30978DjZ interfaceC30978DjZ) {
        C51722Yv c51722Yv2;
        C9CT c9ct;
        C14360o3.A0B(userSession, 2);
        if (interfaceC30978DjZ != null) {
            Size BK8 = interfaceC30978DjZ.BK8();
            if (A04(context)) {
                c51722Yv2 = new C51722Yv(c51722Yv, new C9CT(C05F.A00, (((int) (BK8.getHeight() * 0.5625f)) / BK8.getWidth()) * 100.0f, 0));
                c9ct = new C9CT(C05F.A01, 100.0f, 0);
            } else {
                if (!A03(context)) {
                    return c51722Yv;
                }
                c51722Yv2 = new C51722Yv(c51722Yv, new C9CT(C05F.A00, 100.0f, 0));
                c9ct = new C9CT(C05F.A01, (((int) (BK8.getWidth() / 0.5625f)) / BK8.getHeight()) * 100.0f, 0);
            }
            return new C51722Yv(c51722Yv2, c9ct);
        }
        return c51722Yv;
    }

    public final C51722Yv A02(Context context, C51722Yv c51722Yv, UserSession userSession, InterfaceC30978DjZ interfaceC30978DjZ) {
        long A0K;
        Integer num;
        C14360o3.A0B(userSession, 2);
        if (interfaceC30978DjZ != null) {
            Size BK8 = interfaceC30978DjZ.BK8();
            BN7 bn7 = A00;
            if (bn7.A04(context)) {
                A0K = AbstractC25229BEm.A0K((int) AbstractC25227BEk.A00(BK8.getWidth(), BK8.getHeight() * 0.5625f));
                num = C05F.A0C;
            } else {
                if (!bn7.A03(context)) {
                    return c51722Yv;
                }
                A0K = AbstractC25229BEm.A0K((int) AbstractC25227BEk.A00(BK8.getHeight(), BK8.getWidth() / 0.5625f));
                num = C05F.A0N;
            }
            return C9CU.A00(c51722Yv, num, 1, A0K);
        }
        return c51722Yv;
    }

    public final boolean A03(Context context) {
        if (AbstractC13890nF.A01(context) / AbstractC13890nF.A00(context) < 0.44f && AbstractC52812bN.A00) {
            return true;
        }
        return false;
    }

    public final boolean A04(Context context) {
        if (AbstractC13890nF.A01(context) / AbstractC13890nF.A00(context) > 0.625f && AbstractC52812bN.A00) {
            return true;
        }
        return false;
    }
}
