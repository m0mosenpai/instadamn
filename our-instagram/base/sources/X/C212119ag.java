package X;

/* renamed from: X.9ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212119ag extends C78543fM {
    public C2WG A00;
    public int[] A01;
    public boolean[] A02;

    @Override // X.C78543fM
    public final void A0A(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        C2WG c2wg = this.A00;
        if (c2wg == null) {
            c2wg = new C2WG();
            this.A00 = c2wg;
        }
        c2wg.A03(enumC77763e0, f);
        boolean[] zArr = this.A02;
        if (zArr == null) {
            zArr = new boolean[9];
            this.A02 = zArr;
        }
        zArr[enumC77763e0.A00] = true;
    }

    @Override // X.C78543fM
    public final void A0B(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        int[] iArr = this.A01;
        if (iArr == null) {
            iArr = new int[4];
            this.A01 = iArr;
        }
        C2WK.A03.A02(enumC77763e0, iArr, (int) f);
    }

    @Override // X.C78543fM, X.InterfaceC50942Vq
    public final void E3E(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        float f = i;
        C2WG c2wg = this.A00;
        if (c2wg == null) {
            c2wg = new C2WG();
            this.A00 = c2wg;
        }
        c2wg.A03(enumC77763e0, f);
        boolean[] zArr = this.A02;
        if (zArr != null) {
            zArr[enumC77763e0.A00] = false;
        }
    }
}
