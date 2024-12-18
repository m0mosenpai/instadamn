package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iri, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42503Iri implements BC8 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    public C42503Iri(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.BC8
    public final void E1M(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        AbstractC167027dH.A12(c38321qM, c75113Zb, str);
        Integer num = C05F.A00;
        if (str.equals("feed_timeline")) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity fragmentActivity = this.A00;
            C41214IMd A0P = c1xj.A0P(fragmentActivity, this.A01, this.A02);
            A0P.A07 = num;
            A0P.A01 = c38321qM;
            A0P.A02 = c75113Zb;
            A0P.A09 = str;
            A0P.A0A = "feed_timeline_visual_search";
            A0P.A08 = fragmentActivity.getString(2131973945);
            A0P.A00();
            return;
        }
        throw AbstractC31175DnJ.A0V("Invalid visual search container module: ", str);
    }
}
