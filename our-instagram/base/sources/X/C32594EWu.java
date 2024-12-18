package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.EWu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32594EWu extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return new C31953E2h(FY8.A00(viewGroup));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r2.length() == 0) goto L11;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r9, X.C3OO r10) {
        /*
            r8 = this;
            X.E8o r9 = (X.C32090E8o) r9
            X.E2h r10 = (X.C31953E2h) r10
            r6 = 0
            if (r10 == 0) goto Ld5
            X.FNF r4 = r10.A02
        L9:
            if (r9 == 0) goto Le0
            if (r4 == 0) goto Le0
            java.lang.String r2 = r9.A04
            r5 = 0
            if (r2 == 0) goto L19
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r7 = 8
            android.widget.TextView r1 = r4.A03
            if (r0 == 0) goto Lc6
            java.lang.String r3 = r9.A06
            r1.setText(r3)
            android.widget.TextView r0 = r4.A04
            r0.setVisibility(r7)
        L2a:
            boolean r0 = r9.A07
            X.C85963sQ.A0B(r1, r0)
            java.lang.String r2 = r9.A05
            if (r2 == 0) goto L38
            android.widget.TextView r0 = r4.A02
            r0.setText(r2)
        L38:
            android.widget.TextView r1 = r4.A02
            if (r2 == 0) goto L43
            int r0 = r2.length()
            if (r0 == 0) goto L43
            r7 = 0
        L43:
            r1.setVisibility(r7)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r4.A01
            com.instagram.common.typedurl.ImageUrl r1 = r9.A02
            X.FuB r0 = new X.FuB
            r0.<init>()
            r2.A0F(r6, r0, r1)
            android.content.Context r6 = r2.getContext()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
            r2.A0B(r1, r5)
            r2.A06()
            android.view.ViewGroup r4 = r4.A00
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165235(0x7f070033, float:1.7944681E38)
            X.AbstractC31172DnG.A1F(r1, r2, r0)
            X.2jc r0 = r10.A01
            android.view.View r1 = r0.A01()
            X.C14360o3.A07(r1)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r9.A01
            r1.setChecked(r0)
            r0 = 5
            X.ViewOnClickListenerC35687FpM.A00(r4, r0, r1, r9)
            X.FKz r0 = r9.A03
            int r2 = r9.A00
            X.C14360o3.A0B(r3, r5)
            X.EOI r1 = r0.A00
            java.util.HashSet r0 = r1.A0P
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto Le0
            java.util.HashMap r0 = r1.A0N
            java.lang.Object r0 = r0.get(r3)
            X.E8F r0 = (X.E8F) r0
            if (r0 == 0) goto Le0
            X.6PG r2 = X.EOI.A00(r0, r2)
            if (r2 == 0) goto Le0
            X.2ur r1 = r1.A0C
            if (r1 != 0) goto Ld8
            java.lang.String r0 = "recommendedUserLogger"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc6:
            r1.setText(r2)
            android.widget.TextView r0 = r4.A04
            java.lang.String r3 = r9.A06
            r0.setText(r3)
            r0.setVisibility(r5)
            goto L2a
        Ld5:
            r4 = r6
            goto L9
        Ld8:
            X.6PH r0 = new X.6PH
            r0.<init>(r2)
            r1.A09(r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32594EWu.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32090E8o.class;
    }
}
