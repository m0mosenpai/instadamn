package X;

import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;

/* renamed from: X.EuL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33671EuL {
    public static C1117351z A00(CommentPrompt commentPrompt, InterfaceC101404gy interfaceC101404gy) {
        CommentPromptImpl commentPromptImpl;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        if (commentPrompt != null) {
            commentPromptImpl = commentPrompt.EsS();
        } else {
            commentPromptImpl = null;
        }
        return new C1117351z(commentPromptImpl, interfaceC101404gy != null ? interfaceC101404gy.F6u(A0b) : null);
    }
}
