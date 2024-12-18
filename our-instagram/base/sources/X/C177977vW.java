package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.gallery.Medium;

/* renamed from: X.7vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177977vW extends C3OO implements InterfaceC177987vX {
    public Medium A00;
    public final ConstraintLayout A01;
    public final InterfaceC177947vT A02;
    public final C177967vV A03;

    public C177977vW(ConstraintLayout constraintLayout, InterfaceC177947vT interfaceC177947vT, C177967vV c177967vV) {
        super(constraintLayout);
        this.A01 = constraintLayout;
        this.A03 = c177967vV;
        this.A02 = interfaceC177947vT;
        this.A00 = null;
    }

    @Override // X.InterfaceC177987vX
    public final void DU5() {
        C177937vS c177937vS;
        InterfaceC177947vT interfaceC177947vT = this.A02;
        if ((interfaceC177947vT instanceof C177937vS) && (c177937vS = (C177937vS) interfaceC177947vT) != null) {
            c177937vS.A03 = true;
        }
    }
}
