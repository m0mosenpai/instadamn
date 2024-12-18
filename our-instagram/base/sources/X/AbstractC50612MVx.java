package X;

import java.io.IOException;

/* renamed from: X.MVx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50612MVx {
    public static final C38709H2v A00(String str) {
        C38709H2v c38709H2v = null;
        if (str != null) {
            try {
                C16L A03 = AbstractC221915u.A00.A03(str);
                A03.A12();
                c38709H2v = ONO.parseFromJson(A03);
                return c38709H2v;
            } catch (IOException e) {
                AbstractC12120kG.A06("ContentSchedulingMetadataConverter", "Failed to deserialize ContentSchedulingMetadata from ClipsDraft", e);
            }
        }
        return c38709H2v;
    }
}
