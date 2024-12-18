package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.TextPaint;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220909pE extends AbstractC130945vi implements C5RR {
    public C180537zh A00;
    public C180547zi A01;
    public final int A02;
    public final int A03;
    public final C220729ow A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Resources A09;
    public final TextPaint A0A;
    public final C57482kN A0B;
    public final PromptStickerModel A0C;
    public final C180537zh A0D;
    public final C6RB A0E;
    public final C6RB A0F;
    public final C124385ju A0G;
    public final CharSequence A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if (r9 == (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (r1 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (X.C14360o3.A0K(r39.A00.C0j(), "restyle_sticker_with_facepile_style") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220909pE(android.content.Context r37, com.instagram.common.session.UserSession r38, com.instagram.reels.prompt.model.PromptStickerModel r39) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220909pE.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A0D.draw(canvas);
        this.A0F.draw(canvas);
        if (this.A0J) {
            this.A0E.draw(canvas);
        }
        if (this.A0I) {
            this.A01.draw(canvas);
        }
        this.A0G.draw(canvas);
        this.A04.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A00, this.A0D, this.A0F, this.A0E, this.A01, this.A0G, this.A04);
    }

    @Override // X.AbstractC130945vi
    public final String A09() {
        String A00 = this.A0C.BlQ().A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0F(this.A0G, this.A0F.A06 + (this.A08 * 2) + this.A06) + this.A05 + this.A04.A00 + (this.A02 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A0D.setAlpha(i);
        this.A0F.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A01.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A04.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A03 / 2.0f;
        float f3 = f - f2;
        float f4 = f2 + f;
        float A01 = AbstractC167007dF.A01(this, A03);
        float A05 = A03 + AbstractC166987dD.A05(this);
        this.A00.setBounds(C1H4.A01(f3), C1H4.A01(A01), C1H4.A01(f4), C1H4.A01(A05));
        C180537zh c180537zh = this.A0D;
        int A012 = C1H4.A01(f3);
        int A013 = C1H4.A01(A05);
        C220729ow c220729ow = this.A04;
        int i5 = c220729ow.A00;
        int i6 = this.A02;
        c180537zh.setBounds(A012, A013 - ((i6 * 2) + i5), C1H4.A01(f4), C1H4.A01(A05));
        C6RB c6rb = this.A0F;
        float f5 = c6rb.A0A / 2;
        int A014 = C1H4.A01(f - f5);
        int i7 = this.A08;
        float f6 = i7 + A01;
        c6rb.setBounds(A014, C1H4.A01(f6), C1H4.A01(f5 + f), C1H4.A01(f6 + c6rb.A06));
        if (this.A0J) {
            c6rb = this.A0E;
            int A015 = C1H4.A01(f - (c6rb.A0A / 2));
            int A0D = AbstractC166987dD.A0D(c6rb);
            int i8 = this.A07;
            c6rb.setBounds(A015, A0D + i8, C1H4.A01((c6rb.A0A / 2) + f), AbstractC166987dD.A0D(c6rb) + i8 + c6rb.A06);
        }
        int A0D2 = AbstractC166987dD.A0D(c6rb);
        if (this.A0I) {
            C180547zi c180547zi = this.A01;
            int i9 = i7 + A0D2;
            c180547zi.setBounds(C1H4.A01(f - (c180547zi.getIntrinsicWidth() / 2)), i9, C1H4.A01((c180547zi.getIntrinsicWidth() / 2) + f), c180547zi.A01 + i9);
            A0D2 = AbstractC166987dD.A0D(c180547zi);
        }
        C124385ju c124385ju = this.A0G;
        int i10 = i7 + A0D2;
        c124385ju.setBounds(C1H4.A01(f3), i10, C1H4.A01(f4), AbstractC166987dD.A0F(c124385ju, i10));
        c220729ow.setBounds(C1H4.A01(f - (c220729ow.getIntrinsicWidth() / 2)), AbstractC166987dD.A0D(c124385ju) + i6, C1H4.A01(f + (c220729ow.getIntrinsicWidth() / 2)), AbstractC166987dD.A0D(c124385ju) + i5 + i6);
    }
}
