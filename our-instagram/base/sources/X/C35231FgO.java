package X;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.FgO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35231FgO {
    public static final C35231FgO A03 = new Object();
    public InterfaceC37102GWm A00;
    public GY5 A01;
    public C31735Dwo A02;

    public static void A00(Activity activity, AbstractC12990ll abstractC12990ll, C35231FgO c35231FgO, String str) {
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add("android.permission.RECEIVE_SMS");
            AbstractC23451Ch.A04(activity, new C64484TFu(c35231FgO, abstractC12990ll, activity, str, 1), (String[]) A1E.toArray(new String[A1E.size()]));
        }
    }

    public final /* synthetic */ void A04(Activity activity, AbstractC12990ll abstractC12990ll, String str, Map map) {
        if (map.get("android.permission.RECEIVE_SMS") == EnumC172127lh.A05) {
            GY5 gy5 = this.A01;
            gy5.getClass();
            C31735Dwo c31735Dwo = new C31735Dwo(abstractC12990ll, gy5, str);
            this.A02 = c31735Dwo;
            Context applicationContext = activity.getApplicationContext();
            C14360o3.A0B(applicationContext, 0);
            C0DJ.A00(c31735Dwo, applicationContext, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
            double A00 = AbstractC31174DnI.A00(abstractC12990ll, 0);
            double A002 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "sms_permission_allowed");
            AbstractC31179DnN.A16(A0f, A00, A002);
            AbstractC31177DnL.A1G(A0f, "flow", "phone", A002);
            AbstractC31178DnM.A19(A0f, "phone");
            AbstractC35274Fh9.A04(A0f);
            AbstractC35274Fh9.A08(A0f, abstractC12990ll);
            return;
        }
        C35037FcA A06 = C1Q9.A1q.A02(abstractC12990ll).A06(EnumC33445EqI.A06, EnumC31713DwI.A1F);
        A06.A03("os_version", Build.VERSION.SDK_INT);
        A06.A02();
    }

    public static void A01(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, boolean z) {
        AbstractC31180DnO.A1U(context, str, str2);
        String A00 = C16030qx.A00(context);
        String A10 = AbstractC31172DnG.A10(context);
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("accounts/validate_signup_sms_code/");
        A0M.A9s(AbstractC31189DnY.A00(), str);
        A0M.A9s(AbstractC31189DnY.A03(39, 17, 24), str2);
        AbstractC31173DnH.A1O(A0M, A00);
        AbstractC31178DnM.A1K(A0M, "guid", A10);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, EgL.class, FWA.class);
        A0I.A00 = new C32542EUs(context, abstractC12990ll, str, str2, z);
        C1GJ.A03(A0I);
    }

    public static void A02(AbstractC12990ll abstractC12990ll, EnumC31713DwI enumC31713DwI, String str, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_sms_retriever_error");
        if (A0f.isSampled()) {
            double A00 = AbstractC31171DnF.A00();
            double A01 = AbstractC31171DnF.A01();
            A0f.A9K("duration", Long.valueOf(j));
            AbstractC35274Fh9.A0D(A0f, "error_type", str);
            AbstractC31171DnF.A1A(A0f, enumC31713DwI.A01);
            AbstractC31179DnN.A15(A0f);
            AbstractC31177DnL.A1B(A0f, A01, A00);
            C14360o3.A0B(abstractC12990ll, 0);
            AbstractC31177DnL.A1G(A0f, CacheBehaviorLogger.SOURCE, AbstractC31179DnN.A0c(abstractC12990ll), A00);
            A0f.Cht();
        }
    }

    public final void A03(Activity activity, AbstractC12990ll abstractC12990ll, GY5 gy5, EnumC31713DwI enumC31713DwI, String str) {
        InterfaceC37102GWm interfaceC37102GWm;
        C11T.A00();
        AbstractC31180DnO.A1U(activity, str, gy5);
        C11T.A00();
        if (this.A02 != null && this.A01 != null && (interfaceC37102GWm = this.A00) != null && ((C31736Dwp) interfaceC37102GWm).A03.get()) {
            A05(activity);
        }
        this.A01 = gy5;
        AbstractC27461Uz abstractC27461Uz = AbstractC27461Uz.getInstance();
        if (abstractC27461Uz != null && AbstractC14490oL.A0C(activity) && !AbstractC23451Ch.A07(activity, "android.permission.RECEIVE_SMS")) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str2 = enumC31713DwI.A01;
            boolean A1a = AbstractC167017dG.A1a(abstractC12990ll, str2);
            double A01 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_android_sms_retriever_started");
            AbstractC31179DnN.A16(A0f, A01, A00);
            AbstractC35274Fh9.A05(A0f);
            AbstractC35274Fh9.A06(A0f);
            AbstractC31176DnK.A1J(A0f, A00);
            AbstractC31171DnF.A1A(A0f, str2);
            AbstractC31179DnN.A15(A0f);
            AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "release_channel", AbstractC35274Fh9.A01());
            A0f.Cht();
            InterfaceC37102GWm listenForSmsResponse = abstractC27461Uz.listenForSmsResponse(activity, A1a);
            this.A00 = listenForSmsResponse;
            ((C31736Dwp) listenForSmsResponse).A00 = new C36528G9a(activity, abstractC12990ll, gy5, this, enumC31713DwI, str, elapsedRealtime);
            return;
        }
        A00(activity, abstractC12990ll, this, str);
    }

    public final void A05(Context context) {
        InterfaceC37102GWm interfaceC37102GWm;
        C11T.A00();
        context.getClass();
        C11T.A00();
        if (this.A02 != null && this.A01 != null && (interfaceC37102GWm = this.A00) != null && ((C31736Dwp) interfaceC37102GWm).A03.get()) {
            if (this.A01 != null) {
                this.A01 = null;
            }
            InterfaceC37102GWm interfaceC37102GWm2 = this.A00;
            if (interfaceC37102GWm2 != null && ((C31736Dwp) interfaceC37102GWm2).A03.get()) {
                C31736Dwp.A00((C31736Dwp) this.A00);
                this.A00 = null;
            }
            C31735Dwo c31735Dwo = this.A02;
            if (c31735Dwo != null) {
                Context applicationContext = context.getApplicationContext();
                C14360o3.A0B(applicationContext, 0);
                applicationContext.unregisterReceiver(c31735Dwo);
                this.A02 = null;
            }
        }
    }
}
