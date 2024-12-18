package X;

import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import java.io.IOException;

/* renamed from: X.4CL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4CL {
    public static C4CO parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            OnboardingEntryActionType onboardingEntryActionType = null;
            OnboardingEntryPointPriority onboardingEntryPointPriority = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    onboardingEntryActionType = (OnboardingEntryActionType) OnboardingEntryActionType.A01.get(A1P2);
                    if (onboardingEntryActionType == null) {
                        onboardingEntryActionType = OnboardingEntryActionType.A06;
                    }
                } else if ("priority".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    onboardingEntryPointPriority = (OnboardingEntryPointPriority) OnboardingEntryPointPriority.A01.get(A1P);
                    if (onboardingEntryPointPriority == null) {
                        onboardingEntryPointPriority = OnboardingEntryPointPriority.A06;
                    }
                }
                c16l.A0z();
            }
            if (onboardingEntryActionType == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("action_type", "AppreciationPillEntryObjectImpl");
            } else if (onboardingEntryPointPriority == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("priority", "AppreciationPillEntryObjectImpl");
            } else {
                return new C4CO(onboardingEntryActionType, onboardingEntryPointPriority);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
