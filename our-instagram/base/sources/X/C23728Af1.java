package X;

import android.graphics.Canvas;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Af1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C23728Af1 implements InterfaceC1829589q {
    public final InteractiveDrawableContainer A00;

    @Override // X.InterfaceC1829589q
    public final void EGp(Canvas canvas, int i, boolean z, boolean z2) {
        C216199hc c216199hc;
        if (this instanceof C218159kn) {
            C218159kn c218159kn = (C218159kn) this;
            ArrayList A1E = AbstractC166987dD.A1E();
            InteractiveDrawableContainer interactiveDrawableContainer = c218159kn.A00;
            interactiveDrawableContainer.A0r(new C23526Abg(0, A1E, c218159kn));
            Iterator it = interactiveDrawableContainer.getAllDrawables().iterator();
            while (it.hasNext()) {
                AbstractC23126AKl.A00(AbstractC166987dD.A0Z(it));
            }
            interactiveDrawableContainer.draw(canvas);
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                interactiveDrawableContainer.A0f(AbstractC167007dF.A0B(it2), true);
            }
            return;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        InteractiveDrawableContainer interactiveDrawableContainer2 = this.A00;
        interactiveDrawableContainer2.A0r(new C23528Abi(this, A1E3, A1E2, i, z, z2));
        interactiveDrawableContainer2.draw(canvas);
        int size = A1E2.size();
        for (int i2 = 0; i2 < size; i2++) {
            interactiveDrawableContainer2.A0f(AbstractC166987dD.A0H(A1E2.get(i2)), true);
        }
        C220919pF c220919pF = (C220919pF) AbstractC001800i.A0J(A1E3);
        if (c220919pF != null) {
            C220799p3 c220799p3 = c220919pF.A01;
            if (c220799p3.A08.A02 && (c216199hc = c220799p3.A01) != null) {
                c216199hc.A00 = false;
                c216199hc.A0A.A0L(C216199hc.A00(c216199hc, c216199hc.A0C));
                c216199hc.invalidateSelf();
            }
        }
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLU() {
        return AbstractC167007dF.A1O(this.A00.getInteractiveDrawables().size());
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLZ(boolean z, boolean z2) {
        return AbstractC23126AKl.A03(this.A00.getAllDrawables(), z, z2);
    }

    @Override // X.InterfaceC1829589q
    public final void EJm() {
        this.A00.A0r(new C23524Abe(this, 1));
    }

    @Override // X.InterfaceC1829589q
    public final boolean isVisible() {
        return true;
    }

    public C23728Af1(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A00 = interactiveDrawableContainer;
    }
}
