package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.MarkerEditor;
import java.lang.reflect.Field;
import java.util.Random;

/* renamed from: X.1Nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC25861Nt extends Handler {
    public boolean A00;
    public final C5FB A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandlerC25861Nt(Looper looper) {
        super(looper);
        C5FB c5fb;
        C14360o3.A0B(looper, 1);
        if (new Random().nextInt(10000) == 0) {
            c5fb = new Object();
        } else {
            c5fb = null;
        }
        this.A01 = c5fb;
        if (c5fb != null) {
            this.A00 = C14360o3.A0K(getLooper(), Looper.getMainLooper());
        }
    }

    public final void A01(int i, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        if (this.A01 != null) {
            super.post(new RunnableC71570WwK(this, runnable, i));
        } else {
            super.post(runnable);
        }
    }

    public final void A02(Runnable runnable, int i, long j) {
        C14360o3.A0B(runnable, 1);
        if (this.A01 != null) {
            super.postDelayed(new RunnableC71571WwL(this, runnable, i), j);
        } else {
            super.postDelayed(runnable, j);
        }
    }

    public static final void A00(HandlerC25861Nt handlerC25861Nt, Runnable runnable, int i) {
        Object c09540e5;
        C5FB c5fb = handlerC25861Nt.A01;
        if (c5fb != null) {
            boolean z = handlerC25861Nt.A00;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerStart(15340608, runnable.hashCode());
            MarkerEditor withMarker = c006802i.withMarker(15340608, runnable.hashCode());
            withMarker.annotate("taskId", i);
            withMarker.annotate("taskIdName", AbstractC14450oH.A00(i));
            withMarker.annotate("is_shared_thread", false);
            withMarker.annotate("is_main_thread", z);
            withMarker.point("execution_start");
            withMarker.markerEditingCompleted();
        }
        try {
            runnable.run();
            c09540e5 = C0eB.A00;
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (C09550e6.A00(c09540e5) != null) {
            if (c5fb != null) {
                C006802i c006802i2 = C006802i.A0p;
                C14360o3.A07(c006802i2);
                if (c006802i2.isMarkerOn(15340608, runnable.hashCode())) {
                    MarkerEditor withMarker2 = c006802i2.withMarker(15340608, runnable.hashCode());
                    withMarker2.point("execution_failed");
                    withMarker2.markerEditingCompleted();
                    c006802i2.markerEnd(15340608, runnable.hashCode(), (short) 3);
                }
            } else {
                return;
            }
        } else if (c5fb == null) {
            return;
        }
        C006802i c006802i3 = C006802i.A0p;
        C14360o3.A07(c006802i3);
        if (c006802i3.isMarkerOn(15340608, runnable.hashCode())) {
            MarkerEditor withMarker3 = c006802i3.withMarker(15340608, runnable.hashCode());
            withMarker3.point("execution_end");
            withMarker3.markerEditingCompleted();
            c006802i3.markerEnd(15340608, runnable.hashCode(), (short) 467);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HandlerC25861Nt(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        C5FB c5fb;
        if (new Random().nextInt(10000) == 0) {
            c5fb = new Object();
        } else {
            c5fb = null;
        }
        this.A01 = c5fb;
        if (c5fb != null) {
            this.A00 = C14360o3.A0K(getLooper(), Looper.getMainLooper());
        }
        if (this.A01 != null) {
            C70217WIa c70217WIa = new C70217WIa(callback, this);
            try {
                Class<? super Object> superclass = getClass().getSuperclass();
                C14360o3.A0C(superclass, "null cannot be cast to non-null type java.lang.Class<in com.instagram.common.handler.IgHandler>");
                Field declaredField = superclass.getDeclaredField("mCallback");
                C14360o3.A07(declaredField);
                declaredField.setAccessible(true);
                declaredField.set(this, c70217WIa);
            } catch (Exception unused) {
            }
        }
    }
}
