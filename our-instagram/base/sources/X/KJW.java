package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJW extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final InterfaceC50466MPu A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44758Jrf(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_note_user_row_item, false), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r10, X.C3OO r11) {
        /*
            r9 = this;
            X.Jzs r10 = (X.C45212Jzs) r10
            X.Jrf r11 = (X.C44758Jrf) r11
            r2 = 0
            boolean r8 = X.AbstractC167007dF.A1R(r2, r10, r11)
            android.view.View r4 = r11.A00
            X.KJW r5 = r11.A05
            r0 = 66
            X.ViewOnClickListenerC48066LPr.A00(r4, r0, r10, r5)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r11.A01
            r0 = 67
            X.ViewOnClickListenerC48066LPr.A00(r1, r0, r10, r5)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r7 = r11.A04
            com.instagram.user.model.User r6 = r10.A01
            com.instagram.common.typedurl.ImageUrl r3 = r6.Bhu()
            X.0iw r1 = r5.A00
            r0 = 0
            r7.A0F(r0, r1, r3)
            r7.setGradientSpinnerVisible(r2)
            java.lang.Integer r5 = r10.A02
            int r3 = r5.intValue()
            r1 = 4
            if (r3 == r1) goto L4a
            if (r3 == r2) goto L4a
            if (r3 == r8) goto L42
            r1 = 2
            if (r3 == r1) goto L55
            r1 = 3
            if (r3 == r1) goto L55
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L42:
            android.content.Context r1 = r4.getContext()
            r0 = 2131239437(0x7f08220d, float:1.809518E38)
            goto L51
        L4a:
            android.content.Context r1 = r4.getContext()
            r0 = 2131239434(0x7f08220a, float:1.8095175E38)
        L51:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L55:
            r7.setBottomBadgeDrawable(r0)
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            java.lang.String r0 = r6.B8y()
            r1.setText(r0)
            java.lang.Integer r0 = X.C05F.A0C
            if (r5 != r0) goto L7f
            X.2iX r0 = r11.A03
            r0.setVisibility(r2)
            android.view.View r2 = r0.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r1 = r4.getContext()
            r0 = 2131956327(0x7f131267, float:1.9549207E38)
            java.lang.String r0 = r1.getString(r0)
        L7b:
            r2.setText(r0)
            return
        L7f:
            java.lang.Integer r0 = X.C05F.A0Y
            if (r5 != r0) goto L9d
            java.lang.String r0 = r11.A00(r10)
            int r0 = r0.length()
            if (r0 <= 0) goto L9d
            X.2iX r0 = r11.A03
            r0.setVisibility(r2)
            android.view.View r2 = r0.getView()
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = r11.A00(r10)
            goto L7b
        L9d:
            X.2iX r1 = r11.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJW.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45212Jzs.class;
    }

    public KJW(InterfaceC11380iw interfaceC11380iw, InterfaceC50466MPu interfaceC50466MPu) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC50466MPu;
    }
}
