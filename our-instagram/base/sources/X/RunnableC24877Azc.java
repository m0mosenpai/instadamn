package X;

import android.os.Handler;

/* renamed from: X.Azc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24877Azc implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ InterfaceC176077sQ A02;
    public final /* synthetic */ C177547uo A03;
    public final /* synthetic */ C175887s2 A04;
    public final /* synthetic */ InterfaceC176157sY A05;

    public RunnableC24877Azc(Handler handler, Handler handler2, InterfaceC176077sQ interfaceC176077sQ, C177547uo c177547uo, C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY) {
        this.A04 = c175887s2;
        this.A03 = c177547uo;
        this.A02 = interfaceC176077sQ;
        this.A00 = handler;
        this.A05 = interfaceC176157sY;
        this.A01 = handler2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C175887s2 c175887s2 = this.A04;
        C177547uo c177547uo = this.A03;
        InterfaceC176077sQ interfaceC176077sQ = this.A02;
        Handler handler = this.A00;
        InterfaceC176157sY interfaceC176157sY = this.A05;
        Handler handler2 = this.A01;
        c175887s2.A0I.A05.A01("prAS");
        InterfaceC25222BDw interfaceC25222BDw = c175887s2.A03;
        if (interfaceC25222BDw != null && c175887s2.A07) {
            interfaceC25222BDw.prepareRecorder(c177547uo, interfaceC176077sQ, handler, new C23396AYv(handler2, c175887s2, interfaceC176157sY, 0), handler2);
        } else {
            C175887s2.A01(handler2, new C212399b8("Audio pipeline should not be null or not resumed"), interfaceC176157sY, "prepareRecorder");
        }
    }
}
