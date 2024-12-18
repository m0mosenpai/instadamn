package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.R;

/* renamed from: X.6nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149456nw {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public GestureDetector A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final C149446nv A0D;

    public C149456nw(Context context, C149446nv c149446nv) {
        this.A0C = context;
        this.A0D = c149446nv;
        this.A07 = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.config_minScalingSpan);
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.A0A = true;
            if (this.A08 == null) {
                this.A08 = new GestureDetector(this.A0C, new GestureDetector.SimpleOnGestureListener() { // from class: X.6nx
                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                    public final boolean onDoubleTap(MotionEvent motionEvent) {
                        C149456nw c149456nw = C149456nw.this;
                        c149456nw.A00 = motionEvent.getX();
                        c149456nw.A01 = motionEvent.getY();
                        c149456nw.A05 = 1;
                        return true;
                    }
                }, null);
            }
            if (i > 22) {
                this.A0B = true;
            }
        }
    }
}
