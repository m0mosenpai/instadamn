package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.WvI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71513WvI implements Runnable {
    public final /* synthetic */ ViewOnTouchListenerC97504Zk A00;
    public final /* synthetic */ C38Z A01;

    public RunnableC71513WvI(ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C38Z c38z) {
        this.A01 = c38z;
        this.A00 = viewOnTouchListenerC97504Zk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int i;
        C38Z c38z = this.A01;
        InterfaceC145156ga interfaceC145156ga = c38z.A01;
        if (interfaceC145156ga != null) {
            interfaceC145156ga.Dm4();
        }
        ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk = this.A00;
        float[] fArr = new float[2];
        V9X A00 = viewOnTouchListenerC97504Zk.A00();
        ViewOnTouchListenerC66316U8p viewOnTouchListenerC66316U8p = (ViewOnTouchListenerC66316U8p) A00.A0F.getValue();
        Rect bounds = viewOnTouchListenerC66316U8p.getBounds();
        float intrinsicWidth = viewOnTouchListenerC66316U8p.A0O.getIntrinsicWidth();
        boolean z = viewOnTouchListenerC66316U8p.A09;
        float f2 = viewOnTouchListenerC66316U8p.A03;
        float width = bounds.width();
        if (z) {
            f = (f2 * (width - intrinsicWidth)) + (intrinsicWidth / 2.0f);
        } else {
            f = f2 * width;
        }
        fArr[0] = f;
        fArr[1] = AbstractC166997dE.A0G(viewOnTouchListenerC66316U8p) / 2;
        fArr[0] = fArr[0] + A00.A05;
        float intrinsicHeight = (fArr[1] + A00.getIntrinsicHeight()) - AbstractC167027dH.A02(r8);
        if (A00.A0B.A02().length() == 0) {
            i = A00.A04;
        } else {
            i = A00.A03;
        }
        fArr[1] = intrinsicHeight - i;
        fArr[0] = fArr[0] - (viewOnTouchListenerC97504Zk.A00().A0A / 2);
        fArr[1] = (fArr[1] - (viewOnTouchListenerC97504Zk.A00().getIntrinsicHeight() / 2)) + c38z.A03;
        Context context = c38z.A04;
        C5SU c5su = new C5SU((Activity) context, new C149686oL(AbstractC166997dE.A0p(context, 2131974204)));
        c5su.A04(viewOnTouchListenerC97504Zk.A06, (int) fArr[0], (int) fArr[1], true);
        c5su.A0F = true;
        c5su.A04 = new KYR(c38z, 13);
        C5SW A002 = c5su.A00();
        c38z.A00 = A002;
        c38z.A02 = true;
        A002.A06();
    }
}
