package X;

import android.app.Activity;
import android.os.Handler;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EUx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32547EUx extends C1P1 {
    public String A00;
    public final Activity A01;
    public final Handler A02;
    public final C83753oK A03;
    public final InterfaceC11380iw A04;
    public final C07270a1 A05;
    public final InterfaceC37227Gac A06;
    public final AbstractC33626Etc A07;
    public final EnumC31713DwI A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final EnumC33404Epb A0D;
    public final android.net.Uri A0E;
    public final C18920wW A0F;

    public final void A02(User user, C1Q9 c1q9) {
        C25531Mh A0A;
        String str = "";
        if (c1q9 == C1Q9.A0w) {
            double A01 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A0F, "log_in_sso"), 336);
            A0A.A0R("waterfall_id", C1Q9.A01());
            A0A.A0R("containermodule", "waterfall_log_in");
            A0A.A0P("elapsed_time", Double.valueOf(A01 - A00));
            A0A.A0p("unknown");
            A0A.A0R("login_userid", user.getId());
            A0A.A0P(TraceFieldType.StartTime, Double.valueOf(A00));
            EnumC31713DwI enumC31713DwI = this.A08;
            if (enumC31713DwI != null) {
                str = enumC31713DwI.A01;
            }
            A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A0A.A0R("guid", AbstractC35274Fh9.A00());
            InterfaceC11380iw interfaceC11380iw = this.A04;
            interfaceC11380iw.getClass();
            A0A.A0m(interfaceC11380iw.getModuleName());
            C07270a1 c07270a1 = this.A05;
            C14360o3.A0B(c07270a1, 0);
            A0A.A0o(AbstractC31179DnN.A0c(c07270a1));
            A0A.A0O("multi_tap_enabled", AbstractC166997dE.A0b());
        } else if (c1q9 == C1Q9.A0x) {
            double A012 = AbstractC31171DnF.A01();
            double A002 = AbstractC31171DnF.A00();
            A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A0F, "ig_log_in"), 235);
            A0A.A0P("current_time", Double.valueOf(A012));
            A0A.A0P("elapsed_time", Double.valueOf(A012 - A002));
            A0A.A0R("guid", AbstractC35274Fh9.A00());
            A0A.A0R("instagram_id", user.getId());
            A0A.A0R("login_type", AbstractC34228F8a.A00(this.A09));
            A0A.A0P(TraceFieldType.StartTime, Double.valueOf(A002));
            EnumC31713DwI enumC31713DwI2 = this.A08;
            if (enumC31713DwI2 != null) {
                str = enumC31713DwI2.A01;
            }
            A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A0A.A0R("waterfall_id", C1Q9.A01());
            A0A.A0R("containermodule", "waterfall_log_in");
            C07270a1 c07270a12 = this.A05;
            C14360o3.A0B(c07270a12, 0);
            A0A.A0o(AbstractC31179DnN.A0c(c07270a12));
        } else {
            C07270a1 c07270a13 = this.A05;
            EnumC31713DwI enumC31713DwI3 = this.A08;
            if (enumC31713DwI3 != null) {
                str = enumC31713DwI3.A01;
            }
            String id = user.getId();
            AbstractC167017dG.A1N(c07270a13, str);
            FD1.A00(c07270a13, null, str, id, null, null, null);
            return;
        }
        A0A.Cht();
    }

    public void A03(UserSession userSession, User user) {
        Activity activity = this.A01;
        activity.getClass();
        AbstractC31525Dt9.A06(activity, this.A0E, this.A04, userSession);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3oK, java.lang.Object] */
    public C32547EUx(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, AbstractC33626Etc abstractC33626Etc, EnumC31713DwI enumC31713DwI, Integer num, String str, String str2, String str3, EnumC33404Epb enumC33404Epb) {
        this.A02 = AbstractC167007dF.A0J();
        this.A03 = new Object();
        this.A00 = "other";
        this.A05 = c07270a1;
        this.A01 = activity;
        this.A08 = enumC31713DwI;
        this.A04 = interfaceC11380iw;
        this.A09 = num;
        this.A0A = str;
        this.A06 = interfaceC37227Gac;
        this.A0E = uri;
        this.A0F = AbstractC12220kQ.A01(interfaceC11380iw, c07270a1);
        this.A0C = str2;
        this.A0B = str3;
        this.A07 = abstractC33626Etc;
        this.A0D = enumC33404Epb;
    }

    public static int A00(C32547EUx c32547EUx, Object obj, int i) {
        int A03 = C0f9.A03(i);
        c32547EUx.A04((EfU) obj);
        return A03;
    }

    public void A04(EfU efU) {
        int i;
        int A03 = C0f9.A03(-1814401752);
        Activity activity = this.A01;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C07270a1 c07270a1 = this.A05;
            C006802i c006802i = C006802i.A0p;
            Integer num = this.A09;
            if (num != null) {
                c006802i.markerAnnotate(2293785, "login_type", AbstractC34228F8a.A00(num));
            }
            C32655EZe c32655EZe = new C32655EZe(efU, this);
            if (C18U.A06(C06090Tz.A05, c07270a1, 36311478881485340L)) {
                C14120nc.A00().ATO(c32655EZe);
            } else {
                c32655EZe.run();
            }
            i = 824890844;
        } else {
            i = 1332225129;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        if ((r4.getCause() instanceof java.lang.SecurityException) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
    
        if (r3.isCheckpointRequired() != false) goto L38;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFail(final X.AbstractC115105If r26) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32547EUx.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C0f9.A0A(-151875483, A00(this, obj, -1616027747));
    }

    public C32547EUx(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI, Integer num, String str) {
        this(activity, uri, interfaceC11380iw, c07270a1, interfaceC37227Gac, null, enumC31713DwI, num, str, null, null, null);
    }
}
