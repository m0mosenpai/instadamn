package X;

import android.os.Handler;

/* loaded from: classes12.dex */
public final class YI3 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Y9T A01;
    public final /* synthetic */ InterfaceC176207sd A02;

    public YI3(Handler handler, Y9T y9t, InterfaceC176207sd interfaceC176207sd) {
        this.A01 = y9t;
        this.A02 = interfaceC176207sd;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y9T y9t = this.A01;
        InterfaceC176207sd interfaceC176207sd = this.A02;
        Handler handler = this.A00;
        if (y9t.A0B != C05F.A01) {
            y9t.A04.A01("stAEe");
            AbstractC72880XqE.A01(handler, interfaceC176207sd, AbstractC31175DnJ.A0V("prepare() must be called before starting audio encoding. Current state is: ", AbstractC72532Xfl.A00(y9t.A0B)));
            return;
        }
        try {
            C0fT.A05(y9t.A01, -1339699077);
            y9t.A0B = C05F.A0C;
            y9t.A04.A01("stAEs");
            AbstractC72880XqE.A00(handler, interfaceC176207sd);
        } catch (Exception e) {
            y9t.A04.A01("stAEe1");
            AbstractC72880XqE.A01(handler, interfaceC176207sd, e);
        }
    }
}
