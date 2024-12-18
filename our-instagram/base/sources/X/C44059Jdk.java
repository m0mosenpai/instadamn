package X;

import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jdk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44059Jdk {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Integer A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x004f: INVOKE (r3v4 ?? I:X.Jdk), (r4 I:java.lang.String), (r5 I:int), (r6 I:long), (r8 I:boolean) DIRECT call: X.Jdk.<init>(java.lang.String, int, long, boolean):void A[Catch: all -> 0x0060, MD:(java.lang.String, int, long, boolean):void (m)] (LINE:79), block:B:19:0x004c */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0059: INVOKE (r3v1 ?? I:X.Jdk), (r4 I:java.lang.String), (r5 I:int), (r6 I:long), (r8 I:boolean) DIRECT call: X.Jdk.<init>(java.lang.String, int, long, boolean):void A[Catch: all -> 0x0060, MD:(java.lang.String, int, long, boolean):void (m), TRY_LEAVE] (LINE:89), block:B:24:0x0056 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    public static C44059Jdk A00(String str, int i) {
        C44059Jdk c44059Jdk;
        ?? c44059Jdk2;
        ?? c44059Jdk3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(AbstractC166987dD.A11(str).getAbsolutePath());
                    } finally {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception unused) {
                        }
                    }
                } catch (RuntimeException unused2) {
                    c44059Jdk = new C44059Jdk(c44059Jdk3, 0, -2L, false);
                }
            } catch (Exception unused3) {
                if (i < 6) {
                    c44059Jdk = A00(str, i + 1);
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (A01(extractMetadata)) {
                c44059Jdk = new C44059Jdk(str, -1, MY4.A01(mediaMetadataRetriever), false);
            } else if (i < 6) {
                c44059Jdk = A00(str, i + 1);
            } else {
                c44059Jdk = new C44059Jdk(str, 0, -3L, false);
                c44059Jdk.A06 = extractMetadata;
            }
        } catch (IllegalArgumentException unused4) {
            c44059Jdk = new C44059Jdk(c44059Jdk2, 0, -1L, false);
        }
        return c44059Jdk;
    }

    public static boolean A01(String str) {
        if (!"video/avc".equals(str) && !"video/mp4".equals(str) && !"video/3gpp".equals(str) && !"video/3gpp2".equals(str)) {
            return false;
        }
        return true;
    }

    public final void A03(Integer num) {
        this.A05 = num;
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((MQL) it.next()).D4u(this, num);
        }
    }

    public C44059Jdk(String str, int i, long j, boolean z) {
        this.A08 = AbstractC166987dD.A1E();
        this.A07 = "";
        Integer num = C05F.A01;
        this.A05 = num;
        this.A06 = null;
        this.A01 = i;
        this.A03 = j;
        this.A05 = num;
        this.A07 = str;
        this.A09 = z;
    }

    public final void A02() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A04;
        this.A03 = elapsedRealtime;
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((MQL) it.next()).D4o(this, elapsedRealtime);
        }
    }

    public C44059Jdk() {
        this.A08 = AbstractC166987dD.A1E();
        this.A07 = "";
        this.A05 = C05F.A01;
        this.A06 = null;
    }
}
