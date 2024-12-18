package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.partneranalytics.igfamilyappinstallations.IGFamilyAppInstallationsLogger$maybeLog$1;
import java.util.ArrayList;

/* renamed from: X.2KY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KY implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public final Context A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final InterfaceC19630xq A04;
    public final long A05;

    private final void A00() {
        long j = this.A05;
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.A00 >= j) {
                C18920wW c18920wW = this.A02;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_family_app_installations");
                String str = this.A03.userId;
                C14360o3.A0B(str, 0);
                A00.A9K("ig_user_id", AbstractC003100w.A0k(10, str));
                ArrayList arrayList = new ArrayList();
                Context context = this.A01;
                if (AbstractC14490oL.A0D(context)) {
                    arrayList.add(567067343352427L);
                }
                if (AbstractC14490oL.A0B(context)) {
                    arrayList.add(350685531728L);
                }
                if (AbstractC14490oL.A0H(context, "com.facebook.orca")) {
                    arrayList.add(256002347743983L);
                }
                if (AbstractC14490oL.A0G(context)) {
                    arrayList.add(994766073959253L);
                }
                if (AbstractC14490oL.A0A(context)) {
                    arrayList.add(3419628305025917L);
                }
                if (AbstractC14490oL.A0J(context.getPackageManager(), "com.facebook.lite")) {
                    arrayList.add(275254692598279L);
                }
                A00.AAk("family_apps_installed", arrayList);
                A00.Cht();
                this.A00 = currentTimeMillis;
                C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(568174597, 3));
                IGFamilyAppInstallationsLogger$maybeLog$1 iGFamilyAppInstallationsLogger$maybeLog$1 = new IGFamilyAppInstallationsLogger$maybeLog$1(this, null, currentTimeMillis);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, iGFamilyAppInstallationsLogger$maybeLog$1, A02);
            }
        }
    }

    public C2KY(Context context, UserSession userSession) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A1n, getClass());
        this.A04 = A04;
        this.A00 = A04.getLong("last_logging_time", 0L);
        this.A05 = ((int) C18U.A01(C06090Tz.A05, userSession, 36611980563388765L)) * 1000;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-776638309);
        A00();
        C0f9.A0A(-1198671535, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1804994475);
        A00();
        C0f9.A0A(-2135820183, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
