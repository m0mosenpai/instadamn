package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: X.3E0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E0 implements InterfaceC70403Dy {
    public final UserFlowLogger A00;
    public final UserSession A01;

    public C3E0(UserSession userSession) {
        UserFlowLogger A00;
        this.A01 = userSession;
        if (C18U.A06(C06090Tz.A05, userSession, 36330080384991918L)) {
            A00 = new UserFlowLoggerImpl(C006802i.A0p, true);
        } else {
            A00 = C1QS.A00(userSession);
        }
        this.A00 = A00;
    }

    public static final long A00(C47Z c47z, C3E0 c3e0) {
        return c3e0.A00.generateFlowId(51052545, AnonymousClass001.A0G(c47z.A3t, ':', c47z.A1T.A00()).hashCode());
    }

    public static final JSONObject A01(C47Z c47z, C3E0 c3e0) {
        String str;
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.put("sessionId", C70343Ds.A01(c47z));
        c06860Yd.put("uploadId", c47z.A3t);
        c06860Yd.put("targetStatus", c47z.A6J.name());
        c06860Yd.put("serverStatus", c47z.A1f.name());
        c06860Yd.put("mediaType", c47z.A1G.name());
        c06860Yd.put("shareType", c47z.A0D().name());
        c06860Yd.put("cameraEntryPoint", String.valueOf(c47z.A0i));
        SimpleDateFormat simpleDateFormat = Ma5.A00;
        String format = simpleDateFormat.format(new Date(c47z.A0g));
        C14360o3.A07(format);
        c06860Yd.put("timeCreated", format);
        String format2 = simpleDateFormat.format(new Date(c47z.A0c));
        C14360o3.A07(format2);
        c06860Yd.put("postRequestTime", format2);
        String format3 = simpleDateFormat.format(new Date(c47z.A04()));
        C14360o3.A07(format3);
        c06860Yd.put("lastUploadAttemptTime", format3);
        String format4 = simpleDateFormat.format(new Date(c47z.A05()));
        C14360o3.A07(format4);
        c06860Yd.put("nextAutoRetryTime", format4);
        String format5 = simpleDateFormat.format(new Date());
        C14360o3.A07(format5);
        c06860Yd.put("currentTime", format5);
        c06860Yd.put("inProgress", String.valueOf(c47z.A0m()));
        c06860Yd.put("totalUploadAutoRetryCount", String.valueOf(c47z.A0D + c47z.A0E));
        c06860Yd.put("manualRetryAllowed", String.valueOf(c47z.A0y()));
        C115435Kd c115435Kd = c47z.A6I;
        if (c115435Kd != null) {
            str = c115435Kd.A02;
        } else {
            str = null;
        }
        c06860Yd.put("errorMessage", String.valueOf(str));
        c06860Yd.put("shouldUploadOverFb", String.valueOf(c47z.A6C));
        c06860Yd.put("isAlbum", String.valueOf(c47z.A0t()));
        c06860Yd.put("isDraftMedia", String.valueOf(c47z.A5S));
        String A09 = C50702MZx.A00.A09(c3e0.A01, c47z);
        if (A09 != null) {
            c06860Yd.put("serverEdits", A09);
        }
        return new JSONObject(AbstractC16850sd.A0N(c06860Yd));
    }

    public final void A02(C47Z c47z, String str, String str2) {
        if (!c47z.A5D && AbstractC210079Qv.A03(c47z) && str2 != null) {
            this.A00.flowAnnotate(A00(c47z, this), str, str2);
        }
    }

    @Override // X.InterfaceC70403Dy
    public final void ABa(C47Z c47z, int i) {
        if (!c47z.A5D && AbstractC210079Qv.A03(c47z)) {
            this.A00.flowAnnotate(A00(c47z, this), "media_upload_session_index", i);
        }
    }

    @Override // X.InterfaceC70403Dy
    public final void ABb(C47Z c47z, int i) {
        if (!c47z.A5D && AbstractC210079Qv.A03(c47z)) {
            this.A00.flowAnnotate(A00(c47z, this), "pending_media_tasks_count", i);
        }
    }

    @Override // X.InterfaceC70403Dy
    public final void CkY(C70129W5q c70129W5q, C47Z c47z) {
        if (!c47z.A5D && AbstractC210079Qv.A03(c47z)) {
            long A00 = A00(c47z, this);
            A02(c47z, AbstractC111324zv.A00(2231), c70129W5q.A0H);
            A02(c47z, MSV.A00(201), c70129W5q.A0I);
            A02(c47z, "encoder_profile_name", c70129W5q.A0K);
            UserFlowLogger userFlowLogger = this.A00;
            userFlowLogger.flowAnnotate(A00, "init_complete", c70129W5q.A0U);
            userFlowLogger.flowAnnotate(A00, "bytes_int_transcode_file", c70129W5q.A02);
            userFlowLogger.flowAnnotate(A00, "encoder_completed", c70129W5q.A0T);
            userFlowLogger.flowAnnotate(A00, "used_media_composition", c70129W5q.A0V);
        }
    }

    @Override // X.InterfaceC70403Dy
    public final void Cl0(C47Z c47z, String str, String str2) {
        if (!c47z.A5D && AbstractC210079Qv.A03(c47z)) {
            this.A00.flowMarkPoint(A00(c47z, this), str, str2);
        }
    }

    @Override // X.InterfaceC70403Dy
    public final void Cl1(C47Z c47z, String str, String str2) {
        if (!c47z.A5D) {
            UserFlowLogger userFlowLogger = this.A00;
            if (userFlowLogger.isOngoingFlow(A00(c47z, this))) {
                long A00 = A00(c47z, this);
                StringBuilder sb = new StringBuilder();
                sb.append("debugInfo: ");
                sb.append(str2);
                sb.append(", media: ");
                sb.append(A01(c47z, this));
                userFlowLogger.flowEndFail(A00, "ig_media_upload_failure", sb.toString());
            }
        }
    }
}
