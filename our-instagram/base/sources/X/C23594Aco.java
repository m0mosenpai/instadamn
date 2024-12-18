package X;

/* renamed from: X.Aco, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23594Aco implements InterfaceC25166BBm {
    public final /* synthetic */ C215059fh A00;

    public C23594Aco(C215059fh c215059fh) {
        this.A00 = c215059fh;
    }

    @Override // X.InterfaceC25166BBm
    public final void cleanup() {
        C215059fh c215059fh = this.A00;
        C1Df c1Df = c215059fh.A01;
        if (c1Df != null) {
            c1Df.cancel();
        }
        c215059fh.A01 = null;
        c215059fh.A02 = null;
    }
}
