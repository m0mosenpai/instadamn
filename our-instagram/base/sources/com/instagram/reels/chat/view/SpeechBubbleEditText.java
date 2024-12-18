package com.instagram.reels.chat.view;

import X.C14360o3;
import X.C50744May;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;

/* loaded from: classes4.dex */
public final class SpeechBubbleEditText extends IgEditText {
    public final C50744May A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechBubbleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.EditTextStyle);
        C14360o3.A0B(context, 1);
        C50744May c50744May = new C50744May(context, context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width), 0, "");
        this.A00 = c50744May;
        setBackground(c50744May);
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.A00.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        return super.onPreDraw();
    }
}
