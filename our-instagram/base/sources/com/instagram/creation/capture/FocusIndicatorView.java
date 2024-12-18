package com.instagram.creation.capture;

import X.AbstractC31173DnH;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class FocusIndicatorView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    private final void setDrawable(int i) {
        AbstractC31173DnH.A0z(getContext(), this, i);
    }

    public final void A00() {
        setDrawable(R.drawable.ic_focus_failed);
    }

    public final void A01() {
        setDrawable(R.drawable.ic_focus_focusing);
    }

    public final void A02() {
        setDrawable(R.drawable.ic_focus_focused);
    }
}
