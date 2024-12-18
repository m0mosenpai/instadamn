package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class V7F extends AbstractC202988yG {
    public final float A00;
    public final TimeInterpolator A01;
    public final EnumC194908jr A02;
    public final ArrayList A03;
    public final ArrayList A04;

    @Override // X.C6RB
    public final void A0L(Spannable spannable) {
        C14360o3.A0B(spannable, 0);
        super.A0L(new SpannableString(spannable));
        ArrayList arrayList = this.A04;
        arrayList.clear();
        ArrayList arrayList2 = this.A03;
        arrayList2.clear();
        if (spannable.length() != 0) {
            arrayList.addAll(AbstractC009903n.A0J(C4GL.A06(spannable, ViewTreeObserver.OnPreDrawListener.class)));
            arrayList2.addAll(AbstractC009903n.A0J(C4GL.A06(spannable, C66334U9m.class)));
        }
    }

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        C14360o3.A0B(canvas, 0);
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            canvas.save();
            if (A0W() != 0) {
                float A0W = (i % A0W()) / A0W();
                float A00 = A00(A0W);
                canvas.translate(0.0f, A00);
                Iterator A13 = AbstractC166997dE.A13(this.A04);
                while (A13.hasNext()) {
                    ((ViewTreeObserver.OnPreDrawListener) AbstractC166997dE.A0l(A13)).onPreDraw();
                }
                ArrayList arrayList = this.A03;
                if (!arrayList.isEmpty()) {
                    float A002 = A00(A0W - 0.01f);
                    float A003 = A00(A0W - 0.02f);
                    float A004 = A00(A0W - 0.03f);
                    float A005 = A00(A0W - 0.04f);
                    Iterator A132 = AbstractC166997dE.A13(arrayList);
                    while (A132.hasNext()) {
                        C66334U9m c66334U9m = (C66334U9m) AbstractC166997dE.A0l(A132);
                        c66334U9m.A01 = A002 - A00;
                        c66334U9m.A00 = A004 - A00;
                        c66334U9m.A03 = A003 - A00;
                        c66334U9m.A02 = A005 - A00;
                    }
                }
                staticLayout.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return 5000;
    }

    @Override // X.AbstractC202988yG
    public final float A0V() {
        return -this.A00;
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A02;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        for (C66334U9m c66334U9m : (C66334U9m[]) C4GL.A06(spannable, C66334U9m.class)) {
            c66334U9m.A01 = 0.0f;
            c66334U9m.A00 = 0.0f;
            c66334U9m.A03 = 0.0f;
            c66334U9m.A02 = 0.0f;
        }
    }

    public V7F(Context context, int i) {
        super(context, i);
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A01 = new OvershootInterpolator(1.0f);
        RectF rectF = AbstractC13880nE.A01;
        this.A00 = ((-50.0f) * AbstractC167007dF.A0K(context).scaledDensity) + 0.5f;
        this.A02 = EnumC194908jr.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r6 >= 0.47500002f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float A00(float r6) {
        /*
            r5 = this;
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r3 = 1040187392(0x3e000000, float:0.125)
            r4 = 1033476506(0x3d99999a, float:0.075)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1c
        L10:
            float r6 = r6 - r3
            float r6 = r6 / r4
            android.animation.TimeInterpolator r0 = r5.A01
            float r0 = r0.getInterpolation(r6)
            float r1 = r5.A00
            float r1 = r1 * r0
            return r1
        L1c:
            r3 = 1049414861(0x3e8ccccd, float:0.275)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L2a
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L2a
        L27:
            float r1 = r5.A00
            return r1
        L2a:
            r0 = 1051931444(0x3eb33334, float:0.35000002)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L44
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L44
        L37:
            float r6 = r6 - r3
            float r6 = r6 / r4
            android.animation.TimeInterpolator r0 = r5.A01
            float r0 = r0.getInterpolation(r6)
            float r1 = r5.A00
            float r2 = r2 - r0
            float r1 = r1 * r2
            return r1
        L44:
            r1 = 1057803469(0x3f0ccccd, float:0.55)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            r3 = 1056125748(0x3ef33334, float:0.47500002)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L53
            goto L10
        L53:
            r3 = 1059061760(0x3f200000, float:0.625)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5e
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L5e
            goto L27
        L5e:
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6a
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto L37
        L6a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7F.A00(float):float");
    }
}
