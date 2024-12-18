package X;

/* renamed from: X.G5y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36449G5y implements GZ1 {
    public final C1346766r A00;

    public C36449G5y(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 1);
        this.A00 = c1346766r;
    }

    @Override // X.GZ1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C1346766r c1346766r = this.A00;
        c1346766r.A02(AbstractC166997dE.A0a());
        c1346766r.A00();
    }

    @Override // X.GZ1
    public final void onSuccess() {
        C1346766r c1346766r = this.A00;
        c1346766r.A02(AbstractC166997dE.A0b());
        c1346766r.A00();
    }
}
