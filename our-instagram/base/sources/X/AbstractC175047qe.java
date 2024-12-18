package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.7qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC175047qe {
    /* JADX WARN: Multi-variable type inference failed */
    public static C175377rD A00(Context context, Handler handler, EnumC177227uI enumC177227uI, boolean z) {
        String str;
        C175057qf c175057qf;
        C175237qx c175237qx;
        C175057qf c175057qf2;
        EnumC177227uI enumC177227uI2 = EnumC177227uI.CAMERA1;
        if (enumC177227uI == enumC177227uI2) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "2";
        }
        AbstractC175037qd.A01("CameraServiceFactory", AnonymousClass001.A0g("Creating a camera service backed by the Android Camera", str, " API"));
        if (enumC177227uI == enumC177227uI2) {
            if (C208789Lm.A0g == null) {
                synchronized (C208789Lm.class) {
                    if (C208789Lm.A0g == null) {
                        C208789Lm.A0g = new C208789Lm(context.getApplicationContext());
                    }
                }
            }
            C208789Lm c208789Lm = C208789Lm.A0g;
            c175237qx = c208789Lm.A0Q;
            c175057qf2 = c208789Lm;
        } else if (enumC177227uI == EnumC177227uI.CAMERA2) {
            if (context != null) {
                if (!z) {
                    if (C175057qf.A0v == null) {
                        synchronized (C175057qf.class) {
                            if (C175057qf.A0v == null) {
                                C175057qf.A0v = new C175057qf(context);
                            }
                        }
                    }
                    c175057qf = C175057qf.A0v;
                } else {
                    if (C175057qf.A0w == null) {
                        synchronized (C175057qf.class) {
                            if (C175057qf.A0w == null) {
                                C175057qf.A0w = new C175057qf(context);
                            }
                        }
                    }
                    c175057qf = C175057qf.A0w;
                }
                c175237qx = c175057qf.A0Y;
                c175057qf2 = c175057qf;
            } else {
                throw new NullPointerException("Context must be provided for Camera2.");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid Camera API: ");
            sb.append(enumC177227uI);
            throw new RuntimeException(sb.toString());
        }
        return new C175377rD(handler, c175057qf2, c175237qx);
    }
}
