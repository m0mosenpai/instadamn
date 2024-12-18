package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BtP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26863BtP extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ContentNotesImmersiveSelfNoteFragment";
    public RecyclerView A00;
    public C49512LuR A01;
    public C3FR A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final InterfaceC11380iw A0A;
    public final C29269CvQ A0B;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.UAi] */
    @Override // X.C51D
    public final void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        if (isAdded()) {
            ViewGroup viewGroup = (ViewGroup) interfaceC56392iX.getView();
            LithoView lithoView = new LithoView(viewGroup.getContext());
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            marginLayoutParams.A00 = 1;
            viewGroup.setLayoutParams(marginLayoutParams);
            lithoView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            lithoView.setId(R.id.self_content_notes_bottomsheet_above_title);
            viewGroup.addView(lithoView);
            InterfaceC09390do interfaceC09390do = this.A03;
            ContentNotesImmersiveSelfNoteContent contentNotesImmersiveSelfNoteContent = (ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue();
            InterfaceC09390do interfaceC09390do2 = this.A09;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
            C14360o3.A0B(contentNotesImmersiveSelfNoteContent, 0);
            C14360o3.A0B(A0r, 1);
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = contentNotesImmersiveSelfNoteContent.A01;
            String str = notesPogThoughtBubbleUiState.A0F;
            NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
            ImageUrl imageUrl = notesPogThoughtBubbleUiState.A03;
            boolean z = notesPogThoughtBubbleUiState.A0N;
            String str2 = notesPogThoughtBubbleUiState.A0J;
            String str3 = notesPogThoughtBubbleUiState.A0H;
            Integer num = notesPogThoughtBubbleUiState.A07;
            User user = notesPogThoughtBubbleUiState.A06;
            boolean z2 = notesPogThoughtBubbleUiState.A0P;
            Long l = notesPogThoughtBubbleUiState.A0B;
            int i = notesPogThoughtBubbleUiState.A00;
            String str4 = notesPogThoughtBubbleUiState.A0C;
            Integer num2 = C05F.A0N;
            String str5 = notesPogThoughtBubbleUiState.A0D;
            String str6 = notesPogThoughtBubbleUiState.A0I;
            List list = notesPogThoughtBubbleUiState.A0L;
            List list2 = notesPogThoughtBubbleUiState.A0K;
            boolean z3 = notesPogThoughtBubbleUiState.A0S;
            Integer num3 = notesPogThoughtBubbleUiState.A08;
            boolean z4 = notesPogThoughtBubbleUiState.A0Q;
            String str7 = notesPogThoughtBubbleUiState.A0E;
            ImageUrl imageUrl2 = notesPogThoughtBubbleUiState.A04;
            int i2 = notesPogThoughtBubbleUiState.A01;
            boolean z5 = notesPogThoughtBubbleUiState.A0R;
            Integer num4 = notesPogThoughtBubbleUiState.A09;
            C85363rR c85363rR = C85363rR.A00;
            NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = new NotesPogThoughtBubbleUiState(notesPogThoughtBubbleUiState.A02, imageUrl, imageUrl2, noteTextContent, user, num, num2, num3, num4, l, str, str2, str3, str4, str5, str6, str7, null, list, list2, i, i2, z, z2, false, z3, z4, z5, true, false, c85363rR.A0B(A0r), c85363rR.A0A(A0r), notesPogThoughtBubbleUiState.A0V, C18U.A06(C06090Tz.A05, A0r, 36326635821873169L), C85363rR.A06(A0r), C85363rR.A07(A0r));
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
            C60962qK A01 = AbstractC60952qJ.A01(__redex_internal_original_name, ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A02, ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A03);
            InterfaceC11380iw interfaceC11380iw = this.A0A;
            C29201Cu6 c29201Cu6 = new C29201Cu6(((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A00.A05, ((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A00.A02);
            C44471Jld c44471Jld = (C44471Jld) this.A08.getValue();
            long doubleToRawLongBits = Double.doubleToRawLongBits(136.0d);
            long doubleToRawLongBits2 = Double.doubleToRawLongBits(190.0d);
            C29205CuA c29205CuA = (C29205CuA) this.A06.getValue();
            Resources A0N = AbstractC166997dE.A0N(this);
            C14360o3.A07(A0N);
            String A00 = AbstractC46776KmX.A00(A0N, new NoteAudienceItem(BFV.A00(AbstractC25228BEl.A0v(interfaceC09390do).A07), null, null, 0));
            int length = A00.length();
            String A0r3 = AbstractC166997dE.A0r(A0N, A00, 2131954101);
            C14360o3.A07(A0r3);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0r3);
            StyleSpan styleSpan = new StyleSpan(1);
            int length2 = A0r3.length();
            A0H.setSpan(styleSpan, length2 - length, length2, 18);
            lithoView.setComponentAsync(new C26507BnS(A0H, interfaceC11380iw, A0r2, c29201Cu6, notesPogThoughtBubbleUiState2, c29205CuA, c44471Jld, A01, doubleToRawLongBits, doubleToRawLongBits2));
        }
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
    public final boolean isElementAboveTitleEnabled() {
        return true;
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
        C3FR c3fr;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MC8 mc8 = new MC8(c07s, this, viewLifecycleOwner, null, 40);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mc8, A00);
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MC8(c07s, this, viewLifecycleOwner2, null, 41), C07Y.A00(viewLifecycleOwner2));
        C07S c07s2 = C07S.STARTED;
        C07X viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MC8(c07s2, this, viewLifecycleOwner3, null, 42), C07Y.A00(viewLifecycleOwner3));
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            c3fr = null;
        } else {
            C3FQ A002 = C3FN.A00(recyclerView);
            C14360o3.A0C(A002, AbstractC43591JPw.A00(434));
            c3fr = (C3FR) A002;
            c3fr.Ehc(new D13(this));
            c3fr.EPJ(this.A01);
        }
        this.A02 = c3fr;
        view.setBackground(AbstractC25225BEi.A0G(AbstractC167007dF.A09(getThemedContext(), R.attr.igds_color_elevated_background)));
        View A0S = AbstractC166997dE.A0S(view, R.id.note_action_buttons);
        C07X viewLifecycleOwner4 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCP(viewLifecycleOwner4, c07s2, this, A0S, null, 40), C07Y.A00(viewLifecycleOwner4));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public C26863BtP() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = DH6.A01(this, "note_content", enumC09460dv, 28);
        this.A06 = C1XM.A00(DBE.A00);
        C50156MDj A1E = AbstractC25225BEi.A1E(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, AbstractC25225BEi.A1E(AbstractC25225BEi.A1E(this, 15), 16));
        this.A07 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(A00, 17), A1E, C29899DGn.A00(null, A00, 44), AbstractC25225BEi.A1D(C25858BcD.class));
        DBF dbf = DBF.A00;
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, AbstractC25225BEi.A1E(AbstractC25225BEi.A1E(this, 18), 19));
        this.A08 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(A002, 20), dbf, C29899DGn.A00(null, A002, 45), AbstractC25225BEi.A1D(C44471Jld.class));
        C50156MDj A1E2 = AbstractC25225BEi.A1E(this, 9);
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, AbstractC25225BEi.A1E(AbstractC25225BEi.A1E(this, 12), 13));
        this.A05 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(A003, 14), A1E2, C29899DGn.A00(null, A003, 43), AbstractC25225BEi.A1D(C44528JmY.class));
        this.A04 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(this, 11), AbstractC25225BEi.A1E(this, 8), C29899DGn.A00(null, this, 41), AbstractC25225BEi.A1D(C25854Bc9.class));
        this.A0B = new C29269CvQ(this);
        this.A0A = new C19270xB(__redex_internal_original_name);
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
        int A02 = C0f9.A02(1646900548);
        C14360o3.A0B(layoutInflater, 0);
        C25854Bc9 c25854Bc9 = (C25854Bc9) this.A04.getValue();
        InterfaceC09390do interfaceC09390do = this.A03;
        c25854Bc9.A00(((ContentNotesImmersiveSelfNoteContent) interfaceC09390do.getValue()).A00.A08);
        View inflate = layoutInflater.inflate(R.layout.content_notes_immersive_self_note, viewGroup, false);
        if (AbstractC166987dD.A1b(AbstractC25228BEl.A0v(interfaceC09390do).A0K)) {
            this.A00 = (RecyclerView) inflate.findViewById(R.id.notes_user_rows_recycler_view);
            LayoutInflater layoutInflater2 = getLayoutInflater();
            C14360o3.A07(layoutInflater2);
            this.A01 = new C49512LuR(layoutInflater2, this, this.A0B);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A14(new C44220JgP(this, 2));
            }
        }
        C0f9.A09(1923793821, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-913791833);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        ((C25854Bc9) this.A04.getValue()).A01(((ContentNotesImmersiveSelfNoteContent) this.A03.getValue()).A00.A08, null);
        C0f9.A09(1634813160, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-902574305);
        super.onResume();
        ((C44528JmY) this.A05.getValue()).A02(false);
        C0f9.A09(193121295, A02);
    }
}
