package X;

import java.io.IOException;

/* renamed from: X.MVz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50614MVz {
    public static final C51685MsG A00(String str) {
        C51685MsG c51685MsG = null;
        if (str != null) {
            try {
                C16L A03 = AbstractC221915u.A00.A03(str);
                A03.A12();
                c51685MsG = OXq.parseFromJson(A03);
                return c51685MsG;
            } catch (IOException e) {
                AbstractC12120kG.A06("BioProductConverter", "Failed to deserialize UpcomingEvent from ClipsDraft", e);
            }
        }
        return c51685MsG;
    }
}
