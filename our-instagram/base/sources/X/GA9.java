package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GA9 implements GZH {
    public final C31250DoY A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.GZH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFW(X.EnumC33370Ep3 r3, X.C5HW r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.5HX r0 = r4.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L11
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GA9.AFW(X.Ep3, X.5HW, int):boolean");
    }

    public GA9(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        C31250DoY c31250DoY = this.A00;
        String str = c5hw.A04.A0f;
        if (str != null) {
            c31250DoY.Dxj(AbstractC31173DnH.A0a(mud, enumC33370Ep3, i), c5hw, str, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
