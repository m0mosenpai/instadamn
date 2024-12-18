package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.8y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202918y9 extends MetricAffectingSpan implements C6S2 {
    public boolean A00;
    public boolean A01;
    public final EnumC190948cq A02;
    public final C190888ck A03;
    public final float A04;
    public final Typeface A05;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        A00(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        A00(textPaint);
    }

    public final void A00(TextPaint textPaint) {
        float f;
        float f2;
        textPaint.setTypeface(this.A05);
        if (this.A01) {
            f = this.A02.A00;
            f2 = 0.0f;
        } else {
            boolean z = this.A00;
            f = this.A02.A00;
            if (z) {
                f2 = this.A04;
            }
            textPaint.setLetterSpacing(f);
        }
        f += f2;
        textPaint.setLetterSpacing(f);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.XCW, X.Ai2, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        String str = this.A03.A09;
        boolean z = this.A00;
        C14360o3.A0B(str, 1);
        ?? obj = new Object();
        obj.A00 = str;
        obj.A01 = z;
        return obj;
    }

    public C202918y9(Context context, C190888ck c190888ck) {
        float f;
        this.A03 = c190888ck;
        EnumC190948cq enumC190948cq = c190888ck.A05;
        this.A02 = enumC190948cq;
        this.A05 = AbstractC202838y1.A01(AbstractC15960qq.A00(context), enumC190948cq);
        AbstractC190968cs abstractC190968cs = c190888ck.A04;
        if (abstractC190968cs != null && (abstractC190968cs instanceof C194978jy)) {
            f = 0.2f;
        } else {
            f = 0.0f;
        }
        this.A04 = f;
    }
}
