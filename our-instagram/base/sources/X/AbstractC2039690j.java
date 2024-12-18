package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

/* renamed from: X.90j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2039690j {
    public final List A01() {
        if (this instanceof C9YK) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) ((C9YK) this).A01);
            C14360o3.A07(copyOf);
            return copyOf;
        }
        return ((C2039590i) this).A03;
    }

    public final void A02(WeakReference weakReference) {
        WeakReference weakReference2;
        if (this instanceof C2039590i) {
            C2039590i c2039590i = (C2039590i) this;
            c2039590i.A02 = weakReference;
            C2039790k c2039790k = c2039590i.A00;
            if (c2039790k != null) {
                HandlerThread handlerThread = c2039790k.A04;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    c2039790k.A04 = null;
                }
                c2039590i.A00 = null;
            }
            if (c2039590i.A01.A06 && (weakReference2 = c2039590i.A02) != null && weakReference2.get() != null) {
                C2039790k c2039790k2 = new C2039790k(c2039590i);
                c2039590i.A00 = c2039790k2;
                WeakReference weakReference3 = c2039590i.A02;
                if (weakReference3.get() != null) {
                    c2039790k2.A0C = weakReference3;
                    Context applicationContext = ((View) weakReference3.get()).getContext().getApplicationContext();
                    C2039790k.A02(c2039790k2);
                    C2039790k.A03(c2039790k2);
                    c2039790k2.A03 = 1L;
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        if (c2039790k2.A04 == null) {
                            HandlerThread handlerThread2 = new HandlerThread(c2039790k2.getClass().getSimpleName());
                            AbstractC09770fa.A00(handlerThread2);
                            c2039790k2.A04 = handlerThread2;
                            handlerThread2.start();
                        }
                        myLooper = c2039790k2.A04.getLooper();
                        myLooper.getClass();
                    }
                    Handler handler = new Handler(myLooper);
                    ABK abk = new ABK(c2039790k2);
                    c2039790k2.A08 = abk;
                    c2039790k2.A0A = new AKQ(applicationContext, handler, abk);
                    APx aPx = new APx(c2039790k2);
                    c2039790k2.A07 = aPx;
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(applicationContext, aPx, handler);
                    c2039790k2.A05 = scaleGestureDetector;
                    scaleGestureDetector.setQuickScaleEnabled(false);
                    C22900A7v c22900A7v = new C22900A7v(c2039790k2);
                    c2039790k2.A06 = c22900A7v;
                    c2039790k2.A09 = new AAV(c22900A7v);
                    c2039790k2.A02 = 0L;
                }
                C2039790k c2039790k3 = c2039590i.A00;
                c2039790k3.A0B = c2039590i.A01;
                C2039790k.A03(c2039790k3);
            }
        }
    }

    public boolean A03(MotionEvent motionEvent, int i) {
        return false;
    }
}
