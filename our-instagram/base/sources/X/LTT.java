package X;

/* loaded from: classes8.dex */
public final class LTT implements MPS {
    public final /* synthetic */ C45038JwT A00;

    public LTT(C45038JwT c45038JwT) {
        this.A00 = c45038JwT;
    }

    @Override // X.MPS
    public final String B8z() {
        String str = this.A00.A03;
        if (str != null) {
            return str;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MPS
    public final String getTitle() {
        String str = this.A00.A04;
        if (str == null) {
            return "";
        }
        return str;
    }
}
