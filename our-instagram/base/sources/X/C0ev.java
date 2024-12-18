package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.facebook.systrace.TraceDirect;
import java.io.File;
import java.util.List;

/* renamed from: X.0ev, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ev {
    public static C19500xa A00;
    public static final C0f4 A01 = new C0f4();
    public static volatile long A02;

    static {
        A02(false, false);
        if (Build.VERSION.SDK_INT < 30) {
            Runnable runnable = new Runnable() { // from class: X.0et
                @Override // java.lang.Runnable
                public final void run() {
                    C0ev.A02(true, false);
                }
            };
            if (AbstractC02650Ap.A06) {
                AbstractC02650Ap.A02(AbstractC02650Ap.A00, runnable);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xa] */
    public static void A00(final Context context) {
        if (Build.VERSION.SDK_INT >= 30 && A00 == null) {
            A00 = new Object(context) { // from class: X.0xa
                public final BroadcastReceiver A00;

                {
                    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0ew
                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            int A012 = C0f9.A01(1098763324);
                            C0fM.A01(this, context2, intent);
                            C0ev.A02(false, true);
                            C0f9.A0E(731431986, A012, intent);
                        }
                    };
                    this.A00 = broadcastReceiver;
                    C0DJ.A02(broadcastReceiver, context, new IntentFilter(AnonymousClass001.A0R(context.getPackageName(), ".FBSYSTRACE_CONFIG_CHANGE")), null, "android.permission.DUMP", false);
                }
            };
        }
    }

    public static void A01(C0f2 c0f2) {
        C0f4 c0f4 = A01;
        synchronized (c0f4.A01) {
            c0f4.A02.add(c0f2);
            if (c0f4.A00) {
                c0f2.DuR();
            }
        }
    }

    public static void A02(boolean z, boolean z2) {
        long j;
        boolean z3;
        String str;
        long j2 = A02;
        boolean A002 = AbstractC09690em.A00();
        long A012 = AbstractC02650Ap.A01("debug.fbsystrace.tags");
        if (A002 && A012 != 0) {
            j = A012 | 1;
        } else {
            j = 0;
        }
        boolean z4 = true;
        if ((A02 == 0 && j != 0) || (j == 0 && A02 != 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        A02 = j;
        if (z) {
            str = "sysprop";
        } else if (z2) {
            str = "broadcast";
        } else {
            str = "other";
        }
        String.format("Systrace trace config update - source:%s changed:%b enabledTags:0x%x->0x%x", str, Boolean.valueOf(z3), Long.valueOf(j2), Long.valueOf(A02));
        if (z3) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j);
            }
            if (!z && !z2) {
                z4 = false;
            }
            final C0f4 c0f4 = A01;
            if (j > 0) {
                if (!z4) {
                    c0f4.A00();
                    return;
                }
                synchronized (c0f4.A01) {
                    C0f4.A03.lastModified();
                    Thread thread = new Thread(new Runnable() { // from class: X.0f3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0f4 c0f42 = C0f4.this;
                            File file = C0f4.A03;
                            synchronized (c0f42.A01) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                }
                                c0f42.A00();
                            }
                        }
                    }, "fbsystrace notification thread");
                    thread.setPriority(10);
                    thread.start();
                }
                return;
            }
            synchronized (c0f4.A01) {
                c0f4.A00 = false;
                int i = 0;
                while (true) {
                    List list = c0f4.A02;
                    if (i < list.size()) {
                        ((C0f2) list.get(i)).DuT();
                        i++;
                    }
                }
            }
        }
    }
}
