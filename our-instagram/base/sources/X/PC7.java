package X;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class PC7 implements InterfaceC57985PnV {
    public TextView A00;
    public final View A01;
    public final Runnable A02 = new RunnableC56914PNh(this);
    public final InterfaceC09390do A03 = C57512Pfm.A00(this, 36);
    public final InterfaceC09390do A04 = C57512Pfm.A00(this, 37);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1 != null) goto L8;
     */
    @Override // X.InterfaceC57985PnV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADV(X.InterfaceC57856PlM r7) {
        /*
            r6 = this;
            X.Mwh r7 = (X.C51899Mwh) r7
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            boolean r0 = r7.A03
            if (r0 != 0) goto L36
            android.widget.TextView r1 = r6.A00
            if (r1 != 0) goto L1b
            android.view.View r1 = r6.A01
            r0 = 2131428098(0x7f0b0302, float:1.847783E38)
            android.widget.TextView r1 = X.AbstractC166987dD.A0e(r1, r0)
            r6.A00 = r1
            if (r1 == 0) goto L20
        L1b:
            java.lang.String r0 = ""
            r1.setText(r0)
        L20:
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L35
            boolean r2 = r0.booleanValue()
            X.0do r0 = r6.A03
            android.view.View r1 = X.AbstractC167007dF.A0L(r0)
            int r0 = X.AbstractC167007dF.A05(r2)
            r1.setVisibility(r0)
        L35:
            return
        L36:
            java.lang.String r2 = r7.A01
            if (r2 == 0) goto L20
            boolean r4 = r7.A02
            android.widget.TextView r3 = r6.A00
            if (r3 != 0) goto L4d
            android.view.View r1 = r6.A01
            r0 = 2131428098(0x7f0b0302, float:1.847783E38)
            android.widget.TextView r3 = X.AbstractC166987dD.A0e(r1, r0)
            r6.A00 = r3
            if (r3 == 0) goto L20
        L4d:
            r3.setText(r2)
            X.5le r2 = X.AbstractC125325le.A01(r3, r5)
            X.C14360o3.A07(r2)
            r2.A0G()
            r1 = 2
            X.Wmw r0 = new X.Wmw
            r0.<init>(r3, r1)
            r2.A06 = r0
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A0M(r1, r0)
            r2.A0H()
            if (r4 == 0) goto L20
            android.view.View r3 = r6.A01
            java.lang.Runnable r2 = r6.A02
            r3.removeCallbacks(r2)
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.postDelayed(r2, r0)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC7.ADV(X.PlM):void");
    }

    public PC7(View view) {
        this.A01 = view;
    }
}
