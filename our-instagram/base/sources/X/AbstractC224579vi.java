package X;

import android.content.Context;

/* renamed from: X.9vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224579vi {
    public static final C23432Aa5 A00(Context context, BBN bbn, Integer num, boolean z) {
        C178017va c178017va = new C178017va("SmartCaptureSelfie");
        C178017va.A00(c178017va, BE1.A05, z);
        C23385AYj A00 = C178267w0.A00(context, c178017va);
        A00.A02((InterfaceC178287w2) new C201438vY());
        C180027ys c180027ys = new C180027ys(A00);
        InterfaceC175067qg interfaceC175067qg = c180027ys.A0e;
        if (!interfaceC175067qg.isConnected()) {
            c180027ys.A01 = 1920;
            c180027ys.A00 = (int) Math.ceil(1920.0f / (Math.max(1920, 1920) / Math.min(1920, 1920)));
        }
        A00.A01(c180027ys, InterfaceC179927yi.A00);
        A00.A01(new C9X3(A00), InterfaceC179867yc.A00);
        A00.A01(new C180177z7(A00), InterfaceC178737wl.A00);
        C178087vh c178087vh = InterfaceC180017yr.A00;
        A00.A01(new C180007yq(A00), c178087vh);
        A00.A01(new C179937yj(A00), InterfaceC179947yk.A00);
        A00.A01(new C179987yo(A00), InterfaceC179997yp.A00);
        if (!c180027ys.A0Q && c180027ys.A0P && interfaceC175067qg.isConnected()) {
            InterfaceC25160BBf interfaceC25160BBf = c180027ys.A0H;
            if (interfaceC25160BBf == null) {
                interfaceC25160BBf = new C209759Pl(c180027ys, 0);
                c180027ys.A0H = interfaceC25160BBf;
            }
            interfaceC175067qg.A9g(interfaceC25160BBf);
        }
        c180027ys.A07 = bbn;
        if (num != null) {
            c180027ys.A0N = num;
            C212549bN c212549bN = c180027ys.A0B;
            if (c212549bN != null) {
                c212549bN.A01 = num;
            }
        }
        InterfaceC175067qg.A00(A00.Aq0(c178087vh));
        return new C23432Aa5(A00);
    }
}
