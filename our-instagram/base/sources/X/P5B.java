package X;

/* loaded from: classes9.dex */
public final class P5B implements InterfaceC57960Pn6 {
    public final C38321qM A00;
    public final String A01;

    @Override // X.InterfaceC57960Pn6
    public final String getId() {
        return this.A01;
    }

    public P5B(C38321qM c38321qM) {
        this.A00 = c38321qM;
        String id = c38321qM.getId();
        if (id != null) {
            this.A01 = id;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
