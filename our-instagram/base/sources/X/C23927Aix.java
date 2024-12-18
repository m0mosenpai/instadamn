package X;

/* renamed from: X.Aix, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23927Aix implements MR6 {
    public final /* synthetic */ C190638cL A00;
    public final /* synthetic */ C190398bx A01;
    public final /* synthetic */ java.util.Set A02;

    @Override // X.MR6
    public final void onFailure() {
    }

    @Override // X.MR6
    public final void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        boolean A1W = AbstractC167007dF.A1W(c2ec);
        this.A01.A1p.put(this.A02, Boolean.valueOf(A1W));
        this.A00.A00(A1W, false);
    }

    @Override // X.MR6
    public final void onSuccessInBackground(C2EC c2ec) {
    }

    public C23927Aix(C190638cL c190638cL, C190398bx c190398bx, java.util.Set set) {
        this.A01 = c190398bx;
        this.A02 = set;
        this.A00 = c190638cL;
    }
}
