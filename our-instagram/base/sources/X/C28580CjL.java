package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

/* renamed from: X.CjL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28580CjL implements TextWatcher {
    public boolean A00;
    public final UserSession A01;
    public final ContentNotesImmersiveReplyContent A02;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A00) {
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = this.A02;
            ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
            BSo.A00.A07(this.A01, contentNoteMetadata.A02, contentNoteMetadata.A04, contentNoteMetadata.A06, contentNoteMetadata.A05, contentNoteMetadata.A0A, contentNotesImmersiveReplyContent.A07);
            this.A00 = true;
        }
    }

    public C28580CjL(UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent) {
        AbstractC167017dG.A1P(contentNotesImmersiveReplyContent, userSession);
        this.A02 = contentNotesImmersiveReplyContent;
        this.A01 = userSession;
    }
}
