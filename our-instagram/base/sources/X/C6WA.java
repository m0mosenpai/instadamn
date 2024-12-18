package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6WA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WA extends C6WB {
    public final C6FG A00;
    public final C102884kP A01;
    public final C102884kP A02;
    public final InterfaceC103384lE A03;
    public final boolean A04;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Object obj;
        C14360o3.A0B(view, 0);
        C6FX c6fx = new C6FX();
        c6fx.A03(this.A02, 0);
        if (this.A04 && (view instanceof RCTextView)) {
            RCTextView rCTextView = (RCTextView) view;
            CharSequence charSequence = rCTextView.A03;
            C14360o3.A0C(charSequence, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) charSequence;
            Layout layout = rCTextView.A02;
            C14360o3.A07(layout);
            double spanStart = spanned.getSpanStart(this);
            double spanEnd = spanned.getSpanEnd(this);
            int i = (int) spanStart;
            double primaryHorizontal = layout.getPrimaryHorizontal(i);
            double primaryHorizontal2 = layout.getPrimaryHorizontal((int) spanEnd);
            int lineForOffset = layout.getLineForOffset(i);
            Rect rect = new Rect();
            layout.getLineBounds(lineForOffset, rect);
            RectF rectF = new RectF(rect);
            float paddingBottom = rectF.left + ((float) (((rCTextView.getPaddingBottom() + primaryHorizontal) - rCTextView.getScrollX()) + rCTextView.A00));
            rectF.left = paddingBottom;
            rectF.right = (float) ((paddingBottom + primaryHorizontal2) - primaryHorizontal);
            rectF.top += r1;
            rectF.bottom += r1;
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset(rCTextView.getLeft(), rCTextView.getTop());
            obj = new CS8(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
        } else {
            obj = this.A00;
        }
        c6fx.A02(obj);
        C6FP.A03(this.A00, this.A01, new C6FW(c6fx.A00), this.A03);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    public C6WA(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2, InterfaceC103384lE interfaceC103384lE, String str, String str2, boolean z) {
        super.A00 = str;
        super.A01 = str2;
        this.A03 = interfaceC103384lE;
        this.A02 = c102884kP;
        this.A01 = c102884kP2;
        this.A00 = c6fg;
        this.A04 = z;
    }
}
