package com.facebook.perf.background;

import X.C06190Uj;
import X.C0K8;
import X.C14360o3;
import X.InterfaceC06210Ul;
import X.InterfaceC06220Um;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class BackgroundStartupDetector extends Handler implements Application.ActivityLifecycleCallbacks {
    public static InterfaceC06210Ul A07;
    public static InterfaceC06220Um A08;
    public static String A09;
    public static volatile int A0D;
    public static volatile int A0E;
    public static volatile BackgroundStartupDetector A0F;
    public static volatile Boolean A0G;
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public static final C06190Uj A0B = new Object();
    public static final CopyOnWriteArraySet A0C = new CopyOnWriteArraySet();
    public static ArrayList A0A = new ArrayList();

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BackgroundStartupDetector backgroundStartupDetector;
        int i;
        C14360o3.A0B(message, 0);
        switch (message.what) {
            case 49181:
                if (!this.A05) {
                    this.A05 = true;
                    this.A00 = 0;
                }
                if (!this.A04) {
                    C06190Uj c06190Uj = A0B;
                    int i2 = 1;
                    if (this.A06) {
                        i2 = 2;
                    }
                    c06190Uj.A01(i2);
                    C06190Uj.A00(true);
                    return;
                }
                if (this.A01 > 0) {
                    C06190Uj c06190Uj2 = A0B;
                    int i3 = 3;
                    if (this.A06) {
                        i3 = 4;
                    }
                    c06190Uj2.A01(i3);
                    return;
                }
                this.A04 = false;
                this.A06 = true;
                backgroundStartupDetector = A0F;
                i = 49181;
                break;
            case 49182:
                if (!this.A03) {
                    this.A03 = true;
                    backgroundStartupDetector = A0F;
                    i = 49182;
                    break;
                } else {
                    if (this.A02 != 0 || this.A01 != 0) {
                        return;
                    }
                    C0K8.A0D(A09, "ActivityCreateQueue drained. Activity likely self-finished or redirected to another process.");
                    C06190Uj.A00(true);
                    A0E++;
                    return;
                }
            default:
                return;
        }
        sendMessageDelayed(Message.obtain(backgroundStartupDetector, i), 200L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C14360o3.A0B(activity, 0);
        C14360o3.A07(activity.getClass().getSimpleName());
        if (!this.A04) {
            this.A04 = true;
            if (!this.A05) {
                A0B.A01(4);
            }
        }
        if (this.A02 == 0) {
            C06190Uj.A00(false);
            this.A03 = false;
            removeMessages(49182);
            sendEmptyMessage(49182);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C14360o3.A0B(activity, 0);
        this.A01--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C14360o3.A0B(activity, 0);
        this.A01++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C14360o3.A0B(activity, 0);
        this.A02++;
        this.A00++;
        C06190Uj.A00(false);
        removeMessages(49182);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C14360o3.A0B(activity, 0);
        int i = this.A02 - 1;
        int i2 = this.A01;
        this.A02 = i;
        if (i == 0 && i2 == 0) {
            A0E++;
            C06190Uj.A00(true);
        }
    }
}
