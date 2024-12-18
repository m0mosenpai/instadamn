package X;

/* renamed from: X.091, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass091 implements C0OO {
    public final C0LW A00;
    public final C04670Mj A01;

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A0C;
    }

    @Override // X.C0OO
    public final void start() {
        C04670Mj c04670Mj = this.A01;
        if (c04670Mj != null) {
            C04280Ku c04280Ku = c04670Mj.A01;
            this.A00.A09(new C024209q(null), C0M6.CRITICAL_REPORT, this);
            synchronized (c04280Ku.A0A) {
                c04280Ku.A07 = this;
            }
        }
    }

    public AnonymousClass091(C0LW c0lw, C04670Mj c04670Mj) {
        this.A00 = c0lw;
        this.A01 = c04670Mj;
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
