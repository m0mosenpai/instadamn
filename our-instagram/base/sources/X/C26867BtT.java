package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;

/* renamed from: X.BtT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26867BtT extends AbstractC59962oe implements C51D {
    public static final CTS A08 = new Object();
    public static final String __redex_internal_original_name = "ContentNotesNuxFragment";
    public InterfaceC30992Djr A00;
    public NestedScrollView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

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
        return __redex_internal_original_name;
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
        Integer num;
        int i;
        InterfaceC09390do interfaceC09390do;
        InterfaceC19610xo A0w;
        int i2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (NestedScrollView) view.findViewById(R.id.content_notes_production_nux_scrollable_content);
        InterfaceC09390do interfaceC09390do2 = this.A07;
        C85013qp A00 = AbstractC84973ql.A00(AbstractC166987dD.A0r(interfaceC09390do2));
        InterfaceC09390do interfaceC09390do3 = this.A02;
        String A15 = AbstractC25225BEi.A15(interfaceC09390do3);
        C14360o3.A0B(A15, 0);
        if (!A15.equals("clips_viewer_clips_media_notes") && !A15.equals("clips_viewer_clips_tab")) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        int intValue = num.intValue();
        C84993qn c84993qn = A00.A06;
        if (intValue != 0) {
            i = A00.A03;
            interfaceC09390do = c84993qn.A07;
            A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(interfaceC09390do));
            i2 = 4177;
        } else {
            i = A00.A01;
            interfaceC09390do = c84993qn.A07;
            A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(interfaceC09390do));
            i2 = 4176;
        }
        A0w.E7D(AbstractC111324zv.A00(i2), i);
        A0w.apply();
        InterfaceC19610xo A0w2 = AbstractC166987dD.A0w(AbstractC25226BEj.A10(interfaceC09390do));
        A0w2.E77(AbstractC111324zv.A00(973), true);
        A0w2.apply();
        if (this.A06.getValue() == null) {
            int i3 = A00.A04;
            InterfaceC19610xo A0w3 = AbstractC166987dD.A0w(AbstractC25226BEj.A10(interfaceC09390do));
            A0w3.E7D(AbstractC111324zv.A00(842), i3);
            A0w3.apply();
        }
        F16.A00(AbstractC167007dF.A0N(view, R.id.control_text_body), AbstractC166987dD.A0r(interfaceC09390do2), AbstractC25227BEk.A0v(this, 2131956711));
        C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.note_action_buttons);
        Context context = view.getContext();
        InterfaceC09390do interfaceC09390do4 = this.A03;
        int i4 = 2131956706;
        if (AbstractC167007dF.A1Z(interfaceC09390do4)) {
            i4 = 2131956698;
        }
        c64p.setPrimaryAction(context.getString(i4), new ViewOnClickListenerC28667ClF(this, 32));
        if (AbstractC167007dF.A1Z(interfaceC09390do4)) {
            c64p.setSecondaryButtonEnabled(false);
        } else {
            c64p.setSecondaryAction(context.getString(2131956708), new ViewOnClickListenerC28667ClF(this, 33));
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
        String A152 = AbstractC25225BEi.A15(interfaceC09390do3);
        EnumC25577BSp enumC25577BSp = (EnumC25577BSp) this.A04.getValue();
        String A153 = AbstractC25225BEi.A15(this.A05);
        C14360o3.A0B(A0o, 0);
        AbstractC25233BEq.A0v(1, A152, enumC25577BSp, A153);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o), "instagram_media_note_production_nux_bottom_sheet_impression_client");
        if (A0f.isSampled()) {
            AbstractC25231BEo.A17(A0f, A153, A152);
            A0f.A8R(enumC25577BSp, "event_source");
            A0f.Cht();
        }
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
    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A01;
        if (nestedScrollView == null || nestedScrollView.getScrollY() == 0) {
            return true;
        }
        return false;
    }

    public C26867BtT() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC25235BEs.A0s("", this, "media_id", enumC09460dv, 36);
        this.A02 = AbstractC25235BEs.A0s("", this, "container_module", enumC09460dv, 37);
        this.A03 = AbstractC25235BEs.A0s(AbstractC166997dE.A0a(), this, "disable_secondary_button", enumC09460dv, 38);
        this.A06 = AbstractC25235BEs.A0s(null, this, "mimicry_entry_point", enumC09460dv, 39);
        this.A04 = DH6.A01(this, "event_source", enumC09460dv, 29);
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(880754724);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_production_nux_landing, viewGroup, false);
        C0f9.A09(1539707756, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1718476783);
        this.A01 = null;
        super.onDestroyView();
        C0f9.A09(-685729954, A02);
    }
}
