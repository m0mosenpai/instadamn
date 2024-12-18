package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EYj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32635EYj extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final FFK A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31961E2p(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_channel_discovery_row_item, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r7 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r7.isEmpty() != false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r19, X.C3OO r20) {
        /*
            r18 = this;
            r4 = r20
            r3 = r19
            X.E8y r3 = (X.C32100E8y) r3
            X.E2p r4 = (X.C31961E2p) r4
            r11 = 0
            boolean r8 = X.AbstractC167007dF.A1R(r11, r3, r4)
            android.widget.TextView r1 = r4.A01
            java.lang.String r0 = r3.A08
            r1.setText(r0)
            android.widget.TextView r5 = r4.A00
            android.content.Context r12 = X.AbstractC166997dE.A0L(r5)
            r0 = 2131959462(0x7f131ea6, float:1.9555565E38)
            java.lang.String r1 = r12.getString(r0)
            java.lang.String r0 = " • "
            java.lang.String r14 = r3.A04
            java.lang.String r6 = X.AnonymousClass001.A0g(r1, r0, r14)
            X.C14360o3.A07(r6)
            r2 = r18
            com.instagram.common.session.UserSession r13 = r2.A01
            java.lang.String r15 = r3.A06
            int r1 = r3.A00
            boolean r0 = r3.A09
            r17 = r0
            r16 = r1
            java.util.List r7 = X.FU0.A01(r12, r13, r14, r15, r16, r17)
            java.lang.CharSequence r0 = X.F2G.A00(r12, r6, r14, r0)
            if (r7 == 0) goto L4b
            boolean r1 = r7.isEmpty()
            r6 = 0
            if (r1 == 0) goto L4c
        L4b:
            r6 = 1
        L4c:
            java.lang.String r1 = "Required value was null."
            if (r6 != 0) goto La7
            if (r7 == 0) goto Lcc
            int r1 = r7.size()
            if (r1 <= r8) goto La9
            r0 = 4
            r5.setVisibility(r0)
            X.GNn r0 = new X.GNn
            r0.<init>(r5, r7)
            r5.post(r0)
        L64:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r4.A03
            java.lang.String r0 = r3.A05
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r0)
            X.0iw r0 = r2.A00
            r9 = 0
            r5.A0F(r9, r0, r1)
            r5.setGradientSpinnerVisible(r11)
            r5.setGradientSpinnerActivated(r11)
            android.view.View r1 = r4.itemView
            r0 = 57
            X.ViewOnClickListenerC35683FpI.A00(r1, r0, r3, r2)
            X.Fh2 r4 = X.F3T.A00(r13)
            java.lang.String r6 = r3.A07
            java.lang.Integer r2 = r3.A03
            int r1 = r3.A01
            X.Epv r0 = r3.A02
            X.AbstractC167007dF.A1E(r6, r11, r0)
            java.lang.String r7 = X.C35267Fh2.A02(r2)
            java.lang.Long r5 = X.AbstractC31171DnF.A0V(r1)
            java.lang.String r1 = "current_filter"
            java.util.HashMap r10 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = r0.A03
            r10.put(r1, r0)
            java.lang.String r8 = "inbox_directory_sheet"
            X.C35267Fh2.A06(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        La7:
            if (r7 == 0) goto Lb5
        La9:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto Lb5
            java.lang.Object r0 = r7.get(r11)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        Lb5:
            int r1 = r0.length()
            if (r1 != 0) goto Lc1
            r0 = 8
            r5.setVisibility(r0)
            goto L64
        Lc1:
            r5.setVisibility(r11)
            r5.setText(r0)
            r0 = 0
            r5.setCompoundDrawables(r0, r0, r0, r0)
            goto L64
        Lcc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32635EYj.bind(X.2zP, X.3OO):void");
    }

    public C32635EYj(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FFK ffk) {
        AbstractC167017dG.A1Q(userSession, ffk);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = ffk;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32100E8y.class;
    }
}
