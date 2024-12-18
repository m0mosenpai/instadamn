package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.9pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221179pf extends AbstractC220929pG {
    public boolean A00;
    public final Drawable A01;
    public final C6RL A02;
    public final C216229hf A03;
    public final List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r3.A06().contains(com.instagram.reels.question.model.responsetype.QuestionResponseType.A05) != true) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C221179pf(android.content.Context r7, com.instagram.common.session.UserSession r8, X.AlD r9) {
        /*
            r6 = this;
            r2 = 1
            X.AbstractC167007dF.A1D(r8, r2, r7)
            r6.<init>(r7, r8, r9)
            X.9hf r5 = new X.9hf
            r5.<init>(r7)
            r5.setCallback(r6)
            r6.A03 = r5
            r0 = 2131238643(0x7f081ef3, float:1.809357E38)
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r6.A01 = r0
            X.AlD r3 = r6.A0D
            if (r3 == 0) goto L31
            java.lang.String r4 = r3.A01
            if (r4 != 0) goto L3b
            java.util.List r1 = r3.A06()
            com.instagram.reels.question.model.responsetype.QuestionResponseType r0 = com.instagram.reels.question.model.responsetype.QuestionResponseType.A05
            boolean r1 = r1.contains(r0)
            r0 = 2131969586(0x7f134632, float:1.95761E38)
            if (r1 == r2) goto L34
        L31:
            r0 = 2131971244(0x7f134cac, float:1.9579462E38)
        L34:
            java.lang.String r4 = r7.getString(r0)
            X.C14360o3.A0A(r4)
        L3b:
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r6.A04 = r0
            int r0 = r6.A08
            X.6RK r1 = new X.6RK
            r1.<init>(r7, r6, r0)
            r1.A07 = r4
            r0 = 2131165389(0x7f0700cd, float:1.7944994E38)
            r1.A02(r0)
            X.6RL r0 = r1.A00()
            r6.A02 = r0
            r6.A00 = r2
            java.util.List r0 = r6.A04
            java.util.ArrayList r4 = X.AbstractC001800i.A0U(r0)
            X.6RB r2 = r6.A0F
            android.graphics.drawable.Drawable r1 = r6.A0B
            X.6RB r0 = r6.A0E
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r5, r2, r1, r0}
            java.util.Collections.addAll(r4, r0)
            if (r3 == 0) goto L8e
            android.content.Context r0 = r6.A09
            int r0 = r3.A03(r0)
            X.9hf r2 = r6.A03
            r2.A09(r0)
            r2.A0B(r0)
            r2.A08()
            X.URE r0 = r3.A00
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L8e
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.9SG r0 = r2.A0B
            r0.A00(r1)
        L8e:
            r6.A0C()
            r6.A0B()
            if (r3 == 0) goto Lb2
            android.content.Context r0 = r6.A09
            int r1 = r3.A04(r0)
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto Lb2
            android.graphics.drawable.Drawable r2 = r0.mutate()
            if (r2 == 0) goto Lb2
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r1 = X.AbstractC13950nL.A07(r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221179pf.<init>(android.content.Context, com.instagram.common.session.UserSession, X.AlD):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.9hf r0 = r3.A03
            r0.draw(r4)
            X.6RB r0 = r3.A0F
            r0.draw(r4)
            X.AlD r0 = r3.A0D
            if (r0 == 0) goto L40
            X.URE r0 = r0.A00
            com.instagram.reels.question.constants.QuestionStickerType r1 = r0.A00
            if (r1 != 0) goto L1a
            com.instagram.reels.question.constants.QuestionStickerType r1 = com.instagram.reels.question.constants.QuestionStickerType.A08
        L1a:
            com.instagram.reels.question.constants.QuestionStickerType r0 = com.instagram.reels.question.constants.QuestionStickerType.A08
            if (r1 == r0) goto L40
            android.graphics.drawable.Drawable r0 = r3.A0C
            if (r0 == 0) goto L25
            r0.draw(r4)
        L25:
            android.graphics.drawable.Drawable r2 = r3.A01
            if (r2 != 0) goto L30
            java.lang.String r1 = "QuestionStickerDrawable"
            java.lang.String r0 = "music icon drawable is null"
            X.C0w9.A03(r1, r0)
        L30:
            if (r2 == 0) goto L35
            r2.draw(r4)
        L35:
            X.6RB r0 = r3.A0E
            r0.draw(r4)
            X.6RL r0 = r3.A02
            r0.draw(r4)
            return
        L40:
            android.graphics.drawable.Drawable r2 = r3.A0B
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221179pf.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A05 + this.A0F.A06;
        int i2 = super.A04;
        return this.A03.A00 + i + i2 + (super.A02 * 2) + this.A0E.A06 + i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBounds(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221179pf.setBounds(int, int, int, int):void");
    }
}
