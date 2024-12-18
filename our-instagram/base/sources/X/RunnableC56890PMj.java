package X;

/* renamed from: X.PMj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56890PMj implements Runnable {
    public final /* synthetic */ OM7 A00;

    public RunnableC56890PMj(OM7 om7) {
        this.A00 = om7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OM7 om7 = this.A00;
        C9KJ c9kj = om7.A03;
        C47Z A03 = C25A.A00(om7.A07).A03(om7.A08.E3z());
        if (A03 != null) {
            c9kj.A08(A03, 0);
            om7.A00().setVisibility(0);
            AbstractC31172DnG.A1E(om7.A05.getResources(), om7.A00(), 2131976620);
            AbstractC010103p.A0B(om7.A00(), new C50827MdK(om7, 0));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
