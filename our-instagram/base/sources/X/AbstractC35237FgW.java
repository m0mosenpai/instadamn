package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FgW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35237FgW {
    public static final void A00(Activity activity, BugReportSource bugReportSource, UserSession userSession) {
        C14360o3.A0B(activity, 0);
        if (!AbstractC46222Ag.A00()) {
            AbstractC31175DnJ.A0N(userSession).A02(activity, ((C28191Xx) AbstractC53854Nri.A00()).A01.CsW(activity, null, bugReportSource, userSession, null, C55782hJ.A0S.A01(userSession), AbstractC25225BEi.A14(), true, false, false));
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        C54748OGw c54748OGw = new C54748OGw(userSession, null);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c54748OGw.A00, MSV.A00(1527));
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A15(A0f, "menu");
        }
        C35166FfG c35166FfG = new C35166FfG(activity);
        c35166FfG.A01(2131972403);
        c35166FfG.A04(new DialogInterfaceOnClickListenerC35359Fia(1, activity, applicationContext, c54748OGw, bugReportSource, userSession), new CharSequence[]{applicationContext.getString(2131951997), applicationContext.getString(2131973286), applicationContext.getString(2131971483)});
        DialogInterfaceOnCancelListenerC35300FhZ dialogInterfaceOnCancelListenerC35300FhZ = new DialogInterfaceOnCancelListenerC35300FhZ(c54748OGw, 10);
        DialogC31731Dwc dialogC31731Dwc = c35166FfG.A0D;
        dialogC31731Dwc.setOnCancelListener(dialogInterfaceOnCancelListenerC35300FhZ);
        dialogC31731Dwc.setCanceledOnTouchOutside(true);
        C0fJ.A00(c35166FfG.A00());
    }

    public static final void A01(Activity activity, BugReportSource bugReportSource, UserSession userSession, String str, String str2) {
        OWg oWg = new OWg();
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 0);
        oWg.A0I = str3;
        oWg.A00 = bugReportSource;
        oWg.A0B = AbstractC25225BEi.A14();
        oWg.A0H = C55782hJ.A0S.A01(userSession);
        BugReport A01 = oWg.A01();
        OJR ojr = new OJR(activity);
        ojr.A01 = str2;
        ojr.A00 = str;
        new NAU(activity, null, ojr.A00(), null, A01, userSession).A02(new Void[0]);
    }

    public static final void A02(Activity activity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(activity, 0);
        AbstractC167027dH.A13(userSession, str, str2);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        String A0R = AnonymousClass001.A0R(str, "_entered");
        C14360o3.A07(A0R);
        AbstractC35091Fd2.A01(null, userSession, "notifications", A0R, null);
        C140966Yy A0P = AbstractC31173DnH.A0P((FragmentActivity) activity, userSession);
        A0P.A0B(A05, AbstractC62818SSq.A01(userSession.token, str, str2));
        A0P.A04();
    }

    public static final void A03(Context context, AbstractC018607g abstractC018607g, UserSession userSession, GZQ gzq, String str, boolean z) {
        Long A01;
        String str2;
        C14360o3.A0B(userSession, 4);
        C4PM A00 = C4PM.A00();
        if (z) {
            A01 = A00.A02(true);
        } else {
            A01 = A00.A01(true);
        }
        C14360o3.A0A(A01);
        String valueOf = String.valueOf(A01.longValue());
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/set_presence_disabled/");
        if (z) {
            str2 = "0";
        } else {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        A0c.A9s(str, str2);
        A0c.A0H(TraceFieldType.RequestID, valueOf);
        C1ON A0D = AbstractC31175DnJ.A0D(A0c, ECZ.class, FWT.class, true);
        A0D.A00 = new ETR(gzq, userSession, context, str, 1, z);
        C1GJ.A00(context, abstractC018607g, A0D);
    }

    public static final void A04(Context context, AbstractC12990ll abstractC12990ll, String str, String str2) {
        String str3 = str;
        C14360o3.A0B(abstractC12990ll, 1);
        if (!AbstractC002300n.A0h(str3, "http", false)) {
            str3 = AbstractC63260SgI.A02(context, C1HO.A03(str3));
        }
        SimpleWebViewActivity.A02.A02(context, abstractC12990ll, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, str2, str3));
    }

    public static final void A05(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton compoundButton, boolean z) {
        AbstractC167017dG.A1O(compoundButton, onCheckedChangeListener);
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
