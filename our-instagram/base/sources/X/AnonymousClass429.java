package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.user.model.User;

/* renamed from: X.429, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass429 {
    public static final AnonymousClass429 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        if (X.C41754IeU.A03(r10) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r10, X.AnonymousClass428 r11, X.C905541q r12, X.InterfaceC60442pS r13, com.instagram.user.model.User r14, com.instagram.user.model.User r15, java.lang.String r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            r4 = 0
            r6 = r12
            X.C14360o3.A0B(r12, r4)
            r0 = 6
            r1 = r16
            X.C14360o3.A0B(r1, r0)
            r0 = 7
            r9 = r17
            X.C14360o3.A0B(r9, r0)
            r2 = 8
            r0 = 9
            r5 = r11
            X.C14360o3.A0B(r11, r0)
            java.lang.String r0 = "open_carousel_prompt"
            boolean r0 = X.AbstractC002300n.A0f(r1, r0, r4)
            if (r0 != 0) goto Ld6
            r7 = r13
            if (r18 == 0) goto L8b
            X.0sy r0 = X.C08730cb.A00(r10)
            com.instagram.user.model.User r3 = r0.A00()
            X.0do r0 = r12.A03
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            com.instagram.common.typedurl.ImageUrl r0 = r3.Bhu()
            r1.setUrl(r0, r13)
            A02(r12, r3)
            X.0do r0 = r12.A05
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r4)
            r0 = 2131969184(0x7f1344a0, float:1.9575284E38)
            r1.setText(r0)
            X.0do r0 = r12.A07
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0do r0 = r12.A01
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            X.0do r2 = r12.A06
            java.lang.Object r1 = r2.getValue()
            android.view.View r1 = (android.view.View) r1
            X.ASe r0 = X.ViewOnClickListenerC23243ASe.A00
            X.C0fQ.A00(r0, r1)
            java.lang.Object r3 = r2.getValue()
            android.view.View r3 = (android.view.View) r3
            X.BOV r2 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0 = 51
            android.graphics.drawable.GradientDrawable r0 = r2.A01(r1, r0)
            r3.setBackground(r0)
            android.view.ViewStub r0 = r12.A00
            r0.setVisibility(r4)
            return
        L8b:
            java.lang.String r4 = "0"
            if (r19 != 0) goto Ld6
            r8 = r14
            if (r14 == 0) goto Lb5
            java.lang.String r0 = r14.getId()
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 != 0) goto Lb5
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36320244910006437(0x810912000420a5, double:3.032407358750935E-306)
            boolean r0 = X.C18U.A06(r3, r10, r0)
            if (r0 == 0) goto Lb5
            boolean r0 = X.C41754IeU.A03(r10)
            if (r0 != 0) goto Lb5
        Laf:
            X.429 r4 = X.AnonymousClass429.A00
            r4.A01(r5, r6, r7, r8, r9)
            return
        Lb5:
            r8 = r15
            if (r15 == 0) goto Ld6
            java.lang.String r0 = r15.getId()
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 != 0) goto Ld6
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 2342163254125732031(0x20810912002320bf, double:4.0657935448703675E-152)
            boolean r0 = X.C18U.A06(r3, r10, r0)
            if (r0 == 0) goto Ld6
            boolean r0 = X.C41754IeU.A03(r10)
            if (r0 != 0) goto Ld6
            goto Laf
        Ld6:
            android.view.ViewStub r0 = r12.A00
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass429.A00(com.instagram.common.session.UserSession, X.428, X.41q, X.2pS, com.instagram.user.model.User, com.instagram.user.model.User, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private final void A01(AnonymousClass428 anonymousClass428, C905541q c905541q, InterfaceC60442pS interfaceC60442pS, User user, String str) {
        ((IgImageView) c905541q.A03.getValue()).setUrl(user.Bhu(), interfaceC60442pS);
        A02(c905541q, user);
        TextView textView = (TextView) c905541q.A07.getValue();
        textView.setVisibility(0);
        textView.setText(str);
        ((View) c905541q.A05.getValue()).setVisibility(8);
        ((View) c905541q.A01.getValue()).setVisibility(8);
        InterfaceC09390do interfaceC09390do = c905541q.A06;
        C0fQ.A00(new ViewOnClickListenerC41922IiF(anonymousClass428, interfaceC60442pS, user), (View) interfaceC09390do.getValue());
        ((View) interfaceC09390do.getValue()).setBackground(IGGradientView.A00.A01(GradientDrawable.Orientation.TOP_BOTTOM, 51));
        c905541q.A00.setVisibility(0);
    }

    public static final void A02(C905541q c905541q, User user) {
        if (user.isVerified()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(user.getUsername());
            InterfaceC09390do interfaceC09390do = c905541q.A04;
            Context context = ((View) interfaceC09390do.getValue()).getContext();
            C14360o3.A07(context);
            C85963sQ.A07(context, spannableStringBuilder, true);
            ((TextView) interfaceC09390do.getValue()).setText(spannableStringBuilder);
            return;
        }
        ((TextView) c905541q.A04.getValue()).setText(user.getUsername());
    }
}
