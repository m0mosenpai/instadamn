package X;

import android.animation.Animator;
import android.content.Context;

/* loaded from: classes11.dex */
public final class WXp implements InterfaceC77833eB {
    public final /* synthetic */ W1l A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ String A03;

    public WXp(W1l w1l, C6FG c6fg, C102884kP c102884kP, String str) {
        this.A00 = w1l;
        this.A02 = c102884kP;
        this.A03 = str;
        this.A01 = c6fg;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        U80 u80;
        W1l w1l = this.A00;
        UP7 up7 = w1l.A01;
        String str = up7.A03;
        boolean z = up7.A04;
        int i = up7.A01;
        float f = up7.A00;
        C14360o3.A0B(str, 0);
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            u80 = new U80(0, this.A01, c102884kP, A09);
        } else {
            u80 = null;
        }
        String str2 = this.A03;
        if (!C14360o3.A0K(str2, up7.A03)) {
            z = c102884kP.A0S(35, true);
            i = c102884kP.A03(38, 1);
            f = 0.0f;
        }
        up7.A03 = str2;
        up7.A04 = z;
        up7.A01 = i;
        up7.A02 = u80;
        up7.A00 = f;
        if (w1l.A00 != null) {
            W1l.A00(w1l);
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        float BiI;
        W1l w1l = this.A00;
        InterfaceC58682mR interfaceC58682mR = w1l.A00;
        if (interfaceC58682mR != null) {
            UP7 up7 = w1l.A01;
            if (interfaceC58682mR.isFinished()) {
                up7.A04 = false;
                BiI = 1.0f;
            } else {
                up7.A04 = interfaceC58682mR.isPlaying();
                if (up7.A01 != 0) {
                    up7.A01 = interfaceC58682mR.Bmx();
                }
                BiI = interfaceC58682mR.BiI();
            }
            up7.A00 = BiI;
            Animator.AnimatorListener animatorListener = up7.A02;
            if (animatorListener != null) {
                interfaceC58682mR.EFV(animatorListener);
            }
            interfaceC58682mR.pause();
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
