package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FoY implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public FoY(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A03 = obj7;
        this.A07 = obj5;
        this.A02 = obj6;
        this.A04 = obj2;
        this.A01 = obj;
        this.A05 = obj3;
        this.A06 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        View view2;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1628780117);
                UserSession userSession = (UserSession) this.A07;
                C38321qM c38321qM = (C38321qM) this.A04;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                Integer num = (Integer) this.A03;
                EnumC31334Dpz enumC31334Dpz = (EnumC31334Dpz) this.A06;
                AbstractC53534Nm0 abstractC53534Nm0 = (AbstractC53534Nm0) this.A05;
                AbstractC34773FTw.A01(enumC31334Dpz, interfaceC11380iw, userSession, c38321qM, abstractC53534Nm0, num);
                C55049Oa0 c55049Oa0 = C55049Oa0.A00;
                Context context = (Context) this.A02;
                C14360o3.A0A(context);
                NVh nVh = (NVh) abstractC53534Nm0;
                EnumC53249Ngn A00 = nVh.A00();
                String str2 = nVh.A00;
                if (str2 == null || str2.length() <= 0) {
                    str2 = null;
                }
                c55049Oa0.A01(context, userSession, A00, str2);
                i = -808122241;
                break;
            case 1:
                A05 = C0f9.A05(1677104264);
                UserSession userSession2 = (UserSession) this.A07;
                C38321qM c38321qM2 = (C38321qM) this.A04;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                Integer num2 = (Integer) this.A03;
                EnumC31334Dpz enumC31334Dpz2 = (EnumC31334Dpz) this.A06;
                AbstractC53534Nm0 abstractC53534Nm02 = (AbstractC53534Nm0) this.A05;
                C35053FcQ.A01(enumC31334Dpz2, interfaceC11380iw2, userSession2, c38321qM2, abstractC53534Nm02, num2);
                C55049Oa0 c55049Oa02 = C55049Oa0.A00;
                Context context2 = (Context) this.A02;
                C14360o3.A0A(context2);
                NVh nVh2 = (NVh) abstractC53534Nm02;
                EnumC53249Ngn A002 = nVh2.A00();
                String str3 = nVh2.A00;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                c55049Oa02.A01(context2, userSession2, A002, str3);
                i = -159405625;
                break;
            case 2:
                A05 = C0f9.A05(-1999628458);
                C35140Feh c35140Feh = C35140Feh.A00;
                UserSession userSession3 = (UserSession) this.A07;
                c35140Feh.A01((Fragment) this.A03, (FragmentActivity) this.A01, (InterfaceC11380iw) this.A02, userSession3, (Capabilities) this.A05, (E70) this.A06, (C32107E9f) this.A04);
                i = -145760342;
                break;
            case 3:
                A05 = C0f9.A05(-340329341);
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A07;
                C57012jc c57012jc = (C57012jc) this.A06;
                C57012jc c57012jc2 = (C57012jc) this.A05;
                C5HW c5hw = (C5HW) this.A02;
                C35023Fbw c35023Fbw = (C35023Fbw) this.A04;
                FRG frg = (FRG) this.A03;
                C34711FQw c34711FQw = (C34711FQw) this.A01;
                c35023Fbw.A05 = true;
                c57012jc.A02();
                String str4 = frg.A01;
                if (str4 == null) {
                    str4 = "";
                }
                Map singletonMap = Collections.singletonMap(str4, AbstractC166987dD.A1J(String.valueOf(c34711FQw.A00)));
                C14360o3.A07(singletonMap);
                C34662FOv c34662FOv = FE7.A00;
                String str5 = c35023Fbw.A02;
                if (str5 == null) {
                    str5 = "";
                }
                String valueOf = String.valueOf(c5hw.A00);
                String str6 = c5hw.A09;
                C14360o3.A07(str6);
                String str7 = c35023Fbw.A00;
                if (str7 == null) {
                    str7 = "";
                }
                c34662FOv.A00(abstractC12990ll, str5, str4, "activity_feed", valueOf, str6, str7, c35023Fbw.A03, singletonMap);
                c57012jc2.A03(0);
                AbstractC166987dD.A0e(c57012jc2.A01(), R.id.confirmation_text).setText(2131968527);
                ViewOnClickListenerC35667Fp2.A00(c57012jc2.A01().findViewById(R.id.close_survey_button), 8, c57012jc2);
                i = -90666780;
                break;
            case 4:
                A05 = C0f9.A05(1490380486);
                C14510oO c14510oO = (C14510oO) this.A03;
                boolean z = !c14510oO.A00;
                c14510oO.A00 = z;
                E04 e04 = (E04) this.A07;
                HashMap hashMap = e04.A02;
                Number number = (Number) this.A02;
                AbstractC31173DnH.A1Y(number, hashMap, z);
                ((View) this.A04).setSelected(c14510oO.A00);
                Context context3 = (Context) this.A01;
                TextView textView = (TextView) this.A05;
                boolean z2 = c14510oO.A00;
                int i3 = R.attr.igds_color_primary_text;
                if (z2) {
                    i3 = R.attr.igds_color_selected_pill_text;
                }
                AbstractC31177DnL.A0q(context3, textView, i3);
                C32269EJe c32269EJe = e04.A0A;
                long longValue = number.longValue();
                boolean z3 = c14510oO.A00;
                if (c32269EJe.A05) {
                    c32269EJe.A0B.put(number, Boolean.valueOf(z3));
                } else {
                    c32269EJe.A06 = true;
                    C32269EJe.A00(c32269EJe, longValue, z3);
                }
                ((C31690Dvv) c32269EJe.A0D.getValue()).A03(String.valueOf(longValue));
                if (c14510oO.A00) {
                    str = "select";
                } else {
                    str = "unselect";
                }
                String name = ((InterfaceC37273GbQ) this.A06).getName();
                if (name != null) {
                    if (e04.A05) {
                        c32269EJe.A0C.put(number, name);
                    } else {
                        c32269EJe.A01(str, name, number.toString());
                    }
                }
                i = -578392419;
                break;
            default:
                A05 = C0f9.A05(95622919);
                User user = (User) this.A05;
                boolean z4 = !user.A1w();
                FOQ foq = (FOQ) this.A06;
                Context context4 = (Context) this.A03;
                FWX.A00(context4, foq, z4);
                GIQ giq = (GIQ) this.A04;
                giq.A05.A17(z4);
                UserDetailTabController userDetailTabController = giq.A04;
                if (userDetailTabController != null) {
                    userDetailTabController.A0F();
                }
                C34670FPf c34670FPf = new C34670FPf(this, z4);
                C684436h c684436h = (C684436h) this.A02;
                C1GL c61972ry = new C61972ry(context4, (AbstractC018607g) this.A07);
                InterfaceC11380iw interfaceC11380iw3 = (InterfaceC11380iw) this.A01;
                Integer num3 = C05F.A0C;
                if (z4) {
                    c684436h.A02(interfaceC11380iw3, c61972ry, c34670FPf, user, num3);
                    C14360o3.A0B(interfaceC11380iw3, 2);
                    C1571673v.A06(interfaceC11380iw3, giq.A02, C1571673v.A01(user.B7L()), "add_close_friend", user.getId(), "following_sheet");
                    view2 = foq.A00;
                    i2 = 2131952463;
                } else {
                    ArrayList A12 = AbstractC166997dE.A12(interfaceC11380iw3, 2);
                    AbstractC31173DnH.A1X(user, A12);
                    C1ON A01 = AbstractC34375FDr.A00.A01(interfaceC11380iw3, c684436h.A01, num3, AbstractC166987dD.A1E(), A12);
                    A01.A00 = new C32540EUq(3, c34670FPf, user, c684436h);
                    c61972ry.schedule(A01);
                    C1571673v.A06(interfaceC11380iw3, giq.A02, C1571673v.A01(user.B7L()), "remove_close_friend", user.getId(), "following_sheet");
                    view2 = foq.A00;
                    i2 = 2131972337;
                }
                AbstractC56932jR.A07(view2, AbstractC31178DnM.A0c(context4, user, i2));
                i = -682712309;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
