package androidx.appcompat.widget;

import X.InterfaceC71832X6p;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    public InterfaceC71832X6p A00;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC71832X6p interfaceC71832X6p) {
        this.A00 = interfaceC71832X6p;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
