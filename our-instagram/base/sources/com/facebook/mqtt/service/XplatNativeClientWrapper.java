package com.facebook.mqtt.service;

import X.AbstractC09800fd;
import X.AnonymousClass001;
import X.C00O;
import X.C09170dP;
import X.C0K8;
import X.C14360o3;
import X.C20H;
import X.C20K;
import X.C4MW;
import X.C4P5;
import X.C4P9;
import X.C4QA;
import X.YBK;
import X.YBL;
import X.YGL;
import X.YGM;
import android.content.Context;
import com.facebook.jni.CppException;
import com.facebook.jni.HybridData;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class XplatNativeClientWrapper implements C20H {
    public static final C20K Companion = new Object();
    public static final String TAG = "MqttXplatNativeClientWrapper";
    public static final String UPDATE_FOREGROUND_TOPIC = "/t_fs";
    public Executor callbackExecutor;
    public boolean isForeground;
    public HybridData mHybridData;
    public C4P5 stateCallback;
    public final AtomicBoolean started = new AtomicBoolean(false);
    public C4P9 connectionState = C4P9.A06;
    public final HashSet observers = new HashSet();

    private final native synchronized void cancelPublishNative(int i);

    public static final native HybridData initHybrid(ConnectionConfig connectionConfig, ConnectionCallback connectionCallback);

    private final native synchronized int publishExtNative(String str, int i, byte[] bArr, MqttPublishExtListener mqttPublishExtListener);

    private final native synchronized int publishNative(String str, int i, byte[] bArr, MqttPublishListener mqttPublishListener);

    private final native synchronized void setForegroundNative(boolean z);

    private final native synchronized void startNative(Set set, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void stopNative();

    private final native synchronized void subscribeNative(String str, int i, MqttSubscribeListener mqttSubscribeListener);

    private final native synchronized void unsubscribeNative(String str);

    private final native synchronized void updateNetworkInterfaceNative(int i);

    private final native synchronized void updateNetworkStateNative(int i);

    private final native synchronized void updateRegionPreferenceNative(String str);

    private final native synchronized boolean verifyAuthTokenNative(String str);

    public void addObservers(List list) {
        C14360o3.A0B(list, 0);
        this.observers.addAll(list);
    }

    public String getMqttHealthStats() {
        return null;
    }

    @Override // X.C20H
    public void kickOffConnection() {
    }

    @Override // X.C20H
    public boolean start(Context context, final ConnectionConfig connectionConfig, final C4P5 c4p5, final MqttSubscribeListener mqttSubscribeListener) {
        C14360o3.A0B(connectionConfig, 1);
        C14360o3.A0B(c4p5, 2);
        if (!this.started.get()) {
            Executor executor = connectionConfig.callbackExecutor;
            this.callbackExecutor = executor;
            this.connectionState = C4P9.A05;
            this.stateCallback = c4p5;
            this.isForeground = !connectionConfig.isAppInBackground;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: X.4PA
                    @Override // java.lang.Runnable
                    public final void run() {
                        XplatNativeClientWrapper xplatNativeClientWrapper = this;
                        C20K c20k = XplatNativeClientWrapper.Companion;
                        Iterator it = xplatNativeClientWrapper.observers.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw new NullPointerException(AbstractC111324zv.A00(1154));
                        }
                        c4p5.D7G(C4P9.A05);
                    }
                });
                try {
                    this.mHybridData = initHybrid(connectionConfig, new ConnectionCallback() { // from class: X.4PB
                        @Override // com.facebook.mqtt.service.ConnectionCallback
                        public final void onConnectionChanged(int i, String str) {
                            final C4P9 c4p9;
                            C14360o3.A0B(str, 1);
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            c4p9 = C4P9.A04;
                                        } else {
                                            throw new IllegalArgumentException("Invalid Channel State");
                                        }
                                    } else {
                                        c4p9 = C4P9.A03;
                                    }
                                } else {
                                    c4p9 = C4P9.A05;
                                }
                            } else {
                                c4p9 = C4P9.A06;
                            }
                            final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                            C20K c20k = XplatNativeClientWrapper.Companion;
                            if (c4p9 != xplatNativeClientWrapper.connectionState) {
                                xplatNativeClientWrapper.connectionState = c4p9;
                                Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                                if (executor2 == null) {
                                    C14360o3.A0F("callbackExecutor");
                                    throw C00O.createAndThrow();
                                }
                                executor2.execute(new Runnable() { // from class: X.4Q3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C4P9 c4p92 = c4p9;
                                        if (c4p92 == C4P9.A05) {
                                            XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                            C20K c20k2 = XplatNativeClientWrapper.Companion;
                                            Iterator it = xplatNativeClientWrapper2.observers.iterator();
                                            if (it.hasNext()) {
                                                it.next();
                                                throw new NullPointerException(AbstractC111324zv.A00(1154));
                                            }
                                        } else if (c4p92 == C4P9.A04) {
                                            XplatNativeClientWrapper xplatNativeClientWrapper3 = xplatNativeClientWrapper;
                                            C20K c20k3 = XplatNativeClientWrapper.Companion;
                                            Iterator it2 = xplatNativeClientWrapper3.observers.iterator();
                                            if (it2.hasNext()) {
                                                it2.next();
                                                throw new NullPointerException(AbstractC111324zv.A00(2816));
                                            }
                                        } else if (c4p92 == C4P9.A06) {
                                            XplatNativeClientWrapper xplatNativeClientWrapper4 = xplatNativeClientWrapper;
                                            C20K c20k4 = XplatNativeClientWrapper.Companion;
                                            Iterator it3 = xplatNativeClientWrapper4.observers.iterator();
                                            if (it3.hasNext()) {
                                                it3.next();
                                                throw new NullPointerException(AbstractC111324zv.A00(1155));
                                            }
                                        }
                                        XplatNativeClientWrapper xplatNativeClientWrapper5 = xplatNativeClientWrapper;
                                        C20K c20k5 = XplatNativeClientWrapper.Companion;
                                        C4P5 c4p52 = xplatNativeClientWrapper5.stateCallback;
                                        if (c4p52 == null) {
                                            C14360o3.A0F("stateCallback");
                                            throw C00O.createAndThrow();
                                        }
                                        c4p52.D7G(c4p92);
                                    }
                                });
                            }
                        }

                        @Override // com.facebook.mqtt.service.ConnectionCallback
                        public final void onMessageDropped(String str, byte[] bArr, long j) {
                            C14360o3.A0B(str, 0);
                            C14360o3.A0B(bArr, 1);
                            XplatNativeClientWrapper xplatNativeClientWrapper = this;
                            C20K c20k = XplatNativeClientWrapper.Companion;
                            Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                            if (executor2 == null) {
                                C14360o3.A0F("callbackExecutor");
                                throw C00O.createAndThrow();
                            }
                            executor2.execute(new YIY(xplatNativeClientWrapper, str, bArr, j));
                        }

                        @Override // com.facebook.mqtt.service.ConnectionCallback
                        public final void onConnectionError(int i) {
                            Integer num;
                            if (i != 3005) {
                                if (i != 3010) {
                                    if (i != 3013) {
                                        if (i != 3014) {
                                            num = C05F.A00;
                                        } else {
                                            num = C05F.A0C;
                                        }
                                    } else {
                                        num = C05F.A01;
                                    }
                                } else {
                                    num = C05F.A0Y;
                                }
                            } else {
                                num = C05F.A0N;
                            }
                            XplatNativeClientWrapper xplatNativeClientWrapper = this;
                            C20K c20k = XplatNativeClientWrapper.Companion;
                            Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                            if (executor2 == null) {
                                C14360o3.A0F("callbackExecutor");
                                throw C00O.createAndThrow();
                            }
                            executor2.execute(new YI7(connectionConfig, xplatNativeClientWrapper, num));
                        }
                    });
                    startNative(connectionConfig.subscribeTopics, 1, new MqttSubscribeListener() { // from class: X.4PD
                        @Override // com.facebook.mqtt.service.MqttSubscribeListener
                        public final void onData(final String str, final byte[] bArr, final long j) {
                            C14360o3.A0B(str, 0);
                            C14360o3.A0B(bArr, 1);
                            final MqttSubscribeListener mqttSubscribeListener2 = MqttSubscribeListener.this;
                            if (mqttSubscribeListener2 != null) {
                                final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                                C20K c20k = XplatNativeClientWrapper.Companion;
                                Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                                if (executor2 == null) {
                                    C14360o3.A0F("callbackExecutor");
                                    throw C00O.createAndThrow();
                                }
                                executor2.execute(new Runnable() { // from class: X.5EY
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                        C20K c20k2 = XplatNativeClientWrapper.Companion;
                                        Iterator it = xplatNativeClientWrapper2.observers.iterator();
                                        if (it.hasNext()) {
                                            it.next();
                                            throw new NullPointerException("onData");
                                        }
                                        mqttSubscribeListener2.onData(str, bArr, j);
                                    }
                                });
                            }
                        }

                        @Override // com.facebook.mqtt.service.MqttSubscribeListener
                        public final void onSubscriptionResponse(final String str, final boolean z, final int i) {
                            C14360o3.A0B(str, 0);
                            final MqttSubscribeListener mqttSubscribeListener2 = MqttSubscribeListener.this;
                            if (mqttSubscribeListener2 != null) {
                                final XplatNativeClientWrapper xplatNativeClientWrapper = this;
                                C20K c20k = XplatNativeClientWrapper.Companion;
                                Executor executor2 = xplatNativeClientWrapper.callbackExecutor;
                                if (executor2 == null) {
                                    C14360o3.A0F("callbackExecutor");
                                    throw C00O.createAndThrow();
                                }
                                executor2.execute(new Runnable() { // from class: X.5SD
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        XplatNativeClientWrapper xplatNativeClientWrapper2 = xplatNativeClientWrapper;
                                        C20K c20k2 = XplatNativeClientWrapper.Companion;
                                        Iterator it = xplatNativeClientWrapper2.observers.iterator();
                                        if (it.hasNext()) {
                                            it.next();
                                            throw new NullPointerException("onSubscription");
                                        }
                                        mqttSubscribeListener2.onSubscriptionResponse(str, z, i);
                                    }
                                });
                            }
                        }
                    });
                    if (this.started.compareAndSet(false, true)) {
                        return true;
                    }
                    throw new IllegalStateException("Client already initialized");
                } catch (CppException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error starting client with config:");
                    sb.append(connectionConfig);
                    C0K8.A0F(TAG, sb.toString(), e);
                    this.connectionState = C4P9.A06;
                    Executor executor2 = this.callbackExecutor;
                    if (executor2 != null) {
                        executor2.execute(new YGL(c4p5));
                        return false;
                    }
                }
            }
            C14360o3.A0F("callbackExecutor");
            throw C00O.createAndThrow();
        }
        throw new IllegalStateException("Client already initialized");
    }

    @Override // X.C20H
    public boolean verifyAuthToken(String str) {
        C14360o3.A0B(str, 0);
        return verifyAuthTokenNative(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.20K] */
    static {
        C09170dP.A0C("xplatmqttclient-jni");
    }

    @Override // X.C20H
    public boolean cancelPublish(int i) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                cancelPublishNative(i);
                return true;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error cancelling publish with id:");
                sb.append(i);
                C0K8.A0F(TAG, sb.toString(), e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error cancelling publish with id:");
                sb.append(i);
                sb.append(". No native client");
                C0K8.A0F(TAG, sb.toString(), e);
                return false;
            }
        }
        throw new IllegalStateException("Cannot cancel publish if not started");
    }

    public C4P9 getConnectionState() {
        return this.connectionState;
    }

    public boolean isConnected() {
        if (this.connectionState != C4P9.A04) {
            return false;
        }
        return true;
    }

    public boolean isConnectedOrConnecting() {
        C4P9 c4p9 = this.connectionState;
        if (c4p9 != C4P9.A03 && c4p9 != C4P9.A04 && c4p9 != C4P9.A05) {
            return false;
        }
        return true;
    }

    public final boolean isStarted() {
        return this.started.get();
    }

    @Override // X.C20H
    public void onNetworkAvailable() {
        String str;
        if (this.started.get()) {
            try {
                updateNetworkStateNative(1);
                return;
            } catch (CppException e) {
                e = e;
                str = "Error notifying network available";
                C0K8.A0F(TAG, str, e);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error notifying network available. No native client";
                C0K8.A0F(TAG, str, e);
                return;
            }
        }
        throw new IllegalStateException("Cannot set network available if not started");
    }

    @Override // X.C20H
    public void onNetworkInterfaceChanged(int i) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                updateNetworkInterfaceNative(i);
                Iterator it = this.observers.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onNetworkInterfaceChanged");
                }
                return;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error notifying network interface changed to ");
                sb.append(i);
                C0K8.A0F(TAG, sb.toString(), e);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error notifying network changed to ");
                sb.append(i);
                sb.append(". No native client");
                C0K8.A0F(TAG, sb.toString(), e);
                return;
            }
        }
        throw new IllegalStateException("Cannot set network interface if not started");
    }

    @Override // X.C20H
    public void onNetworkUnavailable() {
        String str;
        if (this.started.get()) {
            try {
                updateNetworkStateNative(2);
                return;
            } catch (CppException e) {
                e = e;
                str = "Error notifying network unavailable";
                C0K8.A0F(TAG, str, e);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error notifying network unavailable. No native client";
                C0K8.A0F(TAG, str, e);
                return;
            }
        }
        throw new IllegalStateException("Cannot set network unavailable if not started");
    }

    @Override // X.C20H
    public int publish(final String str, final byte[] bArr, C4QA c4qa, final MqttPublishListener mqttPublishListener) {
        int i;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(bArr, 1);
        C14360o3.A0B(c4qa, 2);
        if (this.started.get()) {
            AbstractC09800fd.A01(AnonymousClass001.A0R("mqtt:publish:", str), -928583546);
            try {
                try {
                    try {
                        final int incrementAndGet = C4MW.A05.incrementAndGet();
                        publishNative(str, c4qa.ordinal(), bArr, new MqttPublishListener() { // from class: X.4QB
                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public final void onFailure(int i2, int i3) {
                                int i4 = incrementAndGet;
                                AbstractC09800fd.A01(AnonymousClass001.A0g("mqtt:puback:", str, ":fail"), 669340791);
                                MqttPublishListener mqttPublishListener2 = mqttPublishListener;
                                if (mqttPublishListener2 != null) {
                                    XplatNativeClientWrapper xplatNativeClientWrapper = this;
                                    byte[] bArr2 = bArr;
                                    C20K c20k = XplatNativeClientWrapper.Companion;
                                    Executor executor = xplatNativeClientWrapper.callbackExecutor;
                                    if (executor == null) {
                                        C14360o3.A0F("callbackExecutor");
                                        throw C00O.createAndThrow();
                                    }
                                    executor.execute(new RunnableC73536YIh(mqttPublishListener2, xplatNativeClientWrapper, bArr2, i4, i3));
                                }
                                AbstractC09800fd.A00(869379229);
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public final void onSuccess(int i2) {
                                int i3 = incrementAndGet;
                                AbstractC09800fd.A01(AnonymousClass001.A0g("mqtt:puback:", str, ":success"), -498907978);
                                MqttPublishListener mqttPublishListener2 = mqttPublishListener;
                                if (mqttPublishListener2 != null) {
                                    XplatNativeClientWrapper xplatNativeClientWrapper = this;
                                    byte[] bArr2 = bArr;
                                    C20K c20k = XplatNativeClientWrapper.Companion;
                                    Executor executor = xplatNativeClientWrapper.callbackExecutor;
                                    if (executor == null) {
                                        C14360o3.A0F("callbackExecutor");
                                        throw C00O.createAndThrow();
                                    }
                                    executor.execute(new YIX(mqttPublishListener2, xplatNativeClientWrapper, bArr2, i3));
                                }
                                AbstractC09800fd.A00(447638920);
                            }

                            @Override // com.facebook.mqtt.service.MqttPublishListener
                            public final void onTimeout(int i2, boolean z) {
                                int i3 = incrementAndGet;
                                AbstractC09800fd.A01(AnonymousClass001.A0g("mqtt:puback:", str, ":timeout"), -1984710829);
                                MqttPublishListener mqttPublishListener2 = mqttPublishListener;
                                if (mqttPublishListener2 != null) {
                                    XplatNativeClientWrapper xplatNativeClientWrapper = this;
                                    byte[] bArr2 = bArr;
                                    C20K c20k = XplatNativeClientWrapper.Companion;
                                    Executor executor = xplatNativeClientWrapper.callbackExecutor;
                                    if (executor == null) {
                                        C14360o3.A0F("callbackExecutor");
                                        throw C00O.createAndThrow();
                                    }
                                    executor.execute(new RunnableC73537YIi(mqttPublishListener2, xplatNativeClientWrapper, bArr2, i3, z));
                                }
                                AbstractC09800fd.A00(1214057830);
                            }
                        });
                        AbstractC09800fd.A00(605142803);
                        return incrementAndGet;
                    } catch (CppException e) {
                        C0K8.A0F(TAG, AnonymousClass001.A0R("Error publishing to topic:", str), e);
                        i = -1510967504;
                        AbstractC09800fd.A00(i);
                        return -1;
                    }
                } catch (NullPointerException e2) {
                    C0K8.A0F(TAG, AnonymousClass001.A0g("Error publishing to topic:", str, ". No native client"), e2);
                    i = 621019430;
                    AbstractC09800fd.A00(i);
                    return -1;
                }
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1982300446);
                throw th;
            }
        }
        throw new IllegalStateException("Cannot publish if not started");
    }

    public int publishExt(String str, byte[] bArr, C4QA c4qa, MqttPublishExtListener mqttPublishExtListener) {
        int i;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(bArr, 1);
        C14360o3.A0B(c4qa, 2);
        C14360o3.A0B(mqttPublishExtListener, 3);
        if (this.started.get()) {
            AbstractC09800fd.A01(AnonymousClass001.A0R("mqtt:publish:", str), -249237317);
            try {
                try {
                    try {
                        int incrementAndGet = C4MW.A05.incrementAndGet();
                        publishExtNative(str, c4qa.ordinal(), bArr, new YBK(mqttPublishExtListener, this, str, bArr, incrementAndGet));
                        AbstractC09800fd.A00(-700027572);
                        return incrementAndGet;
                    } catch (CppException e) {
                        C0K8.A0F(TAG, AnonymousClass001.A0R("Error publishingExt to topic:", str), e);
                        i = -32485555;
                        AbstractC09800fd.A00(i);
                        return -1;
                    }
                } catch (NullPointerException e2) {
                    C0K8.A0F(TAG, AnonymousClass001.A0g("Error publishingExt to topic:", str, ". No native client"), e2);
                    i = 1519869827;
                    AbstractC09800fd.A00(i);
                    return -1;
                }
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1472002055);
                throw th;
            }
        }
        throw new IllegalStateException("Cannot publishExt if not started");
    }

    @Override // X.C20H
    public void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        StringBuilder sb;
        if (this.started.get()) {
            try {
                setForegroundNative(z);
                if (this.isForeground != z) {
                    this.isForeground = z;
                    if (bArr != null) {
                        publish(UPDATE_FOREGROUND_TOPIC, bArr, C4QA.A02, mqttPublishListener);
                        return;
                    }
                    return;
                }
                return;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error notifying foreground ");
                sb.append(z);
                C0K8.A0F(TAG, sb.toString(), e);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error notifying foreground ");
                sb.append(z);
                sb.append(". No native client");
                C0K8.A0F(TAG, sb.toString(), e);
                return;
            }
        }
        throw new IllegalStateException("Cannot set foreground if not started");
    }

    @Override // X.C20H
    public void stop() {
        String str;
        if (this.started.compareAndSet(true, false)) {
            try {
                stopNative();
                HybridData hybridData = this.mHybridData;
                if (hybridData == null) {
                    C14360o3.A0F("mHybridData");
                } else {
                    hybridData.resetNative();
                    this.connectionState = C4P9.A06;
                    Executor executor = this.callbackExecutor;
                    if (executor == null) {
                        C14360o3.A0F("callbackExecutor");
                    } else {
                        executor.execute(new YGM(this));
                        return;
                    }
                }
                throw C00O.createAndThrow();
            } catch (CppException e) {
                e = e;
                str = "Error stopping client";
                C0K8.A0F(TAG, str, e);
                return;
            } catch (NullPointerException e2) {
                e = e2;
                str = "Error stopping client. No native client";
                C0K8.A0F(TAG, str, e);
                return;
            }
        }
        throw new IllegalStateException("Client already stopped");
    }

    @Override // X.C20H
    public boolean subscribe(String str, C4QA c4qa, MqttSubscribeListener mqttSubscribeListener) {
        StringBuilder sb;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c4qa, 1);
        C14360o3.A0B(mqttSubscribeListener, 2);
        if (this.started.get()) {
            try {
                subscribeNative(str, c4qa.ordinal(), new YBL(mqttSubscribeListener, this));
                return true;
            } catch (CppException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Error subscribing to topic:");
                sb.append(str);
                C0K8.A0F(TAG, sb.toString(), e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Error subscribing to topic:");
                sb.append(str);
                str = ". No native client";
                sb.append(str);
                C0K8.A0F(TAG, sb.toString(), e);
                return false;
            }
        }
        throw new IllegalStateException("Cannot subscribe if not started");
    }

    @Override // X.C20H
    public boolean unsubscribe(List list) {
        StringBuilder sb;
        C14360o3.A0B(list, 0);
        if (this.started.get()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    unsubscribeNative(str);
                } catch (CppException e) {
                    e = e;
                    sb = new StringBuilder();
                    sb.append("Error unsubscribing from topic:");
                    sb.append(str);
                    C0K8.A0F(TAG, sb.toString(), e);
                    return false;
                } catch (NullPointerException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    sb.append("Error unsubscribing from topic:");
                    sb.append(str);
                    str = ". No native client";
                    sb.append(str);
                    C0K8.A0F(TAG, sb.toString(), e);
                    return false;
                }
            }
            Iterator it2 = this.observers.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException("onUnsubscribe");
            }
            return true;
        }
        throw new IllegalStateException("Cannot unsubscribe if not started");
    }

    public void updateRegionPreference(String str) {
        StringBuilder sb;
        C14360o3.A0B(str, 0);
        if (str.length() != 0) {
            if (this.started.get()) {
                try {
                    updateRegionPreferenceNative(str);
                    return;
                } catch (CppException e) {
                    e = e;
                    sb = new StringBuilder();
                    sb.append("Error setting Region pref = ");
                    sb.append(str);
                    C0K8.A0F(TAG, sb.toString(), e);
                    return;
                } catch (NullPointerException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    sb.append("Error setting Region pref = ");
                    sb.append(str);
                    str = ". No native client";
                    sb.append(str);
                    C0K8.A0F(TAG, sb.toString(), e);
                    return;
                }
            }
            throw new IllegalStateException("Cannot set region pref if not started");
        }
    }
}
