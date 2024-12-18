package X;

import android.transition.Transition;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.OiC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55350OiC implements Transition.TransitionListener {
    public final int A00;
    public final Object A01;

    public C55350OiC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        String str;
        if (this.A00 != 0) {
            PCP pcp = (PCP) this.A01;
            pcp.A01();
            InterfaceC57986PnW interfaceC57986PnW = pcp.A01;
            if (interfaceC57986PnW != null) {
                interfaceC57986PnW.DvU();
                return;
            }
            str = "animationListener";
        } else {
            C45466KBb c45466KBb = (C45466KBb) this.A01;
            IgEditText igEditText = c45466KBb.A0I;
            if (igEditText == null) {
                str = "noteEditText";
            } else {
                igEditText.setHint(C45466KBb.A04(c45466KBb));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (this.A00 != 0) {
            PCP.A00((PCP) this.A01, false);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
