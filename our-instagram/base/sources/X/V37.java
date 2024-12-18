package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V37 extends AbstractC65632xz {
    public final Context A00;
    public final XLR A01;
    public final InterfaceC72020XFi A02;
    public final boolean A03;

    public V37(Context context, XLR xlr, InterfaceC72020XFi interfaceC72020XFi, boolean z) {
        C14360o3.A0B(interfaceC72020XFi, 3);
        this.A00 = context;
        this.A01 = xlr;
        this.A02 = interfaceC72020XFi;
        this.A03 = z;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r10 != null) goto L17;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r11 = r18
            r12 = r19
            r0 = 1351507963(0x508e5ffb, float:1.9109239E10)
            int r7 = X.C0f9.A03(r0)
            r10 = 1
            r1 = r17
            X.C14360o3.A0B(r1, r10)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState"
            X.C14360o3.A0C(r12, r0)
            X.Tx0 r12 = (X.Tx0) r12
            android.content.Context r9 = r15.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.model.KeywordSearchEntry"
            X.C14360o3.A0C(r11, r0)
            X.U0o r11 = (X.C66130U0o) r11
            X.XLR r13 = r15.A01
            X.XFi r2 = r15.A02
            java.lang.Object r8 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.KeywordRowViewBinder.Holder"
            X.C14360o3.A0C(r8, r0)
            X.U3H r8 = (X.U3H) r8
            boolean r6 = r12.A0F
            boolean r14 = X.AbstractC167007dF.A1M(r6)
            boolean r1 = r15.A03
            r5 = 0
            X.C14360o3.A0B(r9, r5)
            X.AbstractC25234BEr.A0j(r10, r11, r13, r2, r8)
            com.instagram.model.keyword.Keyword r4 = r11.A01
            android.view.View r3 = r8.A02
            r2.EDz(r3, r11, r12)
            com.instagram.common.ui.base.IgTextView r2 = r8.A06
            java.lang.String r0 = r4.A04
            r2.setText(r0)
            X.AbstractC37300Gc1.A0d(r2, r10)
            java.lang.String r0 = r4.A04
            r2.setText(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r8.A07
            if (r1 == 0) goto Lc7
            if (r6 == 0) goto Lc7
            java.lang.Integer r0 = X.C05F.A0N
        L5d:
            X.U3G.A00(r9, r2, r0)
            boolean r0 = r12.A0J
            if (r0 == 0) goto Lc4
            java.lang.String r1 = r12.A09
        L66:
            if (r1 == 0) goto Lbc
            int r0 = r1.length()
            if (r0 == 0) goto Lbc
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            r0.setVisibility(r5)
            r0.setText(r1)
        L76:
            com.instagram.common.ui.base.IgSimpleImageView r10 = r8.A00
            if (r10 != 0) goto L8b
            android.view.ViewStub r0 = r8.A03
            android.view.View r10 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView"
            X.C14360o3.A0C(r10, r0)
            com.instagram.common.ui.base.IgSimpleImageView r10 = (com.instagram.common.ui.base.IgSimpleImageView) r10
            r8.A00 = r10
            if (r10 == 0) goto L8f
        L8b:
            r9 = 0
            X.AbstractC66169U2k.A00(r9, r10, r11, r12, r13, r14)
        L8f:
            java.lang.String r2 = "null_state_popular"
            if (r6 != 0) goto Lb0
            java.lang.String r1 = r12.A09
            java.lang.String r0 = "null_state_recent"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "meta_ai_recent"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb0
            boolean r0 = X.C14360o3.A0K(r1, r2)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "null_state_suggestions"
            X.C14360o3.A0K(r1, r0)
        Lb0:
            r0 = 52
            X.WNX.A00(r3, r13, r12, r11, r0)
            r0 = -1962385644(0xffffffff8b085f14, float:-2.6264176E-32)
            X.C0f9.A0A(r0, r7)
            return
        Lbc:
            r1 = 8
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            r0.setVisibility(r1)
            goto L76
        Lc4:
            java.lang.String r1 = r4.A06
            goto L66
        Lc7:
            com.instagram.model.keyword.Keyword r0 = r11.A01
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "meta_ai_suggestion"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Ld6
            java.lang.Integer r0 = X.C05F.A0C
            goto L5d
        Ld6:
            java.lang.Integer r0 = X.C05F.A00
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V37.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1553318709);
        Context context = this.A00;
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.row_search_keyword_icons, false);
        U3H u3h = new U3H(A0C);
        U3G.A00(context, u3h.A07, C05F.A00);
        A0C.setTag(u3h);
        C0f9.A0A(-517470689, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
