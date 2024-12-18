package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.api.schemas.AudienceList;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EOT extends AbstractC43842Ja5 implements C51D, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "AudienceListsListFragment";
    public EnumC33505Ere A00;
    public InterfaceC37149GYk A01;
    public FRU A02;
    public IngestSessionShim A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public List A0C;
    public boolean A0D;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public OWN A04 = new OWN(null);
    public final List A0E = AbstractC166987dD.A1E();

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }

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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audience_lists_list_fragment";
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

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0C = AbstractC31178DnM.A0C(requireView());
        int i = 2131953277;
        if (this.A09) {
            i = 2131973840;
        }
        AbstractC25227BEk.A12(A0C, this, i);
        TextView A0N = AbstractC167007dF.A0N(requireView(), R.id.create_list);
        if (this.A07) {
            A0N.setText(2131956963);
            ViewOnClickListenerC35679FpE.A01(A0N, 6, this);
        } else {
            A0N.setVisibility(8);
        }
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.back_button);
        if (this.A05) {
            ViewOnClickListenerC35679FpE.A01(A0S, 7, this);
            A0S.setVisibility(0);
        } else {
            A0S.setVisibility(8);
        }
        View A0S2 = AbstractC166997dE.A0S(requireView(), R.id.share_story_button);
        if (this.A0A) {
            A0S2.setVisibility(0);
            ViewOnClickListenerC35679FpE.A01(A0S2, 8, this);
        } else {
            A0S2.setVisibility(8);
        }
        A00(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC166997dE.A0R(requireView(), R.id.recycler_view_container);
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(constraintLayout);
        C110964z8.A02(c110964z8, R.id.recycler_view).A03.A0z = true;
        C110964z8.A02(c110964z8, R.id.recycler_view).A03.A0W = (int) (AbstractC13880nE.A06(requireContext()) * 0.5f);
        c110964z8.A0G(constraintLayout);
        ((RecyclerView) AbstractC166997dE.A0R(requireView(), R.id.recycler_view)).setItemAnimator(null);
        InterfaceC09390do interfaceC09390do = this.A0F;
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C31820Dye) interfaceC09390do.getValue()).A00, new C50368MLv(this, 13), 51);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        AbstractC166987dD.A1Z(new MBT(A0Z, null, 16), AbstractC141776au.A00(A0Z));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A01(EOT eot, AudienceListViewModel audienceListViewModel, Integer num) {
        AudienceList audienceList;
        if (audienceListViewModel != null) {
            boolean z = audienceListViewModel.A05;
            String str = audienceListViewModel.A01;
            String str2 = audienceListViewModel.A02;
            boolean z2 = audienceListViewModel.A06;
            audienceList = new AudienceList(str, str2, z, z2, z2);
        } else {
            audienceList = null;
        }
        AbstractC35049FcM.A02(audienceList, eot, AbstractC166987dD.A0r(eot.A0G), num.intValue(), eot.A0D);
    }

    public final void A0C(AudienceListViewModel audienceListViewModel) {
        FRU fru = this.A02;
        if (fru == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        EnumC33505Ere enumC33505Ere = this.A00;
        if (enumC33505Ere == null) {
            enumC33505Ere = EnumC33505Ere.LIST_SHEET;
        }
        fru.A02(enumC33505Ere, audienceListViewModel.A01, audienceListViewModel.A02);
        A01(this, audienceListViewModel, 58548288);
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        InterfaceC37149GYk interfaceC37149GYk = this.A01;
        if (interfaceC37149GYk != null) {
            interfaceC37149GYk.Cxg(this.A0E, this.A0B);
        }
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50368MLv(this, 11));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    public EOT() {
        MHO mho = new MHO(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29906DGu(new MHO(this, 49), 0));
        this.A0F = AbstractC25225BEi.A0a(new C29906DGu(A00, 1), mho, new D8L(11, null, A00), AbstractC25225BEi.A1D(C31820Dye.class));
        this.A0G = AbstractC60492pY.A02(this);
    }

    public static final void A00(EOT eot) {
        AbstractC166997dE.A0S(eot.requireView(), R.id.share_story_button).setEnabled(AbstractC166987dD.A1b(eot.A0E));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new C32601EXb(requireContext(), this, this, this.A06));
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A05(getRecyclerView());
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        List list;
        List<AudienceListViewModel> list2;
        ArrayList A0i;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1) {
            String A00 = AbstractC43591JPw.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            if (i == 58548288) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(A00);
                if (parcelableArrayListExtra != null) {
                    ((C31820Dye) this.A0F.getValue()).A01.A01(parcelableArrayListExtra, false);
                    list2 = this.A0E;
                    ArrayList A0i2 = AbstractC167007dF.A0i(list2);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A0i2.add(((AudienceListViewModel) it.next()).A01);
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = parcelableArrayListExtra.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (A0i2.contains(((AudienceListViewModel) next).A01)) {
                            A1E.add(next);
                        }
                    }
                    A0i = AbstractC001800i.A0U(A1E);
                } else {
                    AudienceListViewModel audienceListViewModel = (AudienceListViewModel) intent.getParcelableExtra(AbstractC43591JPw.A00(488));
                    if (audienceListViewModel != null) {
                        ((C31820Dye) this.A0F.getValue()).A00(audienceListViewModel, false);
                        list2 = this.A0E;
                        A0i = AbstractC167007dF.A0i(list2);
                        for (AudienceListViewModel audienceListViewModel2 : list2) {
                            if (C14360o3.A0K(audienceListViewModel2.A01, audienceListViewModel.A01)) {
                                audienceListViewModel2 = audienceListViewModel;
                            }
                            A0i.add(audienceListViewModel2);
                        }
                    }
                }
                list2.clear();
                list2.addAll(A0i);
            } else if (i == 101232125) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(A00);
                if (parcelableArrayListExtra2 != null) {
                    ((C31820Dye) this.A0F.getValue()).A01.A01(parcelableArrayListExtra2, true);
                }
                AbstractC110854yx.A01(getRecyclerView(), true);
            } else if (i == 1000) {
                InterfaceC09390do interfaceC09390do = this.A0F;
                C50627MWo c50627MWo = (C50627MWo) ((C31820Dye) interfaceC09390do.getValue()).A00.A02();
                if (c50627MWo == null || (list = (List) c50627MWo.A00) == null) {
                    return;
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (((AudienceListViewModel) obj).A05) {
                        A1E2.add(obj);
                    }
                }
                AudienceListViewModel audienceListViewModel3 = (AudienceListViewModel) AbstractC001800i.A0O(A1E2, 0);
                if (audienceListViewModel3 == null) {
                    return;
                } else {
                    ((C31820Dye) interfaceC09390do.getValue()).A00(new AudienceListViewModel(audienceListViewModel3.A01, audienceListViewModel3.A02, audienceListViewModel3.A03, intent.getIntExtra(MSV.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), audienceListViewModel3.A00), audienceListViewModel3.A05, audienceListViewModel3.A06, false), false);
                }
            }
            A00(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33505Ere enumC33505Ere;
        int A02 = C0f9.A02(-550564365);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        IngestSessionShim ingestSessionShim = (IngestSessionShim) requireArguments.getParcelable(EnumC33367Ep0.A09.toString());
        this.A03 = ingestSessionShim;
        this.A0A = AbstractC167007dF.A1W(ingestSessionShim);
        this.A07 = requireArguments.getBoolean(EnumC33367Ep0.A0A.toString());
        this.A05 = requireArguments.getBoolean(EnumC33367Ep0.A02.toString());
        this.A06 = requireArguments.getBoolean(EnumC33367Ep0.A03.toString());
        this.A0C = requireArguments.getStringArrayList(EnumC33367Ep0.A05.toString());
        this.A09 = requireArguments.getBoolean(EnumC33367Ep0.A08.toString());
        this.A0D = requireArguments.getBoolean(EnumC33367Ep0.A04.toString());
        Serializable serializable = requireArguments.getSerializable(EnumC33367Ep0.A07.toString());
        if (serializable instanceof EnumC33505Ere) {
            enumC33505Ere = (EnumC33505Ere) serializable;
        } else {
            enumC33505Ere = null;
        }
        this.A00 = enumC33505Ere;
        this.A08 = requireArguments.getBoolean(EnumC33367Ep0.A06.toString());
        this.A02 = new FRU(this, AbstractC166987dD.A0r(this.A0G));
        ((C31820Dye) this.A0F.getValue()).A01.A00 = this.A0C;
        C0f9.A09(1771154448, A02);
    }
}
