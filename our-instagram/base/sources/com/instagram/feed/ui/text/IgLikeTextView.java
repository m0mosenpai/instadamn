package com.instagram.feed.ui.text;

import X.AbstractC65977TxW;
import X.AbstractC87043uM;
import X.AnonymousClass051;
import X.C0f9;
import X.C87033uL;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes2.dex */
public class IgLikeTextView extends BulletAwareTextView {
    public C87033uL A00;

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A05(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) ((AnonymousClass051) this.A00).A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.3uL] */
    public IgLikeTextView(Context context) {
        super(context);
        this.A00 = new AbstractC87043uM(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(-726500127);
        Layout layout = getLayout();
        boolean z = false;
        if ((layout != null && !(layout.getText() instanceof String) && AbstractC65977TxW.A00(layout, motionEvent, this)) || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        C0f9.A0C(1462814487, A05);
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.3uL] */
    public IgLikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new AbstractC87043uM(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.3uL] */
    public IgLikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new AbstractC87043uM(this);
    }
}
