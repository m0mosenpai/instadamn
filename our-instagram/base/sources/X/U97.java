package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
public final class U97 extends Handler {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U97(Looper looper, int i) {
        super(looper);
        this.A00 = i;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C102884kP c102884kP;
        InterfaceC103384lE A0B;
        if (this.A00 != 0) {
            C14360o3.A0B(message, 0);
            super.handleMessage(message);
            if (message.what == 0) {
                Object obj = message.obj;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.bloks.components.IgSliderBinderUtils.SliderController");
                C69088Vhe c69088Vhe = ((C68714Vaq) obj).A00;
                if (c69088Vhe != null) {
                    C102884kP c102884kP2 = c69088Vhe.A02;
                    InterfaceC103384lE A0B2 = c102884kP2.A0B(40);
                    C6FX c6fx = new C6FX();
                    c6fx.A03(c69088Vhe.A02, 0);
                    c6fx.A02(Integer.valueOf(c69088Vhe.A00));
                    C6FP.A03(c69088Vhe.A01, c102884kP2, c6fx.A00(), A0B2);
                    return;
                }
                return;
            }
            return;
        }
        super.handleMessage(message);
        C69473Vnw c69473Vnw = (C69473Vnw) message.obj;
        if (message.what != 0 || c69473Vnw == null || (c102884kP = c69473Vnw.A0D) == null || c69473Vnw.A0C == null || (A0B = c102884kP.A0B(38)) == null) {
            return;
        }
        C102884kP c102884kP3 = c69473Vnw.A0D;
        C6FX c6fx2 = new C6FX();
        c6fx2.A01(Float.valueOf(c69473Vnw.A07 / 2.1474836E9f));
        c6fx2.A02(c69473Vnw.A0C);
        C6FP.A03(c69473Vnw.A0C, c102884kP3, c6fx2.A00(), A0B);
    }
}
