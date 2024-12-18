package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class KDL extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectScheduledMessagesFragment";
    public C66362zD A00;
    public RecyclerView A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public boolean A01 = true;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_scheduled_messages_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        DirectThreadThemeInfo directThreadThemeInfo;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new Object());
        A0R.A01(new Object());
        this.A00 = AbstractC31173DnH.A0R(A0R, new Object());
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.scheduled_messages_layout);
        this.A02 = A0G;
        if (A0G != null) {
            A0G.setAdapter(this.A00);
        }
        Context requireContext = requireContext();
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        InterfaceC09390do interfaceC09390do = this.A05;
        AnonymousClass988 A0a = AbstractC43594JPz.A0a(AbstractC166987dD.A0r(interfaceC09390do), anonymousClass989);
        if (AbstractC72723Nt.A00(requireActivity())) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        C81663kb B3U = C2JD.A00(AbstractC166987dD.A0r(interfaceC09390do)).B3U((DirectThreadKey) this.A06.getValue());
        if (B3U != null) {
            directThreadThemeInfo = B3U.C72();
        } else {
            directThreadThemeInfo = null;
        }
        C7IM A01 = C7ID.A00.A01(requireContext, A0a, directThreadThemeInfo, num);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner, A01, c07s, this, null, 23), C07Y.A00(viewLifecycleOwner));
    }

    public static final boolean A01(C83403nh c83403nh, C83403nh c83403nh2) {
        if (c83403nh2 != null && !A00(c83403nh) && !A00(c83403nh2) && c83403nh.A0P() == null && c83403nh2.A0P() == null && C14360o3.A0K(c83403nh2.A1Q, c83403nh.A1Q)) {
            return true;
        }
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
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
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
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            return AbstractC110854yx.A05(recyclerView);
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDL() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new DH5(this, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY", "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY", 21));
        C37052GUi c37052GUi = new C37052GUi(this, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(new C37052GUi(this, 5), 6));
        this.A07 = AbstractC25225BEi.A0a(new C37052GUi(A00, 7), c37052GUi, new C37018GSz(31, A00, null), AbstractC25225BEi.A1D(C45526KDr.class));
        this.A08 = new C31650DvG(this, 24);
        this.A03 = C1XM.A00(C57363PdN.A00);
        this.A04 = AbstractC09440dt.A01(new C37052GUi(this, 4));
    }

    public static final boolean A00(C83403nh c83403nh) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, -5);
        return AbstractC167007dF.A1O((calendar.getTimeInMillis() > TimeUnit.SECONDS.toMillis(AbstractC25232BEp.A0t(c83403nh.A1Q)) ? 1 : (calendar.getTimeInMillis() == TimeUnit.SECONDS.toMillis(AbstractC25232BEp.A0t(c83403nh.A1Q)) ? 0 : -1)));
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
        int A02 = C0f9.A02(1427502516);
        super.onCreate(bundle);
        ((C45526KDr) this.A07.getValue()).A00((DirectThreadKey) this.A06.getValue());
        AbstractC31176DnK.A0Q(this.A05).A01(this.A08, C2Io.class);
        C0f9.A09(-1929119677, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1690129748);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_scheduled_messages_viewer, false);
        C0f9.A09(1895661309, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2120944995);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        AbstractC31176DnK.A0Q(this.A05).A02(this.A08, C2Io.class);
        C0f9.A09(677483209, A02);
    }
}
