package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXR extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C34499FIl A02;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r10, X.C3OO r11) {
        /*
            r9 = this;
            X.Fxz r10 = (X.C36185Fxz) r10
            X.E3V r11 = (X.E3V) r11
            X.AbstractC167017dG.A1N(r10, r11)
            com.instagram.common.session.UserSession r2 = r9.A01
            X.0iw r8 = r9.A00
            X.FIl r3 = r9.A02
            r0 = 2
            X.AbstractC25233BEq.A0w(r0, r2, r8, r3)
            android.view.View r1 = r11.A01
            r0 = 22
            X.ViewOnClickListenerC35684FpJ.A00(r1, r3, r10, r11, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r11.A05
            com.instagram.model.direct.DirectShareTarget r4 = r10.A00
            com.instagram.user.model.User r1 = X.AbstractC166997dE.A0Y(r2)
            java.util.List r0 = X.AbstractC31172DnG.A18(r4)
            r4.A0R()
            r7 = 0
            X.3AY r6 = X.AbstractC81683kd.A02(r7, r1, r7, r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC35060FcX.A02(r2, r4)
            if (r0 != 0) goto Lb5
            boolean r0 = r4.A0M()
            if (r0 != 0) goto L3c
            boolean r0 = r4.A0R
            if (r0 != 0) goto Laf
        L3c:
            java.lang.Object r1 = r6.A00
            if (r1 == 0) goto Laf
            java.lang.Object r0 = r6.A01
            if (r0 == 0) goto Laf
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r5.A0G(r7, r8, r1, r0)
            android.content.Context r1 = r5.getContext()
            int r0 = X.AbstractC53242c7.A0D(r1)
            int r0 = r1.getColor(r0)
            r5.setBackgroundRingColor(r0)
        L5a:
            r0 = 0
            r5.setGradientSpinnerVisible(r0)
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r2)
            java.lang.String r6 = X.AbstractC101904i3.A03(r4, r0)
            X.C14360o3.A07(r6)
            com.instagram.common.ui.base.IgTextView r0 = r11.A02
            r0.setText(r6)
            com.instagram.common.ui.base.IgTextView r5 = r11.A03
            android.content.Context r1 = r11.A00
            r0 = 6
            android.text.SpannableStringBuilder r0 = X.FUG.A00(r1, r2, r4, r6, r0)
            r5.setText(r0)
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L86
            int r0 = r0.length()
            if (r0 != 0) goto L8b
        L86:
            r0 = 8
            r5.setVisibility(r0)
        L8b:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r11.A04
            android.content.Context r1 = r2.getContext()
            r0 = 2131956346(0x7f13127a, float:1.9549245E38)
            X.AbstractC166997dE.A18(r1, r2, r0)
            java.lang.String r1 = X.AbstractC31173DnH.A0o(r4)
            X.FKY r0 = r3.A01
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            if (r0 == 0) goto Lad
            java.lang.String r0 = r0.A09()
        La5:
            boolean r0 = r1.equals(r0)
            r2.setChecked(r0)
            return
        Lad:
            r0 = 0
            goto La5
        Laf:
            java.lang.Object r0 = r6.A00
            if (r0 == 0) goto L5a
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
        Lb5:
            r5.A0F(r7, r8, r0)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXR.bind(X.2zP, X.3OO):void");
    }

    public EXR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C34499FIl c34499FIl) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c34499FIl;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3V(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.new_collab_collection_target_thread_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36185Fxz.class;
    }
}
