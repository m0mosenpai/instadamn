package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class GestureDetectorOnGestureListenerC72583Nf implements GestureDetector.OnGestureListener {
    public long A00;
    public C129235sl A01;
    public C129165sd A02;
    public C71313Hs A03;
    public Boolean A04;
    public final Context A05;
    public final Handler A06;
    public final GestureDetector A07;
    public final C22934A9e A08;
    public final C72838XoX A09;
    public final C9YN A0A;
    public final C172087ld A0B;
    public final WeakReference A0C;
    public final Map A0D;
    public final /* synthetic */ C172077lc A0E;

    public GestureDetectorOnGestureListenerC72583Nf(Context context, C22934A9e c22934A9e, C172077lc c172077lc, C172087ld c172087ld, AbstractC12990ll abstractC12990ll) {
        this.A0E = c172077lc;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A06 = handler;
        this.A0D = new HashMap();
        this.A00 = 0L;
        this.A05 = context.getApplicationContext();
        this.A0C = new WeakReference(abstractC12990ll);
        this.A07 = new GestureDetector(context, this);
        this.A0B = c172087ld;
        this.A08 = c22934A9e;
        C22959AAd c22959AAd = c22934A9e.A02;
        this.A0A = new C9YN(context, c22959AAd.A0A ? null : handler, c22959AAd, this, c172087ld.A05);
        this.A09 = new C72838XoX(c172087ld.A01, c22934A9e.A00, c172087ld.A03, c172087ld.A04);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        EnumC129155sc enumC129155sc;
        long j;
        Object obj = this.A0B.A05.get();
        C22959AAd c22959AAd = this.A08.A02;
        if (motionEvent != null && motionEvent2 != null && (c22959AAd.A0F || (obj != null && c22959AAd.A0E.contains(obj)))) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                enumC129155sc = EnumC129155sc.TOUCH_MOVED_RIGHT;
            } else {
                enumC129155sc = EnumC129155sc.TOUCH_MOVED_LEFT;
            }
        } else if (f2 > 0.0f) {
            enumC129155sc = EnumC129155sc.TOUCH_MOVED_DOWN;
        } else {
            enumC129155sc = EnumC129155sc.TOUCH_MOVED_UP;
        }
        MotionEvent motionEvent3 = motionEvent2;
        if (c22959AAd.A0G) {
            motionEvent3 = motionEvent;
        }
        if (motionEvent != null && motionEvent2 != null) {
            j = motionEvent2.getEventTime() - motionEvent.getDownTime();
        } else {
            j = 0;
        }
        boolean A01 = A01(motionEvent3, enumC129155sc, j, z);
        if (!c22959AAd.A07) {
            return false;
        }
        return A01;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void A00(String str, String str2) {
        Y0D y0d = this.A08.A00;
        if (y0d.A05) {
            C72838XoX c72838XoX = this.A09;
            c72838XoX.A02.post(new YH5(new C129265so(str, "ExternalNavigationModule", str2, null), c72838XoX));
            return;
        }
        C129235sl c129235sl = this.A01;
        C129165sd c129165sd = this.A02;
        if (c129165sd == null || c129235sl == null || !c129235sl.A02(new C129265so(str, "ExternalNavigationModule", str2, null))) {
            return;
        }
        A6S a6s = c129165sd.A09;
        if (a6s.A01 && c129165sd.A0C.now() - c129165sd.A05 > a6s.A00) {
            return;
        }
        this.A06.removeCallbacksAndMessages(null);
        if (!c129235sl.A00()) {
            this.A0B.A03.A01(c129165sd, c129235sl, (List) this.A0D.get(c129165sd.A0D), 0.0d, y0d.A04);
        }
        this.A0D.clear();
    }

    public final boolean A01(MotionEvent motionEvent, EnumC129155sc enumC129155sc, long j, boolean z) {
        Boolean CXP;
        long j2;
        C129225sk A00;
        if (motionEvent == null) {
            return false;
        }
        C172087ld c172087ld = this.A0B;
        C0JO c0jo = c172087ld.A04;
        C129165sd c129165sd = this.A02;
        C22934A9e c22934A9e = this.A08;
        C129165sd c129165sd2 = new C129165sd(motionEvent, c129165sd, c22934A9e.A01, enumC129155sc, c0jo, j);
        Activity activity = (Activity) C3K9.A00.get();
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        if (z && (A00 = c172087ld.A02.A00(motionEvent.getRawX(), motionEvent.getRawY())) != null) {
            c129165sd2.A0G.addAll(A00.A03);
            c129165sd2.A0F.addAll(A00.A02);
            c129165sd2.A00 = A00.A00;
            c129165sd2.A0E.addAll(A00.A01);
            c129165sd2.A02 = A00.A05;
            c129165sd2.A0H.putAll(A00.A04);
        }
        if (c22934A9e.A04) {
            c172087ld.A00.EV4(c129165sd2);
        }
        C22959AAd c22959AAd = c22934A9e.A02;
        if (c22959AAd.A0H) {
            C129165sd c129165sd3 = this.A02;
            if (c129165sd3 != null && c129165sd3.A0B == EnumC129155sc.TOUCH_UP) {
                long j3 = c129165sd2.A07 - c129165sd3.A07;
                if (j3 >= c22959AAd.A0C && j3 <= c22959AAd.A0B) {
                    float f = c129165sd2.A03 - c129165sd3.A03;
                    float f2 = c129165sd2.A04 - c129165sd3.A04;
                    if ((f * f) + (f2 * f2) <= ((float) c22959AAd.A0D)) {
                        j2 = this.A00 + 1;
                        this.A00 = j2;
                        c129165sd2.A01 = Long.valueOf(j2);
                    }
                }
            }
            this.A00 = 0L;
            j2 = 0;
            c129165sd2.A01 = Long.valueOf(j2);
        }
        if (this.A00 == 0) {
            C5H3 c5h3 = c129165sd2.A00;
            if (c5h3 == null) {
                CXP = null;
            } else {
                CXP = c5h3.CXP();
            }
            this.A04 = CXP;
        }
        Y0D y0d = c22934A9e.A00;
        if (y0d.A05) {
            C72838XoX c72838XoX = this.A09;
            c72838XoX.A02.post(new YH4(c72838XoX, c129165sd2));
        } else {
            C129235sl c129235sl = new C129235sl(c172087ld.A01);
            c129235sl.A01();
            if (y0d.A03) {
                this.A0D.put(c129165sd2.A0D, new ArrayList());
                this.A06.postDelayed(new RunnableC129275sp(c129235sl, c129165sd2, this, 0, c22934A9e.A03), y0d.A00);
            }
            this.A01 = c129235sl;
        }
        if (c22959AAd.A05) {
            c172087ld.A05.get();
            A6R A002 = AbstractC224419vS.A00(c129165sd2, c22959AAd);
            if (A002 != null) {
                c172087ld.A03.A00(c172087ld.A01.A00(), null, A002, c129165sd2, this.A04);
            }
        }
        this.A02 = c129165sd2;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        A01(motionEvent, EnumC129155sc.LONG_TOUCHED, ViewConfiguration.getLongPressTimeout(), true);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        long j;
        EnumC129155sc enumC129155sc = EnumC129155sc.TOUCH_UP;
        if (motionEvent != null) {
            j = motionEvent.getEventTime() - motionEvent.getDownTime();
        } else {
            j = 0;
        }
        return A01(motionEvent, enumC129155sc, j, true);
    }
}
