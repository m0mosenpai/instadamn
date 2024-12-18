package com.instagram.common.ui.base;

import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.C0fO;
import X.C13680mu;
import X.C14360o3;
import X.C2UX;
import X.InterfaceC693339t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class IgEditText extends EditText {
    public boolean A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context) {
        this(context, null, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C2UX.A00().AMO(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            Editable text = getText();
            C14360o3.A07(text);
            if (!C13680mu.A06(this, text)) {
                throw e;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (this.A00 && i == 4) {
            clearFocus();
            return false;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        C2UX.A00().AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2 == 0 ? R.style.EditTextStyle : i2);
        Typeface A02;
        C14360o3.A0B(context, 1);
        int inputType = getInputType();
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
        setInputType(inputType);
        setImeOptions(getImeOptions() | 33554432);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A16);
        C14360o3.A07(obtainStyledAttributes);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        this.A00 = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        Typeface typeface = getTypeface();
        Typeface typeface2 = getTypeface();
        if (typeface2 != null && typeface2.isBold()) {
            z = true;
        }
        if (AbstractC14710oj.A08()) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("IgdsPrismFontHelper.setPrismFont", 805611063);
            }
            int intValue = AbstractC14710oj.A04(typeface, z).intValue();
            if (intValue == 0) {
                A02 = AbstractC14710oj.A02(context);
            } else if (intValue != 1) {
                A02 = AbstractC14710oj.A00(context);
            } else {
                A02 = AbstractC14710oj.A01(context);
            }
            setTypeface(A02);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1985649994);
            }
        }
    }

    public /* synthetic */ IgEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? R.style.EditTextStyle : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
    }
}
