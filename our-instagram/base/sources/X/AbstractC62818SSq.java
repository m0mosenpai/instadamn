package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.LinkedHashMap;

/* renamed from: X.SSq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62818SSq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005d. Please report as an issue. */
    public static Fragment A00(Bundle bundle) {
        String A02;
        String string = bundle.getString("page");
        if (bundle.getParcelable("logger_data") == null) {
            C62697SMl c62697SMl = new C62697SMl();
            String A00 = AbstractC37314GcG.A00();
            if (bundle.getString(A00) != null) {
                A02 = bundle.getString(A00);
            } else {
                A02 = AbstractC58442PvL.A02();
            }
            c62697SMl.A00(A02);
            c62697SMl.A01 = "fbpay_hub";
            bundle.putParcelable("logger_data", new FBPayLoggerData(c62697SMl));
        }
        LinkedHashMap A08 = AbstractC58442PvL.A08(AbstractC58319PtB.A0W(bundle));
        A08.put("referrer", bundle.getString("referrer"));
        C63307ShD.A02("view_name", "fbpay_hub", A08).Chz("client_load_fbpayhub_init", A08);
        if (string != null) {
            switch (string.hashCode()) {
                case -1847017863:
                    if (string.equals("payment_methods")) {
                        return C2FP.A0E().A03(bundle, "payment_methods");
                    }
                    break;
                case -105689780:
                    if (string.equals("welcome_page")) {
                        bundle.putBoolean("show_branding_page", true);
                        break;
                    }
                    break;
                case 3198785:
                    if (string.equals("help")) {
                        bundle.putInt("title_res", 2131962343);
                        bundle.putString("web_fragment_load_url", "https://help.instagram.com/357872324807367");
                        return C2FP.A0E().A03(bundle, "web_view");
                    }
                    break;
                case 949122880:
                    if (string.equals("security")) {
                        return C2FP.A03().A04.A00(bundle, "PIN_BIO_SETTINGS");
                    }
                    break;
                case 1082290744:
                    if (string.equals("receipt")) {
                        return C2FP.A0E().A03(bundle, "receipt");
                    }
                    break;
                case 1434631203:
                    if (string.equals("settings")) {
                        C2FP.A0D();
                        break;
                    }
                    break;
            }
        }
        return C2FP.A0E().A03(bundle, "home");
    }

    public static C33234ElT A01(String str, String str2, String str3) {
        C33234ElT c33234ElT = new C33234ElT();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("page_title", str3);
        A0b.putString(TraceFieldType.ContentType, str2);
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        c33234ElT.setArguments(A0b);
        return c33234ElT;
    }
}
