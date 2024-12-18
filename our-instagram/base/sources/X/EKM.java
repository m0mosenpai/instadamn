package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class EKM extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "SignUpWithBizOptionFragment";
    public TextView A00;
    public AbstractC18680vv A01;
    public CircularImageView A02;
    public FRB A03;
    public String A05;
    public String A06;
    public BusinessFlowAnalyticsLogger A07;
    public final C1P1 A08 = new C32539EUp(this, 35);
    public String A04 = "suma";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sign_up_with_biz_option";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A01, "sign_up_with_biz_option");
        AbstractC18680vv abstractC18680vv = this.A01;
        String str = this.A04;
        C19280xC A00 = F0H.A00(C05F.A00);
        A00.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "sign_up_with_biz_option");
        A00.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A00.A0C("fb_user_id", null);
        if (abstractC18680vv != null) {
            AbstractC31173DnH.A1S(A00, abstractC18680vv);
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1095703127);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0R(this);
        this.A05 = AbstractC34269F9p.A00(this.mArguments);
        if (requireArguments.containsKey(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY)) {
            this.A04 = StringFormatUtil.formatStrLocaleSafe("%s_%s", "suma", requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
        }
        FRB frb = new FRB(this, this.A01);
        this.A03 = frb;
        frb.A00();
        C1QE.A01("business_conversion_flow").A08();
        BusinessFlowAnalyticsLogger A00 = AbstractC151606s6.A00(EnumC151596s5.A03, this, this.A01, AbstractC166997dE.A0n());
        this.A07 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("sign_up_with_biz_option", this.A04, null, null, null, null, null, null));
        }
        C0f9.A09(868138010, A02);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.42o, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-803739848);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.signup_with_biz_option_fragment_layout, AbstractC31180DnO.A05(A0A), true);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.personal_sign_up_button);
        ViewOnClickListenerC31724DwT.A00(A0T, 26, this);
        TextView A0T2 = AbstractC166997dE.A0T(A0A, R.id.business_sign_up_button);
        ViewOnClickListenerC31724DwT.A00(A0T2, 27, this);
        this.A00 = AbstractC166997dE.A0T(A0A, R.id.create_ig_biz_text);
        AbstractC35259Fgt.A05(A0A, this, this.A01, EnumC33445EqI.A05, EnumC31713DwI.A1V, false);
        AbstractC35081Fcs.A00((TextView) A0A.findViewById(R.id.log_in_button), requireContext());
        CallerContext callerContext = C35792FrU.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C1AD.A06(c06090Tz, 18298149818991780L)) {
            AbstractC31172DnG.A1J(A0A, R.id.profile_container, 8);
            AbstractC31172DnG.A1J(A0A, R.id.generic_icon_view, 0);
        } else {
            this.A02 = (CircularImageView) A0A.findViewById(R.id.profile_image_view);
            Context context = getContext();
            C08790ch A00 = AbstractC018607g.A00(this);
            String str = this.A05;
            C1P1 c1p1 = this.A08;
            AbstractC25233BEq.A0v(0, context, str, c1p1);
            C907642p c907642p = new C907642p(FVW.class, "PublicPageInfoQuery", StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", str), true);
            String A06 = AbstractC13670mt.A06("%s|%s", "567067343352427", AbstractC111324zv.A00(2344));
            ?? obj = new Object();
            obj.A06 = A06;
            obj.A09(c907642p);
            C1ON A04 = obj.A04();
            A04.A00 = c1p1;
            C1GJ.A00(context, A00, A04);
        }
        if (C1AD.A06(c06090Tz, 18298149818926243L)) {
            AbstractC31172DnG.A1J(A0A, R.id.grow_ig_biz_title, 0);
            A0T2.setText(2131956926);
            A0T.setText(2131956929);
            this.A00.setText(2131956946);
            AbstractC31172DnG.A1J(A0A, R.id.facebook_badge, 8);
        }
        C0f9.A09(-1699192453, A02);
        return A0A;
    }
}
