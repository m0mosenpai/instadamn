package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Bwv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27071Bwv extends IgTextView implements InterfaceC30786DgN {
    public int A00;
    public C6UR A01;
    public String A02;
    public final View A03;
    public final InterfaceC02550Ad A04;
    public final C9BA A05;
    public final C9CI A06;
    public final String A07;
    public final String A08;

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        CharSequence text = getText();
        int i2 = 0;
        if (i == 0) {
            if (text != null && text.length() != 0) {
                ViewTreeObserverOnPreDrawListenerC139186Rz[] viewTreeObserverOnPreDrawListenerC139186RzArr = (ViewTreeObserverOnPreDrawListenerC139186Rz[]) C4GL.A06(new SpannableString(getText()), ViewTreeObserverOnPreDrawListenerC139186Rz.class);
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                int length = viewTreeObserverOnPreDrawListenerC139186RzArr.length;
                while (i2 < length) {
                    viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC139186RzArr[i2]);
                    i2++;
                }
                return;
            }
            return;
        }
        if (text != null && text.length() != 0) {
            ViewTreeObserverOnPreDrawListenerC139186Rz[] viewTreeObserverOnPreDrawListenerC139186RzArr2 = (ViewTreeObserverOnPreDrawListenerC139186Rz[]) C4GL.A06(new SpannableString(getText()), ViewTreeObserverOnPreDrawListenerC139186Rz.class);
            ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
            int length2 = viewTreeObserverOnPreDrawListenerC139186RzArr2.length;
            while (i2 < length2) {
                viewTreeObserver2.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC139186RzArr2[i2]);
                i2++;
            }
        }
    }

    public void setOnTruncationClickListener(C6UR c6ur) {
        C14360o3.A0B(c6ur, 0);
        this.A01 = c6ur;
    }

    private final int A00(String str) {
        int measureText;
        if (this.A05.A02) {
            int i = 0;
            List A0R = AbstractC001900j.A0R(str, new String[]{"\n"}, 0);
            int i2 = 0;
            for (Object obj : A0R) {
                int i3 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str2 = (String) obj;
                if (str2.length() > 0) {
                    if (i < A0R.size() - 1) {
                        measureText = Math.max(getActualViewWidth(), (int) getPaint().measureText(str2));
                    } else {
                        measureText = (int) getPaint().measureText(str2);
                    }
                    i2 += measureText;
                }
                i = i3;
            }
            return i2;
        }
        Rect rect = new Rect();
        TextPaint paint = getPaint();
        C14360o3.A0B(str, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    public static final Integer A01(String str) {
        int i;
        String A0d = AbstractC002300n.A0d(str, "#", "", false);
        int length = A0d.length();
        if (length < 6) {
            return null;
        }
        int parseInt = Integer.parseInt(AbstractC25227BEk.A0w(A0d, 0, 2), 16);
        int parseInt2 = Integer.parseInt(AbstractC25227BEk.A0w(A0d, 2, 4), 16);
        int parseInt3 = Integer.parseInt(AbstractC25227BEk.A0w(A0d, 4, 6), 16);
        if (length == 8) {
            i = Integer.parseInt(AbstractC25227BEk.A0w(A0d, 6, 8), 16);
        } else {
            i = 255;
        }
        return Integer.valueOf(Color.argb(i, parseInt, parseInt2, parseInt3));
    }

    private final int getActualViewWidth() {
        return (this.A00 - getPaddingStart()) - getPaddingEnd();
    }

    public C27071Bwv(Context context, InterfaceC02550Ad interfaceC02550Ad, C9BA c9ba, C9CI c9ci, String str, String str2) {
        super(context);
        EnumC15950qp enumC15950qp;
        int i;
        this.A06 = c9ci;
        this.A05 = c9ba;
        this.A04 = interfaceC02550Ad;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = this;
        this.A02 = "";
        AbstractC13880nE.A03(context, ((C26011Bez) c9ci.A04).A00);
        int A01 = C1H4.A01(AbstractC13880nE.A00(context, 8.0f));
        int A012 = C1H4.A01(AbstractC13880nE.A00(context, 4.0f));
        setPadding(A01, A012, A01, A012);
        setTextSize(((C26011Bez) this.A06.A04).A00);
        Integer num = ((C26011Bez) this.A06.A04).A05;
        C15980qs A00 = AbstractC15960qq.A00(context);
        int intValue = num.intValue();
        if (intValue != 4) {
            if (intValue != 2 && intValue != 0) {
                if (intValue != 3 && intValue != 1) {
                    throw B4Z.A00();
                }
                enumC15950qp = EnumC15950qp.A0u;
            } else {
                enumC15950qp = EnumC15950qp.A0t;
            }
        } else {
            enumC15950qp = EnumC15950qp.A0X;
        }
        Typeface A02 = A00.A02(enumC15950qp);
        if (A02 == null) {
            A02 = Typeface.DEFAULT;
            C14360o3.A08(A02);
        }
        setTypeface(A02);
        Integer A013 = A01(((C26011Bez) this.A06.A04).A09);
        if (A013 != null) {
            i = A013.intValue();
        } else {
            i = -16777216;
        }
        setTextColor(i);
        Integer num2 = ((C26011Bez) this.A06.A04).A04;
        C14360o3.A0B(num2, 0);
        int intValue2 = num2.intValue();
        int i2 = 3;
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 != 2) {
                    throw B4Z.A00();
                }
            } else {
                i2 = 4;
            }
        } else {
            i2 = 2;
        }
        setTextAlignment(i2);
        Integer num3 = ((C26011Bez) this.A06.A04).A07;
        if (num3 != null) {
            setMaxLines(num3.intValue());
        }
        Float f = ((C26011Bez) this.A06.A04).A02;
        float f2 = 1.0f;
        if (f != null) {
            float floatValue = f.floatValue();
            if (floatValue != 0.0f) {
                f2 = floatValue;
            }
        }
        setLineSpacing(0.0f, f2);
        setText(this.A06.A06);
    }

    private final boolean A02() {
        Layout layout = getLayout();
        if (layout != null) {
            if (layout.getLineCount() <= getMaxLines()) {
                CharSequence text = getText();
                C14360o3.A07(text);
                if (text.length() > 0) {
                    String str = this.A06.A06;
                    C14360o3.A0B(str, 0);
                    int length = str.length();
                    String obj = getText().toString();
                    C14360o3.A0B(obj, 0);
                    if (length > obj.length()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public C9CI getSpec() {
        return this.A06;
    }

    public View getView() {
        return this.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27071Bwv.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1418704241);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = i;
        C0f9.A0D(-1091672443, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(797860231);
        if (getLayout() != null && motionEvent != null) {
            int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
            if (getText() != null && (getText() instanceof Spanned)) {
                CharSequence text = getText();
                C14360o3.A0C(text, AbstractC111324zv.A00(2773));
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                C14360o3.A0A(clickableSpanArr);
                if (clickableSpanArr.length != 0) {
                    if (motionEvent.getAction() == 0) {
                        C0f9.A0C(-134106313, A05);
                        return true;
                    }
                    if (motionEvent.getAction() == 1) {
                        clickableSpanArr[0].onClick(this);
                    } else {
                        i = -387725092;
                        C0f9.A0C(i, A05);
                        return false;
                    }
                }
            }
        }
        i = -1442312072;
        C0f9.A0C(i, A05);
        return false;
    }
}
