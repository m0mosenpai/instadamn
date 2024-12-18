package X;

import java.util.List;

/* renamed from: X.WxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71627WxZ implements Runnable {
    public final /* synthetic */ InterfaceC138736Qd A00;
    public final /* synthetic */ C6PT A01;
    public final /* synthetic */ C5M1 A02;
    public final /* synthetic */ C5M4 A03;
    public final /* synthetic */ C130005u5 A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ List A06;

    public RunnableC71627WxZ(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, C5M1 c5m1, C5M4 c5m4, C130005u5 c130005u5, Object obj, List list) {
        this.A02 = c5m1;
        this.A01 = c6pt;
        this.A00 = interfaceC138736Qd;
        this.A04 = c130005u5;
        this.A06 = list;
        this.A05 = obj;
        this.A03 = c5m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C5M1 c5m1 = this.A02;
            C6PT c6pt = this.A01;
            InterfaceC138736Qd interfaceC138736Qd = this.A00;
            c5m1.AV8(interfaceC138736Qd, c6pt, null, true);
            C130005u5 c130005u5 = this.A04;
            List list = this.A06;
            C11T.A02(new RunnableC71260Wqp(new RunnableC71626WxY(interfaceC138736Qd, c6pt, c5m1, this.A03, c130005u5, this.A05, list)));
        } catch (C902840n e) {
            C11T.A02(new RunnableC71260Wqp(new RunnableC71543Wvs(this.A01, e, this.A02)));
        }
    }
}
