package X;

/* renamed from: X.Bwm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27063Bwm extends C4F4 {
    public final CQ9 A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C27063Bwm c27063Bwm = (C27063Bwm) obj;
        if (c27063Bwm != null) {
            CQ9 cq9 = this.A00;
            int i = cq9.A00;
            CQ9 cq92 = c27063Bwm.A00;
            if (i == cq92.A00 && C14360o3.A0K(cq9.A01, cq92.A01)) {
                return true;
            }
        }
        return false;
    }

    public C27063Bwm(CQ9 cq9) {
        this.A00 = cq9;
    }
}
