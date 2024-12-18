package X;

/* renamed from: X.GLk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36837GLk implements Runnable {
    public final /* synthetic */ EV0 A00;

    public RunnableC36837GLk(EV0 ev0) {
        this.A00 = ev0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32320ELo c32320ELo = (C32320ELo) this.A00.A01;
        String str = C32320ELo.__redex_internal_original_name;
        String phoneNumber = c32320ELo.A07.getPhoneNumber();
        C35231FgO.A03.A05(c32320ELo.getContext());
        AbstractC25226BEj.A1Q(c32320ELo);
        AbstractC25651Mw.A00(c32320ELo.A02).E4s(new C3HS(c32320ELo.getContext(), c32320ELo.A02.userId, phoneNumber));
    }
}
