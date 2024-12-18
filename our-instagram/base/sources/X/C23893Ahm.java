package X;

import java.util.List;

/* renamed from: X.Ahm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23893Ahm implements BC2 {
    public final C84B A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        List list;
        C84B c84b;
        C128175qm c128175qm2 = c128175qm;
        if (c128175qm.A0v.isEmpty() && (c84b = this.A00) != null) {
            MXY mxy = new MXY();
            mxy.A06(AbstractC54870OOf.A01(c84b.A05()));
            c128175qm2 = mxy.A01(c128175qm);
        }
        MXY mxy2 = new MXY();
        mxy2.A05(EnumC50651MXr.A03);
        if (!this.A02 && !this.A03) {
            list = this.A01;
        } else {
            list = c128175qm.A0r;
        }
        mxy2.A0m = new MXZ(list);
        C14360o3.A0B(c128175qm2, 0);
        long j = c128175qm2.A01;
        if (j == -1) {
            j = System.currentTimeMillis();
        }
        mxy2.A03(j);
        return mxy2.A01(c128175qm2);
    }

    public C23893Ahm(C84B c84b, List list, boolean z, boolean z2) {
        this.A00 = c84b;
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
    }
}
