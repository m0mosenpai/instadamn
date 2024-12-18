package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2CL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CL {
    public final QuickPerformanceLogger A00;

    public static final HashMap A00(C53302cE c53302cE) {
        String str;
        String valueOf;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("codec_instance_id", String.valueOf(c53302cE.A00));
        String str4 = c53302cE.A05;
        if (str4 != null) {
            hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
        }
        Boolean bool = c53302cE.A02;
        if (bool != null) {
            if (bool.equals(true)) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            hashMap.put("is_video", str3);
        }
        Integer num = c53302cE.A04;
        Integer num2 = c53302cE.A03;
        if (num2 != C05F.A00 && num2 != C05F.A0C) {
            if (num2 == C05F.A0j || num2 == C05F.A0N) {
                hashMap.put("action_end", AbstractC225339ww.A00(num2));
                if (num != null) {
                    str = "source_end";
                    if (1 - num.intValue() != 0) {
                        valueOf = "PREALLOCATE";
                    } else {
                        valueOf = "RENDERER";
                    }
                }
            }
            return hashMap;
        }
        hashMap.put("action_start", AbstractC225339ww.A00(num2));
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str2 = "PREALLOCATE";
            } else {
                str2 = "RENDERER";
            }
            hashMap.put("source_start", str2);
        }
        str = "time_ms";
        valueOf = String.valueOf(c53302cE.A01);
        hashMap.put(str, valueOf);
        return hashMap;
    }

    public C2CL(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public final void A01(int i, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.A00.markerAnnotate(28196231, i, (String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.A00.markerAnnotate(28196231, i, (String) entry2.getKey(), (String) entry2.getValue());
        }
    }
}
