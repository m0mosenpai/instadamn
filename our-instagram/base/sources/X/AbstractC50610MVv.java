package X;

import java.io.IOException;

/* renamed from: X.MVv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50610MVv {
    public static final C110204xp A00(String str) {
        C110204xp c110204xp = null;
        if (str != null) {
            try {
                c110204xp = AbstractC88493x6.parseFromJson(C16V.A00(str));
                return c110204xp;
            } catch (IOException e) {
                AbstractC12120kG.A06("ClipsTemplateInfoConverter", "Failed to deserialize ClipsTemplateInfo from ClipsDraft", e);
            }
        }
        return c110204xp;
    }
}
