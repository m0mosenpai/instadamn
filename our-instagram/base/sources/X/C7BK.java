package X;

import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7BK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BK extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public InterfaceC72025XFn A00;
    public final View A01;
    public final boolean A02;
    public final GestureDetector A03;
    public final C7BL A04;

    public C7BK(GestureDetector.SimpleOnGestureListener simpleOnGestureListener, View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        this.A01 = view;
        this.A02 = z;
        final GestureDetector gestureDetector = new GestureDetector(textView.getContext(), this, new Handler(Looper.getMainLooper()));
        this.A03 = gestureDetector;
        final C7BL c7bl = new C7BL(simpleOnGestureListener, textView);
        this.A04 = c7bl;
        gestureDetector.setOnDoubleTapListener(this);
        textView.setMovementMethod(new LinkMovementMethod(gestureDetector, c7bl) { // from class: X.7BN
            public final GestureDetector A00;
            public final C7BM A01;

            /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
            
                if (r1 != null) goto L8;
             */
            @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouchEvent(android.widget.TextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
                /*
                    r6 = this;
                    r3 = 0
                    X.C14360o3.A0B(r7, r3)
                    r4 = 1
                    X.C14360o3.A0B(r8, r4)
                    r0 = 2
                    X.C14360o3.A0B(r9, r0)
                    float r0 = r9.getX()
                    int r5 = (int) r0
                    float r0 = r9.getY()
                    int r1 = (int) r0
                    int r0 = r7.getTotalPaddingLeft()
                    int r5 = r5 - r0
                    int r0 = r7.getTotalPaddingTop()
                    int r1 = r1 - r0
                    int r0 = r7.getScrollX()
                    int r5 = r5 + r0
                    int r0 = r7.getScrollY()
                    int r1 = r1 + r0
                    android.text.Layout r2 = r7.getLayout()
                    int r1 = r2.getLineForVertical(r1)
                    float r0 = (float) r5
                    int r1 = r2.getOffsetForHorizontal(r1, r0)
                    java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
                    java.lang.Object[] r2 = r8.getSpans(r1, r1, r0)
                    android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
                    int r1 = r9.getAction()
                    int r0 = r2.length
                    if (r0 == 0) goto L5d
                    if (r1 == 0) goto L61
                    if (r1 != r4) goto L70
                    r1 = r2[r3]
                    if (r1 == 0) goto L70
                L4e:
                    X.7BM r0 = r6.A01
                    X.7BL r0 = (X.C7BL) r0
                    r0.A01 = r1
                    r0.A00 = r8
                    android.view.GestureDetector r0 = r6.A00
                    boolean r0 = r0.onTouchEvent(r9)
                    return r0
                L5d:
                    android.text.Selection.removeSelection(r8)
                    goto L70
                L61:
                    r0 = r2[r3]
                    int r1 = r8.getSpanStart(r0)
                    r0 = r2[r3]
                    int r0 = r8.getSpanEnd(r0)
                    android.text.Selection.setSelection(r8, r1, r0)
                L70:
                    r1 = 0
                    goto L4e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7BN.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
            }

            {
                this.A00 = gestureDetector;
                this.A01 = c7bl;
            }
        });
        textView.setHighlightColor(0);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A04.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A02) {
            InterfaceC72025XFn interfaceC72025XFn = this.A00;
            if (interfaceC72025XFn == null) {
                interfaceC72025XFn = new WjE(this.A01, null);
            }
            this.A00 = interfaceC72025XFn;
            interfaceC72025XFn.Enw();
        }
        this.A04.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A04.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A04.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A04.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC162347Ow interfaceC162347Ow;
        C14360o3.A0B(motionEvent, 1);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && this.A02) {
                InterfaceC72025XFn interfaceC72025XFn = this.A00;
                if (interfaceC72025XFn == null) {
                    interfaceC72025XFn = new WjE(this.A01, null);
                }
                this.A00 = interfaceC72025XFn;
                interfaceC72025XFn.Enw();
            }
        } else if (this.A02) {
            InterfaceC72025XFn interfaceC72025XFn2 = this.A00;
            if (interfaceC72025XFn2 == null) {
                View view2 = this.A01;
                View view3 = view2;
                while (!(view3 instanceof RecyclerView)) {
                    Object parent = view3.getParent();
                    C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.View");
                    view3 = (View) parent;
                }
                Object A0X = ((RecyclerView) view3).A0X(view2);
                if (A0X != null) {
                    if (A0X instanceof InterfaceC162347Ow) {
                        interfaceC162347Ow = (InterfaceC162347Ow) A0X;
                    } else {
                        interfaceC162347Ow = null;
                    }
                    interfaceC72025XFn2 = new WjE(view2, interfaceC162347Ow);
                } else {
                    throw new IllegalStateException("This container can only be used in a RecyclerView.ViewHolder");
                }
            }
            this.A00 = interfaceC72025XFn2;
            interfaceC72025XFn2.EM8(motionEvent);
        }
        return this.A03.onTouchEvent(motionEvent);
    }
}
