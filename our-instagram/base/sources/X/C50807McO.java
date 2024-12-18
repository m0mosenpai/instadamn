package X;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.McO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50807McO extends FrameLayout {
    public final C52367NFg A00;
    public final InterfaceC58310Pt2 A01;
    public final NKJ A02;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            NKJ nkj = this.A02;
            C65782Tu0 A00 = NKJ.A00(nkj, nkj.A04(), false);
            if (A00 != null) {
                this.A01.ElY(A00, null);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final InterfaceC58310Pt2 getPublishScreenDelegate() {
        return this.A01;
    }

    public final C52367NFg getRowView() {
        return this.A00;
    }

    public final NKJ getUseCase() {
        return this.A02;
    }

    public C50807McO(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NKJ nkj) {
        super(abstractC59962oe.requireContext());
        this.A02 = nkj;
        this.A01 = interfaceC58310Pt2;
        C52367NFg c52367NFg = new C52367NFg(abstractC59962oe, userSession);
        this.A00 = c52367NFg;
        addView(c52367NFg);
    }
}
