package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VvB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69774VvB {
    public float A00;
    public final int A01;
    public final C69631VsY A02;
    public final C6S5 A03;
    public final List A04;
    public final int A05;

    public C69774VvB(Context context, Spannable spannable, TextPaint textPaint, C57482kN c57482kN, boolean z) {
        Layout.Alignment alignment;
        int i;
        int i2;
        C14360o3.A0B(spannable, 2);
        this.A03 = AbstractC190978ct.A00(spannable, 0, spannable.length());
        this.A04 = new ArrayList();
        this.A05 = spannable.length();
        this.A01 = AbstractC002300n.A0d(spannable.toString(), " ", "", false).length();
        for (C190868ci c190868ci : (C190868ci[]) C4GL.A06(spannable, C190868ci.class)) {
            c190868ci.A01 = 0.0f;
            c190868ci.A00 = 0.0f;
        }
        if (z) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        this.A02 = new C69631VsY(alignment, new SpannableStringBuilder(spannable), new TextPaint(textPaint), c57482kN);
        C6S5 c6s5 = this.A03;
        C6S5 c6s52 = C6S5.A08;
        if (c6s5 == c6s52 || c6s5 == C6S5.A07) {
            Object[] A06 = C4GL.A06(spannable, C202888y6.class);
            ArrayList arrayList = new ArrayList();
            C202888y6 c202888y6 = (C202888y6) AbstractC009903n.A06(A06, 0);
            if (c202888y6 != null) {
                if (this.A03 == c6s52) {
                    i = c202888y6.A02;
                } else {
                    i = c202888y6.A01;
                }
                EnumC190948cq enumC190948cq = c202888y6.A09;
                arrayList.add(VSZ.A00(textPaint, enumC190948cq.A02, i));
                Float f = enumC190948cq.A03;
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (this.A03 == c6s52) {
                        i2 = c202888y6.A01;
                    } else {
                        i2 = c202888y6.A02;
                    }
                    arrayList.add(VSZ.A00(textPaint, floatValue, i2));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TextPaint textPaint2 = (TextPaint) it.next();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                    spannableStringBuilder.setSpan(new C190868ci(context, new TextColors(TextShadow.A03, textPaint2.getColor())), 0, this.A05, 0);
                    this.A04.add(new C69631VsY(alignment, spannableStringBuilder, textPaint2, c57482kN));
                }
            }
        }
    }

    public final float A00() {
        PathMeasure pathMeasure = new PathMeasure((Path) this.A02.A05.getValue(), false);
        float length = pathMeasure.getLength();
        while (pathMeasure.nextContour()) {
            length += pathMeasure.getLength();
        }
        return length;
    }

    public final float[] A02() {
        float[] fArr;
        Matrix matrix = new Matrix();
        matrix.setTranslate(this.A00, 0.0f);
        C69631VsY c69631VsY = this.A02;
        Collection collection = (Collection) c69631VsY.A04.getValue();
        if (collection != null) {
            fArr = AbstractC001800i.A0w(collection);
            if (c69631VsY.A00 != 0.0f) {
                Matrix matrix2 = new Matrix();
                float f = c69631VsY.A00;
                matrix2.setScale(f, f);
                matrix2.mapPoints(fArr);
                matrix.mapPoints(fArr);
                return fArr;
            }
        }
        fArr = new float[0];
        matrix.mapPoints(fArr);
        return fArr;
    }

    public final void A01(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A00, 0.0f);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C69631VsY) it.next()).A01.draw(canvas);
        }
        canvas.restore();
    }
}
