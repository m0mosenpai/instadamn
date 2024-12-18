package X;

import java.util.List;

/* renamed from: X.WxY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71626WxY implements Runnable {
    public final /* synthetic */ InterfaceC138736Qd A00;
    public final /* synthetic */ C6PT A01;
    public final /* synthetic */ C5M1 A02;
    public final /* synthetic */ C5M4 A03;
    public final /* synthetic */ C130005u5 A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ List A06;

    public RunnableC71626WxY(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, C5M1 c5m1, C5M4 c5m4, C130005u5 c130005u5, Object obj, List list) {
        this.A04 = c130005u5;
        this.A06 = list;
        this.A05 = obj;
        this.A01 = c6pt;
        this.A00 = interfaceC138736Qd;
        this.A02 = c5m1;
        this.A03 = c5m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C130005u5 c130005u5 = this.A04;
        List list = this.A06;
        Object obj = this.A05;
        c130005u5.A00(this.A00, this.A01, this.A02, this.A03, obj, list);
    }
}
