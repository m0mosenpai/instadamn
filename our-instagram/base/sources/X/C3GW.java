package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3GW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3GW {
    public static final C6YC A00(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C6Y2 c6y2, InterfaceC101944i9 interfaceC101944i9, C26191Pa c26191Pa, InterfaceC62242sP interfaceC62242sP, C31G c31g, C1PY c1py, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, String str, boolean z) {
        C3GY c3gx;
        C14360o3.A0B(c1py, 7);
        C14360o3.A0B(c26191Pa, 8);
        if (C1P9.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323715246730802L)) {
            c3gx = new C37347Gcp(context, userSession, anonymousClass318, interfaceC60442pS, c3g2, interfaceC62242sP, c1m1, str);
        } else {
            c3gx = new C3GX(context, userSession, anonymousClass318, interfaceC60442pS, c3g2, interfaceC62242sP, c1m1, str);
        }
        ArrayList arrayList = new ArrayList();
        C06090Tz c06090Tz = C06090Tz.A05;
        arrayList.add(new C6YA(context, abstractC018607g, userSession, anonymousClass318, interfaceC60442pS, c3g2, c3gx, interfaceC101944i9, c26191Pa, c31g, c1py, interfaceC61432r6, c1m1, str, C18U.A06(c06090Tz, userSession, 36310538286923933L), C18U.A06(c06090Tz, userSession, 36310538287775909L), z));
        C6YC c6yc = new C6YC(arrayList);
        if (c6y2 != null) {
            c6yc.A00 = new C6YD(userSession, c6y2, interfaceC101944i9, c1py);
        }
        return c6yc;
    }

    public static final C70893Gb A01(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C26191Pa c26191Pa, InterfaceC62242sP interfaceC62242sP, C31G c31g, C1PY c1py, C1M1 c1m1, String str) {
        C14360o3.A0B(c1py, 7);
        C14360o3.A0B(c26191Pa, 8);
        C3GX c3gx = new C3GX(context, userSession, anonymousClass318, interfaceC60442pS, c3g2, interfaceC62242sP, c1m1, str);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317753830872600L) && C18U.A06(c06090Tz, userSession, 36317753831659044L)) {
            return new HY7(context, abstractC018607g, userSession, anonymousClass318, c3g2, c3gx, c26191Pa, c31g, c1py, c1m1, str);
        }
        return new C70893Gb(context, abstractC018607g, userSession, anonymousClass318, c3g2, c3gx, c26191Pa, c31g, c1py, c1m1, str);
    }
}
