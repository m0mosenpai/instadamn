package X;

import android.view.MotionEvent;
import android.widget.EditText;

/* renamed from: X.MoI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51471MoI extends C5SZ {
    public final int A00;
    public final Object A01;

    public C51471MoI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(motionEvent2, 1);
                if (motionEvent != null) {
                    C56776PHt c56776PHt = (C56776PHt) this.A01;
                    return c56776PHt.A04.A01(motionEvent, motionEvent2, c56776PHt.A03, f, f2, false);
                }
                return false;
            case 1:
                C14360o3.A0B(motionEvent2, 1);
                if (motionEvent != null) {
                    C56179Owm c56179Owm = (C56179Owm) this.A01;
                    if (Math.abs(f2) > Math.abs(f)) {
                        if (motionEvent2.getRawY() < motionEvent.getRawY()) {
                            if (!c56179Owm.A01) {
                                OMc oMc = c56179Owm.A07;
                                if (!oMc.A03) {
                                    EditText editText = oMc.A09;
                                    editText.requestFocus();
                                    AbstractC13880nE.A0R(editText);
                                }
                            }
                        } else {
                            c56179Owm.A08.invoke();
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            default:
                if (motionEvent == null || Math.abs(f2) <= Math.abs(f) || motionEvent.getY() <= 5.0f) {
                    return false;
                }
                ((OMc) this.A01).A00();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                return false;
            case 1:
                return AbstractC25231BEo.A1b(((C56179Owm) this.A01).A09);
            default:
                ((OMc) this.A01).A00();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }
}
