package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7E extends AbstractC202988yG {
    public final List A00;
    public final AccelerateDecelerateInterpolator A01;
    public final EnumC194908jr A02;
    public final List A03;
    public final List A04;

    private final float A00(float f, int i, boolean z) {
        int min;
        float f2 = i;
        List list = this.A00;
        C14360o3.A0B(list, 0);
        C66335U9n c66335U9n = (C66335U9n) AbstractC001800i.A0J(list);
        float f3 = 0.0f;
        if (c66335U9n != null && (min = Math.min(c66335U9n.A05.size(), c66335U9n.A06.size())) != 0) {
            f3 = Math.min(A0W() * 0.2f, 1000.0f) / min;
        }
        float f4 = f2 * f3;
        int i2 = 0;
        if (z) {
            i2 = C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        float f5 = 0.0f + f4;
        float f6 = i2;
        return AbstractC13600mm.A02(f, f5 + f6, Math.min(A0W() * 0.2f, 1000.0f) + f6, 0.0f, 1.0f);
    }

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        float A02;
        float interpolation;
        float f3;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, textPaint);
        AbstractC43594JPz.A1P(spannable, c57482kN);
        canvas.save();
        int A0W = i % A0W();
        float max = Math.max((A0W() - 200) - Math.min(A0W() * 0.2f, 1000.0f), 0.0f);
        for (C66335U9n c66335U9n : this.A00) {
            ArrayList arrayList = c66335U9n.A05;
            ArrayList arrayList2 = c66335U9n.A06;
            int min = Math.min(arrayList.size(), arrayList2.size());
            for (int i2 = 0; i2 < min; i2++) {
                C69621VsO c69621VsO = (C69621VsO) arrayList.get(i2);
                C69621VsO c69621VsO2 = (C69621VsO) arrayList2.get(i2);
                float f4 = A0W;
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.A01;
                if (f4 < max) {
                    interpolation = accelerateDecelerateInterpolator.getInterpolation(A00(f4, i2, false));
                    f3 = accelerateDecelerateInterpolator.getInterpolation(A00(f4, i2, A1R));
                } else {
                    interpolation = accelerateDecelerateInterpolator.getInterpolation(AbstractC13600mm.A02(f4, max, r8 - 200, 1.0f, 0.0f));
                    f3 = interpolation;
                }
                c69621VsO.A00 = interpolation;
                c69621VsO2.A00 = f3;
            }
            c66335U9n.onPreDraw();
            c66335U9n.AQP(canvas);
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C202888y6) it.next()).A04 = false;
        }
        List list = this.A04;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list2 = (List) list.get(i3);
            int size2 = list2.size();
            float min2 = Math.min(A0W() * 0.2f, 1000.0f);
            float f5 = i3 * (min2 / size);
            if (size2 > 0) {
                float f6 = (min2 - f5) / size2;
                int i4 = 0;
                do {
                    C69441VnQ c69441VnQ = (C69441VnQ) list2.get(i4);
                    float f7 = A0W;
                    float f8 = max - 250.0f;
                    if (f7 < f8) {
                        float f9 = ((i4 + 1) * f6) + 250.0f + f5;
                        A02 = AbstractC13600mm.A02(f7, f9, 250.0f + f9, 0.0f, 255.0f);
                    } else {
                        A02 = AbstractC13600mm.A02(f7, f8, max, 255.0f, 0.0f);
                    }
                    int i5 = (int) A02;
                    C190868ci[] c190868ciArr = c69441VnQ.A07;
                    if (c190868ciArr.length != 0) {
                        C190868ci c190868ci = c190868ciArr[0];
                        c190868ci.A03 = Integer.valueOf(i5);
                        c190868ci.A01 = 0.0f;
                        c190868ci.A00 = 0.0f;
                        c190868ci.A04 = !c69441VnQ.A06;
                    }
                    c69441VnQ.A03.setAlpha(i5);
                    Iterator it2 = c69441VnQ.A05.iterator();
                    while (it2.hasNext()) {
                        ((Paint) it2.next()).setAlpha(i5);
                    }
                    canvas.save();
                    canvas.translate(c69441VnQ.A00, c69441VnQ.A01);
                    Iterator it3 = c69441VnQ.A04.iterator();
                    while (it3.hasNext()) {
                        ((Layout) it3.next()).draw(canvas);
                    }
                    c69441VnQ.A02.draw(canvas);
                    canvas.restore();
                    i4++;
                } while (i4 < size2);
            }
        }
        canvas.restore();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return 5000;
    }

    @Override // X.C6RB
    public final void A0R() {
        StaticLayout staticLayout;
        float f;
        super.A0R();
        List list = this.A00;
        list.clear();
        List list2 = this.A03;
        list2.clear();
        List list3 = this.A04;
        list3.clear();
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        if (spannable.length() != 0 && (staticLayout = this.A0G) != null) {
            TextPaint textPaint = this.A0b;
            C14360o3.A07(textPaint);
            C57482kN A08 = A08();
            boolean A0O = A0O();
            C66335U9n[] c66335U9nArr = (C66335U9n[]) C4GL.A06(spannable, C66335U9n.class);
            Collections.addAll(list, Arrays.copyOf(c66335U9nArr, c66335U9nArr.length));
            C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(spannable, C202888y6.class);
            Collections.addAll(list2, Arrays.copyOf(c202888y6Arr, c202888y6Arr.length));
            WEG.A02(spannable, textPaint);
            textPaint.clearShadowLayer();
            int lineCount = staticLayout.getLineCount();
            for (int i = 0; i < lineCount; i++) {
                int lineStart = staticLayout.getLineStart(i);
                int lineEnd = staticLayout.getLineEnd(i);
                int lineTop = staticLayout.getLineTop(i);
                float lineLeft = staticLayout.getLineLeft(i);
                float lineRight = staticLayout.getLineRight(i) - lineLeft;
                CharSequence subSequence = spannable.subSequence(lineStart, lineEnd);
                if (subSequence != null && subSequence.length() != 0 && TextUtils.getTrimmedLength(subSequence) > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = subSequence.length();
                    float f2 = 0.0f;
                    int i2 = 0;
                    while (i2 < length) {
                        if (!AbstractC58319PtB.A1T(subSequence, i2)) {
                            int i3 = i2 + 1;
                            while (i3 < length && !AbstractC58319PtB.A1T(subSequence, i3)) {
                                i3++;
                            }
                            int i4 = i3;
                            while (i4 < length && AbstractC58319PtB.A1T(subSequence, i4)) {
                                i4++;
                            }
                            if (i4 < length) {
                                i3 = i4;
                            }
                            CharSequence subSequence2 = subSequence.subSequence(i2, i3);
                            C14360o3.A0C(subSequence2, AbstractC43591JPw.A00(85));
                            C69441VnQ c69441VnQ = new C69441VnQ((Spannable) subSequence2, textPaint, A08, A0O);
                            StaticLayout staticLayout2 = c69441VnQ.A02;
                            float A02 = C6RE.A02(staticLayout2);
                            if (A0O) {
                                f = (((lineLeft - staticLayout2.getLineLeft(0)) + lineRight) - f2) - A02;
                            } else {
                                f = lineLeft + f2;
                            }
                            c69441VnQ.A00 = f;
                            c69441VnQ.A01 = lineTop;
                            arrayList.add(c69441VnQ);
                            f2 += A02;
                            i2 = i3 - 1;
                        }
                        i2++;
                    }
                    list3.add(arrayList);
                }
            }
        }
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A02;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        int i;
        Iterator it = this.A00.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C66335U9n c66335U9n = (C66335U9n) it.next();
            ArrayList arrayList = c66335U9n.A05;
            ArrayList arrayList2 = c66335U9n.A06;
            int min = Math.min(arrayList.size(), arrayList2.size());
            while (i < min) {
                C69621VsO c69621VsO = (C69621VsO) arrayList.get(i);
                C69621VsO c69621VsO2 = (C69621VsO) arrayList2.get(i);
                c69621VsO.A00 = 1.0f;
                c69621VsO2.A00 = 1.0f;
                i++;
            }
        }
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        if (spannable.length() != 0) {
            C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(spannable, C190868ci.class);
            int length = c190868ciArr.length;
            while (i < length) {
                C190868ci c190868ci = c190868ciArr[i];
                c190868ci.A03 = 255;
                c190868ci.A00(c190868ci.A02);
                i++;
            }
            C4GL.A05(spannable, C9TA.class);
        }
    }

    public V7E(Context context, int i) {
        super(context, i);
        this.A00 = new ArrayList();
        this.A03 = new ArrayList();
        this.A04 = new ArrayList();
        this.A01 = new AccelerateDecelerateInterpolator();
        this.A02 = EnumC194908jr.A05;
    }
}
