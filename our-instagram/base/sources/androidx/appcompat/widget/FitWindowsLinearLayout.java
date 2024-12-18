package androidx.appcompat.widget;

import X.InterfaceC71832X6p;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class FitWindowsLinearLayout extends LinearLayout {
    public InterfaceC71832X6p A00;

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public void setOnFitSystemWindowsListener(InterfaceC71832X6p interfaceC71832X6p) {
        this.A00 = interfaceC71832X6p;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
