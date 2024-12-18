package X;

import android.os.Handler;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class P8T implements InterfaceC140616Xp {
    public InterfaceC140606Xo A00;
    public GradientSpinnerAvatarView A01;
    public final Handler A02 = AbstractC167007dF.A0J();

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        this.A01.A0A();
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC57046PSl(this, j, false));
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        this.A01.A0A();
        Handler handler = this.A02;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC57046PSl(this, j, true));
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        this.A01.A0A();
        this.A02.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2 != r1) goto L8;
     */
    @Override // X.InterfaceC140616Xp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r5 = this;
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r4 = r5.A01
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0O
            int r1 = r0.A04
            int r0 = r0.A0P
            boolean r3 = X.AbstractC167007dF.A1P(r1, r0)
            int r1 = r4.A04
            r0 = 2
            if (r1 != r0) goto L1c
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.A0P
            if (r0 == 0) goto L1c
            int r2 = r0.A04
            int r1 = r0.A0P
            r0 = 1
            if (r2 == r1) goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r3 != 0) goto L24
            if (r0 != 0) goto L24
            r4.A09()
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P8T.onStart():void");
    }

    public P8T(InterfaceC140606Xo interfaceC140606Xo, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        this.A01 = gradientSpinnerAvatarView;
        this.A00 = interfaceC140606Xo;
    }
}
