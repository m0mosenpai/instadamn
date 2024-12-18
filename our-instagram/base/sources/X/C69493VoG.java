package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.VoG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69493VoG {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A08;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public Matrix A0K;
    public VelocityTracker A0L;
    public X7J A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public float A06 = 1.0f;
    public final float[] A0X = new float[2];
    public float A09 = 1.0f;
    public float A07 = 1.0f;
    public final AbstractRunnableC71645Wxs A0W = new C66527ULh(this);
    public final AbstractRunnableC71645Wxs A0V = new C66528ULi(this);

    public C69493VoG(Context context, X7J x7j) {
        this.A0M = x7j;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0T = viewConfiguration.getScaledTouchSlop();
        this.A0U = ViewConfiguration.getLongPressTimeout();
        this.A0F = ViewConfiguration.getDoubleTapTimeout();
        this.A0E = viewConfiguration.getScaledDoubleTapSlop();
        this.A08 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0R = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
}
