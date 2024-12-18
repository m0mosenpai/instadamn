package X;

import android.media.MediaCodecInfo;
import android.os.Build;

/* renamed from: X.5fZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121815fZ {
    public static final C121815fZ A00 = new Object();
    public static final InterfaceC09390do A01;
    public static final InterfaceC09390do A02;
    public static final InterfaceC09390do A03;
    public static final InterfaceC09390do A04;
    public static final InterfaceC09390do A05;
    public static final InterfaceC09390do A06;

    public static final boolean A01(String str) {
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) A01.getValue();
            C14360o3.A07(mediaCodecInfoArr);
            for (MediaCodecInfo mediaCodecInfo : mediaCodecInfoArr) {
                C14360o3.A0A(mediaCodecInfo);
                if (!mediaCodecInfo.isEncoder()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    C14360o3.A07(supportedTypes);
                    if (AbstractC009903n.A0O(str, supportedTypes) && A00(mediaCodecInfo)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            C0K8.A0G("DecoderCapabilityUtil", "hardwareSupport error", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if ((!X.AbstractC001800i.A0l(r6, X.AbstractC001800i.A0k(r11)).isEmpty()) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(java.lang.String r10, java.util.Set r11) {
        /*
            r9 = 0
            X.0do r0 = X.C121815fZ.A01     // Catch: java.lang.Exception -> L67
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Exception -> L67
            android.media.MediaCodecInfo[] r4 = (android.media.MediaCodecInfo[]) r4     // Catch: java.lang.Exception -> L67
            X.C14360o3.A07(r4)     // Catch: java.lang.Exception -> L67
            int r3 = r4.length     // Catch: java.lang.Exception -> L67
            r2 = 0
            goto L11
        Lf:
            int r2 = r2 + 1
        L11:
            if (r2 >= r3) goto L66
            r5 = r4[r2]     // Catch: java.lang.Exception -> L67
            java.lang.String[] r0 = r5.getSupportedTypes()     // Catch: java.lang.Exception -> L67
            X.C14360o3.A07(r0)     // Catch: java.lang.Exception -> L67
            boolean r0 = X.AbstractC009903n.A0O(r10, r0)     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L54
            android.media.MediaCodecInfo$CodecCapabilities r0 = r5.getCapabilitiesForType(r10)     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto L54
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r0.profileLevels     // Catch: java.lang.Exception -> L67
            if (r8 == 0) goto L54
            int r7 = r8.length     // Catch: java.lang.Exception -> L67
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L67
            r6.<init>(r7)     // Catch: java.lang.Exception -> L67
            r1 = 0
        L33:
            if (r1 >= r7) goto L43
            r0 = r8[r1]     // Catch: java.lang.Exception -> L67
            int r0 = r0.profile     // Catch: java.lang.Exception -> L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L67
            r6.add(r0)     // Catch: java.lang.Exception -> L67
            int r1 = r1 + 1
            goto L33
        L43:
            java.util.Set r0 = X.AbstractC001800i.A0k(r11)     // Catch: java.lang.Exception -> L67
            java.util.Set r0 = X.AbstractC001800i.A0l(r6, r0)     // Catch: java.lang.Exception -> L67
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L67
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L55
        L54:
            r1 = 0
        L55:
            boolean r0 = r5.isEncoder()     // Catch: java.lang.Exception -> L67
            r0 = r0 ^ 1
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            boolean r0 = A00(r5)     // Catch: java.lang.Exception -> L67
            if (r0 == 0) goto Lf
            r9 = 1
        L66:
            return r9
        L67:
            r2 = move-exception
            java.lang.String r1 = "DecoderCapabilityUtil"
            java.lang.String r0 = "tenBitSupport error"
            X.C0K8.A0G(r1, r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121815fZ.A02(java.lang.String, java.util.Set):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.5fZ] */
    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A01 = AbstractC09440dt.A00(enumC09460dv, C121825fa.A00);
        A02 = AbstractC09440dt.A00(enumC09460dv, C121835fb.A00);
        A04 = AbstractC09440dt.A00(enumC09460dv, C121845fc.A00);
        A03 = AbstractC09440dt.A00(enumC09460dv, C121855fd.A00);
        A05 = AbstractC09440dt.A00(enumC09460dv, C121865fe.A00);
        A06 = AbstractC09440dt.A00(enumC09460dv, C121875ff.A00);
    }

    public static final boolean A00(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String name = mediaCodecInfo.getName();
        C14360o3.A07(name);
        C14360o3.A0B("OMX.", 1);
        if (!name.startsWith("OMX.")) {
            return false;
        }
        String name2 = mediaCodecInfo.getName();
        C14360o3.A07(name2);
        if (AbstractC001900j.A0a(name2, "google", false)) {
            return false;
        }
        return true;
    }
}
