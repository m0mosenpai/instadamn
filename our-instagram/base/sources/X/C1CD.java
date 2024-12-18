package X;

import android.os.Handler;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1CD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CD implements InterfaceC11560jF {
    public static final AtomicInteger A06 = new AtomicInteger(0);
    public C1CF A00;
    public C41261vb A01;
    public InterfaceC11560jF A02;
    public final Handler A03;
    public final LightweightQuickPerformanceLogger A04;
    public final java.util.Set A05;

    public C1CD(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        this.A04 = lightweightQuickPerformanceLogger;
        this.A00 = new C1CE(false, 1);
        this.A05 = new LinkedHashSet();
        this.A03 = new Handler(C1CG.A00());
    }

    private final boolean A01(String str, final String str2) {
        boolean contains;
        if (this.A00.isEnabled()) {
            final int hashCode = str.hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (contains) {
                final long currentMonotonicTimestamp = this.A04.currentMonotonicTimestamp();
                this.A03.post(new AbstractRunnableC14200nk() { // from class: X.4he
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(720, 5, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1CD.this.A04.markerPoint(23396353, hashCode, str2, currentMonotonicTimestamp, TimeUnit.MILLISECONDS);
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC11560jF
    public final void Cji(ImageUrl imageUrl, final int i, final int i2, final int i3) {
        boolean contains;
        C14360o3.A0B(imageUrl, 0);
        if (this.A00.isEnabled()) {
            final int hashCode = imageUrl.CDP().hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (contains) {
                this.A03.post(new AbstractRunnableC14200nk() { // from class: X.4zR
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(721, 5, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = C1CD.this.A04;
                        int i4 = hashCode;
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i4, "WIDTH", i);
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i4, StatusBarModule.HEIGHT_KEY, i2);
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i4, "BYTE_SIZE", i3);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjj(int i, ImageUrl imageUrl) {
        boolean contains;
        C14360o3.A0B(imageUrl, 0);
        if (this.A00.isEnabled()) {
            int hashCode = imageUrl.CDP().hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (contains) {
                this.A03.post(new RcM(this, hashCode, i));
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjl(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_ENTER_DECODING_QUEUE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjl(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjn(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_ENTER_DISK_QUEUE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjn(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjo(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_ENTER_MEMORY_CACHE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjo(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjq(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_EXIT_DECODING_QUEUE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjq(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjs(final ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        if (A01(imageUrl.CDP(), "DID_EXIT_DISK_QUEUE")) {
            final long currentMonotonicTimestamp = this.A04.currentMonotonicTimestamp();
            this.A03.post(new AbstractRunnableC14200nk() { // from class: X.9QH
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(722, 5, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C41251va.A00().A01(imageUrl.CDP().hashCode(), "DISK", currentMonotonicTimestamp);
                }
            });
            InterfaceC11560jF interfaceC11560jF = this.A02;
            if (interfaceC11560jF != null) {
                interfaceC11560jF.Cjs(imageUrl);
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjt(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_EXIT_MEMORY_CACHE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjt(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjv(ImageUrl imageUrl, String str, String str2, int i) {
        String str3;
        boolean contains;
        C14360o3.A0B(imageUrl, 0);
        String CDP = imageUrl.CDP();
        if (str != null) {
            str3 = str.substring(0, Math.min(200, str.length()));
            C14360o3.A07(str3);
        } else {
            str3 = "No error";
        }
        A00(CDP, "NETWORK_ERROR_MESSAGE", str3);
        if (i != 0) {
            String CDP2 = imageUrl.CDP();
            if (this.A00.isEnabled()) {
                int hashCode = CDP2.hashCode();
                java.util.Set set = this.A05;
                synchronized (set) {
                    contains = set.contains(Integer.valueOf(hashCode));
                }
                if (contains) {
                    this.A03.post(new RcN(this, hashCode, i));
                }
            }
        }
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjv(imageUrl, str, str2, i);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjw(ImageUrl imageUrl, long j) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_FINISH_MERGING");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjw(imageUrl, j);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjx(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_FINISH_TRANSFERRING");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjx(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjy(ImageUrl imageUrl, final String str, final String str2) {
        boolean contains;
        C14360o3.A0B(imageUrl, 0);
        if (this.A00.isEnabled()) {
            final int hashCode = imageUrl.CDP().hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (contains) {
                final long currentMonotonicTimestamp = this.A04.currentMonotonicTimestamp();
                this.A03.post(new AbstractRunnableC14200nk() { // from class: X.4hf
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(718, 5, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1CD c1cd = C1CD.this;
                        String str3 = str;
                        String str4 = str2;
                        long j = currentMonotonicTimestamp;
                        int i = hashCode;
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c1cd.A04;
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "LOAD_SOURCE", str3);
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "END_STATUS", str4);
                        lightweightQuickPerformanceLogger.markerEnd(23396353, i, (short) 467, j, TimeUnit.MILLISECONDS);
                        c1cd.A05.remove(Integer.valueOf(i));
                        String str5 = "memory";
                        if (C14360o3.A0K(str3, "memory")) {
                            C41251va.A00().A01(i, "DISK", j);
                        }
                        int hashCode2 = str3.hashCode();
                        if (hashCode2 != -1077756671) {
                            if (hashCode2 != 3083677) {
                                if (hashCode2 == 1843485230 && str3.equals("network")) {
                                    str3 = "NETWORK";
                                }
                                C41251va.A00().A02(i, str3, j);
                            }
                            str5 = "disk";
                        }
                        if (str3.equals(str5)) {
                            str3 = "DISK";
                        }
                        C41251va.A00().A02(i, str3, j);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck1(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_START_MERGING");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Ck1(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck2(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_START_RECEIVE_IMAGE_DATA");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Ck2(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck3(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "REQUESTED_BY_PREFETCH_INFRA");
    }

    @Override // X.InterfaceC11560jF
    public final void Ck4(ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        A01(imageUrl.CDP(), "DID_START_DECODING");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Ck4(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void EnW(final ImageUrl imageUrl, final String str, final boolean z, boolean z2) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(str, 1);
        if (this.A00.isEnabled()) {
            final int hashCode = imageUrl.CDP().hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                Integer valueOf = Integer.valueOf(hashCode);
                if (!set.contains(valueOf) && this.A00.EjH(imageUrl.CDP().hashCode())) {
                    set.add(valueOf);
                    final long currentMonotonicTimestamp = this.A04.currentMonotonicTimestamp();
                    this.A03.post(new AbstractRunnableC14200nk() { // from class: X.4hd
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(717, 5, false, false);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2;
                            boolean z3;
                            String str3;
                            C1CD c1cd = C1CD.this;
                            ImageUrl imageUrl2 = imageUrl;
                            String str4 = str;
                            boolean z4 = z;
                            long j = currentMonotonicTimestamp;
                            int i = hashCode;
                            String CDP = imageUrl2.CDP();
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c1cd.A04;
                            lightweightQuickPerformanceLogger.markerStart(23396353, i, j, TimeUnit.MILLISECONDS);
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "MODULE", str4);
                            if (z4) {
                                str2 = "on-screen";
                            } else {
                                str2 = "off-screen";
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "IMAGE_PRIORITY", str2);
                            ImageLoggingData BOm = imageUrl2.BOm();
                            if (BOm != null) {
                                z3 = ((PPRLoggingData) BOm).A07;
                            } else {
                                z3 = false;
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "VIDEO_COVER", z3);
                            if (c1cd.A01 != null) {
                                String A0L = C25821No.A00().A0L(imageUrl2);
                                C14360o3.A07(A0L);
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "DISK_CACHE_KEY", A0L);
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "CACHE_KEY", ((ImageCacheKey) imageUrl2.AjX()).A03);
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "CDN_CONTENT_TYPE", imageUrl2.Amf().A00);
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "FB_TYPE", imageUrl2.B55().A00);
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "EVERSTORE_OBJECT_TYPE", imageUrl2.B2p().A00);
                            }
                            if (C21A.A02()) {
                                int A04 = AbstractC001900j.A04(CDP, '?', 0);
                                if (A04 > 0) {
                                    CDP = CDP.substring(0, A04);
                                    C14360o3.A07(CDP);
                                }
                                lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "URI_HASH", CDP.hashCode());
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "APP_STARTUP_TYPE", C1CC.A09.toString());
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
                            ImageLoggingData BOm2 = imageUrl2.BOm();
                            if (BOm2 instanceof PPRLoggingData) {
                                if (((PPRLoggingData) BOm2).A05) {
                                    str3 = "ad";
                                } else {
                                    str3 = "organic";
                                }
                            } else {
                                str3 = "unknown";
                            }
                            lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "IS_AD", str3);
                            C41251va.A00().A03("IMAGE", str4, i, j, z4);
                        }
                    });
                }
            }
        }
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.EnW(imageUrl, str, z, z2);
        }
    }

    private final void A00(String str, String str2, String str3) {
        boolean contains;
        if (this.A00.isEnabled()) {
            int hashCode = str.hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (contains) {
                this.A03.post(new RcV(this, str2, str3, hashCode));
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjz(final ImageUrl imageUrl, String str, final double d) {
        boolean contains;
        if (this.A00.isEnabled()) {
            final int hashCode = imageUrl.CDP().hashCode();
            java.util.Set set = this.A05;
            synchronized (set) {
                contains = set.contains(Integer.valueOf(hashCode));
            }
            if (!contains) {
                final long currentMonotonicTimestamp = this.A04.currentMonotonicTimestamp();
                this.A03.post(new AbstractRunnableC14200nk() { // from class: X.4hL
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(723, 5, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C1CD c1cd = C1CD.this;
                        ImageUrl imageUrl2 = imageUrl;
                        double d2 = d;
                        long j = currentMonotonicTimestamp;
                        int i = hashCode;
                        int incrementAndGet = C1CD.A06.incrementAndGet();
                        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c1cd.A04;
                        lightweightQuickPerformanceLogger.markerPoint(23396353, i, "DID_SEND_REQUEST", j, TimeUnit.MILLISECONDS);
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "BANDWIDTH_KBPS", d2);
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "TRACE_TOKEN", "Stub");
                        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "NETWORK_REQUEST_NUMBER", incrementAndGet);
                        C41251va.A00().A01(imageUrl2.CDP().hashCode(), "NETWORK", j);
                    }
                });
            }
        }
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjz(imageUrl, "Stub", d);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjk(ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "DID_FINISH_DECODING");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjk(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjm(ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "DID_ENTER_DISK_CACHE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjm(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjp(ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "DID_ENTER_NETWORK_QUEUE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjp(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjr(ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "DID_EXIT_DISK_CACHE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjr(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cju(ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "DID_EXIT_NETWORK_QUEUE");
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cju(imageUrl);
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck0(int i, ImageUrl imageUrl) {
        A01(imageUrl.CDP(), "REQUEST_SENT_TO_NETWORK_INFRA");
        A00(imageUrl.CDP(), "NETWORK_REQUEST_ID", String.valueOf(i));
        InterfaceC11560jF interfaceC11560jF = this.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Ck0(i, imageUrl);
        }
    }
}
