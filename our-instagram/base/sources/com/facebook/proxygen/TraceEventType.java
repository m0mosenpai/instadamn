package com.facebook.proxygen;

/* loaded from: classes12.dex */
public interface TraceEventType {
    public static final String AdhocEvent = "AdhocEvent";
    public static final String CertVerification = "cert_verification";
    public static final String ConnInfo = "ConnInfo";
    public static final String ConnSelector = "ConnSelector";
    public static final String Decompression = "decompression_filter";
    public static final String DnsCache = "DNSCache";
    public static final String DnsConnect = "DNSConnect";
    public static final String DnsFallback = "DNSFallback";
    public static final String DnsResolution = "DNSResolution";
    public static final String ErrorEvent = "ErrorEvent";
    public static final String FizzConnect = "FizzConnect";
    public static final String H2MQControlStream = "H2MQControlStream";
    public static final String H2MQMessage = "H2MQMessage";
    public static final String IncomingRequestExchange = "IncomingHTTPRequestExchange";
    public static final String LiveStreamingSession = "LiveStreamingSession";
    public static final String MQTTClient = "MQTTClient";
    public static final String MQTTConnect = "MQTTConnect";
    public static final String MQTTMessage = "MQTTMessage";
    public static final String MQTTMessageStart = "MQTTMessageStart";
    public static final String NetworkChange = "network_change";
    public static final String NetworkInfo = "NetworkInfo";
    public static final String PostConnect = "PostConnect";
    public static final String PostTransactionTransportInfo = "PostTransactionTransportInfo";
    public static final String PreConnect = "PreConnect";
    public static final String ProxyConnect = "proxy_connect";
    public static final String Push = "push";
    public static final String QuicConnect = "QuicConnect";
    public static final String ReplaySafety = "ReplaySafety";
    public static final String RequestExchange = "HTTPRequestExchange";
    public static final String RequestInfo = "RequestInfo";
    public static final String ResponseBodyRead = "HTTPResponseBodyRead";
    public static final String RetryingDnsResolution = "RetryingDNSResolution";
    public static final String SessionTransactions = "SessionTransactions";
    public static final String TcpConnect = "TCPConnect";
    public static final String TigonReliableMediaSummary = "TigonReliableMediaSummary";
    public static final String TigonRequestProperties = "TigonRequestProperties";
    public static final String TlsSetup = "TLSSetup";
    public static final String TotalConnect = "TotalConnect";
    public static final String TotalRequest = "TotalRequest";
    public static final String TransportInfo = "TransportInfo";
    public static final String VideoProtocolClient = "VideoProtocolClient";
    public static final String VideoProtocolFrame = "VideoProtocolFrame";
}
