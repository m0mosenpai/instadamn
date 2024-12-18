package com.instagram.ui.widget.search;

import X.XBQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public class ImeBackButtonHandlerFrameLayout extends FrameLayout {
    public XBQ A00;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        XBQ xbq = this.A00;
        if (xbq != null) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (!((SearchController) xbq).A06 && keyDispatcherState != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    return xbq.onBackPressed();
                }
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setBackListener(XBQ xbq) {
        this.A00 = xbq;
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ImeBackButtonHandlerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImeBackButtonHandlerFrameLayout(Context context) {
        this(context, null);
    }
}
