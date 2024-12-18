package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.WNz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC70254WNz implements View.OnTouchListener {
    public final C86243sv A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C69656Vsx A02;
    public final /* synthetic */ C69297Vl5 A03;
    public final /* synthetic */ InterfaceC86223st A04;
    public final /* synthetic */ C75113Zb A05;

    public ViewOnTouchListenerC70254WNz(C38321qM c38321qM, C69656Vsx c69656Vsx, C69297Vl5 c69297Vl5, InterfaceC86223st interfaceC86223st, C75113Zb c75113Zb) {
        this.A03 = c69297Vl5;
        this.A04 = interfaceC86223st;
        this.A02 = c69656Vsx;
        this.A01 = c38321qM;
        this.A05 = c75113Zb;
        this.A00 = new C86243sv(c69297Vl5.A01, c38321qM, interfaceC86223st, c69656Vsx.A09, c75113Zb, 0);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.DGb(motionEvent);
    }
}
