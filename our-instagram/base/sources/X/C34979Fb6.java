package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fb6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34979Fb6 {
    public static final C34979Fb6 A00 = new Object();

    public final void A00(Context context, C148676mc c148676mc, UserSession userSession) {
        String str;
        String str2;
        boolean A1a = AbstractC167017dG.A1a(context, userSession);
        if (new C1Ro(context, context.getPackageManager()).A00.A00() != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317990053353228L) || C18U.A06(c06090Tz, userSession, 36322418163525858L)) {
                if (c148676mc != null && (str2 = c148676mc.A00) != null && c148676mc.A04) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c148676mc.A02, AbstractC111324zv.A00(1951));
                    A0f.A8R(c148676mc.A01, "qp_position");
                    A0f.A8R(EnumC33475ErA.UPDATE_INSTAGRAM, AbstractC111324zv.A00(61));
                    A0f.AAP(AbstractC50529MSi.A01(), str2);
                    A0f.AAP("app_update_source", "preload");
                    A0f.Cht();
                }
                Intent A04 = AbstractC31171DnF.A04();
                A04.setClassName("com.facebook.appmanager", "com.facebook.oxygen.appmanager.ui.landing.StubInstallActivity");
                A04.putExtra("package_name", "com.instagram.android");
                A04.putExtra("update_flow", A1a);
                A04.addFlags(268435456);
                A04.addFlags(Constants.LOAD_RESULT_PGO);
                C0b3.A00().A0B(AbstractC34371FDn.A00).A0G(context, A04);
                return;
            }
        }
        if (c148676mc != null && (str = c148676mc.A00) != null && c148676mc.A04) {
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c148676mc.A02, AbstractC111324zv.A00(1951));
            A0f2.A8R(c148676mc.A01, "qp_position");
            A0f2.A8R(EnumC33475ErA.UPDATE_INSTAGRAM, AbstractC111324zv.A00(61));
            A0f2.AAP(AbstractC50529MSi.A01(), str);
            A0f2.AAP("app_update_source", "google_play_store");
            A0f2.Cht();
        }
        AbstractC14490oL.A07(context, "com.instagram.android", null);
    }
}
