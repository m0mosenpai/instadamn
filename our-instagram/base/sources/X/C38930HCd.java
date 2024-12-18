package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.HCd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38930HCd extends AbstractC59962oe implements InterfaceC60442pS, C51D, InterfaceC62892tS {
    public static final String __redex_internal_original_name = "QuestionResponseBottomSheetFragment";
    public View A00;
    public View A01;
    public UserSession A02;
    public ReboundViewPager A03;
    public C37987GnX A04;
    public C677733r A05;
    public C38308Gsu A06;

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "question_response_bottom_sheet_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        boolean z = false;
        int i = requireArguments.getInt("starting_position", 0);
        C677733r c677733r = new C677733r(requireContext(), this.A02);
        this.A05 = c677733r;
        this.A06 = new C38308Gsu(requireActivity(), this.A02, this, c677733r, this);
        ReboundViewPager reboundViewPager = (ReboundViewPager) view.requireViewById(R.id.response_view_pager);
        this.A03 = reboundViewPager;
        reboundViewPager.A0N(this.A06, i);
        A01(i);
        this.A03.A0P(this);
        View requireViewById = view.requireViewById(R.id.left_arrow);
        this.A00 = requireViewById;
        ViewOnClickListenerC42032Ik1.A01(requireViewById, 70, this);
        View requireViewById2 = view.requireViewById(R.id.right_arrow);
        this.A01 = requireViewById2;
        ViewOnClickListenerC42033Ik2.A00(requireViewById2, 0, this);
        int count = this.A06.getCount();
        boolean A1O = AbstractC167007dF.A1O(i);
        if (i < count - 1) {
            z = true;
        }
        this.A00.setEnabled(A1O);
        this.A01.setEnabled(z);
    }

    private C42728IvO A00(int i) {
        View A0D = this.A03.A0D(i);
        if (A0D != null && (A0D.getTag() instanceof C42728IvO)) {
            return (C42728IvO) A0D.getTag();
        }
        return null;
    }

    private void A01(int i) {
        C41599Ian c41599Ian;
        View A0D = this.A03.A0D(i);
        if (A0D != null && (A0D.getTag() instanceof C41599Ian) && (c41599Ian = (C41599Ian) A0D.getTag()) != null) {
            QuestionMediaResponseModelIntf questionMediaResponseModelIntf = c41599Ian.A00;
            if (questionMediaResponseModelIntf != null) {
                Integer BRq = questionMediaResponseModelIntf.BRq();
                BRq.getClass();
                if (BRq.intValue() == EnumC40111tc.A0a.A00) {
                    Context A0L = AbstractC166997dE.A0L(c41599Ian.A02);
                    UserSession userSession = c41599Ian.A03;
                    String str = c41599Ian.A04;
                    QuestionMediaResponseModelIntf questionMediaResponseModelIntf2 = c41599Ian.A00;
                    if (questionMediaResponseModelIntf2 != null) {
                        C39444HbW c39444HbW = new C39444HbW(A0L, userSession, questionMediaResponseModelIntf2, str);
                        c41599Ian.A01 = c39444HbW;
                        SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) AbstractC166987dD.A17(c41599Ian.A0C);
                        QuestionMediaResponseModelIntf questionMediaResponseModelIntf3 = c41599Ian.A00;
                        if (questionMediaResponseModelIntf3 != null) {
                            C75363a3 A01 = AbstractC41341IRm.A01(questionMediaResponseModelIntf3);
                            if (A01 != null) {
                                View A0L2 = AbstractC167007dF.A0L(c41599Ian.A09);
                                C14360o3.A0B(simpleVideoLayout, 0);
                                boolean A1V = AbstractC167007dF.A1V(A0L2);
                                C4S7 c4s7 = new C4S7(c39444HbW.A01, 0);
                                C4QW c4qw = c39444HbW.A02;
                                c4qw.EYb(A1V);
                                C4QT c4qt = (C4QT) c4qw;
                                c4qt.A0N = c39444HbW;
                                c4qt.A0X = A1V;
                                c4qt.A0Z = A1V;
                                String str2 = c39444HbW.A03;
                                C14360o3.A0B(str2, 6);
                                c4qw.E5v(new C4SC(simpleVideoLayout, new C4QP(false, false, false, false), A01, c4s7, null, str2, 1.0f, -1, c4qw.getCurrentPositionMs(), false));
                                simpleVideoLayout.setVisibility(0);
                                A0L2.setVisibility(0);
                                ViewOnClickListenerC42034Ik3.A00(simpleVideoLayout, 37, A0L2, c39444HbW);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("mediaResponseModel");
            throw C00O.createAndThrow();
        }
    }

    private void A02(int i) {
        C41599Ian c41599Ian;
        View A0D = this.A03.A0D(i);
        if (A0D != null && (A0D.getTag() instanceof C41599Ian) && (c41599Ian = (C41599Ian) A0D.getTag()) != null) {
            QuestionMediaResponseModelIntf questionMediaResponseModelIntf = c41599Ian.A00;
            if (questionMediaResponseModelIntf != null) {
                Integer BRq = questionMediaResponseModelIntf.BRq();
                BRq.getClass();
                if (BRq.intValue() == EnumC40111tc.A0a.A00) {
                    C39444HbW c39444HbW = c41599Ian.A01;
                    if (c39444HbW != null) {
                        c39444HbW.A02.EE4("fragment_paused");
                    }
                    AbstractC166997dE.A19(c41599Ian.A02.getContext(), (ImageView) AbstractC166987dD.A17(c41599Ian.A09), R.drawable.instagram_play_pano_filled_24);
                    return;
                }
                return;
            }
            C14360o3.A0F("mediaResponseModel");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
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
    public final AbstractC18680vv getSession() {
        return this.A02;
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
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        boolean z;
        C42728IvO A00;
        C42728IvO A002 = A00(i2);
        if (A002 != null) {
            C42739IvZ c42739IvZ = A002.A08;
            z = c42739IvZ.A0B.isPlaying();
            c42739IvZ.A07.setProgress(0);
        } else {
            z = false;
        }
        C42728IvO A003 = A00(i2);
        if (A003 != null) {
            A003.A08.A0B.release();
        }
        this.A04.A0B.CJ4(i);
        if (z && (A00 = A00(i)) != null) {
            C42739IvZ c42739IvZ2 = A00.A08;
            if (c42739IvZ2.A05.getVisibility() == 0) {
                c42739IvZ2.A09.DsE(c42739IvZ2.A06);
            }
        }
        A02(i2);
        A01(i);
        int count = this.A06.getCount();
        boolean z2 = false;
        boolean A1O = AbstractC167007dF.A1O(i);
        if (i < count - 1) {
            z2 = true;
        }
        this.A00.setEnabled(A1O);
        this.A01.setEnabled(z2);
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
        int A02 = C0f9.A02(744051207);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_question_response_bottom_sheet);
        C0f9.A09(1049741300, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1443696366);
        super.onPause();
        A02(this.A03.A07);
        C42728IvO A00 = A00(this.A03.A07);
        if (A00 != null) {
            A00.A08.A0B.release();
        }
        this.A05.A00();
        C0f9.A09(-372693507, A02);
    }
}
