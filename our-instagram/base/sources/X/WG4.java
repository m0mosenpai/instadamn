package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class WG4 {
    public static final WG4 A00 = new Object();
    public static final InterfaceC09390do A04 = AbstractC09440dt.A01(C71783X4k.A00);
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(C71782X4j.A00);
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C71781X4i.A00);
    public static final Map A05 = AbstractC25233BEq.A0p(EnumC65748TtN.A05, EnumC68137VCy.A05, new C09530e4(EnumC65748TtN.A02, EnumC68137VCy.A02));
    public static final WeakHashMap A01 = new WeakHashMap();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r23, android.view.ViewGroup r24, X.C138756Qf r25, java.util.Map r26, float r27, int r28) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WG4.A01(android.content.Context, android.view.ViewGroup, X.6Qf, java.util.Map, float, int):void");
    }

    public static final void A02(Rect rect, RCTextView rCTextView, int i) {
        Layout layout = rCTextView.A02;
        C14360o3.A07(layout);
        TextPaint paint = layout.getPaint();
        C14360o3.A07(paint);
        CharSequence subSequence = rCTextView.A03.subSequence(layout.getLineStart(i), layout.getLineVisibleEnd(i));
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(subSequence, 0, subSequence.length(), rect);
        } else {
            paint.getTextBounds(subSequence.toString(), 0, subSequence.length(), rect);
        }
        rect.top += layout.getLineBaseline(i);
        rect.bottom += layout.getLineBaseline(i);
    }

    public static final boolean A04(Rect rect, Rect rect2, int i) {
        boolean A1Q = AbstractC167007dF.A1Q(Math.max(rect.left, rect2.left), Math.min(rect.right, rect2.right) - i);
        boolean A1Q2 = AbstractC167007dF.A1Q(Math.max(rect.top, rect2.top), Math.min(rect.bottom, rect2.bottom) - i);
        if (A1Q && A1Q2) {
            return true;
        }
        return false;
    }

    private final C65782Tu0 A00(View view, EnumC65748TtN enumC65748TtN) {
        RCTextView rCTextView;
        Layout layout;
        int hashCode = view.hashCode();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
        boolean isShown = view.isShown();
        Integer num = null;
        if ((view instanceof RCTextView) && (rCTextView = (RCTextView) view) != null && (layout = rCTextView.A02) != null) {
            num = Integer.valueOf(layout.getLineCount());
        }
        return new C65782Tu0(rect, enumC65748TtN, num, hashCode, isShown ? 1 : 0);
    }

    public static final void A03(ViewGroup viewGroup, WG4 wg4, List list) {
        if (viewGroup.getChildCount() == 0) {
            list.add(viewGroup);
        }
        int i = 0;
        int childCount = viewGroup.getChildCount();
        if (childCount < 0) {
            return;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof ViewGroup) {
                    A03((ViewGroup) childAt, wg4, list);
                } else {
                    list.add(childAt);
                }
            }
            if (i != childCount) {
                i++;
            } else {
                return;
            }
        }
    }
}
