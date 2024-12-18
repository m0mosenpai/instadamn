package X;

/* renamed from: X.LxR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49696LxR implements InterfaceC31002Dk1 {
    public final /* synthetic */ C159737El A00;

    @Override // X.InterfaceC31002Dk1
    public final void onFailure(Throwable th) {
    }

    public C49696LxR(C159737El c159737El) {
        this.A00 = c159737El;
    }

    @Override // X.InterfaceC31002Dk1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CW3 cw3 = (CW3) obj;
        if (cw3.A00.equals(C05F.A0C)) {
            this.A00.A1T(cw3.A03);
        }
        this.A00.A1Q(EnumC160197Gf.A03);
    }
}
