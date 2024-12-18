package com.facebook.rsys.mediastats.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class VideoStreamStats {
    public static C2N9 CONVERTER = C55648OnZ.A00(38);
    public static long sMcfTypeId;
    public final Long avSyncAbsMS;
    public final Float bitrateKbps;
    public final Long bytesReceived;
    public final Long bytesSent;
    public final String codec;
    public final Long e2eDelayMS;
    public final Long estimatedPlayoutTimestampMS;
    public final Long fecPacketsReceived;
    public final Integer frameHeight;
    public final Integer frameWidth;
    public final Long framesDecoded;
    public final Float framesDecodedPerSecond;
    public final Long framesEncoded;
    public final Float framesEncodedPerSecond;
    public final Long jitterMS;
    public final Long nackCount;
    public final Long packetsLost;
    public final Long packetsReceived;
    public final String qualityLimitationReason;
    public final Long retransmittedPacketsSent;
    public final String ssrc;
    public final Float targetBitrateKbps;
    public final Float totalEncodeTime;

    public static native VideoStreamStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStreamStats)) {
                return false;
            }
            VideoStreamStats videoStreamStats = (VideoStreamStats) obj;
            String str = this.ssrc;
            String str2 = videoStreamStats.ssrc;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            Integer num = this.frameWidth;
            Integer num2 = videoStreamStats.frameWidth;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            Integer num3 = this.frameHeight;
            Integer num4 = videoStreamStats.frameHeight;
            if (num3 == null) {
                if (num4 != null) {
                    return false;
                }
            } else if (!num3.equals(num4)) {
                return false;
            }
            Float f = this.bitrateKbps;
            Float f2 = videoStreamStats.bitrateKbps;
            if (f == null) {
                if (f2 != null) {
                    return false;
                }
            } else if (!f.equals(f2)) {
                return false;
            }
            Long l = this.bytesSent;
            Long l2 = videoStreamStats.bytesSent;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.bytesReceived;
            Long l4 = videoStreamStats.bytesReceived;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            Long l5 = this.retransmittedPacketsSent;
            Long l6 = videoStreamStats.retransmittedPacketsSent;
            if (l5 == null) {
                if (l6 != null) {
                    return false;
                }
            } else if (!l5.equals(l6)) {
                return false;
            }
            Long l7 = this.framesEncoded;
            Long l8 = videoStreamStats.framesEncoded;
            if (l7 == null) {
                if (l8 != null) {
                    return false;
                }
            } else if (!l7.equals(l8)) {
                return false;
            }
            Float f3 = this.framesEncodedPerSecond;
            Float f4 = videoStreamStats.framesEncodedPerSecond;
            if (f3 == null) {
                if (f4 != null) {
                    return false;
                }
            } else if (!f3.equals(f4)) {
                return false;
            }
            Long l9 = this.framesDecoded;
            Long l10 = videoStreamStats.framesDecoded;
            if (l9 == null) {
                if (l10 != null) {
                    return false;
                }
            } else if (!l9.equals(l10)) {
                return false;
            }
            Float f5 = this.framesDecodedPerSecond;
            Float f6 = videoStreamStats.framesDecodedPerSecond;
            if (f5 == null) {
                if (f6 != null) {
                    return false;
                }
            } else if (!f5.equals(f6)) {
                return false;
            }
            String str3 = this.codec;
            String str4 = videoStreamStats.codec;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            Long l11 = this.e2eDelayMS;
            Long l12 = videoStreamStats.e2eDelayMS;
            if (l11 == null) {
                if (l12 != null) {
                    return false;
                }
            } else if (!l11.equals(l12)) {
                return false;
            }
            Long l13 = this.nackCount;
            Long l14 = videoStreamStats.nackCount;
            if (l13 == null) {
                if (l14 != null) {
                    return false;
                }
            } else if (!l13.equals(l14)) {
                return false;
            }
            Long l15 = this.jitterMS;
            Long l16 = videoStreamStats.jitterMS;
            if (l15 == null) {
                if (l16 != null) {
                    return false;
                }
            } else if (!l15.equals(l16)) {
                return false;
            }
            Long l17 = this.packetsReceived;
            Long l18 = videoStreamStats.packetsReceived;
            if (l17 == null) {
                if (l18 != null) {
                    return false;
                }
            } else if (!l17.equals(l18)) {
                return false;
            }
            Long l19 = this.packetsLost;
            Long l20 = videoStreamStats.packetsLost;
            if (l19 == null) {
                if (l20 != null) {
                    return false;
                }
            } else if (!l19.equals(l20)) {
                return false;
            }
            Long l21 = this.fecPacketsReceived;
            Long l22 = videoStreamStats.fecPacketsReceived;
            if (l21 == null) {
                if (l22 != null) {
                    return false;
                }
            } else if (!l21.equals(l22)) {
                return false;
            }
            Float f7 = this.totalEncodeTime;
            Float f8 = videoStreamStats.totalEncodeTime;
            if (f7 == null) {
                if (f8 != null) {
                    return false;
                }
            } else if (!f7.equals(f8)) {
                return false;
            }
            Float f9 = this.targetBitrateKbps;
            Float f10 = videoStreamStats.targetBitrateKbps;
            if (f9 == null) {
                if (f10 != null) {
                    return false;
                }
            } else if (!f9.equals(f10)) {
                return false;
            }
            Long l23 = this.estimatedPlayoutTimestampMS;
            Long l24 = videoStreamStats.estimatedPlayoutTimestampMS;
            if (l23 == null) {
                if (l24 != null) {
                    return false;
                }
            } else if (!l23.equals(l24)) {
                return false;
            }
            Long l25 = this.avSyncAbsMS;
            Long l26 = videoStreamStats.avSyncAbsMS;
            if (l25 == null) {
                if (l26 != null) {
                    return false;
                }
            } else if (!l25.equals(l26)) {
                return false;
            }
            String str5 = this.qualityLimitationReason;
            String str6 = videoStreamStats.qualityLimitationReason;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((JQ0.A01(AbstractC167017dG.A0O(this.ssrc)) + AbstractC167017dG.A0M(this.frameWidth)) * 31) + AbstractC167017dG.A0M(this.frameHeight)) * 31) + AbstractC167017dG.A0M(this.bitrateKbps)) * 31) + AbstractC167017dG.A0M(this.bytesSent)) * 31) + AbstractC167017dG.A0M(this.bytesReceived)) * 31) + AbstractC167017dG.A0M(this.retransmittedPacketsSent)) * 31) + AbstractC167017dG.A0M(this.framesEncoded)) * 31) + AbstractC167017dG.A0M(this.framesEncodedPerSecond)) * 31) + AbstractC167017dG.A0M(this.framesDecoded)) * 31) + AbstractC167017dG.A0M(this.framesDecodedPerSecond)) * 31) + AbstractC167017dG.A0O(this.codec)) * 31) + AbstractC167017dG.A0M(this.e2eDelayMS)) * 31) + AbstractC167017dG.A0M(this.nackCount)) * 31) + AbstractC167017dG.A0M(this.jitterMS)) * 31) + AbstractC167017dG.A0M(this.packetsReceived)) * 31) + AbstractC167017dG.A0M(this.packetsLost)) * 31) + AbstractC167017dG.A0M(this.fecPacketsReceived)) * 31) + AbstractC167017dG.A0M(this.totalEncodeTime)) * 31) + AbstractC167017dG.A0M(this.targetBitrateKbps)) * 31) + AbstractC167017dG.A0M(this.estimatedPlayoutTimestampMS)) * 31) + AbstractC167017dG.A0M(this.avSyncAbsMS)) * 31) + AbstractC25227BEk.A07(this.qualityLimitationReason);
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoStreamStats{ssrc=");
        A1C.append(this.ssrc);
        A1C.append(",frameWidth=");
        A1C.append(this.frameWidth);
        A1C.append(",frameHeight=");
        A1C.append(this.frameHeight);
        A1C.append(",bitrateKbps=");
        A1C.append(this.bitrateKbps);
        A1C.append(",bytesSent=");
        A1C.append(this.bytesSent);
        A1C.append(",bytesReceived=");
        A1C.append(this.bytesReceived);
        A1C.append(",retransmittedPacketsSent=");
        A1C.append(this.retransmittedPacketsSent);
        A1C.append(",framesEncoded=");
        A1C.append(this.framesEncoded);
        A1C.append(",framesEncodedPerSecond=");
        A1C.append(this.framesEncodedPerSecond);
        A1C.append(",framesDecoded=");
        A1C.append(this.framesDecoded);
        A1C.append(",framesDecodedPerSecond=");
        A1C.append(this.framesDecodedPerSecond);
        A1C.append(",codec=");
        A1C.append(this.codec);
        A1C.append(",e2eDelayMS=");
        A1C.append(this.e2eDelayMS);
        A1C.append(",nackCount=");
        A1C.append(this.nackCount);
        A1C.append(",jitterMS=");
        A1C.append(this.jitterMS);
        A1C.append(",packetsReceived=");
        A1C.append(this.packetsReceived);
        A1C.append(",packetsLost=");
        A1C.append(this.packetsLost);
        A1C.append(",fecPacketsReceived=");
        A1C.append(this.fecPacketsReceived);
        A1C.append(",totalEncodeTime=");
        A1C.append(this.totalEncodeTime);
        A1C.append(",targetBitrateKbps=");
        A1C.append(this.targetBitrateKbps);
        A1C.append(",estimatedPlayoutTimestampMS=");
        A1C.append(this.estimatedPlayoutTimestampMS);
        A1C.append(",avSyncAbsMS=");
        A1C.append(this.avSyncAbsMS);
        A1C.append(",qualityLimitationReason=");
        return AbstractC50523MSb.A0W(this.qualityLimitationReason, A1C);
    }

    public VideoStreamStats(String str, Integer num, Integer num2, Float f, Long l, Long l2, Long l3, Long l4, Float f2, Long l5, Float f3, String str2, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Float f4, Float f5, Long l12, Long l13, String str3) {
        this.ssrc = str;
        this.frameWidth = num;
        this.frameHeight = num2;
        this.bitrateKbps = f;
        this.bytesSent = l;
        this.bytesReceived = l2;
        this.retransmittedPacketsSent = l3;
        this.framesEncoded = l4;
        this.framesEncodedPerSecond = f2;
        this.framesDecoded = l5;
        this.framesDecodedPerSecond = f3;
        this.codec = str2;
        this.e2eDelayMS = l6;
        this.nackCount = l7;
        this.jitterMS = l8;
        this.packetsReceived = l9;
        this.packetsLost = l10;
        this.fecPacketsReceived = l11;
        this.totalEncodeTime = f4;
        this.targetBitrateKbps = f5;
        this.estimatedPlayoutTimestampMS = l12;
        this.avSyncAbsMS = l13;
        this.qualityLimitationReason = str3;
    }
}
