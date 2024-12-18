package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IkQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42057IkQ implements View.OnTouchListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnTouchListenerC42057IkQ(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke;
        String A2u;
        switch (this.A00) {
            case 0:
                InterfaceC16590sC interfaceC16590sC = ((C38114Gph) this.A04).A04;
                Object obj = this.A02;
                Object obj2 = this.A03;
                Integer valueOf = Integer.valueOf(this.A01);
                C14360o3.A0A(view);
                C14360o3.A0A(motionEvent);
                invoke = interfaceC16590sC.invoke(obj, obj2, valueOf, view, motionEvent);
                break;
            case 1:
                InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) ((C38612GyF) this.A03).A01.A01;
                Object obj3 = this.A02;
                C14360o3.A0A(motionEvent);
                invoke = interfaceC16600sD.invoke(obj3, motionEvent, Integer.valueOf(this.A01), ((C41197ILl) this.A04).A00);
                break;
            default:
                if (motionEvent.getAction() == 1 && (A2u = ((C38321qM) this.A03).A2u()) != null) {
                    ((InterfaceC144936gD) this.A04).Dsu(AbstractC166997dE.A0L(view), (InterfaceC11380iw) this.A02, A2u, motionEvent.getRawX(), motionEvent.getRawY(), this.A01);
                    return true;
                }
                return true;
        }
        return AbstractC166987dD.A1a(invoke);
    }
}
