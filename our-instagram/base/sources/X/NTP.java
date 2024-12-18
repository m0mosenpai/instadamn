package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.VideoStreamStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NTP extends AbstractC55206OeJ {
    public int A00;
    public C51883MwR A01;
    public String A02;
    public final C55177Odh A03;
    public final PCB A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTP(C55177Odh c55177Odh, PCB pcb) {
        super(AbstractC25225BEi.A1D(C51883MwR.class));
        C14360o3.A0B(c55177Odh, 2);
        this.A04 = pcb;
        this.A03 = c55177Odh;
        pcb.A00 = new P3A(this);
    }

    public static final List A00(NTP ntp) {
        ODK odk;
        String[] strArr;
        String str;
        C51883MwR c51883MwR = ntp.A01;
        ArrayList arrayList = null;
        if (c51883MwR == null) {
            C14360o3.A0F("boundModel");
            throw C00O.createAndThrow();
        }
        List list = c51883MwR.A02;
        if (list != null && (odk = (ODK) AbstractC001800i.A0O(list, ntp.A00)) != null) {
            MediaStats mediaStats = odk.A00;
            String str2 = odk.A01;
            String str3 = odk.A03;
            String str4 = odk.A04;
            String A0R = AnonymousClass001.A0R("streamId=", mediaStats.streamId);
            String A0R2 = AnonymousClass001.A0R("userId=", mediaStats.userId);
            String A0R3 = AnonymousClass001.A0R("channelType=", str2);
            String A0R4 = AnonymousClass001.A0R("streamDirection=", str3);
            String A0R5 = AnonymousClass001.A0R("streamType=", str4);
            String A0R6 = AnonymousClass001.A0R("mimeType=", mediaStats.mimeType);
            String A0R7 = AnonymousClass001.A0R("audioSsrc=", mediaStats.audioSsrc);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("audioEstimatedPlayoutTimestampMS=");
            String A0v = AbstractC166997dE.A0v(mediaStats.audioEstimatedPlayoutTimestampMS, A1C);
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("audioSamplingRateKhz=");
            String A0v2 = AbstractC166997dE.A0v(mediaStats.audioSamplingRateKhz, A1C2);
            StringBuilder A1C3 = AbstractC166987dD.A1C();
            A1C3.append("audioE2eDelayMS=");
            String A0v3 = AbstractC166997dE.A0v(mediaStats.audioE2eDelayMS, A1C3);
            String A0R8 = AnonymousClass001.A0R("audioCodec=", mediaStats.audioCodec);
            StringBuilder A1C4 = AbstractC166987dD.A1C();
            A1C4.append("audioBitrateKbps=");
            String A0v4 = AbstractC166997dE.A0v(mediaStats.audioBitrateKbps, A1C4);
            StringBuilder A1C5 = AbstractC166987dD.A1C();
            A1C5.append("audioTargetBitrateKbps=");
            String A0v5 = AbstractC166997dE.A0v(mediaStats.audioTargetBitrateKbps, A1C5);
            StringBuilder A1C6 = AbstractC166987dD.A1C();
            A1C6.append("audioBytesReceived=");
            String A0v6 = AbstractC166997dE.A0v(mediaStats.audioBytesReceived, A1C6);
            StringBuilder A1C7 = AbstractC166987dD.A1C();
            A1C7.append("audioBytesSent=");
            String A0v7 = AbstractC166997dE.A0v(mediaStats.audioBytesSent, A1C7);
            StringBuilder A1C8 = AbstractC166987dD.A1C();
            A1C8.append("audioPacketsReceived=");
            String A0v8 = AbstractC166997dE.A0v(mediaStats.audioPacketsReceived, A1C8);
            StringBuilder A1C9 = AbstractC166987dD.A1C();
            A1C9.append("audioPacketsLost=");
            String A0v9 = AbstractC166997dE.A0v(mediaStats.audioPacketsLost, A1C9);
            StringBuilder A1C10 = AbstractC166987dD.A1C();
            A1C10.append("audioFecPacketsReceived=");
            String A0v10 = AbstractC166997dE.A0v(mediaStats.audioFecPacketsReceived, A1C10);
            StringBuilder A1C11 = AbstractC166987dD.A1C();
            A1C11.append("audioNackCount=");
            String A0v11 = AbstractC166997dE.A0v(mediaStats.audioNackCount, A1C11);
            StringBuilder A1C12 = AbstractC166987dD.A1C();
            A1C12.append("audioRetransmittedPacketsSent=");
            String A0v12 = AbstractC166997dE.A0v(mediaStats.audioRetransmittedPacketsSent, A1C12);
            StringBuilder A1C13 = AbstractC166987dD.A1C();
            A1C13.append("audioJitterMS=");
            String A0v13 = AbstractC166997dE.A0v(mediaStats.audioJitterMS, A1C13);
            StringBuilder A1C14 = AbstractC166987dD.A1C();
            A1C14.append("concealedSamples=");
            String A0v14 = AbstractC166997dE.A0v(mediaStats.concealedSamples, A1C14);
            StringBuilder A1C15 = AbstractC166987dD.A1C();
            A1C15.append("totalSamplesReceived=");
            String A0v15 = AbstractC166997dE.A0v(mediaStats.totalSamplesReceived, A1C15);
            StringBuilder A1C16 = AbstractC166987dD.A1C();
            A1C16.append("audioLevel=");
            ArrayList A1M = AbstractC16960so.A1M(A0R, A0R2, A0R3, A0R4, A0R5, A0R6, A0R7, A0v, A0v2, A0v3, A0R8, A0v4, A0v5, A0v6, A0v7, A0v8, A0v9, A0v10, A0v11, A0v12, A0v13, A0v14, A0v15, AbstractC166997dE.A0v(mediaStats.audioLevel, A1C16));
            ArrayList arrayList2 = mediaStats.videoStreams;
            C14360o3.A06(arrayList2);
            VideoStreamStats videoStreamStats = (VideoStreamStats) AbstractC001800i.A0J(arrayList2);
            if (videoStreamStats != null) {
                Class<?> cls = videoStreamStats.getClass();
                C14360o3.A0B(cls, 0);
                Map map = C0YZ.A03;
                String A01 = AbstractC13230m9.A01(cls);
                String A0g = AnonymousClass001.A0g(A01, "::ssrc=", videoStreamStats.ssrc);
                StringBuilder A11 = AbstractC166997dE.A11(A01);
                A11.append("::frameWidth=");
                String A0v16 = AbstractC166997dE.A0v(videoStreamStats.frameWidth, A11);
                StringBuilder A112 = AbstractC166997dE.A11(A01);
                A112.append("::frameHeight=");
                String A0v17 = AbstractC166997dE.A0v(videoStreamStats.frameHeight, A112);
                StringBuilder A113 = AbstractC166997dE.A11(A01);
                A113.append("::bitrateKbps=");
                String A0v18 = AbstractC166997dE.A0v(videoStreamStats.bitrateKbps, A113);
                StringBuilder A114 = AbstractC166997dE.A11(A01);
                A114.append("::bytesSent=");
                String A0v19 = AbstractC166997dE.A0v(videoStreamStats.bytesSent, A114);
                StringBuilder A115 = AbstractC166997dE.A11(A01);
                A115.append("::bytesReceived=");
                String A0v20 = AbstractC166997dE.A0v(videoStreamStats.bytesReceived, A115);
                StringBuilder A116 = AbstractC166997dE.A11(A01);
                A116.append("::retransmittedPacketsSent=");
                String A0v21 = AbstractC166997dE.A0v(videoStreamStats.retransmittedPacketsSent, A116);
                StringBuilder A117 = AbstractC166997dE.A11(A01);
                A117.append("::framesEncoded=");
                String A0v22 = AbstractC166997dE.A0v(videoStreamStats.framesEncoded, A117);
                StringBuilder A118 = AbstractC166997dE.A11(A01);
                A118.append("::framesEncodedPerSecond=");
                String A0v23 = AbstractC166997dE.A0v(videoStreamStats.framesEncodedPerSecond, A118);
                StringBuilder A119 = AbstractC166997dE.A11(A01);
                A119.append("::framesDecoded=");
                String A0v24 = AbstractC166997dE.A0v(videoStreamStats.framesDecoded, A119);
                StringBuilder A1110 = AbstractC166997dE.A11(A01);
                A1110.append("::framesDecodedPerSecond=");
                String A0v25 = AbstractC166997dE.A0v(videoStreamStats.framesDecodedPerSecond, A1110);
                String A0g2 = AnonymousClass001.A0g(A01, "::codec=", videoStreamStats.codec);
                StringBuilder A1111 = AbstractC166997dE.A11(A01);
                A1111.append("::e2eDelayMS=");
                String A0v26 = AbstractC166997dE.A0v(videoStreamStats.e2eDelayMS, A1111);
                StringBuilder A1112 = AbstractC166997dE.A11(A01);
                A1112.append("::nackCount=");
                String A0v27 = AbstractC166997dE.A0v(videoStreamStats.nackCount, A1112);
                StringBuilder A1113 = AbstractC166997dE.A11(A01);
                A1113.append("::jitterMS=");
                String A0v28 = AbstractC166997dE.A0v(videoStreamStats.jitterMS, A1113);
                StringBuilder A1114 = AbstractC166997dE.A11(A01);
                A1114.append("::packetsReceived=");
                String A0v29 = AbstractC166997dE.A0v(videoStreamStats.packetsReceived, A1114);
                StringBuilder A1115 = AbstractC166997dE.A11(A01);
                A1115.append("::packetsLost=");
                String A0v30 = AbstractC166997dE.A0v(videoStreamStats.packetsLost, A1115);
                StringBuilder A1116 = AbstractC166997dE.A11(A01);
                A1116.append("::fecPacketsReceived=");
                String A0v31 = AbstractC166997dE.A0v(videoStreamStats.fecPacketsReceived, A1116);
                StringBuilder A1117 = AbstractC166997dE.A11(A01);
                A1117.append("::totalEncodeTime=");
                String A0v32 = AbstractC166997dE.A0v(videoStreamStats.totalEncodeTime, A1117);
                StringBuilder A1118 = AbstractC166997dE.A11(A01);
                A1118.append("::targetBitrateKbps=");
                strArr = new String[]{A0g, A0v16, A0v17, A0v18, A0v19, A0v20, A0v21, A0v22, A0v23, A0v24, A0v25, A0g2, A0v26, A0v27, A0v28, A0v29, A0v30, A0v31, A0v32, AbstractC166997dE.A0v(videoStreamStats.targetBitrateKbps, A1118)};
            } else {
                strArr = new String[]{AbstractC167017dG.A0n(arrayList2, "videoStreams=", AbstractC166987dD.A1C())};
            }
            ArrayList A0S = AbstractC001800i.A0S(AbstractC16960so.A1M(strArr), A1M);
            arrayList = AbstractC166987dD.A1E();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String lowerCase = ((String) next).toLowerCase();
                C14360o3.A07(lowerCase);
                String str5 = ntp.A02;
                if (str5 != null) {
                    str = str5.toLowerCase();
                    C14360o3.A07(str);
                } else {
                    str = "";
                }
                if (AbstractC001900j.A0a(lowerCase, str, false)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
