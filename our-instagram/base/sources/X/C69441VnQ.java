package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VnQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69441VnQ {
    public float A00;
    public float A01;
    public final StaticLayout A02;
    public final TextPaint A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final C190868ci[] A07;
    public final Spannable A08;
    public final C6S5 A09;
    public final C202888y6[] A0A;

    public C69441VnQ(Spannable spannable, TextPaint textPaint, C57482kN c57482kN, boolean z) {
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i;
        int i2;
        C14360o3.A0B(spannable, 1);
        this.A08 = spannable;
        this.A04 = new ArrayList();
        boolean z2 = true;
        this.A03 = new TextPaint(1);
        this.A05 = new ArrayList();
        C6S5 A00 = AbstractC190978ct.A00(spannable, 0, spannable.length());
        this.A09 = A00;
        C6S5 c6s5 = C6S5.A08;
        if (A00 != c6s5 && A00 != C6S5.A07) {
            z2 = false;
        }
        this.A06 = z2;
        C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(spannable, C190868ci.class);
        for (C190868ci c190868ci : c190868ciArr) {
            textPaint.setColor(c190868ci.A05);
        }
        this.A07 = c190868ciArr;
        C202888y6[] c202888y6Arr = this.A06 ? (C202888y6[]) C4GL.A06(this.A08, C202888y6.class) : null;
        this.A0A = c202888y6Arr;
        this.A03.set(textPaint);
        Spannable spannable2 = this.A08;
        TextPaint textPaint2 = this.A03;
        int i3 = c57482kN.A00;
        if (z) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        float f = c57482kN.A02;
        float f2 = c57482kN.A01;
        this.A02 = new StaticLayout(spannable2, textPaint2, i3, alignment, f, f2, false);
        if (this.A06) {
            if (c202888y6Arr != null) {
                List list = this.A05;
                C6S5 c6s52 = this.A09;
                C202888y6 c202888y6 = c202888y6Arr[0];
                if (c6s52 == c6s5) {
                    i = c202888y6.A02;
                } else {
                    i = c202888y6.A01;
                }
                list.add(VSZ.A00(textPaint, c202888y6.A09.A02, i));
                C202888y6 c202888y62 = c202888y6Arr[0];
                Float f3 = c202888y62.A09.A03;
                if (f3 != null) {
                    float floatValue = f3.floatValue();
                    List list2 = this.A05;
                    if (this.A09 == c6s5) {
                        i2 = c202888y62.A01;
                    } else {
                        i2 = c202888y62.A02;
                    }
                    list2.add(VSZ.A00(textPaint, floatValue, i2));
                }
            }
            for (TextPaint textPaint3 : this.A05) {
                List list3 = this.A04;
                Spannable spannable3 = this.A08;
                int i4 = c57482kN.A00;
                if (z) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                list3.add(new StaticLayout(spannable3, textPaint3, i4, alignment2, f, f2, false));
            }
        }
    }
}
