package com.facebook.browser.lite.views;

import X.C63950SwP;
import X.InterfaceC65200Tfi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes10.dex */
public class BrowserLiteErrorScreen extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public InterfaceC65200Tfi A02;

    public boolean getDisplayed() {
        return false;
    }

    public String getUserAction() {
        return null;
    }

    public final void A00() {
        C63950SwP c63950SwP = (C63950SwP) this.A02;
        c63950SwP.A01 = 0;
        c63950SwP.A00 = 0;
        Runnable runnable = c63950SwP.A03;
        if (runnable != null) {
            c63950SwP.A02.removeCallbacks(runnable);
        }
    }

    public void setAutoRetryController(InterfaceC65200Tfi interfaceC65200Tfi) {
        this.A02 = interfaceC65200Tfi;
    }

    public BrowserLiteErrorScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrowserLiteErrorScreen(Context context) {
        super(context, null);
    }
}
