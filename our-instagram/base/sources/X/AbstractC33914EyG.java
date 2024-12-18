package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.EyG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33914EyG {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        try {
            FNM parseFromJson = AbstractC34036F0p.parseFromJson(C16V.A00(AbstractC31177DnL.A0d(c6fw)));
            if (parseFromJson != null) {
                AbstractC12990ll A0B = C6BQ.A0B(c6fq);
                if (!(A0B instanceof UserSession)) {
                    AbstractC25241Le.A02("IGBloksActionChallengeShowCheckpointImpl", "Attempt to render user avatar node outside of logged in user context");
                } else if (parseFromJson.A04) {
                    if (C28121Xq.A00 != null) {
                        C41451vu.A01.E4s(new C3II(A0B, new C35027Fc0()));
                        return null;
                    }
                } else {
                    G06 A00 = FTX.A00(A0B);
                    C14360o3.A07(A00);
                    A00.A02(C6BQ.A04(c6fq), parseFromJson);
                    return null;
                }
            }
            return null;
        } catch (IOException unused) {
            AbstractC25241Le.A02("IGBloksActionChallengeShowCheckpointImpl", "Unable to parse challenge.");
            return null;
        }
    }
}
