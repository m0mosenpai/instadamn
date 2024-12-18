package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.List;

/* renamed from: X.Ija, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42005Ija implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public ViewOnClickListenerC42005Ija(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A06 = z;
        this.A04 = obj4;
        this.A05 = obj3;
        this.A01 = i;
        this.A03 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int i;
        if (this.A00 != 0) {
            A05 = C0f9.A05(995355577);
            C41742IeG c41742IeG = (C41742IeG) this.A05;
            c41742IeG.A05.A02.put(this.A04, null);
            C41742IeG.A02(c41742IeG, (List) this.A03, C189448aO.A1W, this.A01 - 1, this.A06);
            i = 300383331;
        } else {
            A05 = C0f9.A05(-724900437);
            InterfaceC109864xE interfaceC109864xE = (InterfaceC109864xE) this.A02;
            Integer A01 = AbstractC28293Cdf.A01(interfaceC109864xE);
            if (A01 == null) {
                i = -240757056;
            } else {
                int intValue = A01.intValue();
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 0) {
                            if (intValue != 4) {
                                if (intValue != 1) {
                                    B4Z A00 = B4Z.A00();
                                    C0f9.A0C(667315261, A05);
                                    throw A00;
                                }
                            } else {
                                ((C3h2) this.A04).D9l(interfaceC109864xE, (InterfaceC38401qU) this.A05, this.A01);
                            }
                        }
                    } else {
                        ((C3h2) this.A04).DWg(interfaceC109864xE, (InterfaceC38401qU) this.A05, this.A01);
                    }
                } else if (!this.A06) {
                    ((C3h2) this.A04).D3H(interfaceC109864xE, (InterfaceC38401qU) this.A05, this.A01);
                    i = 1749474661;
                } else {
                    View view2 = (View) this.A03;
                    C38292Gsb c38292Gsb = new C38292Gsb(interfaceC109864xE, (InterfaceC38401qU) this.A05, (C3h2) this.A04, this.A01);
                    if (view2 != null && (animate = view2.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
                        duration.setListener(c38292Gsb);
                    }
                }
                i = 1372614244;
            }
        }
        C0f9.A0C(i, A05);
    }
}
