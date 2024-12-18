package X;

import com.instagram.api.schemas.AiAgentMetadataDictImpl;
import com.instagram.api.schemas.IGAIAgentType;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO0 {
    public static AiAgentMetadataDictImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            IGAIAgentType iGAIAgentType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ai_agent_ent_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ai_agent_persona_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("ai_agent_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGAIAgentType = AnonymousClass565.A00(A1P);
                }
                c16l.A0z();
            }
            return new AiAgentMetadataDictImpl(iGAIAgentType, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
