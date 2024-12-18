package com.instagram.api.tigon;

import X.AbstractC001900j;
import X.AbstractC12990ll;
import X.AbstractC15660qM;
import X.AbstractC26611Qq;
import X.AbstractC54919OQu;
import X.AnonymousClass001;
import X.C09530e4;
import X.C14360o3;
import X.C1Bs;
import X.C1CQ;
import X.C1CT;
import X.C1G4;
import X.C1G5;
import X.C1G6;
import X.C1G7;
import X.C1G8;
import X.C1GD;
import X.C1QW;
import X.C1QY;
import X.C1RA;
import X.C1Rj;
import X.C1S8;
import X.C1S9;
import X.C1SH;
import X.C218914p;
import X.C23301Br;
import X.C23781El;
import X.C26511Qg;
import X.C26771Rh;
import X.C60953Rca;
import X.C9BO;
import X.InterfaceC26421Px;
import X.InterfaceC27191Tt;
import X.TFH;
import android.os.PowerManager;
import com.facebook.jni.HybridData;
import com.facebook.mobilenetwork.DomainInfoUtils;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonRequestToken;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.tigonmns.TigonMNSServiceHolder;
import com.facebook.tigon.tigonobserver.TigonObservable;
import com.facebook.tigon.tigonobserver.TigonObserverData;
import com.facebook.tigon.tigonobserver.TigonRequestAdded;
import com.facebook.tigon.tigonobserver.TigonRequestErrored;
import com.facebook.tigon.tigonobserver.TigonRequestResponse;
import com.facebook.tigon.tigonobserver.TigonRequestStarted;
import com.facebook.tigon.tigonobserver.TigonRequestSucceeded;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.react.modules.base.IgNetworkingModule;
import com.instagram.service.tigon.IGHttpPriorityContext;
import com.instagram.service.tigon.IGTigonService;
import com.instagram.service.tigon.TigonUnexpectedErrorReporter;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class TigonServiceLayer implements C1G4 {
    public static final C1G5 Companion = new Object();
    public static final String TAG = "TigonServiceLayer";
    public final CacheBehaviorLogger cacheBehaviorLogger;
    public final Executor executor;
    public final C1CQ httpPriorityCalculator;
    public final boolean invokeCallbacksFromEvb;
    public final AtomicBoolean loggedFirstFeedRequest;
    public final AtomicBoolean loggedFirstStaticRequest;
    public final AtomicBoolean loggedFirstStoriesRequest;
    public TigonObservable nativeRequestObserver;
    public final AtomicLong nextSequenceNumber;
    public final IGTigonQuickPerformanceLogger performanceLogger;
    public final PowerManager powerManager;
    public TigonObservable requestObserver;
    public final IGTigonService service;
    public final AbstractC12990ll session;
    public final C1Bs sonarProbeSamplingRate;
    public final C23301Br sonarProber;
    public final C1CT[] tigonLoggers;
    public final TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter;
    public final boolean useNewOrchestration;
    public final boolean useResponseBodyStream;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.1G6] */
    public TigonServiceLayer(Executor executor, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, CacheBehaviorLogger cacheBehaviorLogger, final C1CT[] c1ctArr, IGTigonService iGTigonService, C1CQ c1cq, C23301Br c23301Br, C1Bs c1Bs, PowerManager powerManager, boolean z, boolean z2, AbstractC12990ll abstractC12990ll, boolean z3) {
        C14360o3.A0B(executor, 1);
        C14360o3.A0B(iGTigonQuickPerformanceLogger, 2);
        C14360o3.A0B(cacheBehaviorLogger, 3);
        C14360o3.A0B(c1ctArr, 4);
        C14360o3.A0B(iGTigonService, 5);
        C14360o3.A0B(abstractC12990ll, 12);
        this.executor = executor;
        this.performanceLogger = iGTigonQuickPerformanceLogger;
        this.cacheBehaviorLogger = cacheBehaviorLogger;
        this.tigonLoggers = c1ctArr;
        this.service = iGTigonService;
        this.httpPriorityCalculator = c1cq;
        this.sonarProber = c23301Br;
        this.sonarProbeSamplingRate = c1Bs;
        this.powerManager = powerManager;
        this.useResponseBodyStream = z;
        this.invokeCallbacksFromEvb = z2;
        this.session = abstractC12990ll;
        this.useNewOrchestration = z3;
        final TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter = new TigonUnexpectedErrorReporter();
        this.tigonUnexpectedErrorReporter = tigonUnexpectedErrorReporter;
        this.loggedFirstFeedRequest = new AtomicBoolean();
        this.loggedFirstStaticRequest = new AtomicBoolean();
        this.loggedFirstStoriesRequest = new AtomicBoolean();
        this.nextSequenceNumber = new AtomicLong();
        HybridData hybridData = iGTigonService.mHybridData;
        if (hybridData != null && hybridData.isValid() && iGTigonService.isObservable()) {
            this.nativeRequestObserver = new TigonObservable(iGTigonService, false, true, executor, new C1G6[]{new C1G7(tigonUnexpectedErrorReporter, c1ctArr) { // from class: X.1G6
                public boolean A00;
                public final TigonUnexpectedErrorReporter A01;
                public final C1CT[] A02;

                private final void A00(TigonRequestErrored tigonRequestErrored) {
                    TigonRequest tigonRequest = ((TigonObserverData) tigonRequestErrored).mSentRequest;
                    if (tigonRequest == null) {
                        tigonRequest = tigonRequestErrored.submittedRequest();
                    }
                    InterfaceC74743Xi summary = tigonRequestErrored.summary();
                    TigonError error = tigonRequestErrored.error();
                    if (tigonRequest != null && summary != null && error != null) {
                        C74803Xr c74803Xr = new C74803Xr(error, summary, tigonRequest, -1, this.A00);
                        for (C1CT c1ct : this.A02) {
                            c1ct.CjD(c74803Xr);
                        }
                        return;
                    }
                    this.A01.report("IGTigonNativeObserverAdapter", "Empty value in onError");
                }

                @Override // X.C1G7
                public final void DCj(TigonRequestSucceeded tigonRequestSucceeded) {
                    C14360o3.A0B(tigonRequestSucceeded, 0);
                    TigonRequest tigonRequest = ((TigonObserverData) tigonRequestSucceeded).mSentRequest;
                    InterfaceC74743Xi summary = tigonRequestSucceeded.summary();
                    if (tigonRequest != null && summary != null) {
                        C74803Xr c74803Xr = new C74803Xr(TigonError.None, summary, tigonRequest, -1, this.A00);
                        for (C1CT c1ct : this.A02) {
                            c1ct.CjD(c74803Xr);
                        }
                        return;
                    }
                    this.A01.report("IGTigonNativeObserverAdapter", "Empty values in onEOM");
                }

                @Override // X.C1G7
                public final void DEC(TigonRequestErrored tigonRequestErrored) {
                    C14360o3.A0B(tigonRequestErrored, 0);
                    A00(tigonRequestErrored);
                }

                @Override // X.C1G7
                public final void Dgf(TigonRequestResponse tigonRequestResponse) {
                }

                @Override // X.C1G7
                public final void DoJ(TigonRequestStarted tigonRequestStarted) {
                }

                @Override // X.C1G7
                public final void E23(TigonRequestErrored tigonRequestErrored) {
                    C14360o3.A0B(tigonRequestErrored, 0);
                    A00(tigonRequestErrored);
                }

                @Override // X.C1G7
                public final void Cvo(TigonRequestAdded tigonRequestAdded) {
                    this.A00 = C1Rj.A00.get();
                }

                {
                    this.A02 = c1ctArr;
                    this.A01 = tigonUnexpectedErrorReporter;
                }
            }}, new C1G8[0]);
            this.requestObserver = new TigonObservable(iGTigonService, false, false, executor, new C1G7[]{C1GD.A00}, new C1G8[0]);
        }
    }

    public final int getBodySize(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        if (interfaceC26421Px != null) {
            return (int) interfaceC26421Px.getContentLength();
        }
        return 0;
    }

    public final String getFriendlyName(C1QY c1qy) {
        C14360o3.A0B(c1qy, 0);
        String str = c1qy.A0D;
        if (!str.equals("HttpRequest") && !str.equals(c1qy.A09.name())) {
            return str;
        }
        return AnonymousClass001.A0T(c1qy.A0E, c1qy.A09.A00, ':');
    }

    public final void logQPL(C1QW c1qw, C1QY c1qy, String str) {
        int i;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(str, 2);
        this.performanceLogger.markerStart(c1qw);
        this.performanceLogger.markerAnnotate(c1qw, "sequence_number", this.nextSequenceNumber.getAndIncrement());
        this.performanceLogger.markerAnnotate(c1qw, TraceFieldType.HTTPMethod, AbstractC26611Qq.A00(c1qw.A07));
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.performanceLogger;
        URI uri = c1qw.A09;
        iGTigonQuickPerformanceLogger.markerAnnotate(c1qw, "redacted_url", C1RA.A00(uri));
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger2 = this.performanceLogger;
        String str2 = c1qy.A09.A00;
        C14360o3.A07(str2);
        iGTigonQuickPerformanceLogger2.markerAnnotate(c1qw, "request_type", str2);
        this.performanceLogger.markerAnnotate(c1qw, "started_in_background", C218914p.A08());
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger3 = this.performanceLogger;
        String str3 = c1qy.A0E;
        if (str3 == null) {
            str3 = "undefined";
        }
        iGTigonQuickPerformanceLogger3.markerAnnotate(c1qw, "source_module", str3);
        this.performanceLogger.markerAnnotate(c1qw, "request_friendly_name", getFriendlyName(c1qy));
        this.performanceLogger.markerAnnotate(c1qw, TraceFieldType.ProxyHost, str);
        boolean z = false;
        if (c1qw.A00("X-IG-APP-START-FIRST-MEDIA-REQUEST") != null) {
            z = true;
            this.performanceLogger.setFirstMediaRequest();
        }
        this.performanceLogger.markerAnnotate(c1qw, "is_first_media_request", z);
        String host = uri.getHost();
        if (host != null && DomainInfoUtils.isIgCdnOrFnaDomainNative(host) && this.loggedFirstStaticRequest.compareAndSet(false, true)) {
            this.performanceLogger.markerAnnotate(c1qw, "is_first_static_request", true);
            this.performanceLogger.setTheFirstStaticRequestId(c1qw.hashCode());
        }
        String path = uri.getPath();
        if (path != null && (!this.loggedFirstFeedRequest.get() || !this.loggedFirstStoriesRequest.get())) {
            if (AbstractC001900j.A0a(path, "feed/timeline", false) && this.loggedFirstFeedRequest.compareAndSet(false, true)) {
                this.performanceLogger.markerAnnotate(c1qw, "is_first_feed_request", true);
                this.performanceLogger.setTheFirstFeedRequestId(c1qw.hashCode());
            } else if (AbstractC001900j.A0a(path, "feed/reels_tray", false) && this.loggedFirstStoriesRequest.compareAndSet(false, true)) {
                this.performanceLogger.markerAnnotate(c1qw, "is_first_stories_request", true);
                this.performanceLogger.setTheFirstStoryRequestId(c1qw.hashCode());
            }
        }
        PowerManager powerManager = this.powerManager;
        if (powerManager != null) {
            this.performanceLogger.markerAnnotate(c1qw, "is_interactive", powerManager.isInteractive());
            this.performanceLogger.markerAnnotate(c1qw, "is_power_save_mode", powerManager.isPowerSaveMode());
            this.performanceLogger.markerAnnotate(c1qw, "is_device_idle_mode", powerManager.isDeviceIdleMode());
        }
        C9BO c9bo = c1qy.A02;
        if (c9bo != null) {
            this.performanceLogger.markerAnnotate(c1qw, "distance_from_viewport", c9bo.A00);
            IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger4 = this.performanceLogger;
            C09530e4 c09530e4 = (C09530e4) c9bo.A01;
            int i2 = -1;
            if (c09530e4 != null) {
                i = ((Number) c09530e4.A00).intValue();
            } else {
                i = -1;
            }
            iGTigonQuickPerformanceLogger4.markerAnnotate(c1qw, "ui_graph_row", i);
            IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger5 = this.performanceLogger;
            if (c09530e4 != null) {
                i2 = ((Number) c09530e4.A01).intValue();
            }
            iGTigonQuickPerformanceLogger5.markerAnnotate(c1qw, "ui_graph_column", i2);
        }
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger6 = this.performanceLogger;
        String str4 = C26771Rh.A00().A00;
        C14360o3.A07(str4);
        iGTigonQuickPerformanceLogger6.markerAnnotate(c1qw, "current_module", str4);
        this.performanceLogger.markerAnnotate(c1qw, "is_rtc_establishing", C1Rj.A00.get());
    }

    public final ByteBuffer[] makeBodyBuffers(C1QW c1qw, int i) {
        C14360o3.A0B(c1qw, 0);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        ByteBuffer[] byteBufferArr = null;
        if (interfaceC26421Px != null) {
            try {
                byte[] A01 = AbstractC54919OQu.A01(interfaceC26421Px.E2i());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                allocateDirect.put(A01);
                byteBufferArr = new ByteBuffer[]{allocateDirect};
                return byteBufferArr;
            } catch (IOException unused) {
                this.tigonUnexpectedErrorReporter.report(TAG, "Error while creating ByteBuffer");
            }
        }
        return byteBufferArr;
    }

    public final TigonBodyProvider makeTigonBodyProvider(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        if (interfaceC26421Px != null) {
            return new C1SH(interfaceC26421Px, this.executor);
        }
        return null;
    }

    public final C1S9 makeTigonCallbacks(C1QW c1qw, C1QY c1qy, TigonRequest tigonRequest, C26511Qg c26511Qg, IGTigonService iGTigonService, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(tigonRequest, 2);
        C14360o3.A0B(c26511Qg, 3);
        C14360o3.A0B(iGTigonService, 4);
        C14360o3.A0B(iGTigonQuickPerformanceLogger, 5);
        C14360o3.A0B(abstractC12990ll, 6);
        if (this.invokeCallbacksFromEvb && this.useResponseBodyStream) {
            CacheBehaviorLogger cacheBehaviorLogger = this.cacheBehaviorLogger;
            C1CT[] c1ctArr = this.tigonLoggers;
            return new C1S8(this.sonarProbeSamplingRate, this.sonarProber, iGTigonService, tigonRequest, iGTigonQuickPerformanceLogger, cacheBehaviorLogger, c26511Qg, c1qw, c1qy, abstractC12990ll, c1ctArr);
        }
        CacheBehaviorLogger cacheBehaviorLogger2 = this.cacheBehaviorLogger;
        C1CT[] c1ctArr2 = this.tigonLoggers;
        return new C1S9(this.sonarProbeSamplingRate, this.sonarProber, iGTigonService, tigonRequest, iGTigonQuickPerformanceLogger, cacheBehaviorLogger2, c26511Qg, c1qw, c1qy, abstractC12990ll, c1ctArr2, this.useResponseBodyStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6 == X.C05F.A00) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[LOOP:0: B:37:0x00b2->B:39:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.tigon.iface.TigonRequest makeTigonRequest(X.C1QW r13, X.C1QY r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.tigon.TigonServiceLayer.makeTigonRequest(X.1QW, X.1QY):com.facebook.tigon.iface.TigonRequest");
    }

    public final void setupHeaders(C1QW c1qw) {
        C14360o3.A0B(c1qw, 0);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        if (interfaceC26421Px != null) {
            C23781El Ar8 = interfaceC26421Px.Ar8();
            if (Ar8 != null) {
                String str = Ar8.A00;
                C14360o3.A06(str);
                String str2 = Ar8.A01;
                C14360o3.A06(str2);
                c1qw.A01(str, str2);
            }
            C23781El Aqy = interfaceC26421Px.Aqy();
            if (Aqy != null) {
                String str3 = Aqy.A00;
                C14360o3.A06(str3);
                String str4 = Aqy.A01;
                C14360o3.A06(str4);
                c1qw.A01(str3, str4);
            }
            long contentLength = interfaceC26421Px.getContentLength();
            if (contentLength < 0) {
                c1qw.A00(IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME);
            } else {
                c1qw.A01(IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME, String.valueOf(contentLength));
            }
        }
        if (!c1qw.A02("Accept-Language")) {
            c1qw.A01("Accept-Language", AbstractC15660qM.A00());
        }
    }

    @Override // X.C1G4
    public InterfaceC27191Tt startRequest(final C1QW c1qw, final C1QY c1qy, C26511Qg c26511Qg) {
        Executor executor;
        final TigonRequestToken sendRequest;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        C09530e4 proxyHostAndPort = getProxyHostAndPort();
        String str = (String) proxyHostAndPort.A00;
        int intValue = ((Number) proxyHostAndPort.A01).intValue();
        TigonServiceHolder tigonServiceHolder = this.service.mTigonServiceHolder;
        if (tigonServiceHolder instanceof TigonMNSServiceHolder) {
            ((TigonMNSServiceHolder) tigonServiceHolder).setProxyHostAndPort(str, intValue);
        }
        validateRequestBody(c1qw, c1qy);
        logQPL(c1qw, c1qy, str);
        try {
            TigonServiceHolder tigonServiceHolder2 = this.service.mTigonServiceHolder;
            if (tigonServiceHolder2 instanceof TigonMNSServiceHolder) {
                ((TigonMNSServiceHolder) tigonServiceHolder2).validateRequestURL(c1qw.A09);
            }
            setupHeaders(c1qw);
            TigonRequest makeTigonRequest = makeTigonRequest(c1qw, c1qy);
            int bodySize = getBodySize(c1qw);
            C1S9 makeTigonCallbacks = makeTigonCallbacks(c1qw, c1qy, makeTigonRequest, c26511Qg, this.service, this.performanceLogger, this.session);
            TigonBodyProvider makeTigonBodyProvider = makeTigonBodyProvider(c1qw);
            if (this.invokeCallbacksFromEvb) {
                executor = null;
            } else {
                executor = this.executor;
            }
            if (makeTigonBodyProvider != null) {
                c26511Qg.A02(c1qw);
                this.performanceLogger.markerPoint(c1qw, "http_client_send_request");
                this.cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.TIGON_SEND_REQUEST);
                sendRequest = this.service.sendRequest(makeTigonRequest, makeTigonBodyProvider, makeTigonCallbacks, executor);
            } else {
                ByteBuffer[] makeBodyBuffers = makeBodyBuffers(c1qw, bodySize);
                c26511Qg.A02(c1qw);
                this.performanceLogger.markerPoint(c1qw, "http_client_send_request");
                this.cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.TIGON_SEND_REQUEST);
                sendRequest = this.service.sendRequest(makeTigonRequest, makeBodyBuffers, bodySize, makeTigonCallbacks, executor);
            }
            C14360o3.A07(sendRequest);
            final AbstractC12990ll abstractC12990ll = this.session;
            final C1CQ c1cq = this.httpPriorityCalculator;
            final IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.performanceLogger;
            final boolean z = this.useNewOrchestration;
            return new InterfaceC27191Tt(sendRequest, c1cq, iGTigonQuickPerformanceLogger, c1qw, c1qy, abstractC12990ll, z) { // from class: X.1Ts
                public final TigonRequestToken A00;
                public final C1CQ A01;
                public final IGTigonQuickPerformanceLogger A02;
                public final C1QW A03;
                public final C1QY A04;
                public final AbstractC12990ll A05;
                public final boolean A06;

                {
                    C14360o3.A0B(abstractC12990ll, 1);
                    C14360o3.A0B(iGTigonQuickPerformanceLogger, 6);
                    this.A05 = abstractC12990ll;
                    this.A03 = c1qw;
                    this.A04 = c1qy;
                    this.A00 = sendRequest;
                    this.A01 = c1cq;
                    this.A02 = iGTigonQuickPerformanceLogger;
                    this.A06 = z;
                }

                @Override // X.InterfaceC27201Tu
                public final void FAL(C1Ef c1Ef) {
                    TigonRequestToken tigonRequestToken;
                    C14360o3.A0B(c1Ef, 0);
                    C1CQ c1cq2 = this.A01;
                    if (c1cq2 != null) {
                        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger2 = this.A02;
                        C1QW c1qw2 = this.A03;
                        iGTigonQuickPerformanceLogger2.markerPoint(c1qw2, "http_client_update_request_priority");
                        C1QY c1qy2 = this.A04;
                        c1qy2.A01(c1Ef);
                        C09530e4 AIp = c1cq2.AIp(c1qw2, c1qy2);
                        int intValue2 = ((Number) AIp.A00).intValue();
                        boolean booleanValue = ((Boolean) AIp.A01).booleanValue();
                        if (this.A06) {
                            C106654rN c106654rN = IGHttpPriorityContext.Companion;
                            IGHttpPriorityContext A00 = C106654rN.A00(c1qy2, this.A05);
                            boolean A07 = C20150ym.A07(AbstractC20100yh.A00(2342168257760998313L));
                            A00.setEnableShadowModeOnUpdate(A07);
                            tigonRequestToken = this.A00;
                            tigonRequestToken.updateHttpPriorityContext(A00);
                            if (!A07) {
                                return;
                            }
                        } else {
                            tigonRequestToken = this.A00;
                        }
                        tigonRequestToken.changeHttpPriority(intValue2, !booleanValue);
                    }
                }

                @Override // X.InterfaceC27201Tu
                public final void cancel() {
                    this.A02.markerPoint(this.A03, "cancellation_initiated");
                    this.A00.cancel();
                }

                @Override // X.InterfaceC27201Tu
                public final int getRequestId() {
                    return this.A03.A04;
                }
            };
        } catch (IOException e) {
            return failRequest(c1qw, e, c26511Qg, this.performanceLogger);
        }
    }

    public final void validateRequestBody(C1QW c1qw, C1QY c1qy) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        InterfaceC26421Px interfaceC26421Px = c1qw.A06;
        if (interfaceC26421Px != null && Long.valueOf(interfaceC26421Px.getContentLength()).equals(0L)) {
            this.tigonUnexpectedErrorReporter.report(TAG, AnonymousClass001.A0i("Incorrect content length set on ", c1qy.A0E, c1qy.A0D, ':'));
        }
    }

    private final InterfaceC27191Tt failRequest(C1QW c1qw, IOException iOException, C26511Qg c26511Qg, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger) {
        this.tigonUnexpectedErrorReporter.report(TAG, "Request Failed while validating URL");
        this.executor.execute(new C60953Rca(iGTigonQuickPerformanceLogger, c26511Qg, c1qw, iOException));
        return new TFH(c1qw);
    }

    public final C09530e4 getProxyHostAndPort() {
        String property = System.getProperty("https.proxyHost");
        int integer = Integer.getInteger("https.proxyPort");
        if (property == null || property.length() == 0 || integer == null) {
            property = System.getProperty("http.proxyHost");
            integer = Integer.getInteger("http.proxyPort");
            if (property == null || property.length() == 0 || integer == null) {
                integer = 0;
                property = "";
            }
        }
        return new C09530e4(property, integer);
    }
}
