package X;

import android.text.TextUtils;
import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.HTTPResponseHandler;
import com.facebook.proxygen.ReadBuffer;
import com.facebook.proxygen.RequestStatsObserver;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;

/* renamed from: X.Szb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64119Szb implements HTTPResponseHandler {
    public C61030Rdy A01;
    public InterfaceC65592TnX A02;
    public final C1Bs A04;
    public final C23301Br A05;
    public final ReadBuffer A06;
    public final RequestStatsObserver A07;
    public final C1QW A08;
    public final C62685SLz A09;
    public final SQ7 A0A;
    public final LightweightQuickPerformanceLogger A0B;
    public final C18240vB A0C;
    public int A00 = 0;
    public Map A03 = AbstractC166987dD.A1G();

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public final void onResponse(int i, String str, Header[] headerArr) {
        String str2 = str;
        long currentMonotonicTimestampNanos = this.A0B.currentMonotonicTimestampNanos();
        if (str == null) {
            str2 = "empty";
        }
        this.A0C.ATO(new C60913RbS(this, str2, headerArr, i, currentMonotonicTimestampNanos));
    }

    public static void A01(C64119Szb c64119Szb, Map map) {
        String A1A = AbstractC166987dD.A1A(TraceFieldType.NewSession, map);
        if (A1A != null) {
            SQ7 sq7 = c64119Szb.A0A;
            C1QW c1qw = c64119Szb.A08;
            sq7.A04(c1qw, "liger_new_session", A1A);
            String A1A2 = AbstractC166987dD.A1A(TraceFieldType.DNSCacheHit, map);
            if (A1A2 != null) {
                sq7.A05(c1qw, "dns_persistent_cache_hit", A1A2.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION));
            }
            String A1A3 = AbstractC166987dD.A1A(TraceFieldType.VerificationImpl, map);
            if (A1A3 != null) {
                sq7.A05(c1qw, "tls_session_resumed", A1A3.equals(""));
            }
            c64119Szb.A02(map, TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyStart);
            c64119Szb.A02(map, TraceFieldType.CertificateVerifyEnd, TraceFieldType.CertificateVerifyEnd);
        }
        String A1A4 = AbstractC166987dD.A1A(TraceFieldType.ServerAddr, map);
        if (A1A4 != null) {
            c64119Szb.A0A.A04(c64119Szb.A08, "server_ip_address", A1A4);
        }
        String A1A5 = AbstractC166987dD.A1A(TraceFieldType.Protocol, map);
        if (!TextUtils.isEmpty(A1A5)) {
            if (A1A5.equals("hq")) {
                A1A5 = "HTTP/3";
            } else if (A1A5.equals("http/2")) {
                A1A5 = "HTTP/2";
            }
            c64119Szb.A0A.A04(c64119Szb.A08, "http_version", A1A5);
        }
        String A1A6 = AbstractC166987dD.A1A(TraceFieldType.ReqBodySize, map);
        if (A1A6 != null) {
            try {
                c64119Szb.A0A.A01(c64119Szb.A08, TraceFieldType.ReqBodySize, Integer.parseInt(A1A6));
            } catch (NumberFormatException unused) {
            }
        }
        String A1A7 = AbstractC166987dD.A1A(TraceFieldType.HTTPStreamId, map);
        if (A1A7 != null) {
            try {
                c64119Szb.A0A.A01(c64119Szb.A08, "stream_id", Integer.parseInt(A1A7));
            } catch (NumberFormatException unused2) {
            }
        }
        String A1A8 = AbstractC166987dD.A1A(TraceFieldType.IsConnectionPreconnected, map);
        if (A1A8 != null) {
            c64119Szb.A0A.A05(c64119Szb.A08, TraceFieldType.IsConnectionPreconnected, A1A8.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        }
        String A1A9 = AbstractC166987dD.A1A(TraceFieldType.RTT, map);
        if (A1A9 != null) {
            try {
                c64119Szb.A0A.A02(c64119Szb.A08, "smoothed_rtt_ms", Long.parseLong(A1A9));
            } catch (NumberFormatException unused3) {
            }
        }
        String A1A10 = AbstractC166987dD.A1A(TraceFieldType.QuicResult, map);
        if (A1A10 != null) {
            if (!A1A10.equals("lost 0-rtt") && !A1A10.equals("lost")) {
                if (A1A10.equals("error")) {
                    String A1A11 = AbstractC166987dD.A1A(TraceFieldType.Error, map);
                    if (A1A11 != null) {
                        c64119Szb.A0A.A04(c64119Szb.A08, "tcp_fallback_reason", A1A11);
                    }
                }
            }
            c64119Szb.A0A.A04(c64119Szb.A08, "tcp_fallback_reason", A1A10);
        }
        c64119Szb.A02(map, TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionStart);
        c64119Szb.A02(map, TraceFieldType.DnsResolutionEnd, TraceFieldType.DnsResolutionEnd);
        c64119Szb.A02(map, TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectStart);
        c64119Szb.A02(map, TraceFieldType.TcpConnectEnd, TraceFieldType.TcpConnectEnd);
        c64119Szb.A02(map, "handshake_start", TraceFieldType.QuicConnectStartTime);
        c64119Szb.A02(map, "handshake_end", TraceFieldType.QuicConnectEndTime);
        c64119Szb.A02(map, TraceFieldType.ConnectionAcquisitionEnd, TraceFieldType.RequestSendTime);
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public final void onBody() {
        this.A0C.ATO(new C60907RbM(this));
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public final void onEOM() {
        this.A0C.ATO(new C60908RbN(this));
    }

    @Override // com.facebook.proxygen.HTTPResponseHandler
    public final void onError(HTTPRequestError hTTPRequestError) {
        if (hTTPRequestError == null) {
            hTTPRequestError = new HTTPRequestError("Error is null", HTTPRequestError.HTTPRequestStage.Unknown, HTTPRequestError.ProxygenError.Unknown);
        }
        this.A0C.ATO(new C60909RbO(hTTPRequestError, this));
    }

    public C64119Szb(C1Bs c1Bs, C23301Br c23301Br, ReadBuffer readBuffer, RequestStatsObserver requestStatsObserver, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C1QW c1qw, InterfaceC65592TnX interfaceC65592TnX, C62685SLz c62685SLz, C18240vB c18240vB) {
        this.A0C = c18240vB;
        this.A08 = c1qw;
        this.A06 = readBuffer;
        this.A07 = requestStatsObserver;
        this.A09 = c62685SLz;
        this.A05 = c23301Br;
        this.A04 = c1Bs;
        this.A02 = interfaceC65592TnX;
        this.A0A = new SQ7(lightweightQuickPerformanceLogger);
        this.A0B = lightweightQuickPerformanceLogger;
    }

    public static ArrayList A00(Map map, Header[] headerArr) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (headerArr != null) {
            for (Header header : headerArr) {
                String name = header.getName();
                String value = header.getValue();
                AbstractC58319PtB.A1I(name, value, A1E);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (map.containsKey(name)) {
                    A1E2.addAll((Collection) map.get(name));
                }
                A1E2.add(value);
                map.put(name, A1E2);
            }
        }
        return A1E;
    }

    private void A02(Map map, String str, String str2) {
        String A1A = AbstractC166987dD.A1A(str2, map);
        if (A1A != null) {
            try {
                this.A0A.A03(this.A08, str, Long.parseLong(A1A), TimeUnit.MILLISECONDS);
            } catch (NumberFormatException unused) {
            }
        }
    }
}
