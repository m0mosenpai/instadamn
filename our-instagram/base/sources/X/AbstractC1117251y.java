package X;

import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;
import java.io.IOException;

/* renamed from: X.51y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1117251y {
    public static C1117351z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CommentPromptImpl commentPromptImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C101394gx c101394gx = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("comment_prompt".equals(A0q)) {
                    commentPromptImpl = AbstractC33676EuQ.parseFromJson(c16l);
                } else if ("poll".equals(A0q)) {
                    c101394gx = AbstractC101354gs.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C1117351z(commentPromptImpl, c101394gx);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1117351z c1117351z) {
        anonymousClass182.A0d();
        CommentPrompt commentPrompt = c1117351z.A00;
        if (commentPrompt != null) {
            anonymousClass182.A0r("comment_prompt");
            CommentPromptImpl EsS = commentPrompt.EsS();
            anonymousClass182.A0d();
            String str = EsS.A01;
            if (str != null) {
                anonymousClass182.A0S("parent_comment_id", str);
            }
            Integer num = EsS.A00;
            if (num != null) {
                anonymousClass182.A0Q("reply_count", num.intValue());
            }
            anonymousClass182.A0a();
        }
        C101394gx c101394gx = c1117351z.A01;
        if (c101394gx != null) {
            anonymousClass182.A0r("poll");
            AbstractC101354gs.A00(anonymousClass182, c101394gx, true);
        }
        anonymousClass182.A0a();
    }
}
