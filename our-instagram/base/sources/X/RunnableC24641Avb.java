package X;

/* renamed from: X.Avb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24641Avb implements Runnable {
    public final /* synthetic */ C23790Ag1 A00;
    public final /* synthetic */ C183978Ee A01;

    public RunnableC24641Avb(C23790Ag1 c23790Ag1, C183978Ee c183978Ee) {
        this.A00 = c23790Ag1;
        this.A01 = c183978Ee;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23790Ag1 c23790Ag1 = this.A00;
        c23790Ag1.A09.A02.A08(C05F.A01);
        C183978Ee c183978Ee = this.A01;
        c183978Ee.A13 = true;
        boolean Cae = c23790Ag1.A0D.Cae();
        C8XV c8xv = c23790Ag1.A08;
        if (Cae) {
            c8xv.A0D.A02.A09(AbstractC166987dD.A1J(new C198308pf(c183978Ee)));
            AbstractC167007dF.A0J().post(new RunnableC24345Aqo(c8xv));
        } else {
            c8xv.A04(c183978Ee);
        }
        AbstractC166997dE.A1L(c23790Ag1.A07.A01(), true);
        AbstractC167027dH.A17(c23790Ag1.A0F);
    }
}
