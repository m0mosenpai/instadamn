package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KKl extends C3PD {
    public final /* synthetic */ C45679KJq A00;
    public final /* synthetic */ C45219Jzz A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C3PD, X.C3PE
    public final void DQY(View view) {
        boolean z;
        C14360o3.A0B(view, 0);
        view.performHapticFeedback(0);
        C45679KJq c45679KJq = this.A00;
        c45679KJq.A03.CwC();
        UserSession userSession = c45679KJq.A02;
        InterfaceC11380iw interfaceC11380iw = c45679KJq.A01;
        C45219Jzz c45219Jzz = this.A01;
        C148286ly c148286ly = (C148286ly) c45219Jzz.A01.A00;
        String str = c148286ly.A0S;
        C14360o3.A07(str);
        Integer num = C05F.A00;
        String str2 = c45679KJq.A07;
        boolean A1X = AbstractC167007dF.A1X(c45679KJq.A00, EnumC46271Ke3.AI_STICKER);
        boolean z2 = this.A02;
        String str3 = c148286ly.A0U;
        if (str3 != null) {
            z = AbstractC47157Kss.A00.A07(str3);
        } else {
            z = false;
        }
        int i = c45219Jzz.A00;
        new LGF(view, interfaceC11380iw, userSession, new C47347Kvw(c45679KJq), num, str, str2, null, c148286ly.A0U, i, A1X, z2, z).A01();
    }

    public KKl(C45679KJq c45679KJq, C45219Jzz c45219Jzz, boolean z) {
        this.A00 = c45679KJq;
        this.A01 = c45219Jzz;
        this.A02 = z;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C45679KJq c45679KJq = this.A00;
        UserSession userSession = c45679KJq.A02;
        InterfaceC11380iw interfaceC11380iw = c45679KJq.A01;
        C45219Jzz c45219Jzz = this.A01;
        JWd jWd = c45219Jzz.A01;
        C148286ly c148286ly = (C148286ly) jWd.A00;
        String str = c148286ly.A0S;
        C14360o3.A07(str);
        int i = c45219Jzz.A00;
        String str2 = c148286ly.A0U;
        String str3 = jWd.A01;
        EnumC46271Ke3 enumC46271Ke3 = c45679KJq.A00;
        String str4 = c45679KJq.A07;
        boolean z = this.A02;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C14360o3.A0B(enumC46271Ke3, 6);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_sent");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1G(A0f, "sticker_tray");
                A0f.AAP("search_query", str2);
                A0f.AAk("sticker_ids", AbstractC166987dD.A1J(str));
                A0f.A9K("sticker_position_index", AbstractC31171DnF.A0V(i));
                JQ1.A0c(enumC46271Ke3, A0f, str3, str4);
                A0f.A7v("is_animated", Boolean.valueOf(z));
                A0f.Cht();
            }
        }
        c45679KJq.A03.CwE(c148286ly, c45679KJq.A05, i);
        LBp.A01(userSession, new C49807LzE(c148286ly, null, EnumC46173KcB.A03, null, null, System.currentTimeMillis()), AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36609704232359889L));
        return true;
    }
}
