package X;

import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import java.io.IOException;

/* renamed from: X.Hpo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40062Hpo {
    public static H4A parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MediaGiftCountVisibilityState mediaGiftCountVisibilityState = null;
            MediaGiftingState mediaGiftingState = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2430);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    mediaGiftCountVisibilityState = (MediaGiftCountVisibilityState) MediaGiftCountVisibilityState.A01.get(A1P2);
                    if (mediaGiftCountVisibilityState == null) {
                        mediaGiftCountVisibilityState = MediaGiftCountVisibilityState.A06;
                    }
                } else if ("media_gifting_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaGiftingState = (MediaGiftingState) MediaGiftingState.A01.get(A1P);
                    if (mediaGiftingState == null) {
                        mediaGiftingState = MediaGiftingState.A06;
                    }
                }
                c16l.A0z();
            }
            if (mediaGiftCountVisibilityState == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "MediaAppreciationSettings");
            } else if (mediaGiftingState == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_gifting_state", c16l, "MediaAppreciationSettings");
            } else {
                return new H4A(mediaGiftCountVisibilityState, mediaGiftingState);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
