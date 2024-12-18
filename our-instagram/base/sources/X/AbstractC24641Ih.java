package X;

/* renamed from: X.1Ih, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24641Ih {
    public static C0Xc A00;
    public static InterfaceC24811Iz A01;
    public static InterfaceC24811Iz A02;
    public static InterfaceC24811Iz A03;
    public static C24651Ii A04;
    public static boolean A05;
    public static C1GL A06;

    public static C1GL A00() {
        C1GL c1gl = A06;
        if (c1gl == null) {
            final InterfaceC14020nS A002 = C14120nc.A00();
            C1GL c1gl2 = new C1GL(A002) { // from class: X.5fz
                public final InterfaceC14020nS A00;

                @Override // X.C1GL
                public final void schedule(C11R c11r) {
                    c11r.getClass();
                    int runnableId = c11r.getRunnableId();
                    InterfaceC14020nS interfaceC14020nS = this.A00;
                    c11r.onStart();
                    interfaceC14020nS.ATO(new C122085g0(c11r, runnableId, 3, false, false));
                }

                {
                    this.A00 = A002;
                }

                @Override // X.C1GL
                public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
                    c11r.getClass();
                    InterfaceC14020nS interfaceC14020nS = this.A00;
                    c11r.onStart();
                    interfaceC14020nS.ATO(new C122085g0(c11r, i, i2, z, z2));
                }
            };
            A06 = c1gl2;
            return c1gl2;
        }
        return c1gl;
    }
}
