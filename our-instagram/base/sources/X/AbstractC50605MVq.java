package X;

import java.io.IOException;

/* renamed from: X.MVq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50605MVq {
    public static final C54632OBh A00(String str) {
        C54632OBh c54632OBh = null;
        if (str != null) {
            try {
                c54632OBh = AbstractC54866OOb.parseFromJson(C16V.A00(str));
                return c54632OBh;
            } catch (IOException e) {
                AbstractC12120kG.A06("ClipsBrandedContentDraftModel", "Failed to deserialize ClipsBrandedContentDraftModel from ClipsDraft", e);
            }
        }
        return c54632OBh;
    }
}
