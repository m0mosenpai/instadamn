package com.facebook.smartcapture.ui;

import X.C14360o3;
import X.C44427JkQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public class PhotoRequirementsView extends FrameLayout {
    public View A00;
    public C44427JkQ A01;
    public boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoRequirementsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    public final View getSheetContainer() {
        return this.A00;
    }

    public final void setSheetContainer(View view) {
        this.A00 = view;
    }
}
