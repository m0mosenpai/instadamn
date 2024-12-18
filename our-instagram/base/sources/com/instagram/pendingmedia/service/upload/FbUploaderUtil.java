package com.instagram.pendingmedia.service.upload;

import X.AbstractC13570mj;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC54086Nvk;
import X.AbstractC54885OPg;
import X.AnonymousClass001;
import X.C0K8;
import X.C115435Kd;
import X.C14360o3;
import X.C47Z;
import X.EnumC115415Kb;
import X.EnumC40111tc;
import X.MY4;
import X.OXD;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import java.io.File;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class FbUploaderUtil {
    public static final FbUploaderUtil A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2 != false) goto L11;
     */
    @kotlin.Deprecated(message = "Use awaitUpload instead", replaceWith = @kotlin.ReplaceWith(expression = "awaitUpload", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC53512Nle A02(X.InterfaceC58100PpP r10, X.C55654Onf r11, X.O8O r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            java.lang.String r5 = ""
            r0 = 4
            X.C14360o3.A0B(r14, r0)
            if (r13 != 0) goto L10
            java.lang.String r0 = "media file path null"
            X.NRT r2 = new X.NRT     // Catch: java.lang.Exception -> Lb1
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lb1
            return r2
        L10:
            java.io.File r4 = X.AbstractC166987dD.A11(r13)     // Catch: java.lang.Exception -> Lb1
            long r0 = r4.length()     // Catch: java.lang.Exception -> Lb1
            boolean r2 = r4.exists()     // Catch: java.lang.Exception -> Lb1
            r3 = r2 ^ 1
            long r8 = r4.length()     // Catch: java.lang.Exception -> Lb1
            r6 = 0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            boolean r2 = X.AbstractC31175DnJ.A1S(r2)
            if (r3 != 0) goto L2f
            r7 = 0
            if (r2 == 0) goto L4b
        L2f:
            r7 = 1
            java.lang.String r6 = r4.getParent()     // Catch: java.lang.Exception -> Lb1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r3, r2}     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = "path %s, non-existing %s, invalid len %s"
            java.lang.String r3 = X.AbstractC13670mt.A06(r2, r3)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = "upload_media_file_invalid"
            X.C0w9.A03(r2, r3)     // Catch: java.lang.Exception -> Lb1
        L4b:
            java.lang.String r2 = "FbUploaderUtil"
            if (r7 == 0) goto L68
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = "file does not exist: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r4, r0, r1)     // Catch: java.lang.Exception -> Lb1
            X.C0K8.A0C(r2, r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = "Media file doesn't exist: "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r13)     // Catch: java.lang.Exception -> Lb1
            X.NRT r2 = new X.NRT     // Catch: java.lang.Exception -> Lb1
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lb1
            return r2
        L68:
            r11.A01 = r0     // Catch: java.lang.Exception -> Lb1
            int r0 = r11.A00     // Catch: java.lang.Exception -> Lb1
            int r0 = r0 + 1
            r11.A00 = r0     // Catch: java.lang.Exception -> Lb1
            X.4Qz r0 = r11.A02     // Catch: java.lang.Exception -> Lb1
            r0.A02()     // Catch: java.lang.Exception -> Lb1
            X.4Qz r3 = new X.4Qz     // Catch: java.lang.Exception -> Lb1
            r3.<init>()     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = X.AbstractC54106Nw4.A00(r13, r14, r15)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = r4.getPath()     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto Laa
            X.1tc r0 = r12.A01     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = A03(r0, r4, r5)     // Catch: java.lang.Exception -> Lb1
            X.Odx r1 = new X.Odx     // Catch: java.lang.Exception -> Lb1
            r1.<init>(r4, r0, r2)     // Catch: java.lang.Exception -> Lb1
            X.OUc r0 = r12.A00     // Catch: java.lang.Exception -> Lb1
            X.PkK r0 = r10.En2(r0, r1, r11)     // Catch: java.lang.Exception -> Lb1
            r3.A01()     // Catch: java.lang.Exception -> Lb1
            r3.A02()     // Catch: java.lang.Exception -> Lb1
            X.W63 r1 = r10.FDr(r0)     // Catch: java.lang.Exception -> Lb1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lb1
            r3.A00(r0)     // Catch: java.lang.Exception -> Lb1
            X.NRV r2 = new X.NRV     // Catch: java.lang.Exception -> Lb1
            r2.<init>(r1)     // Catch: java.lang.Exception -> Lb1
            return r2
        Laa:
            java.lang.String r0 = "rendered video file path null"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)     // Catch: java.lang.Exception -> Lb1
            throw r0     // Catch: java.lang.Exception -> Lb1
        Lb1:
            r0 = move-exception
            X.NRU r2 = new X.NRU
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.FbUploaderUtil.A02(X.PpP, X.Onf, X.O8O, java.lang.String, java.lang.String, int):X.Nle");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:19|20))(2:21|(2:23|24)(6:25|26|(1:28)|40|30|(4:32|(1:34)|35|36)(2:37|(1:39))))|12|13|(2:15|16)(1:18)))|43|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r7 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        r1 = X.MSW.A1D(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC58100PpP r11, X.C55654Onf r12, X.O8O r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.InterfaceC23621Ds r17, int r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.FbUploaderUtil.A04(X.PpP, X.Onf, X.O8O, java.lang.String, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    public static final C115435Kd A00(OXD oxd, String str) {
        EnumC115415Kb enumC115415Kb;
        AbstractC167017dG.A1N(str, oxd);
        C0K8.A0C("FbUploaderUtil", str);
        C47Z c47z = oxd.A0C;
        if (AbstractC54086Nvk.A00(oxd.A0B, c47z.A0D(), c47z.A11())) {
            enumC115415Kb = EnumC115415Kb.A0G;
        } else {
            enumC115415Kb = EnumC115415Kb.A0F;
        }
        return oxd.A02(enumC115415Kb, str);
    }

    public static final C115435Kd A01(OXD oxd, String str, Throwable th) {
        AbstractC167017dG.A1N(th, oxd);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("fbuploader error (%s)", str);
        String A0T = AnonymousClass001.A0T(formatStrLocaleSafe, th.getMessage(), ':');
        int A002 = AbstractC54885OPg.A00(th);
        if (400 <= A002 && A002 < 500) {
            return oxd.A02(EnumC115415Kb.A05.A00(A002), A0T);
        }
        C14360o3.A0A(formatStrLocaleSafe);
        IOException iOException = new IOException(A0T, th.getCause());
        C14360o3.A0B(formatStrLocaleSafe, 0);
        C115435Kd A02 = C115435Kd.A09.A02(null, oxd.A0G, formatStrLocaleSafe, iOException);
        oxd.A03 = A02;
        return A02;
    }

    public static final String A03(EnumC40111tc enumC40111tc, File file, String str) {
        switch (enumC40111tc.ordinal()) {
            case 0:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String A002 = AbstractC13570mj.A00(file.getPath());
                if (A002 == null) {
                    return "unknown";
                }
                return A002;
            case 1:
            case 18:
            case 25:
                try {
                    String str2 = MY4.A02(file).A03;
                    if (str2 == null) {
                        return "video/mp4";
                    }
                    return str2;
                } catch (IllegalArgumentException e) {
                    C0K8.A0G("FbUploaderUtil", AnonymousClass001.A0R("Error reading mimeType from file ", file.getPath()), e);
                    return "video/mp4";
                }
            case 7:
                return "audio/mp4";
            case 17:
                return str;
            default:
                throw AbstractC166987dD.A18(AbstractC167017dG.A0n(enumC40111tc, "Unsupported media type: ", AbstractC166987dD.A1C()));
        }
    }
}
