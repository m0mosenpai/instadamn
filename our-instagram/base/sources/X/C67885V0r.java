package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.V0r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67885V0r extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteMediaPickerFragment";
    public IgdsBottomButtonLayout A00;
    public W4U A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966121);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_media_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        AbstractC31179DnN.A1J(this, 8);
        super.onConfigurationChanged(configuration);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("coupon_offer_id", A00().A02);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00().A03);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgdsBottomButtonLayout) view.requireViewById(R.id.action_button);
        ViewPager2 viewPager2 = (ViewPager2) AbstractC166997dE.A0R(view, R.id.media_picker_view_pager);
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) AbstractC166997dE.A0R(view, R.id.media_type_segmented_tab);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C47673L3g(null, null, null, 2131966118, true));
        arrayList.add(new C47673L3g(null, null, null, 2131966135, true));
        arrayList.add(new C47673L3g(null, null, null, 2131966120, true));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C47673L3g c47673L3g = (C47673L3g) it.next();
            C14360o3.A0B(c47673L3g, 0);
            igSegmentedTabLayout2.A01(null, c47673L3g);
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0C(userSession, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        viewPager2.setAdapter(new UKJ(this, userSession, arrayList));
        igSegmentedTabLayout2.setViewPager(viewPager2);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryAction(getString(2131968535), new WNO(this, 11));
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(AbstractC167007dF.A1W(A00().A01));
                AbstractC43594JPz.A0N(interfaceC09390do).A0S(VG4.A11.toString(), "start_media_selection_1");
                return;
            }
        }
        C14360o3.A0F("bottomButtonLayout");
        throw C00O.createAndThrow();
    }

    public final W4U A00() {
        W4U w4u = this.A01;
        if (w4u != null) {
            return w4u;
        }
        C14360o3.A0F("mediaPickerState");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A02.getValue();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            super.onActivityResult(i, i2, intent);
        }
        if (i == 17) {
            if (i2 == 1793 || i2 == 1797) {
                AbstractC25231BEo.A0c(requireActivity(), this.A02).A06();
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        UserSession userSession = (UserSession) this.A02.getValue();
        C14360o3.A0C(userSession, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "promote_media_picker";
            C0w9.A03("promote_media_picker", "Missing entry point when enter promote creation");
        }
        C14360o3.A0B(userSession, 0);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, AbstractC43591JPw.A00(1259));
        if (A00.isSampled()) {
            AbstractC65702TsY.A1F(A00, "boost_posts");
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "media_selection");
            A00.AAP("fb_user_id", userSession.userId);
            A00.Cht();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        int A02 = C0f9.A02(-255536416);
        if (bundle != null) {
            string = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC153636vY.A03(bundle, string, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            string2 = bundle.getString("coupon_offer_id");
        } else {
            string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (string == null) {
                string = "promote_media_picker";
                C0w9.A03("promote_media_picker", "Missing entry point when enter promote creation");
            }
            string2 = requireArguments().getString("coupon_offer_id");
        }
        this.A01 = new W4U(string, string2);
        AbstractC43594JPz.A1Q(this, A00().A04);
        super.onCreate(bundle);
        C0f9.A09(-2038448048, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(212073393);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_media_picker_revamp_fragment, false);
        C0f9.A09(2078827268, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1228150663);
        AbstractC31179DnN.A1J(this, 8);
        super.onResume();
        C0f9.A09(1558141655, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(843426313);
        super.onStop();
        AbstractC31179DnN.A1J(this, 0);
        C0f9.A09(1905639859, A02);
    }
}
