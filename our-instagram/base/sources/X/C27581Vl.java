package X;

import java.util.concurrent.Executor;

/* renamed from: X.1Vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27581Vl implements InterfaceC27591Vm {
    public final C1WN A00;
    public final C27711Vz A01;
    public final C27651Vs A02;
    public final C27641Vr A03;

    @Override // X.InterfaceC27591Vm
    public final C27641Vr AqA() {
        return this.A03;
    }

    @Override // X.InterfaceC27591Vm
    public final C1WN Arf() {
        return this.A00;
    }

    @Override // X.InterfaceC27591Vm
    public final C27651Vs BGl() {
        return this.A02;
    }

    @Override // X.InterfaceC27591Vm
    public final C27711Vz Bfa() {
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Vp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Vz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1WA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1W8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.1W8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.VMP] */
    public C27581Vl(C25761Ni c25761Ni, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Executor A00;
        C1WN c1wm;
        Executor A002;
        C1VI.A00();
        C27641Vr c27641Vr = new C27641Vr(new Object(), z, z2, z7);
        this.A03 = c27641Vr;
        C1VI.A00();
        C27651Vs c27651Vs = new C27651Vs(c25761Ni, z4, z6, z7);
        this.A02 = c27651Vs;
        C1VI.A00();
        this.A01 = new Object();
        C1VI.A00();
        if (z5) {
            W1P w1p = new W1P(new C70429WVh(new Object(), new C1W9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7)));
            if (z3) {
                A002 = new ExecutorC14110nb(1008224327);
            } else {
                A002 = C1W2.A00();
            }
            C14360o3.A0A(A002);
            C1W2 A003 = C1W2.A00();
            c1wm = new C70426WVe(new Object(), w1p, new Object(), c27651Vs, c27641Vr, A002, A003);
        } else {
            C1W2 A004 = C1W2.A00();
            if (z3) {
                A00 = new ExecutorC14110nb(1008224327);
            } else {
                A00 = C1W2.A00();
            }
            C14360o3.A0A(A00);
            c1wm = new C1WM(new Object(), new C1W9(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7), c27651Vs, c27641Vr, A004, A00);
        }
        this.A00 = c1wm;
    }
}
