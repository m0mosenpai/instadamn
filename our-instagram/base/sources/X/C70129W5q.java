package X;

import android.media.MediaFormat;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.W5q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70129W5q {
    public C70471WYc A0F;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0Y;
    public boolean A0S = false;
    public boolean A0U = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0W = false;
    public long A03 = -1;
    public long A06 = -1;
    public long A0C = -1;
    public long A09 = -1;
    public long A08 = -1;
    public long A07 = -1;
    public long A05 = -1;
    public long A0B = -1;
    public boolean A0T = false;
    public long A02 = -1;
    public String A0J = null;
    public String A0I = null;
    public String A0H = null;
    public String A0G = null;
    public String A0K = null;
    public int A00 = 0;
    public boolean A0X = false;
    public long A0D = 0;
    public boolean A0V = false;
    public long A04 = -1;
    public long A0A = 0;
    public MediaFormat A0E = null;
    public long A01 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C70129W5q c70129W5q = (C70129W5q) obj;
            if (this.A0S != c70129W5q.A0S || this.A0U != c70129W5q.A0U || this.A0O != c70129W5q.A0O || this.A0P != c70129W5q.A0P || this.A0Q != c70129W5q.A0Q || this.A0R != c70129W5q.A0R || this.A0V != c70129W5q.A0V || this.A0W != c70129W5q.A0W || this.A03 != c70129W5q.A03 || this.A06 != c70129W5q.A06 || this.A0C != c70129W5q.A0C || this.A09 != c70129W5q.A09 || this.A08 != c70129W5q.A08 || this.A07 != c70129W5q.A07 || this.A0B != c70129W5q.A0B || this.A0T != c70129W5q.A0T || this.A02 != c70129W5q.A02 || this.A00 != c70129W5q.A00 || this.A0X != c70129W5q.A0X || this.A0D != c70129W5q.A0D || this.A0Y != c70129W5q.A0Y || !A00(this.A0J, c70129W5q.A0J) || !A00(this.A0I, c70129W5q.A0I) || !A00(this.A0H, c70129W5q.A0H) || !A00(this.A0G, c70129W5q.A0G) || !A00(this.A0K, c70129W5q.A0K) || !A00(this.A0L, c70129W5q.A0L) || !A00(this.A0N, c70129W5q.A0N) || !A00(this.A0M, c70129W5q.A0M) || this.A04 != c70129W5q.A04 || this.A0A != c70129W5q.A0A || !A00(this.A0E, c70129W5q.A0E) || this.A01 != c70129W5q.A01) {
                return false;
            }
        }
        return true;
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
        } else if (obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[40];
        boolean A1b = AbstractC31175DnJ.A1b(new Object[]{Boolean.valueOf(this.A0S), Boolean.valueOf(this.A0U), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0Q), Boolean.valueOf(this.A0R), AbstractC166997dE.A0a(), Boolean.valueOf(this.A0V), Boolean.valueOf(this.A0W), -1L, -1L, -1L, -1L, -1L, -1L, Long.valueOf(this.A03), Long.valueOf(this.A06), Long.valueOf(this.A0C), Long.valueOf(this.A09), Long.valueOf(this.A08), Long.valueOf(this.A07), Long.valueOf(this.A0B), Boolean.valueOf(this.A0T), Long.valueOf(this.A02), this.A0J, this.A0I, this.A0H}, objArr);
        String str = this.A0G;
        String str2 = this.A0K;
        Integer valueOf = Integer.valueOf(this.A00);
        Boolean valueOf2 = Boolean.valueOf(this.A0X);
        Long valueOf3 = Long.valueOf(this.A0D);
        String str3 = this.A0L;
        String str4 = this.A0N;
        String str5 = this.A0M;
        Boolean valueOf4 = Boolean.valueOf(this.A0Y);
        Long valueOf5 = Long.valueOf(this.A04);
        Long valueOf6 = Long.valueOf(this.A0A);
        Object obj = this.A0E;
        if (obj == null) {
            obj = "noOutputFormat";
        }
        System.arraycopy(new Object[]{str, str2, valueOf, valueOf2, valueOf3, str3, str4, str5, valueOf4, valueOf5, valueOf6, obj, Long.valueOf(this.A01)}, A1b ? 1 : 0, objArr, 27, 13);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAudioTrackPresent", this.A0S);
            jSONObject.put("isInitComplete", this.A0U);
            jSONObject.put("codecMuxerAudioTrackIndexIsSet", this.A0O);
            jSONObject.put("codecMuxerVideoTrackIndexIsSet", this.A0P);
            jSONObject.put("gotAudioDataBuffer", this.A0Q);
            jSONObject.put("gotVideoDataBuffer", this.A0R);
            jSONObject.put("isAudioVideoTrackReset", false);
            jSONObject.put("startTimeUs", -1L);
            jSONObject.put("endTimeUs", -1L);
            jSONObject.put("adjustedEndTimeUs", -1L);
            jSONObject.put("syncStartTimeUs", -1L);
            jSONObject.put("firstVideoSampleTimeUs", -1L);
            jSONObject.put("lastVideoSampleTimeUs", -1L);
            jSONObject.put("firstAudioSampleTimeUs", this.A03);
            jSONObject.put("lastAudioSampleTimeUs", this.A06);
            jSONObject.put("numVideoSamplesMuxed", this.A0C);
            jSONObject.put("numAudioSamplesMuxed", this.A09);
            jSONObject.put("numAudioSamplesErrored", this.A08);
            jSONObject.put("lastVideoSampleMuxedUs", this.A07);
            jSONObject.put("lastAudioSampleMuxedUs", this.A05);
            jSONObject.put("numVideoSamplesErrored", this.A0B);
            jSONObject.put("isEncoderCompleted", this.A0T);
            jSONObject.put("bytesInTranscodeFile", this.A02);
            jSONObject.putOpt("muxerName", this.A0J);
            jSONObject.putOpt("encoderName", this.A0I);
            jSONObject.putOpt("decoderName", this.A0H);
            jSONObject.putOpt("profileName", this.A0K);
            jSONObject.put("targetBitRate", this.A00);
            jSONObject.put("isNonIncrementalTimestamp", this.A0X);
            jSONObject.put("timestampDifference", this.A0D);
            jSONObject.putOpt("videoTranscodeInnerException", this.A0L);
            jSONObject.putOpt("videoTranscodeInnerExceptionCause", this.A0N);
            jSONObject.putOpt("videoTranscodeInnerExceptionCallStack", this.A0M);
            jSONObject.put("isPassThroughTranscoderUsed", this.A0Y);
            jSONObject.put("isMediaCompositionInput", this.A0V);
            jSONObject.put("framePtsUs", this.A04);
            jSONObject.put("numOfRetriesToSucceedEncoder", this.A0A);
            jSONObject.put("audioTranscodeDurationNs", this.A01);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
