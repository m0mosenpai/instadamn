package X;

/* renamed from: X.JTs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43683JTs implements InterfaceC37159GYw {
    public final /* synthetic */ C162307Os A00;

    public C43683JTs(C162307Os c162307Os) {
        this.A00 = c162307Os;
    }

    @Override // X.InterfaceC37159GYw
    public final void Dpu(AbstractC46524KiP abstractC46524KiP) {
        C11T.A02(new M43(this.A00, abstractC46524KiP));
    }

    @Override // X.InterfaceC37159GYw
    public final void onFailure() {
        C162307Os.A01(this.A00);
    }
}
