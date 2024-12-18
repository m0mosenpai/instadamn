package X;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.util.LruCache;
import android.util.Pair;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.directlogging.DirectImageLoggingData;
import com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1z4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43341z4 implements InterfaceC11560jF, InterfaceC43361z6 {
    public static ImagePerformanceProvider A05;
    public static boolean A06;
    public static final C43391z9 A07 = new Object();
    public final C43331z2 A01;
    public final UserSession A03;
    public final boolean A04;
    public final LruCache A00 = new LruCache(500);
    public final LruCache A02 = new LruCache(500);

    @Override // X.InterfaceC11560jF
    public final /* synthetic */ void Cji(ImageUrl imageUrl, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC11560jF
    public final /* synthetic */ void Cjj(int i, ImageUrl imageUrl) {
    }

    @Override // X.InterfaceC11560jF
    public final void Cjl(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_ENTER_DECODING_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjn(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_ENTER_DISK_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjo(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_ENTER_MEMORY_CACHE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjq(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_EXIT_DECODING_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjs(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_EXIT_DISK_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjt(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_EXIT_MEMORY_CACHE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjv(ImageUrl imageUrl, String str, String str2, int i) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null && i != 0) {
            A01.A0D = str;
            A01.A0A = Integer.valueOf(i);
            A01.A0C = str2;
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjw(ImageUrl imageUrl, final long j) {
        final C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            final long currentMonotonicTimestampNanos = A01.A0R.currentMonotonicTimestampNanos();
            boolean z = A01.A0a;
            if (z) {
                Runnable runnable = new Runnable() { // from class: X.4tg
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j2 = currentMonotonicTimestampNanos;
                        long j3 = j;
                        c59082n9.A07(23410213, "MERGED_REQUEST", j2);
                        c59082n9.A0R.markerAnnotate(23410213, c59082n9.A0M, "TIME_SINCE_TASK_CREATED", j3);
                    }
                };
                if (A01.A0Z) {
                    C59082n9.A05(A01, runnable, 427135662);
                } else {
                    runnable.run();
                }
            }
            if (A01.A0Q.A00(z)) {
                C59082n9.A05(A01, new Runnable() { // from class: X.4th
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j2 = currentMonotonicTimestampNanos;
                        long j3 = j;
                        c59082n9.A07(23399201, "MERGED_REQUEST", j2);
                        c59082n9.A0R.markerAnnotate(23399201, c59082n9.A0M, "TIME_SINCE_TASK_CREATED", j3);
                    }
                }, 1492230029);
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjx(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_FINISH_TRANSFERRING", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final /* synthetic */ void Cjy(ImageUrl imageUrl, String str, String str2) {
    }

    @Override // X.InterfaceC11560jF
    public final void Ck1(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_START_MERGING", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck2(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_START_RECEIVE_IMAGE_DATA", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final /* synthetic */ void Ck3(ImageUrl imageUrl) {
    }

    @Override // X.InterfaceC11560jF
    public final void Ck4(ImageUrl imageUrl) {
        C59082n9 A01;
        C14360o3.A0B(imageUrl, 0);
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_START_DECODING", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC43361z6
    public final void DLM(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        boolean z2;
        long j;
        PPRLoggingData pPRLoggingData;
        C14360o3.A0B(str, 6);
        if (A07.A02(this.A01, imageUrl)) {
            if (this.A04) {
                W3C A02 = A02(imageUrl);
                A02.A09 = true;
                A02.A03 = i5 / 1024;
                A02.A07 = str;
                A02.A02 = i6;
                A02.A05 = i2;
                A02.A04 = i;
                A02.A01 = i3;
                A02.A00 = i4;
                W3C.A00(A02, imageUrl);
            }
            final C59082n9 A00 = A00(this, imageUrl);
            int i7 = i5 / 1024;
            ImageLoggingData BOm = imageUrl.BOm();
            if ((BOm instanceof PPRLoggingData) && (pPRLoggingData = (PPRLoggingData) BOm) != null) {
                z2 = pPRLoggingData.A01;
            } else {
                z2 = false;
            }
            if (A00.A06 == -1) {
                Integer num = A00.A0B;
                Integer num2 = C05F.A0N;
                boolean z3 = false;
                if (num != num2) {
                    z3 = true;
                    A00.A0K = z2;
                    A00.A0B = num2;
                    A00.A03 = i7;
                    A00.A0E = str;
                    A00.A00 = i6;
                    A00.A0G = z;
                    A00.A04 = i;
                    A00.A05 = i2;
                }
                long j2 = A00.A08;
                if (j2 != -1) {
                    long now = A00.A0O.now();
                    j2 = A00.A08;
                    j = now - j2;
                } else {
                    j = 0;
                }
                A00.A07 = j;
                if (j2 != -1 && z3) {
                    boolean z4 = A00.A0a;
                    if (z4) {
                        if (A00.A0Z) {
                            final long currentMonotonicTimestampNanos = A00.A0R.currentMonotonicTimestampNanos();
                            C59082n9.A05(A00, new Runnable() { // from class: X.D1U
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C59082n9.A02(C59082n9.this, 23410213, currentMonotonicTimestampNanos);
                                }
                            }, 427135662);
                        } else {
                            C59082n9.A02(A00, 23410213, -1L);
                        }
                    }
                    if (A00.A0Q.A00(z4)) {
                        final long currentMonotonicTimestampNanos2 = A00.A0R.currentMonotonicTimestampNanos();
                        C59082n9.A05(A00, new Runnable() { // from class: X.4fy
                            @Override // java.lang.Runnable
                            public final void run() {
                                C59082n9.A02(C59082n9.this, 23399201, currentMonotonicTimestampNanos2);
                            }
                        }, 1492230029);
                    }
                }
            }
            ImagePerformanceProvider imagePerformanceProvider = A05;
            if (imagePerformanceProvider != null && A00(this, imageUrl).A0H) {
                imagePerformanceProvider.onRender(A00(this, imageUrl).A07);
                A00(this, imageUrl).A0H = false;
            }
        }
    }

    @Override // X.InterfaceC43361z6
    public final void E0Y(Rect rect, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, WeakReference weakReference) {
        boolean z;
        String str;
        PPRLoggingData pPRLoggingData;
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 3);
        if (A07.A02(this.A01, imageUrl)) {
            if (this.A04) {
                W3C A02 = A02(imageUrl);
                ImageLoggingData BOm = imageUrl.BOm();
                if ((BOm instanceof PPRLoggingData) && (pPRLoggingData = (PPRLoggingData) BOm) != null) {
                    z = pPRLoggingData.A01;
                } else {
                    z = false;
                }
                if (A02.A0A) {
                    C69658Vsz c69658Vsz = new C69658Vsz(C05F.A0N);
                    c69658Vsz.A09 = imageUrl;
                    c69658Vsz.A0A = String.valueOf(W50.A03.getAndIncrement());
                    A02.A06 = c69658Vsz;
                }
                String str2 = A02.A08;
                ContextChain contextChain = new ContextChain(null, str2, str2);
                CallerContext.A02("com.instagram.app.InstagramAppShell");
                CallerContext callerContext = new CallerContext(contextChain, "com.instagram.app.InstagramAppShell");
                C69658Vsz c69658Vsz2 = A02.A06;
                c69658Vsz2.A07 = callerContext;
                C59392ni c59392ni = c69658Vsz2.A06;
                if (c59392ni == null) {
                    c59392ni = new C59392ni();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (z) {
                    str = "vito2";
                } else {
                    str = "ig";
                }
                linkedHashMap.put("component_tag", str);
                c59392ni.A08 = linkedHashMap;
                C69658Vsz c69658Vsz3 = A02.A06;
                c69658Vsz3.A06 = c59392ni;
                A02.A0B.A01(c69658Vsz3, C05F.A01);
                A02.A0A = true;
                if (A02.A09) {
                    W3C.A00(A02, imageUrl);
                }
            }
            final C59082n9 A00 = A00(this, imageUrl);
            int height = imageUrl.getHeight();
            int width = imageUrl.getWidth();
            final String moduleName = interfaceC11380iw.getModuleName();
            if (A00.A08 == -1) {
                A00.A08 = A00.A0O.now();
                A00.A01 = height;
                A00.A02 = width;
                A00.A0H = true;
                boolean z2 = A00.A0a;
                if (z2) {
                    if (A00.A0Z) {
                        final long currentMonotonicTimestampNanos = A00.A0R.currentMonotonicTimestampNanos();
                        C59082n9.A05(A00, new Runnable() { // from class: X.AxR
                            @Override // java.lang.Runnable
                            public final void run() {
                                C59082n9 c59082n9 = C59082n9.this;
                                long j = currentMonotonicTimestampNanos;
                                C59082n9.A06(c59082n9, c59082n9.A0W, moduleName, 23410213, j);
                                C59082n9.A01(c59082n9, 23410213, j);
                                C006802i c006802i = c59082n9.A0R;
                                int i = c59082n9.A0M;
                                C59102nB c59102nB = c59082n9.A0P;
                                c006802i.markerAnnotate(23410213, i, "USER_SAMPLE_RATE", c59102nB.A01);
                                c006802i.markerAnnotate(23410213, i, "IG_FETCHED_SAMPLING_RATE", c59102nB.A00);
                                C59082n9.A00(c59082n9, 23410213);
                            }
                        }, 427135662);
                    } else {
                        C59082n9.A06(A00, A00.A0W, moduleName, 23410213, -1L);
                        C59082n9.A01(A00, 23410213, -1L);
                        C006802i c006802i = A00.A0R;
                        int i = A00.A0M;
                        C59102nB c59102nB = A00.A0P;
                        c006802i.markerAnnotate(23410213, i, "USER_SAMPLE_RATE", c59102nB.A01);
                        c006802i.markerAnnotate(23410213, i, "IG_FETCHED_SAMPLING_RATE", c59102nB.A00);
                        C59082n9.A00(A00, 23410213);
                    }
                }
                if (A00.A0Q.A00(z2)) {
                    final long currentMonotonicTimestampNanos2 = A00.A0R.currentMonotonicTimestampNanos();
                    C59082n9.A05(A00, new Runnable() { // from class: X.4fx
                        @Override // java.lang.Runnable
                        public final void run() {
                            C59082n9 c59082n9 = C59082n9.this;
                            long j = currentMonotonicTimestampNanos2;
                            c59082n9.A0R.markerPoint(23399201, c59082n9.A0M, "IMAGE_VIEW_ENTER_VIEWPORT", j, TimeUnit.NANOSECONDS);
                            C59082n9.A01(c59082n9, 23399201, j);
                            C59082n9.A00(c59082n9, 23399201);
                        }
                    }, 1492230029);
                }
            }
            ImagePerformanceProvider imagePerformanceProvider = A05;
            if (imagePerformanceProvider != null && A00(this, imageUrl).A0H) {
                imagePerformanceProvider.onEnterViewport();
            }
        }
    }

    @Override // X.InterfaceC43361z6
    public final void E0b(final Context context, final InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 2);
        C43391z9 c43391z9 = A07;
        C43331z2 c43331z2 = this.A01;
        if (c43391z9.A02(c43331z2, imageUrl)) {
            if (this.A04) {
                W3C A02 = A02(imageUrl);
                A02.A0B.A01(A02.A06, C05F.A0C);
            }
            PPRLoggingData A00 = C43391z9.A00(c43331z2, imageUrl);
            final DirectImageLoggingData directImageLoggingData = A00.A00;
            final C59082n9 A002 = A00(this, imageUrl);
            final String str = A00.A04;
            final boolean z = A00.A06;
            final Integer num = C05F.A0C;
            if (A002.A06 == -1 && A002.A08 != -1) {
                long now = A002.A0O.now() - A002.A08;
                A002.A06 = now;
                if (now >= 250) {
                    A002.A0I = true;
                }
                boolean z2 = A002.A0a;
                if (z2) {
                    if (A002.A0Z) {
                        final long currentMonotonicTimestampNanos = A002.A0R.currentMonotonicTimestampNanos();
                        C59082n9.A05(A002, new Runnable() { // from class: X.Azr
                            @Override // java.lang.Runnable
                            public final void run() {
                                C59082n9 c59082n9 = C59082n9.this;
                                InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                                String str2 = str;
                                boolean z3 = z;
                                C59082n9.A04(c59082n9, interfaceC11380iw2, directImageLoggingData, str2, 23410213, currentMonotonicTimestampNanos, z3);
                            }
                        }, 427135662);
                    } else {
                        C59082n9.A04(A002, interfaceC11380iw, directImageLoggingData, str, 23410213, -1L, z);
                    }
                }
                if (A002.A0Q.A00(z2)) {
                    final long currentMonotonicTimestampNanos2 = A002.A0R.currentMonotonicTimestampNanos();
                    C59082n9.A05(A002, new Runnable() { // from class: X.4xw
                        @Override // java.lang.Runnable
                        public final void run() {
                            C59082n9 c59082n9 = C59082n9.this;
                            InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                            String str2 = str;
                            boolean z3 = z;
                            C59082n9.A04(c59082n9, interfaceC11380iw2, directImageLoggingData, str2, 23399201, currentMonotonicTimestampNanos2, z3);
                        }
                    }, 1492230029);
                }
                if (A002.A0L > 0) {
                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.4GJ
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(7, 5, false, false);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            long j;
                            long j2;
                            Location location;
                            String str2;
                            Double d;
                            Double d2;
                            Double d3;
                            Long l;
                            Long l2;
                            Long l3;
                            Long l4;
                            Long l5;
                            C59082n9 c59082n9 = A002;
                            Context context2 = context;
                            InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                            boolean z3 = false;
                            boolean z4 = z;
                            Random random = new Random();
                            int i = c59082n9.A0L;
                            if (random.nextInt(i) == 0 && !C218914p.A08() && C1VW.isLocationEnabled(context2)) {
                                UserSession userSession = c59082n9.A0S;
                                if (C1VW.isLocationPermitted(context2, userSession, "PHOTOS_RENDER")) {
                                    Integer num2 = c59082n9.A0B;
                                    Integer num3 = C05F.A0N;
                                    boolean z5 = false;
                                    if (num2 == num3) {
                                        z5 = true;
                                    }
                                    boolean z6 = false;
                                    if (num2 == C05F.A0Y) {
                                        z6 = true;
                                    }
                                    C1BU A003 = C1BU.A00();
                                    double A01 = A003.A01();
                                    synchronized (A003) {
                                        j = A003.A02;
                                    }
                                    synchronized (A003) {
                                        j2 = A003.A03;
                                    }
                                    Pair A022 = AbstractC15820qc.A02(context2);
                                    HashMap hashMap = new HashMap();
                                    C1CY.A00().A0f(hashMap);
                                    String A03 = C108364uN.A00(AbstractC12290kX.A00).A03();
                                    C1VW c1vw = C1VW.A00;
                                    if (c1vw != null) {
                                        location = c1vw.getLastLocation(userSession, "PhotosRenderedListener");
                                    } else {
                                        location = null;
                                    }
                                    C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession);
                                    InterfaceC02590Ai A004 = A012.A00(A012.A00, "fbc_ig_image_render");
                                    if (A004.isSampled()) {
                                        if (!z5 && !z6) {
                                            str2 = "ABANDONED";
                                        } else {
                                            str2 = "SUCCESS";
                                        }
                                        A004.AAP("action", str2);
                                        A004.A9K("client_sample_rate", new Long(i));
                                        if (location != null) {
                                            d = Double.valueOf(location.getLatitude());
                                        } else {
                                            d = null;
                                        }
                                        A004.A8I("device_lat", d);
                                        if (location != null) {
                                            d2 = Double.valueOf(location.getLongitude());
                                        } else {
                                            d2 = null;
                                        }
                                        A004.A8I("device_long", d2);
                                        if (A01 != -1.0d) {
                                            d3 = Double.valueOf(A01);
                                        } else {
                                            d3 = null;
                                        }
                                        A004.A8I("estimated_bandwidth", d3);
                                        if (A01 != -1.0d) {
                                            l = Long.valueOf(j);
                                        } else {
                                            l = null;
                                        }
                                        A004.A9K("estimated_bandwidth_totalBytes_b", l);
                                        if (A01 != -1.0d) {
                                            l2 = Long.valueOf(j2);
                                        } else {
                                            l2 = null;
                                        }
                                        A004.A9K("estimated_bandwidth_totalTime_ms", l2);
                                        if (A03 == null || A03.isEmpty()) {
                                            A03 = null;
                                        }
                                        A004.AAP("hardware_address", A03);
                                        A004.A9K("image_attempted_height", new Long(c59082n9.A01));
                                        A004.A9K("image_attempted_width", new Long(c59082n9.A02));
                                        int i2 = c59082n9.A03;
                                        if (i2 > 0) {
                                            l3 = new Long(i2);
                                        } else {
                                            l3 = null;
                                        }
                                        A004.A9K("image_size_kb", l3);
                                        A004.A7v("is_ad", Boolean.valueOf(c59082n9.A0Y));
                                        A004.A7v("is_carousel", Boolean.valueOf(z4));
                                        A004.A7v("is_grid_view", false);
                                        A004.AAP("load_source", c59082n9.A0E);
                                        A004.AAP("network_params", (String) hashMap.get("network_params"));
                                        A004.AAP("network_subtype", (String) A022.second);
                                        A004.AAP(TraceFieldType.NetworkType, (String) A022.first);
                                        A004.A9K("on_screen_duration", Long.valueOf(c59082n9.A06));
                                        if (c59082n9.A0B == num3) {
                                            z3 = true;
                                        }
                                        A004.A7v("rendered", Boolean.valueOf(z3));
                                        if (z5) {
                                            l4 = Long.valueOf(c59082n9.A07);
                                        } else {
                                            l4 = null;
                                        }
                                        A004.A9K("render_latency", l4);
                                        if (c59082n9.A0F != null) {
                                            l5 = new Long(r0.get());
                                        } else {
                                            l5 = null;
                                        }
                                        A004.A9K("scan_number", l5);
                                        A004.Cht();
                                    }
                                }
                            }
                        }
                    });
                }
            }
            A002.A0F = null;
            if (A06) {
                LruCache lruCache = this.A00;
                Iterator it = lruCache.snapshot().keySet().iterator();
                while (it.hasNext()) {
                    C59082n9 c59082n9 = (C59082n9) lruCache.get(it.next());
                    if (c59082n9 != null) {
                        c59082n9.A0H = true;
                        c59082n9.A0I = true;
                    }
                }
            }
            ImagePerformanceProvider imagePerformanceProvider = A05;
            if (imagePerformanceProvider != null && A00(this, imageUrl).A0I) {
                Integer num2 = A00(this, imageUrl).A0B;
                Integer num3 = C05F.A0N;
                if (num2 == num3) {
                    imagePerformanceProvider.onLeaveViewportRendered(imageUrl);
                } else if (A00(this, imageUrl).A0B != num3) {
                    imagePerformanceProvider.onLeaveViewportUnrendered(imageUrl);
                }
                A00(this, imageUrl).A0H = false;
                A00(this, imageUrl).A0I = false;
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void EnW(ImageUrl imageUrl, String str, boolean z, boolean z2) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(str, 1);
        if (z2 && A07.A02(this.A01, imageUrl)) {
            if (this.A04) {
                W3C A02 = A02(imageUrl);
                C69658Vsz c69658Vsz = new C69658Vsz(C05F.A0N);
                c69658Vsz.A09 = imageUrl;
                c69658Vsz.A0A = String.valueOf(W50.A03.getAndIncrement());
                A02.A06 = c69658Vsz;
                A02.A0B.A00(c69658Vsz, C05F.A01);
                A02.A0A = false;
                A02.A09 = false;
                A02.A08 = str;
            }
            final C59082n9 A00 = A00(this, imageUrl);
            if (!C18U.A06(C06090Tz.A05, A00.A0S, 36322547012282686L)) {
                A00.A0B = C05F.A0C;
            }
            if (A00.A0Q.A00(A00.A0a)) {
                final long currentMonotonicTimestampNanos = A00.A0R.currentMonotonicTimestampNanos();
                C59082n9.A05(A00, new Runnable() { // from class: X.40V
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2;
                        C59082n9 c59082n9 = C59082n9.this;
                        long j = currentMonotonicTimestampNanos;
                        if (c59082n9.A0Q.A00) {
                            str2 = QuickExperimentDumperPlugin.NAME;
                        } else if (C21A.A02()) {
                            str2 = "transient_analysis";
                        } else {
                            str2 = null;
                        }
                        C59082n9.A06(c59082n9, str2, "", 23399201, j);
                    }
                }, 1492230029);
            }
        }
    }

    public static final C59082n9 A00(C43341z4 c43341z4, ImageUrl imageUrl) {
        LruCache lruCache = c43341z4.A00;
        C59082n9 c59082n9 = (C59082n9) lruCache.get(c43341z4.A03(imageUrl));
        if (c59082n9 == null) {
            PPRLoggingData A00 = C43391z9.A00(c43341z4.A01, imageUrl);
            UserSession userSession = c43341z4.A03;
            C59082n9 c59082n92 = new C59082n9(AbstractC59092nA.A00(userSession), (C59112nC) userSession.A01(C59112nC.class, new C50157MDk(userSession, 33)), userSession, imageUrl, A00.A03, A00.A02, A00.A05, A00.A07);
            lruCache.put(c43341z4.A03(imageUrl), c59082n92);
            return c59082n92;
        }
        return c59082n9;
    }

    private final C59082n9 A01(ImageUrl imageUrl) {
        return (C59082n9) this.A00.get(A03(imageUrl));
    }

    private final W3C A02(ImageUrl imageUrl) {
        LruCache lruCache = this.A02;
        W3C w3c = (W3C) lruCache.get(A03(imageUrl));
        if (w3c == null) {
            C43391z9.A00(this.A01, imageUrl);
            W3C w3c2 = new W3C(W50.A02);
            lruCache.put(A03(imageUrl), w3c2);
            return w3c2;
        }
        return w3c;
    }

    private final String A03(ImageUrl imageUrl) {
        if (C18U.A06(C06090Tz.A05, this.A03, 36317869793482383L)) {
            StringBuilder sb = new StringBuilder();
            sb.append(imageUrl.Afh());
            sb.append('_');
            sb.append(imageUrl.getWidth());
            sb.append('_');
            sb.append(imageUrl.getHeight());
            return sb.toString();
        }
        String str = ((ImageCacheKey) imageUrl.AjX()).A03;
        C14360o3.A07(str);
        return str;
    }

    public final void A04(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            if (C18U.A06(C06090Tz.A05, A01.A0S, 36322547012282686L)) {
                A01.A0B = C05F.A0C;
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjk(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_FINISH_DECODING", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjm(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_ENTER_DISK_CACHE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjp(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("ENTER_NETWORK_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjr(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("DID_EXIT_DISK_CACHE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cju(ImageUrl imageUrl) {
        C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            A01.A08("EXIT_NETWORK_QUEUE", A01.A0R.currentMonotonicTimestampNanos());
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Cjz(ImageUrl imageUrl, String str, final double d) {
        final C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            final long currentMonotonicTimestampNanos = A01.A0R.currentMonotonicTimestampNanos();
            boolean z = A01.A0a;
            if (z) {
                Runnable runnable = new Runnable() { // from class: X.4gY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j = currentMonotonicTimestampNanos;
                        double d2 = d;
                        c59082n9.A07(23410213, "DID_SEND_REQUEST", j);
                        C006802i c006802i = c59082n9.A0R;
                        int i = c59082n9.A0M;
                        c006802i.markerAnnotate(23410213, i, "BANDWIDTH_KBPS", d2);
                        c006802i.markerAnnotate(23410213, i, "TRACE_TOKEN", "Stub");
                    }
                };
                if (A01.A0Z) {
                    C59082n9.A05(A01, runnable, 427135662);
                } else {
                    runnable.run();
                }
            }
            if (A01.A0Q.A00(z)) {
                C59082n9.A05(A01, new Runnable() { // from class: X.4gZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j = currentMonotonicTimestampNanos;
                        double d2 = d;
                        c59082n9.A07(23399201, "DID_SEND_REQUEST", j);
                        C006802i c006802i = c59082n9.A0R;
                        int i = c59082n9.A0M;
                        c006802i.markerAnnotate(23399201, i, "BANDWIDTH_KBPS", d2);
                        c006802i.markerAnnotate(23399201, i, "TRACE_TOKEN", "Stub");
                    }
                }, 1492230029);
            }
        }
    }

    @Override // X.InterfaceC11560jF
    public final void Ck0(final int i, ImageUrl imageUrl) {
        final C59082n9 A01;
        if (A07.A02(this.A01, imageUrl) && (A01 = A01(imageUrl)) != null) {
            final long currentMonotonicTimestampNanos = A01.A0R.currentMonotonicTimestampNanos();
            boolean z = A01.A0a;
            if (z) {
                Runnable runnable = new Runnable() { // from class: X.4ga
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j = currentMonotonicTimestampNanos;
                        int i2 = i;
                        c59082n9.A07(23410213, "REQUEST_SENT_TO_NETWORK_INFRA", j);
                        c59082n9.A0R.markerAnnotate(23410213, c59082n9.A0M, "NETWORK_REQUEST_ID", String.valueOf(i2));
                    }
                };
                if (A01.A0Z) {
                    C59082n9.A05(A01, runnable, 427135662);
                } else {
                    runnable.run();
                }
            }
            if (A01.A0Q.A00(z)) {
                C59082n9.A05(A01, new Runnable() { // from class: X.4gb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C59082n9 c59082n9 = C59082n9.this;
                        long j = currentMonotonicTimestampNanos;
                        int i2 = i;
                        c59082n9.A07(23399201, "REQUEST_SENT_TO_NETWORK_INFRA", j);
                        c59082n9.A0R.markerAnnotate(23399201, c59082n9.A0M, "NETWORK_REQUEST_ID", String.valueOf(i2));
                    }
                }, 1492230029);
            }
        }
    }

    @Override // X.InterfaceC43361z6
    public final void DLT(InterfaceC11380iw interfaceC11380iw, EnumC82173le enumC82173le, ImageUrl imageUrl, String str, String str2, int i) {
        Integer num;
        if (A07.A02(this.A01, imageUrl)) {
            if (this.A04) {
                W3C A02 = A02(imageUrl);
                A02.A0B.A00(A02.A06, C05F.A0Y);
            }
            C59082n9 A00 = A00(this, imageUrl);
            if (enumC82173le == EnumC82173le.A02) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            A00.A0B = num;
            if (A00.A0E == null) {
                A00.A0E = str2;
            }
            boolean z = A00.A0a;
            if (z && i != 0) {
                A00.A0D = str;
                A00.A0A = Integer.valueOf(i);
            }
            if (A00.A0Q.A00(z) && i != 0) {
                A00.A0D = str;
                A00.A0A = Integer.valueOf(i);
            }
            C0K8.A0O("PhotosRenderedListener", "onImageFailToLoad: %d %s %s", Integer.valueOf(i), str, enumC82173le.name());
        }
    }

    public C43341z4(C43331z2 c43331z2, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = c43331z2;
        this.A04 = AbstractC27421Uv.A00(userSession).A0G;
    }
}
