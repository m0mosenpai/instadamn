package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.LvR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49572LvR implements InterfaceC140616Xp {
    public final /* synthetic */ C47777L8c A00;
    public final /* synthetic */ C7KE A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ InterfaceC42241xE A03;

    public C49572LvR(C47777L8c c47777L8c, C7KE c7ke, Reel reel, InterfaceC42241xE interfaceC42241xE) {
        this.A00 = c47777L8c;
        this.A01 = c7ke;
        this.A03 = interfaceC42241xE;
        this.A02 = reel;
    }

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        C006802i.A0p.markerEnd(18941461, (short) 3);
        C47777L8c c47777L8c = this.A00;
        if (c47777L8c != null) {
            c47777L8c.A00();
        }
        this.A03.accept(this.A02);
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        C47777L8c c47777L8c = this.A00;
        if (c47777L8c != null) {
            c47777L8c.A00();
        }
        this.A03.accept(this.A02);
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        C006802i.A0p.markerEnd(18941461, (short) 4);
        C47777L8c c47777L8c = this.A00;
        if (c47777L8c != null) {
            c47777L8c.A00();
        }
    }

    @Override // X.InterfaceC140616Xp
    public final void onStart() {
        C47777L8c c47777L8c = this.A00;
        if (c47777L8c != null) {
            c47777L8c.A01();
        }
    }
}
