package com.facebook.proxygen;

import X.AbstractC58318PtA;

/* loaded from: classes10.dex */
public class HTTPRequestError {
    public ProxygenError mErrCode;
    public String mErrMsg;
    public HTTPRequestStage mErrStage;

    /* loaded from: classes10.dex */
    public enum HTTPRequestStage {
        ProcessRequest,
        DNSResolution,
        TCPConnection,
        TLSSetup,
        SendRequest,
        RecvResponse,
        Unknown,
        ZeroRttSent,
        WaitingRequest,
        RecvRequest,
        SendResponse,
        Max
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    public final class ProxygenError {
        public static final ProxygenError None = AbstractC58318PtA.A0R("None", 0);
        public static final ProxygenError Message = AbstractC58318PtA.A0R("Message", 1);
        public static final ProxygenError Connect = AbstractC58318PtA.A0R("Connect", 2);
        public static final ProxygenError ConnectTimeout = AbstractC58318PtA.A0R("ConnectTimeout", 3);
        public static final ProxygenError Read = AbstractC58318PtA.A0R("Read", 4);
        public static final ProxygenError Write = AbstractC58318PtA.A0R("Write", 5);
        public static final ProxygenError Timeout = AbstractC58318PtA.A0R("Timeout", 6);
        public static final ProxygenError Handshake = AbstractC58318PtA.A0R("Handshake", 7);
        public static final ProxygenError NoServer = AbstractC58318PtA.A0R("NoServer", 8);
        public static final ProxygenError MaxRedirects = AbstractC58318PtA.A0R("MaxRedirects", 9);
        public static final ProxygenError InvalidRedirect = AbstractC58318PtA.A0R("InvalidRedirect", 10);
        public static final ProxygenError ResponseAction = AbstractC58318PtA.A0R("ResponseAction", 11);
        public static final ProxygenError MaxConnects = AbstractC58318PtA.A0R("MaxConnects", 12);
        public static final ProxygenError Dropped = AbstractC58318PtA.A0R("Dropped", 13);
        public static final ProxygenError Connection = AbstractC58318PtA.A0R("Connection", 14);
        public static final ProxygenError ConnectionReset = AbstractC58318PtA.A0R("ConnectionReset", 15);
        public static final ProxygenError ParseHeader = AbstractC58318PtA.A0R("ParseHeader", 16);
        public static final ProxygenError ParseBody = AbstractC58318PtA.A0R("ParseBody", 17);
        public static final ProxygenError EOF = AbstractC58318PtA.A0R("EOF", 18);
        public static final ProxygenError ClientRenegotiation = AbstractC58318PtA.A0R("ClientRenegotiation", 19);
        public static final ProxygenError Unknown = AbstractC58318PtA.A0R("Unknown", 20);
        public static final ProxygenError BadDecompress = AbstractC58318PtA.A0R("BadDecompress", 21);
        public static final ProxygenError SSL = AbstractC58318PtA.A0R("SSL", 22);
        public static final ProxygenError StreamAbort = AbstractC58318PtA.A0R("StreamAbort", 23);
        public static final ProxygenError StreamUnacknowledged = AbstractC58318PtA.A0R("StreamUnacknowledged", 24);
        public static final ProxygenError WriteTimeout = AbstractC58318PtA.A0R("WriteTimeout", 25);
        public static final ProxygenError AddressPrivate = AbstractC58318PtA.A0R("AddressPrivate", 26);
        public static final ProxygenError AddressFamilyNotSupported = AbstractC58318PtA.A0R("AddressFamilyNotSupported", 27);
        public static final ProxygenError DNSResolutionErr = AbstractC58318PtA.A0R("DNSResolutionErr", 28);
        public static final ProxygenError DNSNoResults = AbstractC58318PtA.A0R("DNSNoResults", 29);
        public static final ProxygenError MalformedInput = AbstractC58318PtA.A0R("MalformedInput", 30);
        public static final ProxygenError UnsupportedExpectation = AbstractC58318PtA.A0R("UnsupportedExpectation", 31);
        public static final ProxygenError MethodNotSupported = AbstractC58318PtA.A0R("MethodNotSupported", 32);
        public static final ProxygenError UnsupportedScheme = AbstractC58318PtA.A0R("UnsupportedScheme", 33);
        public static final ProxygenError Shutdown = AbstractC58318PtA.A0R("Shutdown", 34);
        public static final ProxygenError IngressStateTransition = AbstractC58318PtA.A0R("IngressStateTransition", 35);
        public static final ProxygenError ClientSilent = AbstractC58318PtA.A0R("ClientSilent", 36);
        public static final ProxygenError Canceled = AbstractC58318PtA.A0R("Canceled", 37);
        public static final ProxygenError ParseResponse = AbstractC58318PtA.A0R("ParseResponse", 38);
        public static final ProxygenError ConnRefused = AbstractC58318PtA.A0R("ConnRefused", 39);
        public static final ProxygenError DNSOtherServer = AbstractC58318PtA.A0R("DNSOtherServer", 40);
        public static final ProxygenError DNSOtherClient = AbstractC58318PtA.A0R("DNSOtherClient", 41);
        public static final ProxygenError DNSOtherCancelled = AbstractC58318PtA.A0R("DNSOtherCancelled", 42);
        public static final ProxygenError DNSshutdown = AbstractC58318PtA.A0R("DNSshutdown", 43);
        public static final ProxygenError DNSgetaddrinfo = AbstractC58318PtA.A0R("DNSgetaddrinfo", 44);
        public static final ProxygenError DNSthreadpool = AbstractC58318PtA.A0R("DNSthreadpool", 45);
        public static final ProxygenError DNSunimplemented = AbstractC58318PtA.A0R("DNSunimplemented", 46);
        public static final ProxygenError Network = AbstractC58318PtA.A0R("Network", 47);
        public static final ProxygenError Configuration = AbstractC58318PtA.A0R("Configuration", 48);
        public static final ProxygenError EarlyDataRejected = AbstractC58318PtA.A0R("EarlyDataRejected", 49);
        public static final ProxygenError EarlyDataFailed = AbstractC58318PtA.A0R("EarlyDataFailed", 50);
        public static final ProxygenError AuthRequired = AbstractC58318PtA.A0R("AuthRequired", 51);
        public static final ProxygenError Unauthorized = AbstractC58318PtA.A0R("Unauthorized", 52);
        public static final ProxygenError EgressEOMSeenOnParentStream = AbstractC58318PtA.A0R("EgressEOMSeenOnParentStream", 53);
        public static final ProxygenError TransportIsDraining = AbstractC58318PtA.A0R("TransportIsDraining", 54);
        public static final ProxygenError ParentStreamNotExist = AbstractC58318PtA.A0R("ParentStreamNotExist", 55);
        public static final ProxygenError CreatingStream = AbstractC58318PtA.A0R("CreatingStream", 56);
        public static final ProxygenError PushNotSupported = AbstractC58318PtA.A0R("PushNotSupported", 57);
        public static final ProxygenError MaxConcurrentOutgoingStreamLimitReached = AbstractC58318PtA.A0R("MaxConcurrentOutgoingStreamLimitReached", 58);
        public static final ProxygenError BadSocket = AbstractC58318PtA.A0R("BadSocket", 59);
        public static final ProxygenError DuplicatedStreamId = AbstractC58318PtA.A0R("DuplicatedStreamId", 60);
        public static final ProxygenError ClientTransactionGone = AbstractC58318PtA.A0R("ClientTransactionGone", 61);
        public static final ProxygenError NetworkSwitch = AbstractC58318PtA.A0R("NetworkSwitch", 62);
        public static final ProxygenError Forbidden = AbstractC58318PtA.A0R("Forbidden", 63);
        public static final ProxygenError InternalError = AbstractC58318PtA.A0R("InternalError", 64);
        public static final ProxygenError Max = AbstractC58318PtA.A0R("Max", 65);
        public static final /* synthetic */ ProxygenError[] $VALUES = $values();

        public static /* synthetic */ ProxygenError[] $values() {
            ProxygenError[] proxygenErrorArr = new ProxygenError[66];
            System.arraycopy(new ProxygenError[]{None, Message, Connect, ConnectTimeout, Read, Write, Timeout, Handshake, NoServer, MaxRedirects, InvalidRedirect, ResponseAction, MaxConnects, Dropped, Connection, ConnectionReset, ParseHeader, ParseBody, EOF, ClientRenegotiation, Unknown, BadDecompress, SSL, StreamAbort, StreamUnacknowledged, WriteTimeout, AddressPrivate}, 0, proxygenErrorArr, 0, 27);
            System.arraycopy(new ProxygenError[]{AddressFamilyNotSupported, DNSResolutionErr, DNSNoResults, MalformedInput, UnsupportedExpectation, MethodNotSupported, UnsupportedScheme, Shutdown, IngressStateTransition, ClientSilent, Canceled, ParseResponse, ConnRefused, DNSOtherServer, DNSOtherClient, DNSOtherCancelled, DNSshutdown, DNSgetaddrinfo, DNSthreadpool, DNSunimplemented, Network, Configuration, EarlyDataRejected, EarlyDataFailed, AuthRequired, Unauthorized, EgressEOMSeenOnParentStream}, 0, proxygenErrorArr, 27, 27);
            System.arraycopy(new ProxygenError[]{TransportIsDraining, ParentStreamNotExist, CreatingStream, PushNotSupported, MaxConcurrentOutgoingStreamLimitReached, BadSocket, DuplicatedStreamId, ClientTransactionGone, NetworkSwitch, Forbidden, InternalError, Max}, 0, proxygenErrorArr, 54, 12);
            return proxygenErrorArr;
        }

        public static ProxygenError valueOf(String str) {
            return (ProxygenError) Enum.valueOf(ProxygenError.class, str);
        }

        public static ProxygenError[] values() {
            return (ProxygenError[]) $VALUES.clone();
        }

        public ProxygenError(String str, int i) {
        }
    }

    public ProxygenError getErrCode() {
        return this.mErrCode;
    }

    public String getErrMsg() {
        return this.mErrMsg;
    }

    public HTTPRequestStage getErrStage() {
        return this.mErrStage;
    }

    public HTTPRequestError(String str, HTTPRequestStage hTTPRequestStage, ProxygenError proxygenError) {
        this.mErrMsg = str;
        this.mErrStage = hTTPRequestStage;
        this.mErrCode = proxygenError;
    }
}
