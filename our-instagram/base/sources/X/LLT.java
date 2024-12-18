package X;

import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public abstract class LLT {
    public static final android.net.Uri A00(C45040JwV c45040JwV, CommonMediaTransport commonMediaTransport, List list) {
        String str;
        String str2;
        long j;
        Integer num;
        String str3;
        String str4;
        Long A0j;
        C14360o3.A0B(commonMediaTransport, 0);
        String str5 = commonMediaTransport.directPath_;
        C14360o3.A07(str5);
        String str6 = commonMediaTransport.fileSha256_;
        C14360o3.A07(str6);
        String str7 = commonMediaTransport.fileEncSha256_;
        C14360o3.A07(str7);
        String str8 = commonMediaTransport.mediaKey_;
        C14360o3.A07(str8);
        long A05 = AbstractC43592JPx.A05(commonMediaTransport.mediaKeyTimestamp_);
        int i = commonMediaTransport.bitField0_;
        if ((i & 256) != 0) {
            str = commonMediaTransport.mimetype_;
        } else {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = commonMediaTransport.objectId_;
        } else {
            str2 = null;
        }
        if ((i & 1) != 0 && (str4 = commonMediaTransport.mediaId_) != null && (A0j = AbstractC166997dE.A0j(str4)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        int i2 = commonMediaTransport.bitField0_;
        if ((i2 & 128) != 0) {
            num = Integer.valueOf(commonMediaTransport.fileLength_);
        } else {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str3 = commonMediaTransport.sidecar_;
        } else {
            str3 = null;
        }
        return A02(c45040JwV, num, str5, str6, str7, str8, str, str2, str3, list, A05, j);
    }

    public static final CommonMediaTransport A03(String str) {
        Integer A0i;
        C14360o3.A0B(str, 0);
        if (!AbstractC43592JPx.A1a("msys://ae-media", 1, str)) {
            return null;
        }
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        List<String> pathSegments = A0B.getPathSegments();
        if (pathSegments.size() != 1) {
            C0K8.A0C("ArmadilloExpressMediaUtil", "Invalid uri path without directPath");
            return null;
        }
        String decode = android.net.Uri.decode(AbstractC25226BEj.A1I(pathSegments, 0));
        String queryParameter = A0B.getQueryParameter("sha256");
        if (queryParameter != null) {
            String queryParameter2 = A0B.getQueryParameter("encsha256");
            if (queryParameter2 != null) {
                String queryParameter3 = A0B.getQueryParameter("mediakey");
                if (queryParameter3 != null) {
                    String queryParameter4 = A0B.getQueryParameter("mediakey_timestamp");
                    if (queryParameter4 != null) {
                        String queryParameter5 = A0B.getQueryParameter("mimetype");
                        if (queryParameter5 != null) {
                            String queryParameter6 = A0B.getQueryParameter("object_id");
                            String queryParameter7 = A0B.getQueryParameter("media_id");
                            String queryParameter8 = A0B.getQueryParameter("file_length");
                            String queryParameter9 = A0B.getQueryParameter("sidecar");
                            C45377K6k c45377K6k = (C45377K6k) CommonMediaTransport.DEFAULT_INSTANCE.A0I();
                            CommonMediaTransport A0P = JQ0.A0P(c45377K6k);
                            decode.getClass();
                            A0P.bitField0_ |= 16;
                            A0P.directPath_ = decode;
                            CommonMediaTransport A0P2 = JQ0.A0P(c45377K6k);
                            A0P2.bitField0_ |= 2;
                            A0P2.fileSha256_ = queryParameter;
                            CommonMediaTransport A0P3 = JQ0.A0P(c45377K6k);
                            A0P3.bitField0_ |= 8;
                            A0P3.fileEncSha256_ = queryParameter2;
                            CommonMediaTransport A0P4 = JQ0.A0P(c45377K6k);
                            A0P4.bitField0_ |= 4;
                            A0P4.mediaKey_ = queryParameter3;
                            CommonMediaTransport A0P5 = JQ0.A0P(c45377K6k);
                            A0P5.bitField0_ |= 32;
                            A0P5.mediaKeyTimestamp_ = queryParameter4;
                            c45377K6k.A06(queryParameter5);
                            if (queryParameter6 != null) {
                                CommonMediaTransport A0P6 = JQ0.A0P(c45377K6k);
                                A0P6.bitField0_ |= 512;
                                A0P6.objectId_ = queryParameter6;
                            }
                            if (queryParameter7 != null) {
                                CommonMediaTransport A0P7 = JQ0.A0P(c45377K6k);
                                A0P7.bitField0_ |= 1;
                                A0P7.mediaId_ = queryParameter7;
                            }
                            if (queryParameter8 != null && (A0i = AbstractC003100w.A0i(queryParameter8)) != null) {
                                int intValue = A0i.intValue();
                                CommonMediaTransport A0P8 = JQ0.A0P(c45377K6k);
                                A0P8.bitField0_ |= 128;
                                A0P8.fileLength_ = intValue;
                            }
                            if (queryParameter9 != null) {
                                CommonMediaTransport A0P9 = JQ0.A0P(c45377K6k);
                                A0P9.bitField0_ |= 64;
                                A0P9.sidecar_ = queryParameter9;
                            }
                            return (CommonMediaTransport) c45377K6k.A02();
                        }
                        throw AbstractC166987dD.A12("Required value was null.");
                    }
                    throw AbstractC166987dD.A12("Required value was null.");
                }
                throw AbstractC166987dD.A12("Required value was null.");
            }
            throw AbstractC166987dD.A12("Required value was null.");
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }

    public static final String A06(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC25227BEk.A0B(str).getQueryParameter("media_id");
    }

    public static final String A07(String str) {
        String queryParameter;
        C14360o3.A0B(str, 0);
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        Uri.Builder buildUpon = A0B.buildUpon();
        if (A0B.getQueryParameterNames().contains("force_eb_restore")) {
            buildUpon.clearQuery();
            java.util.Set<String> queryParameterNames = A0B.getQueryParameterNames();
            C14360o3.A07(queryParameterNames);
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (C14360o3.A0K(A1B, "force_eb_restore")) {
                    queryParameter = "true";
                } else {
                    queryParameter = A0B.getQueryParameter(A1B);
                }
                buildUpon.appendQueryParameter(A1B, queryParameter);
            }
        } else {
            buildUpon.appendQueryParameter("force_eb_restore", "true");
        }
        return AbstractC166987dD.A19(buildUpon);
    }

    public static final List A08(String str) {
        List A0m;
        C14360o3.A0B(str, 0);
        String queryParameter = AbstractC25227BEk.A0B(str).getQueryParameter("scan_lengths");
        ArrayList arrayList = null;
        if (queryParameter != null && (A0m = AbstractC167007dF.A0m(queryParameter, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
            arrayList = AbstractC167017dG.A0q(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC166997dE.A1W(arrayList, Integer.parseInt(AbstractC166987dD.A1B(it)));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        }
        return arrayList;
    }

    public static final boolean A09(String str) {
        if (str != null) {
            return AbstractC43592JPx.A1a("msys://ae-media", 1, str);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r3 != 6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri A01(X.C45040JwV r5, com.instagram.direct.armadilloexpress.transportpayload.Media r6) {
        /*
            int r1 = r6.mediaCase_
            boolean r0 = X.AbstractC43593JPy.A1Y(r1)
            r2 = 0
            if (r0 == 0) goto L60
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L60
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r0.mediaTransport_
        L19:
            if (r1 != 0) goto L1f
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
            if (r1 == 0) goto L50
        L1f:
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L46
            X.K6k r4 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r1)
            X.C14360o3.A07(r4)
            int r3 = r6.mediaCase_
            boolean r0 = X.AbstractC43593JPy.A1Y(r3)
            java.lang.String r2 = "image/gif"
            java.lang.String r1 = "image/jpg"
            if (r0 != 0) goto L5e
            r0 = 3
            if (r3 != r0) goto L51
            java.lang.String r2 = "video"
        L3d:
            r4.A06(r2)
            X.RYn r1 = X.AbstractC43592JPx.A0L(r4)
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
        L46:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            X.Tr2 r0 = r0.scanLengths_
            android.net.Uri r2 = A00(r5, r1, r0)
        L50:
            return r2
        L51:
            r0 = 2
            if (r3 != r0) goto L57
            java.lang.String r2 = "audio"
            goto L3d
        L57:
            r0 = 5
            if (r3 == r0) goto L3d
            r0 = 6
            if (r3 != r0) goto L5e
            goto L3d
        L5e:
            r2 = r1
            goto L3d
        L60:
            r0 = 3
            if (r1 != r0) goto L70
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = r6.A0O()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L50
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L19
        L70:
            r0 = 2
            if (r1 != r0) goto L80
            java.lang.Object r1 = r6.media_
            com.instagram.direct.armadilloexpress.transportpayload.Voice r1 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L50
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L19
        L80:
            r0 = 5
            if (r1 != r0) goto L90
            java.lang.Object r1 = r6.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L50
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L19
        L90:
            r0 = 6
            if (r1 != r0) goto L50
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r1 = r6.A0L()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L50
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLT.A01(X.JwV, com.instagram.direct.armadilloexpress.transportpayload.Media):android.net.Uri");
    }

    public static final Integer A04(String str) {
        if (C14360o3.A0K(str, "image/gif")) {
            return C05F.A0Y;
        }
        if (C14360o3.A0K(str, "image/webp")) {
            return C05F.A0j;
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (AbstractC43592JPx.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, str2)) {
            return C05F.A0N;
        }
        if (str == null) {
            str = "";
        }
        if (AbstractC43592JPx.A1a(MediaStreamTrack.AUDIO_TRACK_KIND, 1, str)) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final String A05(String str) {
        if (C14360o3.A0K(str, "image/gif")) {
            return ".gif";
        }
        if (C14360o3.A0K(str, "image/webp")) {
            return ".webp";
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (AbstractC43592JPx.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, str2)) {
            return ".mp4";
        }
        if (str == null) {
            str = "";
        }
        if (AbstractC43592JPx.A1a(MediaStreamTrack.AUDIO_TRACK_KIND, 1, str)) {
            return ".mp4";
        }
        return ".jpg";
    }

    public static final android.net.Uri A02(C45040JwV c45040JwV, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, long j2) {
        AbstractC167027dH.A12(str, str2, str3);
        Uri.Builder buildUpon = AbstractC08820cl.A03("msys://ae-media").buildUpon();
        buildUpon.appendPath(str);
        buildUpon.appendQueryParameter("sha256", str2);
        buildUpon.appendQueryParameter("encsha256", str3);
        buildUpon.appendQueryParameter("mediakey", str4);
        buildUpon.appendQueryParameter("mediakey_timestamp", String.valueOf(j));
        if (str5 == null) {
            str5 = "image/jpg";
        }
        buildUpon.appendQueryParameter("mimetype", str5);
        if (str6 != null) {
            buildUpon.appendQueryParameter("object_id", str6);
        }
        buildUpon.appendQueryParameter("media_id", String.valueOf(j2));
        if (num != null && num.intValue() != 0) {
            buildUpon.appendQueryParameter("file_length", num.toString());
        }
        if (str7 != null) {
            buildUpon.appendQueryParameter("sidecar", str7);
        }
        if (list != null) {
            buildUpon.appendQueryParameter("scan_lengths", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list, null));
        }
        if (c45040JwV != null) {
            buildUpon.appendQueryParameter("thead_id", c45040JwV.A03);
            Long l = c45040JwV.A01;
            if (l != null) {
                buildUpon.appendQueryParameter("thead_jid", AbstractC43592JPx.A0y(l));
            }
            buildUpon.appendQueryParameter("otid", c45040JwV.A02);
            buildUpon.appendQueryParameter("timestamp_us", String.valueOf(c45040JwV.A00));
            buildUpon.appendQueryParameter("force_eb_restore", String.valueOf(c45040JwV.A04));
        }
        android.net.Uri build = buildUpon.build();
        C14360o3.A07(build);
        return build;
    }
}
