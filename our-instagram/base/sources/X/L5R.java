package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

/* loaded from: classes8.dex */
public final class L5R {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public InterfaceC193848i5 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final GestureDetector A0C;
    public final TouchInterceptorFrameLayout A0F;
    public final List A0G = AbstractC166987dD.A1E();
    public final LQP A0E = new LQP(this);
    public final LQO A0D = new LQO(this);

    public L5R(Context context, TouchInterceptorFrameLayout touchInterceptorFrameLayout) {
        this.A0F = touchInterceptorFrameLayout;
        GestureDetector gestureDetector = new GestureDetector(context, new C44399Jjc(this));
        this.A0C = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0A = ViewConfiguration.get(context).getScaledEdgeSlop();
    }
}
