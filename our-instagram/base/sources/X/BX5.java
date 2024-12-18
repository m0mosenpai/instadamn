package X;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class BX5 implements C2YT {
    public final BX4 A00;
    public final CharSequence A01;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        TextView textView;
        Integer num;
        int measuredWidth;
        int intValue;
        C14360o3.A0B(c2yr, 0);
        int A01 = AbstractC78603fS.A01(j);
        int A00 = AbstractC78603fS.A00(j);
        CharSequence charSequence = this.A01;
        Context context = c2yr.A00.A04;
        try {
            textView = new EditText(context, null);
            textView.setBackgroundResource(R.color.transparent);
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message != null && AbstractC001900j.A0a(message, "ConstantState.newDrawable", false)) {
                View inflate = LayoutInflater.from(context).inflate(com.facebook.R.layout.fallback_text_input_view_for_measure, (ViewGroup) null, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputViewForMeasure");
                textView = (TextView) inflate;
            } else {
                throw e;
            }
        }
        BX4 bx4 = this.A00;
        Integer num2 = bx4.A0J;
        if (num2 != null && (intValue = num2.intValue()) > -1) {
            textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(intValue)});
        }
        if (charSequence == null) {
            charSequence = bx4.A09;
        }
        textView.setText(charSequence);
        textView.setHint(bx4.A08);
        Integer num3 = bx4.A0F;
        if (num3 != null) {
            textView.setGravity(num3.intValue());
        }
        Rect rect = bx4.A00;
        if (rect != null) {
            textView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        BXN bxn = bx4.A07;
        if (bxn != null) {
            textView.setTextSize(bxn.A01, bxn.A00);
        }
        Float f = bx4.A0B;
        Float f2 = bx4.A0A;
        float lineSpacingExtra = textView.getLineSpacingExtra();
        float lineSpacingMultiplier = textView.getLineSpacingMultiplier();
        if (f != null) {
            float floatValue = f.floatValue();
            float fontMetrics = textView.getPaint().getFontMetrics(null);
            if (floatValue == fontMetrics) {
                lineSpacingExtra = 0.0f;
            } else {
                lineSpacingExtra = floatValue - fontMetrics;
            }
        }
        if (f2 != null) {
            lineSpacingMultiplier = f2.floatValue();
        }
        textView.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        Float f3 = bx4.A0C;
        if (f3 != null) {
            textView.setLetterSpacing(f3.floatValue());
        }
        BXL bxl = bx4.A06;
        if (bxl != null) {
            num = Integer.valueOf(bxl.A00());
        } else {
            num = null;
        }
        BXC bxc = bx4.A04;
        boolean z = bx4.A0R;
        int A002 = BX3.A00(bxc, num, z);
        textView.setInputType(A002);
        Integer num4 = bx4.A0H;
        if (num4 != null) {
            textView.setMaxLines(num4.intValue());
        }
        if (z && !BXE.A02(A002)) {
            textView.setSingleLine(true);
        }
        Typeface typeface = bx4.A01;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        textView.measure(A01, A00);
        if (View.MeasureSpec.getMode(A01) == Integer.MIN_VALUE) {
            measuredWidth = View.MeasureSpec.getSize(A01);
        } else {
            measuredWidth = textView.getMeasuredWidth();
        }
        return new C2YU(AbstractC78673fZ.A00(measuredWidth, textView.getMeasuredHeight()), null);
    }

    public BX5(BX4 bx4, CharSequence charSequence) {
        this.A00 = bx4;
        this.A01 = charSequence;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
