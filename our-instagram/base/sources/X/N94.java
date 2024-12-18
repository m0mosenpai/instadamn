package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N94 extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C24042Ale A02;
    public final C195918ld A03;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r14 == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0Zx, X.MnJ] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r15 = this;
            r8 = r18
            r0 = 1016780039(0x3c9ad507, float:0.018900407)
            r2 = r17
            int r3 = X.AbstractC25231BEo.A0G(r2, r0)
            r1 = 2
            X.C14360o3.A0B(r8, r1)
            java.lang.Object r4 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.YourStoryRowViewBinder.Holder"
            X.C14360o3.A0C(r4, r0)
            X.OCw r4 = (X.C54670OCw) r4
            com.instagram.common.session.UserSession r6 = r15.A01
            X.0iw r7 = r15.A00
            X.OvJ r8 = (X.C56099OvJ) r8
            X.8ld r0 = r15.A03
            boolean r14 = r0.A06()
            X.Ale r10 = r15.A02
            r11 = 0
            boolean r9 = X.AbstractC167007dF.A1R(r11, r4, r6)
            X.AbstractC167007dF.A1E(r7, r1, r8)
            r0 = 5
            X.C14360o3.A0B(r10, r0)
            boolean r0 = r8.A01
            boolean r13 = X.C180377zR.A0A(r6, r0)
            boolean r12 = X.C180377zR.A0B(r6, r0)
            boolean r5 = r8.A02
            if (r5 == 0) goto Le2
            if (r13 != 0) goto Ld9
            if (r12 != 0) goto Ld9
            android.view.View r2 = r4.A01
            r1 = 0
        L49:
            X.C0fQ.A00(r1, r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A03
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r6)
            X.AbstractC31173DnH.A1T(r7, r1, r0)
            com.instagram.igds.components.button.IgdsRadioButton r0 = r4.A04
            r0.setChecked(r5)
            if (r13 == 0) goto L5f
            r0 = 1
            if (r14 != 0) goto L60
        L5f:
            r0 = 0
        L60:
            X.MnJ r7 = new X.MnJ
            r7.<init>()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_xpost_enabled"
            r7.A03(r0, r5)
            if (r13 == 0) goto La2
            java.lang.Boolean r0 = r4.A00
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto L81
            X.82G r2 = X.C82G.A0u
            X.MU0 r1 = X.MU0.VIEW
            X.MU1 r0 = X.MU1.STORY
            X.AbstractC50568MTz.A00(r1, r0, r2, r7, r6)
        L81:
            android.widget.TextView r1 = r4.A02
            r1.setVisibility(r11)
            r0 = 2131971581(0x7f134dfd, float:1.9580145E38)
            if (r14 == 0) goto L8e
            r0 = 2131971582(0x7f134dfe, float:1.9580147E38)
        L8e:
            r1.setText(r0)
            X.NG5 r0 = new X.NG5
            r0.<init>(r10, r8, r9)
            X.C0fQ.A00(r0, r1)
        L99:
            r4.A00 = r5
            r0 = 1384306887(0x5282d8c7, float:2.8099133E11)
            X.C0f9.A0A(r0, r3)
            return
        La2:
            if (r12 == 0) goto Lb0
            android.widget.TextView r1 = r4.A02
            r1.setVisibility(r11)
            r0 = 2131971581(0x7f134dfd, float:1.9580145E38)
            r1.setText(r0)
            goto L99
        Lb0:
            java.lang.Boolean r0 = r4.A00
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto Lce
            java.lang.Integer r0 = r8.A00
            if (r0 == 0) goto Ld6
            java.lang.String r1 = X.MU3.A00(r0)
        Lc0:
            java.lang.String r0 = "unavailable_reason"
            r7.A06(r0, r1)
            X.82G r2 = X.C82G.A0u
            X.MU0 r1 = X.MU0.UNAVAILABLE
            X.MU1 r0 = X.MU1.STORY
            X.AbstractC50568MTz.A00(r1, r0, r2, r7, r6)
        Lce:
            android.widget.TextView r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            goto L99
        Ld6:
            java.lang.String r1 = "UNKNOWN"
            goto Lc0
        Ld9:
            android.view.View r2 = r4.A01
            X.NG5 r1 = new X.NG5
            r1.<init>(r10, r8, r11)
            goto L49
        Le2:
            android.view.View r2 = r4.A01
            r0 = 3
            X.KLF r1 = new X.KLF
            r1.<init>(r10, r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N94.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public N94(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C24042Ale c24042Ale, C195918ld c195918ld) {
        this.A01 = userSession;
        this.A03 = c195918ld;
        this.A02 = c24042Ale;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 454402940);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_story, false);
        C14360o3.A07(context);
        A0C.setTag(new C54670OCw(A0C));
        C0f9.A0A(1845121093, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
