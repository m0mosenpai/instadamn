package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Lh9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48741Lh9 implements MSH {
    public final /* synthetic */ KZT A00;

    @Override // X.InterfaceC50463MPr
    public final Reel Blq(AbstractC46458KhI abstractC46458KhI) {
        return null;
    }

    @Override // X.InterfaceC50463MPr
    public final C9BW C1w(String str) {
        return null;
    }

    @Override // X.MSH
    public final C44079Je4 C79(C2EC c2ec) {
        return null;
    }

    @Override // X.MSH
    public final C73743Sc CH0(String str) {
        return null;
    }

    @Override // X.MSH
    public final boolean CKu() {
        return false;
    }

    @Override // X.MSH
    public final boolean CL8(C2EC c2ec) {
        return false;
    }

    @Override // X.MSH
    public final boolean CMD(C2EC c2ec) {
        return false;
    }

    @Override // X.MSH
    public final boolean isLoading() {
        return false;
    }

    public C48741Lh9(KZT kzt) {
        this.A00 = kzt;
    }

    @Override // X.MSH
    public final void ECn() {
        KZT kzt = this.A00;
        if (kzt.A00.isResumed()) {
            MRP BOD = kzt.A05.BOD();
            if (BOD.Eia()) {
                BOD.AV5(kzt.A04, kzt.A06, "manual_refresh");
            }
        }
    }
}
