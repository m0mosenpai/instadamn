package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class V7B extends AbstractC202988yG {
    public int A00;
    public List A01;
    public final TimeInterpolator A02;
    public final ArrayList A03;
    public final List A04;
    public final EnumC194908jr A05;
    public final List A06;
    public final List A07;
    public final List A08;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        if (r10 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (r9 == (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        r13 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        if (X.AbstractC58319PtB.A1T(r4, r13) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r5.getLineForOffset(r13) != r11) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        if (r5.getLineForOffset(r9 - 1) != r11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        if (r9 == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r8.preceding(r10);
        r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011e, code lost:
    
        r10 = r9;
     */
    @Override // X.C6RB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7B.A0R():void");
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A05;
    }

    @Override // X.AbstractC202988yG
    public final void A0Y() {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            for (C71065WnN c71065WnN : this.A06) {
                float textSize = this.A0b.getTextSize();
                C22971AAp c22971AAp = AbstractC23070AFc.A00;
                Layout.Alignment alignment = this.A0E;
                C14360o3.A07(alignment);
                c71065WnN.FCG(staticLayout, c22971AAp.A00(alignment), textSize, this.A0F.getSpanStart(c71065WnN), this.A0F.getSpanEnd(c71065WnN));
            }
            this.A04.clear();
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00;
    }

    public V7B(Context context, int i) {
        super(context, i);
        this.A03 = new ArrayList();
        this.A02 = new AccelerateDecelerateInterpolator();
        this.A04 = new ArrayList();
        this.A06 = new ArrayList();
        this.A08 = new ArrayList();
        this.A07 = new ArrayList();
        this.A05 = EnumC194908jr.A04;
    }

    @Override // X.AbstractC202988yG
    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, float f, float f2, int i) {
        int i2;
        boolean z;
        int A0W;
        C14360o3.A0B(canvas, 0);
        AbstractC25234BEr.A1P(textPaint, spannable, c57482kN);
        int A0W2 = i % A0W();
        ArrayList arrayList = this.A03;
        int i3 = 0;
        C14360o3.A0B(arrayList, 0);
        int i4 = 0;
        if (A0W() != 0 && ((A0W() * 118) / this.A00) + ((A0W() * C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) / this.A00) != 0) {
            if (A0W2 >= (A0W() * 500) / this.A00) {
                if (A0W2 < (A0W() * 1118) / this.A00) {
                    i4 = 1;
                } else {
                    int A0W3 = (A0W2 - ((A0W() * 1118) / this.A00)) / (((A0W() * 118) / this.A00) + ((A0W() * C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) / this.A00));
                    int size = arrayList.size() - 3;
                    if (A0W3 > size) {
                        A0W3 = size;
                    }
                    i4 = A0W3 + 2;
                }
            }
            int size2 = arrayList.size() - 1;
            i3 = i4;
            if (i4 > size2) {
                i3 = size2;
            }
        }
        int i5 = A0W2;
        if (A0W2 >= (A0W() * 500) / this.A00) {
            int A0W4 = (A0W() * 1118) / this.A00;
            int A0W5 = A0W();
            if (A0W2 < A0W4) {
                A0W = (A0W5 * 500) / this.A00;
            } else {
                i5 = A0W2 - ((A0W5 * 1118) / this.A00);
                A0W = (i3 - 2) * (((A0W() * 118) / this.A00) + ((A0W() * C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) / this.A00));
            }
            i5 -= A0W;
        }
        boolean z2 = true;
        if (A0W2 < (A0W() * 1118) / this.A00 || i3 != arrayList.size() - 1 || i5 <= ((A0W() * 1000) / this.A00) + ((A0W() * 118) / this.A00)) {
            z2 = false;
        }
        if (z2) {
            i3 = 0;
        }
        C69106Vhw c69106Vhw = (C69106Vhw) AbstractC31173DnH.A0i(arrayList, i3);
        TextPaint textPaint2 = this.A0b;
        float textSize = textPaint2.getTextSize() / 4.0f;
        float textSize2 = textPaint2.getTextSize() * 0.3f;
        float textSize3 = textPaint2.getTextSize() * 0.2f;
        for (C71065WnN c71065WnN : this.A06) {
            if (z2) {
                List list = this.A04;
                int size3 = list.size();
                float f3 = 0.0f;
                RectF rectF = null;
                for (int i6 = 0; i6 < size3; i6++) {
                    int size4 = ((Collection) list.get(i6)).size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        float width = ((RectF) ((List) list.get(i6)).get(i7)).width();
                        if (width > f3) {
                            rectF = (RectF) ((List) list.get(i6)).get(i7);
                            f3 = width;
                        }
                    }
                }
                if (rectF != null) {
                    float interpolation = this.A02.getInterpolation(((i5 - ((A0W() * 1000) / this.A00)) - ((A0W() * 118) / this.A00)) / ((A0W() * DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD) / this.A00));
                    float width2 = rectF.width();
                    float f4 = (1.0f - interpolation) * width2;
                    float f5 = (rectF.right - width2) + f4;
                    float f6 = (rectF.left + width2) - f4;
                    ListIterator listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        List list2 = (List) listIterator.next();
                        ListIterator listIterator2 = list2.listIterator();
                        while (listIterator2.hasNext()) {
                            RectF rectF2 = (RectF) listIterator2.next();
                            if (A0O()) {
                                float f7 = rectF2.left;
                                if (f7 < f6) {
                                    f7 = f6;
                                }
                                float f8 = rectF2.right;
                                if (f7 > f8) {
                                    f7 = f8;
                                }
                                rectF2.left = f7;
                            } else {
                                float f9 = rectF2.right;
                                if (f9 > f5) {
                                    f9 = f5;
                                }
                                float f10 = rectF2.left;
                                if (f9 < f10) {
                                    f9 = f10;
                                }
                                rectF2.right = f9;
                            }
                            if (rectF2.width() <= 0.0f) {
                                listIterator2.remove();
                            }
                        }
                        if (list2.isEmpty()) {
                            listIterator.remove();
                        }
                    }
                }
            } else {
                List list3 = c69106Vhw.A01;
                if (!list3.isEmpty() && i3 - 1 >= 0) {
                    if (i5 <= (A0W() * 118) / this.A00) {
                        float A0W6 = i5 / (((A0W() * 118) / this.A00) - 18.0f);
                        TimeInterpolator timeInterpolator = this.A02;
                        if (A0W6 > 1.0f) {
                            A0W6 = 1.0f;
                        }
                        float interpolation2 = timeInterpolator.getInterpolation(A0W6);
                        List list4 = this.A04;
                        int size5 = list3.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            if (i8 >= list4.size()) {
                                list4.add(new ArrayList());
                            }
                            List list5 = (List) list4.get(i8);
                            int size6 = ((Collection) list3.get(i8)).size();
                            for (int i9 = 0; i9 < size6; i9++) {
                                if (i9 >= list5.size()) {
                                    list5.add(new RectF((RectF) ((List) list3.get(i8)).get(i9)));
                                }
                            }
                        }
                        List list6 = ((C69106Vhw) arrayList.get(i2)).A01;
                        int size7 = list3.size() - 1;
                        List list7 = (List) list3.get(size7);
                        RectF rectF3 = (RectF) ((List) list4.get(size7)).get(list7.size() - 1);
                        RectF rectF4 = (RectF) AbstractC58320PtC.A0u(list7);
                        float f11 = rectF4.right - rectF4.left;
                        float f12 = 0.0f;
                        if (!list6.isEmpty()) {
                            List list8 = (List) AbstractC58320PtC.A0u(list6);
                            RectF rectF5 = (RectF) AbstractC58320PtC.A0u(list8);
                            if (list8.size() == list7.size() && list6.size() == list3.size()) {
                                f12 = rectF5.right - rectF5.left;
                            }
                        }
                        float f13 = ((f11 - f12) * interpolation2) + f12;
                        if (A0O()) {
                            rectF3.left = rectF4.right - f13;
                        } else {
                            rectF3.right = rectF4.left + f13;
                        }
                    }
                } else {
                    this.A04.clear();
                }
            }
            List list9 = this.A04;
            List list10 = (List) AbstractC001800i.A0L(list9);
            if (list10 != null) {
                C14360o3.A0B(list9, 0);
                int size8 = list9.size() - 1;
                RectF rectF6 = (RectF) AbstractC001800i.A0L(list10);
                if (rectF6 != null) {
                    int size9 = list10.size() - 1;
                    if (this.A01 != null) {
                        z = true;
                        if (size8 > r0.size() - 1) {
                            continue;
                        } else {
                            List list11 = this.A01;
                            if (list11 != null) {
                                List list12 = (List) AbstractC001800i.A0O(list11, size8);
                                if (size9 <= (list12 != null ? list12.size() - 1 : -1)) {
                                    float f14 = rectF6.right;
                                    List list13 = this.A01;
                                    if (list13 != null) {
                                        if (f14 == ((RectF) ((List) list13.get(size8)).get(size9)).right) {
                                            float f15 = rectF6.left;
                                            List list14 = this.A01;
                                            if (list14 != null) {
                                                if (f15 == ((RectF) ((List) list14.get(size8)).get(size9)).left) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        c71065WnN.A01(AbstractC139126Rt.A03(list9, textSize2, textSize3, textSize3, textSize, z), textPaint2.getTextSize());
                        c71065WnN.onPreDraw();
                        c71065WnN.AQP(canvas);
                    }
                    C14360o3.A0F("fullTextBounds");
                    throw C00O.createAndThrow();
                }
            }
            z = false;
            c71065WnN.A01(AbstractC139126Rt.A03(list9, textSize2, textSize3, textSize3, textSize, z), textPaint2.getTextSize());
            c71065WnN.onPreDraw();
            c71065WnN.AQP(canvas);
        }
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((C202888y6) it.next()).A04 = false;
        }
        List list15 = this.A07;
        C14360o3.A0B(list15, 1);
        C69664Vt5 c69664Vt5 = c69106Vhw.A00;
        if (c69664Vt5 != null) {
            WEG.A01(canvas, null, c69664Vt5, null, list15, 0.0f, 0.0f, c69106Vhw.A02);
        }
    }
}
