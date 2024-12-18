package X;

/* loaded from: classes6.dex */
public final class Ege extends C32527EUd {
    public AbstractC10360h2 A00;

    @Override // X.C32527EUd, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(35090361);
        super.onFinish();
        C0SG c0sg = (C0SG) this.A00.A0Q("ProgressDialog");
        if (c0sg != null) {
            c0sg.A08();
        }
        C0f9.A0A(651220930, A03);
    }

    @Override // X.C32527EUd, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2096236740);
        super.onStart();
        AbstractC10360h2 abstractC10360h2 = this.A00;
        if (abstractC10360h2.A0Q("ProgressDialog") == null) {
            new C67858Uzp().A0G(new C14240no(abstractC10360h2), "ProgressDialog", true);
        }
        C0f9.A0A(1944442239, A03);
    }
}
