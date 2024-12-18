package X;

import android.os.Handler;

/* renamed from: X.AYw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23397AYw implements InterfaceC176157sY {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ C177547uo A02;
    public final /* synthetic */ C176047sN A03;
    public final /* synthetic */ InterfaceC176157sY A04;

    public C23397AYw(Handler handler, Handler handler2, C177547uo c177547uo, C176047sN c176047sN, InterfaceC176157sY interfaceC176157sY) {
        this.A03 = c176047sN;
        this.A02 = c177547uo;
        this.A00 = handler;
        this.A04 = interfaceC176157sY;
        this.A01 = handler2;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        this.A04.DE8(abstractC223559ty);
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        C176047sN c176047sN = this.A03;
        C175887s2 c175887s2 = c176047sN.A05;
        C177547uo c177547uo = this.A02;
        InterfaceC176077sQ interfaceC176077sQ = c176047sN.A04;
        Handler handler = this.A00;
        InterfaceC176157sY interfaceC176157sY = this.A04;
        Handler handler2 = this.A01;
        c175887s2.A0I.A05.A01("pr");
        if (!c175887s2.A0B.post(new RunnableC24877Azc(handler, handler2, interfaceC176077sQ, c177547uo, c175887s2, interfaceC176157sY))) {
            handler2.post(new RunnableC24534Atr(c175887s2, interfaceC176157sY));
        }
    }
}
