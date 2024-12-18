package X;

/* renamed from: X.AkK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23985AkK implements AnonymousClass876 {
    public final /* synthetic */ C38321qM A00;

    public C23985AkK(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }

    @Override // X.AnonymousClass876
    public final int BVm() {
        int A1C = (int) this.A00.A1C();
        if (A1C > 15000) {
            return 15000;
        }
        return A1C;
    }

    @Override // X.AnonymousClass876
    public final void EZO(int i) {
        AbstractC12120kG.A07("MusicPostCaptureSyncControllerFactory", "Music in remixes cannot change duration", null);
    }
}
