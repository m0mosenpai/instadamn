package X;

import android.view.ViewTreeObserver;
import com.facebookpay.widget.button.FBPayButton;

/* loaded from: classes11.dex */
public final class WOB implements ViewTreeObserver.OnDrawListener {
    public final int A00;
    public final Object A01;

    public WOB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        String str;
        if (this.A00 != 0) {
            C67726Uws c67726Uws = (C67726Uws) this.A01;
            if (!c67726Uws.A0S) {
                FBPayButton fBPayButton = c67726Uws.A0Q;
                if (fBPayButton == null) {
                    str = "continueButton";
                } else {
                    fBPayButton.post(new RunnableC71452WuE(this, c67726Uws));
                    c67726Uws.A0S = true;
                    AbstractC69849Vwa.A00(c67726Uws);
                    return;
                }
            } else {
                return;
            }
        } else {
            C67727Uwt c67727Uwt = (C67727Uwt) this.A01;
            if (!c67727Uwt.A0E) {
                UFX ufx = c67727Uwt.A0B;
                str = "ecpViewModel";
                if (ufx != null) {
                    if (!AbstractC166997dE.A1Z(ufx.A0y.A02(), false)) {
                        UIK uik = c67727Uwt.A07;
                        if (uik == null) {
                            str = "payButtonViewHolder";
                        } else {
                            uik.A00.post(new RunnableC71451WuD(this, c67727Uwt));
                            UFX ufx2 = c67727Uwt.A0B;
                            if (ufx2 != null) {
                                ufx2.A0c = true;
                                ufx2.A0i();
                                c67727Uwt.A0E = true;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
