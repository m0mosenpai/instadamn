package X;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.Okn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55494Okn implements View.OnTouchListener {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnTouchListenerC55494Okn(InterfaceC58171Pqb interfaceC58171Pqb, InterfaceC58172Pqc interfaceC58172Pqc, C51362MmN c51362MmN) {
        this.A01 = 4;
        this.A03 = c51362MmN;
        this.A02 = interfaceC58171Pqb;
        this.A04 = new GestureDetector(c51362MmN.A07.getContext(), new C50775Mbh(this, interfaceC58171Pqb, interfaceC58172Pqc, c51362MmN));
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0178  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC55494Okn.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC55494Okn(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A00 = obj2;
    }
}
