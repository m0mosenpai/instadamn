package X;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.BJb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25332BJb {
    public static final BJY A00(int i) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            i2 = 6;
                        } else {
                            i2 = 4;
                        }
                    } else {
                        i2 = 5;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 1;
            }
        } else {
            i2 = 2;
        }
        return new BJY(i2);
    }

    public static final Integer A01(int i) {
        int i2;
        if (i == 5) {
            i2 = 33;
        } else if (i == 6) {
            i2 = 130;
        } else if (i == 3) {
            i2 = 17;
        } else if (i == 4) {
            i2 = 66;
        } else if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 1;
        } else {
            return null;
        }
        return Integer.valueOf(i2);
    }

    public static final boolean A02(Rect rect, View view, Integer num) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isFocused()) {
                return true;
            }
            if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
                if (rect != null) {
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    int intValue = num.intValue();
                    View findNextFocusFromRect = focusFinder.findNextFocusFromRect(viewGroup, rect, intValue);
                    if (findNextFocusFromRect != null) {
                        return findNextFocusFromRect.requestFocus(intValue, rect);
                    }
                    return view.requestFocus(intValue, rect);
                }
                if (view.hasFocus()) {
                    view2 = view.findFocus();
                } else {
                    view2 = null;
                }
                FocusFinder focusFinder2 = FocusFinder.getInstance();
                int intValue2 = num.intValue();
                View findNextFocus = focusFinder2.findNextFocus(viewGroup, view2, intValue2);
                if (findNextFocus != null) {
                    return findNextFocus.requestFocus(intValue2);
                }
                return view.requestFocus(intValue2);
            }
        }
        return view.requestFocus(num.intValue(), rect);
    }
}
