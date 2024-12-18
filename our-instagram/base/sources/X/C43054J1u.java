package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.J1u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43054J1u implements InterfaceC43429JGt {
    public final /* synthetic */ C3KX A00;
    public final /* synthetic */ java.util.Set A01;
    public final /* synthetic */ boolean A02;

    public C43054J1u(C3KX c3kx, java.util.Set set, boolean z) {
        this.A00 = c3kx;
        this.A02 = z;
        this.A01 = set;
    }

    @Override // X.InterfaceC43429JGt
    public final void D0R(Reel reel) {
        C3KX c3kx = this.A00;
        boolean z = this.A02;
        java.util.Set set = this.A01;
        if (set.size() == 1) {
            C3KX.A03(reel, AbstractC25226BEj.A15(set.iterator()), c3kx, "ig_live_co_broadcast_notification_type", z);
        }
    }
}
