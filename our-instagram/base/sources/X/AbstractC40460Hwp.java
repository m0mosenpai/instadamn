package X;

import com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfoImpl;
import java.io.IOException;

/* renamed from: X.Hwp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40460Hwp {
    public static XDTMetaAIMediaSuggestedPromptInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if ("prompt_text".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new XDTMetaAIMediaSuggestedPromptInfoImpl(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}