package X;

/* renamed from: X.Cy1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29426Cy1 implements InterfaceC58008Pns {
    public final C38321qM A00;
    public final String A01;

    public C29426Cy1(C38321qM c38321qM) {
        this.A00 = c38321qM;
        String id = c38321qM.getId();
        this.A01 = id == null ? "" : id;
    }

    @Override // X.InterfaceC58008Pns
    public final String getId() {
        return this.A01;
    }
}
