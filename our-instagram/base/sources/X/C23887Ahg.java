package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.Ahg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23887Ahg implements InterfaceC58036PoM {
    public final /* synthetic */ C187058Qy A00;

    @Override // X.InterfaceC58036PoM
    public final void Dv4(C195868lW c195868lW, int i) {
        ViewParent viewParent;
        C187058Qy c187058Qy = this.A00;
        FrameLayout frameLayout = c187058Qy.A06;
        if (frameLayout != null) {
            viewParent = frameLayout.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(c187058Qy.A06);
        }
        c187058Qy.A06 = null;
        C187058Qy.A00(c187058Qy, true);
        c187058Qy.A0I.A01(c195868lW.A09, c195868lW.A0k, false);
    }

    @Override // X.InterfaceC58036PoM
    public final void Dv5(Exception exc, boolean z) {
        AbstractC12120kG.A0C("GreenScreenReviewController", "transcode params failed", exc);
        C187058Qy.A00(this.A00, false);
    }

    public C23887Ahg(C187058Qy c187058Qy) {
        this.A00 = c187058Qy;
    }
}
