package X;

import java.util.List;

/* renamed from: X.IvA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42715IvA implements C1X7 {
    public final /* synthetic */ InterfaceC1116050z A00;
    public final /* synthetic */ C111344zx A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C1X7
    public final void DM5(C74283Vj c74283Vj, EnumC73363Qm enumC73363Qm, List list, long j) {
        C14360o3.A0B(enumC73363Qm, 2);
        C111344zx.A01(this.A00, c74283Vj, this.A01, list, j, this.A02);
    }

    @Override // X.C1X7
    public final void DVT(Integer num, List list) {
        C14360o3.A0B(num, 1);
        if (num == C05F.A00) {
            C111344zx c111344zx = this.A01;
            c111344zx.A0A.set(true);
            C111344zx.A07(c111344zx);
        }
    }

    public C42715IvA(InterfaceC1116050z interfaceC1116050z, C111344zx c111344zx, boolean z) {
        this.A01 = c111344zx;
        this.A02 = z;
        this.A00 = interfaceC1116050z;
    }

    @Override // X.C1X7
    public final void DM4(EnumC73363Qm enumC73363Qm, String str) {
        C111344zx c111344zx = this.A01;
        if (C18U.A06(C06090Tz.A05, c111344zx.A04, 36315288519576717L)) {
            C111344zx.A05(this.A00, c111344zx, this.A02);
        } else {
            this.A00.AVi(AbstractC111324zv.A00(2374));
        }
    }
}
