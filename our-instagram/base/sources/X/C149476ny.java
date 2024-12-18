package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149476ny {
    public Context A00;
    public GestureDetector A01;
    public final GestureDetector.SimpleOnGestureListener A02 = new GestureDetector.SimpleOnGestureListener() { // from class: X.6nz
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C149396nq c149396nq = C149476ny.this.A03;
            motionEvent.getX();
            motionEvent.getY();
            C0JM c0jm = c149396nq.A06;
            if (c0jm.now() - c149396nq.A02 >= 200) {
                c149396nq.A02 = c0jm.now();
                return true;
            }
            return true;
        }
    };
    public final C149396nq A03;

    public C149476ny(Context context, C149396nq c149396nq) {
        this.A00 = context;
        this.A03 = c149396nq;
    }
}
