package X;

import com.instagram.api.schemas.CommentPrompt;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EuP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33675EuP {
    public static Map A00(CommentPrompt commentPrompt) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (commentPrompt.BbH() != null) {
            A1I.put("parent_comment_id", commentPrompt.BbH());
        }
        if (commentPrompt.BnC() != null) {
            A1I.put("reply_count", commentPrompt.BnC());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
