package X;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.039, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass039 implements C0LR {
    public Application A00;
    public boolean A01;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A09;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        String str;
        C10850hu c10850hu = C0LK.A6F;
        String str2 = Build.TAGS;
        String str3 = "true";
        if (str2 == null || !str2.contains("test-keys")) {
            try {
                if (new File("/system/app/Superuser.apk").exists()) {
                }
            } catch (Exception e) {
                C0PC.A00().DEh("SuperUserAPK", e, null);
            }
            Map<String, String> map = System.getenv();
            if (map != null && (str = map.get("PATH")) != null) {
                for (String str4 : str.split(":")) {
                    try {
                    } catch (Exception e2) {
                        C0PC.A00().DEh("SUBinInPath", e2, null);
                    }
                    if (new File(AnonymousClass001.A0R(str4, "/su")).exists()) {
                        break;
                    }
                }
            }
            str3 = "false";
        }
        c024209q.A03(c10850hu, str3);
        C10850hu c10850hu2 = C0LK.A5L;
        String arrays = Arrays.toString(Build.SUPPORTED_ABIS);
        int length = arrays.length();
        if (length >= 2 && arrays.charAt(0) == '[') {
            int i = length - 1;
            if (arrays.charAt(i) == ']') {
                arrays = arrays.substring(1, i);
            }
        }
        c024209q.A03(c10850hu2, arrays);
        C10850hu c10850hu3 = C0LK.A4n;
        StringBuilder sb = new StringBuilder();
        for (Field field : Build.class.getFields()) {
            try {
                Object obj = field.get(null);
                sb.append(field.getName());
                sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                if (obj instanceof Object[]) {
                    sb.append(new JSONArray((Collection) Arrays.asList((Object[]) obj)).toString());
                } else {
                    sb.append(obj.toString());
                }
            } catch (Exception e3) {
                C0PC.A00().DEh("ReflectUtilConst", e3, null);
                sb.append("unknown");
            }
            sb.append("\n");
        }
        c024209q.A03(c10850hu3, sb.toString());
        if (this.A01) {
            C10850hu c10850hu4 = C0LK.A6C;
            String[] strArr = {"org.chromium.arc", "org.chromium.arc.device_management"};
            PackageManager packageManager = this.A00.getPackageManager();
            boolean z = false;
            if (packageManager != null) {
                int i2 = 0;
                while (true) {
                    if (packageManager.hasSystemFeature(strArr[i2])) {
                        z = true;
                        break;
                    } else {
                        i2++;
                        if (i2 >= 2) {
                            break;
                        }
                    }
                }
            }
            c024209q.A03(c10850hu4, Boolean.toString(z));
        }
    }
}
