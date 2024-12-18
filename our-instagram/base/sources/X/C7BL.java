package X;

import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.7BL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BL extends C5SZ implements C7BM {
    public Spannable A00;
    public ClickableSpan A01;
    public final GestureDetector.SimpleOnGestureListener A02;
    public final TextView A03;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public final boolean onContextClick(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onContextClick(motionEvent);
        }
        return super.onContextClick(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        UpdateAppearance updateAppearance = this.A01;
        if (updateAppearance == null) {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
            if (simpleOnGestureListener != null) {
                return simpleOnGestureListener.onDoubleTap(motionEvent);
            }
            return super.onDoubleTap(motionEvent);
        }
        if (updateAppearance instanceof InterfaceC89423yi) {
            ((InterfaceC89423yi) updateAppearance).DBM(this.A03);
        } else {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener2 = this.A02;
            if (simpleOnGestureListener2 != null) {
                simpleOnGestureListener2.onDoubleTap(motionEvent);
            }
        }
        this.A01 = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onDoubleTapEvent(motionEvent);
        }
        return super.onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        C14360o3.A0B(motionEvent, 0);
        Spannable spannable = this.A00;
        if (spannable != null && (clickableSpan = this.A01) != null) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(this.A01));
        }
        return super.onDown(motionEvent);
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null && motionEvent != null) {
            return simpleOnGestureListener.onFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        super.onLongPress(motionEvent);
        Spannable spannable = this.A00;
        if (spannable != null) {
            Selection.removeSelection(spannable);
        }
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onLongPress(motionEvent);
        }
        this.A01 = null;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener;
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent != null && (simpleOnGestureListener = this.A02) != null) {
            return simpleOnGestureListener.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            simpleOnGestureListener.onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        ClickableSpan clickableSpan = this.A01;
        if (clickableSpan == null) {
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
            if (simpleOnGestureListener != null) {
                return simpleOnGestureListener.onSingleTapConfirmed(motionEvent);
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
        clickableSpan.onClick(this.A03);
        this.A01 = null;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.A02;
        if (simpleOnGestureListener != null) {
            return simpleOnGestureListener.onSingleTapUp(motionEvent);
        }
        return super.onSingleTapUp(motionEvent);
    }

    public C7BL(GestureDetector.SimpleOnGestureListener simpleOnGestureListener, TextView textView) {
        this.A03 = textView;
        this.A02 = simpleOnGestureListener;
    }
}
