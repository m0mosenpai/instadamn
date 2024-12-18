package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Cz, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Cz {
    public static C0Cz A0F;
    public static final C03720In A0G = new C03720In("ActivityThreadHelper");
    public static final Object A0H = new Object();
    public static volatile boolean A0I;
    public static volatile boolean A0J;
    public final C0H5 A0E;
    public ActivityThread A00 = null;
    public C05420Qq A02 = null;
    public Method A0C = null;
    public Class A03 = null;
    public Field A05 = null;
    public Field A06 = null;
    public Field A07 = null;
    public Method A0B = null;
    public Method A0A = null;
    public Field A08 = null;
    public Field A09 = null;
    public Handler A01 = null;
    public Class A04 = null;
    public boolean A0D = false;

    /* JADX WARN: Removed duplicated region for block: B:18:0x019b A[Catch: all -> 0x01a3, TryCatch #1 {, blocks: (B:9:0x000e, B:11:0x0012, B:13:0x0020, B:14:0x002e, B:16:0x0197, B:18:0x019b, B:19:0x019d, B:20:0x0033, B:22:0x0039, B:23:0x0040, B:25:0x0047, B:27:0x0058, B:28:0x005b, B:31:0x0068, B:33:0x0073, B:34:0x0076, B:36:0x007c, B:38:0x00a3, B:40:0x00b5, B:41:0x00b8, B:43:0x00c4, B:44:0x00c7, B:45:0x00c9, B:47:0x00db, B:49:0x00e1, B:51:0x00ed, B:53:0x00f6, B:55:0x00fc, B:57:0x0108, B:59:0x0120, B:61:0x0129, B:62:0x012c, B:64:0x0134, B:66:0x0188, B:67:0x013d, B:69:0x0150, B:71:0x015b, B:72:0x015e, B:74:0x0168, B:75:0x0172, B:76:0x0183, B:78:0x017b, B:82:0x0149, B:84:0x0101, B:86:0x00e6, B:89:0x018e, B:90:0x0084, B:91:0x008b, B:93:0x0091, B:95:0x009e, B:97:0x005f, B:98:0x019f, B:99:0x01a1), top: B:8:0x000e, inners: #0, #2, #3, #4, #5, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0Cz A00(X.C0H5 r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Cz.A00(X.0H5):X.0Cz");
    }

    public final Object A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            ActivityThread activityThread = this.A00;
            Method method = this.A0C;
            if (method != null && activityThread != null) {
                return method.invoke(activityThread, iBinder);
            }
            C05420Qq c05420Qq = this.A02;
            if (c05420Qq != null) {
                return c05420Qq.A00.get(iBinder);
            }
            throw new IllegalStateException("Don't know how to get ActivityClientRecord from token");
        } catch (Exception e) {
            A0G.A0C(e, "Could not get ActivityClientRecord info for token %s", iBinder);
            return null;
        }
    }

    public final boolean A02(IBinder iBinder, AbstractC05380Qm abstractC05380Qm, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        if (obj != null) {
            Field field = this.A06;
            Field field2 = this.A05;
            Field field3 = this.A07;
            if (field == null && field2 == null && field3 == null) {
                A0G.A08("Couldn't get activity info from client record since we were missing some fields", new Object[0]);
            } else {
                Object obj4 = null;
                if (field == null) {
                    obj2 = null;
                } else {
                    try {
                        obj2 = field.get(obj);
                    } catch (ClassCastException | IllegalAccessException e) {
                        A0G.A0C(e, "Couldn't get ActivityInfo for %s", abstractC05380Qm);
                        return false;
                    }
                }
                ActivityInfo activityInfo = (ActivityInfo) obj2;
                if (field2 != null) {
                    obj3 = field2.get(obj);
                } else {
                    obj3 = null;
                }
                Activity activity = (Activity) obj3;
                if (field3 != null) {
                    obj4 = field3.get(obj);
                }
                Intent intent = (Intent) obj4;
                abstractC05380Qm.A06 = obj;
                abstractC05380Qm.A03 = iBinder;
                abstractC05380Qm.A02 = activityInfo;
                abstractC05380Qm.A00 = activity;
                abstractC05380Qm.A01 = intent;
                if (iBinder != null && activityInfo != null && activity != null && intent != null) {
                    return true;
                }
                C03720In c03720In = AbstractC05380Qm.A0J;
                if (iBinder != null) {
                    str = "Y";
                } else {
                    str = "N";
                }
                if (activityInfo != null) {
                    str2 = "Y";
                } else {
                    str2 = "N";
                }
                if (activity != null) {
                    str3 = "Y";
                } else {
                    str3 = "N";
                }
                if (intent != null) {
                    str4 = "Y";
                } else {
                    str4 = "N";
                }
                c03720In.A08("Did not find expected items. Has Token: %s Has Activity Info: %s Has Activity: %s Has Activity Intent: %s", str, str2, str3, str4);
                return true;
            }
        }
        return false;
    }

    public C0Cz(C0H5 c0h5) {
        this.A0E = c0h5;
    }
}
