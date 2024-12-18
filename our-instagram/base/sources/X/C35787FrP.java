package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35787FrP implements CallerContextable {
    public static final String __redex_internal_original_name = "OnboardingStepNavigator";
    public final InterfaceC37264GbH A00;

    public C35787FrP(InterfaceC37264GbH interfaceC37264GbH) {
        this.A00 = interfaceC37264GbH;
    }

    public static final Bundle A00(C35781FrJ c35781FrJ) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("IS_SIGN_UP_FLOW", true);
        UserSession userSession = c35781FrJ.A00;
        if (userSession != null) {
            AbstractC03240Dh.A00(A0b, userSession);
        }
        return A0b;
    }
}
