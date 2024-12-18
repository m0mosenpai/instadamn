package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LPV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;

    public LPV(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z) {
        this.A00 = i;
        this.A06 = obj4;
        this.A01 = obj2;
        this.A03 = obj;
        this.A04 = obj6;
        this.A05 = obj5;
        this.A02 = obj3;
        this.A07 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        if (this.A00 != 0) {
            A05 = C0f9.A05(2021932218);
            if (!this.A07) {
                C47732L5t c47732L5t = (C47732L5t) this.A02;
                C38321qM c38321qM = (C38321qM) this.A05;
                c47732L5t.A00(view, (C5qT) this.A03, (C127915qK) this.A04, c38321qM);
                i = 1071166815;
            } else {
                UserSession userSession = (UserSession) this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C47732L5t c47732L5t2 = (C47732L5t) this.A02;
                C38321qM c38321qM2 = (C38321qM) this.A05;
                C127915qK c127915qK = (C127915qK) this.A04;
                C5qT c5qT = (C5qT) this.A03;
                AbstractC167017dG.A1N(view, userSession);
                C14360o3.A0B(c47732L5t2, 3);
                Context context = view.getContext();
                if (AbstractC31206Dnp.A01(userSession)) {
                    AbstractC31206Dnp.A00(context, userSession, new C49694LxP(view, c5qT, c127915qK, c47732L5t2, c38321qM2));
                } else {
                    Integer num = C05F.A0Y;
                    if (AbstractC43607JQo.A00(userSession, num)) {
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                        int i2 = A00.A01.getInt("zero_rating_explore_video_nux_count", 0);
                        AbstractC34362FDe.A00(context, new ViewOnClickListenerC42031Ik0(view, c5qT, c127915qK, c47732L5t2, A00, c38321qM2, i2), C26661Qv.A00(userSession).C98(), interfaceC11380iw, null, null, num);
                    } else {
                        c47732L5t2.A00(view, c5qT, c127915qK, c38321qM2);
                    }
                }
                i = 597109913;
            }
        } else {
            A05 = C0f9.A05(-1578887660);
            UserSession userSession2 = (UserSession) this.A06;
            FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
            View view2 = (View) this.A03;
            C2EE c2ee = (C2EE) this.A04;
            InterfaceC148366m6 interfaceC148366m6 = (InterfaceC148366m6) this.A05;
            InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A02;
            AbstractC35056FcT.A01(view2, interfaceC148366m6);
            AbstractC35056FcT.A02(fragmentActivity, interfaceC11380iw2, userSession2, c2ee);
            String C7I = c2ee.C7I();
            if (this.A07) {
                str = "thread_ctd_upsell_single_create_messaging_ads_banner_create_ad_click";
            } else {
                str = "thread_ctd_upsell_second_banner_create_ad_click";
            }
            A0T.A00(interfaceC11380iw2, userSession2, str, C7I);
            i = -1726854477;
        }
        C0f9.A0C(i, A05);
    }
}
