package X;

/* loaded from: classes5.dex */
public abstract class CBE {
    public static final void A00(C6L5 c6l5, AbstractC119385av abstractC119385av, InterfaceC1128857w interfaceC1128857w, AbstractC119825bg abstractC119825bg, float f) {
        C60Y c60y;
        if (abstractC119385av instanceof C119375au) {
            C114205Dh c114205Dh = ((C119375au) abstractC119385av).A00;
            float f2 = c114205Dh.A01;
            float f3 = c114205Dh.A03;
            interfaceC1128857w.AR0(c6l5, null, abstractC119825bg, f, 3, AbstractC119395aw.A00(f2, f3), C5YB.A00(c114205Dh.A02 - f2, c114205Dh.A00 - f3));
            return;
        }
        if (abstractC119385av instanceof C6Ln) {
            C6Ln c6Ln = (C6Ln) abstractC119385av;
            c60y = c6Ln.A01;
            if (c60y == null) {
                C137656Ll c137656Ll = c6Ln.A00;
                long j = c137656Ll.A04;
                long j2 = AbstractC137646Lk.A00;
                float A00 = AbstractC25231BEo.A00(j);
                float f4 = c137656Ll.A01;
                float f5 = c137656Ll.A03;
                interfaceC1128857w.AR3(c6l5, null, abstractC119825bg, f, 3, AbstractC119395aw.A00(f4, f5), C5YB.A00(c137656Ll.A02 - f4, c137656Ll.A00 - f5), AbstractC137636Lj.A00(A00, A00));
                return;
            }
        } else if (abstractC119385av instanceof C119405ax) {
            c60y = ((C119405ax) abstractC119385av).A00;
        } else {
            throw B4Z.A00();
        }
        interfaceC1128857w.AQv(c6l5, null, c60y, abstractC119825bg, f, 3);
    }
}
