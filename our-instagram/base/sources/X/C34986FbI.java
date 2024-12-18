package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.FbI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34986FbI {
    public static final C34986FbI A00 = new Object();

    public final void A00(UserSession userSession, C2EE c2ee, FRX frx, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        if (c2ee != null) {
            int AdZ = c2ee.AdZ();
            C32067E6t An6 = c2ee.An6();
            C36297Fzr A002 = AbstractC34062F1p.A00(userSession);
            if (AbstractC159197Cf.A01(c2ee)) {
                C36297Fzr.A01(A002, c2ee.C7I(), c2ee.C7q(), "daily_prompt_null_creation_sheet_rendered", "tap", "daily_prompt_button", "thread_view", c2ee.AdZ());
                if (frx != null) {
                    frx.A01(EnumC33364Eox.A03, EnumC33420Epr.A07, null, directThreadKey, c2ee.C7g(), AdZ);
                    return;
                }
                return;
            }
            if (An6 == null) {
                return;
            }
            if (An6.A01()) {
                if (frx == null) {
                    return;
                }
                UserSession userSession2 = frx.A01;
                int i = 2131958980;
                if (C7HD.A02(userSession2)) {
                    i = 2131958979;
                }
                boolean A02 = C7HD.A02(userSession2);
                int i2 = 2131958978;
                if (A02) {
                    i2 = 2131958977;
                }
                Activity activity = frx.A00;
                C193328hC A0H = AbstractC31171DnF.A0H(activity);
                AbstractC31172DnG.A1C(activity, A0H, i);
                AbstractC31173DnH.A16(activity, A0H, i2);
                A0H.A0S(new DialogInterfaceOnClickListenerC35450Fk7(9, An6, frx, c2ee), EnumC193348hE.A03, 2131958976);
                A0H.A0D(DialogInterfaceOnClickListenerC35415FjY.A00);
                AbstractC31178DnM.A1R(A0H, true);
                return;
            }
            if (An6.A01() || An6.A05) {
                return;
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36328070340492441L)) {
                if (frx != null) {
                    frx.A00(EnumC33364Eox.A03, EnumC33420Epr.A07, An6, c2ee, directThreadKey);
                }
            } else if (frx != null) {
                int i3 = 2131958982;
                if (C7HD.A02(frx.A01)) {
                    i3 = 2131958981;
                }
                Activity activity2 = frx.A00;
                C193328hC A0H2 = AbstractC31171DnF.A0H(activity2);
                AbstractC31172DnG.A1C(activity2, A0H2, i3);
                A0H2.A0S(new DialogInterfaceOnClickListenerC35450Fk7(10, An6, frx, c2ee), EnumC193348hE.A03, 2131958976);
                A0H2.A0D(DialogInterfaceOnClickListenerC35455FkC.A00(c2ee, frx, 24));
                AbstractC31178DnM.A1R(A0H2, true);
            }
            A002.A03(c2ee.C7I(), c2ee.C7q(), c2ee.AdZ());
        }
    }
}
