package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class XMX extends AtomicReference implements InterfaceC42071wx, InterfaceC41801wU {
    public int A00;
    public InterfaceC136016Dg A01;
    public final int A02;
    public final YOC A03;
    public volatile boolean A04;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (this.A00 == 0) {
            XMW xmw = (XMW) this.A03;
            this.A01.offer(obj);
            xmw.AQN();
            return;
        }
        this.A03.AQN();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        XMW xmw = (XMW) this.A03;
        this.A04 = true;
        xmw.AQN();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        XMW xmw = (XMW) this.A03;
        if (Y4X.A02(th, xmw.A09)) {
            if (xmw.A0A == C05F.A00) {
                xmw.A02.dispose();
            }
            this.A04 = true;
            xmw.AQN();
            return;
        }
        AbstractC142886co.A02(th);
    }

    public XMX(YOC yoc, int i) {
        this.A03 = yoc;
        this.A02 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        InterfaceC137386Kj interfaceC137386Kj;
        if (C6KP.A03(interfaceC41801wU, this)) {
            if (interfaceC41801wU instanceof InterfaceC135996De) {
                InterfaceC136006Df interfaceC136006Df = (InterfaceC136006Df) interfaceC41801wU;
                int EJ7 = interfaceC136006Df.EJ7(3);
                if (EJ7 == 1) {
                    this.A00 = EJ7;
                    this.A01 = interfaceC136006Df;
                    this.A04 = true;
                    XMW xmw = (XMW) this.A03;
                    this.A04 = true;
                    xmw.AQN();
                    return;
                }
                if (EJ7 == 2) {
                    this.A00 = EJ7;
                    interfaceC137386Kj = interfaceC136006Df;
                    this.A01 = interfaceC137386Kj;
                }
            }
            int i = -this.A02;
            if (i < 0) {
                interfaceC137386Kj = new C137416Km(-i);
            } else {
                interfaceC137386Kj = new C207659Gt(i);
            }
            this.A01 = interfaceC137386Kj;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this);
    }
}
