package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class V5I extends AbstractC66412zI {
    public final XLS A00;
    public final InterfaceC72020XFi A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r5 != null) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r11, X.C3OO r12) {
        /*
            r10 = this;
            X.NUX r11 = (X.NUX) r11
            X.AbstractC167017dG.A1N(r11, r12)
            X.Tx0 r7 = r11.A00
            X.NUN r6 = r11.A00
            X.XLS r8 = r10.A00
            X.XFi r1 = r10.A01
            android.view.View r0 = r12.itemView
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.MapQueryRowViewBinder.Holder"
            X.C14360o3.A0C(r3, r0)
            X.VlH r3 = (X.C69309VlH) r3
            boolean r9 = r7.A0F
            r0 = 2
            X.AbstractC25233BEq.A0w(r0, r8, r1, r3)
            com.instagram.model.mapquery.MapQuery r0 = r6.A00
            android.view.View r2 = r3.A01
            r1.EDz(r2, r6, r7)
            android.widget.TextView r1 = r3.A03
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            r0 = 53
            X.WNX.A00(r2, r8, r7, r6, r0)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r3.A00
            if (r5 != 0) goto L48
            android.view.ViewStub r0 = r3.A02
            android.view.View r5 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView"
            X.C14360o3.A0C(r5, r0)
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5
            r3.A00 = r5
            if (r5 == 0) goto L4c
        L48:
            r4 = 0
            X.AbstractC66169U2k.A00(r4, r5, r6, r7, r8, r9)
        L4c:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A04
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AbstractC31177DnL.A0G(r0)
            X.AbstractC65702TsY.A0w(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5I.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUX.class;
    }

    public V5I(XLS xls, InterfaceC72020XFi interfaceC72020XFi) {
        this.A00 = xls;
        this.A01 = interfaceC72020XFi;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A00 = VWY.A00(AbstractC65702TsY.A0F(viewGroup), viewGroup);
        C3OO c3oo = new C3OO(A00);
        if (A00.getTag() instanceof C69309VlH) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
