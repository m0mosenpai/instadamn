package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.window.PopupLayout;
import java.util.List;

/* renamed from: X.Co2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28832Co2 implements InterfaceC1127857k {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C28832Co2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1127857k
    public final int Cnk(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (this.A00 != 0) {
            return BHV.A00(interfaceC1131259a, this, list, i);
        }
        BT9 bt9 = (BT9) this.A02;
        ViewGroup.LayoutParams layoutParams = bt9.getLayoutParams();
        C14360o3.A0A(layoutParams);
        bt9.measure(BT9.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bt9.getMeasuredHeight();
    }

    @Override // X.InterfaceC1127857k
    public final int Cnn(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (this.A00 != 0) {
            return BHV.A01(interfaceC1131259a, this, list, i);
        }
        return A00((BT9) this.A02, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        int A00;
        int measuredHeight;
        InterfaceC16660sJ c65076Td9;
        if (this.A00 != 0) {
            ((PopupLayout) this.A02).A00 = (AnonymousClass583) this.A01;
            return c59z.Cgx(AbstractC06930Yk.A0E(), C29986DJy.A00, 0, 0);
        }
        BT9 bt9 = (BT9) this.A02;
        if (bt9.getChildCount() == 0) {
            A00 = Constraints.A03(j);
            measuredHeight = Constraints.A02(j);
            c65076Td9 = C29983DJv.A00;
        } else {
            int A03 = Constraints.A03(j);
            if (A03 != 0) {
                bt9.getChildAt(0).setMinimumWidth(A03);
            }
            int A02 = Constraints.A02(j);
            if (A02 != 0) {
                bt9.getChildAt(0).setMinimumHeight(A02);
            }
            int A01 = Constraints.A01(j);
            ViewGroup.LayoutParams layoutParams = bt9.getLayoutParams();
            C14360o3.A0A(layoutParams);
            A00 = A00(bt9, A02, Constraints.A00(j), BT9.A00(A03, A01, layoutParams.width));
            measuredHeight = bt9.getMeasuredHeight();
            c65076Td9 = new C65076Td9(6, bt9, this.A01);
        }
        return AbstractC25229BEm.A0Z(c59z, c65076Td9, A00, measuredHeight);
    }

    @Override // X.InterfaceC1127857k
    public final int Cpf(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (this.A00 != 0) {
            return BHV.A02(interfaceC1131259a, this, list, i);
        }
        BT9 bt9 = (BT9) this.A02;
        ViewGroup.LayoutParams layoutParams = bt9.getLayoutParams();
        C14360o3.A0A(layoutParams);
        bt9.measure(BT9.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return bt9.getMeasuredHeight();
    }

    @Override // X.InterfaceC1127857k
    public final int Cpi(InterfaceC1131259a interfaceC1131259a, List list, int i) {
        if (this.A00 != 0) {
            return BHV.A03(interfaceC1131259a, this, list, i);
        }
        return A00((BT9) this.A02, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static int A00(BT9 bt9, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = bt9.getLayoutParams();
        C14360o3.A0A(layoutParams);
        bt9.measure(i3, BT9.A00(i, i2, layoutParams.height));
        return bt9.getMeasuredWidth();
    }
}
