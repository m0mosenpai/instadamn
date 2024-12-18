package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

@Deprecated
/* renamed from: X.02v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C008102v {
    public final GestureDetector A00;

    public C008102v(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C008102v(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.A00 = new GestureDetector(context, onGestureListener, handler);
    }
}
