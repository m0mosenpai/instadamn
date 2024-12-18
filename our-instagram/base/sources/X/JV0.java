package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes8.dex */
public final class JV0 implements InterfaceC449925e, InterfaceC13000lm {
    public final EvictingQueue A00;
    public final UserSession A01;
    public final SimpleDateFormat A02;

    public JV0(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        this.A00 = new EvictingQueue(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
    }

    public static void A00(JV0 jv0, StringBuilder sb) {
        sb.append("]");
        jv0.A00.add(sb.toString());
    }

    public final void A01(C43707JUs c43707JUs, String str, boolean z) {
        String str2;
        InterfaceC16660sJ interfaceC16660sJ;
        if (C18U.A06(C06090Tz.A05, this.A01, 36322705926728106L)) {
            List list = c43707JUs.A06;
            C14360o3.A07(list);
            List A0X = AbstractC001800i.A0X(list);
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                str2 = "start";
            } else {
                str2 = "end";
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("thread_fetch_");
            A1C2.append(str2);
            A1C2.append('_');
            A1C2.append(c43707JUs.A00().longValue());
            A1C2.append('_');
            A1C2.append(currentTimeMillis);
            String[] strArr = {AbstractC166997dE.A0x(" : [", A1C2), AnonymousClass001.A0g("timestamp : ", AbstractC43593JPy.A10(this.A02, currentTimeMillis), " , "), AnonymousClass001.A0g("thread_id : ", c43707JUs.A1E, ", "), AnonymousClass001.A0e("thread_jid : ", ", ", c43707JUs.A00().longValue()), AnonymousClass001.A0g("fetch_reason : ", str, ", "), AnonymousClass001.A1B("server_has_older : ", ", ", c43707JUs.CLR())};
            int i = 0;
            do {
                A1C.append(strArr[i]);
                i++;
            } while (i < 6);
            if (z) {
                interfaceC16660sJ = C50297MJb.A00;
            } else {
                interfaceC16660sJ = C50298MJc.A00;
            }
            A1C.append(AnonymousClass001.A0g("messages : ", AbstractC25226BEj.A1H(", ", A0X, interfaceC16660sJ), ", "));
            A00(this, A1C);
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_instamadillo_reverb_intercept_log";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ArmadilloExpressReverbStatusReportLogCollector";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public final void A02(String str, int i) {
        StringBuilder A0x = AbstractC43594JPz.A0x(str);
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {AnonymousClass001.A0e("message_fetch_", " : [", currentTimeMillis), AnonymousClass001.A0g("timestamp : ", AbstractC43593JPy.A10(this.A02, currentTimeMillis), ", "), AnonymousClass001.A0g("message_otid : ", str, ", "), AnonymousClass001.A0c("error_code : ", ", ", i)};
        int i2 = 0;
        do {
            A0x.append(strArr[i2]);
            i2++;
        } while (i2 < 4);
        A00(this, A0x);
    }

    public final void A03(String str, boolean z, String str2) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        long currentTimeMillis = System.currentTimeMillis();
        String[] strArr = {AnonymousClass001.A0e("missing_messages_info_", " : [", currentTimeMillis), AnonymousClass001.A0g("timestamp : ", AbstractC43593JPy.A10(this.A02, currentTimeMillis), ", "), AnonymousClass001.A0g("thread_id : ", str2, ", "), AnonymousClass001.A1B("is_from_eb : ", ", ", z), AnonymousClass001.A0g("missing_messages : ", str, ", ")};
        int i = 0;
        do {
            A1C.append(strArr[i]);
            i++;
        } while (i < 5);
        A00(this, A1C);
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(AnonymousClass001.A0g("[Message History State] encrypted backup deviceId = ", C6CC.A03.A02(this.A01), " \n"));
        A1C.append("\n");
        EvictingQueue evictingQueue = this.A00;
        C14360o3.A06(evictingQueue);
        Iterator<E> it = evictingQueue.iterator();
        while (it.hasNext()) {
            A1C.append(AnonymousClass001.A0C(AbstractC166987dD.A1B(it), '\n'));
        }
        return A1C.toString();
    }
}
