package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

/* loaded from: classes6.dex */
public final class ERV extends AbstractC65632xz {
    public final GZX A00;
    public final boolean A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, X.3sV, com.instagram.igds.components.button.IgdsButton] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r2 = r19
            r5 = r18
            r0 = 852311534(0x32cd3dee, float:2.3893303E-8)
            int r4 = X.C0f9.A03(r0)
            r0 = r17
            X.AbstractC167027dH.A13(r0, r5, r2)
            java.lang.Object r1 = r0.getTag()
            boolean r0 = r1 instanceof X.FI3
            if (r0 == 0) goto L8f
            X.FI3 r1 = (X.FI3) r1
            if (r1 == 0) goto L8f
            boolean r0 = r5 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L8b
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            if (r5 == 0) goto L8b
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L89
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L89
            boolean r6 = r2.booleanValue()
        L30:
            X.GZX r3 = r15.A00
            boolean r7 = r15.A01
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r2 = r1.A00
            r2.A01()
            android.content.Context r9 = X.AbstractC166997dE.A0L(r2)
            r1 = 1
            if (r6 != 0) goto L86
            X.4do r10 = X.EnumC99704do.A03
        L46:
            X.4dp r11 = X.EnumC99714dp.A04
            r0 = 2131976190(0x7f135ffe, float:1.9589494E38)
            if (r6 != 0) goto L50
            r0 = 2131972510(0x7f13519e, float:1.958203E38)
        L50:
            java.lang.String r12 = X.AbstractC166997dE.A0p(r9, r0)
            r13 = 0
            X.EfH r8 = new X.EfH
            r14 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14)
            if (r6 != r1) goto L62
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r7 != 0) goto L64
        L62:
            r0 = 1065353216(0x3f800000, float:1.0)
        L64:
            r8.setAlpha(r0)
            r0 = 30
            X.ViewOnClickListenerC35688FpN.A00(r8, r3, r5, r6, r0)
            r0 = 22
            X.Fp5 r1 = new X.Fp5
            r1.<init>(r0, r3, r5)
            r0 = 0
            r2.A02(r1, r5)
            r2.A05(r8, r0)
            r0 = 23
            X.ViewOnClickListenerC35670Fp5.A00(r2, r0, r3, r5)
            r0 = 1105141410(0x41df1ea2, float:27.889957)
        L82:
            X.C0f9.A0A(r0, r4)
            return
        L86:
            X.4do r10 = X.EnumC99704do.A06
            goto L46
        L89:
            r6 = 0
            goto L30
        L8b:
            r0 = -599728126(0xffffffffdc40e002, float:-2.1715798E17)
            goto L82
        L8f:
            r0 = -710798921(0xffffffffd5a211b7, float:-2.227462E13)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERV.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public ERV(GZX gzx, boolean z) {
        this.A01 = z;
        this.A00 = gzx;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1862997698);
        C14360o3.A0B(viewGroup, 1);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(AbstractC166997dE.A0L(viewGroup), true);
        igdsPeopleCell.setTag(new FI3(igdsPeopleCell));
        C0f9.A0A(-985057115, A03);
        return igdsPeopleCell;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
