package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W32 {
    public final float[] A00 = new float[2];
    public final /* synthetic */ int A01;
    public final /* synthetic */ C9CG A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC97494Zj A04;
    public final /* synthetic */ ViewOnTouchListenerC97504Zk A05;
    public final /* synthetic */ Wm2 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public W32(C9CG c9cg, UserSession userSession, InterfaceC97494Zj interfaceC97494Zj, ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, Wm2 wm2, String str, String str2, int i) {
        this.A04 = interfaceC97494Zj;
        this.A06 = wm2;
        this.A03 = userSession;
        this.A02 = c9cg;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = i;
        this.A05 = viewOnTouchListenerC97504Zk;
    }

    public static final void A00(W32 w32, float f) {
        float f2;
        int i;
        ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk = w32.A05;
        V9X A00 = viewOnTouchListenerC97504Zk.A00();
        float[] fArr = w32.A00;
        C14360o3.A0B(fArr, 0);
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p = (ViewOnTouchListenerC66316U8p) A00.A0F.getValue();
        Rect bounds = viewOnTouchListenerC66316U8p.getBounds();
        float f3 = (int) viewOnTouchListenerC66316U8p.A0N.A00;
        boolean z = viewOnTouchListenerC66316U8p.A09;
        float f4 = viewOnTouchListenerC66316U8p.A00;
        float width = bounds.width();
        if (z) {
            f2 = (f4 * (width - f3)) + (f3 / 2.0f);
        } else {
            f2 = f4 * width;
        }
        fArr[0] = f2;
        fArr[1] = AbstractC166997dE.A0G(viewOnTouchListenerC66316U8p) / 2;
        fArr[0] = fArr[0] + A00.A05;
        float intrinsicHeight = (fArr[1] + A00.getIntrinsicHeight()) - AbstractC167027dH.A02(r6);
        if (A00.A0B.A02().length() == 0) {
            i = A00.A04;
        } else {
            i = A00.A03;
        }
        fArr[1] = intrinsicHeight - i;
        viewOnTouchListenerC97504Zk.A06.getMatrix().mapPoints(fArr);
        ChoreographerFrameCallbackC66315U8o choreographerFrameCallbackC66315U8o = viewOnTouchListenerC97504Zk.A00;
        if (choreographerFrameCallbackC66315U8o != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            choreographerFrameCallbackC66315U8o.A01 = f5;
            choreographerFrameCallbackC66315U8o.A02 = f6;
            C69362Vm8 c69362Vm8 = choreographerFrameCallbackC66315U8o.A03;
            if (c69362Vm8 != null) {
                c69362Vm8.A03 = f5;
                c69362Vm8.A04 = f6;
            }
            choreographerFrameCallbackC66315U8o.invalidateSelf();
            ChoreographerFrameCallbackC66315U8o choreographerFrameCallbackC66315U8o2 = viewOnTouchListenerC97504Zk.A00;
            if (choreographerFrameCallbackC66315U8o2 != null) {
                float f7 = choreographerFrameCallbackC66315U8o2.A08 + (f * (choreographerFrameCallbackC66315U8o2.A07 - r2));
                choreographerFrameCallbackC66315U8o2.A00 = f7;
                C69362Vm8 c69362Vm82 = choreographerFrameCallbackC66315U8o2.A03;
                if (c69362Vm82 != null) {
                    c69362Vm82.A01 = f7;
                }
                choreographerFrameCallbackC66315U8o2.invalidateSelf();
                return;
            }
        }
        C14360o3.A0F("sliderParticleSystem");
        throw C00O.createAndThrow();
    }
}
