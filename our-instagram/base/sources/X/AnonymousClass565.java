package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.565, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass565 {
    public static final IGAIAgentType A00(String str) {
        IGAIAgentType iGAIAgentType = (IGAIAgentType) IGAIAgentType.A01.get(str);
        if (iGAIAgentType == null) {
            return IGAIAgentType.A07;
        }
        return iGAIAgentType;
    }
}
