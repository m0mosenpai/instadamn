package com.instagram.realtimeclient.requeststream;

import X.AbstractC05810Sj;
import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC58317Pt9;
import X.AnonymousClass001;
import X.C1Dk;
import X.C25671My;
import X.InterfaceC02550Ad;
import X.InterfaceC02590Ai;
import X.InterfaceC13000lm;
import X.InterfaceC216113n;
import X.InterfaceC54242ee;
import X.MSY;
import X.X7T;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler;
import com.instagram.common.session.UserSession;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class SubscribeExecutor implements InterfaceC13000lm {
    public static final String TAG = "com.instagram.realtimeclient.requeststream.SubscribeExecutor";
    public final InterfaceC02550Ad mEventLogger;
    public final C25671My mIgEventBus;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final InterfaceC54242ee mRequestStreamClient;
    public final Map mSubscribedTopics;
    public final InterfaceC216113n mUUIDSupplier;
    public final long mUserID;

    /* loaded from: classes11.dex */
    public class ClientSubEventType {
        public static final String PAYLOAD_RECEIVED = "receivepayload";
        public static final String SUBSCRIBE = "client_subscribe";
        public static final String UNSUBSCRIBE = "client_unsubscribe";
    }

    public abstract JSONObject buildHeaderJson(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str);

    public abstract JSONObject buildPayload(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str);

    @Override // X.InterfaceC13000lm
    public synchronized void onSessionWillEnd() {
        Iterator A16 = AbstractC166997dE.A16(this.mSubscribedTopics);
        while (A16.hasNext()) {
            ((SubscriptionHandler) A16.next()).mStream.cancel();
        }
        this.mSubscribedTopics.clear();
    }

    public synchronized void unsubscribe(SubscriptionHandler subscriptionHandler) {
        GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = (GraphQLSubscriptionRequestStub) subscriptionHandler.mRequest;
        logEvent("client_unsubscribe", graphQLSubscriptionRequestStub, subscriptionHandler.mSubscriptionID);
        SubscriptionHandler subscriptionHandler2 = (SubscriptionHandler) this.mSubscribedTopics.remove(buildStreamKeyFromRequest(graphQLSubscriptionRequestStub));
        if (subscriptionHandler2 != null) {
            subscriptionHandler2.mStream.cancel();
        }
    }

    public static String buildStreamKeyFromRequest(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub) {
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        String A0g = AnonymousClass001.A0g(iGGraphQLSubscriptionRequestStringStub.getQueryName(), "-", iGGraphQLSubscriptionRequestStringStub.mQueryId);
        String str = iGGraphQLSubscriptionRequestStringStub.mParamsKey;
        if (str != null) {
            return AnonymousClass001.A0g(A0g, "-", str);
        }
        return A0g;
    }

    public static boolean coinFlip(int i) {
        Random random = new Random();
        if (i <= 0) {
            i = 10000;
        }
        return AbstractC167007dF.A1N(random.nextInt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logEvent(String str, GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str2) {
        long j;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        RealtimeClientConfig realtimeClientConfig = this.mRealtimeClientConfig;
        if (realtimeClientConfig != null) {
            j = realtimeClientConfig.getGQLSSamplingWeight();
        } else {
            j = 10000;
        }
        if (coinFlip((int) j)) {
            InterfaceC02590Ai A0H = MSY.A0H(this.mEventLogger, AbstractC111324zv.A00(2492));
            A0H.AAP("event_type", str);
            A0H.A9K("ig_user_id", Long.valueOf(this.mUserID));
            A0H.AAP("event_source", AbstractC58317Pt9.A00(62));
            A0H.A9K(AbstractC111324zv.A00(3033), Long.valueOf(j));
            A0H.A9K("query_id", AbstractC25228BEl.A13(iGGraphQLSubscriptionRequestStringStub.mQueryId));
            A0H.AAP("query_param_string", buildPayload(graphQLSubscriptionRequestStub, str2).toString());
            A0H.AAP("subscription_name", iGGraphQLSubscriptionRequestStringStub.getQueryName());
            A0H.AAP(TraceFieldType.TransportType, "XPLAT_RS_STARGATE");
            A0H.Cht();
        }
    }

    public SubscriptionHandler subscribe(C1Dk c1Dk, Executor executor, final DataCallBack dataCallBack, final X7T x7t, int i) {
        SubscriptionHandler subscriptionHandler;
        final GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub = (GraphQLSubscriptionRequestStub) c1Dk;
        String buildStreamKeyFromRequest = buildStreamKeyFromRequest(graphQLSubscriptionRequestStub);
        synchronized (this.mSubscribedTopics) {
            subscriptionHandler = (SubscriptionHandler) this.mSubscribedTopics.get(buildStreamKeyFromRequest);
        }
        if (subscriptionHandler == null) {
            this.mIgEventBus.E4s(new FleetBeaconEvent(graphQLSubscriptionRequestStub));
            Object obj = this.mUUIDSupplier.get();
            AbstractC05810Sj.A00(obj);
            final String obj2 = obj.toString();
            subscriptionHandler = new SubscriptionHandler(c1Dk, obj2, this.mRequestStreamClient.createStream(buildHeaderJson(graphQLSubscriptionRequestStub, obj2).toString(), buildPayload(graphQLSubscriptionRequestStub, obj2).toString().getBytes(StandardCharsets.UTF_8), null, new StreamEventHandler() { // from class: com.instagram.realtimeclient.requeststream.SubscribeExecutor.2
                @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                public void onData(byte[] bArr) {
                    String str = new String(bArr, Charset.forName(ReactWebViewManager.HTML_ENCODING));
                    SubscribeExecutor.this.logEvent("receivepayload", graphQLSubscriptionRequestStub, obj2);
                    dataCallBack.onData(str);
                }

                @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                public void onFlowStatus(int i2) {
                }

                @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                public void onLog(String str) {
                }

                @Override // com.facebook.realtime.requeststream.streameventhandler.StreamEventHandler
                public void onTermination(int i2, String str, boolean z) {
                }
            }, executor, i), this);
            synchronized (this.mSubscribedTopics) {
                this.mSubscribedTopics.put(buildStreamKeyFromRequest, subscriptionHandler);
            }
        }
        logEvent("client_subscribe", graphQLSubscriptionRequestStub, subscriptionHandler.mSubscriptionID);
        return subscriptionHandler;
    }

    public SubscribeExecutor(InterfaceC54242ee interfaceC54242ee, InterfaceC02550Ad interfaceC02550Ad, C25671My c25671My, InterfaceC216113n interfaceC216113n, long j) {
        this.mSubscribedTopics = new HashMap();
        this.mRequestStreamClient = interfaceC54242ee;
        this.mEventLogger = interfaceC02550Ad;
        this.mIgEventBus = c25671My;
        this.mUUIDSupplier = interfaceC216113n;
        this.mUserID = j;
        this.mRealtimeClientConfig = null;
    }

    public SubscribeExecutor(UserSession userSession, C25671My c25671My) {
        long j;
        this.mSubscribedTopics = new HashMap();
        this.mRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        this.mEventLogger = AbstractC12220kQ.A02(userSession);
        this.mRealtimeClientConfig = new RealtimeClientConfig(userSession);
        this.mIgEventBus = c25671My;
        this.mUUIDSupplier = new InterfaceC216113n() { // from class: com.instagram.realtimeclient.requeststream.SubscribeExecutor.1
            @Override // X.InterfaceC216113n
            public /* bridge */ /* synthetic */ Object get() {
                return UUID.randomUUID();
            }

            @Override // X.InterfaceC216113n
            public UUID get() {
                return UUID.randomUUID();
            }
        };
        try {
            j = Long.parseLong(userSession.userId);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        this.mUserID = j;
    }
}
