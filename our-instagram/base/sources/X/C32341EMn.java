package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.EMn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32341EMn extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DisappearingMessagesChangeDurationBottomSheet";
    public boolean A00;
    public RecyclerView A01;
    public EPV A02;
    public Long A03;
    public Long A04;
    public String A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final String A08 = "direct_disappearing_messages_change_duration_bottom_sheet";

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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[LOOP:0: B:27:0x00ce->B:29:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32341EMn.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
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
        return this.A08;
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2081294069);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_disappearing_messages_change_duration_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-1704605424, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        EnumC33469Er4 enumC33469Er4;
        int A02 = C0f9.A02(1047453670);
        super.onDestroyView();
        String str = this.A05;
        if (str != null && !this.A00) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A07);
            Long l = this.A03;
            Long l2 = this.A04;
            String str2 = this.A06;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(A0o), "direct_disappearing_messages_toggle_on_cancel");
            AbstractC31171DnF.A1H(A0f, str);
            A0f.A9K("ephemeral_lifetime_ms", l);
            A0f.A9K("after_view_lifetime_ms", l2);
            if (str2 != null) {
                enumC33469Er4 = C35138Fef.A00(str2);
            } else {
                enumC33469Er4 = null;
            }
            A0f.A8R(enumC33469Er4, TraceFieldType.TransportType);
            A0f.Cht();
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = false;
        C0f9.A09(-801734598, A02);
    }
}
