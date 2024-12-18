package X;

import android.graphics.ColorFilter;
import android.text.TextPaint;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

/* renamed from: X.9k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217739k6 extends AbstractC202418xL implements InterfaceC202398xJ {
    public final int A00;
    public final int A01;
    public final C6RB A02;
    public final C6RB A03;
    public final TextPaint A04;
    public final TextPaint A05;
    public final ProductCollectionShareInfo A06;
    public final String A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C217739k6(android.content.Context r22, com.instagram.shopping.model.collection.ProductCollectionShareInfo r23, float r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217739k6.<init>(android.content.Context, com.instagram.shopping.model.collection.ProductCollectionShareInfo, float, int, int):void");
    }

    @Override // X.InterfaceC202398xJ
    public final String Ap3() {
        return this.A06.A04;
    }

    @Override // X.InterfaceC202398xJ
    public final String ApG() {
        return this.A06.A06;
    }

    @Override // X.InterfaceC202398xJ
    public final String BSZ() {
        return this.A06.A08;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A07;
    }

    @Override // X.AbstractC202418xL, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A04.setAlpha(i);
        super.setAlpha(i);
    }

    @Override // X.AbstractC202418xL, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        super.setColorFilter(colorFilter);
    }
}
