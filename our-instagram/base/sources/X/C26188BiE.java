package X;

import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.BiE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26188BiE extends C0T6 implements InterfaceC86513tO {
    public final C26053Bfg A00;
    public final NotesPogThoughtBubbleUiState A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26188BiE) {
                C26188BiE c26188BiE = (C26188BiE) obj;
                if (!C14360o3.A0K(this.A01, c26188BiE.A01) || !C14360o3.A0K(this.A00, c26188BiE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0M(this.A01) * 31);
    }

    public C26188BiE(C26053Bfg c26053Bfg, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState) {
        this.A01 = notesPogThoughtBubbleUiState;
        this.A00 = c26053Bfg;
    }
}
