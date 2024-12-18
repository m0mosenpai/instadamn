package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.ShC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63306ShC {
    public static final AtomicLong A0B = AbstractC58318PtA.A15(0);
    public final Context A00;
    public final InterfaceC65618To9 A01;
    public final SBU A02;
    public final C63006SaU A03;
    public final InterfaceC93784Jk A07;
    public final C4N2 A08;
    public final String A09;
    public final String A0A;
    public final long A06 = SystemClock.elapsedRealtime();
    public final long A05 = Process.myPid();
    public final long A04 = A0B.incrementAndGet();

    public final void A04(String str, long j, int i, int i2, int i3, long j2) {
        A06("mqtt_publish_debug", AbstractC62801SRv.A01("result", "success", "operation", str, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "timespan_ms", Long.toString(j), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j2)));
    }

    public final void A05(String str, String str2, Throwable th, int i, int i2, int i3, long j) {
        HashMap A01 = AbstractC62801SRv.A01("result", str, "operation", str2, TraceFieldType.QoS, Integer.toString(i), TraceFieldType.MsgId, Integer.toString(i2), "original_ops_id", Integer.toString(i3), "retry_cnt", Integer.toString(0), "mqtt_session_id", Long.toString(j));
        if (th != null) {
            A01.put("error_message", th.toString());
        }
        A06("mqtt_publish_debug", A01);
    }

    public static void A01(NetworkInfo networkInfo, C63306ShC c63306ShC, Map map) {
        if (networkInfo != null) {
            String obj = networkInfo.getState().toString();
            String typeName = networkInfo.getTypeName();
            if (typeName == null) {
                typeName = "";
            }
            String subtypeName = networkInfo.getSubtypeName();
            if (subtypeName == null) {
                subtypeName = "";
            }
            String extraInfo = networkInfo.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = "";
            }
            map.put(MSV.A00(1423), obj);
            map.put(MSV.A00(111), typeName);
            map.put(MSV.A00(1424), subtypeName);
            map.put("network_extra_info", extraInfo);
        } else {
            map.put("network_info", "null");
        }
        boolean z = false;
        try {
            AbstractC64515THi A00 = c63306ShC.A03.A03.A00(PowerManager.class, "power");
            if (!(A00 instanceof C60546R6j)) {
                if (((PowerManager) A00.A01()).isDeviceIdleMode()) {
                    z = true;
                }
            }
        } catch (Exception unused) {
            C0K8.A0C("MqttNetworkManager", "Exception in getting DeviceIdleMode");
        }
        map.put("is_in_idle_mode", Boolean.toString(z));
    }

    public final void A02(NetworkInfo networkInfo, AbstractC64515THi abstractC64515THi, AbstractC64515THi abstractC64515THi2, String str, String str2, long j, boolean z) {
        HashMap A01 = AbstractC62801SRv.A01("act", str, "running", String.valueOf(z));
        A01.put("process_id", Long.toString(this.A05));
        A01.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.toString(Thread.currentThread().getId()));
        A01.put("mqtt_persistence_string", "FBNS_ALWAYS");
        A00(j, A01);
        A01(networkInfo, this, A01);
        if (!TextUtils.isEmpty(str2)) {
            A01.put("calr", str2);
        }
        if (!(abstractC64515THi instanceof C60546R6j)) {
            A01.put("flg", String.valueOf(abstractC64515THi.A01()));
        }
        if (!(abstractC64515THi2 instanceof C60546R6j)) {
            A01.put("sta_id", String.valueOf(abstractC64515THi2.A01()));
        }
        A06("mqtt_service_state", A01);
    }

    public final void A06(String str, Map map) {
        map.put(AbstractC111324zv.A00(1261), this.A0A);
        map.put("service_session_id", Long.toString(this.A06));
        map.put("process_id", Long.toString(this.A05));
        map.put("logger_object_id", Long.toString(this.A04));
        if (!map.containsKey("network_session_id")) {
            map.put("network_session_id", Long.toString(this.A03.A06.get()));
        }
        C63302Sh6 c63302Sh6 = new C63302Sh6(str, this.A09);
        c63302Sh6.A03(map);
        this.A07.reportEvent(c63302Sh6);
    }

    public C63306ShC(Context context, InterfaceC93784Jk interfaceC93784Jk, InterfaceC65618To9 interfaceC65618To9, C4N2 c4n2, SBU sbu, C63006SaU c63006SaU, String str) {
        this.A00 = context;
        this.A0A = str;
        this.A03 = c63006SaU;
        this.A02 = sbu;
        this.A09 = context.getPackageName();
        this.A07 = interfaceC93784Jk;
        this.A08 = c4n2;
        this.A01 = interfaceC65618To9;
    }

    public static void A00(long j, Map map) {
        map.put("network_session_id", Long.toString(j));
    }

    public final void A03(NetworkInfo networkInfo, AbstractC64515THi abstractC64515THi, String str, int i, long j, long j2, long j3) {
        HashMap A01 = AbstractC62801SRv.A01("timespan_ms", String.valueOf(j), TraceFieldType.Port, String.valueOf(i), "he_state", str);
        if (!(abstractC64515THi instanceof C60546R6j)) {
            String obj = abstractC64515THi.A01().toString();
            if (((Throwable) abstractC64515THi.A01()).getCause() != null) {
                obj = AnonymousClass001.A0g(obj, " Caused by: ", ((Throwable) abstractC64515THi.A01()).getCause().toString());
            }
            A01.put("error_message", obj);
        }
        A01.put("mqtt_session_id", Long.toString(j2));
        A00(j3, A01);
        A01(networkInfo, this, A01);
        A06("mqtt_socket_connect", A01);
    }
}
