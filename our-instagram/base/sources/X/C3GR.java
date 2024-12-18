package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3GR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3GR {
    public static final C3GT A00(Context context, UserSession userSession, C1PY c1py) {
        C14360o3.A0B(c1py, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36312853271020827L);
        int A01 = (int) C18U.A01(c06090Tz, userSession, 36594328247797427L);
        int A012 = (int) C18U.A01(c06090Tz, userSession, 36594328247862964L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36312853271217436L);
        if (A06) {
            YFW yfw = new YFW(c1py);
            C6YV c6yv = new C6YV(context, userSession, yfw, A01, A012, A062);
            yfw.A01 = c6yv;
            yfw.A04.A05(c6yv);
            return c6yv;
        }
        return new C3GT() { // from class: X.3GS
            @Override // X.C3GT
            public final int BUo() {
                return -1;
            }

            @Override // X.C3GT
            public final /* bridge */ /* synthetic */ void DNj(Object obj, int i) {
            }
        };
    }
}
