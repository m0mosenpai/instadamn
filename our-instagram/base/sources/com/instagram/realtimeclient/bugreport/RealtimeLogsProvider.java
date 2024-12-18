package com.instagram.realtimeclient.bugreport;

import X.AbstractC09440dt;
import X.C0K8;
import X.C14360o3;
import X.InterfaceC08830cm;
import X.InterfaceC09390do;
import X.InterfaceC449925e;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class RealtimeLogsProvider implements InterfaceC449925e {
    public static final Companion Companion = new Object();
    public static final String LOG_PREFIX = "realtime_client";
    public static final String LOG_SUFFIX = ".json";
    public static final String TAG = "realtimeClientManagerProvider";
    public final String filenamePrefix;
    public final String filenameSuffix;
    public final InterfaceC09390do realtimeClientManager$delegate;
    public final InterfaceC08830cm realtimeClientManagerProvider;
    public final String tag;

    public static final RealtimeLogsProvider create(UserSession userSession) {
        return Companion.create(userSession);
    }

    public /* synthetic */ boolean getShouldGzip() {
        return true;
    }

    @Override // X.InterfaceC449925e
    public /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    private final RealtimeClientManager getRealtimeClientManager() {
        Object value = this.realtimeClientManager$delegate.getValue();
        C14360o3.A07(value);
        return (RealtimeClientManager) value;
    }

    @Override // X.InterfaceC449925e
    public String getContentInBackground(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_mqtt_connected", getRealtimeClientManager().isMqttConnected());
            jSONObject.put("mqtt_target_state", getRealtimeClientManager().getMqttTargetState());
            jSONObject.put("is_receiving_realtime_and_foreground", getRealtimeClientManager().isReceivingRealtimeAndForeground());
            return jSONObject.toString();
        } catch (JSONException e) {
            C0K8.A0F("RealtimeLogsProvider", "Failed to generate content", e);
            return null;
        }
    }

    @Override // X.InterfaceC449925e
    public String getFilenamePrefix() {
        return this.filenamePrefix;
    }

    @Override // X.InterfaceC449925e
    public String getFilenameSuffix() {
        return this.filenameSuffix;
    }

    @Override // X.InterfaceC449925e
    public String getTag() {
        return this.tag;
    }

    public RealtimeLogsProvider(InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 1);
        this.realtimeClientManagerProvider = interfaceC08830cm;
        this.realtimeClientManager$delegate = AbstractC09440dt.A01(new RealtimeLogsProvider$realtimeClientManager$2(this));
        this.filenamePrefix = LOG_PREFIX;
        this.filenameSuffix = LOG_SUFFIX;
        this.tag = TAG;
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final RealtimeLogsProvider create(final UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return new RealtimeLogsProvider(new InterfaceC08830cm() { // from class: com.instagram.realtimeclient.bugreport.RealtimeLogsProvider$Companion$create$1
                @Override // X.InterfaceC08830cm
                public final RealtimeClientManager get() {
                    return RealtimeClientManager.getInstance(UserSession.this);
                }

                @Override // X.InterfaceC08830cm
                public /* bridge */ /* synthetic */ Object get() {
                    return RealtimeClientManager.getInstance(UserSession.this);
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
