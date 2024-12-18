package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.T2p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64183T2p implements TmO {
    public final Q8V A00;

    @Override // X.TmO
    public final C63152Se0 BLy() {
        throw AbstractC166987dD.A14("Should not be called");
    }

    @Override // X.TmO
    public final void DHb(Bundle bundle, C63152Se0 c63152Se0) {
        C63167SeR.A01(this.A00.A02, new C3AY(c63152Se0, bundle));
    }

    @Override // X.TmO
    public final void DHc(Throwable th) {
        C63167SeR.A01(this.A00.A01, th);
    }

    public C64183T2p(Bundle bundle, Q8V q8v) {
        String A00;
        String str;
        this.A00 = q8v;
        LoggingContext loggingContext = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext != null) {
            A00 = loggingContext.A02;
        } else {
            A00 = AbstractC58319PtB.A0W(bundle).A00();
            A00.getClass();
        }
        LoggingContext loggingContext2 = (LoggingContext) bundle.getParcelable("logging_context");
        if (loggingContext2 != null) {
            str = String.valueOf(loggingContext2.A00);
        } else {
            str = AbstractC58319PtB.A0W(bundle).A02;
        }
        String str2 = C2FP.A08().A01.userId;
        C2FP.A08();
        String A0j = AbstractC31173DnH.A0j(bundle, "THREE_DS_URL");
        String A0j2 = AbstractC31173DnH.A0j(bundle, "NONCE");
        String A11 = AnonymousClass001.A11("{'user_id':'", str2, "','universe':'", "instagram", "'}");
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("nonce=");
        A1C.append(A0j2);
        A1C.append("&return_method=");
        A1C.append("app_url");
        A1C.append("&app_url=");
        A1C.append(Base64.encodeToString("https://www.ecpthreeds.com".getBytes(), 2).replaceAll(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, ""));
        A1C.append("&session_id=");
        A1C.append(A00);
        A1C.append("&payment_type=");
        A1C.append("ecp");
        A1C.append("&context=");
        A1C.append(Base64.encodeToString(A11.getBytes(), 2).replaceAll(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, ""));
        if (!TextUtils.isEmpty(str)) {
            A1C.append("&product_id=");
            A1C.append(str);
        }
        String obj = A1C.toString();
        bundle.putString("WEB_VIEW_URL", TextUtils.isEmpty(obj) ? A0j : AnonymousClass001.A0g(A0j, "?", obj));
        bundle.putStringArray("WEB_VIEW_ALLOWED_INTERCEPT_URLS", new String[]{"https://www.ecpthreeds.com"});
        C63167SeR.A01(q8v.A00, new C3AY("AUTH_THREE_DS", new Bundle(bundle)));
    }
}
