package X;

/* renamed from: X.SwA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63935SwA implements InterfaceC65339TiK {
    public final /* synthetic */ C62614SIw A00;

    public C63935SwA(C62614SIw c62614SIw) {
        this.A00 = c62614SIw;
    }

    @Override // X.InterfaceC65339TiK
    public final void D3L(C63193Sev c63193Sev) {
        C62614SIw c62614SIw = this.A00;
        InterfaceC172727mi interfaceC172727mi = c62614SIw.A05;
        InterfaceC172717mh interfaceC172717mh = c62614SIw.A04;
        c63193Sev.A03(c62614SIw.A01, c62614SIw.A02, interfaceC172717mh, interfaceC172727mi);
        Q5I q5i = c62614SIw.A00;
        if (q5i != null && q5i.isShowing()) {
            Q5I q5i2 = c62614SIw.A00;
            if (q5i2 != null) {
                q5i2.dismiss();
            }
            c62614SIw.A00 = null;
        }
    }
}
