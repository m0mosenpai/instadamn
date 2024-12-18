package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class V30 extends AbstractC65632xz {
    public final Context A00;
    public final XLS A01;
    public final InterfaceC72020XFi A02;

    public V30(Context context, XLS xls, InterfaceC72020XFi interfaceC72020XFi) {
        C14360o3.A0B(interfaceC72020XFi, 3);
        this.A00 = context;
        this.A01 = xls;
        this.A02 = interfaceC72020XFi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0053, code lost:
    
        if (r6 != null) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r7 = r14
            r8 = r15
            r0 = 1653453095(0x628db127, float:1.306878E21)
            int r2 = X.AbstractC25231BEo.A0G(r13, r0)
            r3 = 3
            X.C14360o3.A0B(r15, r3)
            X.Tx0 r8 = (X.Tx0) r8
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.MapQuerySearchEntry"
            X.C14360o3.A0C(r14, r0)
            X.NUN r7 = (X.NUN) r7
            X.XLS r9 = r11.A01
            X.XFi r1 = r11.A02
            java.lang.Object r4 = r13.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.MapQueryRowViewBinder.Holder"
            X.C14360o3.A0C(r4, r0)
            X.VlH r4 = (X.C69309VlH) r4
            boolean r10 = r8.A0F
            X.AbstractC167017dG.A1O(r7, r9)
            X.AbstractC167007dF.A1F(r1, r3, r4)
            com.instagram.model.mapquery.MapQuery r0 = r7.A00
            android.view.View r3 = r4.A01
            r1.EDz(r3, r7, r8)
            android.widget.TextView r1 = r4.A03
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            r0 = 53
            X.WNX.A00(r3, r9, r8, r7, r0)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r4.A00
            if (r6 != 0) goto L55
            android.view.ViewStub r0 = r4.A02
            android.view.View r6 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView"
            X.C14360o3.A0C(r6, r0)
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
            r4.A00 = r6
            if (r6 == 0) goto L59
        L55:
            r5 = 0
            X.AbstractC66169U2k.A00(r5, r6, r7, r8, r9, r10)
        L59:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A04
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AbstractC31177DnL.A0G(r0)
            X.AbstractC65702TsY.A0w(r1, r0)
            r0 = 590592415(0x2333b99f, float:9.742916E-18)
            X.C0f9.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V30.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1507793512);
        View A00 = VWY.A00(this.A00, viewGroup);
        C0f9.A0A(-1762020757, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
