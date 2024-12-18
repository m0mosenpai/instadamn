package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Map;

/* renamed from: X.Iea, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41759Iea {
    public static final C41759Iea A00 = new Object();

    public static final void A02(Context context, Drawable drawable, JI9 ji9, InterfaceC106354qp interfaceC106354qp, C38621GyO c38621GyO, C38321qM c38321qM, C64452w4 c64452w4, Integer num) {
        String str;
        String str2;
        String B1v;
        InterfaceC106354qp interfaceC106354qp2;
        UserSession userSession;
        EnumC71153Hb A002;
        String str3;
        String str4;
        InterfaceC106354qp interfaceC106354qp3;
        if (interfaceC106354qp != null) {
            str = interfaceC106354qp.Anq();
        } else {
            str = null;
        }
        if (c38321qM != null && C14360o3.A0K(str, "see_more") && (A002 = AbstractC40693I1z.A00((userSession = c64452w4.A00), num)) == EnumC71153Hb.A04) {
            Map map = c64452w4.A03;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(A002);
            A1C.append('_');
            HBC hbc = (HBC) map.get(AbstractC166997dE.A0x(c38321qM.getId(), A1C));
            if (hbc != null && AbstractC166987dD.A1b(C64452w4.A00(hbc, c64452w4)) && C18U.A06(C06090Tz.A05, userSession, 36318934945438500L)) {
                C41017IEm c41017IEm = new C41017IEm(new IJQ(context, c38321qM, A002, hbc, c64452w4), AbstractC166997dE.A0p(context, 2131976888));
                if (interfaceC106354qp == null || (str3 = interfaceC106354qp.B1v()) == null) {
                    str3 = "";
                }
                if (str3.length() != 0) {
                    if (c38621GyO == null || (interfaceC106354qp3 = c38621GyO.A01) == null || (str4 = interfaceC106354qp3.getText()) == null) {
                        str4 = "";
                    }
                    if (str4.length() != 0) {
                        String str5 = c41017IEm.A01;
                        if (str5.length() != 0) {
                            C42689Iuk c42689Iuk = new C42689Iuk(0, context, ji9, interfaceC106354qp, c38621GyO, c41017IEm);
                            IMN imn = new IMN();
                            imn.A04 = str3;
                            imn.A00 = 5000;
                            imn.A06 = str5;
                            imn.A07 = str4;
                            int color = context.getColor(AbstractC53242c7.A05(context));
                            imn.A01 = drawable;
                            C14360o3.A0A(drawable);
                            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                            imn.A03 = c42689Iuk;
                            IKG A003 = imn.A00();
                            C14360o3.A0C(context, AbstractC43591JPw.A00(6));
                            ((BaseFragmentActivity) context).By1().A07(A003);
                            return;
                        }
                    }
                }
            }
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC37304Gc5.A0p(context, drawable, A0K);
        A0K.A02();
        String str6 = "";
        if (c38621GyO == null || (interfaceC106354qp2 = c38621GyO.A01) == null || (str2 = interfaceC106354qp2.getText()) == null) {
            str2 = "";
        }
        A0K.A0G = str2;
        A0K.A0L = true;
        A0K.A01 = 5000;
        if (interfaceC106354qp != null && (B1v = interfaceC106354qp.B1v()) != null) {
            str6 = B1v;
        }
        A0K.A0D = str6;
        A0K.A0A(new C36523G8v(1, context, ji9, interfaceC106354qp, c38621GyO));
        AbstractC25233BEq.A1F(A0K);
    }

    public static final void A00(Context context, Drawable drawable, JI9 ji9, InterfaceC106354qp interfaceC106354qp, C38621GyO c38621GyO, UserSession userSession, IgLinearLayout igLinearLayout, C38321qM c38321qM, C75113Zb c75113Zb, C64452w4 c64452w4, Integer num, String str, int i) {
        if (interfaceC106354qp != null && interfaceC106354qp.getText() != null && interfaceC106354qp.Anq() != null) {
            KKG kkg = new KKG(context, new C45064Jwt(Integer.valueOf(i), interfaceC106354qp.getText(), str, AbstractC53242c7.A07(context), R.drawable.afi_ini_segmented_pill_background, R.style.afi_ini_segmented_pill_text, 0, 8, AbstractC13620mo.A02(context)));
            C0fQ.A00(new ViewOnClickListenerC42017Ijm(context, drawable, ji9, interfaceC106354qp, c38621GyO, userSession, c38321qM, c75113Zb, c64452w4, num, 1), kkg);
            if (igLinearLayout.getChildCount() < 1) {
                igLinearLayout.addView(kkg);
            }
        }
    }

    public static final void A01(Context context, Drawable drawable, JI9 ji9, InterfaceC106354qp interfaceC106354qp, C38621GyO c38621GyO, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, IgdsButton igdsButton, C64452w4 c64452w4, Integer num, String str, boolean z) {
        String str2;
        if (igdsButton != null) {
            AbstractC56952jT.A01(igdsButton);
            String str3 = null;
            if (interfaceC106354qp != null) {
                str2 = interfaceC106354qp.getText();
            } else {
                str2 = null;
            }
            igdsButton.setContentDescription(str2);
            if (interfaceC106354qp != null) {
                str3 = interfaceC106354qp.getText();
            }
            igdsButton.setText(str3);
            C0fQ.A00(new ViewOnClickListenerC42017Ijm(context, drawable, ji9, interfaceC106354qp, c38621GyO, userSession, c38321qM, c75113Zb, c64452w4, num, 2), igdsButton);
            if (z) {
                Integer A05 = AbstractC65877Tvg.A05(str);
                if (A05 != null) {
                    igdsButton.A02(EnumC99774dy.A03, A05.intValue());
                    igdsButton.setIconPadding(context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                    return;
                }
                return;
            }
            igdsButton.A02(EnumC99774dy.A02, 0);
        }
    }

    public static final void A03(JI9 ji9, InterfaceC106354qp interfaceC106354qp, C38621GyO c38621GyO) {
        String Anq;
        String str;
        InterfaceC106354qp interfaceC106354qp2;
        if (interfaceC106354qp != null && (Anq = interfaceC106354qp.Anq()) != null) {
            ji9.CmG(Anq);
            C146106i8 A0H = AbstractC37304Gc5.A0H();
            if (c38621GyO != null && (interfaceC106354qp2 = c38621GyO.A01) != null) {
                str = interfaceC106354qp2.B1v();
            } else {
                str = null;
            }
            A0H.A0D = str;
            A0H.A0A(new P3D(1));
            AbstractC25233BEq.A1F(A0H);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str) {
        Integer num2;
        C34H.A00(C05F.A09);
        if (C14360o3.A0K(str, "see_more")) {
            num2 = C05F.A0B;
        } else {
            if (C14360o3.A0K(str, "see_less")) {
                num2 = C05F.A0A;
            }
            if (!C14360o3.A0K(str, "see_more") && c38321qM != null && c75113Zb != null && num == C05F.A0C) {
                AbstractC40693I1z.A00(userSession, num);
                return;
            }
            return;
        }
        C34H.A00(num2);
        if (!C14360o3.A0K(str, "see_more")) {
        }
    }
}
