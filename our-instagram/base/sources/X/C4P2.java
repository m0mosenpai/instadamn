package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.DeadObjectException;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import org.webrtc.NetworkMonitor;

/* renamed from: X.4P2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4P2 implements C20H {
    public C20H A00;
    public C4PK A01;
    public final Context A02;
    public final AnonymousClass209 A03;
    public final C20H A04;
    public final C4P3 A05;

    public C4P2(Context context, AnonymousClass209 anonymousClass209, C20H c20h) {
        C14360o3.A0B(anonymousClass209, 2);
        this.A04 = c20h;
        this.A03 = anonymousClass209;
        this.A02 = context;
        this.A05 = new C4P3(this);
    }

    @Override // X.C20H
    public final void onNetworkAvailable() {
    }

    @Override // X.C20H
    public final void onNetworkInterfaceChanged(int i) {
    }

    @Override // X.C20H
    public final void onNetworkUnavailable() {
    }

    @Override // X.C20H
    public final boolean start(Context context, ConnectionConfig connectionConfig, C4P5 c4p5, MqttSubscribeListener mqttSubscribeListener) {
        String str;
        C14360o3.A0B(context, 0);
        C20H c20h = this.A04;
        if (c20h.start(context, connectionConfig, c4p5, mqttSubscribeListener)) {
            this.A00 = c20h;
            C4PJ c4pj = new C4PJ(this.A05);
            try {
                Object systemService = context.getSystemService("connectivity");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).addTransportType(4).addTransportType(2).build(), c4pj.A00);
            } catch (IllegalArgumentException e) {
                e = e;
                str = "Illegal arguments. Updates will not be reported";
                C0K8.A0F(NetworkMonitor.TAG, str, e);
                this.A01 = c4pj;
                return true;
            } catch (SecurityException e2) {
                e = e2;
                str = "Error listening for network updates. Updates will not be reported";
                C0K8.A0F(NetworkMonitor.TAG, str, e);
                this.A01 = c4pj;
                return true;
            } catch (RuntimeException e3) {
                e = e3;
                str = "Too many listeners. Updates will not be reported";
                C0K8.A0F(NetworkMonitor.TAG, str, e);
                this.A01 = c4pj;
                return true;
            }
            this.A01 = c4pj;
            return true;
        }
        return false;
    }

    @Override // X.C20H
    public final void stop() {
        String str;
        this.A00 = null;
        C4PK c4pk = this.A01;
        if (c4pk != null) {
            C4PJ c4pj = (C4PJ) c4pk;
            try {
                Object systemService = this.A02.getSystemService("connectivity");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).unregisterNetworkCallback(c4pj.A00);
            } catch (IllegalArgumentException e) {
                e = e;
                str = "Invalid argument when stopping listening for network updates.";
                C0K8.A0F(NetworkMonitor.TAG, str, e);
                this.A01 = null;
                this.A04.stop();
            } catch (SecurityException e2) {
                e = e2;
                str = "Error stopping listening for network updates.";
                C0K8.A0F(NetworkMonitor.TAG, str, e);
                this.A01 = null;
                this.A04.stop();
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "Too many listeners. Updates will not be reported";
                    C0K8.A0F(NetworkMonitor.TAG, str, e);
                    this.A01 = null;
                    this.A04.stop();
                }
                throw e;
            }
        }
        this.A01 = null;
        this.A04.stop();
    }

    @Override // X.C20H
    public final boolean subscribe(String str, C4QA c4qa, MqttSubscribeListener mqttSubscribeListener) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c4qa, 1);
        C14360o3.A0B(mqttSubscribeListener, 2);
        return this.A04.subscribe(str, c4qa, mqttSubscribeListener);
    }

    @Override // X.C20H
    public final boolean verifyAuthToken(String str) {
        C14360o3.A0B(str, 0);
        return this.A04.verifyAuthToken(str);
    }

    @Override // X.C20H
    public final boolean cancelPublish(int i) {
        return this.A04.cancelPublish(i);
    }

    @Override // X.C20H
    public final void kickOffConnection() {
        this.A04.kickOffConnection();
    }

    @Override // X.C20H
    public final int publish(String str, byte[] bArr, C4QA c4qa, MqttPublishListener mqttPublishListener) {
        return this.A04.publish(str, bArr, c4qa, mqttPublishListener);
    }

    @Override // X.C20H
    public final void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        this.A04.setForeground(z, bArr, mqttPublishListener);
    }

    @Override // X.C20H
    public final boolean unsubscribe(List list) {
        return this.A04.unsubscribe(list);
    }
}
