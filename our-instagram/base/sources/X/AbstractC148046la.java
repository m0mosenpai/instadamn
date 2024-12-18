package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.6la, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC148046la {
    public static final void A00(TouchInterceptorFrameLayout touchInterceptorFrameLayout, final InterfaceC149626oF interfaceC149626oF) {
        C14360o3.A0B(interfaceC149626oF, 0);
        C14360o3.A0B(touchInterceptorFrameLayout, 1);
        touchInterceptorFrameLayout.A00(new View.OnTouchListener() { // from class: X.6lb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                InterfaceC149626oF interfaceC149626oF2 = InterfaceC149626oF.this;
                C14360o3.A0A(motionEvent);
                return interfaceC149626oF2.DMc(motionEvent);
            }
        }, new View.OnTouchListener() { // from class: X.6lc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                InterfaceC149626oF interfaceC149626oF2 = InterfaceC149626oF.this;
                C14360o3.A0A(motionEvent);
                return interfaceC149626oF2.Du7(motionEvent);
            }
        });
    }
}
