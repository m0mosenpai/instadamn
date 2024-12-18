package X;

import java.io.IOException;

/* renamed from: X.MVl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50600MVl {
    public static final C203248yh A00(String str) {
        C203248yh c203248yh = null;
        if (str != null) {
            try {
                c203248yh = AbstractC203258yi.parseFromJson(C16V.A00(str));
                return c203248yh;
            } catch (IOException e) {
                AbstractC12120kG.A06("SerializedMediaEditsConverter", "Failed to deserialize SerializedMediaEdits from Clips draft.", e);
            }
        }
        return c203248yh;
    }
}
