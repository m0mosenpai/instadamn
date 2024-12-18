package com.instagram.realtimeclient;

import X.AbstractC12290kX;
import X.AbstractC130745vN;
import X.AbstractC166997dE;
import X.AbstractC18280vF;
import X.AbstractC18310vI;
import X.AbstractC224517h;
import X.AbstractC24641Ih;
import X.AbstractC43371z7;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.AnonymousClass201;
import X.AnonymousClass207;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0K8;
import X.C0eE;
import X.C0f9;
import X.C0w9;
import X.C11T;
import X.C130755vO;
import X.C14120nc;
import X.C14360o3;
import X.C16030qx;
import X.C18C;
import X.C18U;
import X.C1F8;
import X.C1KC;
import X.C218914p;
import X.C225017m;
import X.C225417q;
import X.C26661Qv;
import X.C43351z5;
import X.C43531zN;
import X.C43551zQ;
import X.C43561zT;
import X.C43571zV;
import X.C44R;
import X.C4MI;
import X.C4PM;
import X.C4Q5;
import X.C4Q9;
import X.C5EZ;
import X.C93734Jd;
import X.C93744Je;
import X.C95094Pu;
import X.EnumC81843l3;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC26681Qx;
import X.InterfaceC43641zu;
import X.InterfaceC43661zx;
import X.InterfaceC65545TmK;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.realtimeclient.L;
import com.instagram.realtimeclient.MainRealtimeEventHandler;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import com.instagram.realtimeclient.regionhint.RegionHintController;
import java.io.IOException;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class RealtimeClientManager implements InterfaceC13000lm {
    public static final String APP_FOREGROUND_CONDITION = "APP_FOREGROUND";
    public static final String CLIENT_TYPE = "cookie_auth";
    public static final String DEFAULT_MQTT_FALLBACK_HOST_NAME = "edge-mqtt-fallback.facebook.com";
    public static final String DEFAULT_MQTT_HOST_NAME = "edge-mqtt.facebook.com";
    public static final int MQTT_STATE_DESTROYED = 1;
    public static final int MQTT_STATE_STARTED = 2;
    public static final int MQTT_STATE_STOPPED = 3;
    public static final int MQTT_STATE_UNSET = -1;
    public static final String SOFT_ERROR_TAG = "RealtimeClientManager";
    public static final Class TAG = RealtimeClientManager.class;
    public static PresenceMsysAppStateChangeObserverProvider sAppStateChangeObserverProvider;
    public static GraphQLSubscriptionsProvider sGraphQLSubscriptionsProvider;
    public static ObserversProvider sObserversProvider;
    public static RawSkywalkerSubscriptionsProvider sRawSkywalkerSubscriptionsProvider;
    public final Set mAdditionalObserverProviders;
    public final InterfaceC12870lZ mBackgroundDetectorListener;
    public final Context mContext;
    public final Runnable mDelayStopRunnable;
    public boolean mIsInitializingMqttClient;
    public final MainRealtimeEventHandler mMasterRealtimeEventHandler;
    public final AnonymousClass201 mMqttChannelStateListener;
    public AnonymousClass207 mMqttClient;
    public final InterfaceC43661zx mMqttPublishArrivedListener;
    public int mMqttTargetState;
    public final Set mObservers;
    public PresenceMsysAppStateChangeObserver mPresenceMsysAppStateChangeObserver;
    public Proxy mProxy;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public RealtimeMqttClientConfig mRealtimeMqttClientConfig;
    public final RegionHintController mRegionHintController;
    public final UserSession mUserSession;
    public final InterfaceC43641zu mZeroTokenChangeListener;
    public InterfaceC26681Qx mZeroTokenManager;
    public static final Charset CHARSET_UTF8 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final Set sRealtimeDelegateProviders = new CopyOnWriteArraySet();
    public static final List sOtherRealtimeEventHandlerProviders = new CopyOnWriteArrayList();
    public final Handler mDelayHandler = new Handler(Looper.getMainLooper());
    public final Set mConnectionKeepAliveConditions = new HashSet();
    public final CopyOnWriteArraySet mRealtimeEventHandlers = new CopyOnWriteArraySet();
    public final Map mMqttTopicToHandlersMap = new HashMap();
    public final List mMqttChannelStateChangeListeners = new ArrayList();
    public final List mRawSkywalkerSubscriptions = new ArrayList();
    public final List mRealtimeSubscriptions = new ArrayList();
    public final List mPublishes = new ArrayList();

    /* renamed from: com.instagram.realtimeclient.RealtimeClientManager$16, reason: invalid class name */
    /* loaded from: classes10.dex */
    public abstract /* synthetic */ class AnonymousClass16 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$mqtt$client$MqttChannelState$ConnectionState;

        static {
            int length = C05F.A00(3).length;
            int[] iArr = new int[length];
            $SwitchMap$com$facebook$mqtt$client$MqttChannelState$ConnectionState = iArr;
            try {
                length = 1;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                length = 2;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[length] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface GraphQLSubscriptionsProvider {
        List get(UserSession userSession);
    }

    /* loaded from: classes2.dex */
    public class IgnoredMqttTopicsHandler extends RealtimeEventHandler {
        @Override // com.instagram.realtimeclient.RealtimeEventHandler
        public boolean canHandleRealtimeEvent(String str, String str2) {
            return true;
        }

        @Override // com.instagram.realtimeclient.RealtimeEventHandler
        public boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
            return true;
        }

        @Override // com.instagram.realtimeclient.RealtimeEventHandler
        public List getMqttTopicsToHandle() {
            return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_PREEMPTIVE_PING);
        }

        public /* synthetic */ IgnoredMqttTopicsHandler(AnonymousClass1 anonymousClass1) {
        }

        public IgnoredMqttTopicsHandler() {
        }
    }

    /* loaded from: classes3.dex */
    public abstract class MessageDeliveryCallback {
        public long mStartSendingTimestampInMs;

        public abstract void onFailure(Integer num, String str, String str2, boolean z, EnumC81843l3 enumC81843l3, String str3, boolean z2, boolean z3);

        public abstract void onSuccess(String str, String str2, long j, Long l);

        public abstract void onTimeout();

        public long getStartSendingTimestampInMs() {
            return this.mStartSendingTimestampInMs;
        }

        public void setStartSendingTimestampInMs(long j) {
            this.mStartSendingTimestampInMs = j;
        }
    }

    /* loaded from: classes2.dex */
    public interface Observer {
        void onConnectionChanged(C95094Pu c95094Pu);

        void onMessage(C5EZ c5ez);

        void onSendMessage(String str, String str2, String str3, boolean z, Long l);

        void onSendPayload(String str, byte[] bArr, String str2, Long l);
    }

    /* loaded from: classes3.dex */
    public interface ObserverProvider {
        Observer get(UserSession userSession);
    }

    /* loaded from: classes.dex */
    public interface ObserversProvider {
        List get(UserSession userSession);
    }

    /* loaded from: classes2.dex */
    public interface PresenceMsysAppStateChangeObserver {
        void onAppBackgrounded();

        void onAppForegrounded();
    }

    /* loaded from: classes.dex */
    public interface PresenceMsysAppStateChangeObserverProvider {
        PresenceMsysAppStateChangeObserver get(UserSession userSession);
    }

    /* loaded from: classes8.dex */
    public class Publish {
        public final InterfaceC65545TmK mCompletionCallacks;
        public final byte[] mPayload;
        public final C4Q5 mQos;
        public final String mTopicName;

        public Publish(String str, byte[] bArr, C4Q5 c4q5, InterfaceC65545TmK interfaceC65545TmK) {
            this.mTopicName = str;
            this.mPayload = bArr;
            this.mQos = c4q5;
            this.mCompletionCallacks = interfaceC65545TmK;
        }
    }

    /* loaded from: classes.dex */
    public interface RawSkywalkerSubscriptionsProvider {
        List get(UserSession userSession);
    }

    public static /* synthetic */ boolean access$800() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyMqttClient() {
        this.mMqttTargetState = 1;
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null) {
            anonymousClass207.destroy();
            InterfaceC26681Qx interfaceC26681Qx = this.mZeroTokenManager;
            if (interfaceC26681Qx != null) {
                interfaceC26681Qx.EGT(this.mZeroTokenChangeListener);
            }
            synchronized (this.mRawSkywalkerSubscriptions) {
                this.mRawSkywalkerSubscriptions.clear();
            }
            synchronized (this.mRealtimeSubscriptions) {
                this.mRealtimeSubscriptions.clear();
            }
            synchronized (this.mPublishes) {
                this.mPublishes.clear();
            }
            this.mRealtimeEventHandlers.clear();
            synchronized (this.mMqttTopicToHandlersMap) {
                this.mMqttTopicToHandlersMap.clear();
                this.mMqttChannelStateChangeListeners.clear();
            }
            synchronized (this.mObservers) {
                this.mObservers.clear();
            }
            this.mZeroTokenManager = null;
            this.mRealtimeMqttClientConfig = null;
        }
    }

    private synchronized void initMqttClient() {
        if (!this.mIsInitializingMqttClient) {
            this.mIsInitializingMqttClient = true;
            final AbstractRunnableC14200nk abstractRunnableC14200nk = new AbstractRunnableC14200nk(180) { // from class: com.instagram.realtimeclient.RealtimeClientManager.7
                @Override // java.lang.Runnable
                public void run() {
                    RealtimeClientManager.this.initMqttClientInBackground();
                }
            };
            if (MqttClientSelector.isXplatMqttEnabled(this.mUserSession)) {
                C14120nc.A00().ATO(abstractRunnableC14200nk);
            } else {
                Looper.myQueue().addIdleHandler(new C1KC("scheduleInitMqttClientInBackground") { // from class: com.instagram.realtimeclient.RealtimeClientManager.8
                    @Override // X.C1KC
                    public boolean onQueueIdle() {
                        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                        C14120nc.A00().ATO(abstractRunnableC14200nk);
                        return false;
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRealtimeSubscription(String str, List list, List list2, C4Q5 c4q5) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((RealtimeSubscription) it.next()).getSubscriptionString(this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled(), false));
            }
            arrayList = new ArrayList(hashSet);
        } else {
            arrayList = null;
        }
        if (list2 != null && !list2.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                hashSet2.add(((RealtimeSubscription) it2.next()).getSubscriptionString(this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled(), false));
            }
            arrayList2 = new ArrayList(hashSet2);
        }
        sendSkywalkerCommand(str, arrayList, arrayList2, c4q5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMqttClient() {
        this.mMqttTargetState = 2;
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 == null) {
            initMqttClient();
        } else {
            anonymousClass207.start();
        }
    }

    private void stopMqttClient() {
        this.mMqttTargetState = 3;
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null) {
            anonymousClass207.stop();
        }
    }

    private void updateAppStateInternal(final boolean z, final boolean z2) {
        if (this.mMqttClient != null) {
            if (L.ig_android_direct_mqtt_app_state_report_fix.enable_background.getAndExpose(this.mUserSession).booleanValue()) {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk(2096100312, 2, false, true) { // from class: com.instagram.realtimeclient.RealtimeClientManager.10
                    @Override // java.lang.Runnable
                    public void run() {
                        RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                        AnonymousClass207 anonymousClass207 = realtimeClientManager.mMqttClient;
                        if (anonymousClass207 != null) {
                            anonymousClass207.FAG(z, !z2);
                        }
                    }
                });
            } else {
                this.mMqttClient.FAG(z, !z2);
            }
            final PresenceMsysAppStateChangeObserver presenceMsysAppStateChangeObserver = this.mPresenceMsysAppStateChangeObserver;
            if (z2 && presenceMsysAppStateChangeObserver != null) {
                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF("updateAppStateInternal", 398171298) { // from class: com.instagram.realtimeclient.RealtimeClientManager.11
                    @Override // X.AbstractC18280vF
                    public void loggedRun() {
                        String A0o;
                        boolean z3 = z;
                        PresenceMsysAppStateChangeObserver presenceMsysAppStateChangeObserver2 = presenceMsysAppStateChangeObserver;
                        if (z3) {
                            presenceMsysAppStateChangeObserver2.onAppForegrounded();
                        } else {
                            presenceMsysAppStateChangeObserver2.onAppBackgrounded();
                        }
                        RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                        C130755vO A00 = AbstractC130745vN.A00(realtimeClientManager.mUserSession);
                        boolean z4 = z;
                        boolean z5 = z2;
                        C4PM A002 = C4PM.A00();
                        synchronized (A002) {
                            if (z4) {
                                A0o = AbstractC166997dE.A0o();
                                A002.A01 = A0o;
                            } else {
                                A0o = AbstractC166997dE.A0o();
                                A002.A00 = A0o;
                            }
                        }
                        C14360o3.A0A(A0o);
                        C130755vO.A00(A00, Boolean.valueOf(z4), null, Boolean.valueOf(z5), "app_state_update", A0o);
                    }
                });
            }
        }
    }

    public static boolean useMqttSandbox() {
        return false;
    }

    public synchronized int getMqttTargetState() {
        int i;
        boolean z = true;
        if (this.mIsInitializingMqttClient) {
            i = 0;
            if (this.mMqttTargetState == -1) {
                z = false;
            }
            C18C.A0F(z);
        } else {
            int i2 = this.mMqttTargetState;
            if (i2 != -1 && i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    if (i2 != 3) {
                        C0w9.A03(SOFT_ERROR_TAG, AnonymousClass001.A0O("Mqtt target state is unknown: ", i2));
                        i2 = 98;
                    }
                } else {
                    AnonymousClass207 anonymousClass207 = this.mMqttClient;
                    if (anonymousClass207 != null) {
                        int intValue = anonymousClass207.BV8().A00.A00.intValue();
                        if (intValue != 0) {
                            if (intValue == 1) {
                                i2 = 5;
                            }
                        } else {
                            i2 = 4;
                        }
                    } else {
                        i2 = 99;
                    }
                }
            }
            return i2;
        }
        return i;
    }

    public synchronized void publish(final String str, final String str2, C4Q5 c4q5, final boolean z) {
        final long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).onSendMessage(str, str2, RealtimeConstants.SEND_ATTEMPT, z, null);
            }
        }
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null) {
            anonymousClass207.E6m(new C4Q9() { // from class: com.instagram.realtimeclient.RealtimeClientManager.14
                @Override // X.C4Q9
                public void onFailure() {
                    RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                    int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                    synchronized (realtimeClientManager.mObservers) {
                        Iterator it2 = RealtimeClientManager.this.mObservers.iterator();
                        while (it2.hasNext()) {
                            ((Observer) it2.next()).onSendMessage(str, str2, RealtimeConstants.SEND_FAIL, z, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }

                @Override // X.C4Q9
                public void onSuccess() {
                    RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                    int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                    synchronized (realtimeClientManager.mObservers) {
                        Iterator it2 = RealtimeClientManager.this.mObservers.iterator();
                        while (it2.hasNext()) {
                            ((Observer) it2.next()).onSendMessage(str, str2, "success", z, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }
            }, c4q5, str, str2.getBytes(CHARSET_UTF8));
        }
    }

    private void addExternalObservers() {
        synchronized (this.mObservers) {
            ObserversProvider observersProvider = sObserversProvider;
            if (observersProvider != null) {
                this.mObservers.addAll(observersProvider.get(this.mUserSession));
            }
        }
        PresenceMsysAppStateChangeObserverProvider presenceMsysAppStateChangeObserverProvider = sAppStateChangeObserverProvider;
        if (presenceMsysAppStateChangeObserverProvider != null) {
            this.mPresenceMsysAppStateChangeObserver = presenceMsysAppStateChangeObserverProvider.get(this.mUserSession);
        }
    }

    public static synchronized void addOtherRealtimeEventHandlerProvider(RealtimeEventHandlerProvider realtimeEventHandlerProvider) {
        synchronized (RealtimeClientManager.class) {
            sOtherRealtimeEventHandlerProviders.add(realtimeEventHandlerProvider);
        }
    }

    public static synchronized void addRealtimeDelegateProvider(RealtimeDelegateProvider realtimeDelegateProvider) {
        synchronized (RealtimeClientManager.class) {
            sRealtimeDelegateProviders.add(realtimeDelegateProvider);
        }
    }

    private void collectObservers() {
        if (this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled()) {
            synchronized (this.mObservers) {
                this.mObservers.add(new AnalyticsLoggingObserver(this.mUserSession, this.mRealtimeClientConfig.getLogReceiveMessageSampleRate()));
            }
        }
        synchronized (this.mObservers) {
            this.mObservers.add(new RealtimeClientEventObserver(this.mUserSession, this.mRealtimeClientConfig));
            Iterator it = this.mAdditionalObserverProviders.iterator();
            while (it.hasNext()) {
                Observer observer = ((ObserverProvider) it.next()).get(this.mUserSession);
                if (observer != null) {
                    this.mObservers.add(observer);
                }
            }
        }
    }

    private C93744Je createMqttAuthCredentials() {
        if (this.mUserSession.hasEnded()) {
            return null;
        }
        UserSession userSession = this.mUserSession;
        String str = userSession.userId;
        C225017m c225017m = new C225017m(C93734Jd.A00, AbstractC224517h.A04(C44R.A00, new C0eE(new C09530e4[]{new C09530e4("authorization", C1F8.A00(userSession).A04)})));
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        C225417q c225417q = new C225417q(c225017m);
        int i = 0;
        while (c225417q.hasNext()) {
            Object next = c225417q.next();
            i++;
            if (i > 1) {
                sb.append((CharSequence) "; ");
            }
            AbstractC18310vI.A0r(sb, next, null);
        }
        sb.append((CharSequence) "");
        String obj = sb.toString();
        C14360o3.A07(obj);
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        return C93744Je.A00(str, obj);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.4ME] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.realtimeclient.MqttClientSelector, java.lang.Object] */
    private AnonymousClass207 createMqttClient(RealtimeMqttClientConfig realtimeMqttClientConfig, C93744Je c93744Je, Set set) {
        ArrayList arrayList;
        if (set == null) {
            arrayList = new ArrayList();
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_SUB_IRIS_RESPONSE);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_MESSAGE_SYNC);
            arrayList.add(RealtimeConstants.MQTT_TOPIC_LARGE_SCALE_SYNC);
            arrayList.addAll(RegionHintController.Companion.mqttTopicsToHandle(this.mUserSession));
        } else {
            arrayList = new ArrayList(set);
        }
        Context context = this.mContext;
        String A04 = C16030qx.A02.A04(AbstractC12290kX.A00);
        InterfaceC43661zx interfaceC43661zx = this.mMqttPublishArrivedListener;
        AnonymousClass201 anonymousClass201 = this.mMqttChannelStateListener;
        ?? obj = new Object();
        UserSession userSession = this.mUserSession;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36313390141933483L);
        UserSession userSession2 = this.mUserSession;
        C14360o3.A0B(userSession2, 0);
        boolean A062 = C18U.A06(c06090Tz, userSession2, 36313390141999020L);
        C4MI c4mi = new C4MI(context, anonymousClass201, interfaceC43661zx, c93744Je, obj, new Runnable() { // from class: com.instagram.realtimeclient.RealtimeClientManager.12
            @Override // java.lang.Runnable
            public void run() {
                MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
            }
        }, A04, this.mProxy, arrayList, A062, A06);
        AnonymousClass207 newMqttClient = new Object().newMqttClient(realtimeMqttClientConfig, this.mUserSession);
        newMqttClient.CNi(c4mi);
        return newMqttClient;
    }

    public static synchronized GraphQLSubscriptionsProvider getGraphQLSubscriptionsProvider() {
        GraphQLSubscriptionsProvider graphQLSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            graphQLSubscriptionsProvider = sGraphQLSubscriptionsProvider;
        }
        return graphQLSubscriptionsProvider;
    }

    public static synchronized RealtimeClientManager getInstance(UserSession userSession) {
        RealtimeClientManager realtimeClientManager;
        synchronized (RealtimeClientManager.class) {
            realtimeClientManager = (RealtimeClientManager) userSession.A00(RealtimeClientManager.class);
            if (realtimeClientManager == null) {
                DLog.d(DLogTag.REAL_TIME.INSTANCE, "[Realtime] Init instance", new Object[0]);
                Set set = sRealtimeDelegateProviders;
                List singletonList = Collections.singletonList(new C43351z5());
                C14360o3.A07(singletonList);
                set.addAll(singletonList);
                sOtherRealtimeEventHandlerProviders.addAll(AbstractC43371z7.A00(AbstractC12290kX.A00));
                sRawSkywalkerSubscriptionsProvider = C43531zN.A00;
                sGraphQLSubscriptionsProvider = C43551zQ.A00;
                sObserversProvider = C43561zT.A00;
                sAppStateChangeObserverProvider = C43571zV.A00;
                realtimeClientManager = new RealtimeClientManager(AbstractC12290kX.A00, userSession, new RealtimeClientConfig(userSession), MainRealtimeEventHandler.create(userSession));
                userSession.A04(RealtimeClientManager.class, realtimeClientManager);
                MqttClientSelector.maybePreloadNativeDependencies(userSession);
            }
        }
        return realtimeClientManager;
    }

    public static synchronized RawSkywalkerSubscriptionsProvider getRawSkywalkerSubscriptionsProvider() {
        RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider;
        synchronized (RealtimeClientManager.class) {
            rawSkywalkerSubscriptionsProvider = sRawSkywalkerSubscriptionsProvider;
        }
        return rawSkywalkerSubscriptionsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.instagram.realtimeclient.RealtimeEventHandler, java.lang.Object] */
    private Set initRealtimeEventHandlers() {
        Set set;
        synchronized (this.mMqttTopicToHandlersMap) {
            set = null;
            if (this.mMqttTopicToHandlersMap.isEmpty()) {
                Iterator it = sRealtimeDelegateProviders.iterator();
                while (it.hasNext()) {
                    MainRealtimeEventHandler.Delegate delegate = ((RealtimeDelegateProvider) it.next()).get(this.mUserSession);
                    if (delegate != null) {
                        this.mMasterRealtimeEventHandler.addProtocolDelegate(delegate.getProtocol(), delegate);
                    }
                }
                registerRealtimeEventHandler(this.mMasterRealtimeEventHandler);
                registerRealtimeEventHandler(new Object());
                Iterator it2 = sOtherRealtimeEventHandlerProviders.iterator();
                while (it2.hasNext()) {
                    RealtimeEventHandler realtimeEventHandler = ((RealtimeEventHandlerProvider) it2.next()).get(this.mUserSession);
                    if (realtimeEventHandler != null) {
                        registerRealtimeEventHandler(realtimeEventHandler);
                    }
                }
                set = this.mMqttTopicToHandlersMap.keySet();
            }
        }
        return set;
    }

    public static synchronized boolean isInitialized(UserSession userSession) {
        boolean z;
        synchronized (RealtimeClientManager.class) {
            z = false;
            if (((RealtimeClientManager) userSession.A00(RealtimeClientManager.class)) != null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSkywalkerCommand(String str, List list, List list2, C4Q5 c4q5) {
        if (this.mMqttClient != null) {
            try {
                publish(str, SkywalkerCommand__JsonHelper.serializeToJson(new SkywalkerCommand(list, list2, null)), c4q5, true);
                return;
            } catch (IOException e) {
                throw new IllegalStateException("error serializing skywalker command", e);
            }
        }
        C0w9.A03(SOFT_ERROR_TAG, "Trying to subscribe to skywalker without enabling MQTT");
    }

    public static synchronized void setExternalObserver(ObserversProvider observersProvider, PresenceMsysAppStateChangeObserverProvider presenceMsysAppStateChangeObserverProvider) {
        synchronized (RealtimeClientManager.class) {
            sObserversProvider = observersProvider;
            sAppStateChangeObserverProvider = presenceMsysAppStateChangeObserverProvider;
        }
    }

    public static synchronized void setGraphQLSubscriptionsProvider(GraphQLSubscriptionsProvider graphQLSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sGraphQLSubscriptionsProvider = graphQLSubscriptionsProvider;
        }
    }

    public static synchronized void setRawSkywalkerSubscriptionsProvider(RawSkywalkerSubscriptionsProvider rawSkywalkerSubscriptionsProvider) {
        synchronized (RealtimeClientManager.class) {
            sRawSkywalkerSubscriptionsProvider = rawSkywalkerSubscriptionsProvider;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAppState(boolean z) {
        long j;
        UserSession userSession = this.mUserSession;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            j = 36313390141999020L;
        } else {
            j = 36313390141933483L;
        }
        updateAppStateInternal(z, C18U.A06(c06090Tz, userSession, j));
    }

    public void addAdditionalObserverWithProvider(ObserverProvider observerProvider) {
        synchronized (this.mObservers) {
            this.mAdditionalObserverProviders.add(observerProvider);
            this.mObservers.add(observerProvider.get(this.mUserSession));
        }
    }

    public void addKeepAliveCondition(String str) {
        this.mConnectionKeepAliveConditions.add(str);
        if (this.mMqttTargetState == 2) {
            AnonymousClass207 anonymousClass207 = this.mMqttClient;
            if (anonymousClass207 != null) {
                anonymousClass207.Cga();
                return;
            }
            return;
        }
        startMqttClient();
    }

    public void addObserver(Observer observer) {
        synchronized (this.mObservers) {
            this.mObservers.add(observer);
        }
    }

    public int getDelayDisconnectKeepaliveMs() {
        return this.mRealtimeClientConfig.delayDisconnectMQTTMS;
    }

    public MainRealtimeEventHandler getMasterRealtimeEventHandler() {
        return this.mMasterRealtimeEventHandler;
    }

    public String getMqttChannelState() {
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 == null) {
            return null;
        }
        return anonymousClass207.BV8().A00.toString();
    }

    public void graphqlSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, list, null, C4Q5.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.addAll(list);
        }
    }

    public void graphqlUnsubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, null, list, C4Q5.FIRE_AND_FORGET);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.removeAll(list);
        }
    }

    public void initOnMainAppUiCreated() {
        this.mRegionHintController.fetchRegionHintAndPersist();
    }

    public boolean isMqttConnected() {
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null && anonymousClass207.BV8().A00.A00 == C05F.A01) {
            return true;
        }
        return false;
    }

    public void maybeCancelPendingPublish(int i) {
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null) {
            anonymousClass207.Cnv(i);
        }
    }

    public int publishWithCallbacks(String str, byte[] bArr, C4Q5 c4q5, InterfaceC65545TmK interfaceC65545TmK) {
        Publish publish = new Publish(str, bArr, c4q5, interfaceC65545TmK);
        if (this.mMqttClient != null && getMqttTargetState() != -1) {
            return publishWithCallbacksInternal(publish);
        }
        synchronized (this.mPublishes) {
            this.mPublishes.add(publish);
        }
        return -1;
    }

    public void rawSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, list, null, C4Q5.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.addAll(list);
        }
    }

    public void rawUnSubscribeCommand(List list) {
        if (this.mMqttClient != null) {
            sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, null, list, C4Q5.FIRE_AND_FORGET);
        }
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.removeAll(list);
        }
    }

    public void removeAdditionalObserverWithProvider(ObserverProvider observerProvider) {
        synchronized (this.mObservers) {
            this.mAdditionalObserverProviders.remove(observerProvider);
            this.mObservers.remove(observerProvider.get(this.mUserSession));
        }
    }

    public void removeKeepAliveCondition(String str) {
        if (this.mConnectionKeepAliveConditions.remove(str) && this.mConnectionKeepAliveConditions.isEmpty()) {
            stopMqttClient();
        }
    }

    public void removeObserver(Observer observer) {
        synchronized (this.mObservers) {
            this.mObservers.remove(observer);
        }
    }

    public void sendCommand(String str, String str2, MessageDeliveryCallback messageDeliveryCallback) {
        if (this.mMqttClient != null) {
            publish(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE, str2, C4Q5.FIRE_AND_FORGET, false);
            this.mMasterRealtimeEventHandler.onSendRealtimeCommand(str, messageDeliveryCallback);
        } else {
            C0w9.A03(SOFT_ERROR_TAG, "Trying to send command without enabling MQTT");
        }
    }

    public void setProxy(Proxy proxy) {
        this.mProxy = proxy;
        C11T.A02(new Runnable() { // from class: com.instagram.realtimeclient.RealtimeClientManager.15
            @Override // java.lang.Runnable
            public void run() {
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                if (realtimeClientManager.mMqttClient != null || realtimeClientManager.mIsInitializingMqttClient) {
                    realtimeClientManager.mIsInitializingMqttClient = false;
                    realtimeClientManager.destroyMqttClient();
                    RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                    realtimeClientManager2.mMqttClient = null;
                    realtimeClientManager2.startMqttClient();
                }
            }
        });
    }

    public RealtimeClientManager(Context context, UserSession userSession, RealtimeClientConfig realtimeClientConfig, MainRealtimeEventHandler mainRealtimeEventHandler) {
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: com.instagram.realtimeclient.RealtimeClientManager.1
            @Override // X.InterfaceC12870lZ
            public void onAppBackgrounded() {
                int i;
                int A03 = C0f9.A03(-187291162);
                int i2 = RealtimeClientManager.MQTT_STATE_DESTROYED;
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                if (realtimeClientManager.mMqttClient == null) {
                    i = -2097565683;
                } else {
                    realtimeClientManager.updateAppState(false);
                    RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                    realtimeClientManager2.mDelayHandler.removeCallbacks(realtimeClientManager2.mDelayStopRunnable);
                    RealtimeClientManager realtimeClientManager3 = RealtimeClientManager.this;
                    realtimeClientManager3.mDelayHandler.postDelayed(realtimeClientManager3.mDelayStopRunnable, realtimeClientManager3.mRealtimeClientConfig.delayDisconnectMQTTMS);
                    i = 1537877775;
                }
                C0f9.A0A(i, A03);
            }

            @Override // X.InterfaceC12870lZ
            public void onAppForegrounded() {
                int A03 = C0f9.A03(1955666353);
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                realtimeClientManager.mDelayHandler.removeCallbacks(realtimeClientManager.mDelayStopRunnable);
                RealtimeClientManager.this.addKeepAliveCondition(RealtimeClientManager.APP_FOREGROUND_CONDITION);
                RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                if (realtimeClientManager2.mMqttClient != null) {
                    realtimeClientManager2.updateAppState(true);
                }
                C0f9.A0A(1510223431, A03);
            }
        };
        this.mBackgroundDetectorListener = interfaceC12870lZ;
        this.mDelayStopRunnable = new Runnable() { // from class: com.instagram.realtimeclient.RealtimeClientManager.2
            @Override // java.lang.Runnable
            public void run() {
                if (C218914p.A08()) {
                    RealtimeClientManager.this.removeKeepAliveCondition(RealtimeClientManager.APP_FOREGROUND_CONDITION);
                }
            }
        };
        this.mZeroTokenChangeListener = new InterfaceC43641zu() { // from class: com.instagram.realtimeclient.RealtimeClientManager.3
            @Override // X.InterfaceC43641zu
            public synchronized void onTokenChange() {
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                if (realtimeClientManager.mRealtimeMqttClientConfig != null) {
                    RealtimeClientManager.this.mRealtimeMqttClientConfig.setHost(realtimeClientManager.mZeroTokenManager.EL5(RealtimeClientManager.DEFAULT_MQTT_HOST_NAME), RealtimeClientManager.DEFAULT_MQTT_FALLBACK_HOST_NAME, false);
                }
            }
        };
        this.mMqttPublishArrivedListener = new InterfaceC43661zx() { // from class: com.instagram.realtimeclient.RealtimeClientManager.4
            private boolean handleMessageArrived(C5EZ c5ez) {
                List list;
                String str = c5ez.A00;
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                synchronized (realtimeClientManager.mMqttTopicToHandlersMap) {
                    list = (List) RealtimeClientManager.this.mMqttTopicToHandlersMap.get(str);
                }
                synchronized (RealtimeClientManager.this.mObservers) {
                    Iterator it = RealtimeClientManager.this.mObservers.iterator();
                    while (it.hasNext()) {
                        ((Observer) it.next()).onMessage(c5ez);
                    }
                }
                RealtimePayload parse = RealtimePayloadParser.parse(c5ez);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((RealtimeEventHandler) it2.next()).handleRealtimeEvent(c5ez, parse)) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC43661zx
            public void onMessageArrived(C5EZ c5ez) {
                String str;
                if (!handleMessageArrived(c5ez)) {
                    RealtimePayload parse = RealtimePayloadParser.parse(c5ez);
                    String str2 = c5ez.A00;
                    if (parse == null) {
                        str = "null";
                    } else {
                        str = parse.subTopic;
                    }
                    C0w9.A03("no_mqtt_handlers", AnonymousClass001.A0u("No handler is handling MQTT topic: ", str2, ", subTopic: ", str));
                    int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                }
            }
        };
        this.mMqttChannelStateListener = new AnonymousClass201() { // from class: com.instagram.realtimeclient.RealtimeClientManager.5
            @Override // X.AnonymousClass201
            public void onChannelStateChanged(C95094Pu c95094Pu) {
                C0K8.A0A(RealtimeClientManager.TAG, "Channel state: %s", c95094Pu);
                synchronized (RealtimeClientManager.this.mObservers) {
                    Iterator it = RealtimeClientManager.this.mObservers.iterator();
                    while (it.hasNext()) {
                        ((Observer) it.next()).onConnectionChanged(c95094Pu);
                    }
                }
                if (c95094Pu.A00 == C05F.A01) {
                    synchronized (RealtimeClientManager.this.mRawSkywalkerSubscriptions) {
                        if (!RealtimeClientManager.this.mRawSkywalkerSubscriptions.isEmpty()) {
                            RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                            realtimeClientManager.sendSkywalkerCommand(RealtimeConstants.MQTT_TOPIC_SKYWALKER, realtimeClientManager.mRawSkywalkerSubscriptions, null, C4Q5.ACKNOWLEDGED_DELIVERY);
                        }
                    }
                    synchronized (RealtimeClientManager.this.mRealtimeSubscriptions) {
                        if (!RealtimeClientManager.this.mRealtimeSubscriptions.isEmpty()) {
                            RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                            realtimeClientManager2.sendRealtimeSubscription(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimeClientManager2.mRealtimeSubscriptions, null, C4Q5.ACKNOWLEDGED_DELIVERY);
                        }
                    }
                    synchronized (RealtimeClientManager.this.mPublishes) {
                        Iterator it2 = RealtimeClientManager.this.mPublishes.iterator();
                        while (it2.hasNext()) {
                            RealtimeClientManager.this.publishWithCallbacksInternal((Publish) it2.next());
                        }
                        RealtimeClientManager.this.mPublishes.clear();
                    }
                }
                synchronized (RealtimeClientManager.this.mMqttTopicToHandlersMap) {
                    Iterator it3 = RealtimeClientManager.this.mMqttChannelStateChangeListeners.iterator();
                    while (it3.hasNext()) {
                        ((RealtimeEventHandler) it3.next()).onMqttChannelStateChanged(c95094Pu);
                    }
                }
            }
        };
        this.mObservers = new HashSet();
        this.mAdditionalObserverProviders = new HashSet();
        this.mMqttTargetState = -1;
        this.mUserSession = userSession;
        this.mContext = context.getApplicationContext();
        this.mRealtimeClientConfig = realtimeClientConfig;
        this.mMasterRealtimeEventHandler = mainRealtimeEventHandler;
        this.mRegionHintController = new RegionHintController(userSession);
        C218914p.A08.A0A(interfaceC12870lZ);
        C11T.A02(new Runnable() { // from class: com.instagram.realtimeclient.RealtimeClientManager.6
            @Override // java.lang.Runnable
            public void run() {
                if (!C218914p.A08()) {
                    RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                    int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                    realtimeClientManager.mBackgroundDetectorListener.onAppForegrounded();
                }
            }
        });
    }

    private void addSkywalkerAndGraphqlSubscriptions() {
        List list = getRawSkywalkerSubscriptionsProvider().get(this.mUserSession);
        List list2 = getGraphQLSubscriptionsProvider().get(this.mUserSession);
        synchronized (this.mRawSkywalkerSubscriptions) {
            this.mRawSkywalkerSubscriptions.addAll(list);
        }
        synchronized (this.mRealtimeSubscriptions) {
            this.mRealtimeSubscriptions.addAll(list2);
        }
    }

    public static String getLatestMqttHost(InterfaceC26681Qx interfaceC26681Qx) {
        return interfaceC26681Qx.EL5(DEFAULT_MQTT_HOST_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMqttClientInBackground() {
        C93744Je createMqttAuthCredentials = createMqttAuthCredentials();
        if (createMqttAuthCredentials != null) {
            this.mRealtimeClientConfig.loadConfig();
            final RealtimeMqttClientConfig realtimeMqttClientConfig = new RealtimeMqttClientConfig(this.mUserSession, this.mRealtimeClientConfig);
            final InterfaceC26681Qx A00 = C26661Qv.A00(this.mUserSession);
            realtimeMqttClientConfig.setHost(A00.EL5(DEFAULT_MQTT_HOST_NAME), DEFAULT_MQTT_FALLBACK_HOST_NAME, false);
            final AnonymousClass207 createMqttClient = createMqttClient(realtimeMqttClientConfig, createMqttAuthCredentials, initRealtimeEventHandlers());
            collectObservers();
            addSkywalkerAndGraphqlSubscriptions();
            addExternalObservers();
            C11T.A02(new Runnable() { // from class: com.instagram.realtimeclient.RealtimeClientManager.9
                @Override // java.lang.Runnable
                public void run() {
                    RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                    AnonymousClass207 anonymousClass207 = createMqttClient;
                    int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                    realtimeClientManager.mMqttClient = anonymousClass207;
                    realtimeClientManager.mRealtimeMqttClientConfig = realtimeMqttClientConfig;
                    realtimeClientManager.mZeroTokenManager = A00;
                    realtimeClientManager.mZeroTokenChangeListener.onTokenChange();
                    RealtimeClientManager realtimeClientManager2 = RealtimeClientManager.this;
                    realtimeClientManager2.mZeroTokenManager.AAd(realtimeClientManager2.mZeroTokenChangeListener);
                    RealtimeClientManager realtimeClientManager3 = RealtimeClientManager.this;
                    int i2 = realtimeClientManager3.mMqttTargetState;
                    if (i2 != -1) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    realtimeClientManager3.mMqttClient.stop();
                                }
                            } else {
                                realtimeClientManager3.updateAppStateAfterMqttStarted();
                                RealtimeClientManager.this.mMqttClient.start();
                            }
                        } else {
                            realtimeClientManager3.destroyMqttClient();
                        }
                    } else {
                        C0w9.A03(RealtimeClientManager.SOFT_ERROR_TAG, "MQTT status is UNSET after finishing Initialization");
                    }
                    synchronized (RealtimeClientManager.this) {
                        RealtimeClientManager.this.mIsInitializingMqttClient = false;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int publishWithCallbacksInternal(final Publish publish) {
        final long currentTimeMillis = System.currentTimeMillis();
        final String str = new String(publish.mPayload);
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).onSendMessage(publish.mTopicName, str, RealtimeConstants.SEND_ATTEMPT, false, null);
            }
        }
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 == null) {
            C0w9.A03(SOFT_ERROR_TAG, "Trying to call publishWithCallbacksInternal before MQTTClient is initialized");
            return -1;
        }
        String str2 = publish.mTopicName;
        byte[] bArr = publish.mPayload;
        return anonymousClass207.E6o(new C4Q9() { // from class: com.instagram.realtimeclient.RealtimeClientManager.13
            @Override // X.C4Q9
            public void onFailure() {
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                synchronized (realtimeClientManager.mObservers) {
                    Iterator it2 = RealtimeClientManager.this.mObservers.iterator();
                    while (it2.hasNext()) {
                        ((Observer) it2.next()).onSendMessage(publish.mTopicName, str, RealtimeConstants.SEND_FAIL, false, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                }
            }

            @Override // X.C4Q9
            public void onSuccess() {
                RealtimeClientManager realtimeClientManager = RealtimeClientManager.this;
                int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
                synchronized (realtimeClientManager.mObservers) {
                    Iterator it2 = RealtimeClientManager.this.mObservers.iterator();
                    while (it2.hasNext()) {
                        ((Observer) it2.next()).onSendMessage(publish.mTopicName, str, "success", false, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                }
            }
        }, publish.mQos, publish.mCompletionCallacks, str2, bArr);
    }

    private void registerRealtimeEventHandler(RealtimeEventHandler realtimeEventHandler) {
        for (Object obj : realtimeEventHandler.getMqttTopicsToHandle()) {
            List list = (List) this.mMqttTopicToHandlersMap.get(obj);
            if (list == null) {
                list = new ArrayList();
                this.mMqttTopicToHandlersMap.put(obj, list);
            }
            list.add(realtimeEventHandler);
        }
        if (realtimeEventHandler.shouldNotifyMqttChannelStateChanged()) {
            this.mMqttChannelStateChangeListeners.add(realtimeEventHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAppStateAfterMqttStarted() {
        boolean z = !C218914p.A08();
        UserSession userSession = this.mUserSession;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36313390142588849L)) {
            updateAppStateInternal(z, false);
        } else {
            updateAppState(z);
        }
    }

    public boolean isReceivingRealtimeAndForeground() {
        if (isMqttConnected() && !C218914p.A08()) {
            return true;
        }
        return false;
    }

    public boolean isSendingAvailable() {
        return isMqttConnected();
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        destroyMqttClient();
        C218914p.A06(this.mBackgroundDetectorListener);
    }

    public synchronized void publish(String str, byte[] bArr, C4Q5 c4q5, InterfaceC65545TmK interfaceC65545TmK) {
        System.currentTimeMillis();
        AnonymousClass207 anonymousClass207 = this.mMqttClient;
        if (anonymousClass207 != null) {
            anonymousClass207.E6o(null, c4q5, interfaceC65545TmK, str, bArr);
        }
    }
}
