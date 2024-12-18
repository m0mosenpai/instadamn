package com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout;

import X.C14360o3;
import X.C7OJ;
import X.InterfaceC163227Sh;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class ObservableVerticalOffsetConstraintLayout extends ConstraintLayout implements C7OJ {
    public InterfaceC163227Sh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        InterfaceC163227Sh interfaceC163227Sh = this.A00;
        if (interfaceC163227Sh != null) {
            interfaceC163227Sh.DWS();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC163227Sh interfaceC163227Sh = this.A00;
        if (interfaceC163227Sh != null) {
            interfaceC163227Sh.DWS();
        }
    }

    @Override // X.C7OJ
    public void setOffsetListener(InterfaceC163227Sh interfaceC163227Sh) {
        this.A00 = interfaceC163227Sh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableVerticalOffsetConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }
}
