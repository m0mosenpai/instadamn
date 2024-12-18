package X;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6FP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6FP {
    public static C6FQ A01(C6FG c6fg, AnonymousClass632 anonymousClass632, List list) {
        InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
        InterfaceC103074ki A05 = AnonymousClass634.A05(c6fg);
        return new C6FQ(null, c6fg, null, anonymousClass632, null, interfaceC62872tQ.AgS().AgX(), null, A05, C05F.A0C, (String) c6fg.A01.get(R.id.bk_context_key_logging_id), null, list, null, null);
    }

    public static Object A02(Context context, C66246U5q c66246U5q, InterfaceC62872tQ interfaceC62872tQ, C6FW c6fw, Map map) {
        AnonymousClass630 anonymousClass630 = new AnonymousClass630(new C1338462s(null, c66246U5q.A01, new C102884kP(-1), null), C63162tt.A00, C1339162z.A00);
        if (context instanceof Application) {
            AbstractC25241Le.A02("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        C6FG A01 = AnonymousClass634.A01(context, new SparseArray(), anonymousClass630, interfaceC62872tQ, c66246U5q.A03);
        anonymousClass630.A04(A01, new C29139Ct6(), Collections.emptyMap());
        return C131845xK.A00(A00(c66246U5q, A01, map), c6fw, c66246U5q.A02);
    }

    public static void A06(C66246U5q c66246U5q, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, Map map) {
        C66237U5h c66237U5h = interfaceC103384lE != null ? new C66237U5h(c6fq, interfaceC103384lE) : null;
        if (interfaceC103384lE2 != null) {
            new C66237U5h(c6fq, interfaceC103384lE2);
        }
        A05(c66246U5q, c66237U5h, c6fq, map);
    }

    public static C6FQ A00(C66246U5q c66246U5q, C6FG c6fg, Map map) {
        C1338962x c1338962x = c66246U5q.A01;
        AnonymousClass634.A02(c6fg).A0C(new C1338462s(null, c1338962x, new C102884kP(-1), null), C1338462s.A05(c1338962x.A02, map));
        return C6FQ.A01(c6fg, c66246U5q.A02, null);
    }

    public static Object A03(C6FG c6fg, C102884kP c102884kP, C6FW c6fw, InterfaceC103384lE interfaceC103384lE) {
        return C131845xK.A00(C6FQ.A01(c6fg, interfaceC103384lE, c102884kP.A0A), c6fw, interfaceC103384lE);
    }

    public static void A05(C66246U5q c66246U5q, C66237U5h c66237U5h, C6FQ c6fq, Map map) {
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            AbstractC25241Le.A02("BloksAsyncAction", "Async action executed with a null Context");
            return;
        }
        C6FQ A00 = A00(c66246U5q, c6fg, map);
        InterfaceC103384lE AKr = c66246U5q.A02.AKr(c6fq.A02, null);
        C6FX c6fx = new C6FX();
        c6fx.A03(c6fg, 0);
        Object A002 = C131845xK.A00(A00, new C6FW(c6fx.A00), AKr);
        if (c66237U5h == null) {
            return;
        }
        C6FX c6fx2 = new C6FX();
        c6fx2.A03(A002, 0);
        c6fx2.A03(c6fg, 1);
        c66237U5h.A00(null, new C6FW(c6fx2.A00));
    }

    @Deprecated
    public static Object A04(InterfaceC62872tQ interfaceC62872tQ, C6FW c6fw, InterfaceC103384lE interfaceC103384lE, String str) {
        return C131845xK.A00(C6FQ.A01(AnonymousClass634.A01(C1LZ.A00().A00, new SparseArray(), null, interfaceC62872tQ, str), interfaceC103384lE, null), c6fw, interfaceC103384lE);
    }
}
