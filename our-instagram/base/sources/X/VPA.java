package X;

import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VPA {
    public static URP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(899).equals(A0s)) {
                    textAppSearchDiscussionTopicImpl = AbstractC99264cs.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1222).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(1223).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1349).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new URP(textAppSearchDiscussionTopicImpl, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
