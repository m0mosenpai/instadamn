package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class N7N extends AbstractC59962oe implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LimitsPlusMainFragment";
    public long A00;
    public View A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131965180;
        if (AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(this.A04), 36326219209258745L).booleanValue()) {
            i = 2131965130;
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(i));
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "limitsplus_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        C14360o3.A0B(view, 0);
        C18920wW A02 = AbstractC12220kQ.A02(AbstractC166987dD.A0o(this.A04));
        String A0e = AbstractC31175DnJ.A0e(this.A05);
        boolean A1Z = AbstractC167007dF.A1Z(this.A02);
        String A0e2 = AbstractC31175DnJ.A0e(this.A03);
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC50523MSb.A1S(A1G);
        if (A1Z) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        if (1 - num.intValue() != 0) {
            str = "v2_customizable";
        } else {
            str = "v2_not_customizable";
        }
        A1G.put("version", str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "instagram_wellbeing_limited_interactions_impression");
        MSX.A1H(A0f, A0e);
        A0f.AAP("entrypoint", A0e2);
        AbstractC50523MSb.A12(A0f, "surface", "main_setting", A1G);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.limits_plus_main_fragment_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_limits_refresh);
        igdsHeadline.setHeadline(2131965196);
        igdsHeadline.setBody(2131965166);
        A00(view, this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(view, viewLifecycleOwner, c07s, this, null, 44), C07Y.A00(viewLifecycleOwner));
        View findViewById = view.findViewById(R.id.limits_plus_main_fragment_scrollview);
        this.A01 = findViewById;
        View findViewById2 = view.findViewById(R.id.limits_plus_bottom_button_layout);
        findViewById2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55474OkT(4, findViewById, findViewById2));
    }

    public static final void A00(View view, N7N n7n) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        OUV ouv = (OUV) ((C50896MeR) n7n.A06.getValue()).A00.getValue();
        if (ouv != null) {
            C5QE c5qe = ouv.A03;
            String str7 = null;
            if (c5qe != null) {
                str = JQ0.A0i(n7n, c5qe);
            } else {
                str = null;
            }
            C5QE c5qe2 = ouv.A06;
            if (c5qe2 != null) {
                str2 = JQ0.A0i(n7n, c5qe2);
            } else {
                str2 = null;
            }
            C5QE c5qe3 = ouv.A05;
            if (c5qe3 != null) {
                str3 = JQ0.A0i(n7n, c5qe3);
            } else {
                str3 = null;
            }
            C5QE c5qe4 = ouv.A00;
            if (c5qe4 != null) {
                str4 = JQ0.A0i(n7n, c5qe4);
            } else {
                str4 = null;
            }
            C5QE c5qe5 = ouv.A01;
            if (c5qe5 != null) {
                str5 = JQ0.A0i(n7n, c5qe5);
            } else {
                str5 = null;
            }
            C5QE c5qe6 = ouv.A02;
            if (c5qe6 != null) {
                str6 = JQ0.A0i(n7n, c5qe6);
            } else {
                str6 = null;
            }
            C5QE c5qe7 = ouv.A04;
            if (c5qe7 != null) {
                str7 = JQ0.A0i(n7n, c5qe7);
            }
            boolean z = ouv.A07;
            boolean z2 = ouv.A09;
            IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.limits_plus_main_fragment_headline);
            igdsHeadline.setHeadline(str2);
            igdsHeadline.setBody(str3);
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.limits_plus_bottom_button_layout);
            igdsBottomButtonLayout.setPrimaryAction(str4, new ViewOnClickListenerC55463OkI(n7n, 13));
            igdsBottomButtonLayout.setFooterText(str5);
            if (z) {
                IgdsListCell igdsListCell = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_what_row);
                igdsListCell.setTextCellType(EnumC53237Nga.A04);
                igdsListCell.A05(R.drawable.instagram_comment_pano_outline_24);
                AbstractC31180DnO.A1D(n7n, igdsListCell, 2131965206);
                if (str7 != null) {
                    igdsListCell.A0H(str7);
                }
                ViewOnClickListenerC55463OkI.A00(igdsListCell, 14, n7n);
                AbstractC56952jT.A01(igdsListCell);
            }
            IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_who_row);
            if (!z2) {
                igdsListCell2.A04();
            }
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A04;
            igdsListCell2.setTextCellType(enumC53237Nga);
            igdsListCell2.A05(R.drawable.instagram_user_pano_outline_24);
            AbstractC31180DnO.A1D(n7n, igdsListCell2, 2131965221);
            if (str6 != null) {
                igdsListCell2.A0H(str6);
            }
            if (z2) {
                igdsListCell2.A0F(EnumC53160NfF.A06);
            }
            igdsListCell2.A0C(new Ok5(11, n7n, z));
            AbstractC56952jT.A01(igdsListCell2);
            IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_when_row);
            igdsListCell3.setTextCellType(enumC53237Nga);
            igdsListCell3.A05(R.drawable.instagram_timer_pano_outline_24);
            AbstractC31180DnO.A1D(n7n, igdsListCell3, 2131965210);
            if (str != null) {
                igdsListCell3.A0H(str);
            }
            C0fQ.A00(new Ok5(12, n7n, z), igdsListCell3);
            AbstractC56952jT.A01(igdsListCell3);
        }
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
        View view = this.A01;
        if (view == null || AbstractC43592JPx.A1X(view)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7N() {
        C57511Pfl c57511Pfl = new C57511Pfl(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57511Pfl(new C57511Pfl(this, 7), 8));
        this.A06 = AbstractC25225BEi.A0a(new C57511Pfl(A00, 9), c57511Pfl, new C29895DGj(0, null, A00), AbstractC25225BEi.A1D(C50896MeR.class));
        this.A05 = C57511Pfl.A00(this, 6);
        this.A03 = C57511Pfl.A00(this, 5);
        this.A02 = C57511Pfl.A00(this, 4);
        this.A04 = AbstractC60492pY.A02(this);
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
        C141796aw A00;
        InterfaceC16620sF pYu;
        int A02 = C0f9.A02(-1520707617);
        super.onCreate(bundle);
        boolean z = requireArguments().getBoolean("saved_state");
        InterfaceC09390do interfaceC09390do = this.A06;
        if (z) {
            C50896MeR c50896MeR = (C50896MeR) interfaceC09390do.getValue();
            boolean z2 = requireArguments().getBoolean("is_enabled");
            boolean z3 = requireArguments().getBoolean("non_followers");
            boolean z4 = requireArguments().getBoolean("new_followers");
            boolean z5 = requireArguments().getBoolean("non_close_friends");
            long j = requireArguments().getLong("reminder_date");
            long j2 = requireArguments().getLong("start_date");
            boolean z6 = requireArguments().getBoolean("some_interactions");
            boolean z7 = requireArguments().getBoolean("most_interactions");
            boolean z8 = requireArguments().getBoolean("feature_customization_enabled");
            A00 = AbstractC141776au.A00(c50896MeR);
            pYu = new LimitsPlusViewModel$savePreviouslyFetchedData$1(c50896MeR, null, j, j2, z2, z3, z4, z5, z6, z7, z8);
        } else {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
            A00 = AbstractC141776au.A00(A0Z);
            pYu = new PYu(A0Z, null, 18);
        }
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pYu, A00);
        AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(interfaceC09390do);
        String A0e = AbstractC31175DnJ.A0e(this.A05);
        AbstractC23641Du.A05(anonymousClass191, new MCF(A0Z2, A0e, null, 37), AbstractC141776au.A00(A0Z2));
        C0f9.A09(-1983597902, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(178959092);
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.limits_plus_main_fragment_layout, false);
        C0f9.A09(-2033540216, A02);
        return A0C;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1534274994);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(-265042184, A02);
    }
}
