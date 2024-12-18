package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138156Nt extends C6KS implements C6Nu {
    public List A00;
    public final C6Nv A01 = new C6Nv();

    @Override // X.C6Nu
    public final /* synthetic */ void CgH(Object obj, InterfaceC16610sE interfaceC16610sE) {
        CgG(obj, null, interfaceC16610sE);
    }

    @Override // X.C6Nu
    public final void EoP(Object obj, Object obj2, InterfaceC16610sE interfaceC16610sE) {
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        list.add(Integer.valueOf(this.A01.A00));
        CgG(null, null, interfaceC16610sE);
    }

    @Override // X.C6Nu
    public final void CgG(Object obj, Object obj2, InterfaceC16610sE interfaceC16610sE) {
        C206929Dx c206929Dx;
        C6Nv c6Nv = this.A01;
        if (obj != null) {
            c206929Dx = new C206929Dx(obj, 16);
        } else {
            c206929Dx = null;
        }
        c6Nv.A01(1, new C136976Ia(c206929Dx, new C206929Dx(obj2, 17), new C5TR(-1010194746, true, new C9EP(interfaceC16610sE, 0))));
    }

    @Override // X.C6Nu
    public final void CgN(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16600sD interfaceC16600sD, int i) {
        this.A01.A01(i, new C136976Ia(interfaceC16660sJ, interfaceC16660sJ2, interfaceC16600sD));
    }

    @Override // X.C6Nu
    public final /* synthetic */ void CgO(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16600sD interfaceC16600sD, int i) {
        CgN(interfaceC16660sJ, C25083B8f.A00, interfaceC16600sD, i);
    }

    public C138156Nt(InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(this);
    }
}
