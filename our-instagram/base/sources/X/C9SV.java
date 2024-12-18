package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9SV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SV extends Drawable implements InterfaceC133125ze {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final OA0 A05;
    public final C8F9 A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final int A09;
    public final View A0A;
    public final String A0B;

    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9SV(android.app.Activity r15, android.content.Context r16, X.InterfaceC11380iw r17, com.instagram.common.session.UserSession r18, X.OA0 r19, X.C8F9 r20) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SV.<init>(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.OA0, X.8F9):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawPath((Path) this.A08.getValue(), (Paint) this.A07.getValue());
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        this.A0A.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        InterfaceC09390do interfaceC09390do = this.A08;
        ((Path) interfaceC09390do.getValue()).reset();
        Path path = (Path) interfaceC09390do.getValue();
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        float f = this.A09;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A.getMeasuredWidth();
    }
}
