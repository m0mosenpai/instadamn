package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.3WX, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3WX {
    public abstract void A01(int i);

    public void A02(Typeface typeface) {
        C3WW c3ww = (C3WW) this;
        int i = c3ww.A00;
        if (i != -1) {
            boolean z = false;
            if ((c3ww.A01 & 2) != 0) {
                z = true;
            }
            typeface = Typeface.create(typeface, i, z);
        }
        C3WU c3wu = c3ww.A02;
        WeakReference weakReference = c3ww.A03;
        if (c3wu.A0A) {
            c3wu.A02 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c3wu.A01;
                if (isAttachedToWindow) {
                    textView.post(new RunnableC71584Wwg(typeface, textView, c3wu, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public final void A00(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.3WZ
            @Override // java.lang.Runnable
            public final void run() {
                C3WX.this.A01(i);
            }
        });
    }

    public final void A03(final Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.TMH
            @Override // java.lang.Runnable
            public final void run() {
                this.A02(typeface);
            }
        });
    }
}
