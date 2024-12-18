package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FXt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34859FXt {
    public static Dialog A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, GZV gzv, Integer num, String str, String str2) {
        boolean A1r;
        FOH foh = new FOH(context, user, new FO5(context, interfaceC11380iw, new C31714DwJ(gzv, 11), userSession, user, gzv, str, str2), num);
        Context context2 = foh.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context2);
        User user2 = foh.A03;
        A0I.A05 = AbstractC31178DnM.A0c(context2, user2, 2131968090);
        A0I.A0r(AnonymousClass001.A0g(context2.getString(2131968085), " ", AbstractC167007dF.A0f(context2, AbstractC13180m4.A00(AbstractC12290kX.A00), 2131968084)));
        Integer num2 = foh.A05;
        Integer num3 = C05F.A0C;
        int i = 2131968087;
        if (num2 == num3) {
            i = 2131968089;
        }
        A0I.A0Z(foh.A08, foh.A02, context2.getString(i), true);
        A0I.A0Y(foh.A06, EnumC193348hE.A04, context2.getString(2131954754), true);
        A0I.A0s(true);
        A0I.A0t(true);
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                A1r = user2.A1p();
            }
            Dialog A02 = A0I.A02();
            C0fJ.A00(A02);
            return A02;
        }
        A1r = user2.A1r();
        if (!A1r) {
            int i2 = 2131968086;
            if (num2 == num3) {
                i2 = 2131968088;
            }
            A0I.A0X(foh.A07, foh.A01, context2.getString(i2), true);
        }
        Dialog A022 = A0I.A02();
        C0fJ.A00(A022);
        return A022;
    }

    public static void A01(Context context, Integer num, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                i = 2131968080;
                if (num == C05F.A0C) {
                    i = 2131968082;
                }
            } else {
                i = 2131968081;
            }
        } else {
            i = 2131968078;
            if (z2) {
                i = 2131968079;
            }
        }
        C9GR.A09(context, context.getResources().getString(i));
    }
}
