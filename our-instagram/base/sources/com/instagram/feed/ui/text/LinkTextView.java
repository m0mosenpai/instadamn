package com.instagram.feed.ui.text;

import X.AbstractC14710oj;
import X.AbstractC65977TxW;
import X.C05F;
import X.C0f9;
import X.C2UX;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class LinkTextView extends TextView {
    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence Cny;
        if (charSequence == null) {
            Cny = null;
        } else {
            Cny = C2UX.A00().Cny(-1, charSequence);
        }
        super.setText(Cny, bufferType);
    }

    public LinkTextView(Context context) {
        super(context);
        AbstractC14710oj.A07(context, null, this, C05F.A00);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-1518675000);
        Layout layout = getLayout();
        boolean z = true;
        if ((layout == null || !AbstractC65977TxW.A00(layout, motionEvent, this)) && !super.onTouchEvent(motionEvent)) {
            z = false;
        }
        C0f9.A0C(1375740748, A05);
        return z;
    }

    public LinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC14710oj.A07(context, null, this, C05F.A00);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC14710oj.A07(context, null, this, C05F.A00);
    }
}
