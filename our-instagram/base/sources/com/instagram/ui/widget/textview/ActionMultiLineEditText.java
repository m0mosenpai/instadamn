package com.instagram.ui.widget.textview;

import X.C14360o3;
import X.C2UX;
import X.InterfaceC693339t;
import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes4.dex */
public final class ActionMultiLineEditText extends IgEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context) {
        super(context, null, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    @Override // com.instagram.common.ui.base.IgEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = editorInfo.imeOptions;
        if ((1073741824 & i) != 0) {
            editorInfo.imeOptions = i & (-1073741825);
        }
        C2UX.A00().AMO(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // com.instagram.common.ui.base.IgEditText, android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        C2UX.A00().AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMultiLineEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
        InterfaceC693339t A00 = C2UX.A00();
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }
}
