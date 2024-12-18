package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.7TF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TF extends AbstractC66422zJ {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    public C7TF(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = z;
        this.A03 = true;
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C44775Jrw createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_reply_item_root, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        return new C44775Jrw(activity, layoutInflater, this.A01, userSession, (IgFrameLayout) inflate, this.A04, this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (X.C14360o3.A0K(r4.A0G, r3.A05) != false) goto L21;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r17, X.C3OO r18) {
        /*
            r16 = this;
            r3 = r17
            r0 = r18
            X.7Lg r3 = (X.C161457Lg) r3
            X.Jrw r0 = (X.C44775Jrw) r0
            r14 = 0
            X.C14360o3.A0B(r3, r14)
            r5 = 1
            X.C14360o3.A0B(r0, r5)
            X.FcE r1 = r0.A00
            if (r1 == 0) goto L41
            r2 = 0
            java.lang.String r4 = r1.A0D
            java.lang.String r1 = r3.A03
            boolean r1 = X.C14360o3.A0K(r4, r1)
            if (r1 == 0) goto L41
            X.FcE r1 = r0.A00
            if (r1 == 0) goto L25
            com.instagram.user.model.User r2 = r1.A0C
        L25:
            com.instagram.user.model.User r1 = r3.A02
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L41
            X.FcE r4 = r0.A00
            if (r4 == 0) goto L41
            boolean r2 = r4.A0H
            boolean r1 = r3.A06
            if (r2 != r1) goto L41
            X.0sE r2 = r4.A0G
            X.0sE r1 = r3.A05
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 != 0) goto L7a
        L41:
            android.view.View r1 = r0.itemView
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout"
            X.C14360o3.A0C(r1, r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeAllViews()
            android.view.LayoutInflater r6 = r0.A02
            r2 = 2131625083(0x7f0e047b, float:1.8877364E38)
            android.view.View r1 = r0.itemView
            X.C14360o3.A0C(r1, r4)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.inflate(r2, r1, r5)
            android.app.Activity r5 = r0.A01
            android.view.View r7 = r0.itemView
            X.C14360o3.A06(r7)
            com.instagram.common.session.UserSession r9 = r0.A04
            java.lang.String r11 = r3.A03
            if (r11 != 0) goto L6b
            java.lang.String r11 = ""
        L6b:
            com.instagram.user.model.User r10 = r3.A02
            X.0iw r8 = r0.A03
            boolean r13 = r3.A06
            X.0sE r12 = r3.A05
            X.FcE r4 = new X.FcE
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A00 = r4
        L7a:
            X.FcE r2 = r0.A00
            if (r2 == 0) goto L83
            X.7IK r1 = r3.A01
            r2.A03(r1, r14)
        L83:
            X.FcE r6 = r0.A00
            if (r6 == 0) goto La4
            X.7Lz r2 = r3.A00
            java.util.List r10 = r2.A05
            X.FIk r8 = r2.A01
            X.9BW r7 = r2.A00
            X.3nh r9 = r2.A02
            boolean r11 = r0.A06
            java.lang.Boolean r1 = r2.A04
            boolean r12 = r1.booleanValue()
            java.lang.Boolean r1 = r2.A03
            boolean r13 = r1.booleanValue()
            boolean r15 = r0.A05
            r6.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7TF.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161457Lg.class;
    }
}
