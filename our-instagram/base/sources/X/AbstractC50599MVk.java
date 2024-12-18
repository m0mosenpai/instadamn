package X;

import java.io.IOException;

/* renamed from: X.MVk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50599MVk {
    public static final C9JS A00(String str) {
        C9JS c9js = null;
        if (str != null) {
            try {
                c9js = C9JR.parseFromJson(C16V.A00(str));
                return c9js;
            } catch (IOException e) {
                AbstractC12120kG.A06("ClipsRemixDraftModelConverter", "Failed to deserialize ClipsRemixDraftModel from ClipsDraft", e);
            }
        }
        return c9js;
    }
}
