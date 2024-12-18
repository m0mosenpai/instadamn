package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37601Ggw {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C37601Ggw(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167017dG.A1R(userSession, interfaceC60442pS);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    public final void A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String moduleName = interfaceC60442pS.getModuleName();
        if (C14360o3.A0K(moduleName, "clips_viewer_clips_tab")) {
            str = "clips_viewer_clips_tab_visual_search";
        } else if (C14360o3.A0K(moduleName, AbstractC111324zv.A00(2073))) {
            str = "clips_viewer_feed_timeline_visual_search";
        } else {
            str = "";
        }
        C1XJ c1xj = C1XJ.A00;
        FragmentActivity fragmentActivity = this.A00;
        C41214IMd A0P = c1xj.A0P(fragmentActivity, this.A01, interfaceC60442pS);
        A0P.A07 = C05F.A01;
        A0P.A01 = c38321qM;
        A0P.A02 = c75113Zb;
        A0P.A09 = interfaceC60442pS.getModuleName();
        A0P.A0A = str;
        A0P.A08 = fragmentActivity.getString(2131973945);
        A0P.A00();
    }
}
