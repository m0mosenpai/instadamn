package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class HIN extends AbstractC66412zI {
    public final InterfaceC60442pS A00;
    public final JGS A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3OO, X.Gue] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.publishing_collection_row, false);
        ?? c3oo = new C3OO(A0R);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(A0R, R.id.collection_image);
        c3oo.A03 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        TextView A0T = AbstractC166997dE.A0T(A0R, R.id.collection_name);
        c3oo.A01 = A0T;
        AbstractC37300Gc1.A0d(A0T, A1R);
        c3oo.A00 = AbstractC166987dD.A0e(A0R, R.id.collection_details);
        c3oo.A04 = (IgdsButton) A0R.findViewById(R.id.collection_action_button);
        c3oo.A02 = (IgSimpleImageView) A0R.findViewById(R.id.info_icon);
        return c3oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r0 == null) goto L21;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r12, X.C3OO r13) {
        /*
            r11 = this;
            X.IoB r12 = (X.C42287IoB) r12
            X.Gue r13 = (X.C38403Gue) r13
            boolean r4 = X.AbstractC167017dG.A1a(r12, r13)
            X.JGS r7 = r11.A01
            X.2pS r1 = r11.A00
            X.IbZ r8 = r12.A00
            X.AbstractC167007dF.A1D(r7, r4, r1)
            X.IIS r0 = r8.A01()
            X.IFf r0 = r0.A00
            if (r0 == 0) goto L90
            com.instagram.user.model.ProductCollectionImpl r6 = r0.A01
            X.IH6 r5 = r0.A00
            android.widget.TextView r10 = r13.A01
            r9 = 0
            if (r6 == 0) goto L8e
            java.lang.String r0 = r6.A08
        L24:
            r10.setText(r0)
            android.widget.TextView r3 = r13.A00
            if (r5 == 0) goto L8c
            java.lang.String r0 = r5.A02
        L2d:
            r3.setText(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r13.A03
            if (r6 == 0) goto L3e
            com.instagram.model.shopping.productcollection.ProductCollectionCover r0 = r6.A02
            if (r0 == 0) goto L3e
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r0.BGV()
            if (r0 != 0) goto L3f
        L3e:
            r0 = r9
        L3f:
            X.I98.A00(r2, r1, r0, r9, r4)
            android.view.View r4 = r13.itemView
            android.content.Context r1 = r4.getContext()
            r0 = 2130968711(0x7f040087, float:1.7546083E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            r4.setBackgroundResource(r0)
            com.instagram.igds.components.button.IgdsButton r9 = r13.A04
            r0 = 8
            r9.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A02
            r1.setVisibility(r0)
            if (r5 == 0) goto L65
            X.IFe r0 = r5.A00
            r5 = 0
            if (r0 != 0) goto L66
        L65:
            r5 = 1
        L66:
            r4 = 4
            android.view.View[] r3 = new android.view.View[]{r2, r10, r3, r1}
            r2 = 0
        L6c:
            r1 = r3[r2]
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r5 == 0) goto L75
            r0 = 1065353216(0x3f800000, float:1.0)
        L75:
            r1.setAlpha(r0)
            int r2 = r2 + 1
            if (r2 < r4) goto L6c
            r9.setEnabled(r5)
            r0 = 30
            X.Ijy r1 = new X.Ijy
            r1.<init>(r0, r7, r8, r6)
            android.view.View r0 = r13.itemView
            X.C0fQ.A00(r1, r0)
            return
        L8c:
            r0 = r9
            goto L2d
        L8e:
            r0 = r9
            goto L24
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HIN.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42287IoB.class;
    }

    public HIN(InterfaceC60442pS interfaceC60442pS, JGS jgs) {
        this.A00 = interfaceC60442pS;
        this.A01 = jgs;
    }
}
