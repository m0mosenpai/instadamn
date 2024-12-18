package X;

import android.content.Context;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.security.Signature;

/* renamed from: X.Q8c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58770Q8c extends AbstractC52922bZ {
    public final Context A00;
    public final C58656PzT A01;
    public final C2GT A02;
    public final C63337Shp A06;
    public final C62962SZf A07;
    public final C63346Si2 A08;
    public final C58443PvM A09;
    public final C2GS A05 = AbstractC58318PtA.A0J();
    public final C58252li A04 = AbstractC58318PtA.A0I();
    public final C58252li A03 = AbstractC58318PtA.A0I();

    public static Signature A00(C58770Q8c c58770Q8c, C63152Se0 c63152Se0) {
        boolean z;
        String message;
        try {
            return C63346Si2.A02(c58770Q8c.A08, c63152Se0.A02);
        } catch (GeneralSecurityException e) {
            if ((e instanceof UserNotAuthenticatedException) || ((message = e.getMessage()) != null && AbstractC001900j.A0a(message, "Key user not authenticated", false))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            throw e;
        }
    }

    public final void A01() {
        Object obj;
        C63167SeR c63167SeR = (C63167SeR) this.A05.A02();
        if (c63167SeR != null && (obj = c63167SeR.A01) != null) {
            ((SO8) obj).A00();
        }
    }

    public final void A02(Bundle bundle, String str, String str2) {
        this.A03.A0A(C63406Sjd.A03(null));
        SE2 A01 = AbstractC63061Sbi.A01(AbstractC58319PtB.A0W(bundle), str);
        Bundle bundle2 = A01.A01;
        AbstractC63243Sfx.A02("VERIFY_PIN_TO_DISABLE_PIN_HUB", bundle2);
        AbstractC58319PtB.A1A(bundle2, "REVOKE_AUTH_TICKET");
        if (bundle != null) {
            bundle2.putParcelable("logger_data", bundle.getParcelable("logger_data"));
        }
        C63167SeR.A01(this.A05, new SO8(null, null, null, new T2x(A01, this, str2, str, 0), A01, this.A09.A00.A03));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.RpU] */
    public final void A03(InterfaceC65507Tlc interfaceC65507Tlc, SE2 se2, C63152Se0 c63152Se0, Signature signature) {
        Bundle bundle = se2.A01;
        String string = bundle.getString("PAYMENT_TYPE");
        String A00 = AbstractC63243Sfx.A00(bundle, 1);
        int A03 = this.A01.A03(15);
        if (A03 != 0) {
            interfaceC65507Tlc.CyJ(new C64864TXp(A03));
            return;
        }
        String A01 = AbstractC63243Sfx.A01(bundle, 1);
        if (TextUtils.isEmpty(A01)) {
            A01 = "VERIFY_BIO";
        }
        Bundle A0b = AbstractC166987dD.A0b();
        string.getClass();
        A0b.putString("BUNDLE_KEY_PAYMENT_TYPE", string);
        A00.getClass();
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A00);
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A01);
        if (!TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PAYMENT_TYPE")) && !TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            C63291Sgr c63291Sgr = null;
            ?? obj = new Object();
            obj.A00 = A0b;
            if (signature != null) {
                c63291Sgr = new C63291Sgr(signature);
            }
            this.A09.A00.A03.execute(new TRJ(c63291Sgr, obj, this, interfaceC65507Tlc, se2, c63152Se0));
            return;
        }
        throw AbstractC166987dD.A12("The payment type and the primary flow type should not be null.");
    }

    public C58770Q8c(Context context, C63337Shp c63337Shp, C62962SZf c62962SZf, C63174SeZ c63174SeZ, C58443PvM c58443PvM) {
        int i;
        this.A00 = context;
        this.A07 = c62962SZf;
        this.A06 = c63337Shp;
        this.A09 = c58443PvM;
        this.A01 = new C58656PzT(new C58657PzU(context));
        C63346Si2 c63346Si2 = c63174SeZ.A01;
        this.A08 = c63346Si2;
        Object obj = null;
        if (!TextUtils.isEmpty("BIO")) {
            i = 13;
        } else {
            if (!TextUtils.isEmpty(null)) {
                obj.getClass();
                throw C00O.createAndThrow();
            }
            if (!TextUtils.isEmpty(null)) {
                obj.getClass();
                throw C00O.createAndThrow();
            }
            i = 12;
        }
        C63581Spo c63581Spo = new C63581Spo(c63346Si2, i);
        REN ren = c63346Si2.A01;
        AbstractC63144Sdq.A02(ren);
        this.A02 = TW3.A00(C75M.A01(ren.A03, new TW1(6, c63581Spo, c63346Si2)), this, 3);
    }
}
