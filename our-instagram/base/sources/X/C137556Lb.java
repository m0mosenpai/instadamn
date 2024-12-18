package X;

/* renamed from: X.6Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137556Lb extends C58J implements InterfaceC113445Ag, InterfaceC1129358c {
    public float A00;
    public long A01;
    public long A02;
    public C6L5 A03;
    public AbstractC119385av A04;
    public C5AH A05;
    public C5AH A06;
    public AnonymousClass583 A07;

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        C60Y c60y;
        C5AH c5ah = this.A06;
        if (c5ah == C5AF.A00) {
            long j = this.A01;
            if (j != C1132359l.A08) {
                interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 3, j, 0L, C62U.A00(interfaceC1129057z.Bxc(), 0L));
            }
            C6L5 c6l5 = this.A03;
            if (c6l5 != null) {
                interfaceC1129057z.AR0(c6l5, null, C119815bf.A00, this.A00, 3, 0L, C62U.A00(interfaceC1129057z.Bxc(), 0L));
            }
        } else {
            ?? obj = new Object();
            if (interfaceC1129057z.Bxc() == this.A02 && interfaceC1129057z.getLayoutDirection() == this.A07 && C14360o3.A0K(this.A05, c5ah)) {
                AbstractC119385av abstractC119385av = this.A04;
                C14360o3.A0A(abstractC119385av);
                obj.A00 = abstractC119385av;
            } else {
                AbstractC137676Lo.A00(this, new C9FP(0, (Object) obj, this, interfaceC1129057z));
            }
            Object obj2 = obj.A00;
            this.A04 = (AbstractC119385av) obj2;
            this.A02 = interfaceC1129057z.Bxc();
            this.A07 = interfaceC1129057z.getLayoutDirection();
            this.A05 = this.A06;
            C14360o3.A0A(obj2);
            AbstractC119385av abstractC119385av2 = (AbstractC119385av) obj2;
            long j2 = this.A01;
            if (j2 != C1132359l.A08) {
                C119815bf c119815bf = C119815bf.A00;
                if (abstractC119385av2 instanceof C119375au) {
                    C114205Dh c114205Dh = ((C119375au) abstractC119385av2).A00;
                    float f = c114205Dh.A01;
                    float f2 = c114205Dh.A03;
                    interfaceC1129057z.AR1(null, c119815bf, 1.0f, 3, j2, AbstractC119395aw.A00(f, f2), C5YB.A00(c114205Dh.A02 - f, c114205Dh.A00 - f2));
                } else {
                    if (abstractC119385av2 instanceof C6Ln) {
                        C6Ln c6Ln = (C6Ln) abstractC119385av2;
                        c60y = c6Ln.A01;
                        if (c60y == null) {
                            C137656Ll c137656Ll = c6Ln.A00;
                            long j3 = c137656Ll.A04;
                            long j4 = AbstractC137646Lk.A00;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                            float f3 = c137656Ll.A01;
                            float f4 = c137656Ll.A03;
                            interfaceC1129057z.AR4(null, c119815bf, 1.0f, 3, j2, AbstractC119395aw.A00(f3, f4), C5YB.A00(c137656Ll.A02 - f3, c137656Ll.A00 - f4), AbstractC137636Lj.A00(intBitsToFloat, intBitsToFloat));
                        }
                    } else if (abstractC119385av2 instanceof C119405ax) {
                        c60y = ((C119405ax) abstractC119385av2).A00;
                    } else {
                        throw new RuntimeException();
                    }
                    interfaceC1129057z.AQw(null, c60y, c119815bf, 1.0f, 3, j2);
                }
            }
            C6L5 c6l52 = this.A03;
            if (c6l52 != null) {
                CBE.A00(c6l52, abstractC119385av2, interfaceC1129057z, C119815bf.A00, this.A00);
            }
        }
        interfaceC1129057z.AQf();
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        this.A02 = 9205357640488583168L;
        this.A07 = null;
        this.A04 = null;
        this.A05 = null;
        C5Zx.A00(this);
    }
}
