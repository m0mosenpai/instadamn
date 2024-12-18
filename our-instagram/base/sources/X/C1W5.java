package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.rtc.RtcIgNotification;

/* renamed from: X.1W5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W5 {
    public static final void A01(RtcIgNotification rtcIgNotification) {
        String str = rtcIgNotification.A01;
        if (str != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A07(A03);
            String queryParameter = A03.getQueryParameter(TraceFieldType.StartTime);
            long j = -1;
            if (queryParameter != null) {
                try {
                    j = Long.parseLong(queryParameter);
                } catch (NumberFormatException unused) {
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - j;
            String queryParameter2 = A03.getQueryParameter("vc_id");
            String A00 = AbstractC54162Nwy.A00(A2I.A00(rtcIgNotification.A00));
            StringBuilder sb = new StringBuilder();
            sb.append("\n            Type: ");
            sb.append(A00);
            sb.append("\n            Server sent time: ");
            sb.append(j);
            sb.append("\n            Client received time: ");
            sb.append(currentTimeMillis);
            sb.append("\n            Delay: ");
            sb.append(j2);
            sb.append("\n            VideoCallID: ");
            sb.append(queryParameter2);
            sb.append("\n          ");
            String A0p = AbstractC16490ru.A0p(sb.toString());
            if (j != -1 && j2 >= C1W4.A01) {
                C0w9.A03("RtcCallNotificationsLoggerImpl", AnonymousClass001.A0R("Delay in receiving push notification. ", A0p));
            }
        }
    }

    public static final void A00(C19280xC c19280xC, String str) {
        c19280xC.A0C("recipient_id", str);
        AbstractC11060iN.A00(AbstractC12960li.A00).EHW(c19280xC);
    }
}
