package X;

import com.instagram.api.schemas.OnboardingEntryActionType;
import java.io.IOException;

/* renamed from: X.4CT, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4CT {
    public static H2H parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            OnboardingEntryActionType onboardingEntryActionType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    onboardingEntryActionType = (OnboardingEntryActionType) OnboardingEntryActionType.A01.get(A1P);
                    if (onboardingEntryActionType == null) {
                        onboardingEntryActionType = OnboardingEntryActionType.A06;
                    }
                }
                c16l.A0z();
            }
            if (onboardingEntryActionType == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("action_type", "AppreciationOverFlowEntryObjectImpl");
                throw C00O.createAndThrow();
            }
            return new H2H(onboardingEntryActionType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
