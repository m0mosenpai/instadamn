package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32459ERl extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC37216GaR A02;
    public final String A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        if (r11.length() == 0) goto L8;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r22, android.view.View r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            r21 = this;
            r10 = r24
            r0 = 1969643378(0x75665f72, float:2.9203226E32)
            int r14 = X.C0f9.A03(r0)
            r0 = r23
            r1 = r25
            X.AbstractC167027dH.A13(r0, r10, r1)
            java.lang.Object r9 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.userlist.adapter.SpotlightUserRowViewBinder.Holder"
            X.C14360o3.A0C(r9, r0)
            X.FO7 r9 = (X.FO7) r9
            r0 = r21
            com.instagram.common.session.UserSession r8 = r0.A01
            X.47P r10 = (X.C47P) r10
            int r7 = X.AbstractC166987dD.A0H(r1)
            X.0iw r6 = r0.A00
            java.lang.String r5 = r0.A03
            X.GaR r4 = r0.A02
            r3 = 0
            boolean r2 = X.AbstractC167007dF.A1R(r3, r9, r8)
            r1 = 2
            X.AbstractC25233BEq.A0x(r1, r10, r6, r5)
            r12 = 6
            X.C14360o3.A0B(r4, r12)
            com.instagram.user.model.User r0 = r10.CDj()
            if (r0 == 0) goto Le9
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r9.A06
            X.AbstractC31176DnK.A1U(r6, r11, r0)
            X.Ok7 r15 = new X.Ok7
            r19 = r7
            r20 = r12
            r18 = r5
            r17 = r4
            r16 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            X.C0fQ.A00(r15, r11)
            java.lang.String r11 = r0.getFullName()
            if (r11 == 0) goto L62
            int r11 = r11.length()
            r13 = 0
            if (r11 != 0) goto L63
        L62:
            r13 = 1
        L63:
            r11 = 8
            android.widget.TextView r12 = r9.A01
            if (r13 != 0) goto Lf0
            java.lang.String r13 = r0.getFullName()
            r12.setText(r13)
            X.2iX r15 = r9.A04
            android.view.View r13 = r15.getView()
            android.widget.TextView r13 = (android.widget.TextView) r13
            X.AbstractC31173DnH.A1F(r13, r0)
            android.view.View r13 = r15.getView()
            r20 = 7
            X.Ok7 r15 = new X.Ok7
            r15.<init>(r16, r17, r18, r19, r20)
            X.C0fQ.A00(r15, r13)
        L89:
            X.Ok7 r15 = new X.Ok7
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            X.C0fQ.A00(r15, r12)
            android.widget.TextView r12 = r9.A02
            r12.setVisibility(r11)
            X.2iX r12 = r9.A05
            r16 = r12
            android.view.View r15 = r16.getView()
            android.widget.TextView r15 = (android.widget.TextView) r15
            android.view.View r12 = r16.getView()
            android.content.Context r13 = r12.getContext()
            r12 = 2131962940(0x7f132c3c, float:1.956262E38)
            X.AbstractC166987dD.A1P(r13, r15, r12)
            android.view.View r13 = r16.getView()
            r20 = 9
            X.Ok7 r12 = new X.Ok7
            r15 = r12
            r16 = r10
            r15.<init>(r16, r17, r18, r19, r20)
            X.C0fQ.A00(r12, r13)
            android.view.ViewGroup r12 = r9.A00
            r12.setVisibility(r11)
            android.widget.TextView r12 = r9.A03
            r12.setVisibility(r11)
            com.instagram.user.follow.FollowButton r9 = r9.A07
            r9.setVisibility(r3)
            r9.A0A = r2
            X.4yT r3 = r9.A0J
            X.EnU r2 = new X.EnU
            r16 = r4
            r17 = r10
            r20 = r1
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r3.A08(r2)
            r3.A04(r6, r8, r0)
            r4.Dhu(r10, r5, r7)
        Le9:
            r0 = 367786586(0x15ebfa5a, float:9.531073E-26)
            X.C0f9.A0A(r0, r14)
            return
        Lf0:
            X.AbstractC31173DnH.A1F(r12, r0)
            X.2iX r13 = r9.A04
            X.AbstractC31172DnG.A1T(r13, r11)
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32459ERl.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public C32459ERl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37216GaR interfaceC37216GaR, String str) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC37216GaR;
        this.A03 = str;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 657800693);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_thread_context_lines, false);
        viewGroup2.setTag(new FO7(viewGroup2));
        C0f9.A0A(-1511875543, A0G);
        return viewGroup2;
    }
}
