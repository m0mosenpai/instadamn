package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4AH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AH {
    public final UserSession A00;
    public final boolean A01;

    public C4AH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36312247680697360L);
    }

    public final void A01(C4AD c4ad) {
        C14360o3.A0B(c4ad, 0);
        boolean z = this.A01;
        UserSession userSession = this.A00;
        if (z) {
            C42411xV A00 = C42411xV.A00(userSession);
            C75363a3 c75363a3 = c4ad.A07;
            String str = c4ad.A08;
            C4AF A002 = c4ad.A00();
            InterfaceC42731y1 interfaceC42731y1 = A00.A0B;
            interfaceC42731y1.A8e(c75363a3, A002, str);
            interfaceC42731y1.Enk(C05F.A0N);
            C70780Wgt c70780Wgt = A00.A00;
            if (c70780Wgt != null) {
                c70780Wgt.A00(c75363a3, str, A00.A04.userId);
                return;
            }
            return;
        }
        C4AI.A00(userSession, c4ad);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.2UZ] */
    public final void A00(Context context) {
        UserSession userSession = this.A00;
        AbstractC41221vX.A01(context, userSession);
        C41321vh.A01(userSession);
        synchronized (C2UZ.class) {
            if (C2UZ.A02 == null) {
                Context applicationContext = context.getApplicationContext();
                ?? obj = new Object();
                obj.A00 = applicationContext.getApplicationContext();
                C2UZ.A02 = obj;
            }
        }
        C14M.A05(new C14M());
    }
}
