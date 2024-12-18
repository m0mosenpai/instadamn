package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes5.dex */
public final class BYU extends CharacterStyle implements UpdateAppearance {
    public final AbstractC119825bg A00;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        PathEffect pathEffect;
        if (textPaint != null) {
            AbstractC119825bg abstractC119825bg = this.A00;
            if (C14360o3.A0K(abstractC119825bg, C119815bf.A00)) {
                AbstractC166987dD.A1R(textPaint);
                return;
            }
            if (!(abstractC119825bg instanceof C62V)) {
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C62V c62v = (C62V) abstractC119825bg;
            textPaint.setStrokeWidth(c62v.A01);
            textPaint.setStrokeMiter(c62v.A00);
            if (c62v.A03 == 0) {
                join = Paint.Join.MITER;
            } else {
                join = Paint.Join.ROUND;
            }
            textPaint.setStrokeJoin(join);
            int i = c62v.A02;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.SQUARE;
            }
            textPaint.setStrokeCap(cap);
            InterfaceC72011XEz interfaceC72011XEz = c62v.A04;
            if (interfaceC72011XEz != null) {
                pathEffect = ((C28803CnZ) interfaceC72011XEz).A00;
            } else {
                pathEffect = null;
            }
            textPaint.setPathEffect(pathEffect);
        }
    }

    public BYU(AbstractC119825bg abstractC119825bg) {
        this.A00 = abstractC119825bg;
    }
}
