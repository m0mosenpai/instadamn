package X;

import android.app.Application;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03970Jn {
    public List A00 = new ArrayList();
    public final Application A01;

    public final void A00(C0NA c0na, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "STARTUP";
                break;
            case 1:
                str = "LIFECYCLE";
                break;
            case 2:
                str = "JAVA_DETECT";
                break;
            case 3:
                str = "JAVA_APP_DEATH";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "ANR_DETECT";
                break;
            case 6:
                str = "ANR_APP_DEATH";
                break;
            case 7:
                str = "JAVASCRIPT";
                break;
            case 8:
                str = "SOFT_ERRORS";
                break;
            case 9:
                str = "UNEXPLAINED";
                break;
            case 10:
                str = "LATE_STARTUP";
                break;
            case 11:
                str = "AFTER_STARTUP";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str = "MEMORY_SNAPSHOT";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str = "CRASH_LOOP";
                break;
            default:
                str = "BACKGROUND";
                break;
        }
        AbstractC09780fb.A01(AnonymousClass001.A0R("MainAddOnConfig.processAddOns.", str), -734362632);
        try {
            for (C0OH c0oh : this.A00) {
                try {
                    c0oh.AAY(c0na, num);
                } catch (Throwable th) {
                    C0K8.A0M("Lacrima", "Add on error: %s", th, c0oh.getClass().getSimpleName());
                    C0PC.A00().DEh("AddOnAddToDetectorConfig", th, null);
                }
            }
            AbstractC09780fb.A00(1711614192);
        } catch (Throwable th2) {
            AbstractC09780fb.A00(1600464635);
            throw th2;
        }
    }

    public C03970Jn(Application application) {
        this.A01 = application;
    }
}
