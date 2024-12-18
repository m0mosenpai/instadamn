package X;

import android.content.Context;

/* renamed from: X.VmI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69372VmI {
    public final Context A00;
    public final VY1 A01;
    public final VY2 A02;
    public final VMA A03;
    public final C1MZ A04;
    public final C1V7 A05;
    public final String A06;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.WUf] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.VY2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.VY1, java.lang.Object] */
    public C69372VmI(C69051Vgs c69051Vgs) {
        VY1 vy1;
        VY2 vy2;
        C70402WUf c70402WUf;
        this.A00 = c69051Vgs.A02;
        C1V7 c1v7 = c69051Vgs.A01;
        if (c1v7 == null) {
            c1v7 = new C70407WUk(this);
            c69051Vgs.A01 = c1v7;
        }
        this.A06 = "image_cache";
        c1v7.getClass();
        this.A05 = c1v7;
        this.A03 = c69051Vgs.A00;
        synchronized (VY1.class) {
            VY1 vy12 = VY1.A00;
            vy1 = vy12;
            if (vy12 == null) {
                ?? obj = new Object();
                VY1.A00 = obj;
                vy1 = obj;
            }
        }
        this.A01 = vy1;
        synchronized (VY2.class) {
            VY2 vy22 = VY2.A00;
            vy2 = vy22;
            if (vy22 == null) {
                ?? obj2 = new Object();
                VY2.A00 = obj2;
                vy2 = obj2;
            }
        }
        this.A02 = vy2;
        synchronized (C70402WUf.class) {
            C70402WUf c70402WUf2 = C70402WUf.A00;
            c70402WUf = c70402WUf2;
            if (c70402WUf2 == null) {
                ?? obj3 = new Object();
                C70402WUf.A00 = obj3;
                c70402WUf = obj3;
            }
        }
        this.A04 = c70402WUf;
    }
}
