package X;

/* renamed from: X.HbU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39442HbU extends JXK {
    public final int A00;
    public final Object A01;

    public C39442HbU(INQ inq, int i) {
        this.A00 = i;
        this.A01 = inq;
    }

    @Override // X.JXK, X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        int i = this.A00;
        JGX jgx = ((INQ) this.A01).A05;
        if (i != 0) {
            jgx.E04(null, (C105824pt) c4s7.A03);
        } else {
            jgx.E04((C38321qM) c4s7.A03, null);
        }
    }
}
