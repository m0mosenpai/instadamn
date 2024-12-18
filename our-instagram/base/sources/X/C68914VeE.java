package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.VeE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68914VeE {
    public final View A00;
    public final DialogC51582Yg A01;

    public C68914VeE(View view, Fragment fragment, C1338462s c1338462s, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        WTP wtp;
        boolean A1V = AbstractC167007dF.A1V(c1338462s);
        this.A00 = view;
        DialogC51582Yg dialogC51582Yg = new DialogC51582Yg(fragment.requireActivity());
        this.A01 = dialogC51582Yg;
        if (str != null) {
            dialogC51582Yg.A05(new WTO(AbstractC68321VMh.A00(str, 0)));
            wtp = null;
        } else {
            wtp = WTP.A00;
            dialogC51582Yg.A05(wtp);
        }
        dialogC51582Yg.A07 = wtp;
        C66242U5m c66242U5m = dialogC51582Yg.A09;
        c66242U5m.A03(DialogC51582Yg.A02(dialogC51582Yg.A08, wtp), dialogC51582Yg.isShowing());
        dialogC51582Yg.setContentView(view);
        dialogC51582Yg.setCancelable(A1V);
        c66242U5m.A07 = AbstractC167007dF.A1W(interfaceC103384lE);
        dialogC51582Yg.setCanceledOnTouchOutside(interfaceC103384lE2 != null);
        dialogC51582Yg.A06 = new WTL(c1338462s, interfaceC103384lE, interfaceC103384lE2, interfaceC103384lE3, interfaceC16820sZ, interfaceC16660sJ);
    }
}
