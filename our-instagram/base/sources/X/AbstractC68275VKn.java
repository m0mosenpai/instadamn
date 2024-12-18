package X;

import android.content.Context;

/* renamed from: X.VKn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68275VKn {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A00.get(0));
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            if (A00 == null) {
                InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) C66224U4u.A01(context);
                if (interfaceC72040XGi != null) {
                    interfaceC72040XGi.FAK(null);
                } else {
                    throw new IllegalStateException("Cannot update back button override without an existing bottom sheet.");
                }
            } else {
                C71172WpA c71172WpA = new C71172WpA(c6fq, A00, 0);
                InterfaceC72040XGi interfaceC72040XGi2 = (InterfaceC72040XGi) C66224U4u.A01(context);
                if (interfaceC72040XGi2 != null) {
                    interfaceC72040XGi2.FAK(c71172WpA);
                    return null;
                }
                throw new IllegalStateException("Cannot update back button override without an existing bottom sheet.");
            }
        }
        return null;
    }
}
