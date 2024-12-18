package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32455ERh extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37165GZc A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32455ERh(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37165GZc interfaceC37165GZc) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC37165GZc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r1 == false) goto L26;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r13, android.view.View r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            r0 = -907884641(0xffffffffc9e2c79f, float:-1857779.9)
            int r2 = X.AbstractC25231BEo.A0G(r14, r0)
            r8 = 2
            X.C14360o3.A0B(r15, r8)
            java.lang.Object r0 = r14.getTag()
            boolean r0 = r0 instanceof X.C34601FMk
            if (r0 == 0) goto Lc9
            java.lang.Object r6 = r14.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.audiencepicker.DirectAudiencePickerViewBinder.Holder"
            X.C14360o3.A0C(r6, r0)
            X.FMk r6 = (X.C34601FMk) r6
            com.instagram.common.session.UserSession r9 = r12.A02
            X.E6V r15 = (X.E6V) r15
            X.0iw r10 = r12.A01
            X.GZc r4 = r12.A03
            X.AbstractC167017dG.A1N(r6, r9)
            X.AbstractC25233BEq.A0w(r8, r15, r10, r4)
            com.instagram.model.direct.DirectShareTarget r7 = r15.A07
            X.3AY r1 = X.AbstractC35060FcX.A00(r9, r7)
            boolean r0 = r7.A0M()
            r5 = 0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r6.A04
            if (r0 == 0) goto Lff
            java.lang.Object r0 = r1.A00
            X.AbstractC31175DnJ.A0w(r1, r10, r3, r0)
        L40:
            r10 = 0
            r3.setGradientSpinnerVisible(r10)
            java.lang.Integer r1 = r15.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L61
            android.content.Context r11 = r3.getContext()
            r3.setGradientSpinnerVisible(r10)
            boolean r0 = r7.A0M()
            if (r0 != 0) goto Ld6
            boolean r0 = r15.A06
            if (r0 == 0) goto Ld6
            r0 = 2130970905(0x7f040919, float:1.7550533E38)
        L5e:
            X.AbstractC31178DnM.A0p(r11, r3, r0)
        L61:
            com.instagram.user.model.User r3 = X.AbstractC166997dE.A0Y(r9)
            android.widget.TextView r1 = r6.A02
            java.lang.String r0 = X.AbstractC31172DnG.A14(r7)
            r1.setText(r0)
            boolean r0 = r7.A0U()
            X.C85963sQ.A0B(r1, r0)
            java.lang.String r1 = X.AbstractC101904i3.A03(r7, r3)
            X.C14360o3.A07(r1)
            android.widget.TextView r3 = r6.A01
            android.content.Context r0 = X.AbstractC166997dE.A0L(r3)
            android.text.SpannableStringBuilder r1 = X.FUG.A00(r0, r9, r7, r1, r8)
            if (r1 == 0) goto Ld0
            int r0 = r1.length()
            if (r0 == 0) goto Ld0
            r3.setText(r1)
            r3.setVisibility(r10)
        L94:
            X.2iX r5 = r6.A03
            android.view.View r1 = r5.getView()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r15.A04
            r1.setChecked(r0)
            android.view.View r3 = r6.A00
            r0 = 14
            X.ViewOnClickListenerC35684FpJ.A00(r3, r15, r6, r4, r0)
            boolean r1 = r15.A02
            r3.setEnabled(r1)
            android.view.View r0 = r5.getView()
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            if (r0 != 0) goto Lbf
            boolean r0 = r4.EiP(r15)
            if (r0 != 0) goto Lc3
        Lbf:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto Lc6
        Lc3:
            r0 = 1050253722(0x3e99999a, float:0.3)
        Lc6:
            r3.setAlpha(r0)
        Lc9:
            r0 = 347392350(0x14b4c95e, float:1.825478E-26)
            X.C0f9.A0A(r0, r2)
            return
        Ld0:
            r0 = 8
            r3.setVisibility(r0)
            goto L94
        Ld6:
            boolean r0 = r15.A05
            if (r0 == 0) goto Lde
            r0 = 2130970849(0x7f0408e1, float:1.755042E38)
            goto L5e
        Lde:
            boolean r0 = X.AbstractC31174DnI.A1V(r9)
            if (r0 == 0) goto Lf7
            int r1 = r15.A00
            if (r1 <= 0) goto Lf7
            r0 = 2131960253(0x7f1321bd, float:1.955717E38)
            X.U8R r0 = X.AbstractC31179DnN.A0S(r11, r1, r0)
            r3.setPresenceBadgeDrawable(r0)
            r3.setBottomBadgeDrawable(r5)
            goto L61
        Lf7:
            r3.setBottomBadgeDrawable(r5)
            r3.setPresenceBadgeDrawable(r5)
            goto L61
        Lff:
            java.lang.Object r0 = r1.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r3.A0F(r5, r10, r0)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32455ERh.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(170110668);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.selectable_user_row);
        A0A.setTag(new C34601FMk(A0A));
        C0f9.A0A(-1013015843, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
