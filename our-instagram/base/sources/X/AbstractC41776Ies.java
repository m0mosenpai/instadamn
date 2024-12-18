package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ies, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41776Ies {
    public static final C42106IlG A00 = new C42106IlG(1);

    public static final Intent A00(Context context, String str) {
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(AbstractC08820cl.A01(A00, str));
        C14360o3.A07(data);
        if ((AbstractC002300n.A0h(str, "market://", false) || AbstractC002300n.A0h(str, "https://play.google.com/", false)) && AbstractC14490oL.A0F(context)) {
            data.setPackage("com.android.vending");
        }
        return data;
    }

    public static final void A01(Activity activity, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(activity, 0);
        if (AbstractC002300n.A0h(str, AbstractC111324zv.A00(1014), false)) {
            A03(activity, str);
        } else {
            SimpleWebViewActivity.A02.A02(activity, abstractC12990ll, new SimpleWebViewConfig(AbstractC63260SgI.A02(activity, C1HO.A03(str)), (String) null, (String) null, str2, false, false, true, true, false, true, false, true, false, false, false, false));
        }
    }

    public static final void A02(Context context, String str) {
        C14360o3.A0B(str, 1);
        if (!C12260kU.A0B(context, A00(context, str))) {
            C9GR.A07(context, 2131977036);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00bf, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(androidx.fragment.app.FragmentActivity r14, com.instagram.common.session.UserSession r15, X.EnumC906041v r16, X.INK r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41776Ies.A06(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.41v, X.INK, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, EnumC906041v enumC906041v, C2Fb c2Fb, String str, String str2, String str3, String str4, String str5, List list) {
        String str6 = str2;
        AbstractC25233BEq.A0w(2, str, enumC906041v, str6);
        C14360o3.A0B(str3, 6);
        if (EnumC906041v.AD_DESTINATION_WEB == enumC906041v) {
            if (c2Fb == null) {
                c2Fb = C2Fb.A0l;
            }
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, c2Fb, str, false);
            if (list == null) {
                list = C16930sl.A00;
            }
            c63397SjR.A0T = Collections.unmodifiableList(list);
            c63397SjR.A0o = true;
            if (str6.length() == 0) {
                str6 = null;
            }
            c63397SjR.A0C(str6);
            c63397SjR.A0B(str4);
            c63397SjR.A0D(str5);
            c63397SjR.A0S = str3;
            c63397SjR.A0A();
            return;
        }
        A06(fragmentActivity, userSession, enumC906041v, null, str, null, null);
    }

    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, C2Fb c2Fb, Product product, String str, String str2, String str3, String str4, List list) {
        C2Fb c2Fb2 = c2Fb;
        AbstractC167017dG.A1P(userSession, product);
        C14360o3.A0B(str2, 5);
        String str5 = product.A0F;
        if (str5 != null) {
            if (c2Fb == null) {
                c2Fb2 = C2Fb.A2v;
            }
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, c2Fb2, str5, false);
            if (list == null) {
                list = C16930sl.A00;
            }
            c63397SjR.A0T = Collections.unmodifiableList(list);
            c63397SjR.A0C(str);
            String str6 = product.A0H;
            C14360o3.A0B(str6, 0);
            c63397SjR.A1L.A00.putString("TrackingInfo.ARG_PRODUCT_ID", str6);
            c63397SjR.A0F(null);
            c63397SjR.A0S = str2;
            c63397SjR.A0B(str3);
            c63397SjR.A0D(str4);
            c63397SjR.A0A();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, C2Fb c2Fb, String str, String str2) {
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC167027dH.A0a(1, userSession, str, c2Fb, str2);
        C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, c2Fb, str, false);
        c63397SjR.A0S = str2;
        c63397SjR.A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e3, code lost:
    
        if (r2 != 3) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(androidx.fragment.app.FragmentActivity r18, com.instagram.common.session.UserSession r19, X.C2Fb r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41776Ies.A0A(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.2Fb, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void A0B(FragmentActivity fragmentActivity, UserSession userSession, Product product, String str, String str2, String str3) {
        AbstractC167007dF.A1K(fragmentActivity, userSession);
        C14360o3.A0B(str3, 5);
        String str4 = product.A0F;
        if (str4 != null) {
            C63397SjR c63397SjR = new C63397SjR(fragmentActivity, userSession, C2Fb.A2v, str4, false);
            c63397SjR.A0C(str);
            String str5 = product.A0H;
            C14360o3.A0B(str5, 0);
            C58877QEn c58877QEn = c63397SjR.A1L;
            c58877QEn.A00.putString("TrackingInfo.ARG_PRODUCT_ID", str5);
            String A0d = AbstractC37302Gc3.A0d(product);
            C14360o3.A0A(A0d);
            C14360o3.A0B(A0d, 0);
            c58877QEn.A00.putString("TrackingInfo.ARG_MERCHANT_ID", A0d);
            c63397SjR.A0F(str2);
            c63397SjR.A0S = str3;
            c63397SjR.A0A();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0C(Activity activity, UserSession userSession, String str, String str2) {
        android.net.Uri A01;
        C14360o3.A0B(activity, 0);
        AbstractC25233BEq.A0v(1, userSession, str, str2);
        if (AbstractC166987dD.A1a(C63357SiE.A01(activity, null, C63357SiE.A00(userSession, str, str2), userSession, str, false).A00)) {
            return true;
        }
        C14J A002 = C14J.A04.A00();
        if (A002 == null || A002.A00(userSession, str) == null || (A01 = AbstractC08820cl.A01(A00, str)) == null) {
            return false;
        }
        Intent A04 = C14H.A03.A00().A04(activity, A01);
        A04.putExtra(AbstractC111324zv.A00(193), true);
        return C12260kU.A0C(activity, A04);
    }

    public static final boolean A0D(Context context, UserSession userSession, INK ink, String str, int i) {
        if (userSession != null && ink != null) {
            UserSession userSession2 = ink.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession2, 36323564919467387L)) {
                C1QT A002 = C1QS.A00(userSession);
                long flowStartForMarker = A002.flowStartForMarker(i, "openUrlHelper", false);
                boolean z = false;
                if (AbstractC002300n.A0h(str, "market://details", false) || AbstractC002300n.A0h(str, "https://play.google.com/d", false) || AbstractC002300n.A0h(str, "http://play.google.com/store/apps/details", false) || AbstractC002300n.A0h(str, "https://play.google.com/store/apps/details", false)) {
                    z = true;
                }
                if (!z) {
                    A002.flowEndCancel(flowStartForMarker, "is_url_eligible_for_hsdp");
                } else {
                    A002.flowMarkPoint(flowStartForMarker, "is_url_eligible_for_hsdp");
                    String str2 = "is_store_available";
                    if (AbstractC14490oL.A0F(context)) {
                        A002.flowMarkPoint(flowStartForMarker, "is_store_available");
                        String A04 = C18U.A04(c06090Tz, userSession2, 36886514872943325L);
                        String A05 = AbstractC14490oL.A05(ink.A00, "com.android.vending");
                        boolean z2 = false;
                        if (A05 != null && A05.compareTo(A04) >= 0) {
                            z2 = true;
                        }
                        str2 = "is_min_google_play_version_supported";
                        if (z2) {
                            A002.flowMarkPoint(flowStartForMarker, "is_min_google_play_version_supported");
                            str2 = "is_last_update_by_GP";
                            if (ink.A02()) {
                                A002.flowMarkPoint(flowStartForMarker, "is_last_update_by_GP");
                                A002.flowEndSuccess(flowStartForMarker);
                                return true;
                            }
                        }
                    }
                    A002.flowEndCancel(flowStartForMarker, str2);
                    return false;
                }
            }
        }
        return false;
    }

    public static void A04(Intent intent, C0f5 c0f5, String str, String str2) {
        c0f5.ABW(str, str2);
        c0f5.ABW("intent", String.valueOf(intent.getData()));
    }

    public static final void A05(Intent intent, String str, String str2) {
        C0f5 AEp = C18950wb.A01.AEp("openAdDeepLinkUrl failed", 817893089);
        AEp.ABW(DialogModule.KEY_MESSAGE, str2);
        AEp.ABW("url", str);
        AEp.ABW("urlType", String.valueOf(intent.getData()));
        AEp.report();
    }

    public static final void A03(Context context, String str) {
        AbstractC167017dG.A1N(context, str);
        if (!C12260kU.A0A(context, A00(context, str))) {
            C9GR.A07(context, 2131977036);
        }
    }
}
