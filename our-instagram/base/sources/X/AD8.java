package X;

import android.os.Handler;

/* loaded from: classes4.dex */
public abstract class AD8 {
    public static void A00(Handler handler, AbstractC223559ty abstractC223559ty, InterfaceC176157sY interfaceC176157sY) {
        if (interfaceC176157sY != null) {
            if (handler != null) {
                handler.post(new RunnableC24556AuD(abstractC223559ty, interfaceC176157sY));
                return;
            }
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(425));
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(530));
    }

    public static void A01(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        if (interfaceC176157sY != null) {
            if (handler != null) {
                handler.post(new RunnableC24272Apd(interfaceC176157sY));
                return;
            }
            throw AbstractC166987dD.A12(AbstractC111324zv.A00(425));
        }
        throw AbstractC166987dD.A12(AbstractC111324zv.A00(530));
    }
}
