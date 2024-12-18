package com.instagram.direct.messagethread.util.text;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC43592JPx;
import X.AbstractC85253rG;
import X.C0f9;
import X.C14360o3;
import X.C44385JjO;
import X.C57482kN;
import X.InterfaceC16660sJ;
import X.ViewOnClickListenerC48068LPt;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class ExpandableTextView extends IgTextView {
    public int A00;
    public CharSequence A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = "";
    }

    public final void setText(Spanned spanned, CharSequence charSequence, int i, int i2, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        int width;
        AbstractC167007dF.A1K(spanned, charSequence);
        this.A01 = spanned;
        ViewOnClickListenerC48068LPt viewOnClickListenerC48068LPt = new ViewOnClickListenerC48068LPt(22, this, interfaceC16660sJ, spanned);
        SpannableString A07 = AbstractC43592JPx.A07(charSequence);
        A07.setSpan(new C44385JjO(viewOnClickListenerC48068LPt, i), 0, charSequence.length(), 17);
        this.A00 = A07.length() + 2;
        SpannableString A072 = AbstractC43592JPx.A07(spanned);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append((Object) "…");
        A1C.append(' ');
        SpannableStringBuilder append = AbstractC25225BEi.A0H(A1C.toString()).append((CharSequence) A07);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextPaint paint = getPaint();
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        if (getWidth() == 0 && num != null) {
            width = num.intValue();
        } else {
            width = getWidth();
        }
        setText(AbstractC25225BEi.A0H(AbstractC85253rG.A00(A072, new C57482kN(alignment, paint, null, lineSpacingExtra, lineSpacingMultiplier, width, false), append, i2)));
        if ((getMovementMethod() == null || !(getMovementMethod() instanceof LinkMovementMethod)) && getLinksClickable()) {
            AbstractC25227BEk.A11(this);
        }
    }

    public static /* synthetic */ void setText$default(ExpandableTextView expandableTextView, Spanned spanned, CharSequence charSequence, int i, int i2, Integer num, InterfaceC16660sJ interfaceC16660sJ, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            interfaceC16660sJ = null;
        }
        expandableTextView.setText(spanned, charSequence, i, i2, num, interfaceC16660sJ);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-1844213353);
        super.onTouchEvent(motionEvent);
        boolean z = false;
        if (motionEvent == null) {
            i = -68444441;
        } else {
            if (!C14360o3.A0K(getText(), this.A01) && getOffsetForPosition(motionEvent.getX(), motionEvent.getY()) >= getText().length() - this.A00) {
                z = true;
            }
            i = 1380071163;
        }
        C0f9.A0C(i, A05);
        return z;
    }
}
