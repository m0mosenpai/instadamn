package X;

import android.view.View;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EVF extends AbstractC60592pi {
    public boolean A00;
    public boolean A01;
    public final AbstractC32317ELg A02;
    public final ProgressButton A03;

    public EVF(AbstractC32317ELg abstractC32317ELg, ProgressButton progressButton, String str) {
        C14360o3.A0B(progressButton, 1);
        this.A03 = progressButton;
        if (str != null && str.length() != 0) {
            progressButton.setText(str);
        }
        this.A02 = abstractC32317ELg;
        this.A01 = false;
        this.A00 = true;
        progressButton.setEnabled(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3.A00 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r3 = this;
            r0 = 1
            r3.A01 = r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r3.A03
            r2.setShowProgressBar(r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L11
            boolean r1 = r3.A00
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r2.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVF.A00():void");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        ViewOnClickListenerC35685FpK.A01(this.A03, 35, this);
    }
}
