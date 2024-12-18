package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.Mbh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50775Mbh extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ViewOnTouchListenerC55494Okn A00;
    public final /* synthetic */ InterfaceC58171Pqb A01;
    public final /* synthetic */ InterfaceC58172Pqc A02;
    public final /* synthetic */ C51362MmN A03;

    public C50775Mbh(ViewOnTouchListenerC55494Okn viewOnTouchListenerC55494Okn, InterfaceC58171Pqb interfaceC58171Pqb, InterfaceC58172Pqc interfaceC58172Pqc, C51362MmN c51362MmN) {
        this.A00 = viewOnTouchListenerC55494Okn;
        this.A03 = c51362MmN;
        this.A01 = interfaceC58171Pqb;
        this.A02 = interfaceC58172Pqc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r2 == X.EnumC53264Nh2.A0H) goto L12;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDown(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.Okn r0 = r5.A00
            java.lang.Object r1 = r0.A00
            X.MmN r0 = r5.A03
            android.view.View r4 = r0.A04
            boolean r0 = X.C14360o3.A0K(r1, r4)
            r3 = 1
            if (r0 != 0) goto L2c
            X.Pqb r1 = r5.A01
            X.Nh2 r0 = X.EnumC53264Nh2.A0A
            X.Nh2 r2 = r1.BO3()
            if (r2 == r0) goto L27
            X.Nh2 r0 = X.EnumC53264Nh2.A0G
            if (r2 == r0) goto L27
            X.Nh2 r0 = X.EnumC53264Nh2.A08
            if (r2 == r0) goto L27
            X.Nh2 r1 = X.EnumC53264Nh2.A0H
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 != r1) goto L29
        L27:
            r0 = 1056964608(0x3f000000, float:0.5)
        L29:
            r4.setAlpha(r0)
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50775Mbh.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean A0K = C14360o3.A0K(this.A00.A00, this.A03.A04);
        InterfaceC58172Pqc interfaceC58172Pqc = this.A02;
        if (A0K) {
            ((PJ0) interfaceC58172Pqc).A05();
            return true;
        }
        ((PJ0) interfaceC58172Pqc).A09.A01(this.A01);
        return true;
    }
}
