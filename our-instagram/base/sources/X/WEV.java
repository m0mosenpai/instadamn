package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes11.dex */
public final class WEV {
    public View.OnAttachStateChangeListener A03;
    public View A04;
    public View A05;
    public int A06;
    public WindowManager A07;
    public final java.util.Set A08 = new CopyOnWriteArraySet();
    public final int[] A09 = new int[2];
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = -1;
    public final ViewTreeObserver.OnGlobalLayoutListener A0A = new WOE(this, 10);
    public final C03L A0B = new C65799TuH(this, 0);

    public static final void A01(WEV wev) {
        WindowManager windowManager;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = wev.A05;
        if (view != null && (onAttachStateChangeListener = wev.A03) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        wev.A03 = null;
        View view2 = wev.A04;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(wev.A0A);
            AbstractC008903d.A00(view2, null);
            if (view2.isAttachedToWindow() && (windowManager = wev.A07) != null) {
                windowManager.removeView(view2);
            }
            wev.A07 = null;
            wev.A04 = null;
            wev.A06 = 0;
        }
    }

    public static final void A02(WEV wev, int i) {
        Iterator it = wev.A08.iterator();
        while (it.hasNext()) {
            ((InterfaceC71901X9l) it.next()).DOK(i, AbstractC167007dF.A1P(wev.A06, 48));
        }
    }

    public WEV(Fragment fragment, boolean z) {
        if (z || AbstractC68351VNl.A00(fragment.getActivity())) {
            fragment.mLifecycleRegistry.A09(new C70298WQd(fragment, this, z));
        }
    }

    public static final void A00(Activity activity, WEV wev) {
        A01(wev);
        View view = wev.A05;
        if (view != null) {
            IBinder windowToken = view.getWindowToken();
            if (!activity.isFinishing() && !activity.isDestroyed() && windowToken != null && activity.getWindow() != null) {
                int i = activity.getWindow().getAttributes().type;
                if (i >= 1000 && i <= 1999) {
                    return;
                }
                int i2 = 0;
                if (activity.getWindow() != null) {
                    i2 = activity.getWindow().getAttributes().softInputMode & 240;
                }
                wev.A06 = i2;
                Object systemService = activity.getSystemService("window");
                C14360o3.A0C(systemService, AbstractC58317Pt9.A00(2));
                wev.A07 = (WindowManager) systemService;
                wev.A04 = new View(activity);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                layoutParams.softInputMode = 16;
                layoutParams.token = windowToken;
                try {
                    WindowManager windowManager = wev.A07;
                    if (windowManager != null) {
                        windowManager.addView(wev.A04, layoutParams);
                        View view2 = wev.A04;
                        if (view2 == null) {
                            return;
                        }
                        view2.getViewTreeObserver().addOnGlobalLayoutListener(wev.A0A);
                        AbstractC008903d.A00(view2, wev.A0B);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (WindowManager.BadTokenException unused) {
                    wev.A07 = null;
                    wev.A04 = null;
                    wev.A06 = 0;
                }
            }
        }
    }
}
