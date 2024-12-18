package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes5.dex */
public final class CWI {
    public InterfaceC16820sZ A00;
    public boolean A01;
    public final CWZ A02;
    public final C27840CPd A03;
    public final C01U A04;
    public final InterfaceC16660sJ A05;
    public final boolean A06;

    public CWI(CWZ cwz, C28371CfX c28371CfX, C27840CPd c27840CPd, String str, InterfaceC16660sJ interfaceC16660sJ) {
        Window CHl;
        View decorView;
        AbstractC25233BEq.A0w(2, str, c28371CfX, interfaceC16660sJ);
        this.A02 = cwz;
        this.A05 = interfaceC16660sJ;
        this.A03 = c27840CPd;
        C01U c01u = new C01U();
        this.A04 = c01u;
        this.A06 = AbstractC167007dF.A1P(c28371CfX.A01, 48);
        if (c28371CfX.A06) {
            c01u.addLast(new C27992CVp(c28371CfX, str, null));
        }
        CWZ cwz2 = this.A02;
        InterfaceC72040XGi interfaceC72040XGi = cwz2.A00;
        if (interfaceC72040XGi != null && (CHl = interfaceC72040XGi.CHl()) != null && (decorView = CHl.getDecorView()) != null && this.A06) {
            C202148wu c202148wu = new C202148wu(decorView, cwz2, this);
            AbstractC008903d.A00(decorView, c202148wu);
            C04U.A01(decorView, c202148wu);
        }
    }

    public final void A00() {
        Window CHl;
        View decorView;
        Object obj;
        InterfaceC72040XGi interfaceC72040XGi = this.A02.A00;
        if (interfaceC72040XGi != null && (CHl = interfaceC72040XGi.CHl()) != null && (decorView = CHl.getDecorView()) != null) {
            Context context = decorView.getContext();
            if (context != null) {
                obj = context.getSystemService("input_method");
            } else {
                obj = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
        }
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        if (this.A06 && this.A01) {
            A00();
            this.A00 = new D8K(2, interfaceC16820sZ, this);
        } else {
            interfaceC16820sZ.invoke();
        }
    }

    public final void A02(InterfaceC16660sJ interfaceC16660sJ) {
        if (this.A04.size() <= 1) {
            A01(C29905DGt.A01(this, 15));
        } else {
            A01(new D8K(3, interfaceC16660sJ, this));
            AbstractC25227BEk.A1Q(this.A05, false);
        }
    }
}
