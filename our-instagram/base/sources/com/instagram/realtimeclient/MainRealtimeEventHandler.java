package com.instagram.realtimeclient;

import X.AnonymousClass001;
import X.C0w9;
import X.C11T;
import X.C13920nI;
import X.C5EZ;
import X.EnumC81843l3;
import X.MSY;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.DirectRealtimePayload;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeEvent;
import com.instagram.realtimeclient.regionhint.RegionHintController;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MainRealtimeEventHandler extends DirectRealtimeEventHandler {
    public static final Class TAG = MainRealtimeEventHandler.class;
    public final C13920nI mClock;
    public final RegionHintController mRegionHintController;
    public static final Handler MAIN_THREAD_HANDLER = new Handler(Looper.getMainLooper());
    public static final Charset CHARSET_UTF8 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final long TTL_MS = TimeUnit.SECONDS.toMillis(10);
    public final RealtimeStore mStore = new RealtimeStore();
    public final List mSupportedSkywalkerMessageTypes = new ArrayList();
    public final Map mMessageDeliveryCallbacks = new HashMap();
    public final Runnable mTimeoutCallback = new Runnable() { // from class: com.instagram.realtimeclient.MainRealtimeEventHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            MainRealtimeEventHandler.this.onTimeout();
        }
    };
    public final Map mProtocolDelegates = new HashMap();

    /* loaded from: classes2.dex */
    public interface Delegate {
        String getProtocol();

        int getSkywalkerMessageType();

        void handleRealtimeOperation(RealtimeOperation realtimeOperation);
    }

    /* renamed from: com.instagram.realtimeclient.MainRealtimeEventHandler$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$realtimeclient$DirectRealtimePayload$Action;

        static {
            int[] iArr = new int[DirectRealtimePayload.Action.values().length];
            $SwitchMap$com$instagram$realtimeclient$DirectRealtimePayload$Action = iArr;
            try {
                MSY.A1I(DirectRealtimePayload.Action.ACK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(DirectRealtimePayload.Action.UNSEEN_COUNT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static MainRealtimeEventHandler create(UserSession userSession) {
        return new MainRealtimeEventHandler(C13920nI.A00, new RegionHintController(userSession));
    }

    private Delegate getDelegateForOperation(String str) {
        for (Map.Entry entry : this.mProtocolDelegates.entrySet()) {
            if (str.startsWith((String) entry.getKey())) {
                return (Delegate) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOperation(RealtimeOperation realtimeOperation) {
        Delegate delegateForOperation = getDelegateForOperation(realtimeOperation.path);
        if (delegateForOperation != null) {
            delegateForOperation.handleRealtimeOperation(realtimeOperation);
            return;
        }
        String name = TAG.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("Operation not handled, op: ");
        sb.append(realtimeOperation.op);
        sb.append(" path: ");
        sb.append(realtimeOperation.path);
        sb.append(" val: ");
        sb.append(realtimeOperation.value);
        C0w9.A03(name, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAckEvent(String str, Integer num, String str2, String str3, boolean z, EnumC81843l3 enumC81843l3, String str4, String str5, long j, Long l, String str6, boolean z2, boolean z3) {
        RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback = (RealtimeClientManager.MessageDeliveryCallback) this.mMessageDeliveryCallbacks.remove(str);
        if (messageDeliveryCallback != null) {
            if (num != null && num.intValue() == 200) {
                messageDeliveryCallback.onSuccess(str4, str5, j, l);
            } else {
                messageDeliveryCallback.onFailure(num, str2, str3, z, enumC81843l3, str6, z2, z3);
            }
        }
    }

    private void onDirectEvent(final RealtimeEvent realtimeEvent) {
        C11T.A02(new Runnable() { // from class: com.instagram.realtimeclient.MainRealtimeEventHandler.1
            @Override // java.lang.Runnable
            public void run() {
                RealtimeEvent realtimeEvent2 = realtimeEvent;
                if (realtimeEvent2.action.ordinal() == 0) {
                    MainRealtimeEventHandler mainRealtimeEventHandler = MainRealtimeEventHandler.this;
                    DirectRealtimePayload directRealtimePayload = realtimeEvent2.payload;
                    String str = directRealtimePayload.clientRequestId;
                    if (str == null) {
                        str = directRealtimePayload.clientContext;
                    }
                    mainRealtimeEventHandler.onAckEvent(str, realtimeEvent2.statusCode, directRealtimePayload.message, directRealtimePayload.clientFacingErrorMessage, directRealtimePayload.isEpdError, directRealtimePayload.throttlingType, directRealtimePayload.threadId, directRealtimePayload.itemId, directRealtimePayload.timestamp, directRealtimePayload.ttlMs, directRealtimePayload.errorCode, directRealtimePayload.canSeeNotes, directRealtimePayload.canSeeBroadcastChats);
                }
            }
        });
    }

    private void onPatchEvent(final RealtimeEvent realtimeEvent) {
        C11T.A02(new Runnable() { // from class: com.instagram.realtimeclient.MainRealtimeEventHandler.2
            @Override // java.lang.Runnable
            public void run() {
                for (RealtimeOperation realtimeOperation : realtimeEvent.operations) {
                    if (MainRealtimeEventHandler.this.mStore.patchStoreWithOperation(realtimeOperation)) {
                        MainRealtimeEventHandler.this.handleOperation(realtimeOperation);
                    }
                }
            }
        });
    }

    public void addProtocolDelegate(String str, Delegate delegate) {
        this.mProtocolDelegates.put(str, delegate);
        this.mSupportedSkywalkerMessageTypes.add(Integer.valueOf(delegate.getSkywalkerMessageType()));
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public List getMqttTopicsToHandle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
        arrayList.add(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
        arrayList.addAll(this.mRegionHintController.getMqttTopicsToHandle());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
        String str = c5ez.A00;
        try {
            switch (str.hashCode()) {
                case -931817442:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
                        onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(new String(c5ez.A01, CHARSET_UTF8)));
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 145554904:
                    if (str.equals("/t_region_hint")) {
                        return this.mRegionHintController.handleRealtimeEvent(c5ez.A01);
                    }
                    throw new IllegalArgumentException();
                case 1943914206:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE)) {
                        if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(realtimePayload.subTopic)) {
                            onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(realtimePayload.stringPayload));
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException();
                case 2080550674:
                    if (str.equals(RealtimeConstants.MQTT_TOPIC_SKYWALKER)) {
                        if (this.mSupportedSkywalkerMessageTypes.contains(Integer.valueOf(realtimePayload.subTopic))) {
                            onRealtimeEvent(str, RealtimeEvent__JsonHelper.parseFromJson(realtimePayload.stringPayload));
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException();
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing realtime event from skywalker", e);
        }
    }

    @Override // com.instagram.realtimeclient.DirectRealtimeEventHandler
    public void onRealtimeEvent(String str, RealtimeEvent realtimeEvent) {
        if (realtimeEvent.action != null) {
            onDirectEvent(realtimeEvent);
        } else {
            if (realtimeEvent.type != RealtimeEvent.Type.PATCH) {
                return;
            }
            onPatchEvent(realtimeEvent);
        }
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public void onSendRealtimeCommand(String str, RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback) {
        if (str != null) {
            if (messageDeliveryCallback != null) {
                messageDeliveryCallback.mStartSendingTimestampInMs = SystemClock.uptimeMillis();
                this.mMessageDeliveryCallbacks.put(str, messageDeliveryCallback);
            }
        } else if (messageDeliveryCallback != null) {
            C0w9.A04("MainRealtimeEventHandler_onSendRealtimeCommand_invalid_callback", AnonymousClass001.A0R("Invalid clientRequestId: ", str), 1);
        }
        Handler handler = MAIN_THREAD_HANDLER;
        handler.removeCallbacks(this.mTimeoutCallback);
        handler.postDelayed(this.mTimeoutCallback, TTL_MS);
    }

    public void onTimeout() {
        Iterator it = this.mMessageDeliveryCallbacks.values().iterator();
        long uptimeMillis = SystemClock.uptimeMillis();
        while (it.hasNext()) {
            RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback = (RealtimeClientManager.MessageDeliveryCallback) it.next();
            if (uptimeMillis - messageDeliveryCallback.mStartSendingTimestampInMs >= TTL_MS) {
                it.remove();
                messageDeliveryCallback.onTimeout();
            }
        }
    }

    public MainRealtimeEventHandler(C13920nI c13920nI, RegionHintController regionHintController) {
        this.mClock = c13920nI;
        this.mRegionHintController = regionHintController;
    }

    @Override // com.instagram.realtimeclient.RealtimeEventHandler
    public boolean canHandleRealtimeEvent(String str, String str2) {
        switch (str.hashCode()) {
            case -931817442:
                if (str.equals(RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE_RESPONSE)) {
                    return true;
                }
                break;
            case 145554904:
                if (str.equals("/t_region_hint")) {
                    return this.mRegionHintController.canHandleRealtimeEvent(str);
                }
                break;
            case 1943914206:
                if (str.equals(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE)) {
                    return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(str2);
                }
                break;
        }
        if (str2 == null || !this.mSupportedSkywalkerMessageTypes.contains(Integer.valueOf(str2))) {
            return false;
        }
        return true;
    }
}
