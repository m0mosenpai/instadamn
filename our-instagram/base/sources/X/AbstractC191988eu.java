package X;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.8eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191988eu implements Cloneable {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8f1, android.os.Handler] */
    public static C8f4 A00(C191978et c191978et, C191858eh c191858eh) {
        AbstractC192018ex c192008ew;
        if (c191858eh.A06) {
            c192008ew = new C214109e9(new C22940A9k(c191858eh.A02, c191858eh.A03, AnonymousClass001.A0R(c191858eh.A04, "loaded_screen_query"), c191858eh.A05, c191858eh.A00, c191858eh.A01));
        } else {
            String str = c191858eh.A03;
            String A0R = AnonymousClass001.A0R(c191858eh.A04, "loaded_screen_query");
            AbstractC12990ll abstractC12990ll = c191858eh.A02;
            HashMap hashMap = c191858eh.A05;
            boolean z = c191858eh.A08;
            c192008ew = new C192008ew(new C191998ev(abstractC12990ll, str, A0R, hashMap, c191858eh.A00, c191858eh.A01, c191858eh.A07, z));
        }
        final C8f2 c8f2 = new C8f2(c192008ew, new Handler(AbstractC191958er.A01));
        c192008ew.A00 = c8f2;
        final C8f4 c8f4 = new C8f4(c191978et, new C8f3(), c8f2);
        InterfaceC192058f1 interfaceC192058f1 = c8f2.A02;
        if (interfaceC192058f1.CZZ()) {
            C8f2.A00(c8f4, c8f2);
            return c8f4;
        }
        interfaceC192058f1.E4t(new Runnable() { // from class: X.8f6
            @Override // java.lang.Runnable
            public final void run() {
                C8f2.A00(c8f4, c8f2);
            }
        }, "Emitter_subscribe");
        return c8f4;
    }
}
