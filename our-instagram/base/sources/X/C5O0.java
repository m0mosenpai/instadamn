package X;

import X.AbstractC94714Ny;
import X.C14360o3;
import X.C4PX;
import X.C5O0;
import X.C5O2;
import X.C5O6;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5O0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5O0 implements C5O1 {
    public C5O6 A00;
    public final C5O2 A01;
    public final SidecarInterface A02;
    public final Map A03;
    public final Map A04;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02(final Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        C5O6 c5o6 = this.A00;
        if (c5o6 != null) {
            c5o6.E26(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null && (activity instanceof C1U9)) {
            C02N c02n = new C02N() { // from class: X.5OB
                @Override // X.C02N
                public final void accept(Object obj) {
                    C5O0 c5o0 = this;
                    Activity activity2 = activity;
                    C5O6 c5o62 = c5o0.A00;
                    if (c5o62 != null) {
                        c5o62.E26(activity2, c5o0.A00(activity2));
                    }
                }
            };
            map2.put(activity, c02n);
            ((C1U9) activity).addOnConfigurationChangedListener(c02n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x0002, B:5:0x0007, B:7:0x000d, B:9:0x001b, B:10:0x001f, B:15:0x002f, B:17:0x003b, B:19:0x0049, B:20:0x004d, B:24:0x005a, B:26:0x0060, B:28:0x006e, B:29:0x0072, B:32:0x007c, B:34:0x0082, B:36:0x0090, B:37:0x0094, B:39:0x009a, B:41:0x00a0, B:42:0x00df, B:46:0x00a3, B:48:0x00d7, B:51:0x0155, B:50:0x013f, B:52:0x00fa, B:55:0x0111, B:58:0x0128), top: B:2:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5O0.A03():boolean");
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    @Override // X.C5O1
    public final void EU0(C5O5 c5o5) {
        this.A00 = new C5O6(c5o5);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.A01, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface A01;
                    C14360o3.A0B(sidecarDeviceState, 0);
                    C5O0 c5o0 = C5O0.this;
                    for (Activity activity : c5o0.A04.values()) {
                        IBinder A00 = AbstractC94714Ny.A00(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (A00 != null && (A01 = c5o0.A01()) != null) {
                            sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A00);
                        }
                        C5O6 c5o6 = c5o0.A00;
                        if (c5o6 != null) {
                            c5o6.E26(activity, c5o0.A01.A01(sidecarDeviceState, sidecarWindowLayoutInfo));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    C14360o3.A0B(iBinder, 0);
                    C14360o3.A0B(sidecarWindowLayoutInfo, 1);
                    C5O0 c5o0 = C5O0.this;
                    Activity activity = (Activity) c5o0.A04.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    C5O2 c5o2 = c5o0.A01;
                    SidecarInterface A01 = c5o0.A01();
                    if (A01 == null || (sidecarDeviceState = A01.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    C4PX A012 = c5o2.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
                    C5O6 c5o6 = c5o0.A00;
                    if (c5o6 == null) {
                        return;
                    }
                    c5o6.E26(activity, A012);
                }
            }));
        }
    }

    public C5O0(Context context) {
        SidecarInterface A02 = AbstractC94714Ny.A02(context);
        C5O2 c5o2 = new C5O2(C05F.A0C);
        this.A02 = A02;
        this.A01 = c5o2;
        this.A04 = new LinkedHashMap();
        this.A03 = new LinkedHashMap();
    }

    public final C4PX A00(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder A00 = AbstractC94714Ny.A00(activity);
        if (A00 == null) {
            return new C4PX(C16930sl.A00);
        }
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A00);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        C5O2 c5o2 = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c5o2.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5O1
    public final void E25(Activity activity) {
        IBinder A00 = AbstractC94714Ny.A00(activity);
        if (A00 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A00);
            }
            Map map = this.A03;
            C02N c02n = (C02N) map.get(activity);
            if (c02n != null) {
                if (activity instanceof C1U9) {
                    ((C1U9) activity).removeOnConfigurationChangedListener(c02n);
                }
                map.remove(activity);
            }
            C5O6 c5o6 = this.A00;
            if (c5o6 != null) {
                ReentrantLock reentrantLock = c5o6.A01;
                reentrantLock.lock();
                try {
                    c5o6.A00.put(activity, null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            Map map2 = this.A04;
            boolean z = false;
            if (map2.size() == 1) {
                z = true;
            }
            map2.remove(A00);
            if (z && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }
}
