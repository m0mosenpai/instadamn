package X;

/* renamed from: X.9R8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R8 implements Runnable {
    public final /* synthetic */ C210059Qt A00;
    public final /* synthetic */ boolean A01;

    public C9R8(C210059Qt c210059Qt, boolean z) {
        this.A00 = c210059Qt;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9RA c9ra = this.A00.A04;
        boolean z = this.A01;
        InterfaceC25222BDw interfaceC25222BDw = c9ra.A00.A03;
        if (interfaceC25222BDw != null) {
            int i = 2;
            if (z) {
                i = 1;
            }
            interfaceC25222BDw.updateOutputRouteState(i);
        }
    }
}
