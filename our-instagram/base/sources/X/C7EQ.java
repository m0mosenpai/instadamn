package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.7EQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7EQ extends ScaleGestureDetectorOnScaleGestureListenerC81153jk implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public boolean A01;
    public final float A02;
    public final GestureDetector A03;

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC81153jk
    public final boolean A01(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            this.A03.onTouchEvent(motionEvent);
        }
        return super.A00.onTouchEvent(motionEvent);
    }

    public C7EQ(Context context) {
        super(context);
        this.A02 = 2.0f;
        this.A03 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.7ER
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 0);
                ImmutableSet A03 = ImmutableSet.A03(((ScaleGestureDetectorOnScaleGestureListenerC81153jk) C7EQ.this).A01);
                C14360o3.A07(A03);
                Iterator it = new HashSet(A03).iterator();
                while (it.hasNext()) {
                    InterfaceC676933j interfaceC676933j = (InterfaceC676933j) it.next();
                    if (interfaceC676933j instanceof C7EP) {
                        ((C7EP) interfaceC676933j).A00(motionEvent, this);
                    }
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                C7EQ c7eq = C7EQ.this;
                c7eq.A01 = true;
                ImmutableSet A03 = ImmutableSet.A03(((ScaleGestureDetectorOnScaleGestureListenerC81153jk) c7eq).A01);
                C14360o3.A07(A03);
                Iterator it = new HashSet(A03).iterator();
                while (it.hasNext()) {
                    InterfaceC676933j interfaceC676933j = (InterfaceC676933j) it.next();
                    if (interfaceC676933j instanceof C7EP) {
                        C7EQ c7eq2 = this;
                        interfaceC676933j.DiK(c7eq2);
                        ImmutableSet A032 = ImmutableSet.A03(((ScaleGestureDetectorOnScaleGestureListenerC81153jk) c7eq2).A01);
                        C14360o3.A07(A032);
                        Iterator it2 = new HashSet(A032).iterator();
                        while (it2.hasNext()) {
                            InterfaceC676933j interfaceC676933j2 = (InterfaceC676933j) it2.next();
                            if (interfaceC676933j2 instanceof C7ET) {
                                C7ET c7et = (C7ET) interfaceC676933j2;
                                if (c7et.A03 <= 1.0f) {
                                    c7et.A0K.A02();
                                    c7et.DiJ(c7eq2);
                                } else {
                                    c7et.A03 = 0.9f;
                                }
                            }
                        }
                        interfaceC676933j.DiP(c7eq2);
                    }
                }
                c7eq.A01 = false;
                return true;
            }
        }, null);
    }

    @Override // X.ScaleGestureDetectorOnScaleGestureListenerC81153jk
    public final float A00() {
        if (this.A01) {
            return this.A02;
        }
        return super.A00.getScaleFactor();
    }
}
