package com.instagram.common.ui.base;

import X.AbstractC14710oj;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56872jL;
import X.C05F;
import X.C14360o3;
import X.C2UX;
import X.InterfaceC693339t;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.facebook.R;

/* loaded from: classes3.dex */
public class IgSimpleAutoCompleteTextView extends AutoCompleteTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A01(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2UX.A00().AMO(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1I);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setCompletionHint(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        if (resourceId2 != 0) {
            setContentDescription(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setHint(context.getText(resourceId3));
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId4 != 0) {
            setImeActionLabel(context.getText(resourceId4), getImeActionId());
        }
        int resourceId5 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId5 != 0) {
            setText(context.getText(resourceId5));
        }
        int color = obtainStyledAttributes.getColor(0, R.color.baseline_neutral_80);
        AbstractC14710oj.A07(getContext(), null, this, C05F.A00);
        obtainStyledAttributes.recycle();
        setImeOptions(33554432 | getImeOptions());
        setEditableFactory(new Editable.Factory());
        if (Build.VERSION.SDK_INT >= 34 && ((Boolean) AbstractC56872jL.A01.getValue()).booleanValue()) {
            setLayerType(1, null);
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.textColorHint});
        C14360o3.A07(obtainStyledAttributes2);
        try {
            if (color == obtainStyledAttributes2.getColor(0, 0) || color == context.getColor(R.color.baseline_neutral_80)) {
                setHintTextColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text)));
            }
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        C2UX.A00().AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A01(context, attributeSet);
    }
}
