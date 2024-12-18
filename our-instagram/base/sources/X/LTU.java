package X;

/* loaded from: classes8.dex */
public final class LTU implements MPS {
    public final /* synthetic */ C15370ps A00;
    public final /* synthetic */ C15370ps A01;

    public LTU(C15370ps c15370ps, C15370ps c15370ps2) {
        this.A00 = c15370ps;
        this.A01 = c15370ps2;
    }

    @Override // X.MPS
    public final String B8z() {
        return (String) this.A01.A00;
    }

    @Override // X.MPS
    public final String getTitle() {
        return ((MPS) this.A00.A00).getTitle();
    }
}
