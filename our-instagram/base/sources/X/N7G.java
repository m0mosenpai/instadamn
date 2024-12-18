package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes9.dex */
public final class N7G extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ClipsAudienceControlFragment";
    public InterfaceC56392iX A00;
    public C52367NFg A01;
    public IgdsBottomButtonLayout A02;
    public C189478aR A03;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(C57525Pfz.A00(this, 20), C57525Pfz.A00(this, 21), MSW.A1G(this, null, 26), AbstractC25225BEi.A1D(C50991Mfy.class));
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

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
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        C52367NFg c52367NFg = new C52367NFg(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A01 = c52367NFg;
        c52367NFg.A00();
        C52367NFg c52367NFg2 = this.A01;
        String str = "radioButtonsView";
        if (c52367NFg2 != null) {
            if (c52367NFg2.A01 == null) {
                c52367NFg2.A01 = this.A03;
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.radio_buttons_container);
            C52367NFg c52367NFg3 = this.A01;
            if (c52367NFg3 != null) {
                viewGroup.addView(c52367NFg3);
                this.A00 = AbstractC37301Gc2.A0D(view, R.id.tooltip_close_friends);
                TextView A0N = AbstractC167007dF.A0N(view, R.id.clips_audience_control_subtitle);
                IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.bottom_action_button);
                this.A02 = A0j;
                if (A0j == null) {
                    str = "bottomButton";
                } else {
                    A0j.setPrimaryAction(getString(2131961124), new ViewOnClickListenerC55462OkH(this, 70));
                    InterfaceC09390do interfaceC09390do2 = this.A05;
                    int A0H = AbstractC166987dD.A0H(MSW.A0X(interfaceC09390do2).A01.A04);
                    if (A0H != 0) {
                        if (A0H == 1) {
                            i = 2131955267;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        i = 2131969859;
                    }
                    A0N.setText(i);
                    MSW.A0X(interfaceC09390do2).A06.Egh(EnumC53134Nen.A02);
                    C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A0T).A01, "ig_camera_share_sheet_entity_impression");
                    if (A0f.isSampled()) {
                        C22M c22m = ((C22F) A0T).A04;
                        String str2 = c22m.A0L;
                        EnumC50631MWs enumC50631MWs = c22m.A0C;
                        if (A0T.A0J() != null && enumC50631MWs != null && str2 != null) {
                            AbstractC167007dF.A10(A0f, A0T);
                            AbstractC166987dD.A1S(A0f, str2);
                            AbstractC166997dE.A1N(A0f, "entity_type", 10);
                            AbstractC31171DnF.A1D(A0f, __redex_internal_original_name);
                            AbstractC43594JPz.A1B(A0f, c22m);
                            MSW.A1M(enumC50631MWs, A0f);
                            AbstractC167017dG.A1C(A0f);
                        }
                    }
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                    C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                    C57173PZr A02 = C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 12);
                    AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                    C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, A02, A00);
                    AbstractC23641Du.A05(anonymousClass191, C57173PZr.A02(A0K, c07s, this, null, 13), C07Y.A00(A0K));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            MSW.A0X(this.A05).A00(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1248827546);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_audience_control_fragment, false);
        C0f9.A09(1108628214, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-533642741);
        super.onDestroyView();
        this.A03 = null;
        C0f9.A09(1540064130, A02);
    }
}
