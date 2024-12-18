package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.7g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168707g4 extends AbstractC168697g3 {
    public C168717g5 A00;
    public final Context A01;
    public final InterfaceC11380iw A02;

    public C168707g4(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C169267gz c169267gz, InterfaceC168627fw interfaceC168627fw, String str) {
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A00 = new C168717g5(context, userSession, c169267gz, this, interfaceC168627fw, str);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(4467341);
        if (view == null) {
            view = LayoutInflater.from(this.A01).inflate(R.layout.row_autocomplete_user, viewGroup, false);
            view.setTag(new A9Z(view));
        }
        final User user = (User) obj;
        Object tag = view.getTag();
        tag.getClass();
        A9Z a9z = (A9Z) tag;
        final C168717g5 c168717g5 = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        a9z.A03.setText(user.getUsername());
        GradientSpinnerAvatarView gradientSpinnerAvatarView = a9z.A04;
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, user.Bhu());
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        a9z.A00.setOnTouchListener(new ViewOnTouchListenerC55482Okb(c168717g5, user));
        boolean isEmpty = TextUtils.isEmpty(user.getFullName());
        TextView textView = a9z.A02;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(user.getFullName());
            C85963sQ.A0B(textView, user.isVerified());
        } else {
            textView.setVisibility(8);
            C85963sQ.A0B(textView, false);
        }
        if (!user.A2D()) {
            View view2 = a9z.A01;
            view2.setVisibility(0);
            C0fQ.A00(new View.OnClickListener() { // from class: X.ARn
                /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r15) {
                    /*
                        r14 = this;
                        X.7g5 r1 = X.C168717g5.this
                        com.instagram.user.model.User r5 = r2
                        android.content.Context r3 = r1.A00
                        com.instagram.common.session.UserSession r4 = r1.A01
                        java.lang.String r2 = r1.A05
                        int r0 = r2.hashCode()
                        switch(r0) {
                            case -918018450: goto L64;
                            case -436507530: goto L55;
                            case -367031610: goto L52;
                            case -2247345: goto L4b;
                            case 29220926: goto L40;
                            case 97438425: goto L3d;
                            case 339466545: goto L3a;
                            case 1295760494: goto L37;
                            case 1482720300: goto L34;
                            default: goto L11;
                        }
                    L11:
                        r0 = 522(0x20a, float:7.31E-43)
                        java.lang.String r7 = X.MSV.A00(r0)
                    L17:
                        X.7fw r6 = r1.A04
                        X.AbstractC167017dG.A1N(r3, r4)
                        r8 = 0
                        r9 = r8
                        X.AbstractC35239FgY.A03(r3, r4, r5, r6, r7, r8, r9)
                        X.0wW r8 = X.AbstractC12220kQ.A01(r8, r4)
                        java.lang.String r12 = "click"
                        r0 = 67
                        java.lang.String r13 = X.AbstractC111324zv.A00(r0)
                        r9 = r4
                        r10 = r5
                        r11 = r7
                        X.FDR.A00(r8, r9, r10, r11, r12, r13)
                        return
                    L34:
                        java.lang.String r0 = "story_audience_control"
                        goto L42
                    L37:
                        java.lang.String r0 = "comment_composer_page"
                        goto L5b
                    L3a:
                        java.lang.String r0 = "story_hashtag_tag_page"
                        goto L42
                    L3d:
                        java.lang.String r0 = "edit_post_page"
                        goto L6a
                    L40:
                        java.lang.String r0 = "story_user_tag_page"
                    L42:
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L11
                        java.lang.String r7 = "story"
                        goto L17
                    L4b:
                        r0 = 2164(0x874, float:3.032E-42)
                        java.lang.String r0 = X.AbstractC111324zv.A00(r0)
                        goto L6a
                    L52:
                        r0 = 2159(0x86f, float:3.025E-42)
                        goto L57
                    L55:
                        r0 = 831(0x33f, float:1.164E-42)
                    L57:
                        java.lang.String r0 = X.AbstractC111324zv.A00(r0)
                    L5b:
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L11
                        java.lang.String r7 = "comments"
                        goto L17
                    L64:
                        r0 = 261(0x105, float:3.66E-43)
                        java.lang.String r0 = X.MSV.A00(r0)
                    L6a:
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L11
                        java.lang.String r7 = "post_caption"
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC23229ARn.onClick(android.view.View):void");
                }
            }, view2);
        } else {
            View view3 = a9z.A01;
            view3.setVisibility(8);
            view3.setOnClickListener(null);
        }
        C0f9.A0A(-1857961602, A03);
        return view;
    }
}
