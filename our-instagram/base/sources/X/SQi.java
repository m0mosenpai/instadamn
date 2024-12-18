package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class SQi {
    public static final C09530e4 A00(C63217SfN c63217SfN) {
        String A00 = AbstractC61708RsP.A00(c63217SfN.A01.A03);
        boolean z = false;
        String str = "";
        if (!AbstractC167007dF.A1N(A00.length()) && c63217SfN.A04(A00)) {
            z = true;
            str = AbstractC166987dD.A19(AbstractC25227BEk.A0B(A00).buildUpon().clearQuery().build());
        }
        return AbstractC166987dD.A1L(z, str);
    }

    public static final void A01(Context context, C63217SfN c63217SfN, boolean z) {
        String str;
        long j;
        String str2;
        C14360o3.A0B(c63217SfN, 1);
        C09530e4 A00 = A00(c63217SfN);
        boolean A1a = AbstractC166987dD.A1a(A00.A00);
        Object obj = A00.A01;
        if (A1a) {
            HashMap A1G = AbstractC166987dD.A1G();
            ArrayList A1E = AbstractC166987dD.A1E();
            StringBuilder A1C = AbstractC166987dD.A1C();
            SN1 sn1 = c63217SfN.A04;
            String str3 = sn1.A02;
            String str4 = c63217SfN.A01.A01;
            A1C.append(str3);
            A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A1C.append(str4);
            A1C.append(";");
            if (c63217SfN.A01()) {
                str = sn1.A03;
            } else {
                str = sn1.A04;
            }
            AbstractC58323PtF.A1O("Domain", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str, ";", A1C);
            AbstractC58323PtF.A1O("Path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "/", ";", A1C);
            A1C.append("Secure");
            A1C.append(";");
            A1C.append("HttpOnly");
            A1C.append(";");
            if (z) {
                j = 0;
            } else {
                j = sn1.A00;
            }
            A1C.append("Max-Age");
            A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A1C.append(j);
            String A0x = AbstractC166997dE.A0x(";", A1C);
            C14360o3.A07(A0x);
            A1E.add(A0x);
            C62524SFa c62524SFa = c63217SfN.A03;
            String str5 = c62524SFa.A02;
            if (str5 != null && str5.length() != 0) {
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                AbstractC58323PtF.A1O(sn1.A01, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str5, ";", A1C2);
                if (c63217SfN.A01()) {
                    str2 = sn1.A03;
                } else {
                    str2 = sn1.A04;
                }
                AbstractC58323PtF.A1O("Domain", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str2, ";", A1C2);
                AbstractC58323PtF.A1O("Path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "/", ";", A1C2);
                A1C2.append("Secure");
                A1C2.append(";");
                A1C2.append("HttpOnly");
                A1C2.append(";");
                long j2 = c62524SFa.A00;
                A1C2.append("Expires");
                A1C2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                Date date = new Date(j2 * 1000);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                String format = simpleDateFormat.format(date);
                C14360o3.A07(format);
                String A0u = MSZ.A0u(format, ";", A1C2);
                C14360o3.A07(A0u);
                A1E.add(A0u);
            }
            if (c63217SfN.A02) {
                obj = "https://.shop-external.amazon";
            }
            A1G.put(obj, A1E);
            Pattern pattern = SUV.A01;
            STG.A00(new TQY(context, null, A1G, true));
        }
    }
}
