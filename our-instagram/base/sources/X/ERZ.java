package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERZ extends AbstractC65632xz {
    public final UserSession A00;
    public final InterfaceC151446rm A01;
    public final User A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERZ(UserSession userSession, InterfaceC151446rm interfaceC151446rm, User user) {
        this.A01 = interfaceC151446rm;
        this.A02 = user;
        this.A00 = userSession;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c9  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = 223608692(0xd53ff74, float:6.5326885E-31)
            int r2 = X.AbstractC25231BEo.A0G(r11, r0)
            r1 = 2
            X.C14360o3.A0B(r12, r1)
            java.lang.Object r5 = r11.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ContactOptionViewBinder.Holder"
            X.C14360o3.A0C(r5, r0)
            X.FL2 r5 = (X.FL2) r5
            X.6rk r12 = (X.EnumC151426rk) r12
            com.instagram.user.model.User r4 = r9.A02
            X.6rm r3 = r9.A01
            X.AbstractC167017dG.A1N(r5, r12)
            X.C14360o3.A0B(r4, r1)
            int r6 = r12.A01
            int r1 = r12.ordinal()
            java.lang.String r0 = ""
            switch(r1) {
                case 0: goto L7a;
                case 1: goto L7a;
                case 2: goto La9;
                case 3: goto L42;
                case 4: goto L4f;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L6c;
                case 12: goto L38;
                default: goto L2d;
            }
        L2d:
            java.lang.String r1 = "Don't know how to display Contact Option: "
            java.lang.String r0 = r12.name()
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r1, r0)
            throw r0
        L38:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131956663(0x7f1313b7, float:1.9549888E38)
            goto L75
        L42:
            boolean r1 = r4.A1a()
            if (r1 == 0) goto Lbd
            if (r3 == 0) goto Lbd
            java.lang.String r1 = r3.Ayg()
            goto L8e
        L4f:
            android.view.View r0 = r5.A00
            android.content.Context r8 = r0.getContext()
            X.17P r0 = r4.A03
            java.lang.String r7 = r0.AZq()
            X.17P r0 = r4.A03
            java.lang.String r1 = r0.CIk()
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Ani()
            java.lang.String r0 = X.AbstractC1567472a.A05(r8, r7, r1, r0)
            goto Lbd
        L6c:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131956662(0x7f1313b6, float:1.9549886E38)
        L75:
            java.lang.String r0 = X.AbstractC31178DnM.A0c(r1, r4, r0)
            goto Lbd
        L7a:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Aqd()
            if (r0 == 0) goto L9b
            int r0 = r0.length()
            if (r0 == 0) goto L9b
            X.17P r0 = r4.A03
            java.lang.String r1 = r0.Aqd()
        L8e:
            java.util.Locale r0 = X.C1Q2.A02()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumber(r1, r0)
            goto Lbd
        L9b:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131972428(0x7f13514c, float:1.9581863E38)
            java.lang.String r0 = r1.getString(r0)
            goto Lbd
        La9:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Bj6()
            if (r0 == 0) goto Ld7
            int r0 = r0.length()
            if (r0 == 0) goto Ld7
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Bj6()
        Lbd:
            android.widget.TextView r1 = r5.A01
            r1.setText(r6)
            android.widget.TextView r1 = r5.A02
            r1.setText(r0)
            if (r3 == 0) goto Ld0
            android.view.View r1 = r5.A00
            r0 = 39
            X.ViewOnClickListenerC35684FpJ.A00(r1, r12, r4, r3, r0)
        Ld0:
            r0 = -675878989(0xffffffffd7b6e7b3, float:-4.022125E14)
            X.C0f9.A0A(r0, r2)
            return
        Ld7:
            android.view.View r0 = r5.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131972426(0x7f13514a, float:1.958186E38)
            java.lang.String r0 = r1.getString(r0)
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERZ.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -377396117);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_contact_option_row, false);
        A0C.setTag(new FL2(A0C));
        C0f9.A0A(-1152096252, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
