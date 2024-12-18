package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N7M extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "PromptStickerViewerFragment";
    public RecyclerView A00;
    public C41181vS A01;
    public AbstractC149546o6 A02;
    public List A03;
    public final InterfaceC63982vJ A04;
    public final InterfaceC58059Pok A05;
    public final O4B A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0E = C57539PgD.A01(this, 27);
    public final InterfaceC09390do A07 = C57539PgD.A01(this, 20);
    public final InterfaceC09390do A0G = C57539PgD.A01(this, 28);

    public static final void A01(C51855Mvz c51855Mvz, N7M n7m, boolean z) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(n7m.requireContext(), z ? 1 : 3);
        gridLayoutManager.A01 = new C51094Mht(n7m, z);
        RecyclerView A0G = AbstractC31172DnG.A0G(n7m.requireView(), R.id.prompt_sticker_participants);
        InterfaceC09390do interfaceC09390do = n7m.A07;
        AbstractC37304Gc5.A10(A0G, interfaceC09390do);
        A0G.setLayoutManager(gridLayoutManager);
        A0G.setVisibility(0);
        n7m.A00 = A0G;
        C153156uj c153156uj = new C153156uj(A0G.A0D, new P2N(n7m, 6), C153146ui.A06, false, false);
        RecyclerView recyclerView = n7m.A00;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.A14(c153156uj);
        C51158Mj1 c51158Mj1 = (C51158Mj1) interfaceC09390do.getValue();
        List list = c51855Mvz.A06;
        C14360o3.A0B(list, 0);
        c51158Mj1.A00.A01(list, null);
    }

    public final void A03(Activity activity, MQS mqs, boolean z) {
        Integer num;
        FragmentActivity fragmentActivity;
        C38321qM c38321qM;
        Activity activity2 = activity;
        C14360o3.A0B(mqs, 0);
        if (activity == null) {
            activity2 = getActivity();
        }
        if (activity2 != null) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            if (MSW.A0o(interfaceC09390do).A0G()) {
                UserSession A0r = AbstractC166987dD.A0r(this.A0H);
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add(interfaceC09390do.getValue());
                List list = this.A03;
                if (list != null) {
                    A1E.addAll(list);
                }
                LHI.A01(activity2, A0r, A1E);
            } else if (MSW.A0o(interfaceC09390do).A0M()) {
                StoriesTemplateParticipationViewModel storiesTemplateParticipationViewModel = (StoriesTemplateParticipationViewModel) this.A0I.getValue();
                PromptStickerModel A0o = MSW.A0o(interfaceC09390do);
                C8FC c8fc = (C8FC) this.A0A.getValue();
                if (c8fc != null) {
                    storiesTemplateParticipationViewModel.A01((CreativeConfig) this.A09.getValue(), A0o, c8fc, true);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else if (MSW.A0o(interfaceC09390do).A0B) {
                if (z) {
                    num = C05F.A0C;
                } else if (MSW.A0o(interfaceC09390do).A0I()) {
                    num = C05F.A0j;
                } else {
                    num = C05F.A01;
                }
                String str = null;
                if ((activity2 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) activity2) != null) {
                    UserSession A0r2 = AbstractC166987dD.A0r(this.A0H);
                    PromptStickerModel A0o2 = MSW.A0o(interfaceC09390do);
                    C41181vS c41181vS = this.A01;
                    if (c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
                        str = c38321qM.getId();
                    }
                    LHI.A02(fragmentActivity, A0r2, mqs, A0o2, num, str, C57403Pe1.A00, z);
                }
            } else {
                LHI.A00(activity2, (C22P) this.A0B.getValue(), AbstractC166987dD.A0r(this.A0H), MSW.A0o(interfaceC09390do));
            }
            OUO.A00((OUO) this.A0C.getValue(), AbstractC111324zv.A00(2222), null);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57165PZj c57165PZj = new C57165PZj(c07s, this, viewLifecycleOwner, null, 44);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, c57165PZj, A00);
        C07X A0K2 = AbstractC31173DnH.A0K(this, anonymousClass191, new C57165PZj(c07s, this, A0K, null, 43), C07Y.A00(A0K));
        AbstractC23641Du.A05(anonymousClass191, new C57165PZj(c07s, this, A0K2, null, 45), C07Y.A00(A0K2));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0L);
        AbstractC23641Du.A05(anonymousClass191, new PZB(A0Z, (InterfaceC23621Ds) null, 45), AbstractC141776au.A00(A0Z));
    }

    public static final void A00(C51855Mvz c51855Mvz, N7M n7m) {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        if (c51855Mvz.A09) {
            Fragment fragment = n7m.mParentFragment;
            if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                c189458aP.A02 = R.drawable.instagram_more_vertical_pano_outline_24;
                c189458aP.A05 = new ViewOnClickListenerC55468OkN(8, c51855Mvz, n7m);
                c189458aP.A0A = true;
                c189478aR.A0K(c189458aP.A00(), true);
            }
        }
    }

    public static final void A02(N7M n7m, String str) {
        InterfaceC09390do interfaceC09390do = n7m.A0H;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        AbstractC31173DnH.A1I(n7m, AbstractC31171DnF.A0L(n7m.requireActivity(), AbstractC37301Gc2.A04(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, "reel_context_sheet_prompt", n7m.getModuleName())), A0o, ModalActivity.class, "profile"));
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
        return AbstractC166987dD.A0n(this.A0H);
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
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7M() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0J = C57539PgD.A00(this, enumC09460dv, 36);
        this.A08 = C57539PgD.A01(this, 21);
        this.A0K = C57539PgD.A01(this, 37);
        this.A0D = C1XM.A00(new C57539PgD(this, 26));
        this.A0B = C57539PgD.A00(this, enumC09460dv, 24);
        this.A0A = C57539PgD.A01(this, 23);
        this.A09 = C57539PgD.A00(this, enumC09460dv, 22);
        this.A0F = AbstractC09440dt.A01(C57404Pe2.A00);
        this.A05 = new C56546P8s(this);
        this.A04 = new C56531P8d(this, 4);
        this.A06 = new O4B(this);
        C57539PgD c57539PgD = new C57539PgD(this, 38);
        InterfaceC09390do A00 = C57539PgD.A00(new C57539PgD(this, 31), enumC09460dv, 32);
        this.A0L = AbstractC25225BEi.A0a(new C57539PgD(A00, 33), c57539PgD, new C57536PgA(1, null, A00), AbstractC25225BEi.A1D(C50950MfJ.class));
        this.A0I = AbstractC25225BEi.A0a(new C57539PgD(this, 30), new C57539PgD(this, 34), new C57536PgA(0, null, this), AbstractC25225BEi.A1D(StoriesTemplateParticipationViewModel.class));
        this.A0C = C1XM.A00(new C57539PgD(this, 25));
        this.A0H = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AnonymousClass001.A0R(AbstractC153636vY.A01(requireArguments(), "prior_module"), "_context_sheet_prompt");
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.Akp] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        int A02 = C0f9.A02(-1787572856);
        super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("before_and_after_bundle_sticker_models");
        if (parcelableArrayList != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.instagram.api.schemas.StoryThenAndNowStickerDict");
                StoryThenAndNowStickerDict storyThenAndNowStickerDict = (StoryThenAndNowStickerDict) parcelable;
                C14360o3.A0B(storyThenAndNowStickerDict, 1);
                ?? obj = new Object();
                obj.A00 = storyThenAndNowStickerDict;
                arrayList.add(obj);
            }
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        C0f9.A09(650324379, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1243551362);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.prompt_sticker_viewer_fragment, false);
        C0f9.A09(1102677631, A02);
        return A0R;
    }
}
