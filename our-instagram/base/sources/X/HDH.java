package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class HDH extends C38K implements InterfaceC62602sz, InterfaceC60442pS, AbsListView.OnScrollListener, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromotionPreviewFragment";
    public UserSession A00;
    public C154796xU A01;
    public C38977HEf A02;
    public String A03;
    public C61142qc A04;
    public AnonymousClass396 A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C61372qz A0C = new C61372qz();

    public static C38321qM A01(C38321qM c38321qM, HDH hdh) {
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        String str3 = null;
        C14360o3.A0B(c38321qM, 1);
        if (hdh.A0B) {
            z2 = true;
        }
        if (hdh.A09) {
            str3 = AbstractC166997dE.A0N(hdh).getString(2131966147);
        }
        if (hdh.A0A) {
            z = true;
        }
        String str4 = hdh.A06;
        if (str4 != null) {
            str = str4;
            if (c38321qM.A5M()) {
                arrayList = AbstractC166987dD.A1E();
                for (int i = 0; i < c38321qM.A0p(); i++) {
                    arrayList.add(A01(c38321qM.A1e(i), hdh));
                }
            }
        }
        if (!TextUtils.isEmpty(hdh.A07)) {
            str2 = hdh.A07;
        }
        return I0G.A00(hdh.A00, null, c38321qM, str, str2, str3, arrayList, z, z2);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(5129);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(this.mFragmentManager.A0L()));
        interfaceC56362iU.setTitle(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object parcelable;
        C71680WyY c71680WyY;
        int i;
        int A02 = C0f9.A02(-1895797076);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        this.A04 = (C61142qc) new C52942bb(new C61122qa(A0S), this).A00(C61142qc.class);
        Bundle requireArguments = requireArguments();
        C1M0 A01 = C1M0.A01.A01(requireArguments.getString(AbstractC111324zv.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD)));
        int i2 = Build.VERSION.SDK_INT;
        String A00 = AbstractC111324zv.A00(3059);
        if (i2 >= 33) {
            parcelable = AbstractC53062bn.A01(requireArguments, AudioOverlayTrack.class, A00);
        } else {
            parcelable = requireArguments.getParcelable(A00);
        }
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) parcelable;
        Context requireContext = requireContext();
        if (requireArguments().getBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_DISPLAY_PROFILE_FEED_TEXT", false)) {
            c71680WyY = new C71680WyY(this, 1);
            i = R.layout.layout_preview_info_for_boost_profile_feed_placement;
        } else {
            c71680WyY = null;
            i = 0;
        }
        C60972qL c60972qL = new C60972qL(requireContext, this.A00, this);
        FragmentActivity requireActivity = requireActivity();
        C61142qc c61142qc = this.A04;
        C155376yQ c155376yQ = new C155376yQ(this.A00);
        C38U c38u = C38U.A00;
        AbstractC25229BEm.A1J(c61142qc, 3, c38u);
        C38977HEf c38977HEf = new C38977HEf(this, requireActivity, null, c61142qc, c155376yQ, c60972qL, null, null, null, c38u, this, A01, c71680WyY, i, false, false, false, false);
        this.A02 = c38977HEf;
        int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        UserSession userSession = this.A00;
        C33N c33n = new C33N(C33O.A00(), audioOverlayTrack, true, false, false, false, false);
        C14360o3.A0B(userSession, 2);
        C33P c33p = new C33P(requireContext, null, userSession, null, this, null, c38977HEf, null, c33n, C05F.A0u, null, false);
        C38977HEf c38977HEf2 = this.A02;
        C42466Ir7 c42466Ir7 = new C42466Ir7(c38977HEf2, c33p);
        AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, this.mFragmentManager, c38977HEf2, c60972qL);
        anonymousClass391.A0G = c33p;
        anonymousClass391.A0A = c42466Ir7;
        anonymousClass391.A0R = A01;
        AnonymousClass396 A002 = anonymousClass391.A00();
        this.A05 = A002;
        this.A0C.A01(A002);
        registerLifecycleListener(this.A05);
        this.A03 = requireArguments().getString(MSV.A00(87));
        this.A06 = requireArguments().getString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_CTA_TEXT");
        this.A09 = requireArguments().getBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_SPONSORED_LABEL");
        this.A0A = requireArguments().getBoolean("com.instgram.android.fragment.ARGUMENTS_KEY_EXTRA_REMOVE_LOCATION");
        this.A0B = requireArguments().getBoolean("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_RESET_FEEDBACK");
        this.A07 = requireArguments().getString("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_OVERRIDE_POLITICAL_CONTEXT", null);
        this.A08 = requireArguments().getString(AbstractC111324zv.A00(368), getString(2131969914));
        this.A01 = AbstractC37302Gc3.A0L(getContext(), this, this.A00);
        C38321qM A022 = C1DW.A00(this.A00).A02(this.A03);
        if (A022 != null) {
            C38321qM A012 = A01(A022, this);
            C75113Zb BRZ = this.A02.BRZ(A012);
            AnonymousClass341 anonymousClass341 = AnonymousClass341.A0O;
            C14360o3.A0B(anonymousClass341, 0);
            BRZ.A0o = anonymousClass341;
            C38977HEf c38977HEf3 = this.A02;
            List singletonList = Collections.singletonList(A012);
            C14360o3.A0B(singletonList, 0);
            c38977HEf3.A04.A0B(singletonList);
            C38977HEf.A00(c38977HEf3);
        } else {
            this.A01.A03(AbstractC2044893h.A04(this.A00, this.A03), new HL9(this, 3));
        }
        A0U(this.A02);
        C0f9.A09(-1737493490, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1432727155);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_feed);
        C0f9.A09(1814448213, A02);
        return A0A;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-964220611);
        this.A0C.onScroll(absListView, i, i2, i3);
        C0f9.A0A(165769134, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-1940918505);
        this.A0C.onScrollStateChanged(absListView, i);
        C0f9.A0A(1415374606, A03);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C1DW.A00(this.A00).A02(this.A03) == null) {
            ((RefreshableListView) AbstractC37300Gc1.A02(this)).setIsLoading(true);
        }
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
    }
}
