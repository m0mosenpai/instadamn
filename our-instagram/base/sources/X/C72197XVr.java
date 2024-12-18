package X;

/* renamed from: X.XVr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72197XVr extends AbstractC99974eJ {
    public final C15O A00;
    public final boolean A01;

    @Override // X.AbstractC219814y
    public final void A04() {
        if (this.A01) {
            C15O.A01(false);
        } else {
            C15O.A00(false);
        }
    }

    @Override // X.AbstractC219814y
    public final boolean A05() {
        if (this.A01) {
            C15O.A01(true);
            return true;
        }
        C15O.A00(true);
        return true;
    }

    public C72197XVr(C15O c15o, int i, boolean z) {
        super(i);
        this.A00 = c15o;
        this.A01 = z;
    }
}
