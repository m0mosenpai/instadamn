package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.V9e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68074V9e extends AbstractC210529Sr implements InterfaceC133125ze {
    public List A00;
    public int A01;
    public final Context A02;
    public final C69558VrN A03;
    public final int A04;
    public final TextPaint A05;
    public final W5A A06;

    public C68074V9e(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, int i) {
        super(context, musicOverlayStickerModel, c70993Wm9, EnumC138556Pl.A09, 0.7f);
        this.A02 = context;
        this.A06 = new W5A(c70993Wm9, 0, 0, 500);
        TextPaint textPaint = new TextPaint(1);
        this.A05 = textPaint;
        this.A00 = C16930sl.A00;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z));
        this.A01 = Color.alpha(i);
        this.A03 = new C69558VrN(textPaint);
        this.A04 = (int) ((AbstractC13880nE.A0A(context) * 16) / 1080.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[EDGE_INSN: B:26:0x00e3->B:27:0x00e3 BREAK  A[LOOP:0: B:10:0x004c->B:23:0x009e], SYNTHETIC] */
    @Override // X.AbstractC210529Sr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Canvas r18, int r19) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68074V9e.A01(android.graphics.Canvas, int):void");
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(2732);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x011b, code lost:
    
        if (((com.instagram.music.common.model.WordOffset) r10.get(r2)).A04 != false) goto L29;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r40) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68074V9e.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // X.BEc
    public final int ApI() {
        return ((this.A01 & 255) << 24) | (this.A05.getColor() & 16777215);
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        EnumC138556Pl enumC138556Pl = this.A09;
        return new C24025AlH(this.A08.A00, super.A01, null, enumC138556Pl, ApI());
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A05.setColor(i);
        this.A01 = Color.alpha(i);
        invalidateSelf();
    }

    @Override // X.AbstractC210529Sr, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return super.A06 + (this.A04 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != null) {
            this.A05.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }
}
