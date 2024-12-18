package X;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: X.2Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46762Co {
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap A01 = new HashMap();

    public static C2IG A01(String str) {
        List A05 = A05(str, false, false);
        if (A05.isEmpty()) {
            return null;
        }
        return (C2IG) A05.get(0);
    }

    public static void A07(String str) {
        String str2;
        try {
            A05(str, false, false);
        } catch (C40J e) {
            e = e;
            str2 = "Codec warming failed";
            AbstractC46512Bo.A05("MediaCodecUtil", str2, e);
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str2 = "Codec warming failed with UnsatisfiedLinkError";
            AbstractC46512Bo.A05("MediaCodecUtil", str2, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0262, code lost:
    
        if (r6.A03 != 6) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0359, code lost:
    
        if (r2.equals("L63") == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0179, code lost:
    
        if (r0 != null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
    
        if (r2.equals("04") == false) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0274. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x00d7. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x05e6: INVOKE (r0 I:java.lang.String) = (r7 I:java.lang.String), (r2 I:java.lang.String) STATIC call: X.001.A0R(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m)] (LINE:1510), block:B:415:0x05e6 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x05bf: INVOKE (r0 I:java.lang.String) = (r8 I:java.lang.String), (r2 I:java.lang.String) STATIC call: X.001.A0R(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m)] (LINE:1471), block:B:416:0x05bf */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair A00(X.C4B6 r13) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46762Co.A00(X.4B6):android.util.Pair");
    }

    public static ImmutableList A02(C4B6 c4b6, C4BL c4bl, boolean z, boolean z2) {
        List Aw3;
        List Aw32 = c4bl.Aw3(c4b6.A0W, z, z2);
        String A03 = A03(c4b6);
        if (A03 == null) {
            Aw3 = ImmutableList.of();
        } else {
            Aw3 = c4bl.Aw3(A03, z, z2);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(Aw32);
        builder.addAll(Aw3);
        return builder.build();
    }

    public static String A03(C4B6 c4b6) {
        Pair A002;
        String str = c4b6.A0W;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (A002 = A00(c4b6)) != null) {
            int intValue = ((Number) A002.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static ArrayList A04(final C4B6 c4b6, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C5TE(new C5TD() { // from class: X.5TC
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
            
                if (r1.equals(X.C46762Co.A03(r2)) != false) goto L6;
             */
            @Override // X.C5TD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int Bqi(java.lang.Object r4) {
                /*
                    r3 = this;
                    X.4B6 r2 = X.C4B6.this
                    X.2IG r4 = (X.C2IG) r4
                    java.lang.String r1 = r4.A02
                    java.lang.String r0 = r2.A0W
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L19
                    java.lang.String r0 = X.C46762Co.A03(r2)
                    boolean r1 = r1.equals(r0)
                    r0 = 0
                    if (r1 == 0) goto L1a
                L19:
                    r0 = 1
                L1a:
                    r1 = 0
                    if (r0 == 0) goto L24
                    boolean r0 = X.C2IG.A03(r2, r4, r1)
                    if (r0 == 0) goto L24
                    r1 = 1
                L24:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5TC.Bqi(java.lang.Object):int");
            }
        }));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r29 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (A08(r6) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List A05(java.lang.String r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46762Co.A05(java.lang.String, boolean, boolean):java.util.List");
    }

    public static boolean A0B(MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.A00 >= 29) {
            return A0A(mediaCodecInfo);
        }
        if (!C2IH.A04(str)) {
            String A002 = C4B2.A00(mediaCodecInfo.getName());
            if (A002.startsWith("arc.")) {
                return false;
            }
            if (!A002.startsWith("omx.google.") && !A002.startsWith("omx.ffmpeg.") && ((!A002.startsWith("omx.sec.") || !A002.contains(".sw.")) && !A002.equals("omx.qcom.video.decoder.hevcswvdec") && !A002.startsWith("c2.android.") && !A002.startsWith("c2.google.") && (A002.startsWith("omx.") || A002.startsWith("c2.")))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A08(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A09(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A0A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static void A06(MediaCodecInfo mediaCodecInfo) {
        mediaCodecInfo.isVendor();
    }
}
