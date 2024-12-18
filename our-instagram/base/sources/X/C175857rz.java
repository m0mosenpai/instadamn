package X;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175857rz implements InterfaceC175017qb {
    public static boolean A04 = true;
    public static int A05;
    public static Boolean A06;
    public static String A07;
    public static final HashMap A08 = new HashMap();
    public static final HashMap A09 = new HashMap();
    public C176587tG A00;
    public final InterfaceC178407wE A01;
    public final HandlerC174707q5 A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public static HashMap A00(int i, long j) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("update_description", "SETTINGS");
        hashMap.put("timestamp", String.valueOf(j));
        hashMap.put("settings_update_id", String.valueOf(i));
        return hashMap;
    }

    @Override // X.InterfaceC175017qb
    public final void D1T(long j, String str, String str2) {
        InterfaceC178407wE interfaceC178407wE = this.A01;
        Map A7N = interfaceC178407wE.A7N();
        A7N.put("previous_product_name", str);
        A7N.put("new_product_name", str2);
        interfaceC178407wE.Cia(hashCode(), "camera_evicted", "CameraEventLoggerImpl", A7N);
        interfaceC178407wE.EEM(A7N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (r3 >= 31) goto L13;
     */
    @Override // X.InterfaceC175017qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D72(X.C177447ue r13, int r14, int r15, long r16) {
        /*
            r12 = this;
            X.7wE r6 = r12.A01
            X.7wL r2 = r6.AkA()
            r1 = 1
            if (r15 == 0) goto Lbc
            r0 = 0
            if (r15 == r1) goto Ld
            r0 = -1
        Ld:
            r2.EQq(r0)
            java.util.Map r11 = r6.A7N()
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "timestamp"
            r11.put(r0, r1)
            X.7tY r2 = r13.A02
            X.7tZ r0 = X.AbstractC176767tY.A00
            java.lang.Object r1 = r2.A01(r0)
            X.7uI r0 = X.EnumC177227uI.CAMERA2
            if (r1 != r0) goto Lb8
            java.lang.String r1 = "2"
        L2b:
            java.lang.String r0 = "camera_api"
            r11.put(r0, r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto Lb3
            X.7tZ r0 = X.AbstractC176767tY.A0J
            java.lang.Object r0 = r2.A01(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hdr_hlg_supported"
            r11.put(r0, r1)
            X.7tZ r0 = X.AbstractC176767tY.A18
            java.lang.Object r5 = r2.A01(r0)
            java.util.List r5 = (java.util.List) r5
            r0 = 5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.contains(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "stream_use_case_video_call_supported"
            r11.put(r0, r1)
        L60:
            X.7tZ r0 = X.AbstractC176767tY.A08
            java.lang.Object r0 = r2.A01(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "night_extension_supported"
            r11.put(r0, r1)
            if (r3 < r4) goto La3
            X.7tZ r0 = X.AbstractC176767tY.A0R
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L88
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "preview_stabilization_api33_supported"
            r11.put(r0, r1)
        L88:
            r0 = 34
            if (r3 < r0) goto La3
            X.7tZ r0 = X.AbstractC176767tY.A0Y
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hdr_jpegr_supported"
            r11.put(r0, r1)
        La3:
            java.lang.String r10 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r7 = (long) r0
            java.lang.String r9 = "camera_connect_finished"
            r6.Cia(r7, r9, r10, r11)
            r6.EEM(r11)
            return
        Lb3:
            r0 = 31
            if (r3 < r0) goto La3
            goto L60
        Lb8:
            java.lang.String r1 = "1"
            goto L2b
        Lbc:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175857rz.D72(X.7ue, int, int, long):void");
    }

    @Override // X.InterfaceC175017qb
    public final void D74(long j) {
        int i;
        String str;
        InterfaceC178407wE interfaceC178407wE = this.A01;
        String activeSessionId = interfaceC178407wE.getActiveSessionId();
        HashMap hashMap = A08;
        if (hashMap.get(activeSessionId) != null) {
            i = ((Number) hashMap.get(activeSessionId)).intValue() + 1;
        } else {
            i = 1;
        }
        hashMap.put(activeSessionId, Integer.valueOf(i));
        HashMap hashMap2 = A09;
        if (!hashMap2.containsKey(activeSessionId)) {
            hashMap2.put(activeSessionId, 0);
        }
        Map A7N = interfaceC178407wE.A7N();
        A7N.put("session_connect_count", String.valueOf(hashMap.get(activeSessionId)));
        A7N.put("session_disconnect_count", String.valueOf(hashMap2.get(activeSessionId)));
        int i2 = A05;
        A05 = i2 + 1;
        A7N.put("open_connections_count", String.valueOf(i2));
        AtomicBoolean atomicBoolean = this.A03;
        A7N.put("has_connect_request", String.valueOf(atomicBoolean.get()));
        Boolean bool = A06;
        if (bool == null) {
            try {
                Class.forName("androidx.camera.extensions.impl.ExtensionVersionImpl", false, getClass().getClassLoader());
                bool = true;
                A06 = bool;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                bool = false;
                A06 = bool;
            }
        }
        A7N.put("has_camera_extensions", String.valueOf(bool.booleanValue()));
        if (Build.VERSION.SDK_INT > 30) {
            if (A07 == null) {
                try {
                    str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.camerax.extensions.enabled");
                } catch (Exception unused2) {
                    str = null;
                }
                A07 = str;
                if (TextUtils.isEmpty(str)) {
                    A07 = NetInfoModule.CONNECTION_TYPE_NONE;
                }
            }
            A7N.put("has_camera_extensions_prop", A07);
        }
        A7N.put("timestamp", String.valueOf(j));
        interfaceC178407wE.Cia(hashCode(), "camera_connect_started", "CameraEventLoggerImpl", A7N);
        atomicBoolean.set(true);
        interfaceC178407wE.EEM(A7N);
    }

    public C175857rz(InterfaceC178407wE interfaceC178407wE, HandlerC174707q5 handlerC174707q5) {
        this.A01 = interfaceC178407wE;
        this.A02 = handlerC174707q5;
    }
}
