package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class BJX extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new ImageView(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r16, X.C6FG r17, X.C102884kP r18, java.lang.Object r19) {
        /*
            r15 = this;
            r9 = r16
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r14 = 0
            X.C14360o3.A0B(r9, r14)
            r0 = 1
            r10 = r17
            X.C14360o3.A0B(r10, r0)
            r0 = 2
            r11 = r18
            X.C14360o3.A0B(r11, r0)
            r0 = 36
            java.lang.String r3 = r11.A0L(r0)
            X.0ll r1 = X.C6BQ.A0A(r10)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            r7 = 0
            r6 = r7
            if (r0 == 0) goto L25
            r6 = r1
        L25:
            r5 = 0
            if (r3 == 0) goto L48
            if (r6 == 0) goto L48
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 != 0) goto L3d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36313338602325917(0x8102ca0000079d, double:3.0280397819643054E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L48
        L3d:
            android.content.Context r0 = r10.A00     // Catch: java.lang.IllegalArgumentException -> L46
            android.graphics.drawable.Drawable r4 = X.AbstractC65877Tvg.A02(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L46
            if (r4 == 0) goto L5a
            goto L59
        L46:
            r4 = r7
            goto L5a
        L48:
            java.lang.String r13 = ""
            r0 = 41
            java.lang.String r0 = r11.A0L(r0)
            if (r0 == 0) goto L53
            r13 = r0
        L53:
            r8 = r7
            r12 = r7
            X.AbstractC131765xC.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L87
        L59:
            r5 = 1
        L5a:
            X.0kP r0 = new X.0kP
            r0.<init>(r6)
            X.0wW r2 = r0.A00()
            java.lang.String r1 = "ig_bloks_use_local_asset"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L82
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_local"
            r2.A7v(r0, r1)
            java.lang.String r0 = "resource_name"
            r2.AAP(r0, r3)
            r2.Cht()
        L82:
            if (r5 == 0) goto L48
            r9.setImageDrawable(r4)
        L87:
            r1 = 40
            X.4kP r0 = r11.A08(r1)
            if (r0 == 0) goto Lb5
            X.4kP r0 = r11.A08(r1)
            X.C14360o3.A0A(r0)
            int r2 = X.C6BK.A00(r10, r0, r14)
            int r1 = android.graphics.Color.alpha(r2)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto La9
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
        La9:
            r9.setColorFilter(r2)
            r9.setImageAlpha(r1)
        Laf:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r0)
            return r7
        Lb5:
            r1 = 38
            java.lang.String r0 = r11.A0L(r1)
            if (r0 == 0) goto Laf
            java.lang.String r0 = r11.A0L(r1)     // Catch: X.C41M -> Ldb
            int r2 = X.C6BE.A03(r0)     // Catch: X.C41M -> Ldb
            int r1 = android.graphics.Color.alpha(r2)     // Catch: X.C41M -> Ldb
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto Ld4
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r0
        Ld4:
            r9.setColorFilter(r2)     // Catch: X.C41M -> Ldb
            r9.setImageAlpha(r1)     // Catch: X.C41M -> Ldb
            goto Laf
        Ldb:
            r1 = move-exception
            r9.setColorFilter(r7)
            java.lang.String r0 = "IgIconBinderUtils"
            X.AbstractC25241Le.A03(r0, r1)
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJX.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        C14360o3.A0B(imageView, 0);
        AbstractC131765xC.A01(imageView);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public BJX(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
