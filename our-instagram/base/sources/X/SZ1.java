package X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class SZ1 {
    public final QDE A00;
    public final QDB A01;
    public final QDC A02;
    public final QDD A03;
    public final QDA A04;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    private SZU A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        String A00 = instantExperiencesJSBridgeCall.A00();
        switch (A00.hashCode()) {
            case -2010971576:
                if (A00.equals("canMakePayment")) {
                    return this.A02;
                }
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
            case -1167572077:
                if (A00.equals("paymentsCheckout")) {
                    return this.A04;
                }
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
            case -267636863:
                if (A00.equals("requestAutoFill")) {
                    return this.A00;
                }
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
            case -257417255:
                if (A00.equals("paymentsChargeRequst")) {
                    return this.A03;
                }
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
            case 1722704025:
                if (A00.equals("saveAutofillData")) {
                    return this.A01;
                }
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
            default:
                C0K8.A0O("InstantExperiencesCallHandler", "Unknown call code '%s'", A00);
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.SZU, X.QDB] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.SZU, X.QDA] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.QDC, X.SZU] */
    public SZ1(C62898SWe c62898SWe, SHH shh, R7U r7u, C60892Rb6 c60892Rb6, UserSession userSession) {
        this.A00 = new QDE(c62898SWe, r7u, c60892Rb6, userSession, Executors.newSingleThreadExecutor());
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        ?? szu = new SZU(r7u);
        szu.A02 = userSession;
        szu.A01 = c60892Rb6;
        szu.A03 = newSingleThreadExecutor;
        szu.A00 = shh;
        this.A01 = szu;
        this.A04 = new SZU(r7u);
        this.A02 = new SZU(r7u);
        this.A03 = new QDD(r7u, userSession);
    }

    public final void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        try {
            SZU A00 = A00(instantExperiencesJSBridgeCall);
            if (A00 != null) {
                A00.A02(instantExperiencesJSBridgeCall);
            }
        } catch (Rk1 e) {
            instantExperiencesJSBridgeCall.A02(new InstantExperiencesCallResult(e.A00, e.getMessage()));
            SZU A002 = A00(instantExperiencesJSBridgeCall);
            if (A002 != null) {
                A002.A01(instantExperiencesJSBridgeCall);
            }
        }
    }
}
