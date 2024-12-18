package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.NNj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52563NNj extends N4B implements InterfaceC60442pS, InterfaceC60072op {
    public static final String __redex_internal_original_name = "LeadAdsContextCardFragment";
    public Drawable A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public CircularImageView A06;
    public IgImageView A07;
    public C57112jm A08;
    public IgdsBottomButtonLayout A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C55137Oc5.A00(this);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A08;
        if (c57112jm != null) {
            int i = 0;
            c57112jm.A08(view, C71163Hc.A00(this), new InterfaceC57142jp[0]);
            if (!AbstractC31176DnK.A1b(((NOV) A05()).A0A)) {
                OIU A01 = AbstractC51040Mgq.A01(this);
                InterfaceC58268PsC.A01(AbstractC31178DnM.A06("form_id", A01.A02), A01.A00, A01.A01, "lead_gen_full_page_context_card", "full_page_context_card_impression");
            }
            this.A04 = AbstractC31172DnG.A0X(view, R.id.context_card_title_text_view);
            this.A07 = AbstractC31172DnG.A0Z(view, R.id.background_image);
            this.A06 = AbstractC31173DnH.A0T(view, R.id.profile_image);
            this.A05 = AbstractC31172DnG.A0X(view, R.id.username_text_view);
            this.A02 = AbstractC31172DnG.A0X(view, R.id.follower_number_text_view);
            this.A01 = AbstractC31172DnG.A0X(view, R.id.description_text_view);
            this.A09 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
            CircularImageView circularImageView = this.A06;
            if (circularImageView != null) {
                ViewOnClickListenerC55455Ok9.A01(circularImageView, 70, this);
            }
            IgTextView igTextView = this.A05;
            if (igTextView != null) {
                ViewOnClickListenerC55461OkG.A00(igTextView, 0, this);
            }
            IgTextView igTextView2 = this.A02;
            if (igTextView2 != null) {
                ViewOnClickListenerC55461OkG.A00(igTextView2, 1, this);
            }
            ViewOnClickListenerC55455Ok9.A01(view.requireViewById(R.id.close_icon), 68, this);
            ViewOnClickListenerC55455Ok9.A01(view.requireViewById(R.id.bottom_button_layout), 69, this);
            View A0S = AbstractC166997dE.A0S(view, R.id.gated_content_locked_message_container);
            if (!((NOV) A05()).A00) {
                i = 8;
            }
            A0S.setVisibility(i);
            if (((NOV) A05()).A00) {
                OIU A012 = AbstractC51040Mgq.A01(this);
                InterfaceC58268PsC.A01(AbstractC31178DnM.A06("form_id", A012.A02), A012.A00, A012.A01, "lead_gen_full_page_context_card", "gated_content_locked_message_impression");
            }
            this.A03 = AbstractC31172DnG.A0X(view, R.id.gated_content_locked_message_text_view);
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((NOV) A05()).A02, new C57743PjW(this, 5), 36);
            C57743PjW.A00(getViewLifecycleOwner(), ((NOV) A05()).A01, this, 6, 36);
            C57743PjW.A00(getViewLifecycleOwner(), ((NOV) A05()).A03, this, 7, 36);
            InterfaceC09390do interfaceC09390do = this.A0B;
            UserSession userSession = ((NOV) interfaceC09390do.getValue()).A04;
            C57112jm c57112jm2 = this.A08;
            if (c57112jm2 != null) {
                new ILM(userSession, c57112jm2, this).A00(view, OUA.A05.A00(this.mArguments, EnumC53273NhB.A05, ((NOV) interfaceC09390do.getValue()).A04.token, AbstractC50523MSb.A01(this)));
                IgTextView igTextView3 = this.A04;
                if (igTextView3 != null) {
                    AbstractC77703du.A05(igTextView3, EnumC77673dr.A0T);
                }
                CircularImageView circularImageView2 = this.A06;
                if (circularImageView2 != null) {
                    AbstractC77703du.A05(circularImageView2, EnumC77673dr.A0Q);
                }
                IgTextView igTextView4 = this.A01;
                if (igTextView4 != null) {
                    AbstractC77703du.A05(igTextView4, EnumC77673dr.A02);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
                if (igdsBottomButtonLayout != null) {
                    AbstractC77703du.A05(igdsBottomButtonLayout, EnumC77673dr.A09);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("viewpointManager");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (((NOV) interfaceC09390do.getValue()).A0D) {
            return false;
        }
        C55137Oc5.A00.A03(this, ((NOV) interfaceC09390do.getValue()).A04, ((NOV) interfaceC09390do.getValue()).A0B, ((NOV) interfaceC09390do.getValue()).A0C);
        return true;
    }

    public C52563NNj() {
        C50164MDr c50164MDr = new C50164MDr(this, 46);
        C50164MDr c50164MDr2 = new C50164MDr(this, 39);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C50164MDr(c50164MDr2, 40));
        this.A0B = AbstractC25225BEi.A0a(new C50164MDr(A00, 41), c50164MDr, C57534Pg8.A00(A00, null, 2), AbstractC25225BEi.A1D(NOV.class));
        C50164MDr c50164MDr3 = new C50164MDr(this, 45);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C50164MDr(new C50164MDr(this, 42), 43));
        this.A0A = AbstractC25225BEi.A0a(new C50164MDr(A002, 44), c50164MDr3, C57534Pg8.A00(A002, null, 3), AbstractC25225BEi.A1D(C50992Mfz.class));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return ((NOV) A05()).A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1444093507);
        C14360o3.A0B(layoutInflater, 0);
        this.A08 = AbstractC31180DnO.A0N();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_context_card, viewGroup, false);
        C0f9.A09(11326036, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1586203603);
        super.onDestroyView();
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A02 = null;
        this.A01 = null;
        this.A09 = null;
        this.A03 = null;
        C0f9.A09(-332170700, A02);
    }
}
