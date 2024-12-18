package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class V7K extends AbstractC202988yG {
    public int A00;
    public int A01;
    public int A02;
    public float A03;
    public int A04;
    public final Integer A05;
    public final Integer A06;
    public final List A07;
    public final List A08;

    @Override // X.C6RB
    public final void A0T(Canvas canvas) {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C202888y6) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C202888y6) it.next()).A04 = false;
        }
        canvas.save();
        AbstractC167017dG.A12(canvas, this);
        A0H(canvas);
        A0e(canvas);
        canvas.restore();
    }

    private final List A06() {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C71066WnO) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List A07() {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C71065WnN) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d8 A[SYNTHETIC] */
    @Override // X.C6RB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0R() {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7K.A0R():void");
    }

    @Override // X.C6RB
    public final void A0S(Canvas canvas) {
        if (this instanceof V7H) {
            V7H v7h = (V7H) this;
            if (v7h.A01 > 0) {
                canvas.save();
                AbstractC167017dG.A12(canvas, v7h);
                v7h.A0H(canvas);
                v7h.A0f(canvas, v7h.A00, v7h.A0a(v7h.A01));
            } else {
                return;
            }
        } else {
            canvas.save();
            AbstractC167017dG.A12(canvas, this);
            A0H(canvas);
            A0f(canvas, 1.0f, this.A0F.length());
        }
        canvas.restore();
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        if (spannable.length() != 0) {
            C4GL.A05(spannable, C9TA.class);
        }
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            for (C71065WnN c71065WnN : A07()) {
                TextPaint textPaint = this.A0b;
                c71065WnN.A01(AbstractC139126Rt.A02(staticLayout, textPaint.getTextSize() * 0.3f, textPaint.getTextSize() * c71065WnN.A0B, textPaint.getTextSize() * c71065WnN.A08, c71065WnN.A00, 1.0f), textPaint.getTextSize());
            }
            for (C71066WnO c71066WnO : A06()) {
                float textSize = this.A0b.getTextSize();
                C22971AAp c22971AAp = AbstractC23070AFc.A00;
                Layout.Alignment alignment = this.A0E;
                C14360o3.A07(alignment);
                c71066WnO.FCG(staticLayout, c22971AAp.A00(alignment), textSize, spannable.getSpanStart(c71066WnO), spannable.getSpanEnd(c71066WnO));
                c71066WnO.A01.setAlpha(255);
            }
        }
    }

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        if (this instanceof V7H) {
            V7H v7h = (V7H) this;
            C14360o3.A0B(canvas, 0);
            v7h.A0c();
            v7h.A0b();
            int i2 = v7h.A01;
            if (i2 > 0) {
                v7h.A0f(canvas, v7h.A00, v7h.A0a(i2));
            }
            v7h.A0e(canvas);
            return;
        }
        C14360o3.A0B(canvas, 0);
        A0c();
        A0b();
        A0f(canvas, 1.0f, this.A0F.length());
        A0e(canvas);
    }

    public final int A0a(int i) {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            for (W64 w64 : (List) it.next()) {
                int i2 = w64.A06;
                if (i < i2) {
                    BreakIterator breakIterator = w64.A0B;
                    Spannable spannable = w64.A08;
                    breakIterator.setText(spannable.toString());
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    for (int next = breakIterator.next(); i3 < i && next != -1; next = breakIterator.next()) {
                        i4 += spannable.subSequence(i5, next).length();
                        i3++;
                        i5 = next;
                    }
                    return w64.A07 + i4;
                }
                i -= i2;
            }
        }
        C14360o3.A07(this.A0F);
        return (r0.length() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0266, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0260, code lost:
    
        if (r11 != 3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        if (r11 == 1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.V7K, X.V7I, X.8yG] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.V7K] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.V7K, X.V7J, X.8yG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7K.A0b():void");
    }

    public final void A0c() {
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C202888y6) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C202888y6) it.next()).A04 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[LOOP:1: B:35:0x00bb->B:36:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0d(int r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7K.A0d(int):void");
    }

    public final void A0e(Canvas canvas) {
        C69107Vhx A02;
        if (this instanceof V7H) {
            V7H v7h = (V7H) this;
            if (v7h.A01 > 0) {
                List list = ((V7K) v7h).A08;
                int size = list.size();
                int i = v7h.A01;
                for (int i2 = 0; i2 < size; i2++) {
                    List list2 = (List) list.get(i2);
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (i >= 0) {
                            W64 w64 = (W64) list2.get(i3);
                            int i4 = w64.A06;
                            int i5 = i4 - 1;
                            int i6 = i - 1;
                            if (i5 > i6) {
                                i5 = i6;
                            }
                            w64.A04(canvas, i5);
                            i -= i4;
                        } else {
                            return;
                        }
                    }
                }
                return;
            }
            return;
        }
        if (this instanceof V7J) {
            V7J v7j = (V7J) this;
            List list3 = ((V7K) v7j).A08;
            int size3 = list3.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size3; i8++) {
                List list4 = (List) list3.get(i8);
                int size4 = list4.size();
                canvas.save();
                for (int i9 = 0; i9 < size4; i9++) {
                    W64 w642 = (W64) list4.get(i9);
                    boolean A1Z = AbstractC43593JPy.A1Z(v7j.A00, v7j.A0W() - 500);
                    w642.A04(canvas, w642.A0C.size() - 1);
                    if (v7j.A0I == null) {
                        int i10 = v7j.A00;
                        float A01 = V7J.A01(v7j, i10, i7, A1Z);
                        int i11 = 1;
                        do {
                            float A012 = V7J.A01(v7j, i10 - (i11 * 5), i7, A1Z);
                            if (A01 == A012) {
                                break;
                            }
                            if (A1Z) {
                                A02 = V7J.A03(v7j, A012);
                            } else {
                                A02 = V7J.A02(v7j, A012);
                            }
                            canvas.save();
                            w642.A01 = A02.A00 * 0.2f;
                            w642.A00 = A02.A02;
                            w642.A02 = A02.A01;
                            w642.A04(canvas, w642.A0C.size() - 1);
                            canvas.restore();
                            i11++;
                        } while (i11 < 4);
                    }
                    i7++;
                }
                canvas.restore();
            }
            return;
        }
        List list5 = this.A08;
        int size5 = list5.size();
        for (int i12 = 0; i12 < size5; i12++) {
            List list6 = (List) list5.get(i12);
            int size6 = list6.size();
            for (int i13 = 0; i13 < size6; i13++) {
                ((W64) list6.get(i13)).A04(canvas, r1.A0C.size() - 1);
            }
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        if (this instanceof V7H) {
            int i = this.A01;
            if (i < 0) {
                return Math.max(5000, ((int) ((this.A00 / 20.0f) * 1000.0f)) + C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
            return i;
        }
        int i2 = this.A01;
        if (i2 >= 0) {
            return i2;
        }
        return 5000;
    }

    public V7K(Context context, int i) {
        super(context, i);
        this.A08 = new ArrayList();
        Integer num = C05F.A00;
        this.A05 = num;
        this.A06 = num;
        this.A07 = new ArrayList();
        this.A01 = 5000;
    }

    public static float A04(List list, float f, int i, int i2) {
        float f2 = ((PointF) list.get(i)).x;
        return (f - f2) / (((PointF) list.get(i2)).x - f2);
    }

    public static float A05(List list, int i) {
        PointF pointF = (PointF) AbstractC001800i.A0O(list, i);
        if (pointF != null) {
            return pointF.x;
        }
        return 0.0f;
    }

    public final void A0f(Canvas canvas, float f, int i) {
        StaticLayout staticLayout;
        if (!A07().isEmpty()) {
            StaticLayout staticLayout2 = this.A0G;
            if (staticLayout2 != null) {
                for (C71065WnN c71065WnN : A07()) {
                    List A1J = AbstractC166987dD.A1J(AbstractC70141W6t.A02(staticLayout2, 0.0f, 0.0f, 0.0f, 0.0f, c71065WnN.A0A, this.A0F.getSpanStart(c71065WnN), Math.min(this.A0F.getSpanEnd(c71065WnN), i)));
                    TextPaint textPaint = this.A0b;
                    c71065WnN.A01(AbstractC139126Rt.A03(A1J, c71065WnN.A09 * textPaint.getTextSize(), c71065WnN.A0B * textPaint.getTextSize(), c71065WnN.A08 * textPaint.getTextSize(), c71065WnN.A00, true), textPaint.getTextSize());
                    c71065WnN.onPreDraw();
                    c71065WnN.A00(canvas, Integer.valueOf((int) (255.0f * f)));
                }
                return;
            }
            return;
        }
        List list = this.A07;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof WnM) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<WnM> arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof WnM) {
                    arrayList2.add(obj2);
                }
            }
            for (WnM wnM : arrayList2) {
                wnM.onPreDraw();
                int i2 = (int) (255.0f * f);
                Integer valueOf = Integer.valueOf(i2);
                if (wnM.A05) {
                    wnM.A05 = false;
                    if (valueOf != null) {
                        wnM.A02.setAlpha(i2);
                    }
                    canvas.drawRect(wnM.A03, wnM.A02);
                }
            }
            return;
        }
        if ((!A06().isEmpty()) && (staticLayout = this.A0G) != null) {
            for (C71066WnO c71066WnO : A06()) {
                c71066WnO.A01.setAlpha((int) (255.0f * f));
                C70100W3q c70100W3q = C71066WnO.A07;
                float textSize = this.A0b.getTextSize();
                C22971AAp c22971AAp = AbstractC23070AFc.A00;
                Layout.Alignment alignment = this.A0E;
                C14360o3.A07(alignment);
                Integer A00 = c22971AAp.A00(alignment);
                int spanStart = this.A0F.getSpanStart(c71066WnO);
                int spanEnd = this.A0F.getSpanEnd(c71066WnO);
                if (spanEnd > i) {
                    spanEnd = i;
                }
                ArrayList A01 = c70100W3q.A01(staticLayout, A00, textSize, spanStart, spanEnd);
                c71066WnO.A04 = A01;
                ArrayList A002 = C6S3.A00(A01);
                C14360o3.A0C(A002, "null cannot be cast to non-null type java.util.ArrayList<android.graphics.Path>");
                c71066WnO.A03 = A002;
                c71066WnO.onPreDraw();
                c71066WnO.AQP(canvas);
            }
        }
    }

    @Override // X.AbstractC202988yG, X.C5RQ
    public final void EUp(int i, int i2) {
        super.EUp(i, i2);
        this.A01 = i2;
    }
}
