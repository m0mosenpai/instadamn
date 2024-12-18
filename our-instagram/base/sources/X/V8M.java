package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class V8M extends C1I2 implements XAo {
    public final Fragment A00;
    public final ViewOnTouchListenerC60632pm A01;
    public final InterfaceC65252xN A02;
    public final UserSession A03;
    public final C69592Vrv A04;
    public final InterfaceC60682pr A05;
    public final InterfaceC11380iw A06;
    public final C3G2 A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.3Lq] */
    public final void A02() {
        Fragment fragment = this.A00;
        C3M4 A05 = C1OU.A05(fragment.requireActivity());
        if (A05 != null && A05.A0a() && A05.A0G == this.A07) {
            A05.A0Y(this.A06);
        }
        this.A01.A04(C56352iT.A0t.A03(fragment.getActivity()).A0P, new Object(), this.A04.A00);
    }

    @Override // X.XAo
    public final void DKM() {
        if (this.A00.isResumed()) {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
            C3FQ scrollingViewProxy = this.A05.getScrollingViewProxy();
            C14360o3.A07(scrollingViewProxy);
            InterfaceC65252xN interfaceC65252xN = this.A02;
            int i = this.A04.A00;
            viewOnTouchListenerC60632pm.A07(interfaceC65252xN, scrollingViewProxy, i, i);
        }
    }

    public V8M(Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60682pr interfaceC60682pr, C3G2 c3g2) {
        AbstractC37302Gc3.A1U(interfaceC65252xN, viewOnTouchListenerC60632pm);
        C14360o3.A0B(userSession, 7);
        this.A00 = fragment;
        this.A05 = interfaceC60682pr;
        this.A02 = interfaceC65252xN;
        this.A01 = viewOnTouchListenerC60632pm;
        this.A07 = c3g2;
        this.A06 = interfaceC11380iw;
        this.A03 = userSession;
        this.A04 = new C69592Vrv(fragment.requireContext(), this);
    }

    @Override // X.C1I2
    public void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C0f9.A0A(-1740213960, C0f9.A03(-1801341971));
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(1878807388, C0f9.A03(-1367279544));
    }
}
