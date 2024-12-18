package X;

import java.util.List;

/* renamed from: X.OzV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56309OzV implements BC2 {
    public final List A00;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A00;
        if (!C14360o3.A0K(list, c128175qm.A0n)) {
            MXY mxy = new MXY();
            mxy.A09 = MXZ.A00(list);
            return mxy.A01(c128175qm);
        }
        return c128175qm;
    }

    public C56309OzV(List list) {
        this.A00 = list;
    }
}
