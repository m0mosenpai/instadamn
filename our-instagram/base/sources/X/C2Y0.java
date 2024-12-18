package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;

/* renamed from: X.2Y0, reason: invalid class name */
/* loaded from: classes.dex */
public class C2Y0 extends GestureDetector {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2Y0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener, new Handler(Looper.getMainLooper()));
        C14360o3.A0B(context, 1);
    }
}
