package X;

import android.os.Handler;

/* renamed from: X.XqE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72880XqE {
    public static void A00(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        if (interfaceC176207sd != null) {
            if (handler != null) {
                handler.post(new YGE(interfaceC176207sd));
                return;
            }
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(425));
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(530));
    }

    public static void A01(Handler handler, InterfaceC176207sd interfaceC176207sd, Throwable th) {
        if (interfaceC176207sd != null) {
            if (handler != null) {
                handler.post(new YHA(interfaceC176207sd, th));
                return;
            }
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(425));
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(530));
    }
}
