package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MW1 {
    public static final C101394gx A00(String str) {
        C101394gx c101394gx = null;
        if (str != null) {
            try {
                c101394gx = AbstractC101354gs.parseFromJson(C16V.A00(str));
                return c101394gx;
            } catch (IOException e) {
                AbstractC12120kG.A06("CommentPollConverter", "Failed to deserialize Poll from ClipsDraft", e);
            }
        }
        return c101394gx;
    }
}
