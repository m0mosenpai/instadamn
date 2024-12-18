package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WEG {
    public static final Rect A00 = new Rect();

    public static final void A01(Canvas canvas, Paint paint, C69664Vt5 c69664Vt5, Integer num, List list, float f, float f2, int i) {
        float f3;
        int i2;
        AbstractC167007dF.A1D(list, 1, c69664Vt5);
        canvas.save();
        if (i > 0 && (i2 = i - 1) < list.size()) {
            ((C69664Vt5) list.get(i2)).A00(canvas, num);
        }
        c69664Vt5.A00(canvas, num);
        if (paint != null) {
            String str = c69664Vt5.A06;
            C14360o3.A0B(str, 0);
            if (AbstractC002300n.A0d(str, "\n", "", false).length() > 0) {
                float f4 = c69664Vt5.A01;
                if (c69664Vt5.A07) {
                    f3 = (c69664Vt5.A04 - f2) - f;
                } else {
                    f3 = c69664Vt5.A05 + f2;
                }
                float f5 = f4 + ((c69664Vt5.A02 - f4) / 2.0f);
                canvas.translate(c69664Vt5.A00, 0.0f);
                canvas.drawRect(f3, c69664Vt5.A03, f3 + f, f5, paint);
            }
        }
        canvas.restore();
    }

    public static final void A02(Spanned spanned, TextPaint textPaint) {
        C202918y9 c202918y9 = (C202918y9) C4GL.A00(spanned, C202918y9.class);
        if (c202918y9 != null) {
            c202918y9.A00(textPaint);
        }
        CharacterStyle characterStyle = (CharacterStyle) C4GL.A00(spanned, C190868ci.class);
        if (characterStyle != null) {
            characterStyle.updateDrawState(textPaint);
        }
    }

    public static final ArrayList A00(Layout.Alignment alignment, Layout layout, Spannable spannable, TextPaint textPaint, C57482kN c57482kN) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineStart = layout.getLineStart(i);
            String obj = spannable.subSequence(lineStart, layout.getLineEnd(i)).toString();
            if (TextUtils.isEmpty(obj)) {
                break;
            }
            characterInstance.setText(obj);
            while (true) {
                int next = characterInstance.next();
                if (next != -1) {
                    arrayList.add(new C69664Vt5(alignment, spannable, textPaint, c57482kN, layout.getLineBottom(i), layout.getLineTop(i), layout.getLineLeft(i), layout.getLineRight(i), layout.getLineBaseline(i), lineStart, lineStart + next, 0));
                }
            }
        }
        return arrayList;
    }
}
