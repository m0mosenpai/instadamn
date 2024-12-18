package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import java.util.List;

/* renamed from: X.9ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220729ow extends AbstractC130945vi {
    public final int A00;
    public final int A01;
    public final Resources A02;
    public final C9SC A03;
    public final C6RB A04;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0068, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36319888430866192L) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220729ow(android.content.Context r6, com.instagram.common.session.UserSession r7, com.instagram.reels.prompt.model.PromptStickerModel r8, int r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 6
            X.AbstractC167007dF.A1D(r6, r0, r7)
            r5.<init>()
            android.content.res.Resources r4 = r6.getResources()
            r5.A02 = r4
            int r0 = X.AbstractC166997dE.A07(r4)
            r5.A01 = r0
            int r2 = X.AbstractC166997dE.A05(r4)
            r5.A00 = r2
            com.instagram.api.schemas.StoryPromptType r0 = r8.A03()
            int r0 = r0.ordinal()
            if (r0 != r1) goto L76
            r0 = 2131238379(0x7f081deb, float:1.8093035E38)
        L27:
            X.9SC r1 = new X.9SC
            r1.<init>(r6, r0, r2, r2)
            r1.A00 = r9
            r0 = 0
            r1.A01 = r0
            r5.A03 = r1
            r0 = 2131165258(0x7f07004a, float:1.7944728E38)
            X.6RB r3 = X.AbstractC167007dF.A0Y(r6, r4, r0)
            java.lang.Integer r2 = X.C05F.A0C
            X.0qs r1 = X.AbstractC15960qq.A00(r6)
            X.0qp r0 = X.EnumC15950qp.A0u
            android.graphics.Typeface r0 = r1.A02(r0)
            X.AbstractC180577zl.A00(r6, r0, r3, r2)
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            X.AbstractC166997dE.A1B(r4, r3, r0)
            r3.A0F(r9)
            com.instagram.api.schemas.StoryPromptType r1 = r8.A03()
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.A09
            if (r1 == r0) goto L6a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319888430866192(0x8108bf00341f10, double:3.032181919907218E-306)
            boolean r1 = X.C18U.A06(r2, r7, r0)
            r0 = 2131965974(0x7f133816, float:1.9568773E38)
            if (r1 == 0) goto L6d
        L6a:
            r0 = 2131965907(0x7f1337d3, float:1.9568637E38)
        L6d:
            X.AbstractC166987dD.A1Q(r6, r3, r0)
            r3.setCallback(r5)
            r5.A04 = r3
            return
        L76:
            com.instagram.api.schemas.StoryPromptType r0 = r8.A03()
            X.8i8 r0 = X.AbstractC141306a9.A01(r0)
            if (r0 == 0) goto L83
            int r0 = r0.A01
            goto L27
        L83:
            java.lang.String r0 = "Could not get icon drawable"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220729ow.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, int):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A04.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A03, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00 + this.A01 + this.A04.A0A;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float intrinsicWidth = getIntrinsicWidth() / 2.0f;
        float f2 = f - intrinsicWidth;
        C9SC c9sc = this.A03;
        int A01 = C1H4.A01(f2);
        int i5 = this.A00;
        float f3 = i5 / 2;
        c9sc.setBounds(A01, C1H4.A01(A03 - f3), C1H4.A01(f2 + i5), C1H4.A01(f3 + A03));
        C6RB c6rb = this.A04;
        c6rb.setBounds(c9sc.getBounds().right + this.A01, C1H4.A01(A03 - (r3 / 2)), C1H4.A01(f + intrinsicWidth), C1H4.A01(A03 + c6rb.A06));
    }
}
