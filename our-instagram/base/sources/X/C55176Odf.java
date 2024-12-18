package X;

import android.media.MediaFormat;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.io.File;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.Odf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55176Odf {
    public WDI A00;
    public String A01;
    public boolean A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final C54837OLw A0K;
    public final C70129W5q A0L;
    public final EnumC1125356h A0M;
    public final File A0N;
    public final boolean A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C55176Odf c55176Odf = (C55176Odf) obj;
            if (this.A0F == c55176Odf.A0F && this.A0G == c55176Odf.A0G && this.A07 == c55176Odf.A07 && this.A06 == c55176Odf.A06 && this.A0H == c55176Odf.A0H && this.A05 == c55176Odf.A05 && this.A0D == c55176Odf.A0D && this.A0B == c55176Odf.A0B && this.A0I == c55176Odf.A0I && this.A0A == c55176Odf.A0A && this.A0C == c55176Odf.A0C && this.A0J == c55176Odf.A0J && Double.compare(c55176Odf.A03, this.A03) == 0 && this.A0O == c55176Odf.A0O && this.A0M.A00 == c55176Odf.A0M.A00 && this.A0N.equals(c55176Odf.A0N) && this.A0L.equals(c55176Odf.A0L)) {
                C54837OLw c54837OLw = this.A0K;
                C54837OLw c54837OLw2 = c55176Odf.A0K;
                if (c54837OLw == null) {
                    if (c54837OLw2 != null) {
                        return false;
                    }
                } else if (c54837OLw2 == null || !c54837OLw.equals(c54837OLw2)) {
                    return false;
                }
                if (this.A0E == c55176Odf.A0E) {
                    String str = this.A01;
                    String str2 = c55176Odf.A01;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str2 == null || !str.equals(str2)) {
                        return false;
                    }
                    if (this.A02 != c55176Odf.A02 || this.A09 != c55176Odf.A09 || this.A08 != c55176Odf.A08) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void A02(UserFlowLoggerImpl userFlowLoggerImpl, C55176Odf c55176Odf, int i, long j) {
        userFlowLoggerImpl.flowAnnotate(j, "input_frame_rate", i);
        userFlowLoggerImpl.flowAnnotate(j, "input_file_size", c55176Odf.A0F);
        float f = ((float) c55176Odf.A0J) / 1000000.0f;
        long j2 = c55176Odf.A0G;
        userFlowLoggerImpl.flowAnnotate(j, "duration_sec", f);
        userFlowLoggerImpl.flowAnnotate(j, "output_bitrate", (int) (((float) (j2 * 8)) / f));
        userFlowLoggerImpl.flowAnnotate(j, "output_file_size", j2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0N, Long.valueOf(this.A0F), Long.valueOf(this.A0G), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Long.valueOf(this.A0H), Integer.valueOf(this.A05), Integer.valueOf(this.A0D), Integer.valueOf(this.A0B), Long.valueOf(this.A0I), Integer.valueOf(this.A0A), Integer.valueOf(this.A0C), Long.valueOf(this.A0J), Double.valueOf(this.A03), Boolean.valueOf(this.A0O), Integer.valueOf(this.A0M.A00), this.A0L, this.A0K, Long.valueOf(this.A0E), this.A01, Boolean.valueOf(this.A02), Integer.valueOf(this.A08), Integer.valueOf(this.A09)});
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.OLw] */
    public C55176Odf(JSONObject jSONObject) {
        C54837OLw c54837OLw;
        String str;
        this.A0N = AbstractC166987dD.A11(jSONObject.getString("outputFilePath"));
        this.A0F = A01("originalFileSize", jSONObject);
        this.A0G = A01("outputFileSize", jSONObject);
        this.A07 = A00("sourceWidth", jSONObject);
        this.A06 = A00("sourceHeight", jSONObject);
        this.A0H = A01("sourceBitRate", jSONObject);
        this.A05 = A00("sourceFrameRate", jSONObject);
        this.A0D = A00("targetWidth", jSONObject);
        this.A0B = A00("targetHeight", jSONObject);
        this.A0I = A01("targetBitRate", jSONObject);
        this.A0A = A00("targetFrameRate", jSONObject);
        this.A0C = A00("targetRotationDegreesClockwise", jSONObject);
        this.A0J = A01("videoTime", jSONObject);
        this.A03 = Double.parseDouble(jSONObject.getString("frameDropPercent"));
        this.A0O = Boolean.parseBoolean(jSONObject.getString("mIsLastSegment"));
        this.A0M = EnumC1125356h.A00(A00("mTrackType", jSONObject));
        this.A0L = new C70129W5q();
        if (jSONObject.has("mediaDemuxerStats")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mediaDemuxerStats");
            ?? obj = new Object();
            obj.A03 = -1L;
            obj.A00 = -1L;
            obj.A02 = -1L;
            obj.A01 = -1L;
            obj.A05 = "";
            obj.A04 = "";
            obj.A03 = A01("start_read_time_us", jSONObject2);
            obj.A00 = A01("end_read_time_us", jSONObject2);
            obj.A02 = A01("frame_before_start_read_time_us", jSONObject2);
            obj.A01 = A01("frame_after_end_read_time_us", jSONObject2);
            obj.A05 = jSONObject2.getString("track_info_map");
            obj.A04 = jSONObject2.getString("exceptions");
            c54837OLw = obj;
        } else {
            c54837OLw = null;
        }
        this.A0K = c54837OLw;
        this.A04 = A00("outputIndex", jSONObject);
        this.A0E = A01("framePts", jSONObject);
        this.A08 = A00("targetColorSpace", jSONObject);
        this.A09 = A00("targetColorTransfer", jSONObject);
        if (jSONObject.has("targetCodec")) {
            str = jSONObject.getString("targetCodec");
        } else {
            str = "";
        }
        this.A01 = str;
        this.A02 = Boolean.parseBoolean(jSONObject.getString("useHLGHdrTranscode"));
    }

    public static int A00(String str, JSONObject jSONObject) {
        return Integer.parseInt(jSONObject.getString(str));
    }

    public static long A01(String str, JSONObject jSONObject) {
        return Long.parseLong(jSONObject.getString(str));
    }

    public final JSONObject A03() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("outputFilePath", this.A0N.getPath());
        A0q.put("originalFileSize", this.A0F);
        A0q.put("outputFileSize", this.A0G);
        A0q.put("sourceWidth", this.A07);
        A0q.put("sourceHeight", this.A06);
        A0q.put("sourceBitRate", this.A0H);
        A0q.put("sourceFrameRate", this.A05);
        A0q.put("targetWidth", this.A0D);
        A0q.put("targetHeight", this.A0B);
        A0q.put("targetBitRate", this.A0I);
        A0q.put("targetFrameRate", this.A0A);
        A0q.put("targetRotationDegreesClockwise", this.A0C);
        A0q.put("videoTime", this.A0J);
        A0q.put("frameDropPercent", this.A03);
        A0q.put("mIsLastSegment", this.A0O);
        A0q.put("mTrackType", this.A0M.A00);
        C54837OLw c54837OLw = this.A0K;
        if (c54837OLw != null) {
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.put("start_read_time_us", c54837OLw.A03);
            A0q2.put("end_read_time_us", c54837OLw.A00);
            A0q2.put("frame_before_start_read_time_us", c54837OLw.A02);
            A0q2.put("frame_after_end_read_time_us", c54837OLw.A01);
            A0q2.put("track_info_map", c54837OLw.A05);
            A0q2.put("exceptions", c54837OLw.A04);
            A0q.put("mediaDemuxerStats", A0q2);
        }
        A0q.put("outputIndex", this.A04);
        A0q.put("framePts", this.A0E);
        A0q.put("targetColorSpace", this.A08);
        A0q.put("targetColorTransfer", this.A09);
        A0q.put("targetCodec", this.A01);
        A0q.put("useHLGHdrTranscode", this.A02);
        return A0q;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoResizeResult{outputFile=");
        A1C.append(this.A0N);
        A1C.append(", originalFileSize=");
        A1C.append(this.A0F);
        A1C.append(", outputFileSize=");
        A1C.append(this.A0G);
        A1C.append(", sourceWidth=");
        A1C.append(this.A07);
        A1C.append(", sourceHeight=");
        A1C.append(this.A06);
        A1C.append(", sourceBitRate=");
        A1C.append(this.A0H);
        A1C.append(", sourceFrameRate=");
        A1C.append(this.A05);
        A1C.append(", targetWidth=");
        A1C.append(this.A0D);
        A1C.append(", targetHeight=");
        A1C.append(this.A0B);
        A1C.append(", targetRotationDegreesClockwise=");
        A1C.append(this.A0C);
        A1C.append(", targetBitRate=");
        A1C.append(this.A0I);
        A1C.append(", targetFrameRate=");
        A1C.append(this.A0A);
        A1C.append(", videoTime=");
        A1C.append(this.A0J);
        A1C.append(", frameDropPercent=");
        A1C.append(this.A03);
        A1C.append(", mediaResizeStatus=");
        A1C.append(this.A0L);
        A1C.append(", mIsLastSegment=");
        A1C.append(this.A0O);
        A1C.append(", mTrackType=");
        A1C.append(this.A0M);
        A1C.append(", mediaDemuxerStats=");
        A1C.append(this.A0K);
        A1C.append(", mOutputIndex=");
        A1C.append(this.A04);
        A1C.append(", framePts=");
        A1C.append(this.A0E);
        A1C.append(", targetCodec=");
        A1C.append(this.A01);
        A1C.append(", useHLGHdrTranscode=");
        A1C.append(this.A02);
        A1C.append(", targetColorTransfer=");
        A1C.append(this.A09);
        A1C.append(", targetColorSpace=");
        A1C.append(this.A08);
        return AbstractC167027dH.A0R(A1C);
    }

    public C55176Odf(MediaFormat mediaFormat, C54837OLw c54837OLw, C70129W5q c70129W5q, WDI wdi, EnumC1125356h enumC1125356h, File file, int i, int i2, long j, long j2, long j3, long j4, boolean z) {
        int i3;
        this.A0N = file;
        this.A0F = j;
        this.A0G = j2;
        this.A07 = i;
        this.A06 = i2;
        this.A0H = j3;
        this.A05 = -1;
        this.A0J = j4;
        this.A03 = 0.0d;
        this.A0O = z;
        this.A0M = enumC1125356h;
        this.A04 = 0;
        this.A0E = -1L;
        if (c70129W5q.A0Y) {
            this.A0D = i;
            this.A0B = i2;
            this.A0I = j3;
        } else if (wdi == null) {
            this.A0D = -1;
            this.A0B = -1;
            this.A0I = -1L;
        } else {
            this.A0D = wdi.A0C;
            this.A0B = wdi.A0A;
            this.A0I = wdi.A01();
            this.A0A = wdi.A02;
            this.A0C = wdi.A0B;
            C70124W5f c70124W5f = wdi.A0G;
            if (c70124W5f != null) {
                this.A01 = c70124W5f.A04.name();
                this.A02 = c70124W5f.A01;
            }
            this.A0L = c70129W5q;
            this.A0K = c54837OLw;
            if (mediaFormat == null && mediaFormat.containsKey("color-standard")) {
                this.A08 = mediaFormat.getInteger("color-standard");
                i3 = mediaFormat.getInteger("color-transfer");
            } else {
                i3 = 0;
                this.A08 = 0;
            }
            this.A09 = i3;
            this.A00 = wdi;
        }
        this.A0A = -1;
        this.A0C = -1;
        this.A0L = c70129W5q;
        this.A0K = c54837OLw;
        if (mediaFormat == null) {
        }
        i3 = 0;
        this.A08 = 0;
        this.A09 = i3;
        this.A00 = wdi;
    }
}
