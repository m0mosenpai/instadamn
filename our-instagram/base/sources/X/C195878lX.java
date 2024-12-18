package X;

/* renamed from: X.8lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195878lX extends C81E {
    public C179427xs A00;
    public C179427xs A01;
    public final C178747wm A02;
    public final boolean A03;

    public C195878lX(C178747wm c178747wm, boolean z) {
        super(null);
        this.A02 = c178747wm;
        this.A03 = z;
    }

    public static InterfaceC179467xw A00(InterfaceC180227zC interfaceC180227zC, C178907x2 c178907x2, InterfaceC179467xw interfaceC179467xw, AbstractC179397xp abstractC179397xp, C195878lX c195878lX, Integer num, Integer num2, int i) {
        int i2;
        int i3;
        C179407xq CGV = interfaceC179467xw.CGV();
        if (CGV == null) {
            c195878lX.A02.A00(EnumC200658u8.A0n);
            return interfaceC179467xw;
        }
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = CGV.A01;
        }
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = CGV.A00;
        }
        C179427xs c179427xs = c195878lX.A00;
        if (c179427xs == null) {
            C178747wm c178747wm = c195878lX.A02;
            C179387xo c179387xo = new C179387xo();
            if (abstractC179397xp == null) {
                abstractC179397xp = new C179417xr();
            }
            C179427xs c179427xs2 = new C179427xs(c178747wm, c179387xo, abstractC179397xp, false);
            c195878lX.A00 = c179427xs2;
            c179427xs2.A03(i2, i3, interfaceC179467xw.AxI());
            c195878lX.A00.ACv(interfaceC180227zC);
        } else {
            c179427xs.A03(i2, i3, interfaceC179467xw.AxI());
        }
        if (num != null || num2 != null) {
            c195878lX.A00.A03 = true;
        }
        if (i != 0) {
            c195878lX.A00.A0A.A00 = i;
        }
        c195878lX.A02().A00(c178907x2.A01(), interfaceC179467xw, c195878lX.A00);
        return c195878lX.A00.A0A;
    }
}
