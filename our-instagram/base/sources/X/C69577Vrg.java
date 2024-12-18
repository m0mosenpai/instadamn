package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.Vrg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69577Vrg {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C69577Vrg(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = fragmentActivity;
    }

    public final void A00(RelatedItem relatedItem) {
        C140966Yy c140966Yy;
        Fragment CsU;
        int intValue = relatedItem.A00().intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    FragmentActivity fragmentActivity = this.A00;
                    UserSession userSession = this.A02;
                    c140966Yy = new C140966Yy(fragmentActivity, userSession);
                    C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
                    String str = relatedItem.A05;
                    C14360o3.A07(str);
                    CsU = c28431Ze.A02(userSession, AbstractC31402Dr6.A02(userSession, str, "related_user", this.A01.getModuleName()).A03());
                } else {
                    return;
                }
            } else {
                C1VW c1vw = C1VW.A00;
                if (c1vw == null) {
                    return;
                }
                CsU = c1vw.getFragmentFactory().CsU(relatedItem.A03);
                c140966Yy = new C140966Yy(this.A00, this.A02);
            }
            c140966Yy.A0D(CsU);
        } else {
            FragmentActivity fragmentActivity2 = this.A00;
            UserSession userSession2 = this.A02;
            c140966Yy = new C140966Yy(fragmentActivity2, userSession2);
            String str2 = relatedItem.A05;
            C14360o3.A07(str2);
            HashtagImpl A00 = AbstractC1120253r.A00(str2);
            String moduleName = this.A01.getModuleName();
            String A002 = AbstractC111324zv.A00(3003);
            Fragment A01 = WE2.A01(userSession2);
            A01.setArguments(WE2.A00(A00, moduleName, A002));
            c140966Yy.A0D(A01);
            c140966Yy.A0B = AbstractC111324zv.A00(3002);
        }
        c140966Yy.A04();
    }
}
