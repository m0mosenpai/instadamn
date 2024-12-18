package com.facebook.proxygen;

import X.AbstractC166987dD;
import X.AbstractC31171DnF;
import X.AbstractC72046XLm;
import X.AnonymousClass001;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class RequestStats {
    public static final Map mFlowTimeMap = Collections.unmodifiableMap(new HashMap<String, List<String>>() { // from class: com.facebook.proxygen.RequestStats.1
        {
            String[] strArr = new String[42];
            System.arraycopy(new String[]{"uri", TraceFieldType.IsSecure, TraceFieldType.StatusCode, TraceFieldType.StatusMessage, TraceFieldType.ContentType, TraceFieldType.ClientPublicAddr, TraceFieldType.ServerCluster, TraceFieldType.ServerHostEnc, TraceFieldType.ServerDatetime, TraceFieldType.LocalPort, TraceFieldType.ReqHeaderSize, TraceFieldType.ReqHeaderCompSize, TraceFieldType.ReqBodySize, TraceFieldType.RspHeaderSize, TraceFieldType.RspHeaderCompSize, TraceFieldType.RedirectLocation, TraceFieldType.NumRedirects, TraceFieldType.Protocol, TraceFieldType.FirstBodyByteFlushedRatio, TraceFieldType.LastBodyByteFlushedRatio, TraceFieldType.SecurityProtocol, TraceFieldType.FlowControlPauses, TraceFieldType.ReplaySafe, TraceFieldType.HTTPMethod, TraceFieldType.RangeRequest, TraceFieldType.RequestSendTime, TraceFieldType.TraceStringId}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{TraceFieldType.TransportReplaySafe, TraceFieldType.EvbAvgLoopTime, TraceFieldType.TripId, TraceFieldType.TimeSinceFirstHTTPClientInit, TraceFieldType.TimeSinceHTTPClientInit, TraceFieldType.NumberHTTPClientInits, TraceFieldType.PreviousNetworkType, TraceFieldType.NetworkType, TraceFieldType.HTTPResponsePriority, TraceFieldType.H3PriorityChanges, TraceFieldType.UsingManualProxy, TraceFieldType.HTTPStreamId, TraceFieldType.FirstBodyByteFlushed, TraceFieldType.LastBodyByteFlushed, TraceFieldType.ConnectionAcquisitionEnd}, 0, strArr, 27, 15);
            put(TraceEventType.RequestExchange, Arrays.asList(strArr));
            put(TraceEventType.ResponseBodyRead, Arrays.asList(TraceFieldType.RspIntvlAvg, TraceFieldType.RspIntvlStdDev, TraceFieldType.RspNumOnBody, TraceFieldType.ServerQuality, TraceFieldType.RecvToAck, TraceFieldType.RspBodyBytesTime, TraceFieldType.ServerRtx, TraceFieldType.ServerCwnd, TraceFieldType.ServerUpstreamLatency, TraceFieldType.ServerUploadLatency, TraceFieldType.ServerTotalPackets, TraceFieldType.ServerTotalPacketsLost));
            put(TraceEventType.TotalConnect, Arrays.asList(new String[0]));
            put(TraceEventType.PreConnect, Arrays.asList(TraceFieldType.NewConnection, TraceFieldType.IsWaitingForNewConn, TraceFieldType.NewConnTimeout, TraceFieldType.InFlightConns, TraceFieldType.CachedSessions, TraceFieldType.CachedActiveSessions, TraceFieldType.ConnRoutingStale, TraceFieldType.StartedQuicAsync, TraceFieldType.ConnsStarted, TraceFieldType.RequestsWaited, TraceFieldType.TotalConnsStarted, TraceFieldType.TotalRequestsWaited, TraceFieldType.SessionCacheHitType, TraceFieldType.PerDomainLimit, TraceFieldType.DynamicDomainLimitRatio, TraceFieldType.LoadBalancing, TraceFieldType.MaxConnectionRetryCount, TraceFieldType.MaxIdleHTTPSessions, TraceFieldType.MaxIdleHTTP2Sessions, TraceFieldType.StartedExtraTcp, TraceFieldType.InflightQuicConns, TraceFieldType.QuicEnabled, TraceFieldType.NewConnectionType, TraceFieldType.ConnectionAcquisitionStart));
            put(TraceEventType.DnsConnect, Arrays.asList(new String[0]));
            put(TraceEventType.DnsResolution, Arrays.asList(TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.ResolversSerialized, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.TXT, TraceFieldType.DNSProtocol, TraceFieldType.ResolvedIpAddresses));
            put(TraceEventType.DnsCache, Arrays.asList(TraceFieldType.HostName, TraceFieldType.IpAddr, TraceFieldType.Port, TraceFieldType.CanonicalName, TraceFieldType.CNameRedirects, TraceFieldType.NumberResolvers, TraceFieldType.RequestFamily, TraceFieldType.NumberAnswers, TraceFieldType.DNSCacheHit, TraceFieldType.DNSCacheHitV4, TraceFieldType.DNSCacheHitV6, TraceFieldType.DNSCacheStale, TraceFieldType.DNSCacheStaleV4, TraceFieldType.DNSCacheStaleV6, TraceFieldType.DNSCacheAgeSecs, TraceFieldType.ResolvedIpAddresses, TraceFieldType.DnsResolutionStart, TraceFieldType.DnsResolutionEnd));
            put(TraceEventType.RetryingDnsResolution, Arrays.asList(TraceFieldType.NumberDNSRetries, TraceFieldType.ResolvedSuccess));
            put(TraceEventType.TcpConnect, Arrays.asList(TraceFieldType.CachedFamily, TraceFieldType.CachedFamilyStatus, TraceFieldType.HEDrivenDns, TraceFieldType.HESerializedEvents, TraceFieldType.TcpConnectStart, TraceFieldType.TcpConnectEnd));
            put(TraceEventType.TlsSetup, Arrays.asList(TraceFieldType.TLSReused, TraceFieldType.TLSCacheHit, TraceFieldType.CipherName, TraceFieldType.TLSVersion, TraceFieldType.OpenSSLVersion, TraceFieldType.TLSCachePersistence));
            put(TraceEventType.ProxyConnect, Arrays.asList(TraceFieldType.ProxyHost, TraceFieldType.ProxyPort));
            put(TraceEventType.PostConnect, Arrays.asList(TraceFieldType.NewSession, TraceFieldType.NumWaiting, TraceFieldType.TransportType, TraceFieldType.LocalAddr, TraceFieldType.LocalPort));
            put(TraceEventType.SessionTransactions, Arrays.asList(TraceFieldType.CurrentTransactions, TraceFieldType.HistoricalMaximumTransactions, TraceFieldType.NumberTransactionsServed, TraceFieldType.StreamLimitExceeded));
            put(TraceEventType.TransportInfo, Arrays.asList(TraceFieldType.Cwnd, TraceFieldType.CwndBytes, TraceFieldType.TotalRetx, TraceFieldType.InflightPacketLoss, TraceFieldType.RTO, TraceFieldType.MSS, TraceFieldType.MTU, TraceFieldType.RcvWnd, TraceFieldType.UpstreamCapacity, TraceFieldType.QuicClientCID, TraceFieldType.RTOCount, TraceFieldType.TotalRTOCount, TraceFieldType.TotalPackets, TraceFieldType.TotalPacketsLost, TraceFieldType.QuicTransportSent, TraceFieldType.QuicTransportRecvd));
            put(TraceEventType.PostTransactionTransportInfo, Arrays.asList(TraceFieldType.RTT, TraceFieldType.RTTVar, TraceFieldType.QuicServerCID, TraceFieldType.StreamLossCount, TraceFieldType.StreamBytesSent, TraceFieldType.StreamBytesReceived));
            put(TraceEventType.ConnInfo, Arrays.asList(TraceFieldType.ConnLifeSpan, TraceFieldType.EgressBuffered, TraceFieldType.SessionType, TraceFieldType.IsConnectionPreconnected));
            put(TraceEventType.Decompression, Arrays.asList(TraceFieldType.RspBodySize, TraceFieldType.RspBodyCompSize, TraceFieldType.CompressionType, TraceFieldType.RspBodyDecompressionTime));
            put(TraceEventType.ReplaySafety, Arrays.asList(new String[0]));
            put(TraceEventType.Push, Arrays.asList(TraceFieldType.IsPushRequest, TraceFieldType.PushConnectedInFlight, TraceFieldType.PushOrphaned));
            put(TraceEventType.CertVerification, Arrays.asList(TraceFieldType.VerificationImpl, TraceFieldType.CertificateVerifyStart, TraceFieldType.CertificateVerifyEnd));
            put(TraceEventType.FizzConnect, Arrays.asList(TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHRetryUsed, TraceFieldType.FizzECHSNI, TraceFieldType.PskUses));
            put(TraceEventType.QuicConnect, Arrays.asList(TraceFieldType.QuicClientCID, TraceFieldType.QuicDNSAddrs, TraceFieldType.QuicEarlyDataEnabled, TraceFieldType.PskUses, TraceFieldType.FizzHandshakeSuccess, TraceFieldType.FizzProtocolVersion, TraceFieldType.FizzNamedGroup, TraceFieldType.FizzPskType, TraceFieldType.FizzEarlyDataType, TraceFieldType.FizzECHConfigId, TraceFieldType.FizzECHDisposition, TraceFieldType.FizzECHSNI, TraceFieldType.FizzECHRetryUsed, TraceFieldType.Error, TraceFieldType.QuicConnectStartTime, TraceFieldType.QuicConnectEndTime));
            put(TraceEventType.ConnSelector, AbstractC72046XLm.A0j(TraceFieldType.QuicResult));
            put(TraceEventType.NetworkChange, AbstractC72046XLm.A0j(TraceFieldType.NetworkChangeDetail));
            put(TraceEventType.DnsFallback, Arrays.asList(TraceFieldType.DNSFallbackOutcome, TraceFieldType.DNSFallbackReason));
            put(TraceEventType.TotalRequest, Arrays.asList(TraceFieldType.TTFB, TraceFieldType.TTLB));
        }
    });
    public TraceEvent[] mEvents;

    public static boolean isValidCodecProtocolStr(String str) {
        if (!str.equals("http/1.1") && !str.equals("http/2")) {
            return false;
        }
        return true;
    }

    public RequestStats(TraceEvent[] traceEventArr) {
        this.mEvents = traceEventArr;
    }

    public static Map getFlowTimeFieldsMap() {
        return mFlowTimeMap;
    }

    public static void joinMetaFields(Map map, Map map2, String str) {
        Object obj;
        if (map.containsKey(str)) {
            if (map2.containsKey(str)) {
                obj = AnonymousClass001.A0g(AbstractC166987dD.A1A(str, map2), ";", AbstractC166987dD.A1A(str, map));
            } else {
                obj = map.get(str);
            }
            map2.put(str, obj);
        }
    }

    public static boolean readBooleanMeta(Map map, String str, boolean z) {
        if (map.containsKey(str)) {
            if (Boolean.parseBoolean(AbstractC166987dD.A1A(str, map)) || AbstractC166987dD.A1A(str, map).equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static int readIntMeta(Map map, String str, int i) {
        if (map.containsKey(str)) {
            try {
                i = Integer.parseInt(AbstractC166987dD.A1A(str, map));
                return i;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public static long readLongMeta(Map map, String str, long j) {
        if (map.containsKey(str)) {
            try {
                j = Long.parseLong(AbstractC166987dD.A1A(str, map));
                return j;
            } catch (NumberFormatException unused) {
                return j;
            }
        }
        return j;
    }

    public static String readStrMeta(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            return AbstractC166987dD.A1A(str, map);
        }
        return str2;
    }

    public Map getCertificateVerificationData() {
        String A0g;
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        boolean z = false;
        for (TraceEvent traceEvent : this.mEvents) {
            if (traceEvent.mName.equals(TraceEventType.CertVerification)) {
                Iterator it = traceEvent.getMetaData().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(it);
                    A1G.put(A1K.getKey(), A1K.getValue());
                }
                z = true;
            } else if (!traceEvent.mName.equals(TraceEventType.QuicConnect) && !traceEvent.mName.equals(TraceEventType.TcpConnect) && !traceEvent.mName.equals(TraceEventType.PostConnect)) {
                if (traceEvent.mName.equals(TraceEventType.TlsSetup)) {
                    Map metaData = traceEvent.getMetaData();
                    String readStrMeta = readStrMeta(metaData, TraceFieldType.CipherName, "");
                    int readIntMeta = readIntMeta(metaData, TraceFieldType.TLSVersion, 0);
                    long readIntMeta2 = readIntMeta(metaData, TraceFieldType.OpenSSLVersion, 0);
                    if (!readStrMeta.equals("")) {
                        A1G.put(TraceFieldType.CipherName, readStrMeta);
                    }
                    if (readIntMeta != 0) {
                        A1G.put(TraceFieldType.TLSVersion, String.valueOf(readIntMeta));
                    }
                    if (readIntMeta2 != 0) {
                        A1G.put(TraceFieldType.OpenSSLVersion, String.valueOf(readIntMeta2));
                    }
                } else if (traceEvent.mName.equals(TraceEventType.ProxyConnect)) {
                    Map metaData2 = traceEvent.getMetaData();
                    String readStrMeta2 = readStrMeta(metaData2, TraceFieldType.ProxyHost, "");
                    int readIntMeta3 = readIntMeta(metaData2, TraceFieldType.ProxyPort, 0);
                    if (!readStrMeta2.equals("") && readIntMeta3 > 0) {
                        A0g = AnonymousClass001.A0g(readStrMeta2, ":", String.valueOf(readIntMeta3));
                        str = TraceFieldType.VerifiedProxyAddress;
                        A1G.put(str, A0g);
                    }
                }
            } else {
                Map metaData3 = traceEvent.getMetaData();
                String readStrMeta3 = readStrMeta(metaData3, TraceFieldType.ServerAddr, "");
                int readIntMeta4 = readIntMeta(metaData3, TraceFieldType.ServerPort, 0);
                if (!readStrMeta3.equals("") && readIntMeta4 > 0) {
                    A0g = AnonymousClass001.A0g(readStrMeta3, ":", String.valueOf(readIntMeta4));
                    str = TraceFieldType.VerifiedServerAddress;
                    A1G.put(str, A0g);
                }
            }
        }
        if (!z) {
            return AbstractC72046XLm.A0g(0);
        }
        return A1G;
    }

    public Map getFlowTimeData() {
        String valueOf;
        String str;
        String str2;
        HashMap A1G = AbstractC166987dD.A1G();
        for (TraceEvent traceEvent : this.mEvents) {
            Map map = mFlowTimeMap;
            if (map.containsKey(traceEvent.mName)) {
                Map metaData = traceEvent.getMetaData();
                long j = traceEvent.mStart;
                if (j != 0) {
                    long j2 = traceEvent.mEnd;
                    if (j2 != 0 && j < j2) {
                        A1G.put(traceEvent.mName, String.valueOf(j2 - j));
                    }
                }
                for (Object obj : (List) map.get(traceEvent.mName)) {
                    if (metaData.containsKey(obj)) {
                        A1G.put(obj, metaData.get(obj));
                    }
                }
                if (metaData.containsKey(TraceFieldType.ServerAddr)) {
                    A1G.put(TraceFieldType.ServerAddr, metaData.get(TraceFieldType.ServerAddr));
                    A1G.put(TraceFieldType.ServerPort, metaData.get(TraceFieldType.ServerPort));
                }
                if (metaData.containsKey(TraceFieldType.Error)) {
                    if (A1G.containsKey(TraceFieldType.ErrorStage)) {
                        str2 = AnonymousClass001.A0g(AbstractC31171DnF.A0h(TraceFieldType.ErrorStage, A1G), ";", traceEvent.mName);
                    } else {
                        str2 = traceEvent.mName;
                    }
                    A1G.put(TraceFieldType.ErrorStage, str2);
                    joinMetaFields(metaData, A1G, TraceFieldType.Error);
                    joinMetaFields(metaData, A1G, TraceFieldType.DirectionError);
                    joinMetaFields(metaData, A1G, TraceFieldType.ProxygenError);
                    joinMetaFields(metaData, A1G, TraceFieldType.CodecError);
                }
            }
            String str3 = traceEvent.mName;
            if (TraceEventType.DnsCache.equals(str3)) {
                A1G.put(TraceFieldType.DnsResolutionStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.DnsResolutionEnd;
            } else if (TraceEventType.TcpConnect.equals(str3)) {
                A1G.put(TraceFieldType.TcpConnectStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.TcpConnectEnd;
            } else if (TraceEventType.CertVerification.equals(str3)) {
                A1G.put(TraceFieldType.CertificateVerifyStart, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.CertificateVerifyEnd;
            } else if (TraceEventType.ResponseBodyRead.equals(str3)) {
                valueOf = String.valueOf(traceEvent.mEnd - traceEvent.mStart);
                str = TraceFieldType.RspBodyBytesTime;
            } else if (TraceEventType.QuicConnect.equals(str3)) {
                A1G.put(TraceFieldType.QuicConnectStartTime, String.valueOf(traceEvent.mStart));
                valueOf = String.valueOf(traceEvent.mEnd);
                str = TraceFieldType.QuicConnectEndTime;
            }
            A1G.put(str, valueOf);
        }
        return A1G;
    }

    public TraceEvent[] getTraceEvents() {
        return this.mEvents;
    }
}
