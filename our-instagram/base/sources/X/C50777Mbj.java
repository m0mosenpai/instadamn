package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Mbj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50777Mbj extends GestureDetector.SimpleOnGestureListener {
    public boolean A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C84823qW A03;
    public final /* synthetic */ InterfaceC145476h6 A04;
    public final /* synthetic */ C139636Ts A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r4.getRawX() > (r2 * 0.75f)) goto L6;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            float r1 = r4.getRawX()
            float r2 = r3.A01
            r0 = 1048576000(0x3e800000, float:0.25)
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1d
            float r1 = r4.getRawX()
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 * r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r3.A00 = r0
            if (r0 == 0) goto L2b
            X.6h6 r1 = r3.A04
            float r0 = r4.getRawX()
            r1.DBc(r0)
        L2b:
            boolean r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50777Mbj.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            this.A04.DQV(motionEvent.getRawX(), motionEvent.getRawY());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A05.A04.getLocationOnScreen(new int[]{0, 0});
        C84823qW c84823qW = this.A03;
        c84823qW.A03 = motionEvent.getRawX() - r2[0];
        c84823qW.A04 = motionEvent.getRawY() - r2[1];
        InterfaceC145476h6 interfaceC145476h6 = this.A04;
        Context context = this.A02;
        C14360o3.A0A(context);
        interfaceC145476h6.DbT(context, c84823qW, C05F.A01);
        return true;
    }

    public C50777Mbj(Context context, C84823qW c84823qW, InterfaceC145476h6 interfaceC145476h6, C139636Ts c139636Ts, float f) {
        this.A01 = f;
        this.A04 = interfaceC145476h6;
        this.A05 = c139636Ts;
        this.A03 = c84823qW;
        this.A02 = context;
    }
}
