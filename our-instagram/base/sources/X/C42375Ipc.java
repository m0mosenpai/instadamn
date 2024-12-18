package X;

import com.instagram.discovery.refinement.model.Refinement;

/* renamed from: X.Ipc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42375Ipc implements InterfaceC43071ya {
    public final InterfaceC43407JFx A00;
    public final java.util.Set A01 = AbstractC166987dD.A1H();

    public C42375Ipc(InterfaceC43407JFx interfaceC43407JFx) {
        this.A00 = interfaceC43407JFx;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        Refinement refinement = (Refinement) c59062n7.A03;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            java.util.Set set = this.A01;
            String A00 = refinement.A00();
            C14360o3.A07(A00);
            if (set.add(A00)) {
                Object obj = c59062n7.A04;
                C14360o3.A06(obj);
                ((Number) obj).intValue();
            }
        }
    }
}
