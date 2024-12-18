package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.fbpay.auth.models.PttPayload;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Q8d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58771Q8d extends AbstractC52922bZ {
    public Bundle A00;
    public C63152Se0 A01;
    public String A02;
    public final Context A03;
    public final C58252li A04;
    public final C58252li A05 = AbstractC58318PtA.A0I();
    public final C58252li A06;
    public final C2GS A07;
    public final C62962SZf A08;
    public final C2GS A09;

    public final int A01() {
        String string = this.A00.getString("CARD_INFO", "");
        Locale locale = Locale.US;
        if (!string.toLowerCase(locale).contains("american express") && !this.A00.getString("CARD_INFO", "").toLowerCase(locale).contains("amex")) {
            return 3;
        }
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.RpU] */
    public final void A02(Bundle bundle) {
        this.A00 = bundle;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("BUNDLE_KEY_PAYMENT_TYPE", AbstractC31173DnH.A0j(this.A00, "PAYMENT_TYPE"));
        String A00 = AbstractC63243Sfx.A00(this.A00, 1);
        A00.getClass();
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_TYPE", A00);
        String A01 = AbstractC63243Sfx.A01(this.A00, 1);
        A01.getClass();
        A0b.putString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", A01);
        if (!TextUtils.isEmpty(AbstractC63243Sfx.A00(this.A00, 2)) && !TextUtils.isEmpty(AbstractC63243Sfx.A01(this.A00, 2))) {
            A0b.putString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", AbstractC63243Sfx.A00(this.A00, 2));
            A0b.putString("BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE", AbstractC63243Sfx.A01(this.A00, 2));
        }
        C2GS c2gs = this.A07;
        if (!TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PAYMENT_TYPE")) && !TextUtils.isEmpty(A0b.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE"))) {
            ?? obj = new Object();
            obj.A00 = A0b;
            c2gs.A0B(obj);
            return;
        }
        throw AbstractC166987dD.A12("The payment type and the primary flow type should not be null.");
    }

    public final boolean A03() {
        Bundle bundle = this.A00;
        bundle.getClass();
        return "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE"));
    }

    public C58771Q8d(Context context, C62962SZf c62962SZf) {
        C58252li A0I = AbstractC58318PtA.A0I();
        this.A06 = A0I;
        C58252li A0I2 = AbstractC58318PtA.A0I();
        this.A04 = A0I2;
        this.A07 = AbstractC58318PtA.A0J();
        C2GS A0J = AbstractC58318PtA.A0J();
        this.A09 = A0J;
        this.A08 = c62962SZf;
        this.A03 = context;
        C58252li A02 = C75M.A02(A0J, new TW3(this, 5));
        C63628Sqa.A03(A02, A0I2, this, 39);
        A02.A09(new C63625SqX(A02, C63628Sqa.A00(this, 40), 18));
        C63628Sqa.A03(A02, A0I, this, 41);
    }

    public static void A00(C58771Q8d c58771Q8d) {
        String str;
        String str2;
        PttPayload byCsc;
        String str3;
        String str4;
        try {
            C63346Si2 A01 = C63174SeZ.A01();
            if (c58771Q8d.A03()) {
                str = "PAYPAL_ACCESS_TOKEN";
            } else {
                str = "CSC";
            }
            C63152Se0 A06 = A01.A06(str, AbstractC63062Sbj.A01(c58771Q8d.A00));
            C2GS c2gs = c58771Q8d.A09;
            C63346Si2 A012 = C63174SeZ.A01();
            String A00 = AbstractC63062Sbj.A00(c58771Q8d.A00);
            boolean A03 = c58771Q8d.A03();
            String A013 = C2FP.A0C().A01();
            String packageName = c58771Q8d.A03.getPackageName();
            String str5 = c58771Q8d.A02;
            str5.getClass();
            Bundle bundle = c58771Q8d.A00;
            if (A03) {
                if (bundle == null) {
                    str4 = null;
                } else {
                    str4 = bundle.getString("CREDENTIAL_ID");
                }
                byCsc = PttPayload.byPayPal(A013, packageName, str5, str4, A06.A07, AbstractC63062Sbj.A01(c58771Q8d.A00));
            } else {
                if (bundle == null) {
                    str2 = null;
                } else {
                    str2 = bundle.getString("CREDENTIAL_ID");
                }
                str2.getClass();
                byCsc = PttPayload.byCsc(A013, packageName, str5, str2, A06.A07, AbstractC63062Sbj.A01(c58771Q8d.A00));
            }
            HashSet A1H = AbstractC166987dD.A1H();
            Collections.addAll(A1H, A06);
            Bundle bundle2 = c58771Q8d.A00;
            if (bundle2 != null) {
                str3 = bundle2.getString("PAYMENT_ACCOUNT_ID");
            } else {
                str3 = null;
            }
            Map A014 = SSA.A01(c58771Q8d.A00);
            AbstractC167007dF.A1G(byCsc, 2, A014);
            c2gs.A0B(new SXG(AbstractC63063Sbk.A00(new C64192T3b(A012, 1), A1H), byCsc, A00, str3, null, null, null, null, A014, A1H));
            c58771Q8d.A01 = A06;
        } catch (IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
            c58771Q8d.A06.A0B(e);
        }
    }
}
