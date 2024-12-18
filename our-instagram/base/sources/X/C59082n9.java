package X;

import android.os.Build;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59082n9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public C59122nD A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public AtomicInteger A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final int A0L;
    public final int A0M;
    public final Handler A0N;
    public final C0JO A0O;
    public final C59102nB A0P;
    public final C59112nC A0Q;
    public final C006802i A0R;
    public final UserSession A0S;
    public final ImageUrl A0T;
    public final Integer A0U;
    public final Integer A0V;
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        if (r7.contains("se=-1") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fa, code lost:
    
        if (X.C14360o3.A0K(r16.getModuleName(), "direct_thread_shared_posts") == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020d, code lost:
    
        r10.markerAnnotate(r19, r12, "MEDIA_ID", r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A01.A00, 36321486155425289L) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f3, code lost:
    
        if (r17.A06 == true) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C59082n9 r15, X.InterfaceC11380iw r16, com.instagram.common.typedurl.directlogging.DirectImageLoggingData r17, java.lang.String r18, int r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59082n9.A04(X.2n9, X.0iw, com.instagram.common.typedurl.directlogging.DirectImageLoggingData, java.lang.String, int, long, boolean):void");
    }

    public final void A08(final String str, final long j) {
        boolean z = this.A0a;
        if (z) {
            final int i = 23410213;
            Runnable runnable = new Runnable() { // from class: X.40X
                @Override // java.lang.Runnable
                public final void run() {
                    C59082n9.this.A07(i, str, j);
                }
            };
            if (this.A0Z) {
                A05(this, runnable, 427135662);
            } else {
                runnable.run();
            }
        }
        if (this.A0Q.A00(z)) {
            final int i2 = 23399201;
            A05(this, new Runnable() { // from class: X.40X
                @Override // java.lang.Runnable
                public final void run() {
                    C59082n9.this.A07(i2, str, j);
                }
            }, 1492230029);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0JO, java.lang.Object] */
    public C59082n9(C59102nB c59102nB, C59112nC c59112nC, UserSession userSession, ImageUrl imageUrl, Integer num, Integer num2, boolean z, boolean z2) {
        String str;
        ?? obj = new Object();
        boolean z3 = false;
        this.A0K = false;
        this.A04 = 0;
        this.A05 = 0;
        this.A08 = -1L;
        this.A06 = -1L;
        this.A07 = -1L;
        this.A0J = false;
        this.A0B = C05F.A0j;
        this.A0G = false;
        this.A0A = 0;
        this.A0J = z2;
        this.A0U = num2;
        this.A0Z = c59102nB.A03;
        this.A0S = userSession;
        this.A0T = imageUrl;
        this.A0V = num;
        this.A0O = obj;
        int hashCode = imageUrl.CDP().hashCode();
        this.A0M = hashCode;
        this.A0Y = z;
        this.A0P = c59102nB;
        this.A0Q = c59112nC;
        this.A0a = c59102nB.A00(hashCode);
        if (!c59102nB.A02 && !C21A.A02()) {
            if (C21A.A02()) {
                str = "transient_analysis";
            } else {
                str = null;
            }
        } else {
            str = QuickExperimentDumperPlugin.NAME;
        }
        this.A0W = str;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0L = Long.valueOf(C18U.A01(c06090Tz, userSession, 36592275253363080L)).intValue();
        if (Build.VERSION.SDK_INT >= 34 && C18U.A06(c06090Tz, userSession, 36321889882220414L)) {
            z3 = true;
        }
        this.A0X = z3;
        this.A0N = new Handler(C1CG.A00());
        this.A0R = C006802i.A0p;
        this.A09 = new C59122nD(userSession);
    }

    public static void A01(C59082n9 c59082n9, int i, long j) {
        String str;
        Integer num = c59082n9.A0B;
        if (num == C05F.A0N) {
            A02(c59082n9, i, j);
            str = "END_RENDER";
        } else if (num == C05F.A0Y) {
            A03(c59082n9, i, j);
            str = "FALLBACK_RENDER";
        } else {
            str = "ENTER_VIEWPORT";
        }
        c59082n9.A0R.markerAnnotate(i, c59082n9.A0M, "MEDIA_STATUS_ON_ENTER_VIEW_PORT", str);
    }

    public static void A02(C59082n9 c59082n9, int i, long j) {
        C006802i c006802i = c59082n9.A0R;
        int i2 = c59082n9.A0M;
        c006802i.markerPoint(i, i2, "END_RENDER", j, TimeUnit.NANOSECONDS);
        c006802i.markerAnnotate(i, i2, "IS_VITO", c59082n9.A0K);
    }

    public static void A03(C59082n9 c59082n9, int i, long j) {
        c59082n9.A0R.markerPoint(i, c59082n9.A0M, "FALLBACK_RENDER", j, TimeUnit.NANOSECONDS);
    }

    public static void A05(final C59082n9 c59082n9, final Runnable runnable, final int i) {
        c59082n9.A0N.post(new AbstractRunnableC14200nk(i) { // from class: X.40W
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public static void A06(C59082n9 c59082n9, String str, String str2, int i, long j) {
        C006802i c006802i = c59082n9.A0R;
        int i2 = c59082n9.A0M;
        c006802i.markerStart(i, i2, j, TimeUnit.NANOSECONDS);
        if (str != null) {
            c006802i.markerAnnotate(i, i2, "LOGGING_REASON", str);
        }
        c006802i.markerAnnotate(i, i2, "MODULE", str2);
        ImageUrl imageUrl = c59082n9.A0T;
        c006802i.markerAnnotate(i, i2, "CDN_CONTENT_TYPE", imageUrl.Amf().A00);
        c006802i.markerAnnotate(i, i2, "DISK_CACHE_KEY", C25821No.A00().A0L(imageUrl));
        c006802i.markerAnnotate(i, i2, "CACHE_KEY", ((ImageCacheKey) imageUrl.AjX()).A03);
        c006802i.markerAnnotate(i, i2, "APP_STARTUP_TYPE", C1CC.A09.toString());
        c006802i.markerAnnotate(i, i2, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
    }

    public final /* synthetic */ void A07(int i, String str, long j) {
        this.A0R.markerPoint(i, this.A0M, str, j, TimeUnit.NANOSECONDS);
    }

    public static void A00(C59082n9 c59082n9, int i) {
        if (C21A.A02()) {
            String url = c59082n9.A0T.getUrl();
            int indexOf = url.indexOf(63);
            if (indexOf > 0) {
                url = url.substring(0, indexOf);
            }
            c59082n9.A0R.markerAnnotate(i, c59082n9.A0M, "URI_HASH", url.hashCode());
        }
    }
}
