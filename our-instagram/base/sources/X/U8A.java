package X;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes11.dex */
public final class U8A extends Dialog {
    public final /* synthetic */ C68686VaM A00;
    public final /* synthetic */ C1338462s A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Window window;
        View decorView;
        C102884kP c102884kP;
        C14360o3.A0B(motionEvent, 0);
        InterfaceC103384lE interfaceC103384lE = this.A02;
        if (interfaceC103384lE != null && motionEvent.getAction() == 0 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null) {
            if (motionEvent.getX() < 0.0f || motionEvent.getX() >= decorView.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= decorView.getHeight()) {
                C1338462s c1338462s = this.A01;
                if (c1338462s != null) {
                    c102884kP = c1338462s.A02;
                } else {
                    c102884kP = null;
                }
                C6FP.A03((C6FG) this.A03.invoke(), c102884kP, C6FW.A01, interfaceC103384lE);
                this.A00.A00.A07();
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8A(Context context, C68686VaM c68686VaM, C1338462s c1338462s, InterfaceC103384lE interfaceC103384lE, InterfaceC16820sZ interfaceC16820sZ) {
        super(context);
        this.A02 = interfaceC103384lE;
        this.A01 = c1338462s;
        this.A03 = interfaceC16820sZ;
        this.A00 = c68686VaM;
    }
}
