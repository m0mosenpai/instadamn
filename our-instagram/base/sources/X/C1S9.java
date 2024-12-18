package X;

import android.os.Process;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1S9, reason: invalid class name */
/* loaded from: classes.dex */
public class C1S9 implements TigonCallbacks {
    public C61038ReA A00;
    public int A01;
    public int A02;
    public int A03;
    public TigonRequest A04;
    public boolean A05;
    public boolean A06;
    public final IGTigonQuickPerformanceLogger A07;
    public final C1QW A08;
    public final Integer A09;
    public final C1Bs A0A;
    public final C23301Br A0B;
    public final TigonXplatService A0C;
    public final TigonRequest A0D;
    public final CacheBehaviorLogger A0E;
    public final C26511Qg A0F;
    public final C1QY A0G;
    public final AbstractC12990ll A0H;
    public final C18240vB A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final C1CT[] A0L;
    public static final Map A0N = AbstractC06930Yk.A06(new C09530e4("latest_rtt_ms", "latest_rtt_ms"), new C09530e4("connection_idle_duration_at_request_start_ms", "connection_idle_duration_at_request_start_ms"), new C09530e4("host_session_id", "host_session_id"), new C09530e4("smoothed_rtt_ms", TraceFieldType.RTT), new C09530e4("stream_id", TraceFieldType.HTTPStreamId), new C09530e4(TraceFieldType.StreamLossCount, TraceFieldType.StreamLossCount), new C09530e4("quic_stream_bytes_sent", TraceFieldType.StreamBytesSent), new C09530e4("quic_stream_bytes_received", TraceFieldType.StreamBytesReceived), new C09530e4("using_in_app_proxy", TraceFieldType.UsingManualProxy));
    public static final List A0M = AbstractC16960so.A1Q(TraceFieldType.ProxyHost, "quic_destination_connection_id", "tcp_fallback_reason", TraceFieldType.H3PriorityChanges);
    public static final Map A0O = AbstractC06930Yk.A06(new C09530e4(TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionStart), new C09530e4(TraceFieldType.DnsResolutionEnd, TraceFieldType.DnsResolutionEnd), new C09530e4(TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectStart), new C09530e4(TraceFieldType.TcpConnectEnd, TraceFieldType.TcpConnectEnd), new C09530e4(TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyStart), new C09530e4(TraceFieldType.CertificateVerifyEnd, TraceFieldType.CertificateVerifyEnd), new C09530e4("connection_acquisition_start", TraceFieldType.ConnectionAcquisitionStart), new C09530e4(TraceFieldType.ConnectionAcquisitionEnd, TraceFieldType.RequestSendTime));

    public C1S9(C1Bs c1Bs, C23301Br c23301Br, TigonXplatService tigonXplatService, TigonRequest tigonRequest, IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, CacheBehaviorLogger cacheBehaviorLogger, C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy, AbstractC12990ll abstractC12990ll, C1CT[] c1ctArr, boolean z) {
        Integer num;
        C14360o3.A0B(cacheBehaviorLogger, 7);
        C14360o3.A0B(c1ctArr, 8);
        this.A08 = c1qw;
        this.A0G = c1qy;
        this.A0D = tigonRequest;
        this.A0F = c26511Qg;
        this.A0C = tigonXplatService;
        this.A07 = iGTigonQuickPerformanceLogger;
        this.A0E = cacheBehaviorLogger;
        this.A0L = c1ctArr;
        this.A0B = c23301Br;
        this.A0A = c1Bs;
        this.A0K = z;
        this.A0H = abstractC12990ll;
        if (c1qy.A09 == EnumC23341Bw.CriticalAPI) {
            num = -2;
        } else {
            num = null;
        }
        this.A09 = num;
        this.A0J = new ArrayList();
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "TigonExecutor";
        this.A0I = new C18240vB(A00);
        this.A03 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0184, code lost:
    
        if (r1.equals("") == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.InterfaceC74743Xi r16) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1S9.A0E(X.3Xi):void");
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onBody(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        try {
            if (!this.A06) {
                this.A0E.markerPoint(this.A08, CacheBehaviorLogger.TIGON_RESPONSE_BODY_START);
                this.A06 = true;
            }
            this.A02 += byteBuffer.remaining();
            if (this.A0K) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                C61038ReA c61038ReA = this.A00;
                if (c61038ReA != null) {
                    synchronized (c61038ReA) {
                        c61038ReA.A03.add(bArr);
                        c61038ReA.A00 += remaining;
                        c61038ReA.notifyAll();
                    }
                }
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4096);
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), 4096);
                    allocate.limit(min);
                    byteBuffer.get(allocate.array(), 0, min);
                    this.A0F.A05(this.A08, allocate);
                    allocate.clear();
                    this.A01++;
                }
            }
        } finally {
            this.A0C.releaseBodyBuffer(byteBuffer);
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onBodyExperimental(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C14360o3.A0A(wrap);
        onBody(wrap);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onEOM(InterfaceC74743Xi interfaceC74743Xi) {
        C1Bs c1Bs;
        C14360o3.A0B(interfaceC74743Xi, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IGTigonCallbacks.onEOM", -1358048170);
        }
        try {
            C61038ReA c61038ReA = this.A00;
            if (c61038ReA != null) {
                synchronized (c61038ReA) {
                    c61038ReA.A04 = true;
                    c61038ReA.notifyAll();
                }
            }
            if (this.A0K) {
                A0G(new C29897DGl(25, interfaceC74743Xi, this));
            } else {
                A0A(interfaceC74743Xi, this);
            }
            C74803Xr A08 = A08(TigonError.None, interfaceC74743Xi);
            for (C1CT c1ct : this.A0L) {
                c1ct.CjD(A08);
            }
            C23301Br c23301Br = this.A0B;
            if (c23301Br != null && (c1Bs = this.A0A) != null) {
                c23301Br.A00(c1Bs);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-360076596);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-218088093);
            }
            throw th;
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onError(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi) {
        C14360o3.A0B(tigonError, 0);
        C14360o3.A0B(interfaceC74743Xi, 1);
        IOException iOException = new IOException(tigonError.description());
        if (this.A0K) {
            C61038ReA c61038ReA = this.A00;
            if (c61038ReA != null) {
                synchronized (c61038ReA) {
                    c61038ReA.A02 = iOException;
                    c61038ReA.notifyAll();
                }
            }
            A0G(new ME7(15, tigonError, this, iOException, interfaceC74743Xi));
        } else {
            A09(tigonError, interfaceC74743Xi, this, iOException);
        }
        C74803Xr A08 = A08(tigonError, interfaceC74743Xi);
        for (C1CT c1ct : this.A0L) {
            c1ct.CjD(A08);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.3JQ, java.lang.Object] */
    @Override // com.facebook.tigon.TigonCallbacks
    public void onResponse(C9BO c9bo) {
        C14360o3.A0B(c9bo, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("IGTigonCallbacks.onResponse", 1396341220);
        }
        try {
            Map map = (Map) c9bo.A01;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C23781El((String) entry.getKey(), (String) entry.getValue()));
            }
            CacheBehaviorLogger cacheBehaviorLogger = this.A0E;
            C1QW c1qw = this.A08;
            cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.TIGON_ON_RESPONSE);
            C26511Qg c26511Qg = this.A0F;
            int i = c9bo.A00;
            int i2 = c1qw.A04;
            ?? obj = new Object();
            obj.A01 = i;
            obj.A02 = null;
            obj.A00 = i2;
            obj.A03 = arrayList;
            c26511Qg.A00(obj, c1qw);
            this.A07.markerAnnotate(c1qw, TraceFieldType.StatusCode, i);
            if (this.A0K) {
                this.A00 = new C61038ReA();
                A0G(new C64957Tag(this));
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(286399783);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-149262503);
            }
            throw th;
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onStarted(TigonRequest tigonRequest) {
        C14360o3.A0B(tigonRequest, 0);
        this.A04 = tigonRequest;
        C1SR c1sr = (C1SR) tigonRequest.getLayerInformation(C1S2.A06);
        if (c1sr != null && (c1sr.A03 & 8) != 0) {
            this.A03 = C1CY.A00().A0Y();
        }
        this.A05 = C1Rj.A00.get();
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onWillRetry(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi) {
        Object obj;
        C14360o3.A0B(tigonError, 0);
        C14360o3.A0B(interfaceC74743Xi, 1);
        C74683Xc c74683Xc = (C74683Xc) interfaceC74743Xi.BMN(AbstractC74763Xk.A0E);
        if (c74683Xc != null) {
            A0B("retry_reason", AnonymousClass001.A0T(AnonymousClass001.A0E(tigonError.errorDomain, '[', ']'), tigonError.analyticsDetail, ' '));
            A0B("retry_category", c74683Xc.A02);
            this.A07.markerPoint(this.A08, AnonymousClass001.A0O("tigon_send_request_retry_", c74683Xc.A00 + 1));
        }
        C74703Xe c74703Xe = (C74703Xe) interfaceC74743Xi.BMN(AbstractC74763Xk.A04);
        if (c74703Xe != null && (obj = c74703Xe.A01.get(TraceFieldType.ServerAddr)) != null) {
            this.A0J.add(obj);
        }
        C74803Xr A08 = A08(tigonError, interfaceC74743Xi);
        for (C1CT c1ct : this.A0L) {
            c1ct.CjD(A08);
        }
    }

    private final C74803Xr A08(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi) {
        TigonRequest tigonRequest = this.A04;
        if (tigonRequest == null) {
            tigonRequest = this.A0D;
        }
        return new C74803Xr(tigonError, interfaceC74743Xi, tigonRequest, this.A03, this.A05);
    }

    public static final void A09(TigonError tigonError, InterfaceC74743Xi interfaceC74743Xi, C1S9 c1s9, IOException iOException) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger;
        short s;
        CacheBehaviorLogger cacheBehaviorLogger = c1s9.A0E;
        C1QW c1qw = c1s9.A08;
        cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.TIGON_FAIL);
        c1s9.A0F.A04(c1qw, iOException);
        c1s9.A0E(interfaceC74743Xi);
        if (tigonError.category == TigonErrorCode.CANCEL) {
            iGTigonQuickPerformanceLogger = c1s9.A07;
            s = 4;
        } else {
            c1s9.A0B(TraceFieldType.FailureReason, AnonymousClass001.A0T(AnonymousClass001.A0E(tigonError.errorDomain, '[', ']'), tigonError.analyticsDetail, ' '));
            iGTigonQuickPerformanceLogger = c1s9.A07;
            s = 3;
        }
        iGTigonQuickPerformanceLogger.markerEnd(c1qw, s);
        cacheBehaviorLogger.markerEnd(c1qw, s);
    }

    public static final void A0A(InterfaceC74743Xi interfaceC74743Xi, C1S9 c1s9) {
        CacheBehaviorLogger cacheBehaviorLogger = c1s9.A0E;
        C1QW c1qw = c1s9.A08;
        cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.TIGON_SUCCESS);
        c1s9.A0F.A03(c1qw);
        c1s9.A0E(interfaceC74743Xi);
        c1s9.A07.markerEnd(c1qw, (short) 2);
        cacheBehaviorLogger.markerAnnotate(c1qw, CacheBehaviorLogger.SOURCE, "network");
        cacheBehaviorLogger.markerEnd(c1qw, (short) 2);
    }

    private final void A0B(String str, String str2) {
        this.A07.markerAnnotate(this.A08, str, str2);
    }

    private final void A0C(String str, boolean z) {
        this.A07.markerAnnotate(this.A08, str, z);
    }

    public int A0D() {
        return this.A02;
    }

    public final void A0F(ByteBuffer byteBuffer) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("IGTigonCallbacks.dispatchChunk", 1069482436);
        }
        try {
            this.A0F.A05(this.A08, byteBuffer);
            this.A01++;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-121112562);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1545398571);
            }
            throw th;
        }
    }

    public final void A0G(final InterfaceC16820sZ interfaceC16820sZ) {
        this.A0I.ATO(new AbstractRunnableC14200nk() { // from class: X.1U3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(11, 3, true, true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                int threadPriority;
                int intValue;
                Integer num = C1S9.this.A09;
                InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
                if (num != null && (intValue = num.intValue()) < (threadPriority = Process.getThreadPriority(Process.myTid()))) {
                    if (Systrace.A0E(1L)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ScopedBoost priority=");
                        sb.append(num);
                        C0fO.A01(sb.toString(), 985750075);
                    }
                    Process.setThreadPriority(intValue);
                    try {
                        interfaceC16820sZ2.invoke();
                        Process.setThreadPriority(threadPriority);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(2037707189);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        Process.setThreadPriority(threadPriority);
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1678610158);
                        }
                        throw th;
                    }
                }
                interfaceC16820sZ2.invoke();
            }
        });
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onFirstByteFlushed(long j) {
        C26511Qg c26511Qg = this.A0F;
        C1QW c1qw = this.A08;
        ArrayList arrayList = c26511Qg.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onFirstByteFlushed(c1qw, j);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onLastByteAcked(long j, long j2) {
        C26511Qg c26511Qg = this.A0F;
        C1QW c1qw = this.A08;
        ArrayList arrayList = c26511Qg.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onLastByteAcked(c1qw, j2, j);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onUploadProgress(long j, long j2) {
        C26511Qg c26511Qg = this.A0F;
        C1QW c1qw = this.A08;
        ArrayList arrayList = c26511Qg.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onUploadProgress(c1qw, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onHeaderBytesReceived(long j, long j2) {
        IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger = this.A07;
        C1QW c1qw = this.A08;
        iGTigonQuickPerformanceLogger.markerPoint(c1qw, "response_headers_end");
        ArrayList arrayList = this.A0F.A03;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C19O) arrayList.get(size)).onHeaderBytesReceived(c1qw, j, j2);
            } else {
                return;
            }
        }
    }
}
