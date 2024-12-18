package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.util.Pair;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.48n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC916948n {
    public static Handler A00;
    public static File A01;
    public static File A02;
    public static File A03;
    public static File A04;
    public static File A05;
    public static File A06;
    public static File A07;
    public static File A08;
    public static File A09;
    public static File A0A;

    public static String A0A(Context context, String str, long j, boolean z) {
        return A0B(context, str, j, z, true, false);
    }

    public static Pair A00(String str) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        MY5 A002 = MY5.A00("video_session_util_extract_media_info");
        try {
            try {
                A002.ESw(str);
                for (int i = 0; i < ((MY7) A002).A00.getTrackCount(); i++) {
                    String obj = ((MY7) A002).A00.getTrackFormat(i).toString();
                    arrayList.add(obj);
                    for (String str2 : obj.substring(1, obj.length() - 1).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
                        String[] split = str2.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                        hashMap.put(AbstractC13670mt.A06("track_%s_%s", Integer.valueOf(i + 1), split[0].trim()), split[1].trim());
                    }
                }
                A002.release();
                return Pair.create(AbstractC13670mt.A05("\n", arrayList), hashMap);
            } catch (Exception e) {
                C0w9.A07("media_track_info_extraction_error", e);
                Pair create = Pair.create(AnonymousClass001.A0R("Failed to extract track info: ", e.getMessage()), hashMap);
                A002.release();
                return create;
            }
        } catch (Throwable th) {
            A002.release();
            throw th;
        }
    }

    public static File A02() {
        File file = A06;
        if (file == null) {
            File CHo = AbstractC23881Ey.A00().CHo(null, 479650569);
            A06 = CHo;
            return CHo;
        }
        return file;
    }

    public static File A03() {
        File file = A07;
        if (file == null) {
            File CHo = AbstractC23881Ey.A00().CHo(null, 1091194249);
            A07 = CHo;
            return CHo;
        }
        return file;
    }

    public static File A04() {
        File file = A08;
        if (file == null) {
            File CHo = AbstractC23881Ey.A00().CHo(null, 2067368366);
            A08 = CHo;
            return CHo;
        }
        return file;
    }

    public static File A05() {
        File file = A09;
        if (file == null) {
            File CHo = AbstractC23881Ey.A00().CHo(null, 1737640186);
            A09 = CHo;
            return CHo;
        }
        return file;
    }

    public static File A06() {
        File file = A0A;
        if (file == null) {
            File AXd = AbstractC23881Ey.A00().AXd(null, 1877184530);
            A0A = AXd;
            return AXd;
        }
        return file;
    }

    public static String A08(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13, 36311040794821031L) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        r0 = (long) (r14.A1N.A00() * X.C18U.A00(X.C06090Tz.A06, r13, 37155465725018122L));
        r2 = r12.getExternalFilesDir(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r0 <= r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r0 < X.AbstractC13530mf.A00(r12)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r2 = new android.os.StatFs(r2.getAbsolutePath());
        r6 = r2.getAvailableBlocksLong() * r2.getBlockSizeLong();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        if (r15 == X.C05F.A00) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r14.A4w != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r15 != X.C05F.A00) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A09(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C47Z r14, java.lang.Integer r15) {
        /*
            java.lang.String r10 = "mp4"
            r4 = r14
            boolean r0 = r14.A5V
            r9 = r12
            if (r0 == 0) goto L8a
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r1 = r14.A14(r0)
            boolean r0 = X.AbstractC50707Ma2.A00(r14)
            boolean r0 = X.AbstractC54247NyS.A00(r13, r1, r0)
            if (r0 == 0) goto L1d
            boolean r1 = r14.A4w
            r0 = 1
            if (r1 == 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.Integer r1 = X.C05F.A00
            if (r15 == r1) goto L24
        L22:
            if (r0 == 0) goto Lcc
        L24:
            r8 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36311040794821031(0x8100b3000001a7, double:3.0265866392456874E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            if (r0 == 0) goto L5c
            com.instagram.pendingmedia.model.ClipInfo r0 = r14.A1N
            long r0 = r0.A00()
            double r2 = (double) r0
            X.0Tz r6 = X.C06090Tz.A06
            r0 = 37155465725018122(0x8400b30001000a, double:3.5606043653286E-306)
            double r0 = X.C18U.A00(r6, r13, r0)
            double r2 = r2 * r0
            long r0 = (long) r2
            r2 = 0
            java.io.File r2 = r12.getExternalFilesDir(r2)
            if (r2 != 0) goto L77
            r6 = 0
        L4f:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L5c
            long r6 = X.AbstractC13530mf.A00(r12)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r13 = 0
            if (r2 < 0) goto L5d
        L5c:
            r13 = r8
        L5d:
            java.lang.Integer r0 = X.C05F.A01
            if (r15 != r0) goto L72
            java.lang.String r0 = r14.A35
            long r11 = java.lang.Long.parseLong(r0)
        L67:
            boolean r0 = r14.A66
            r14 = r0 ^ 1
            boolean r15 = r4.A5p
            java.lang.String r0 = A0B(r9, r10, r11, r13, r14, r15)
            return r0
        L72:
            long r11 = java.lang.System.nanoTime()
            goto L67
        L77:
            java.lang.String r3 = r2.getAbsolutePath()
            android.os.StatFs r2 = new android.os.StatFs
            r2.<init>(r3)
            long r6 = r2.getAvailableBlocksLong()
            long r2 = r2.getBlockSizeLong()
            long r6 = r6 * r2
            goto L4f
        L8a:
            boolean r0 = r14.A0w()
            if (r0 != 0) goto Lc6
            com.instagram.pendingmedia.model.constants.ShareType r1 = r14.A0D()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A0L
            if (r1 == r0) goto Lc6
            boolean r0 = X.AbstractC14490oL.A09(r12)
            if (r0 != 0) goto Lc6
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            com.instagram.pendingmedia.model.constants.ShareType r0 = r14.A0D()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lcc
            boolean r0 = r14.A5U
            if (r0 != 0) goto Lcc
            X.1Ai r3 = X.AbstractC23021Ah.A00(r13)
            X.0ry r2 = r3.A7r
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 31
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L22
        Lc6:
            java.lang.Integer r0 = X.C05F.A00
            if (r15 != r0) goto Lcc
            goto L24
        Lcc:
            r8 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC916948n.A09(android.content.Context, com.instagram.common.session.UserSession, X.47Z, java.lang.Integer):java.lang.String");
    }

    public static String A0B(Context context, String str, long j, boolean z, boolean z2, boolean z3) {
        File file;
        if (z && (Build.VERSION.SDK_INT >= 33 || AbstractC23451Ch.A07(context, AbstractC43591JPw.A00(2)))) {
            File file2 = A05;
            if (file2 == null) {
                file2 = new File(C0eT.A00(Environment.DIRECTORY_MOVIES), AbstractC13180m4.A00(context).replace(' ', '_'));
                A05 = file2;
            }
            file2.mkdirs();
            file = A05;
        } else {
            A0F();
            file = (File) C1Q3.A01.getValue();
        }
        String A082 = A08(j);
        if (z3) {
            A082 = AnonymousClass001.A0R(A082, "_secondary");
        }
        File file3 = new File(file, AbstractC13670mt.A06("%s.%s", A082, str));
        if (z2) {
            file3.delete();
        }
        return file3.getAbsolutePath();
    }

    public static File A01() {
        return new File(A04(), AnonymousClass001.A0e(MSV.A00(422), ".jpeg", System.currentTimeMillis()));
    }

    public static File A07() {
        return AbstractC23881Ey.A00().CHo(null, 1475200931);
    }

    public static String A0C(String str) {
        String A0g = AnonymousClass001.A0g(A08(System.currentTimeMillis()), "_recorded", ".mp4");
        File file = new File(A03(), str);
        file.mkdirs();
        return new File(file, A0g).getPath();
    }

    public static String A0D(String str, int i, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null) {
            str = AbstractC13670mt.A06("%s_session_%s", A08(currentTimeMillis), Integer.valueOf(i));
            if (z) {
                new File(A03(), str).mkdirs();
            }
        }
        return str;
    }

    public static String A0E(String str, String str2) {
        File A022 = A02();
        A022.mkdirs();
        return new File(A022, AnonymousClass001.A0r("audio_", str, str2, System.currentTimeMillis())).getAbsolutePath();
    }

    public static void A0F() {
        A03().mkdirs();
        A04().mkdirs();
        A02().mkdirs();
        File file = A02;
        if (file == null) {
            file = AbstractC23881Ey.A00().CHo(null, 1700449719);
            A02 = file;
        }
        file.mkdirs();
        A05().mkdirs();
        InterfaceC09390do interfaceC09390do = C1Q3.A01;
        ((File) interfaceC09390do.getValue()).mkdirs();
        A06().mkdir();
        File file2 = A01;
        if (file2 == null) {
            file2 = AbstractC23881Ey.A00().AXd(null, 2066873147);
            A01 = file2;
        }
        file2.mkdir();
        File file3 = A03;
        if (file3 == null) {
            file3 = AbstractC23881Ey.A00().CHo(null, 1460857084);
            A03 = file3;
        }
        file3.mkdir();
        boolean isDirectory = A03().isDirectory();
        boolean isDirectory2 = A04().isDirectory();
        boolean isDirectory3 = A02().isDirectory();
        boolean isDirectory4 = ((File) interfaceC09390do.getValue()).isDirectory();
        File file4 = A03;
        if (file4 == null) {
            file4 = AbstractC23881Ey.A00().CHo(null, 1460857084);
            A03 = file4;
        }
        boolean isDirectory5 = file4.isDirectory();
        if (isDirectory && isDirectory2 && isDirectory3 && isDirectory4 && isDirectory5) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(isDirectory);
        String A062 = AbstractC13670mt.A06("clips:%s covers:%s audio:%s renderedVideo:%s assetsInternal:%s", valueOf, valueOf, Boolean.valueOf(isDirectory3), Boolean.valueOf(isDirectory4), Boolean.valueOf(isDirectory5));
        C0w9.A03("create_video_dirs", A062);
        throw new IllegalStateException(AnonymousClass001.A0R("Could not create video directories. reason:", A062));
    }

    public static void A0G(String str) {
        File file = new File(A03(), str);
        if (file.isDirectory()) {
            C14120nc.A00().ATO(new C45704KLh(file));
        }
    }
}
