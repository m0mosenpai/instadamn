package X;

import java.util.List;

/* renamed from: X.OzY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56311OzY implements BC2 {
    public final C9JS A00;
    public final boolean A01;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        MXY mxy;
        List list = c128175qm.A0v;
        boolean z = this.A01;
        C9JS c9js = this.A00;
        if (z) {
            List A0c = AbstractC001800i.A0c(AbstractC54870OOf.A01(list), 1);
            mxy = new MXY();
            mxy.A0j = MXZ.A00(c9js);
            mxy.A06(A0c);
        } else {
            mxy = new MXY();
            mxy.A0j = MXZ.A00(c9js);
        }
        return mxy.A01(c128175qm);
    }

    public C56311OzY(C9JS c9js, boolean z) {
        this.A01 = z;
        this.A00 = c9js;
    }
}
