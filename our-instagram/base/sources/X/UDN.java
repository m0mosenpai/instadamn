package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.facebook.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class UDN extends UB7 {
    public final Rect A00;
    public final AccessibilityManager A01;
    public final WPW A02;

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.A01;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.A02.show();
        } else {
            super.showDropDown();
        }
    }

    public UDN(Context context, AttributeSet attributeSet) {
        super(C65K.A00(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.A00 = new Rect();
        Context context2 = getContext();
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0I, new int[0], R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        if (A00.hasValue(0) && A00.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.A01 = (AccessibilityManager) context2.getSystemService("accessibility");
        WPW wpw = new WPW(context2, null, R.attr.listPopupWindowStyle, 0);
        this.A02 = wpw;
        wpw.A0D = true;
        PopupWindow popupWindow = wpw.A09;
        popupWindow.setFocusable(true);
        wpw.A06 = this;
        popupWindow.setInputMethodMode(2);
        wpw.EPH(getAdapter());
        wpw.A07 = new C70256WOb(this, 2);
        A00.recycle();
    }

    public static void A00(UDN udn, Object obj) {
        udn.setText(udn.convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) parent;
                if (textInputLayout != null && textInputLayout.A0S) {
                    return textInputLayout.getHint();
                }
            } else {
                parent = parent.getParent();
            }
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1092605867);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) parent;
                if (textInputLayout != null && textInputLayout.A0S && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
                    setHint("");
                }
            } else {
                parent = parent.getParent();
            }
        }
        C0f9.A0D(-1693425961, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        TextInputLayout textInputLayout;
        int i3;
        int selectedItemPosition;
        int A06 = C0f9.A06(-1918274620);
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            ViewParent parent = getParent();
            while (true) {
                if (parent != null) {
                    if (parent instanceof TextInputLayout) {
                        textInputLayout = (TextInputLayout) parent;
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    textInputLayout = null;
                    break;
                }
            }
            int i4 = 0;
            if (adapter != null && textInputLayout != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                WPW wpw = this.A02;
                PopupWindow popupWindow = wpw.A09;
                if (!popupWindow.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = wpw.A0A.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, textInputLayout);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = popupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.A00;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i3 = i5 + textInputLayout.A1D.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
        C0f9.A0D(-212555100, A06);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.A02.EPH(getAdapter());
    }
}
