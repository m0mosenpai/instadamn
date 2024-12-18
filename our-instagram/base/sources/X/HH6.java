package X;

/* loaded from: classes7.dex */
public final class HH6 extends AbstractC60592pi {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C6T7 A01;
    public final /* synthetic */ C114665Fw A02;

    public HH6(C62862tP c62862tP, C6T7 c6t7, C114665Fw c114665Fw) {
        this.A01 = c6t7;
        this.A02 = c114665Fw;
        this.A00 = c62862tP;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01.A03();
        this.A02.A00 = null;
        this.A00.A06(this);
    }
}
