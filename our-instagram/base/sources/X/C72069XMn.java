package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.XMn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72069XMn implements C62J {
    public final long A00;
    public final long A01;
    public final int A02;
    public final int A03;
    public final InterfaceC30898DiB A04;

    @Override // X.C62J
    public final /* synthetic */ float B2D(float f, float f2, float f3) {
        return CEi(f, f2, f3, Azp(f, f2, f3));
    }

    @Override // X.C62J
    public final float CEi(float f, float f2, float f3, long j) {
        long A06 = C17s.A06(j - this.A00, 0L, this.A01);
        if (A06 < 0) {
            return 0.0f;
        }
        if (A06 == 0) {
            return f3;
        }
        return (CEX(f, f2, f3, A06) - CEX(f, f2, f3, A06 - 1000000)) * 1000.0f;
    }

    @Override // X.C62J
    public final long Azp(float f, float f2, float f3) {
        return (this.A02 + this.A03) * 1000000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r1 > 1.0f) goto L9;
     */
    @Override // X.C62J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float CEX(float r9, float r10, float r11, long r12) {
        /*
            r8 = this;
            long r0 = r8.A00
            long r2 = r12 - r0
            long r6 = r8.A01
            r4 = 0
            long r2 = X.C17s.A06(r2, r4, r6)
            int r0 = r8.A03
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L2d
            r1 = 1065353216(0x3f800000, float:1.0)
        L14:
            X.DiB r2 = r8.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L28
            r1 = 0
        L1c:
            r4 = r1
        L1d:
            float r1 = r2.F8E(r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r9 = r9 * r0
            float r10 = r10 * r1
            float r9 = r9 + r10
            return r9
        L28:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1c
            goto L1d
        L2d:
            float r1 = (float) r2
            float r0 = (float) r6
            float r1 = r1 / r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72069XMn.CEX(float, float, float, long):float");
    }

    @Override // X.C5Y6
    /* renamed from: FDZ */
    public final /* bridge */ /* synthetic */ C62F FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new C62L(new C72068XMm(this));
    }

    public C72069XMn(InterfaceC30898DiB interfaceC30898DiB, int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = interfaceC30898DiB;
        this.A01 = i * 1000000;
        this.A00 = i2 * 1000000;
    }

    public C72069XMn() {
        this(AbstractC25328BIx.A01, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 0);
    }
}
