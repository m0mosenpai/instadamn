package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MoJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51472MoJ extends C5SZ {
    public boolean A00 = true;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ C55590OmT A02;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C55590OmT.A00(motionEvent, this.A01, this.A02);
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C55590OmT c55590OmT = this.A02;
        int A07 = MSW.A07(C55590OmT.A00(motionEvent, this.A01, c55590OmT), 1);
        if (A07 != -1) {
            c55590OmT.A04.Du3(A07);
        }
        this.A00 = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C55590OmT c55590OmT = this.A02;
        RecyclerView recyclerView = this.A01;
        Integer[] A00 = C55590OmT.A00(motionEvent, recyclerView, c55590OmT);
        int intValue = c55590OmT.A00.intValue();
        if (intValue != 1 && intValue != 2) {
            c55590OmT.A04.Dt4(MSW.A07(A00, 1));
        } else {
            if (MSW.A07(A00, 0) != -1) {
                return;
            }
            c55590OmT.A01(motionEvent, recyclerView);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r10 >= 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r10 <= 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (java.lang.Math.abs(r11) > java.lang.Math.abs(r10)) goto L10;
     */
    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r8, android.view.MotionEvent r9, float r10, float r11) {
        /*
            r7 = this;
            r1 = 1
            X.C14360o3.A0B(r9, r1)
            boolean r0 = r7.A00
            if (r0 == 0) goto L2e
            X.OmT r5 = r7.A02
            java.lang.Integer r6 = r5.A00
            androidx.recyclerview.widget.RecyclerView r4 = r7.A01
            r0 = -1
            boolean r3 = r4.canScrollHorizontally(r0)
            boolean r2 = r4.canScrollHorizontally(r1)
            java.lang.Integer r1 = X.C05F.A0C
            if (r6 != r1) goto L3d
            if (r3 == 0) goto L3d
            if (r2 == 0) goto L3d
        L1f:
            float r1 = java.lang.Math.abs(r11)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2e
        L2b:
            r5.A01(r9, r4)
        L2e:
            X.OmT r0 = r7.A02
            X.Pqq r0 = r0.A04
            r0.Dik()
            r0 = 0
            r7.A00 = r0
            boolean r0 = super.onScroll(r8, r9, r10, r11)
            return r0
        L3d:
            r0 = 0
            if (r6 != r1) goto L2e
            if (r3 != 0) goto L49
            if (r2 == 0) goto L2b
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L1f
        L49:
            if (r2 != 0) goto L2e
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L2b
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51472MoJ.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        C14360o3.A0B(motionEvent, 0);
        C55590OmT c55590OmT = this.A02;
        c55590OmT.A01 = motionEvent.toString();
        if (!c55590OmT.A02) {
            return false;
        }
        RecyclerView recyclerView = this.A01;
        View A0I = MSZ.A0I(motionEvent, recyclerView);
        if (A0I == null) {
            z = false;
        } else {
            z = recyclerView.A0Y(A0I) instanceof C51206Mjr;
        }
        if (z) {
            c55590OmT.A04.CvN();
        } else {
            Integer[] A00 = C55590OmT.A00(motionEvent, recyclerView, c55590OmT);
            if (MSW.A07(A00, 0) != -1) {
                InterfaceC58185Pqq interfaceC58185Pqq = c55590OmT.A04;
                if (interfaceC58185Pqq.Eil(MSW.A07(A00, 1))) {
                    recyclerView.performHapticFeedback(1);
                    interfaceC58185Pqq.DvS(MSW.A07(A00, 0));
                    return true;
                }
            }
            int A07 = MSW.A07(A00, 1);
            if (A07 != -1) {
                c55590OmT.A04.Dt6(A07);
                return true;
            }
        }
        return true;
    }

    public C51472MoJ(RecyclerView recyclerView, C55590OmT c55590OmT) {
        this.A02 = c55590OmT;
        this.A01 = recyclerView;
    }
}
