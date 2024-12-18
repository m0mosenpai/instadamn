package X;

import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CGZ {
    public static final NotesPogThoughtBubbleUiState A00(NoteTextContent noteTextContent, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167007dF.A1F(str, 0, str2);
        C14360o3.A0B(num2, 9);
        return new NotesPogThoughtBubbleUiState(null, user.Bhu(), null, noteTextContent, user, null, num, num2, C05F.A00, null, str, user.getId(), "", str2, str3, str4, "", str5, list, C16930sl.A00, -1, i, false, false, false, false, z, false, false, false, z2, z3, true, z4, z5, z6);
    }
}
