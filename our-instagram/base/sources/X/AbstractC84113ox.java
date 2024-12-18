package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.3ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84113ox {
    public static C84123oy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C4CV c4cv = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("entry_point_container".equals(A0q)) {
                    c4cv = AbstractC88433wz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("enabled", "ClipsContentAppreciationInfo");
                throw C00O.createAndThrow();
            }
            return new C84123oy(c4cv, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C84123oy c84123oy) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("enabled", c84123oy.A01);
        C4CV c4cv = c84123oy.A00;
        if (c4cv != null) {
            anonymousClass182.A0r("entry_point_container");
            anonymousClass182.A0d();
            C4CS c4cs = c4cv.A00;
            if (c4cs != null) {
                anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                C4CR Eqr = c4cs.Eqr();
                anonymousClass182.A0d();
                OnboardingEntryActionType onboardingEntryActionType = Eqr.A00;
                if (onboardingEntryActionType != null) {
                    anonymousClass182.A0S("action_type", onboardingEntryActionType.A00);
                }
                anonymousClass182.A0a();
            }
            InterfaceC116715Qa interfaceC116715Qa = c4cv.A01;
            if (interfaceC116715Qa != null) {
                anonymousClass182.A0r("overflow");
                H2H Eqt = interfaceC116715Qa.Eqt();
                anonymousClass182.A0d();
                OnboardingEntryActionType onboardingEntryActionType2 = Eqt.A00;
                if (onboardingEntryActionType2 != null) {
                    anonymousClass182.A0S("action_type", onboardingEntryActionType2.A00);
                }
                anonymousClass182.A0a();
            }
            C4CP c4cp = c4cv.A02;
            if (c4cp != null) {
                anonymousClass182.A0r("pill");
                C4CO Equ = c4cp.Equ();
                anonymousClass182.A0d();
                OnboardingEntryActionType onboardingEntryActionType3 = Equ.A00;
                if (onboardingEntryActionType3 != null) {
                    anonymousClass182.A0S("action_type", onboardingEntryActionType3.A00);
                }
                OnboardingEntryPointPriority onboardingEntryPointPriority = Equ.A01;
                if (onboardingEntryPointPriority != null) {
                    anonymousClass182.A0S("priority", onboardingEntryPointPriority.A00);
                }
                anonymousClass182.A0a();
            }
            C116725Qb c116725Qb = c4cv.A03;
            if (c116725Qb != null) {
                anonymousClass182.A0r("ufi");
                anonymousClass182.A0d();
                AppreciationUFIEntryActionType appreciationUFIEntryActionType = c116725Qb.A01;
                if (appreciationUFIEntryActionType != null) {
                    anonymousClass182.A0S("action_type", appreciationUFIEntryActionType.A00);
                }
                anonymousClass182.A0Q("gift_count", c116725Qb.A00);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
