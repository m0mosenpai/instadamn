package X;

import android.content.Context;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.EnumSet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Sgt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63293Sgt {
    public SMU A00;
    public SHX A01;
    public String A02;
    public InetAddress A03;
    public InetAddress A04;
    public Socket A05;
    public boolean A06;
    public final Context A07;
    public final RealtimeSinceBootClock A08;
    public final C63306ShC A09;
    public final SHW A0A;
    public final SLi A0B;
    public final C62619SJc A0C;
    public final C4ME A0D;
    public final String A0E;
    public final ScheduledExecutorService A0F;
    public final C4N2 A0G;
    public volatile SBZ A0H;
    public volatile SOJ A0I;
    public volatile boolean A0J = false;

    public static AssertionError A01(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1840));
        sb.append(obj);
        return new AssertionError(sb.toString());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02ba A[Catch: all -> 0x034b, TryCatch #0 {, blocks: (B:11:0x002d, B:12:0x0036, B:13:0x0039, B:14:0x004e, B:16:0x02ba, B:17:0x02c9, B:19:0x02cd, B:20:0x02eb, B:22:0x0314, B:27:0x0055, B:29:0x0059, B:31:0x006a, B:32:0x00ba, B:36:0x00a1, B:37:0x0323, B:110:0x034a, B:39:0x00c1, B:41:0x00c5, B:42:0x00d9, B:44:0x00df, B:46:0x00f2, B:47:0x010b, B:49:0x0111, B:51:0x0130, B:52:0x02b4, B:53:0x0328, B:55:0x0137, B:57:0x013b, B:58:0x0167, B:60:0x016d, B:62:0x017b, B:63:0x032d, B:65:0x0182, B:67:0x0186, B:68:0x019a, B:70:0x01a0, B:72:0x01ad, B:73:0x01c6, B:75:0x01cc, B:77:0x01e0, B:78:0x0332, B:80:0x01e7, B:82:0x01eb, B:84:0x0337, B:86:0x020b, B:88:0x020f, B:89:0x033c, B:91:0x0231, B:93:0x0235, B:94:0x0341, B:96:0x0242, B:97:0x0252, B:99:0x0264, B:101:0x0276, B:102:0x027a, B:105:0x0288, B:107:0x02a3, B:108:0x02aa, B:109:0x0346), top: B:10:0x002d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cd A[Catch: all -> 0x034b, TryCatch #0 {, blocks: (B:11:0x002d, B:12:0x0036, B:13:0x0039, B:14:0x004e, B:16:0x02ba, B:17:0x02c9, B:19:0x02cd, B:20:0x02eb, B:22:0x0314, B:27:0x0055, B:29:0x0059, B:31:0x006a, B:32:0x00ba, B:36:0x00a1, B:37:0x0323, B:110:0x034a, B:39:0x00c1, B:41:0x00c5, B:42:0x00d9, B:44:0x00df, B:46:0x00f2, B:47:0x010b, B:49:0x0111, B:51:0x0130, B:52:0x02b4, B:53:0x0328, B:55:0x0137, B:57:0x013b, B:58:0x0167, B:60:0x016d, B:62:0x017b, B:63:0x032d, B:65:0x0182, B:67:0x0186, B:68:0x019a, B:70:0x01a0, B:72:0x01ad, B:73:0x01c6, B:75:0x01cc, B:77:0x01e0, B:78:0x0332, B:80:0x01e7, B:82:0x01eb, B:84:0x0337, B:86:0x020b, B:88:0x020f, B:89:0x033c, B:91:0x0231, B:93:0x0235, B:94:0x0341, B:96:0x0242, B:97:0x0252, B:99:0x0264, B:101:0x0276, B:102:0x027a, B:105:0x0288, B:107:0x02a3, B:108:0x02aa, B:109:0x0346), top: B:10:0x002d, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0314 A[Catch: all -> 0x034b, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x002d, B:12:0x0036, B:13:0x0039, B:14:0x004e, B:16:0x02ba, B:17:0x02c9, B:19:0x02cd, B:20:0x02eb, B:22:0x0314, B:27:0x0055, B:29:0x0059, B:31:0x006a, B:32:0x00ba, B:36:0x00a1, B:37:0x0323, B:110:0x034a, B:39:0x00c1, B:41:0x00c5, B:42:0x00d9, B:44:0x00df, B:46:0x00f2, B:47:0x010b, B:49:0x0111, B:51:0x0130, B:52:0x02b4, B:53:0x0328, B:55:0x0137, B:57:0x013b, B:58:0x0167, B:60:0x016d, B:62:0x017b, B:63:0x032d, B:65:0x0182, B:67:0x0186, B:68:0x019a, B:70:0x01a0, B:72:0x01ad, B:73:0x01c6, B:75:0x01cc, B:77:0x01e0, B:78:0x0332, B:80:0x01e7, B:82:0x01eb, B:84:0x0337, B:86:0x020b, B:88:0x020f, B:89:0x033c, B:91:0x0231, B:93:0x0235, B:94:0x0341, B:96:0x0242, B:97:0x0252, B:99:0x0264, B:101:0x0276, B:102:0x027a, B:105:0x0288, B:107:0x02a3, B:108:0x02aa, B:109:0x0346), top: B:10:0x002d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C63293Sgt r13, X.C62671SLj r14, X.SHX r15) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63293Sgt.A02(X.Sgt, X.SLj, X.SHX):void");
    }

    public final void A03() {
        Socket socket = this.A05;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this) {
            this.A05 = null;
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
            SOJ soj = this.A0I;
            Integer num = C05F.A0N;
            C63364SiN c63364SiN = soj.A00;
            EnumSet enumSet = C63364SiN.A0c;
            c63364SiN.A0Y = num;
        }
        this.A0I.A00();
    }

    public C63293Sgt(Context context, RealtimeSinceBootClock realtimeSinceBootClock, C4N2 c4n2, C63306ShC c63306ShC, SHW shw, SLi sLi, C62619SJc c62619SJc, C4ME c4me, String str, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A0A = shw;
        this.A09 = c63306ShC;
        this.A0C = c62619SJc;
        this.A08 = realtimeSinceBootClock;
        this.A0G = c4n2;
        this.A0F = scheduledExecutorService;
        this.A0B = sLi;
        this.A0D = c4me;
        this.A07 = context;
        this.A0E = str == null ? "android_legacy" : str;
        this.A06 = z;
    }

    public static DataOutputStream A00(C63146Sds c63146Sds, SHX shx, DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(AbstractC63236Sfo.A01(c63146Sds));
        return shx.A00;
    }
}
