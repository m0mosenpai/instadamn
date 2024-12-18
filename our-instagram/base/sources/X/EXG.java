package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.fragment.OnboardingCheckListFragment;

/* loaded from: classes6.dex */
public final class EXG extends AbstractC66412zI {
    public final OnboardingCheckListFragment A00;
    public final boolean A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3R(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.onboarding_check_list_item_row_with_subtitle, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r9, X.C3OO r10) {
        /*
            r8 = this;
            X.Fxt r9 = (X.C36179Fxt) r9
            X.E3R r10 = (X.E3R) r10
            X.AbstractC167017dG.A1N(r9, r10)
            X.FRF r3 = r9.A00
            java.lang.String r0 = r3.A05
            X.C14360o3.A07(r0)
            java.lang.Integer r2 = X.F0R.A00(r0)
            if (r2 == 0) goto L7f
            android.widget.TextView r1 = r10.A05
            java.lang.String r0 = r3.A02
            r1.setText(r0)
            android.widget.ImageView r1 = r10.A01
            int r0 = r2.intValue()
            switch(r0) {
                case 1: goto La7;
                case 2: goto Lac;
                case 3: goto Lb1;
                case 4: goto Lb6;
                case 5: goto Lb6;
                case 6: goto Lbb;
                case 7: goto Lc0;
                case 8: goto Lc5;
                case 9: goto Lc5;
                case 10: goto Lca;
                case 11: goto Lc5;
                case 12: goto Lcf;
                default: goto L24;
            }
        L24:
            r0 = 2131239024(0x7f082070, float:1.8094343E38)
        L27:
            r1.setImageResource(r0)
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L35
            android.widget.TextView r0 = r10.A04
            if (r0 == 0) goto L35
            r0.setText(r1)
        L35:
            android.view.View r5 = r10.A00
            android.content.Context r6 = r5.getContext()
            X.FMc r2 = r3.A00
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "complete"
            boolean r0 = r0.equals(r1)
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L80
            android.widget.ImageView r2 = r10.A02
            r0 = 2131238123(0x7f081ceb, float:1.8092516E38)
            r2.setImageResource(r0)
            boolean r1 = r8.A01
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            if (r1 == 0) goto L5b
            r0 = 2130970309(0x7f0406c5, float:1.7549324E38)
        L5b:
            int r0 = X.AbstractC167007dF.A09(r6, r0)
            r2.setColorFilter(r0)
            r0 = 0
            r5.setOnClickListener(r0)
        L66:
            r7 = 0
        L67:
            r0 = 11
            X.ViewOnClickListenerC35683FpI.A00(r5, r0, r9, r8)
            android.widget.ImageView r1 = r10.A02
            r0 = 0
            if (r7 == 0) goto L73
            r0 = 8
        L73:
            r1.setVisibility(r0)
            android.widget.TextView r0 = r10.A03
            if (r7 != 0) goto L7c
            r4 = 8
        L7c:
            r0.setVisibility(r4)
        L7f:
            return
        L80:
            if (r2 == 0) goto L97
            int r3 = r2.A00
            if (r3 <= 0) goto L97
            int r0 = r2.A01
            if (r3 >= r0) goto L97
            android.widget.TextView r2 = r10.A03
            r1 = 2131977130(0x7f1363aa, float:1.95914E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.AbstractC31177DnL.A0r(r6, r2, r0, r1)
            goto L67
        L97:
            android.widget.ImageView r1 = r10.A02
            r0 = 2131238146(0x7f081d02, float:1.8092562E38)
            r1.setImageResource(r0)
            int r0 = X.AbstractC53242c7.A0B(r6)
            X.AbstractC31173DnH.A11(r6, r1, r0)
            goto L66
        La7:
            r0 = 2131238062(0x7f081cae, float:1.8092392E38)
            goto L27
        Lac:
            r0 = 2131238657(0x7f081f01, float:1.8093599E38)
            goto L27
        Lb1:
            r0 = 2131238756(0x7f081f64, float:1.80938E38)
            goto L27
        Lb6:
            r0 = 2131239015(0x7f082067, float:1.8094325E38)
            goto L27
        Lbb:
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            goto L27
        Lc0:
            r0 = 2131238535(0x7f081e87, float:1.8093351E38)
            goto L27
        Lc5:
            r0 = 2131238732(0x7f081f4c, float:1.809375E38)
            goto L27
        Lca:
            r0 = 2131238187(0x7f081d2b, float:1.8092646E38)
            goto L27
        Lcf:
            r0 = 2131239036(0x7f08207c, float:1.8094368E38)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXG.bind(X.2zP, X.3OO):void");
    }

    public EXG(OnboardingCheckListFragment onboardingCheckListFragment, boolean z) {
        this.A01 = z;
        this.A00 = onboardingCheckListFragment;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36179Fxt.class;
    }
}
