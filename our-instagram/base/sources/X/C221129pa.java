package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221129pa extends AbstractC216079hQ {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Drawable A03;
    public final Drawable A04;
    public final PromptStickerModel A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r13 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C221129pa(android.content.Context r10, com.instagram.reels.prompt.model.PromptStickerModel r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            r7 = -1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r1.getDimensionPixelSize(r0)
            r0 = 3
            r4 = r12
            X.AbstractC167007dF.A1G(r12, r0, r11)
            r9.<init>()
            r9.A02 = r10
            r9.A05 = r11
            int r5 = X.AbstractC167017dG.A09(r10)
            r9.A00 = r5
            r2 = 0
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            X.Bwx r0 = new X.Bwx
            r0.<init>(r10, r1)
            r0.setCallback(r9)
            r9.A04 = r0
            int r6 = X.AbstractC167017dG.A07(r10)
            int r0 = X.AbstractC53242c7.A0B(r10)
            int r8 = r10.getColor(r0)
            com.instagram.user.model.User r0 = r11.A02
            if (r0 == 0) goto L41
            com.instagram.common.typedurl.ImageUrl r3 = r0.Bhu()
            if (r13 == 0) goto L42
        L41:
            r3 = r2
        L42:
            X.3yt r2 = new X.3yt
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.setCallback(r9)
            r9.A03 = r2
            int r0 = r5 / 2
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221129pa.<init>(android.content.Context, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (!this.A05.A09) {
            this.A04.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable[] drawableArr = {this.A04, this.A03};
        C14360o3.A0B(drawableArr, 0);
        return AbstractC009903n.A0I(drawableArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        int i5 = this.A00;
        float f = i5 / 2.0f;
        int i6 = (int) (((i + i3) / 2.0f) - f);
        this.A04.setBounds(i6, (int) (A03 - f), i5 + i6, (int) (A03 + f));
    }
}
