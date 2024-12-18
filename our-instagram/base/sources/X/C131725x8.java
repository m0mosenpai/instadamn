package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* renamed from: X.5x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131725x8 extends C2Y4 {
    public C02V A00;
    public final /* synthetic */ RCTextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131725x8(RCTextView rCTextView) {
        super(rCTextView);
        this.A01 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    @Override // X.C2Y4
    public final int A0a(float f, float f2) {
        RCTextView rCTextView = this.A01;
        CharSequence charSequence = rCTextView.A03;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            while (true) {
                ClickableSpan[] clickableSpanArr = rCTextView.A06;
                if (i >= clickableSpanArr.length) {
                    break;
                }
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                int A00 = RCTextView.A00(rCTextView, (int) f, (int) f2);
                if (A00 >= spanStart && A00 <= spanEnd) {
                    return i;
                }
                i++;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.C2Y4
    public final void A0e(int i, boolean z) {
        RCTextView rCTextView = this.A01;
        if (rCTextView.A06[i] instanceof C6WB) {
            rCTextView.invalidate();
        }
    }

    @Override // X.C2Y4
    public final void A0h(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        int lineVisibleEnd;
        RCTextView rCTextView = this.A01;
        Spanned spanned = (Spanned) rCTextView.A03;
        Rect rect = new Rect();
        ClickableSpan[] clickableSpanArr = rCTextView.A06;
        if (clickableSpanArr != null && i < clickableSpanArr.length) {
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = rCTextView.A02.getLineForOffset(spanStart);
            int lineForOffset2 = rCTextView.A02.getLineForOffset(spanEnd);
            Path path = new Path();
            RectF rectF = new RectF();
            if (lineForOffset == lineForOffset2) {
                lineVisibleEnd = spanEnd;
            } else {
                lineVisibleEnd = rCTextView.A02.getLineVisibleEnd(lineForOffset);
            }
            rCTextView.A02.getSelectionPath(spanStart, lineVisibleEnd, path);
            path.computeBounds(rectF, true);
            rectF.offset(rCTextView.A00, rCTextView.A01);
            rectF.round(rect);
            accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.mInfo.setFocusable(true);
            accessibilityNodeInfoCompat.setEnabled(true);
            accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
            accessibilityNodeInfoCompat.mInfo.setText(spanned.subSequence(spanStart, spanEnd));
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
            if (clickableSpan instanceof C6WB) {
                C6WB c6wb = (C6WB) clickableSpan;
                String str = c6wb.A00;
                String str2 = c6wb.A01;
                if (str2 == null) {
                    str2 = "Link";
                }
                if (str != null) {
                    accessibilityNodeInfoCompat.setContentDescription(str);
                }
                AbstractC68324VMk.A00(rCTextView.getContext(), null, accessibilityNodeInfoCompat, str2);
                return;
            }
            return;
        }
        accessibilityNodeInfoCompat.mInfo.setText("");
        accessibilityNodeInfoCompat.mInfo.setBoundsInParent(rect);
    }

    @Override // X.C2Y4
    public final void A0i(List list) {
        ClickableSpan[] clickableSpanArr = this.A01.A06;
        if (clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            for (int i = 0; i < length; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    @Override // X.C2Y4
    public final boolean A0m(int i, int i2, Bundle bundle) {
        if (i2 == 16) {
            RCTextView rCTextView = this.A01;
            rCTextView.A06[i].onClick(rCTextView);
            return true;
        }
        return false;
    }

    @Override // X.C02V
    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence textForAccessibility;
        super.A0T(view, accessibilityEvent);
        RCTextView rCTextView = this.A01;
        if (!TextUtils.isEmpty(rCTextView.A03)) {
            List<CharSequence> text = accessibilityEvent.getText();
            textForAccessibility = rCTextView.getTextForAccessibility();
            text.add(textForAccessibility);
        }
    }

    @Override // X.C2Y4, X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence textForAccessibility;
        super.A0Y(view, accessibilityNodeInfoCompat);
        textForAccessibility = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(textForAccessibility)) {
            accessibilityNodeInfoCompat.mInfo.setText(textForAccessibility);
            accessibilityNodeInfoCompat.addAction(256);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.mInfo.setMovementGranularities(31);
            accessibilityNodeInfoCompat.addAction(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        }
        C02V c02v = this.A00;
        if (c02v != null) {
            c02v.A0Y(view, accessibilityNodeInfoCompat);
        }
    }
}
