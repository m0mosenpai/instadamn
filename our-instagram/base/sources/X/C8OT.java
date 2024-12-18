package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.8OT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OT extends C74P {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8OT(Context context, Resources.Theme theme, UserSession userSession, String str, String str2, int i, int i2) {
        this(context, theme, null, userSession, null, C74U.A00(1.0f, i, i2, -1), null, str, str2, null);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.graphics.drawable.BitmapDrawable, X.9Ra] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8OT(android.content.Context r16, android.content.res.Resources.Theme r17, com.instagram.common.session.UserSession r18, X.C148286ly r19, X.C75B r20) {
        /*
            r15 = this;
            r0 = 1
            r5 = r16
            X.C14360o3.A0B(r5, r0)
            r0 = 2
            r8 = r18
            X.C14360o3.A0B(r8, r0)
            r0 = 3
            r4 = r19
            X.C14360o3.A0B(r4, r0)
            java.lang.String r12 = r4.A0S
            X.C14360o3.A07(r12)
            com.instagram.common.typedurl.ImageUrl r0 = r4.A0H
            if (r0 != 0) goto L88
            java.lang.String r13 = ""
        L1d:
            int r0 = r4.A09
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.String r14 = r4.A0c
            float r1 = r4.A01
            float r0 = r4.A00
            float r3 = r1 / r0
            int r2 = (int) r1
            int r1 = (int) r0
            r0 = 240(0xf0, float:3.36E-43)
            X.74V r10 = X.C74U.A00(r3, r2, r1, r0)
            java.util.List r0 = r4.A0o
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            X.C14360o3.A07(r0)
            java.lang.Object r1 = X.AbstractC001800i.A0J(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L86
            android.content.res.Resources r0 = r5.getResources()
            X.C14360o3.A07(r0)
            r3 = 2
            X.9Ra r7 = new X.9Ra
            r7.<init>(r0, r1)
            r0 = 200(0xc8, float:2.8E-43)
            r7.A00 = r0
            int[] r0 = new int[r3]
            r0 = {x0094: FILL_ARRAY_DATA , data: [128, 200} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            r2.setRepeatMode(r3)
            r0 = -1
            r2.setRepeatCount(r0)
            X.ANE r0 = new X.ANE
            r0.<init>(r7)
            r2.addUpdateListener(r0)
            r2.start()
        L7d:
            r4 = r15
            r6 = r17
            r9 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L86:
            r7 = 0
            goto L7d
        L88:
            com.instagram.common.typedurl.ImageUrl r0 = X.AbstractC59522nv.A00(r0)
            java.lang.String r13 = r0.getUrl()
            X.C14360o3.A07(r13)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8OT.<init>(android.content.Context, android.content.res.Resources$Theme, com.instagram.common.session.UserSession, X.6ly, X.75B):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8OT(android.content.Context r27, android.content.res.Resources.Theme r28, android.graphics.drawable.Drawable r29, com.instagram.common.session.UserSession r30, X.C75B r31, X.C74V r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r26 = this;
            X.6pU r9 = X.EnumC150226pU.A0M
            r5 = r27
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r3 = (float) r0
            r4 = r28
            if (r28 != 0) goto L59
            r0 = 2131099903(0x7f0600ff, float:1.7812172E38)
        L17:
            int r21 = r5.getColor(r0)
            if (r28 != 0) goto L4a
            r0 = 2131100179(0x7f060213, float:1.7812732E38)
        L20:
            int r22 = r5.getColor(r0)
            java.lang.Integer r14 = X.C05F.A01
            r8 = 0
            r23 = 0
            r24 = 1
            r4 = r26
            r6 = r29
            r7 = r30
            r10 = r31
            r11 = r32
            r13 = r33
            r16 = r34
            r15 = r35
            r18 = r36
            r12 = r8
            r17 = r8
            r19 = r8
            r20 = r3
            r25 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        L4a:
            r2 = 2130970883(0x7f040903, float:1.7550489E38)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 1
            r4.resolveAttribute(r2, r1, r0)
            int r0 = r1.resourceId
            goto L20
        L59:
            r2 = 2130970880(0x7f040900, float:1.7550483E38)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 1
            r4.resolveAttribute(r2, r1, r0)
            int r0 = r1.resourceId
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8OT.<init>(android.content.Context, android.content.res.Resources$Theme, android.graphics.drawable.Drawable, com.instagram.common.session.UserSession, X.75B, X.74V, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
