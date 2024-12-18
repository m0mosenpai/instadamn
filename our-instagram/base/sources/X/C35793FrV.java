package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FrV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35793FrV implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C35793FrV.class);
    public static final String __redex_internal_original_name = "FacebookPageClaimHelper";

    /* JADX WARN: Multi-variable type inference failed */
    public static void A01(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        int i;
        Object[] objArr;
        A03(userSession, str, "claim_page", "claim_page_row");
        C35166FfG c35166FfG = new C35166FfG(context, R.layout.claim_page_dialog, 0);
        DialogC31731Dwc dialogC31731Dwc = c35166FfG.A0D;
        dialogC31731Dwc.setCancelable(true);
        dialogC31731Dwc.setCanceledOnTouchOutside(true);
        DialogC31731Dwc A002 = c35166FfG.A00();
        IgImageView igImageView = (IgImageView) A002.requireViewById(R.id.profile);
        C08730cb c08730cb = C17060sy.A01;
        AbstractC31173DnH.A1T(interfaceC11380iw, igImageView, c08730cb.A01(userSession));
        TextView textView = (TextView) A002.requireViewById(R.id.dialog_content);
        String string = context.getString(2131969307);
        if (z) {
            ((TextView) A002.requireViewById(R.id.dialog_title)).setText(2131956616);
            i = 2131956970;
            objArr = new Object[]{string};
        } else {
            String B8y = c08730cb.A01(userSession).B8y();
            i = 2131955177;
            objArr = new Object[]{B8y, string};
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(context.getString(i, objArr));
        String A01 = AbstractC63260SgI.A01(context, AbstractC111324zv.A00(437));
        int A0F = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
        AbstractC167017dG.A1R(userSession, A01);
        AnonymousClass773.A05(A0H, new C33248Eli(context, userSession, null, A01, A0F), string);
        AbstractC31176DnK.A1G(textView, A0H);
        C0fQ.A00(new ViewOnClickListenerC35673Fp8(fragment, userSession, A002, str, 0), A002.requireViewById(R.id.not_now));
        if (z) {
            ((ViewStub) A002.requireViewById(R.id.middle_connect_page_button)).inflate();
            TextView textView2 = (TextView) A002.requireViewById(R.id.connect_existing_page_button);
            textView2.setText(2131956789);
            C0fQ.A00(new ViewOnClickListenerC35619FoA(A002, fragment, userSession, context, str, 0), textView2);
        }
        if (fragment instanceof DialogInterface.OnCancelListener) {
            A002.setOnCancelListener((DialogInterface.OnCancelListener) fragment);
        }
        C0fJ.A00(A002);
    }

    public static void A02(Fragment fragment, UserSession userSession, Integer num, String str) {
        C45126Jxv c45126Jxv = new C45126Jxv(num, (String) null, (String) null, (String) null, 7);
        Integer num2 = C05F.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        EIM eim = new EIM();
        eim.setArguments(AbstractC34027F0g.A00(c45126Jxv, num2, str));
        AbstractC31177DnL.A0w(null, eim, requireActivity, userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r1.A2H() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.A2H() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0.A00 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r11, androidx.fragment.app.Fragment r12, X.InterfaceC11380iw r13, com.instagram.common.session.UserSession r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "setting"
            r9 = r15
            boolean r0 = X.C2I7.A00(r15, r0)
            r8 = r14
            com.instagram.user.model.User r1 = X.AbstractC166987dD.A10(r14)
            if (r0 == 0) goto L41
            com.facebook.common.callercontext.CallerContext r3 = X.C35793FrV.A00
            java.lang.String r4 = "ig_android_ig_business_asset_ig_business_settings"
            java.lang.String r5 = "ig_settings_business"
            java.lang.String r6 = "settings_business"
            java.lang.String r7 = "loading"
            X.9CN r2 = new X.9CN
            r2.<init>(r3, r4, r5, r6, r7)
            X.97N r0 = X.C97M.A00(r14)
            X.97Q r0 = X.C97N.A00(r0)
            java.lang.Object r0 = r0.AuS(r2)
            X.DuI r0 = (X.C31590DuI) r0
            r10 = 1
            if (r0 == 0) goto L3a
            X.9Im r0 = r0.A00
            if (r0 == 0) goto L3a
        L32:
            r10 = 0
        L33:
            r5 = r11
            r6 = r12
            r7 = r13
            A01(r5, r6, r7, r8, r9, r10)
            return
        L3a:
            boolean r0 = r1.A2H()
            if (r0 == 0) goto L32
            goto L33
        L41:
            X.17P r0 = r1.A03
            java.lang.String r0 = r0.Baz()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L32
            boolean r0 = r1.A2H()
            r10 = 1
            if (r0 != 0) goto L33
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35793FrV.A00(android.content.Context, androidx.fragment.app.Fragment, X.0iw, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public static void A03(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(EnumC151596s5.A07, abstractC12990ll, "facebook_page_claim_helper", AbstractC166997dE.A0n());
        A01.getClass();
        A01.Cm3(new Y7A(str2, str, str3, null, null, null, null, null));
    }
}
