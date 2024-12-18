package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45507KCw extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, C51D, InterfaceC60122ou, InterfaceC43440JHe {
    public static final String __redex_internal_original_name = "TrendingAudioFragment";
    public RecyclerView A00;
    public TrackOrOriginalSoundSchema A01;
    public C153756vk A02;
    public C8BO A03;
    public C38337GtX A04;
    public EnumC39549HdL A05;
    public String A06;
    public String A07;
    public InterfaceC678133v A08;
    public boolean A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A03 == C8BO.A06) {
            interfaceC56362iU.EkS(false);
            interfaceC56362iU.Eft(2131975732, R.color.barcelona_story_share_light_mode);
        } else {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Efu(2131975732);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r6 == X.C8BO.A03) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r5 == X.C8BO.A03) goto L11;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45507KCw.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A00() {
        InterfaceC678133v interfaceC678133v = this.A08;
        if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
    }

    @Override // X.InterfaceC43440JHe
    public final void D1Q(HYM hym) {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0B);
        AbstractC166987dD.A1Z(new C57156PZa(A0Z, hym, (InterfaceC23621Ds) null, 20), AbstractC141776au.A00(A0Z));
    }

    @Override // X.InterfaceC43440JHe
    public final void DNP(HYM hym) {
        AbstractC52922bZ A0Z;
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        C8BO c8bo = this.A03;
        if (c8bo != C8BO.A06 && c8bo != C8BO.A03) {
            if (c8bo == C8BO.A02 || c8bo == C8BO.A08 || c8bo == C8BO.A05) {
                A0Z = AbstractC25225BEi.A0Z(this.A0B);
                A00 = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds = null;
                i = 18;
            } else {
                return;
            }
        } else {
            A0Z = AbstractC25225BEi.A0Z(this.A0B);
            A00 = AbstractC141776au.A00(A0Z);
            interfaceC23621Ds = null;
            i = 19;
        }
        AbstractC166987dD.A1Z(new C57156PZa(A0Z, hym, interfaceC23621Ds, i), A00);
    }

    @Override // X.InterfaceC43440JHe
    public final void Di9(HYM hym) {
        ((Gt5) this.A0B.getValue()).A0J(hym);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A05 == EnumC39549HdL.A03) {
            return "ig_creator_inspiration_hub_audio_see_more";
        }
        return "trending_audio_list";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC10360h2 abstractC10360h2;
        if (this.A03 != C8BO.A03 || (abstractC10360h2 = this.mFragmentManager) == null) {
            return false;
        }
        abstractC10360h2.A0b();
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45507KCw() {
        J8Z j8z = new J8Z(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8Z(new J8Z(this, 30), 31));
        this.A0B = AbstractC25225BEi.A0a(new J8Z(A00, 32), j8z, new D8K(28, null, A00), AbstractC25225BEi.A1D(Gt5.class));
        this.A02 = new C153756vk(C8JW.A0a, AbstractC167017dG.A0j());
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C8JW c8jw;
        int A02 = C0f9.A02(1902396574);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = requireArguments.getString(MSV.A00(1538));
        this.A03 = (C8BO) requireArguments.getSerializable("music_selection_source");
        this.A01 = (TrackOrOriginalSoundSchema) requireArguments.getParcelable("audio_from_reel");
        this.A05 = (EnumC39549HdL) requireArguments.getSerializable("trend_report_entrypoint");
        this.A06 = requireArguments.getString("list_type_id");
        this.A09 = requireArguments.getBoolean("should_show_trending_rank_change");
        if (this.A05 == EnumC39549HdL.A03) {
            String A0j = AbstractC167017dG.A0j();
            if (C14360o3.A0K(this.A06, "trending")) {
                c8jw = C8JW.A0K;
            } else if (C14360o3.A0K(this.A06, "popular_with_your_followers")) {
                c8jw = C8JW.A0I;
            } else {
                c8jw = C8JW.A0G;
            }
            this.A02 = new C153756vk(c8jw, A0j);
        }
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0A;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A08 = AbstractC677833s.A00(requireContext, A0r, this, AbstractC43594JPz.A0h(requireContext(), interfaceC09390do), __redex_internal_original_name, AbstractC677833s.A02(A0r));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        Long A0W = AbstractC37302Gc3.A0W(this.A07);
        String str = this.A06;
        C14360o3.A0B(A0o, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "instagram_organic_view_audio_list");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, getModuleName());
            A0f.A9K("container_id", A0W);
            AbstractC37302Gc3.A0t(A0f);
            A0f.AAP("trending_tab_category", str);
            A0f.Cht();
        }
        C0f9.A09(816749460, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(436783398);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.trending_audio_fragment, viewGroup, false);
        C0f9.A09(43752295, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-359662157);
        super.onDestroy();
        InterfaceC678133v interfaceC678133v = this.A08;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A08 = null;
        this.A00 = null;
        C0f9.A09(713287244, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2136327804);
        super.onPause();
        InterfaceC678133v interfaceC678133v = this.A08;
        if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
        C0f9.A09(881720354, A02);
    }
}
