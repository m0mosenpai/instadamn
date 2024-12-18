package X;

import android.app.Dialog;
import android.os.CountDownTimer;
import androidx.compose.ui.window.PopupLayout;

/* loaded from: classes5.dex */
public final class BFC implements InterfaceC118965aD {
    public final int A00;
    public final Object A01;

    public BFC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        switch (this.A00) {
            case 0:
            case 1:
                ((BTO) this.A01).A05();
                return;
            case 2:
                ((C6O6) this.A01).A01 = null;
                return;
            case 3:
                C6OD c6od = (C6OD) this.A01;
                int BIi = c6od.A01.BIi();
                for (int i = 0; i < BIi; i++) {
                    c6od.release();
                }
                return;
            case 4:
                ((BXF) this.A01).A08();
                return;
            case 5:
                ((C117865Uw) this.A01).A00.invoke();
                return;
            case 6:
                PopupLayout popupLayout = (PopupLayout) this.A01;
                popupLayout.A04();
                AbstractC55832hO.A01(popupLayout, null);
                popupLayout.A0B.removeViewImmediate(popupLayout);
                return;
            case 7:
                ((CountDownTimer) this.A01).cancel();
                return;
            case 8:
            case 9:
            default:
                ((Dialog) this.A01).dismiss();
                return;
            case 10:
                ((C55059OaE) this.A01).A02();
                return;
            case 11:
                C27955CTv c27955CTv = (C27955CTv) this.A01;
                CT6 ct6 = c27955CTv.A01;
                String str = c27955CTv.A02;
                ct6.A07.remove(str);
                if (!C14360o3.A0K(ct6.A06.getValue(), str)) {
                    return;
                }
                InterfaceC74953Yl interfaceC74953Yl = ct6.A05;
                interfaceC74953Yl.Egh(Integer.valueOf(((Number) interfaceC74953Yl.getValue()).intValue() + 1));
                return;
        }
    }
}
