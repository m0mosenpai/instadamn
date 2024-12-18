package com.instagram.common.accessibility;

import X.AbstractC87043uM;
import X.AnonymousClass051;
import X.C115865Mc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes2.dex */
public class AccessibleTextView extends IgTextView {
    public C115865Mc A00;

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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.5Mc] */
    public AccessibleTextView(Context context) {
        super(context);
        this.A00 = new AbstractC87043uM(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.5Mc] */
    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new AbstractC87043uM(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3uM, X.5Mc] */
    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new AbstractC87043uM(this);
    }
}
