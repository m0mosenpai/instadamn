package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oky, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnScrollChangedListenerC55505Oky implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public ViewTreeObserverOnScrollChangedListenerC55505Oky(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        AbstractC50810Mcb abstractC50810Mcb;
        ViewTreeObserver viewTreeObserver;
        switch (this.A00) {
            case 0:
                OL7 ol7 = (OL7) this.A01;
                AbstractC50810Mcb abstractC50810Mcb2 = ol7.A04;
                if (!abstractC50810Mcb2.isShown() || !abstractC50810Mcb2.getGlobalVisibleRect(AbstractC166987dD.A0U())) {
                    return;
                }
                InterfaceC19630xq interfaceC19630xq = ol7.A09.A00;
                boolean z = true;
                if (!interfaceC19630xq.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", false)) {
                    AbstractC31177DnL.A1N(interfaceC19630xq, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", true);
                }
                OJY ojy = ol7.A05;
                Integer num = ojy.A01;
                boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
                C55192Ody c55192Ody = C55192Ody.A00;
                UserSession userSession = ol7.A03;
                String str = null;
                if (!A1X) {
                    str = XiG.A00(num).name();
                }
                InterfaceC173987oq interfaceC173987oq = ol7.A07;
                if (interfaceC173987oq == null || interfaceC173987oq.getId() == null) {
                    z = false;
                }
                c55192Ody.A04(userSession, str, A1X, z);
                ol7.A01.getViewTreeObserver().removeOnScrollChangedListener(this);
                ojy.A04 = false;
                return;
            case 1:
                P1E p1e = (P1E) this.A01;
                AbstractC50810Mcb abstractC50810Mcb3 = p1e.A09;
                boolean z2 = true;
                if (abstractC50810Mcb3 == null || !abstractC50810Mcb3.isShown() || (abstractC50810Mcb = p1e.A09) == null || !abstractC50810Mcb.getGlobalVisibleRect(AbstractC166987dD.A0U())) {
                    return;
                }
                InterfaceC19630xq interfaceC19630xq2 = p1e.A0O.A00;
                if (!interfaceC19630xq2.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", false)) {
                    AbstractC31177DnL.A1N(interfaceC19630xq2, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN", true);
                }
                C0UO c0uo = p1e.A0K.A06;
                OJY ojy2 = (OJY) ((C50569MUa) c0uo.getValue()).A03;
                ojy2.A04 = false;
                Integer num2 = ojy2.A01;
                boolean A1X2 = AbstractC167007dF.A1X(num2, C05F.A00);
                C55192Ody c55192Ody2 = C55192Ody.A00;
                UserSession userSession2 = p1e.A0J;
                String str2 = null;
                if (!A1X2) {
                    str2 = XiG.A00(num2).name();
                }
                InterfaceC173987oq interfaceC173987oq2 = (InterfaceC173987oq) ((C50569MUa) c0uo.getValue()).A02;
                if (interfaceC173987oq2 == null || interfaceC173987oq2.getId() == null) {
                    z2 = false;
                }
                c55192Ody2.A04(userSession2, str2, A1X2, z2);
                View view = p1e.A0I.mView;
                if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(this);
                return;
            case 2:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                if (c31721DwQ.isResumed()) {
                    AbstractC31176DnK.A0J(c31721DwQ).A0Y(AbstractC43592JPx.A1X(c31721DwQ.A0D));
                }
                Rect A0U = AbstractC166987dD.A0U();
                View view2 = c31721DwQ.A04;
                if (view2 == null) {
                    return;
                }
                boolean globalVisibleRect = view2.getGlobalVisibleRect(A0U);
                C23031Ai A00 = AbstractC23021Ah.A00(c31721DwQ.A0V);
                if (!globalVisibleRect || AbstractC167017dG.A1b(A00, A00.A28, C23031Ai.A8c, 289)) {
                    return;
                }
                C5SW c5sw = c31721DwQ.A0e;
                if (c5sw == null) {
                    C5SU c5su = new C5SU(c31721DwQ.requireActivity(), new C149686oL(c31721DwQ.getString(2131964982)));
                    c5su.A04(c31721DwQ.A04, 0, 0, true);
                    c5su.A02();
                    c5su.A0A = true;
                    c5sw = c5su.A00();
                    c31721DwQ.A0e = c5sw;
                }
                if (c5sw.A09()) {
                    return;
                }
                c31721DwQ.A04.postDelayed(new PRB(A00, c31721DwQ), 100L);
                return;
            default:
                C55023OWx.A00((C55023OWx) this.A01);
                return;
        }
    }
}
