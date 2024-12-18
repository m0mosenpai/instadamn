package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class U6M implements InterfaceC71944XBt {
    public static final U6M A00 = new Object();

    @Override // X.InterfaceC71944XBt
    public final C2W5 Cgy(C78473fD c78473fD, C2WC c2wc, C102884kP c102884kP, C102884kP c102884kP2, int i, int i2) {
        C135266Ab c135266Ab;
        int i3;
        C102884kP A08;
        C14360o3.A0B(c102884kP2, 5);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        C102884kP A082 = c102884kP2.A08(36);
        C79243gV c79243gV = null;
        if (A082 != null && (A08 = A082.A08(35)) != null) {
            C2W5 AF8 = A08.AF8(c78473fD, i, makeMeasureSpec);
            C14360o3.A07(AF8);
            c135266Ab = C135276Ac.A00(c78473fD, AF8, A08, null, AbstractC78403f6.A00(i, makeMeasureSpec));
        } else {
            c135266Ab = null;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (c135266Ab != null) {
            i3 = c135266Ab.A01.A00();
        } else {
            i3 = 0;
        }
        C2W5 AF82 = c102884kP.AF8(c78473fD, i, View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE));
        C14360o3.A07(AF82);
        int size2 = View.MeasureSpec.getSize(i);
        int height = AF82.getHeight() + i3;
        if (c135266Ab != null) {
            c79243gV = c135266Ab.A01;
        }
        return new U4H(AF82, c2wc, c79243gV, size2, height, 0, i3);
    }

    @Override // X.InterfaceC71944XBt
    public final boolean Ek1(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        if (AbstractC103044kf.A00() != null || !C6AO.A00(c102884kP.A08(35), c102884kP2.A08(35)) || obj != obj2) {
            return true;
        }
        return false;
    }
}
