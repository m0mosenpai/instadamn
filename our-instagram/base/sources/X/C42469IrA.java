package X;

import android.view.MotionEvent;

/* renamed from: X.IrA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42469IrA implements InterfaceC92434Ca {
    public final InterfaceC92434Ca A00;
    public final HEH A01;

    @Override // X.InterfaceC92434Ca
    public final void Cv9(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb, InterfaceC16820sZ interfaceC16820sZ) {
        IMQ imq = this.A01.A03;
        imq.A02 = imq.A00;
        imq.A05 = true;
        this.A00.Cv9(motionEvent, c81373k7, c38321qM, c75113Zb, c2Fb, interfaceC16820sZ);
    }

    public C42469IrA(InterfaceC92434Ca interfaceC92434Ca, HEH heh) {
        AbstractC167017dG.A1P(interfaceC92434Ca, heh);
        this.A00 = interfaceC92434Ca;
        this.A01 = heh;
    }
}
