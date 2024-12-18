package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Foc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35642Foc implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    public ViewOnClickListenerC35642Foc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        this.A00 = i;
        this.A05 = obj;
        this.A07 = obj5;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A04 = obj7;
        this.A06 = obj6;
        this.A02 = obj4;
        this.A08 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1614703744);
                Context context = (Context) this.A05;
                UserSession userSession = (UserSession) this.A07;
                Activity activity = (Activity) this.A01;
                C2EE c2ee = (C2EE) this.A04;
                InterfaceC148366m6 interfaceC148366m6 = (InterfaceC148366m6) this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                interfaceC148366m6.CMc();
                C32250EIj c32250EIj = new C32250EIj();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("open_from_first_banner", false);
                C189448aO A0W = AbstractC31174DnI.A0W(A0b, c32250EIj, userSession);
                A0W.A0g = String.valueOf(context.getText(2131960686));
                A0W.A1J = true;
                A0W.A0K = new ViewOnClickListenerC35610Fo1(3, activity, interfaceC11380iw, userSession, c2ee);
                AbstractC31173DnH.A0w(activity, c32250EIj, A0W);
                A0T.A00(interfaceC11380iw, userSession, "thread_ctd_upsell_education_content_banner_impression", c2ee.C7I());
                String C7I = c2ee.C7I();
                if (this.A08) {
                    str = "thread_ctd_upsell_single_create_messaging_ads_banner_learm_more_click";
                } else {
                    str = "thread_ctd_upsell_second_banner_learn_more_click";
                }
                A0T.A00(interfaceC11380iw, userSession, str, C7I);
                i = -1491247541;
                break;
            case 1:
                A05 = C0f9.A05(2007911486);
                Context context2 = (Context) this.A02;
                UserSession userSession2 = (UserSession) this.A07;
                boolean z = this.A08;
                E70 e70 = (E70) this.A06;
                C32107E9f c32107E9f = (C32107E9f) this.A05;
                C7MJ c7mj = (C7MJ) this.A03;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                InterfaceC83733oI interfaceC83733oI = e70.A0L;
                if (!C35244Fgd.A03((Activity) context2, context2, interfaceC11380iw2, userSession2, null, C7KH.A00(e70), false)) {
                    User user = c32107E9f.A00;
                    List A1J = AbstractC166987dD.A1J(MessagingUser.A00(user));
                    String A02 = C7KH.A02(context2, userSession2, e70, z);
                    String username = user.getUsername();
                    ImageUrl Bhu = user.Bhu();
                    C14360o3.A0B(interfaceC83733oI, 0);
                    C7TQ A00 = C7MJ.A00(c7mj, interfaceC83733oI);
                    GKK.A00(A00.EG6(interfaceC83733oI, A1J).A0G(), c7mj.A01, new FRH(Bhu, c7mj, interfaceC83733oI, A02, username, 1), 14);
                    c32107E9f.getId();
                }
                i = 980462333;
                break;
            case 2:
                FOQ foq = (FOQ) this.A01;
                User user2 = (User) this.A02;
                Context context3 = (Context) this.A03;
                UserSession userSession3 = (UserSession) this.A04;
                C684436h c684436h = (C684436h) this.A05;
                AbstractC018607g abstractC018607g = (AbstractC018607g) this.A06;
                InterfaceC11380iw interfaceC11380iw3 = (InterfaceC11380iw) this.A07;
                boolean z2 = this.A08;
                boolean z3 = !user2.A23();
                FWX.A01(context3, foq, z3);
                C0fQ.A00(new ViewOnClickListenerC35642Foc(c684436h, context3, foq, user2, interfaceC11380iw3, abstractC018607g, userSession3, 2, z3), foq.A01);
                boolean z4 = !z2;
                c684436h.A01(interfaceC11380iw3, new C61972ry(context3, abstractC018607g), new FL3(context3, foq, user2), user2, z4);
                C127085om A002 = AbstractC127075ol.A00(userSession3);
                String moduleName = interfaceC11380iw3.getModuleName();
                if (z4) {
                    A002.A00(user2, moduleName, null, null, "following_sheet");
                    return;
                } else {
                    A002.A01(user2, moduleName, null, null, "following_sheet");
                    return;
                }
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
