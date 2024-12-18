package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MW0 {
    public static final C38686GzR A00(String str) {
        C38686GzR c38686GzR = null;
        if (str != null) {
            try {
                c38686GzR = AbstractC41651Ibj.parseFromJson(C16V.A00(str));
                return c38686GzR;
            } catch (IOException e) {
                AbstractC12120kG.A06("ClipsShoppingMetadataConverter", "Failed to deserialize ClipsBrandedContentDraftModel from ClipsDraft", e);
            }
        }
        return c38686GzR;
    }
}
