package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.7xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC179127xO {
    public static C179107xM A00(Context context, Handler handler, InterfaceC179147xQ interfaceC179147xQ, C178747wm c178747wm, InterfaceC178407wE interfaceC178407wE, InterfaceC178297w3 interfaceC178297w3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        InterfaceC179147xQ interfaceC179147xQ2 = interfaceC179147xQ;
        C178747wm c178747wm2 = c178747wm;
        if (c178747wm == null) {
            c178747wm2 = new C178747wm();
        }
        Handler handler2 = null;
        if (!z7) {
            handler2 = handler;
            if (handler == null) {
                handler2 = interfaceC178297w3.BAu("Lite-SurfacePipe-Thread");
                C14360o3.A07(handler2);
            }
        }
        Handler BAu = interfaceC178297w3.BAu("Lite-CPU-Frames-Thread");
        C14360o3.A07(BAu);
        if (interfaceC179147xQ == null) {
            interfaceC179147xQ2 = C179137xP.A00;
        }
        return new C179107xM(context, handler2, BAu, interfaceC179147xQ2, c178747wm2, interfaceC178407wE, z5, z, z2, z8, z4, z3, z6);
    }
}
