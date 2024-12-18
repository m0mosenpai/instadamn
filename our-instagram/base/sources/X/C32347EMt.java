package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.EMt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32347EMt extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "UniversalCreationMenuFragment";
    public C66362zD A00;
    public C34474FHm A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public RecyclerView A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final String A0A = "universal_creation_menu";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C34474FHm c34474FHm = this.A01;
        if (c34474FHm == null) {
            if (getActivity() != null) {
                AbstractC31174DnI.A0I(this).A0b();
                return;
            }
        } else {
            this.A00 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new EXP(AbstractC166987dD.A0r(this.A09), c34474FHm));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!this.A02) {
            A00(C05F.A0N, A1E);
        }
        A00(C05F.A00, A1E);
        InterfaceC09390do interfaceC09390do = this.A09;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36323431775874285L)) {
            A00(C05F.A03, A1E);
        }
        if (!this.A03) {
            A00(C05F.A01, A1E);
        }
        if (!this.A07) {
            if (!C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36319068088769442L)) {
                A00(C05F.A0C, A1E);
            }
            if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36326391008016227L)) {
                A00(C05F.A04, A1E);
            }
            A00(C05F.A0Y, A1E);
            if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36324011596459817L)) {
                A00(C05F.A0j, A1E);
                if (C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36330101859893947L)) {
                    boolean A06 = C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36324011599540032L);
                    C57312k6 A00 = C07Y.A00(this);
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    if (A06) {
                        CXE.A00(A0r, A00);
                    } else {
                        CXE.A01(A0r, A00);
                    }
                }
            }
            if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36318307880081501L) && !C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36329504859308409L)) {
                A00(C05F.A0u, A1E);
            }
            C08730cb c08730cb = C17060sy.A01;
            if (AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A1J()) {
                A00(C05F.A15, A1E);
            }
            if (AbstractC31177DnL.A1b(AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A03.CPq()) && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36313544760756317L)) {
                A00(C05F.A1F, A1E);
                AbstractC55215Oed.A07(this, AbstractC166987dD.A0r(interfaceC09390do), "create_fundraiser_cell", "PROFILE_COMPOSER", null, null, null);
            }
            if (this.A04) {
                A00(C05F.A02, A1E);
            }
        }
        if (this.A06 && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36314871909387143L) && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36314871906241406L)) {
            A00(C05F.A1I, A1E);
        }
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(A1E);
        C66362zD c66362zD = this.A00;
        if (c66362zD != null) {
            c66362zD.A05(A0E);
        }
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        AbstractC31174DnI.A15(A0F.getContext(), A0F);
        A0F.setAdapter(this.A00);
        this.A08 = A0F;
        if (this.A05) {
            UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
            if (C5SJ.A01(A0K) && C5SJ.A02(A0K)) {
                C142846ck A0V = AbstractC31176DnK.A0V(interfaceC09390do);
                int A002 = AbstractC34071F1z.A00(AbstractC166987dD.A0r(interfaceC09390do), null);
                ChannelCreationSource channelCreationSource = ChannelCreationSource.A0A;
                A0V.A0E(channelCreationSource, A002);
                AbstractC34060F1n.A00(AbstractC166987dD.A0r(interfaceC09390do)).A06(channelCreationSource);
                return;
            }
        }
        if (this.A05 && C5SJ.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            AbstractC31176DnK.A0V(interfaceC09390do).A0E(ChannelCreationSource.A0A, AbstractC34071F1z.A00(AbstractC166987dD.A0r(interfaceC09390do), null));
        } else {
            if (!this.A05 || !AbstractC2051496e.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
                return;
            }
            C36299Fzu A003 = AbstractC34060F1n.A00(AbstractC166987dD.A0r(interfaceC09390do));
            C25531Mh A004 = C36299Fzu.A00(A003);
            if (!AbstractC25226BEj.A1Z(A004)) {
                return;
            }
            AbstractC31178DnM.A1F(A004, A003.A03);
            AbstractC31174DnI.A1J(A004, "create_social_channel_button_rendered");
            A004.A0o("profile_view");
            AbstractC31175DnJ.A1D(A004, "profile");
            A004.Cht();
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static void A00(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new C36190Fy4(num));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A08;
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0A;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (X.C5SJ.A00(X.AbstractC166987dD.A0r(r4)) == false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -64119302(0xfffffffffc2d9dfa, float:-3.605886E36)
            int r5 = X.C0f9.A02(r0)
            super.onCreate(r7)
            android.os.Bundle r1 = r6.requireArguments()
            java.lang.String r0 = "show_only_main_options"
            boolean r0 = r1.getBoolean(r0)
            r6.A07 = r0
            java.lang.String r0 = "is_group_profile"
            boolean r0 = r1.getBoolean(r0)
            r6.A06 = r0
            java.lang.String r0 = "hide_stories"
            boolean r0 = r1.getBoolean(r0)
            r6.A03 = r0
            java.lang.String r0 = "hide_reels"
            boolean r0 = r1.getBoolean(r0)
            r6.A02 = r0
            X.0do r4 = r6.A09
            X.0ll r3 = X.AbstractC166987dD.A0o(r4)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315859748785813(0x810515000a0e95, double:3.0296341651373856E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r6.A05 = r0
            if (r0 == 0) goto L4e
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            boolean r1 = X.C5SJ.A00(r0)
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            r6.A04 = r0
            r0 = -30621228(0xfffffffffe2cc1d4, float:-5.7408407E37)
            X.C0f9.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32347EMt.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1001939059);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, null, R.layout.layout_universal_creation_menu, false);
        C0f9.A09(1172142976, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-466282741);
        super.onDestroyView();
        RecyclerView recyclerView = this.A08;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        RecyclerView recyclerView2 = this.A08;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(null);
        }
        this.A08 = null;
        this.A00 = null;
        C0f9.A09(-1300651016, A02);
    }
}
