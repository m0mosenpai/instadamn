package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import com.facebook.common.callercontext.CallerContextable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58672mQ extends Drawable implements Drawable.Callback, InterfaceC56802jD, CallerContextable {
    public static final String __redex_internal_original_name = "AsyncDrawable";
    public AbstractC58762mZ A00;
    public boolean A01;
    public boolean A02;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new Runnable() { // from class: X.2ma
        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC58672mQ.this.invalidateSelf();
            } catch (NullPointerException unused) {
                AbstractC58672mQ.this.invalidateSelf();
            } catch (Exception e) {
                Locale locale = Locale.US;
                AbstractC58702mT abstractC58702mT = AbstractC58672mQ.this.A00.A02;
                String format = String.format(locale, "Unable to invalidate Drawable with id: %d (%s) by %s", Arrays.copyOf(new Object[]{Integer.valueOf(abstractC58702mT.A02), abstractC58702mT.A01, abstractC58702mT.A00}, 3));
                C14360o3.A07(format);
                throw new RuntimeException(format, e);
            }
        }
    };
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final Rect A03 = new Rect();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A01) {
            Rect bounds = getBounds();
            C14360o3.A07(bounds);
            Gravity.apply(this.A00.A00, getIntrinsicWidth(), getIntrinsicHeight(), bounds, this.A03, getLayoutDirection());
        }
        this.A01 = false;
        A02();
        Object obj = ((AbstractC58662mP) this).A00;
        if (obj != null) {
            ((Drawable) obj).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public abstract int getIntrinsicHeight();

    @Override // android.graphics.drawable.Drawable
    public abstract int getIntrinsicWidth();

    @Override // android.graphics.drawable.Drawable
    public abstract int getOpacity();

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01 = true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public static final boolean A01(AbstractC58672mQ abstractC58672mQ) {
        if (!abstractC58672mQ.A06.compareAndSet(true, false)) {
            return false;
        }
        AbstractC58702mT abstractC58702mT = abstractC58672mQ.A00.A02;
        abstractC58702mT.A06.decrementAndGet();
        AbstractC58702mT.A01(abstractC58702mT);
        Queue queue = abstractC58702mT.A03;
        Iterator it = queue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object obj = ((Reference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else if (obj.equals(abstractC58672mQ)) {
                it.remove();
                break;
            }
        }
        if (queue.isEmpty() && abstractC58702mT.A04.isEmpty()) {
            AtomicReference atomicReference = abstractC58702mT.A07;
            C1W1 c1w1 = (C1W1) atomicReference.get();
            if (c1w1 != null && C1EM.A00(c1w1, null, atomicReference)) {
                c1w1.A04();
            }
        }
        return true;
    }

    public final void A02() {
        int i;
        C58692mS c58692mS;
        String str;
        String str2;
        if (this.A06.compareAndSet(false, true)) {
            AbstractC58702mT abstractC58702mT = this.A00.A02;
            try {
                AbstractC09800fd.A01("attach_network_drawable", 767846591);
                abstractC58702mT.A06.incrementAndGet();
                if (abstractC58702mT.A08 != null) {
                    i = -1282289898;
                } else {
                    WeakReference weakReference = new WeakReference(this);
                    Queue queue = abstractC58702mT.A03;
                    queue.add(weakReference);
                    if (abstractC58702mT.A08 == null) {
                        if (abstractC58702mT.A08 == null) {
                            AtomicReference atomicReference = abstractC58702mT.A07;
                            if (atomicReference.get() == null && (str = (c58692mS = (C58692mS) abstractC58702mT).A02) != null && (str2 = ((AbstractC58702mT) c58692mS).A01) != null) {
                                JYB jyb = new JYB(new C3LW(new C3LV(str, str2), str), C58692mS.A06, c58692mS.A05);
                                if (C1EM.A00(null, jyb, atomicReference)) {
                                    jyb.A06(abstractC58702mT, abstractC58702mT.A05);
                                } else {
                                    jyb.A04();
                                }
                            }
                        }
                        i = -1725957405;
                    } else {
                        queue.remove(weakReference);
                        i = 1027584743;
                    }
                }
                AbstractC09800fd.A00(i);
            } catch (Throwable th) {
                AbstractC09800fd.A00(455352837);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC56802jD
    public final void EV6(int i) {
        AbstractC58762mZ abstractC58762mZ = this.A00;
        if (abstractC58762mZ.A00 != i) {
            abstractC58762mZ.A00 = i;
            this.A01 = true;
            A00(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00.A01.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.A02 && super.mutate() == this) {
            this.A00 = new AbstractC58762mZ(this.A00);
            this.A02 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (z) {
            A02();
            this.A01 = true;
        } else {
            A01(this);
        }
        return super.setVisible(z, z2);
    }

    public AbstractC58672mQ(AbstractC58762mZ abstractC58762mZ) {
        this.A00 = abstractC58762mZ;
    }

    public static final void A00(AbstractC58672mQ abstractC58672mQ) {
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            abstractC58672mQ.A05.run();
        } else {
            abstractC58672mQ.A04.post(abstractC58672mQ.A05);
        }
    }

    public final void finalize() {
        if (A01(this)) {
            AbstractC58702mT abstractC58702mT = this.A00.A02;
            C0I2.A02(AbstractC58672mQ.class, "AsyncDrawable with id: %d (%s)  wasn't hidden before it was GC'd. Please call setVisible(false, ___ ) in View.onDetachedFromWindow()", Integer.valueOf(abstractC58702mT.A02), abstractC58702mT.A01);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
