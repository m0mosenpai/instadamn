package X;

import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbwebrtc.AckPayload;
import com.facebook.fbwebrtc.AnswerAckPayload;
import com.facebook.fbwebrtc.AnswerPayload;
import com.facebook.fbwebrtc.ClientReportedEventPayload;
import com.facebook.fbwebrtc.GenericDataMessage;
import com.facebook.fbwebrtc.HangUpPayload;
import com.facebook.fbwebrtc.IceCandidatePayload;
import com.facebook.fbwebrtc.NackPayload;
import com.facebook.fbwebrtc.NotifyMediaStatePayload;
import com.facebook.fbwebrtc.OfferAckPayload;
import com.facebook.fbwebrtc.OfferNackPayload;
import com.facebook.fbwebrtc.OfferPayload;
import com.facebook.fbwebrtc.OkPayload;
import com.facebook.fbwebrtc.OtherDismissPayload;
import com.facebook.fbwebrtc.P2PSfuAllocation;
import com.facebook.fbwebrtc.PrOfferAckPayload;
import com.facebook.fbwebrtc.PranswerPayload;
import com.facebook.fbwebrtc.RingPayload;
import com.facebook.fbwebrtc.SdpNegotiatePayload;
import com.facebook.fbwebrtc.SdpUpdatePayload;
import com.facebook.fbwebrtc.StreamInfo;
import com.facebook.fbwebrtc.SwitchToMultiwayPayload;
import com.facebook.fbwebrtc.TrackInfo;
import com.facebook.fbwebrtc.VideoRequestPayload;
import com.facebook.fbwebrtc.WebrtcMessageEndpoint;
import com.facebook.fbwebrtc.WebrtcMessageHeader;
import com.facebook.fbwebrtc.WebrtcMessagePayload;
import com.facebook.fbwebrtc.multiway.AddParticipantsRequest;
import com.facebook.fbwebrtc.multiway.ApprovalRequest;
import com.facebook.fbwebrtc.multiway.AudioDuplicationDebugInfo;
import com.facebook.fbwebrtc.multiway.BweDebugInfo;
import com.facebook.fbwebrtc.multiway.ClientConditional;
import com.facebook.fbwebrtc.multiway.ClientEvent;
import com.facebook.fbwebrtc.multiway.ClientEventRequest;
import com.facebook.fbwebrtc.multiway.ClientEventResponse;
import com.facebook.fbwebrtc.multiway.ClientInfo;
import com.facebook.fbwebrtc.multiway.ClientMediaStatus;
import com.facebook.fbwebrtc.multiway.ClientMediaUpdate;
import com.facebook.fbwebrtc.multiway.ClientMediaUpdateRequest;
import com.facebook.fbwebrtc.multiway.ClientMediaUpdateResponse;
import com.facebook.fbwebrtc.multiway.ClientResult;
import com.facebook.fbwebrtc.multiway.ClientSessionInfo;
import com.facebook.fbwebrtc.multiway.ClientTrackInfo;
import com.facebook.fbwebrtc.multiway.ConferenceStateRequest;
import com.facebook.fbwebrtc.multiway.ConferenceStateResponse;
import com.facebook.fbwebrtc.multiway.ConnectRequest;
import com.facebook.fbwebrtc.multiway.ConnectResponse;
import com.facebook.fbwebrtc.multiway.DataHeader;
import com.facebook.fbwebrtc.multiway.DataMessage;
import com.facebook.fbwebrtc.multiway.DataMessageBody;
import com.facebook.fbwebrtc.multiway.DataMessageRequest;
import com.facebook.fbwebrtc.multiway.DataMessageResponse;
import com.facebook.fbwebrtc.multiway.DebugInfo;
import com.facebook.fbwebrtc.multiway.DismissRequest;
import com.facebook.fbwebrtc.multiway.DominantSpeakerInfo;
import com.facebook.fbwebrtc.multiway.DominantSpeakerNotification;
import com.facebook.fbwebrtc.multiway.E2eeData;
import com.facebook.fbwebrtc.multiway.E2eeEnforcement;
import com.facebook.fbwebrtc.multiway.EdgerayInfo;
import com.facebook.fbwebrtc.multiway.Endpoint;
import com.facebook.fbwebrtc.multiway.EndpointSettings;
import com.facebook.fbwebrtc.multiway.GroupOfUsers;
import com.facebook.fbwebrtc.multiway.HangupRequest;
import com.facebook.fbwebrtc.multiway.IceCandidate;
import com.facebook.fbwebrtc.multiway.IceCandidateRequest;
import com.facebook.fbwebrtc.multiway.JoinRequest;
import com.facebook.fbwebrtc.multiway.JoinResponse;
import com.facebook.fbwebrtc.multiway.LoggingOptions;
import com.facebook.fbwebrtc.multiway.Media;
import com.facebook.fbwebrtc.multiway.MediaDescriptionUpdate;
import com.facebook.fbwebrtc.multiway.MultipleRelaysAllocationParameters;
import com.facebook.fbwebrtc.multiway.NodeIdNotification;
import com.facebook.fbwebrtc.multiway.NotifyRequest;
import com.facebook.fbwebrtc.multiway.NotifyResponse;
import com.facebook.fbwebrtc.multiway.ParticipantState;
import com.facebook.fbwebrtc.multiway.ProductMetadata;
import com.facebook.fbwebrtc.multiway.ProxygenAllocation;
import com.facebook.fbwebrtc.multiway.ProxygenAllocationResult;
import com.facebook.fbwebrtc.multiway.ProxygenCandidate;
import com.facebook.fbwebrtc.multiway.QuickExperiment;
import com.facebook.fbwebrtc.multiway.QuickExperimentExposureLoggingEvent;
import com.facebook.fbwebrtc.multiway.QuickExperimentResult;
import com.facebook.fbwebrtc.multiway.QuickExperimentValue;
import com.facebook.fbwebrtc.multiway.ReceiveTrackDebugInfo;
import com.facebook.fbwebrtc.multiway.ReceiverBottleneck;
import com.facebook.fbwebrtc.multiway.RelayInfo;
import com.facebook.fbwebrtc.multiway.RemoveParticipantsRequest;
import com.facebook.fbwebrtc.multiway.RenderResolutionMessageFromClient;
import com.facebook.fbwebrtc.multiway.RenderResolutionMessageToClient;
import com.facebook.fbwebrtc.multiway.ResolutionData;
import com.facebook.fbwebrtc.multiway.RingRequest;
import com.facebook.fbwebrtc.multiway.RingResponse;
import com.facebook.fbwebrtc.multiway.RtcException;
import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageBodyVariant;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.fbwebrtc.multiway.RtcMultiwayMessage;
import com.facebook.fbwebrtc.multiway.RtcReceiver;
import com.facebook.fbwebrtc.multiway.RtcSender;
import com.facebook.fbwebrtc.multiway.ServerMediaUpdate;
import com.facebook.fbwebrtc.multiway.ServerMediaUpdateRequest;
import com.facebook.fbwebrtc.multiway.ServerMediaUpdateResponse;
import com.facebook.fbwebrtc.multiway.ServerOnlyParticipantState;
import com.facebook.fbwebrtc.multiway.SessionDescriptionUpdate;
import com.facebook.fbwebrtc.multiway.SfuAllocation;
import com.facebook.fbwebrtc.multiway.SignalingMessageFromClient;
import com.facebook.fbwebrtc.multiway.SignalingMessageToClient;
import com.facebook.fbwebrtc.multiway.Snapshot;
import com.facebook.fbwebrtc.multiway.SpeakerDetail;
import com.facebook.fbwebrtc.multiway.State;
import com.facebook.fbwebrtc.multiway.StateSyncTopicConfigMap;
import com.facebook.fbwebrtc.multiway.Subscription;
import com.facebook.fbwebrtc.multiway.SubscriptionMessageFromClient;
import com.facebook.fbwebrtc.multiway.SubscriptionOptions;
import com.facebook.fbwebrtc.multiway.SubscriptionRequest;
import com.facebook.fbwebrtc.multiway.SyncAck;
import com.facebook.fbwebrtc.multiway.SyncPayload;
import com.facebook.fbwebrtc.multiway.TSocketAddress;
import com.facebook.fbwebrtc.multiway.ThreadIdInfo;
import com.facebook.fbwebrtc.multiway.TopicConfiguration;
import com.facebook.fbwebrtc.multiway.TransferRequest;
import com.facebook.fbwebrtc.multiway.TurnInfo;
import com.facebook.fbwebrtc.multiway.UnsubscribeRequest;
import com.facebook.fbwebrtc.multiway.UnsubscribeResponse;
import com.facebook.fbwebrtc.multiway.UpdateRequest;
import com.facebook.fbwebrtc.multiway.UpdateResponse;
import com.facebook.fbwebrtc.multiway.UserProfile;
import com.facebook.fbwebrtc.multiway.VideoUploadInfo;
import com.facebook.fbwebrtc.multiway.VideoUploadRequest;
import com.facebook.fbwebrtc.sdp.Bandwidth;
import com.facebook.fbwebrtc.sdp.CodecDescription;
import com.facebook.fbwebrtc.sdp.CryptoParam;
import com.facebook.fbwebrtc.sdp.Extmap;
import com.facebook.fbwebrtc.sdp.IceCandidateSdp;
import com.facebook.fbwebrtc.sdp.MediaDescription;
import com.facebook.fbwebrtc.sdp.RtcpFbVal;
import com.facebook.fbwebrtc.sdp.SessionDescription;
import com.facebook.fbwebrtc.sdp.SsrcGroup;
import com.facebook.fbwebrtc.sdp.SsrcObject;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;
import com.facebook.logginginfra.falco.AppScopedIdentity;
import com.facebook.logginginfra.falco.BackendServiceIntegration;
import com.facebook.logginginfra.falco.BackendServiceSource;
import com.facebook.logginginfra.falco.Batch;
import com.facebook.logginginfra.falco.BladeRunnerIntegration;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.ClientDebugConfig;
import com.facebook.logginginfra.falco.ClientSource;
import com.facebook.logginginfra.falco.CollectionConstraint;
import com.facebook.logginginfra.falco.CollectionConstraintExpression;
import com.facebook.logginginfra.falco.CollectionConstraintNode;
import com.facebook.logginginfra.falco.EncodedData;
import com.facebook.logginginfra.falco.Event;
import com.facebook.logginginfra.falco.EventPayload;
import com.facebook.logginginfra.falco.FacebookIdentity;
import com.facebook.logginginfra.falco.FalcoContext;
import com.facebook.logginginfra.falco.FetchSamplingConfigDirective;
import com.facebook.logginginfra.falco.ForegroundSession;
import com.facebook.logginginfra.falco.FunnelEventSamplingConfig;
import com.facebook.logginginfra.falco.FunnelFullSampling;
import com.facebook.logginginfra.falco.FunnelPartialSampling;
import com.facebook.logginginfra.falco.FunnelSamplingConfig;
import com.facebook.logginginfra.falco.FunnelSamplingType;
import com.facebook.logginginfra.falco.GetClientDebugConfigDirective;
import com.facebook.logginginfra.falco.GetFalcoSamplingConfigDirective;
import com.facebook.logginginfra.falco.GetQPLConfigDirective;
import com.facebook.logginginfra.falco.Identifier;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.Integration;
import com.facebook.logginginfra.falco.Lambda;
import com.facebook.logginginfra.falco.MobileClientSource;
import com.facebook.logginginfra.falco.PartitioningKey;
import com.facebook.logginginfra.falco.PigeonEventSamplingConfig;
import com.facebook.logginginfra.falco.PigeonFullSampling;
import com.facebook.logginginfra.falco.PigeonNestDirective;
import com.facebook.logginginfra.falco.PigeonNestRequest;
import com.facebook.logginginfra.falco.PigeonNestResponse;
import com.facebook.logginginfra.falco.PigeonNestResponseDirective;
import com.facebook.logginginfra.falco.PigeonPartialSampling;
import com.facebook.logginginfra.falco.PigeonSamplingConfig;
import com.facebook.logginginfra.falco.PigeonSamplingType;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.PrivacyContext;
import com.facebook.logginginfra.falco.ProcessRequestDirective;
import com.facebook.logginginfra.falco.Proxy;
import com.facebook.logginginfra.falco.QPLCrashResiliency;
import com.facebook.logginginfra.falco.QPLEventConfig;
import com.facebook.logginginfra.falco.QPLSamplingConfig;
import com.facebook.logginginfra.falco.QPLSamplingMethod;
import com.facebook.logginginfra.falco.Request;
import com.facebook.logginginfra.falco.Response;
import com.facebook.logginginfra.falco.SamplingChecksum;
import com.facebook.logginginfra.falco.SamplingConfig;
import com.facebook.logginginfra.falco.SamplingRequest;
import com.facebook.logginginfra.falco.ScalingFactor;
import com.facebook.logginginfra.falco.Session;
import com.facebook.logginginfra.falco.SetClientDebugConfigDirective;
import com.facebook.logginginfra.falco.SetFalcoSamplingConfigDirective;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import com.facebook.logginginfra.falco.Source;
import com.facebook.logginginfra.falco.Upload;
import com.facebook.logginginfra.falco.WebClientSource;
import com.facebook.systrace.SystraceMessage;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Y3T {
    public final SL7 A00;
    public final AbstractC95034Pm A01;
    public final GeneratedHyperThriftClassLookup A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r9 != 11) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r9 == 8) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object A01(X.C72777Xmw r8, byte r9) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y3T.A01(X.Xmw, byte):java.lang.Object");
    }

    public Y3T(SL7 sl7, GeneratedHyperThriftClassLookup generatedHyperThriftClassLookup, AbstractC95034Pm abstractC95034Pm) {
        this.A02 = generatedHyperThriftClassLookup;
        this.A00 = sl7;
        this.A01 = abstractC95034Pm;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.YFy, java.lang.Object] */
    public static HyperThriftBase A00(Y3T y3t, String str) {
        C72756XmX A00;
        C72755XmW[] c72755XmWArr;
        int length;
        Object[] objArr;
        AbstractC95034Pm abstractC95034Pm;
        Map map;
        int i;
        Class cls;
        int i2;
        AbstractC09720ep A002 = SystraceMessage.A00(SystraceMessage.A00, "HyperThriftReader.parse", 4L);
        A002.A00(str, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A002.A02();
        try {
            A00 = y3t.A00.A00(str);
            c72755XmWArr = A00.A02;
            length = c72755XmWArr.length;
            objArr = new Object[length];
            abstractC95034Pm = y3t.A01;
            synchronized (A00) {
                try {
                    map = A00.A01;
                    if (map == null) {
                        if (length != 0) {
                            if (c72755XmWArr[0].A01 != null) {
                                A00.A01 = AbstractC166987dD.A1G();
                                for (C72755XmW c72755XmW : c72755XmWArr) {
                                    AbstractC72552XgM.A00(c72755XmW.A00.A00);
                                    A00.A01.put(Integer.valueOf(c72755XmW.A02), new YG0(new Object()));
                                }
                                map = A00.A01;
                            }
                        }
                        A00.A01 = Collections.emptyMap();
                        map = A00.A01;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            abstractC95034Pm.A0F(map);
            i = 0;
        } catch (Throwable th2) {
            C0fY.A00(4L, -967680909);
            throw th2;
        }
        while (true) {
            C95054Po A0B = abstractC95034Pm.A0B();
            byte b = A0B.A00;
            if (b == 0) {
                break;
            }
            short s = A0B.A03;
            synchronized (A00) {
                SparseIntArray sparseIntArray = A00.A00;
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray(length);
                    for (int i3 = 0; i3 < length; i3++) {
                        sparseIntArray.put(c72755XmWArr[i3].A02, i3);
                    }
                    A00.A00 = sparseIntArray;
                }
                i2 = sparseIntArray.get(s, -1);
            }
            if (i2 >= 0) {
                try {
                    objArr[i2] = y3t.A01(c72755XmWArr[i2].A00, b);
                } catch (C72445Xdp e) {
                    C0K8.A0M("HyperThriftReader", "Type mismatch on field.id=%d", e, Short.valueOf(s));
                }
                i++;
            }
            AbstractC72565Xgr.A00(abstractC95034Pm, b, Integer.MAX_VALUE);
            i++;
            C0fY.A00(4L, -967680909);
            throw th2;
        }
        abstractC95034Pm.A0I();
        switch (str.hashCode()) {
            case -2144978020:
                if (str.equals("com.facebook.fbwebrtc.multiway.VideoUploadInfo")) {
                    cls = VideoUploadInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -2134810486:
                if (str.equals("com.facebook.fbwebrtc.multiway.MultipleRelaysAllocationParameters")) {
                    cls = MultipleRelaysAllocationParameters.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -2091224310:
                if (str.equals("com.facebook.fbwebrtc.OtherDismissPayload")) {
                    cls = OtherDismissPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1974398968:
                if (str.equals("com.facebook.logginginfra.falco.GetClientDebugConfigDirective")) {
                    cls = GetClientDebugConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1968790115:
                if (str.equals("com.facebook.fbwebrtc.sdp.RtcpFbVal")) {
                    cls = RtcpFbVal.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1946698319:
                if (str.equals("com.facebook.fbwebrtc.multiway.RingRequest")) {
                    cls = RingRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1920266090:
                if (str.equals("com.facebook.fbwebrtc.multiway.NodeIdNotification")) {
                    cls = NodeIdNotification.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1912136605:
                if (str.equals("com.facebook.logginginfra.falco.QPLSamplingConfig")) {
                    cls = QPLSamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1897628496:
                if (str.equals("com.facebook.fbwebrtc.multiway.SignalingMessageFromClient")) {
                    cls = SignalingMessageFromClient.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1872962185:
                if (str.equals(MSV.A00(1052))) {
                    cls = JoinRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1867882858:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientResult")) {
                    cls = ClientResult.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1855423023:
                if (str.equals("com.facebook.fbwebrtc.sdp.MediaDescription")) {
                    cls = MediaDescription.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1843300411:
                if (str.equals("com.facebook.fbwebrtc.SdpNegotiatePayload")) {
                    cls = SdpNegotiatePayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1821556539:
                if (str.equals("com.facebook.logginginfra.falco.FalcoContext")) {
                    cls = FalcoContext.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1792067556:
                if (str.equals("com.facebook.logginginfra.falco.ProcessRequestDirective")) {
                    cls = ProcessRequestDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1791912557:
                if (str.equals("com.facebook.fbwebrtc.multiway.ConnectRequest")) {
                    cls = ConnectRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1756396444:
                if (str.equals("com.facebook.fbwebrtc.PranswerPayload")) {
                    cls = PranswerPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1724469405:
                if (str.equals("com.facebook.fbwebrtc.multiway.Endpoint")) {
                    cls = Endpoint.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1717622177:
                if (str.equals("com.facebook.fbwebrtc.sdp.CodecDescription")) {
                    cls = CodecDescription.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1692966251:
                if (str.equals("com.facebook.fbwebrtc.multiway.QuickExperimentValue")) {
                    cls = QuickExperimentValue.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1683929594:
                if (str.equals("com.facebook.fbwebrtc.multiway.IceCandidate")) {
                    cls = IceCandidate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1681909363:
                if (str.equals("com.facebook.fbwebrtc.multiway.LoggingOptions")) {
                    cls = LoggingOptions.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1634899454:
                if (str.equals("com.facebook.logginginfra.falco.QPLSamplingMethod")) {
                    cls = QPLSamplingMethod.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1611386436:
                if (str.equals("com.facebook.fbwebrtc.multiway.AddParticipantsRequest")) {
                    cls = AddParticipantsRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1609010615:
                if (str.equals("com.facebook.fbwebrtc.sdp.SsrcObject")) {
                    cls = SsrcObject.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1607010528:
                if (str.equals("com.facebook.fbwebrtc.multiway.DataMessageRequest")) {
                    cls = DataMessageRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1581500046:
                if (str.equals("com.facebook.logginginfra.falco.FunnelSamplingConfig")) {
                    cls = FunnelSamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1577552481:
                if (str.equals("com.facebook.fbwebrtc.sdp.SessionDescription")) {
                    cls = SessionDescription.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1538816964:
                if (str.equals("com.facebook.fbwebrtc.multiway.QuickExperiment")) {
                    cls = QuickExperiment.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1534993017:
                if (str.equals("com.facebook.logginginfra.falco.Batch")) {
                    cls = Batch.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1531610905:
                if (str.equals("com.facebook.logginginfra.falco.Event")) {
                    cls = Event.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1524001066:
                if (str.equals("com.facebook.logginginfra.falco.Checksum")) {
                    cls = Checksum.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1521561413:
                if (str.equals("com.facebook.logginginfra.falco.Proxy")) {
                    cls = Proxy.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1498059679:
                if (str.equals(MSV.A00(1055))) {
                    cls = RtcMessageHeader.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1428530899:
                if (str.equals("com.facebook.fbwebrtc.multiway.ProxygenAllocationResult")) {
                    cls = ProxygenAllocationResult.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1406647216:
                if (str.equals("com.facebook.logginginfra.falco.CollectionConstraintNode")) {
                    cls = CollectionConstraintNode.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1366389535:
                if (str.equals("com.facebook.fbwebrtc.multiway.VideoUploadRequest")) {
                    cls = VideoUploadRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1305958943:
                if (str.equals("com.facebook.fbwebrtc.multiway.ThreadIdInfo")) {
                    cls = ThreadIdInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1265468718:
                if (str.equals("com.facebook.logginginfra.falco.QPLCrashResiliency")) {
                    cls = QPLCrashResiliency.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1263030051:
                if (str.equals("com.facebook.logginginfra.falco.SamplingChecksum")) {
                    cls = SamplingChecksum.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1257917778:
                if (str.equals("com.facebook.fbwebrtc.NotifyMediaStatePayload")) {
                    cls = NotifyMediaStatePayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1236288295:
                if (str.equals("com.facebook.logginginfra.falco.ClientSource")) {
                    cls = ClientSource.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1231049353:
                if (str.equals("com.facebook.logginginfra.falco.ClientDebugConfig")) {
                    cls = ClientDebugConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1218474690:
                if (str.equals("com.facebook.fbwebrtc.multiway.ApprovalRequest")) {
                    cls = ApprovalRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1215462697:
                if (str.equals("com.facebook.fbwebrtc.HangUpPayload")) {
                    cls = HangUpPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1167188427:
                if (str.equals("com.facebook.fbwebrtc.sdp.SsrcGroup")) {
                    cls = SsrcGroup.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1116265597:
                if (str.equals("com.facebook.logginginfra.falco.GetQPLConfigDirective")) {
                    cls = GetQPLConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1099788676:
                if (str.equals("com.facebook.logginginfra.falco.Identifier")) {
                    cls = Identifier.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1076294736:
                if (str.equals(MSV.A00(1043))) {
                    cls = GenericDataMessage.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1062027903:
                if (str.equals("com.facebook.fbwebrtc.multiway.SignalingMessageToClient")) {
                    cls = SignalingMessageToClient.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1052959879:
                if (str.equals("com.facebook.fbwebrtc.multiway.QuickExperimentResult")) {
                    cls = QuickExperimentResult.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1039606064:
                if (str.equals("com.facebook.fbwebrtc.multiway.UserProfile")) {
                    cls = UserProfile.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1033159139:
                if (str.equals(MSV.A00(1044))) {
                    cls = ClientMediaStatus.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -1015378334:
                if (str.equals("com.facebook.logginginfra.falco.QPLEventConfig")) {
                    cls = QPLEventConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -993416584:
                if (str.equals("com.facebook.fbwebrtc.sdp.Bandwidth")) {
                    cls = Bandwidth.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -979523852:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientMediaUpdate")) {
                    cls = ClientMediaUpdate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -954595217:
                if (str.equals(MSV.A00(1047))) {
                    cls = DataMessage.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -915697153:
                if (str.equals("com.facebook.fbwebrtc.SwitchToMultiwayPayload")) {
                    cls = SwitchToMultiwayPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -905844485:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientMediaUpdateRequest")) {
                    cls = ClientMediaUpdateRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -867226331:
                if (str.equals(MSV.A00(1046))) {
                    cls = DataHeader.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -831646776:
                if (str.equals("com.facebook.fbwebrtc.OkPayload")) {
                    cls = OkPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -819335020:
                if (str.equals("com.facebook.logginginfra.falco.PartitioningKey")) {
                    cls = PartitioningKey.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -818258238:
                if (str.equals("com.facebook.fbwebrtc.multiway.ReceiverBottleneck")) {
                    cls = ReceiverBottleneck.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -718295669:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientSessionInfo")) {
                    cls = ClientSessionInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -712817305:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientInfo")) {
                    cls = ClientInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -686451546:
                if (str.equals("com.facebook.fbwebrtc.AnswerPayload")) {
                    cls = AnswerPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -668690881:
                if (str.equals("com.facebook.logginginfra.falco.FunnelPartialSampling")) {
                    cls = FunnelPartialSampling.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -625956607:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientEvent")) {
                    cls = ClientEvent.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -621769869:
                if (str.equals("com.facebook.fbwebrtc.multiway.ProxygenCandidate")) {
                    cls = ProxygenCandidate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -612046529:
                if (str.equals("com.facebook.logginginfra.falco.PigeonPartialSampling")) {
                    cls = PigeonPartialSampling.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -607285150:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientEventResponse")) {
                    cls = ClientEventResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -582709610:
                if (str.equals("com.facebook.fbwebrtc.multiway.TransferRequest")) {
                    cls = TransferRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -579063905:
                if (str.equals("com.facebook.fbwebrtc.multiway.BweDebugInfo")) {
                    cls = BweDebugInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -558977327:
                if (str.equals("com.facebook.fbwebrtc.multiway.SubscriptionMessageFromClient")) {
                    cls = SubscriptionMessageFromClient.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -527066724:
                if (str.equals("com.facebook.logginginfra.falco.Request")) {
                    cls = Request.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -500769155:
                if (str.equals("com.facebook.fbwebrtc.multiway.RenderResolutionMessageToClient")) {
                    cls = RenderResolutionMessageToClient.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -494052691:
                if (str.equals("com.facebook.fbwebrtc.AnswerAckPayload")) {
                    cls = AnswerAckPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -482640065:
                if (str.equals("com.facebook.logginginfra.falco.FetchSamplingConfigDirective")) {
                    cls = FetchSamplingConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -481128023:
                if (str.equals("com.facebook.fbwebrtc.multiway.IceCandidateRequest")) {
                    cls = IceCandidateRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -480507868:
                if (str.equals("com.facebook.fbwebrtc.multiway.SubscriptionRequest")) {
                    cls = SubscriptionRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -448877716:
                if (str.equals("com.facebook.fbwebrtc.IceCandidatePayload")) {
                    cls = IceCandidatePayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -415283386:
                if (str.equals("com.facebook.fbwebrtc.sdp.Sdp")) {
                    cls = com.facebook.fbwebrtc.sdp.Sdp.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -405016817:
                if (str.equals("com.facebook.logginginfra.falco.BackendServiceSource")) {
                    cls = BackendServiceSource.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -363867832:
                if (str.equals("com.facebook.fbwebrtc.multiway.ConferenceStateRequest")) {
                    cls = ConferenceStateRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -332453770:
                if (str.equals(MSV.A00(1054))) {
                    cls = RtcMessageBody.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -297054345:
                if (str.equals("com.facebook.fbwebrtc.OfferAckPayload")) {
                    cls = OfferAckPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -275057907:
                if (str.equals("com.facebook.fbwebrtc.multiway.EdgerayInfo")) {
                    cls = EdgerayInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -257116781:
                if (str.equals("com.facebook.fbwebrtc.multiway.DebugInfo")) {
                    cls = DebugInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -165171873:
                if (str.equals(MSV.A00(1053))) {
                    cls = RingResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -141391838:
                if (str.equals("com.facebook.fbwebrtc.multiway.SpeakerDetail")) {
                    cls = SpeakerDetail.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -128550956:
                if (str.equals(MSV.A00(1056))) {
                    cls = com.facebook.fbwebrtc.multiway.SessionDescription.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -62532911:
                if (str.equals("com.facebook.fbwebrtc.multiway.RelayInfo")) {
                    cls = RelayInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -54061286:
                if (str.equals("com.facebook.logginginfra.falco.Lambda")) {
                    cls = Lambda.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -51620885:
                if (str.equals("com.facebook.fbwebrtc.multiway.Subscription")) {
                    cls = Subscription.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -35599426:
                if (str.equals("com.facebook.fbwebrtc.multiway.RtcMultiwayMessage")) {
                    cls = RtcMultiwayMessage.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case -34236036:
                if (str.equals("com.facebook.fbwebrtc.ClientReportedEventPayload")) {
                    cls = ClientReportedEventPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 54447713:
                if (str.equals("com.facebook.logginginfra.falco.Integration")) {
                    cls = Integration.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 73684237:
                if (str.equals("com.facebook.logginginfra.falco.PigeonNestResponseDirective")) {
                    cls = PigeonNestResponseDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 93117300:
                if (str.equals("com.facebook.fbwebrtc.RingPayload")) {
                    cls = RingPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 97194346:
                if (str.equals("com.facebook.logginginfra.falco.FunnelSamplingType")) {
                    cls = FunnelSamplingType.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 118587551:
                if (str.equals("com.facebook.logginginfra.falco.BladeRunnerIntegration")) {
                    cls = BladeRunnerIntegration.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 121185188:
                if (str.equals("com.facebook.fbwebrtc.multiway.UnsubscribeResponse")) {
                    cls = UnsubscribeResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 138618720:
                if (str.equals("com.facebook.logginginfra.falco.BackendServiceIntegration")) {
                    cls = BackendServiceIntegration.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 150146887:
                if (str.equals("com.facebook.logginginfra.falco.WebClientSource")) {
                    cls = WebClientSource.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 159525742:
                if (str.equals("com.facebook.logginginfra.falco.Source")) {
                    cls = Source.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 198139408:
                if (str.equals("com.facebook.fbwebrtc.SdpUpdatePayload")) {
                    cls = SdpUpdatePayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 217436500:
                if (str.equals("com.facebook.logginginfra.falco.Upload")) {
                    cls = Upload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 263490274:
                if (str.equals("com.facebook.fbwebrtc.multiway.RtcReceiver")) {
                    cls = RtcReceiver.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 281732175:
                if (str.equals("com.facebook.fbwebrtc.TrackInfo")) {
                    cls = TrackInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 307096696:
                if (str.equals("com.facebook.fbwebrtc.multiway.UpdateRequest")) {
                    cls = UpdateRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 322404007:
                if (str.equals("com.facebook.logginginfra.falco.EventPayload")) {
                    cls = EventPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 335052622:
                if (str.equals("com.facebook.logginginfra.falco.PigeonNestDirective")) {
                    cls = PigeonNestDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 338219453:
                if (str.equals("com.facebook.fbwebrtc.multiway.ConnectResponse")) {
                    cls = ConnectResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 360402364:
                if (str.equals("com.facebook.fbwebrtc.multiway.RtcException")) {
                    cls = RtcException.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 362228131:
                if (str.equals("com.facebook.logginginfra.falco.Session")) {
                    cls = Session.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 388491386:
                if (str.equals("com.facebook.logginginfra.falco.PigeonEventSamplingConfig")) {
                    cls = PigeonEventSamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 399959604:
                if (str.equals(MSV.A00(1051))) {
                    cls = HangupRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 477705215:
                if (str.equals("com.facebook.fbwebrtc.multiway.DominantSpeakerInfo")) {
                    cls = DominantSpeakerInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 494033896:
                if (str.equals("com.facebook.fbwebrtc.multiway.RtcSender")) {
                    cls = RtcSender.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 512633773:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientConditional")) {
                    cls = ClientConditional.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 521947123:
                if (str.equals("com.facebook.fbwebrtc.multiway.DismissRequest")) {
                    cls = DismissRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 554821297:
                if (str.equals(MSV.A00(1048))) {
                    cls = DataMessageBody.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 576212189:
                if (str.equals("com.facebook.fbwebrtc.multiway.ServerMediaUpdateResponse")) {
                    cls = ServerMediaUpdateResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 601116332:
                if (str.equals("com.facebook.fbwebrtc.multiway.RenderResolutionMessageFromClient")) {
                    cls = RenderResolutionMessageFromClient.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 636432856:
                if (str.equals("com.facebook.logginginfra.falco.SetFalcoSamplingConfigDirective")) {
                    cls = SetFalcoSamplingConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 666904004:
                if (str.equals("com.facebook.fbwebrtc.multiway.ResolutionData")) {
                    cls = ResolutionData.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 671367522:
                if (str.equals("com.facebook.logginginfra.falco.PigeonNestResponse")) {
                    cls = PigeonNestResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 691855169:
                if (str.equals("com.facebook.fbwebrtc.OfferNackPayload")) {
                    cls = OfferNackPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 694938316:
                if (str.equals("com.facebook.fbwebrtc.multiway.UnsubscribeRequest")) {
                    cls = UnsubscribeRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 715965259:
                if (str.equals("com.facebook.fbwebrtc.multiway.ReceiveTrackDebugInfo")) {
                    cls = ReceiveTrackDebugInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 721800908:
                if (str.equals("com.facebook.logginginfra.falco.GetFalcoSamplingConfigDirective")) {
                    cls = GetFalcoSamplingConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 728277685:
                if (str.equals("com.facebook.logginginfra.falco.SamplingRequest")) {
                    cls = SamplingRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 735503388:
                if (str.equals("com.facebook.fbwebrtc.OfferPayload")) {
                    cls = OfferPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 740958639:
                if (str.equals("com.facebook.fbwebrtc.multiway.MediaDescriptionUpdate")) {
                    cls = MediaDescriptionUpdate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 757188206:
                if (str.equals("com.facebook.fbwebrtc.sdp.IceCandidateSdp")) {
                    cls = IceCandidateSdp.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 783621203:
                if (str.equals("com.facebook.fbwebrtc.sdp.CryptoParam")) {
                    cls = CryptoParam.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 790057360:
                if (str.equals("com.facebook.fbwebrtc.VideoRequestPayload")) {
                    cls = VideoRequestPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 820896063:
                if (str.equals("com.facebook.logginginfra.falco.FunnelFullSampling")) {
                    cls = FunnelFullSampling.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 824117861:
                if (str.equals("com.facebook.logginginfra.falco.EncodedData")) {
                    cls = EncodedData.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 841553274:
                if (str.equals("com.facebook.logginginfra.falco.FunnelEventSamplingConfig")) {
                    cls = FunnelEventSamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 846468891:
                if (str.equals("com.facebook.fbwebrtc.multiway.ServerOnlyParticipantState")) {
                    cls = ServerOnlyParticipantState.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 858734078:
                if (str.equals("com.facebook.fbwebrtc.WebrtcMessagePayload")) {
                    cls = WebrtcMessagePayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 859486128:
                if (str.equals("com.facebook.fbwebrtc.multiway.ProductMetadata")) {
                    cls = ProductMetadata.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 876381361:
                if (str.equals("com.facebook.logginginfra.falco.PrincipalSubject")) {
                    cls = PrincipalSubject.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 877066469:
                if (str.equals("com.facebook.fbwebrtc.multiway.E2eeData")) {
                    cls = E2eeData.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 893734612:
                if (str.equals("com.facebook.logginginfra.falco.Response")) {
                    cls = Response.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 963273881:
                if (str.equals("com.facebook.fbwebrtc.multiway.TurnInfo")) {
                    cls = TurnInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 982996856:
                if (str.equals("com.facebook.fbwebrtc.multiway.UpdateResponse")) {
                    cls = UpdateResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1058511611:
                if (str.equals("com.facebook.fbwebrtc.multiway.AudioDuplicationDebugInfo")) {
                    cls = AudioDuplicationDebugInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1075331383:
                if (str.equals("com.facebook.logginginfra.falco.FacebookIdentity")) {
                    cls = FacebookIdentity.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1098296145:
                if (str.equals("com.facebook.logginginfra.falco.Identity")) {
                    cls = Identity.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1114269586:
                if (str.equals("com.facebook.fbwebrtc.multiway.Snapshot")) {
                    cls = Snapshot.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1136544003:
                if (str.equals("com.facebook.logginginfra.falco.ScalingFactor")) {
                    cls = ScalingFactor.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1149025150:
                if (str.equals("com.facebook.fbwebrtc.multiway.QuickExperimentExposureLoggingEvent")) {
                    cls = QuickExperimentExposureLoggingEvent.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1199808106:
                if (str.equals("com.facebook.logginginfra.falco.PigeonSamplingType")) {
                    cls = PigeonSamplingType.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1210011429:
                if (str.equals("com.facebook.fbwebrtc.WebrtcMessageEndpoint")) {
                    cls = WebrtcMessageEndpoint.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1210742588:
                if (str.equals("com.facebook.fbwebrtc.multiway.DominantSpeakerNotification")) {
                    cls = DominantSpeakerNotification.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1229735100:
                if (str.equals("com.facebook.logginginfra.falco.AppScopedIdentity")) {
                    cls = AppScopedIdentity.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1248084943:
                if (str.equals("com.facebook.fbwebrtc.AckPayload")) {
                    cls = AckPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1265593789:
                if (str.equals("com.facebook.fbwebrtc.multiway.SessionDescriptionUpdate")) {
                    cls = SessionDescriptionUpdate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1281032085:
                if (str.equals("com.facebook.fbwebrtc.PrOfferAckPayload")) {
                    cls = PrOfferAckPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1301695136:
                if (str.equals("com.facebook.logginginfra.falco.ForegroundSession")) {
                    cls = ForegroundSession.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1346532841:
                if (str.equals("com.facebook.fbwebrtc.NackPayload")) {
                    cls = NackPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1393831727:
                if (str.equals("com.facebook.fbwebrtc.multiway.RtcMessageBodyVariant")) {
                    cls = RtcMessageBodyVariant.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1402353267:
                if (str.equals("com.facebook.fbwebrtc.multiway.ServerMediaUpdateRequest")) {
                    cls = ServerMediaUpdateRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1419945359:
                if (str.equals("com.facebook.logginginfra.falco.SetQPLConfigDirective")) {
                    cls = SetQPLConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1438367205:
                if (str.equals(MSV.A00(1058))) {
                    cls = SyncPayload.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1457560477:
                if (str.equals("com.facebook.fbwebrtc.multiway.RemoveParticipantsRequest")) {
                    cls = RemoveParticipantsRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1468368498:
                if (str.equals("com.facebook.logginginfra.falco.PigeonSamplingConfig")) {
                    cls = PigeonSamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1469291571:
                if (str.equals("com.facebook.fbwebrtc.multiway.SubscriptionOptions")) {
                    cls = SubscriptionOptions.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1538330748:
                if (str.equals("com.facebook.fbwebrtc.multiway.ServerMediaUpdate")) {
                    cls = ServerMediaUpdate.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1543970126:
                if (str.equals("com.facebook.logginginfra.falco.PigeonNestRequest")) {
                    cls = PigeonNestRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1560273242:
                if (str.equals("com.facebook.logginginfra.falco.PrivacyContext")) {
                    cls = PrivacyContext.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1579099221:
                if (str.equals("com.facebook.fbwebrtc.multiway.TopicConfiguration")) {
                    cls = TopicConfiguration.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1657932968:
                if (str.equals("com.facebook.fbwebrtc.multiway.ConferenceStateResponse")) {
                    cls = ConferenceStateResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1698830576:
                if (str.equals("com.facebook.fbwebrtc.multiway.ProxygenAllocation")) {
                    cls = ProxygenAllocation.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1700227374:
                if (str.equals("com.facebook.logginginfra.falco.CollectionConstraint")) {
                    cls = CollectionConstraint.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1711316788:
                if (str.equals("com.facebook.fbwebrtc.sdp.Extmap")) {
                    cls = Extmap.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1775215056:
                if (str.equals("com.facebook.fbwebrtc.multiway.DataMessageResponse")) {
                    cls = DataMessageResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1816065193:
                if (str.equals("com.facebook.fbwebrtc.multiway.StateSyncTopicConfigMap")) {
                    cls = StateSyncTopicConfigMap.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1833534117:
                if (str.equals(MSV.A00(1049))) {
                    cls = E2eeEnforcement.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1838285406:
                if (str.equals("com.facebook.fbwebrtc.P2PSfuAllocation")) {
                    cls = P2PSfuAllocation.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1879848989:
                if (str.equals("com.facebook.fbwebrtc.WebrtcMessageHeader")) {
                    cls = WebrtcMessageHeader.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1898384884:
                if (str.equals("com.facebook.fbwebrtc.multiway.SfuAllocation")) {
                    cls = SfuAllocation.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1918365262:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientEventRequest")) {
                    cls = ClientEventRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1923509823:
                if (str.equals("com.facebook.logginginfra.falco.PigeonFullSampling")) {
                    cls = PigeonFullSampling.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1958491740:
                if (str.equals("com.facebook.logginginfra.falco.SamplingConfig")) {
                    cls = SamplingConfig.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1988607424:
                if (str.equals("com.facebook.fbwebrtc.multiway.GroupOfUsers")) {
                    cls = GroupOfUsers.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 1993232620:
                if (str.equals("com.facebook.fbwebrtc.multiway.ParticipantState")) {
                    cls = ParticipantState.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2004303352:
                if (str.equals("com.facebook.fbwebrtc.multiway.NotifyRequest")) {
                    cls = NotifyRequest.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2011128923:
                if (str.equals("com.facebook.logginginfra.falco.MobileClientSource")) {
                    cls = MobileClientSource.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2025003104:
                if (str.equals("com.facebook.fbwebrtc.multiway.SyncAck")) {
                    cls = SyncAck.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2036525909:
                if (str.equals("com.facebook.fbwebrtc.multiway.ClientMediaUpdateResponse")) {
                    cls = ClientMediaUpdateResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2047203200:
                if (str.equals(MSV.A00(1045))) {
                    cls = ClientTrackInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2047854100:
                if (str.equals("com.facebook.logginginfra.falco.SetClientDebugConfigDirective")) {
                    cls = SetClientDebugConfigDirective.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2056795640:
                if (str.equals("com.facebook.fbwebrtc.multiway.NotifyResponse")) {
                    cls = NotifyResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2062269606:
                if (str.equals(MSV.A00(1050))) {
                    cls = EndpointSettings.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2096880736:
                if (str.equals("com.facebook.fbwebrtc.multiway.SsrcGroup")) {
                    cls = com.facebook.fbwebrtc.multiway.SsrcGroup.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2097113147:
                if (str.equals("com.facebook.fbwebrtc.multiway.TSocketAddress")) {
                    cls = TSocketAddress.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2104207192:
                if (str.equals("com.facebook.fbwebrtc.StreamInfo")) {
                    cls = StreamInfo.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2120648281:
                if (str.equals("com.facebook.fbwebrtc.multiway.JoinResponse")) {
                    cls = JoinResponse.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2127410790:
                if (str.equals("com.facebook.logginginfra.falco.CollectionConstraintExpression")) {
                    cls = CollectionConstraintExpression.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2132271318:
                if (str.equals("com.facebook.fbwebrtc.multiway.Media")) {
                    cls = Media.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            case 2138256771:
                if (str.equals(MSV.A00(1057))) {
                    cls = State.class;
                    break;
                }
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
            default:
                throw AbstractC166987dD.A12(AnonymousClass001.A0R("structName=", str));
        }
        try {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) cls.newInstance();
            hyperThriftBase.A02(str, objArr);
            if (i == 1) {
                hyperThriftBase.A01();
            }
            C0fY.A00(4L, 1017706147);
            return hyperThriftBase;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }
}
