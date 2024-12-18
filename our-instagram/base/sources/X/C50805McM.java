package X;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.McM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50805McM extends FrameLayout {
    public final C52367NFg A00;
    public final UserSession A01;
    public final NK6 A02;
    public final InterfaceC58310Pt2 A03;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 1) {
            MX1.A00(this.A01).A04("AUDIENCE_CONTROLS_TAPPED");
            C65782Tu0 A08 = this.A02.A08(AbstractC53597Nn4.A00);
            if (A08 != null) {
                this.A03.ElY(A08, null);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C50805McM(AbstractC59962oe abstractC59962oe, UserSession userSession, NK6 nk6, InterfaceC58310Pt2 interfaceC58310Pt2) {
        super(abstractC59962oe.requireContext());
        this.A01 = userSession;
        this.A02 = nk6;
        this.A03 = interfaceC58310Pt2;
        C52367NFg c52367NFg = new C52367NFg(abstractC59962oe, userSession);
        this.A00 = c52367NFg;
        addView(c52367NFg);
    }
}
