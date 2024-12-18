package com.instagram.creation.photo.edit.ui.util;

import X.AbstractC166987dD;
import X.C14360o3;
import X.ViewOnClickListenerC48063LPo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* loaded from: classes8.dex */
public final class IgMultiListenerSimpleImageView extends IgSimpleImageView {
    public View.OnClickListener A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166987dD.A1E();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        super.setOnClickListener(new ViewOnClickListenerC48063LPo(this, 54));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166987dD.A1E();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166987dD.A1E();
    }
}
