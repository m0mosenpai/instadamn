package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: X.SQh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62768SQh {
    public static final Pair A00(C62965SZi c62965SZi) {
        String A00 = AbstractC61705RsM.A00(c62965SZi.A01.A06);
        boolean z = false;
        String str = "";
        if (!AbstractC167007dF.A1N(A00.length())) {
            z = true;
            str = AbstractC58319PtB.A0q(AbstractC25227BEk.A0B(A00).buildUpon().clearQuery());
        }
        return new Pair(z, str);
    }

    public static final void A01(Context context, C62965SZi c62965SZi) {
        String str;
        String str2;
        C14360o3.A0B(c62965SZi, 1);
        Pair A00 = A00(c62965SZi);
        if (AbstractC166987dD.A1a(A00.first)) {
            HashMap A1G = AbstractC166987dD.A1G();
            ArrayList A1E = AbstractC166987dD.A1E();
            InterfaceC65583TnM interfaceC65583TnM = c62965SZi.A00;
            String AcB = interfaceC65583TnM.AcB();
            if (AcB.length() > 0) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                String str3 = c62965SZi.A01.A04;
                A1C.append(AcB);
                A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                A1C.append(str3);
                A1C.append(";");
                AbstractC58323PtF.A1O("Domain", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, interfaceC65583TnM.Arh(), ";", A1C);
                AbstractC58323PtF.A1O("Path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "/", ";", A1C);
                A1C.append("Secure");
                A1C.append(";");
                A1C.append("HttpOnly");
                A1C.append(";");
                long AcC = interfaceC65583TnM.AcC();
                A1C.append("Max-Age");
                A1C.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                A1C.append(AcC);
                str = AbstractC166997dE.A0x(";", A1C);
                C14360o3.A07(str);
            } else {
                str = "";
            }
            if (str.length() > 0) {
                A1E.add(str);
            }
            String AXt = interfaceC65583TnM.AXt();
            boolean z = false;
            boolean A1O = AbstractC167007dF.A1O(AXt.length());
            String str4 = c62965SZi.A02.A02;
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (A1O & (!z)) {
                StringBuilder A11 = AbstractC166997dE.A11(AXt);
                A11.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                A11.append(str4);
                A11.append(";");
                AbstractC58323PtF.A1O("Domain", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, interfaceC65583TnM.Arh(), ";", A11);
                AbstractC58323PtF.A1O("Path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, "/", ";", A11);
                A11.append("Secure");
                A11.append(";");
                str2 = MSZ.A0u("HttpOnly", ";", A11);
                C14360o3.A07(str2);
            } else {
                str2 = "";
            }
            if (str2.length() > 0) {
                A1E.add(str2);
            }
            A1G.put(A00.second, A1E);
            AbstractC63254SgB.A03("For url %s, setting bwi cookies- %s", new Object[]{A00.second, A1G.toString()});
            Pattern pattern = SUV.A01;
            STG.A00(new TQY(context, null, A1G, true));
        }
    }
}
