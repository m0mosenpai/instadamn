package com.instagram.ui.widget.searchedittext;

import X.C14360o3;
import X.C36473G6x;
import X.GI0;
import X.GX3;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class SearchWithDeleteEditText extends SearchEditText {
    public GX3 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        setBackgroundResource(0);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // com.instagram.ui.widget.searchedittext.SearchEditText, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        GX3 gx3;
        C14360o3.A0B(keyEvent, 1);
        if (keyEvent.getKeyCode() == 67 && (gx3 = this.A00) != null) {
            C36473G6x c36473G6x = ((GI0) gx3).A00;
            Editable text = c36473G6x.A07.getText();
            if ((text == null || text.length() == 0) && (!c36473G6x.A08.isEmpty())) {
                View childAt = c36473G6x.A04.getChildAt((r1.getChildCount() - 2) - 1);
                C14360o3.A07(childAt);
                childAt.requestFocus();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void setOnDeleteKeyListener(GX3 gx3) {
        this.A00 = gx3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setBackgroundResource(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWithDeleteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        setBackgroundResource(0);
    }
}
