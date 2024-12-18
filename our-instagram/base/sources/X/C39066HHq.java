package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HHq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39066HHq extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.product_feed_title_row, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38494GwF(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productfeed.ProductFeedTitleRowViewBinder.ViewHolder");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r7, X.C3OO r8) {
        /*
            r6 = this;
            X.Ioz r7 = (X.C42337Ioz) r7
            X.GwF r8 = (X.C38494GwF) r8
            r5 = 0
            boolean r4 = X.AbstractC167007dF.A1R(r5, r7, r8)
            android.widget.TextView r2 = r8.A03
            X.Gz8 r3 = r7.A00
            X.Vuj r1 = r3.A01
            if (r1 == 0) goto L6e
            android.content.res.Resources r0 = r2.getResources()
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.VSL.A00(r0, r1)
            if (r0 == 0) goto L6e
            r2.setVisibility(r5)
            r2.setText(r0)
            android.graphics.Typeface r0 = r2.getTypeface()
            r2.setTypeface(r0, r4)
        L2b:
            android.widget.TextView r2 = r8.A02
            X.Vuj r1 = r3.A00
            if (r1 == 0) goto L68
            android.content.res.Resources r0 = r2.getResources()
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.VSL.A00(r0, r1)
            if (r0 == 0) goto L68
            r2.setVisibility(r5)
            r2.setText(r0)
            android.content.Context r1 = r2.getContext()
            int r0 = X.AbstractC53242c7.A09(r1)
            X.AbstractC166987dD.A1O(r1, r2, r0)
            r0 = 23
            X.ViewOnClickListenerC42033Ik2.A00(r2, r0, r7)
        L54:
            android.widget.TextView r0 = r8.A01
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A04
            r0.setVisibility(r1)
            android.view.View r1 = r8.A00
            r0 = 24
            X.ViewOnClickListenerC42033Ik2.A00(r1, r0, r7)
            return
        L68:
            r0 = 8
            r2.setVisibility(r0)
            goto L54
        L6e:
            r0 = 8
            r2.setVisibility(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39066HHq.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42337Ioz.class;
    }
}
