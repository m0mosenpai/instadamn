package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.LeC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48575LeC implements C39G {
    public final Activity A00;
    public final UserSession A01;
    public final C27948CTi A02;

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
    public final void DXF(Fragment fragment, C51D c51d) {
    }

    @Override // X.C39G
    public final void DkQ(View view, Fragment fragment, ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC60442pS interfaceC60442pS, Integer num) {
    }

    @Override // X.C39G
    public final void DkR(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
    }

    @Override // X.C39H
    public final void EXO(InterfaceC16660sJ interfaceC16660sJ) {
    }

    @Override // X.C39G
    public final void ElH(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
    }

    @Override // X.C39G
    public final void DX7(View view, NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, InterfaceC60442pS interfaceC60442pS, Integer num, Integer num2, Long l, String str, boolean z, boolean z2) {
        String str2 = contentNoteMetadata.A09;
        if (str2 != null) {
            BSo.A00.A04(EnumC25577BSp.REPLY_SHEET, this.A01, contentNoteMetadata.A04, contentNoteMetadata.A06, contentNoteMetadata.A0A, str2);
        }
        this.A02.A00(this.A00);
    }

    public C48575LeC(Activity activity, UserSession userSession, C27948CTi c27948CTi) {
        AbstractC167017dG.A1Q(userSession, c27948CTi);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = c27948CTi;
    }
}
