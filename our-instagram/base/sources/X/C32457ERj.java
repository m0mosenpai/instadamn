package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ERj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32457ERj extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ELn A02;
    public final boolean A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32457ERj(Context context, InterfaceC11380iw interfaceC11380iw, ELn eLn, boolean z) {
        this.A00 = context;
        this.A03 = z;
        this.A01 = interfaceC11380iw;
        this.A02 = eLn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (r7 != false) goto L20;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r10, android.view.View r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r9 = this;
            r0 = 1515127135(0x5a4f015f, float:1.4566707E16)
            int r2 = X.C0f9.A03(r0)
            X.AbstractC167017dG.A1P(r11, r12)
            java.lang.Object r0 = r11.getTag()
            if (r0 == 0) goto L91
            java.lang.Object r6 = r11.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerViewBinder.Holder"
            X.C14360o3.A0C(r6, r0)
            X.FN9 r6 = (X.FN9) r6
            X.E6v r12 = (X.C32069E6v) r12
            boolean r5 = r9.A03
            X.0iw r1 = r9.A01
            X.ELn r4 = r9.A02
            r8 = 0
            X.C14360o3.A0B(r6, r8)
            r0 = 1
            X.AbstractC25233BEq.A0w(r0, r12, r1, r4)
            com.instagram.user.model.User r3 = r12.A02
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A04
            X.AbstractC31176DnK.A1U(r1, r0, r3)
            r7 = 0
            r0.setGradientSpinnerVisible(r8)
            android.widget.TextView r1 = r6.A02
            X.AbstractC31173DnH.A1F(r1, r3)
            boolean r0 = r3.isVerified()
            X.C85963sQ.A0B(r1, r0)
            java.lang.String r1 = r3.B8y()
            int r0 = r1.length()
            if (r0 <= 0) goto L98
            android.widget.TextView r0 = r6.A01
            r0.setText(r1)
            r0.setVisibility(r8)
        L54:
            X.2iX r0 = r6.A03
            android.view.View r1 = r0.getView()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r12.A01
            r1.setChecked(r0)
            android.view.View r1 = r6.A00
            r0 = 56
            X.ViewOnClickListenerC35684FpJ.A00(r1, r12, r6, r4, r0)
            if (r5 == 0) goto L7f
            boolean r0 = r3.A2O()
            if (r0 != 0) goto L7e
            X.17P r0 = r3.A03
            java.lang.Boolean r0 = r0.AkF()
            if (r0 == 0) goto L7e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L7f
        L7e:
            r7 = 1
        L7f:
            boolean r0 = r12.A00
            if (r0 == 0) goto L87
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L89
        L87:
            r0 = 1056964608(0x3f000000, float:0.5)
        L89:
            r1.setAlpha(r0)
            boolean r0 = r12.A00
            r1.setEnabled(r0)
        L91:
            r0 = 517553624(0x1ed93dd8, float:2.3001347E-20)
            X.C0f9.A0A(r0, r2)
            return
        L98:
            android.widget.TextView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32457ERj.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1920752752);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.selectable_user_row);
        A0A.setTag(new FN9(A0A));
        C0f9.A0A(-1674123119, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
