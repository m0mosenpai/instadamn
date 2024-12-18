package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Window;
import java.util.LinkedHashMap;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1CM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CM {
    public int A00;
    public String A01;
    public int A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public boolean A06;
    public final KeyguardManager A07;
    public final Context A08;
    public final InterfaceC09390do A09;
    public final AudioManager A0A;

    public C1CM(Context context) {
        C14360o3.A0B(context, 1);
        this.A08 = context;
        this.A01 = "Unknown";
        this.A02 = -1;
        Object systemService = context.getSystemService("keyguard");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.A07 = (KeyguardManager) systemService;
        this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EK(this, 0));
        Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        AbstractC05810Sj.A01(systemService2, "AudioManager must be present");
        C14360o3.A0C(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
        this.A0A = (AudioManager) systemService2;
    }

    public final void A04() {
        this.A05 = null;
        this.A03 = null;
        this.A04 = null;
        this.A02 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r8 > 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1CM r10) {
        /*
            java.lang.Boolean r0 = r10.A03
            if (r0 != 0) goto L73
            r5 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r10.A03 = r0
            r3 = -1
            r10.A00 = r3
            android.content.Context r4 = r10.A08     // Catch: java.lang.SecurityException -> L73
            r2 = 0
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.SecurityException -> L73
            r0.<init>(r1)     // Catch: java.lang.SecurityException -> L73
            android.content.Intent r1 = X.C0DJ.A00(r2, r4, r0)     // Catch: java.lang.SecurityException -> L73
            if (r1 == 0) goto L73
            java.lang.String r0 = "status"
            int r7 = r1.getIntExtra(r0, r3)     // Catch: java.lang.SecurityException -> L73
            r6 = 5
            r9 = 2
            if (r7 == r9) goto L2b
            if (r7 != r6) goto L2c
        L2b:
            r5 = 1
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.SecurityException -> L73
            r10.A03 = r0     // Catch: java.lang.SecurityException -> L73
            java.lang.String r0 = "plugged"
            int r8 = r1.getIntExtra(r0, r3)     // Catch: java.lang.SecurityException -> L73
            java.lang.String r0 = "level"
            int r5 = r1.getIntExtra(r0, r3)     // Catch: java.lang.SecurityException -> L73
            java.lang.String r0 = "scale"
            int r4 = r1.getIntExtra(r0, r3)     // Catch: java.lang.SecurityException -> L73
            if (r5 < 0) goto L56
            if (r4 <= 0) goto L56
            int r0 = r5 * 100
            float r1 = (float) r0     // Catch: java.lang.SecurityException -> L73
            float r0 = (float) r4     // Catch: java.lang.SecurityException -> L73
            float r1 = r1 / r0
            int r0 = X.C1H4.A01(r1)     // Catch: java.lang.SecurityException -> L73
            r10.A00 = r0     // Catch: java.lang.SecurityException -> L73
        L56:
            java.lang.String r3 = "Full"
            java.lang.String r2 = "Unplugged"
            java.lang.String r1 = "Charging"
            if (r7 == r9) goto L6b
            r0 = 3
            if (r7 == r0) goto L6d
            r0 = 4
            if (r7 == r0) goto L67
            if (r7 == r6) goto L71
            goto L6f
        L67:
            if (r5 == r4) goto L71
            if (r8 <= 0) goto L6d
        L6b:
            r3 = r1
            goto L71
        L6d:
            r3 = r2
            goto L71
        L6f:
            java.lang.String r3 = "Unknown"
        L71:
            r10.A01 = r3     // Catch: java.lang.SecurityException -> L73
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CM.A00(X.1CM):void");
    }

    public final int A01() {
        Activity activity;
        Window window;
        if (this.A02 == -1 && (activity = (Activity) AbstractC13320mI.A00(this.A08, Activity.class)) != null && (window = activity.getWindow()) != null) {
            double d = window.getAttributes().screenBrightness;
            if (d > 0.0d) {
                this.A02 = (int) Math.round(255.0d * d);
            }
        }
        if (this.A02 == -1) {
            try {
                this.A02 = Settings.System.getInt(this.A08.getContentResolver(), "screen_brightness");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return this.A02;
    }

    public final int A02() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT >= 29 && (powerManager = (PowerManager) this.A09.getValue()) != null) {
            return powerManager.getCurrentThermalStatus();
        }
        return -1;
    }

    public final String A03() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = this.A08;
        linkedHashMap.put("microphone_permission", String.valueOf(AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO")));
        linkedHashMap.put("camera_permission", String.valueOf(AbstractC23451Ch.A07(context, "android.permission.CAMERA")));
        linkedHashMap.put("device_locked", String.valueOf(this.A07.isDeviceLocked()));
        linkedHashMap.put("call_notifications_enabled", String.valueOf(!ONF.A00(context)));
        linkedHashMap.put("airplane_mode_on", String.valueOf(A05()));
        A00(this);
        linkedHashMap.put("battery_level", String.valueOf(this.A00));
        linkedHashMap.put("data_connection", String.valueOf(A07(false)));
        linkedHashMap.put("system_dnd_on", String.valueOf(ONF.A01(context)));
        return linkedHashMap.toString();
    }

    public final boolean A05() {
        Boolean bool = this.A04;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (Settings.Global.getInt(this.A08.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z = true;
        }
        this.A04 = Boolean.valueOf(z);
        return z;
    }

    public final boolean A07(boolean z) {
        boolean z2;
        if (this.A05 == null) {
            Object systemService = this.A08.getSystemService("connectivity");
            AbstractC05810Sj.A01(systemService, "ConnectivityManager must be present");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                z2 = activeNetworkInfo.isConnected();
            } else {
                z2 = false;
            }
            this.A05 = Boolean.valueOf(z2);
            boolean z3 = true;
            if (activeNetworkInfo == null || 1 != activeNetworkInfo.getType()) {
                z3 = false;
            }
            this.A06 = z3;
        }
        if (z) {
            return this.A06;
        }
        Boolean bool = this.A05;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean A06() {
        A00(this);
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
