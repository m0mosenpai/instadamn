package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spannable;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import com.instagram.ui.text.CustomUnderlineSpan;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9nO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219769nO extends AbstractC202988yG {
    public final TimeInterpolator A00;
    public final EnumC194908jr A01;
    public final List A02;
    public final List A03;
    public final List A04;

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return 6000;
    }

    public C219769nO(Context context, int i) {
        super(context, i);
        this.A00 = new OvershootInterpolator(3.0f);
        this.A04 = AbstractC166987dD.A1E();
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
        this.A01 = EnumC194908jr.A0A;
    }

    @Override // X.C6RB
    public final void A0R() {
        C6S5 c6s5;
        C190868ci c190868ci;
        C202888y6 c202888y6;
        super.A0R();
        List list = this.A04;
        list.clear();
        List list2 = this.A02;
        list2.clear();
        List list3 = this.A03;
        list3.clear();
        A0Y();
        Spannable spannable = this.A0F;
        if (spannable != null && spannable.length() != 0) {
            Spannable spannable2 = this.A0F;
            C14360o3.A07(spannable2);
            C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(spannable2, C202888y6.class);
            int length = c202888y6Arr.length;
            if (length == 0) {
                c6s5 = C6S5.A05;
            } else {
                c6s5 = c202888y6Arr[0].A03;
            }
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(this.A0F.toString());
            int i = 0;
            while (true) {
                int next = characterInstance.next();
                if (next == -1) {
                    break;
                }
                C190868ci[] c190868ciArr = (C190868ci[]) this.A0F.getSpans(i, next, C190868ci.class);
                Spannable spannable3 = this.A0F;
                C14360o3.A0A(c190868ciArr);
                EnumC190948cq enumC190948cq = null;
                if (!AbstractC167007dF.A1N(c190868ciArr.length)) {
                    c190868ci = c190868ciArr[0];
                } else {
                    c190868ci = null;
                }
                if (0 < length && (c202888y6 = c202888y6Arr[0]) != null) {
                    enumC190948cq = c202888y6.A09;
                }
                C9TB c9tb = new C9TB(c190868ci, enumC190948cq);
                C14360o3.A0B(c6s5, 0);
                c9tb.A01 = c6s5;
                spannable3.setSpan(c9tb, i, next, 33);
                i = next;
            }
        }
        Spannable spannable4 = this.A0F;
        C14360o3.A07(spannable4);
        if (spannable4.length() != 0) {
            C9TB[] c9tbArr = (C9TB[]) C4GL.A06(spannable4, C9TB.class);
            Collections.addAll(list, Arrays.copyOf(c9tbArr, c9tbArr.length));
            C202888y6[] c202888y6Arr2 = (C202888y6[]) C4GL.A06(spannable4, C202888y6.class);
            Collections.addAll(list2, Arrays.copyOf(c202888y6Arr2, c202888y6Arr2.length));
            ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = (ViewTreeObserver.OnPreDrawListener[]) C4GL.A06(spannable4, ViewTreeObserver.OnPreDrawListener.class);
            Collections.addAll(list3, Arrays.copyOf(onPreDrawListenerArr, onPreDrawListenerArr.length));
            Spannable spannable5 = this.A0F;
            C14360o3.A07(spannable5);
            for (CustomUnderlineSpan customUnderlineSpan : (CustomUnderlineSpan[]) C4GL.A06(spannable5, CustomUnderlineSpan.class)) {
                int spanStart = this.A0F.getSpanStart(customUnderlineSpan);
                int spanEnd = this.A0F.getSpanEnd(customUnderlineSpan);
                C190868ci[] c190868ciArr2 = (C190868ci[]) this.A0F.getSpans(spanStart, spanEnd, C190868ci.class);
                final int color = this.A0b.getColor();
                C14360o3.A0A(c190868ciArr2);
                if (c190868ciArr2.length != 0) {
                    color = c190868ciArr2[0].A05;
                }
                Spannable spannable6 = this.A0F;
                final Integer num = C05F.A01;
                spannable6.setSpan(new C202878y5(color, num) { // from class: X.9qA
                    public final int A00;
                    public final RectF A01 = AbstractC166987dD.A0X();

                    {
                        this.A00 = color;
                        C14360o3.A0B(num, 0);
                        super.A00 = num;
                    }

                    @Override // X.C202878y5, android.text.style.LineBackgroundSpan
                    public final void drawBackground(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9) {
                        AbstractC167017dG.A1N(canvas, paint);
                        C14360o3.A0B(charSequence, 7);
                        super.drawBackground(canvas, paint, i2, i3, i4, i5, i6, charSequence, i7, i8, i9);
                        float f = (i6 - i4) * 0.02f;
                        paint.setColor(this.A00);
                        RectF rectF = this.A01;
                        float f2 = super.A01;
                        float f3 = i5 + f;
                        rectF.set(f2, f3, f2 + this.A02, f3 + f);
                        canvas.drawRoundRect(rectF, f, f, this.A06);
                    }
                }, spanStart, spanEnd, 33);
            }
        }
    }
}
