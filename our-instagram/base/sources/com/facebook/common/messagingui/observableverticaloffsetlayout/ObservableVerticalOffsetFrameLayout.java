package com.facebook.common.messagingui.observableverticaloffsetlayout;

import X.C7OJ;
import X.InterfaceC163227Sh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class ObservableVerticalOffsetFrameLayout extends FrameLayout implements C7OJ {
    public InterfaceC163227Sh A00;

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        InterfaceC163227Sh interfaceC163227Sh = this.A00;
        if (interfaceC163227Sh != null) {
            interfaceC163227Sh.DWS();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC163227Sh interfaceC163227Sh = this.A00;
        if (interfaceC163227Sh != null) {
            interfaceC163227Sh.DWS();
        }
    }

    public ObservableVerticalOffsetFrameLayout(Context context) {
        super(context);
    }

    @Override // X.C7OJ
    public void setOffsetListener(InterfaceC163227Sh interfaceC163227Sh) {
        this.A00 = interfaceC163227Sh;
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ObservableVerticalOffsetFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
