package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.CuB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29206CuB implements C39G {
    public final Fragment A00;
    public final UserSession A01;
    public final C27822COl A02;
    public final CT8 A03;
    public final InterfaceC09390do A04;
    public final boolean A05;
    public final boolean A06;
    public final C19L A07;

    public C29206CuB(Fragment fragment, UserSession userSession, C27822COl c27822COl, CT8 ct8, C19L c19l, boolean z, boolean z2) {
        AbstractC25229BEm.A1I(userSession, 1, c27822COl);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A07 = c19l;
        this.A05 = z;
        this.A03 = ct8;
        this.A02 = c27822COl;
        this.A06 = z2;
        this.A04 = C1XM.A00(AbstractC25225BEi.A1E(this, 7));
    }

    @Override // X.C39G
    public final void D7N(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC16820sZ interfaceC16820sZ) {
    }

    @Override // X.C39G
    public final void DJr(NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, InterfaceC60442pS interfaceC60442pS, Integer num, Long l, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.C39G
    public final void DQi(InterfaceC11380iw interfaceC11380iw, InterfaceC904941j interfaceC904941j, EnumC27425C8s enumC27425C8s, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z) {
    }

    @Override // X.C39H
    public final void DWK(EnumC85043qs enumC85043qs, C38321qM c38321qM, Integer num, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C39G
    public final void DX7(View view, NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, InterfaceC60442pS interfaceC60442pS, Integer num, Integer num2, Long l, String str, boolean z, boolean z2) {
    }

    @Override // X.C39G
    public final void DXF(Fragment fragment, C51D c51d) {
    }

    @Override // X.C39G
    public final void DkQ(View view, Fragment fragment, ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC60442pS interfaceC60442pS, Integer num) {
    }

    @Override // X.C39G
    public final void DkR(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        AbstractC166987dD.A1Z(new D54(notesPogThoughtBubbleUiState, this, num, str, null), this.A07);
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C39G
    public final void ElH(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
    }
}
