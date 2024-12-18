package com.instagram.business.instantexperiences.ui;

import X.R7U;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public class InstantExperiencesWebViewContainerLayout extends FrameLayout {
    public void setWebView(R7U r7u) {
        removeAllViews();
        addView(r7u);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesWebViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantExperiencesWebViewContainerLayout(Context context) {
        super(context);
    }
}
