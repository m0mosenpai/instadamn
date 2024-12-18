package X;

/* renamed from: X.1Ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26561Ql implements InterfaceC25601Mq {
    public final /* synthetic */ C1OL A00;

    public C26561Ql(C1OL c1ol) {
        this.A00 = c1ol;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        final C26461Qb c26461Qb = (C26461Qb) obj;
        C14360o3.A0B(c26461Qb, 0);
        C1OL c1ol = this.A00;
        if (c1ol != null) {
            c1ol.A01.add(new Runnable() { // from class: X.1Qm
                @Override // java.lang.Runnable
                public final void run() {
                    C26461Qb.this.A00();
                }
            });
        }
        return C23311Bt.A00().A01(c26461Qb);
    }
}
