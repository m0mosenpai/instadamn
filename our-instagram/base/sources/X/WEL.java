package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes11.dex */
public abstract class WEL {
    public static final int[] A03 = new int[2];
    public static final Rect A01 = new Rect();
    public static final RectF A02 = new RectF();
    public static final Path A00 = new Path();

    public static final void A01(Layout layout, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Spanned spanned;
        C14360o3.A0B(accessibilityNodeInfoCompat, 0);
        if (layout != null) {
            CharSequence text = layout.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                C0s6 A002 = AbstractC13190m5.A00(spanned.getSpans(0, spanned.length(), ClickableSpan.class));
                while (A002.hasNext()) {
                    accessibilityNodeInfoCompat.mInfo.addChild(view, spanned.getSpanStart(A002.next()));
                }
            }
        }
    }

    public static final void A02(Layout layout, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Spanned spanned;
        AbstractC167007dF.A1D(accessibilityNodeInfoCompat, 1, view);
        if (layout != null) {
            CharSequence text = layout.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    ClickableSpan clickableSpan = clickableSpanArr[0];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    boolean A1S = MSY.A1S(lineForOffset, layout.getLineForOffset(spanEnd));
                    accessibilityNodeInfoCompat.setParent(view);
                    if (clickableSpan instanceof AbstractC85223rD) {
                        AbstractC85223rD abstractC85223rD = (AbstractC85223rD) clickableSpan;
                        CharSequence charSequence = abstractC85223rD.A02;
                        if (charSequence == null) {
                            charSequence = spanned.subSequence(spanStart, spanEnd);
                        }
                        accessibilityNodeInfoCompat.setContentDescription(charSequence);
                        Integer num = abstractC85223rD.A01;
                        if (num == null) {
                            num = C05F.A01;
                        }
                        accessibilityNodeInfoCompat.setClassName(AbstractC58462m5.A00(num));
                        C012804r c012804r = abstractC85223rD.A00;
                        if (c012804r != null) {
                            accessibilityNodeInfoCompat.addAction(c012804r);
                        }
                    } else {
                        accessibilityNodeInfoCompat.setContentDescription(spanned.subSequence(spanStart, spanEnd));
                    }
                    accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                    if (A1S) {
                        spanEnd = layout.getLineVisibleEnd(lineForOffset);
                    }
                    Path path = A00;
                    layout.getSelectionPath(spanStart, spanEnd, path);
                    RectF rectF = A02;
                    path.computeBounds(rectF, true);
                    int[] iArr = A03;
                    view.getLocationOnScreen(iArr);
                    int paddingLeft = iArr[0] + view.getPaddingLeft();
                    int paddingTop = iArr[1] + view.getPaddingTop();
                    Rect rect = A01;
                    rect.set(((int) rectF.left) + paddingLeft, ((int) rectF.top) + paddingTop, paddingLeft + ((int) rectF.right), paddingTop + ((int) rectF.bottom));
                    accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.setEnabled(true);
                }
            }
        }
    }

    public static final int A00(Layout layout, int i, int i2) {
        Spanned spanned;
        ClickableSpan clickableSpan;
        if (layout != null) {
            CharSequence text = layout.getText();
            if ((text instanceof Spanned) && (spanned = (Spanned) text) != null && i2 >= layout.getLineTop(0) && i2 < layout.getLineBottom(layout.getLineCount() - 1)) {
                int lineForVertical = layout.getLineForVertical(i2);
                float f = i;
                if (f >= layout.getLineLeft(lineForVertical) && f <= layout.getLineRight(lineForVertical)) {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr.length != 0 && (clickableSpan = clickableSpanArr[0]) != null) {
                        CharSequence text2 = layout.getText();
                        C14360o3.A0C(text2, "null cannot be cast to non-null type android.text.Spanned");
                        return ((Spanned) text2).getSpanStart(clickableSpan);
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
}
