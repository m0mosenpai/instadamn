package X;

import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.7D2, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7D2 {
    public static final DirectPromptTypes A01(String str) {
        if (str != null && str.length() != 0) {
            for (DirectPromptTypes directPromptTypes : DirectPromptTypes.values()) {
                if (str.equals(directPromptTypes.A01)) {
                    return directPromptTypes;
                }
            }
            if (str.equals("challenge_winner")) {
                return DirectPromptTypes.A05;
            }
        }
        return DirectPromptTypes.A0A;
    }

    public static final DirectPromptTypes A00(int i) {
        for (DirectPromptTypes directPromptTypes : DirectPromptTypes.values()) {
            if (i == directPromptTypes.A00) {
                return directPromptTypes;
            }
        }
        return DirectPromptTypes.A0A;
    }
}
