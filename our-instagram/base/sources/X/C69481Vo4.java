package X;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: X.Vo4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69481Vo4 {
    public final C69372VmI A00;
    public final C69372VmI A01;
    public final C1V7 A02;
    public final VY7 A03;
    public final C1WD A04;
    public final Vh0 A05;
    public final VMS A06;
    public final C69706Vu1 A07;
    public final Context A08;
    public final C1V7 A09;
    public final C1V7 A0A;
    public final C1V7 A0B;
    public final C1KI A0C;
    public final VY6 A0D;
    public final OTE A0E;
    public final java.util.Set A0F;
    public final java.util.Set A0G;
    public final java.util.Set A0H;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.WUp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.VY7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.VY6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.VJu, java.lang.Object] */
    public C69481Vo4(C69057Vgy c69057Vgy) {
        VY6 vy6;
        VY7 vy7;
        C70412WUp c70412WUp;
        C1VI.A00();
        this.A05 = new Vh0(c69057Vgy.A02);
        Context context = c69057Vgy.A01;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            this.A09 = new C70410WUn((ActivityManager) systemService);
            synchronized (VY6.class) {
                VY6 vy62 = VY6.A00;
                vy6 = vy62;
                if (vy62 == null) {
                    ?? obj = new Object();
                    VY6.A00 = obj;
                    vy6 = obj;
                }
            }
            this.A0D = vy6;
            this.A08 = context;
            synchronized (VY7.class) {
                VY7 vy72 = VY7.A00;
                vy7 = vy72;
                if (vy72 == null) {
                    ?? obj2 = new Object();
                    VY7.A00 = obj2;
                    vy7 = obj2;
                }
            }
            this.A03 = vy7;
            C1V7 c1v7 = C1VY.A00;
            C14360o3.A08(c1v7);
            this.A0A = c1v7;
            C1V7 c1v72 = C1VY.A01;
            C14360o3.A08(c1v72);
            this.A0B = c1v72;
            C1VI.A00();
            this.A00 = new C69372VmI(new C69051Vgs(context));
            synchronized (C70412WUp.class) {
                C70412WUp c70412WUp2 = C70412WUp.A00;
                c70412WUp = c70412WUp2;
                if (c70412WUp2 == null) {
                    ?? obj3 = new Object();
                    C70412WUp.A00 = obj3;
                    c70412WUp = obj3;
                }
            }
            this.A0C = c70412WUp;
            C1VI.A00();
            this.A0E = new OTE(30000);
            C69706Vu1 c69706Vu1 = new C69706Vu1(new C69404Vmo());
            this.A07 = c69706Vu1;
            C16910sj c16910sj = C16910sj.A00;
            this.A0H = c16910sj;
            this.A0G = c16910sj;
            this.A0F = c16910sj;
            this.A01 = this.A00;
            this.A04 = new C1WC(c69706Vu1.A04.A01.A00);
            this.A06 = c69057Vgy.A00;
            this.A02 = new C70409WUm(new Object(), this);
            C1VI.A00();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
