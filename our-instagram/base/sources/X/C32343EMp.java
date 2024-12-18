package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.List;

/* renamed from: X.EMp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32343EMp extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "HallPassParticipantsListFragment";
    public RecyclerView A00;
    public C66362zD A01;
    public C69623Aw A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public final InterfaceC63982vJ A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

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
        return AbstractC111324zv.A00(969);
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
        String str;
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(requireView(), R.id.hall_pass_participants);
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(requireActivity()), new C32645EYt(requireContext(), this, AbstractC166987dD.A0r(this.A0G), this));
        this.A01 = A0R;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0R);
            recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        }
        TextView A0C = AbstractC31178DnM.A0C(requireView());
        View A0S = AbstractC166997dE.A0S(requireView(), R.id.more_button);
        String str2 = this.A05;
        if (str2 == null) {
            str = "hallPassName";
        } else {
            A0C.setText(str2);
            Fragment fragment = this.mParentFragment;
            if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                ViewOnClickListenerC31591DuJ.A00(A0S, 25, this, c189478aR);
            }
            C64P c64p = (C64P) AbstractC166997dE.A0R(requireView(), R.id.cta);
            c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 60));
            c64p.setSecondaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 61));
            InterfaceC09390do interfaceC09390do = this.A0B;
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C31799DyJ) interfaceC09390do.getValue()).A00, new C57561PgZ(this, 9), 29);
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
            String str3 = this.A04;
            if (str3 == null) {
                str = "hallPassId";
            } else {
                AbstractC166987dD.A1Z(new PZ1(A0Z, str3, null, 0), AbstractC141776au.A00(A0Z));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return AbstractC110854yx.A05(recyclerView);
        }
        return true;
    }

    public C32343EMp() {
        C57241PbP c57241PbP = new C57241PbP(this, 13);
        C57241PbP c57241PbP2 = new C57241PbP(this, 16);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(c57241PbP2, 17));
        this.A0B = AbstractC25225BEi.A0a(new C57241PbP(A00, 18), c57241PbP, new C57251PbZ(6, null, A00), AbstractC25225BEi.A1D(C31799DyJ.class));
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(this, 15));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(this, 14));
        this.A0A = new GF3(this, 6);
        this.A0F = AbstractC09440dt.A00(enumC09460dv, new C57241PbP(this, 19));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, GU8.A00);
        this.A09 = C16930sl.A00;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1337839103);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC153636vY.A01(requireArguments, "hall_pass_id");
        this.A05 = AbstractC153636vY.A01(requireArguments, "hall_pass_name");
        this.A06 = requireArguments.getString("media_id");
        this.A07 = requireArguments.getString("media_owner_id");
        this.A08 = requireArguments.getString("view_session_id");
        requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A02 = new C69623Aw(this, AbstractC166987dD.A0r(this.A0G));
        C0f9.A09(613800573, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(310636885);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_participants, false);
        C0f9.A09(-1122093480, A02);
        return A0R;
    }
}
