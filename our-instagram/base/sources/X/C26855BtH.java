package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.BtH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26855BtH extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ContentNoteOverflowFragment";
    public GridView A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

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
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = (ContentNotesOverflowFragmentUiState) AbstractC53062bn.A01(requireArguments, ContentNotesOverflowFragmentUiState.class, "notes");
        if (contentNotesOverflowFragmentUiState == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "android_null_view_model_in_overflow", 817892647);
            return;
        }
        String string = requireArguments.getString("carousel_child_id");
        String A00 = AbstractC111324zv.A00(2036);
        if (requireArguments.containsKey(A00)) {
            num = Integer.valueOf(requireArguments.getInt(A00));
        } else {
            num = null;
        }
        C29201Cu6 c29201Cu6 = new C29201Cu6(string, num);
        GridView gridView = (GridView) view.findViewById(R.id.note_grid);
        this.A00 = gridView;
        int floor = (int) Math.floor(AbstractC13880nE.A01(requireContext(), AbstractC13890nF.A01(requireContext())) / 120.0f);
        if (floor <= 0) {
            floor = 1;
        }
        gridView.setNumColumns(floor);
        InterfaceC09390do interfaceC09390do = this.A02;
        BZ3 bz3 = new BZ3(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), c29201Cu6, (C25816BbX) this.A01.getValue(), contentNotesOverflowFragmentUiState, C39E.A00(requireActivity(), this, AbstractC166987dD.A0r(interfaceC09390do)), AbstractC60952qJ.A01(AbstractC166987dD.A19(C27610CGg.class), false, false));
        AbstractC166987dD.A1Z(new MCK(bz3, this, (InterfaceC23621Ds) null, 48), AbstractC25229BEm.A0a(this));
        gridView.setAdapter((ListAdapter) bz3);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) AbstractC001800i.A0J(contentNotesOverflowFragmentUiState.A01);
        if (notesPogThoughtBubbleUiState == null) {
            return;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String str = notesPogThoughtBubbleUiState.A0C;
        String str2 = notesPogThoughtBubbleUiState.A0D;
        String str3 = notesPogThoughtBubbleUiState.A0I;
        String str4 = contentNotesOverflowFragmentUiState.A00;
        String str5 = c29201Cu6.A01;
        Integer num2 = c29201Cu6.A00;
        AbstractC167007dF.A1K(A0o, str);
        C14360o3.A0B(str4, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0o), "instagram_media_note_overflow_sheet_impression_client");
        if (!A0f.isSampled()) {
            return;
        }
        AbstractC25231BEo.A17(A0f, str4, str);
        A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num2, "inventory_source", str2));
        AbstractC25233BEq.A17(A0f, "carousel_media_id", str5);
        AbstractC25229BEm.A1B(A0f, str3);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC166987dD.A19(C27610CGg.class);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        GridView gridView = this.A00;
        if (gridView == null || gridView.getFirstVisiblePosition() == 0) {
            return true;
        }
        return false;
    }

    public C26855BtH() {
        DBH dbh = DBH.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, AbstractC25225BEi.A1E(AbstractC25225BEi.A1E(this, 26), 27));
        this.A01 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(A00, 28), dbh, C29899DGn.A00(null, A00, 46), AbstractC25225BEi.A1D(C25816BbX.class));
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
        int A02 = C0f9.A02(-1078859225);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.content_notes_overflow_sheet, viewGroup, false);
        C0f9.A09(-597967388, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(438008877);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(1185508331, A02);
    }
}
