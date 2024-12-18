package X;

import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.3PP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3PP {
    public static final RingSpec A00(UserSession userSession, Reel reel) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(userSession, 1);
        RingSpec A05 = reel.A05(userSession);
        if (A05 == null) {
            if (!reel.A0y(userSession) && !AbstractC001800i.A0u(AbstractC16960so.A1Q(HighlightReelTypeStr.A05, HighlightReelTypeStr.A06), reel.A09)) {
                if (!reel.A0x(userSession)) {
                    if (reel.A10(userSession)) {
                        if (C3DL.A01(userSession, true)) {
                            interfaceC09390do = C3Oc.A0I;
                        }
                        interfaceC09390do = C3Oc.A0D;
                    } else if (!reel.A12(userSession)) {
                        if (reel.A11(userSession)) {
                            interfaceC09390do = C3Oc.A0J;
                        } else if (reel.A0u()) {
                            interfaceC09390do = C3Oc.A0K;
                        } else {
                            if (C14640oc.A02()) {
                                interfaceC09390do = C3Oc.A0G;
                            }
                            interfaceC09390do = C3Oc.A0D;
                        }
                    }
                }
                interfaceC09390do = C3Oc.A0C;
            } else {
                interfaceC09390do = C3Oc.A0F;
            }
            return (RingSpec) interfaceC09390do.getValue();
        }
        return A05;
    }

    public static final void A02(UserSession userSession, Reel reel, GradientSpinner gradientSpinner) {
        C14360o3.A0B(gradientSpinner, 0);
        RingSpec A05 = reel.A05(userSession);
        if (A05 == null) {
            A05 = A00(userSession, reel);
        }
        gradientSpinner.setGradientColors(A05);
    }

    public static final void A03(GradientSpinner gradientSpinner, C3PO c3po, boolean z) {
        C14360o3.A0B(gradientSpinner, 0);
        gradientSpinner.setGradientColors(A01(c3po, z));
    }

    public static final RingSpec A01(C3PO c3po, boolean z) {
        InterfaceC09390do interfaceC09390do;
        if (c3po == C3PO.A0A) {
            interfaceC09390do = C3Oc.A0F;
        } else if (c3po == C3PO.A04 && !z) {
            interfaceC09390do = C3Oc.A0C;
        } else {
            interfaceC09390do = C3Oc.A0B;
        }
        return (RingSpec) interfaceC09390do.getValue();
    }
}
