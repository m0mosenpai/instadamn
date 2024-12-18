package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KPs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45813KPs extends KCM implements C51D {
    public static final String __redex_internal_original_name = "EncryptedBackupsMoreOptionsFragment";
    public EnumC46208Kck A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public Integer A03;
    public InterfaceC16820sZ A04 = new MHK(this, 11);
    public ScrollView A05;
    public IgdsBottomButtonLayout A06;
    public IgdsListCell A07;
    public IgdsListCell A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
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
        KCM.A04(view, this);
        IgdsListCell igdsListCell = this.A07;
        if (igdsListCell != null) {
            igdsListCell.A0C(new ViewOnClickListenerC48071LPw(this, 40));
        }
        IgdsListCell igdsListCell2 = this.A08;
        if (igdsListCell2 != null) {
            igdsListCell2.A0C(new ViewOnClickListenerC48071LPw(this, 41));
        }
        IgdsListCell igdsListCell3 = this.A07;
        if (igdsListCell3 != null) {
            igdsListCell3.setCompoundButtonClickListener(new ViewOnClickListenerC48071LPw(this, 42));
        }
        IgdsListCell igdsListCell4 = this.A08;
        if (igdsListCell4 != null) {
            igdsListCell4.setCompoundButtonClickListener(new ViewOnClickListenerC48071LPw(this, 43));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
        if (igdsBottomButtonLayout != null) {
            C0fQ.A00(new ViewOnClickListenerC48071LPw(this, 44), igdsBottomButtonLayout);
        }
    }

    public static final void A0B(C45813KPs c45813KPs) {
        EnumC46208Kck enumC46208Kck;
        IgdsListCell igdsListCell = c45813KPs.A07;
        boolean z = false;
        if (igdsListCell != null) {
            Integer num = c45813KPs.A03;
            if (num != null) {
                igdsListCell.setChecked(AbstractC167007dF.A1X(num, C05F.A00));
            }
            C14360o3.A0F("selectStatus");
            throw C00O.createAndThrow();
        }
        IgdsListCell igdsListCell2 = c45813KPs.A08;
        if (igdsListCell2 != null) {
            Integer num2 = c45813KPs.A03;
            if (num2 != null) {
                if (num2 == C05F.A01) {
                    z = true;
                }
                igdsListCell2.setChecked(z);
            }
            C14360o3.A0F("selectStatus");
            throw C00O.createAndThrow();
        }
        Integer num3 = c45813KPs.A03;
        if (num3 != null) {
            int intValue = num3.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    enumC46208Kck = EnumC46208Kck.A03;
                } else {
                    throw B4Z.A00();
                }
            } else if (LLQ.A08(c45813KPs)) {
                enumC46208Kck = EnumC46208Kck.A08;
            } else {
                enumC46208Kck = EnumC46208Kck.A07;
            }
            c45813KPs.A00 = enumC46208Kck;
            return;
        }
        C14360o3.A0F("selectStatus");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        C44478Jlk c44478Jlk = (C44478Jlk) this.A0B.getValue();
        if (c44478Jlk.A02 == C05F.A0C) {
            KPI kpi = c44478Jlk.A00;
            kpi.A07("ENTRY_POINT", "SETTINGS");
            kpi.A07("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        }
        c44478Jlk.A00.A05("MORE_OPTIONS_IMPRESSION");
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
        ScrollView scrollView = this.A05;
        if (scrollView == null || AbstractC43592JPx.A1X(scrollView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45813KPs() {
        MHK mhk = new MHK(this, 10);
        InterfaceC09390do A00 = MHK.A00(new MHK(this, 6), EnumC09460dv.A02, 7);
        this.A0B = AbstractC25225BEi.A0a(new MHK(A00, 8), mhk, new C50172MDz(5, null, A00), AbstractC25225BEi.A1D(C44478Jlk.class));
        this.A0A = C1XM.A00(new MHK(this, 9));
        this.A09 = C1XM.A00(new MHK(this, 3));
        this.A00 = EnumC46208Kck.A03;
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num;
        IgdsListCell igdsListCell;
        IgdsListCell igdsListCell2;
        int A02 = C0f9.A02(-95791749);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.more_options_layout, viewGroup, false);
        this.A05 = (ScrollView) inflate.requireViewById(R.id.cell_container);
        this.A01 = AbstractC31173DnH.A0Y(inflate, R.id.recommended_cell);
        this.A02 = AbstractC31173DnH.A0Y(inflate, R.id.second_cell);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        C44478Jlk c44478Jlk = (C44478Jlk) this.A0B.getValue();
        A0C();
        Integer A022 = LLQ.A02(this);
        C14360o3.A0B(A022, 1);
        C48519LdH c48519LdH = c44478Jlk.A01;
        C48519LdH.A03(c48519LdH, A022);
        if (c48519LdH.A0P.getValue() == EnumC46172KcA.A03) {
            MHK mhk = new MHK(this, 4);
            String A0p = AbstractC166997dE.A0p(requireContext(), 2131961781);
            SpannableStringBuilder append = AbstractC25225BEi.A0H(AbstractC166997dE.A0p(requireContext(), 2131961779)).append((CharSequence) " ").append((CharSequence) AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(requireContext(), A0p, 2131961780)));
            C14360o3.A07(append);
            AnonymousClass773.A03(append, new C44383JjM(mhk, 1), A0p);
            A0g.setBody(append);
        }
        IgdsListCell igdsListCell3 = this.A01;
        if (igdsListCell3 != null) {
            igdsListCell3.A0G(EnumC53237Nga.A07, true);
        }
        IgdsListCell igdsListCell4 = this.A02;
        if (igdsListCell4 != null) {
            igdsListCell4.A0G(EnumC53237Nga.A07, true);
        }
        InterfaceC09390do A00 = C1XM.A00(new MHK(this, 5));
        if (AbstractC167007dF.A1Z(A00)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        this.A03 = num;
        if (AbstractC167007dF.A1Z(A00)) {
            igdsListCell = this.A01;
        } else {
            boolean A023 = C6CB.A02(AbstractC43593JPy.A0P(this.A09), 36315928467803861L);
            igdsListCell = this.A02;
            if (!A023) {
                AbstractC167007dF.A0x(igdsListCell);
                igdsListCell = null;
            }
        }
        this.A07 = igdsListCell;
        if (AbstractC167007dF.A1Z(A00)) {
            igdsListCell2 = this.A02;
        } else {
            igdsListCell2 = this.A01;
        }
        this.A08 = igdsListCell2;
        IgdsListCell igdsListCell5 = this.A07;
        if (igdsListCell5 != null) {
            igdsListCell5.A06(2131961783);
            igdsListCell5.A0H(AbstractC25227BEk.A0v(this, 2131961782));
            igdsListCell5.A05(R.drawable.instagram_id_card_pano_outline_24);
        }
        IgdsListCell igdsListCell6 = this.A08;
        if (igdsListCell6 != null) {
            igdsListCell6.A06(2131961784);
            igdsListCell6.A0H(AbstractC25227BEk.A0v(this, 2131961778));
            igdsListCell6.A05(R.drawable.instagram_asterisk_pano_outline_24);
        }
        A0B(this);
        this.A06 = AbstractC31172DnG.A0j(inflate, R.id.bottom_buttons);
        C0f9.A09(-899676016, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1244388467);
        super.onDestroyView();
        this.A07 = null;
        this.A08 = null;
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        C0f9.A09(-607636312, A02);
    }

    @Override // X.KCM, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-488856351);
        super.onResume();
        A0B(this);
        C0f9.A09(-1246267069, A02);
    }
}
