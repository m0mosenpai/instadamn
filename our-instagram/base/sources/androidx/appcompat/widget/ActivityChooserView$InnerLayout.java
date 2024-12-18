package androidx.appcompat.widget;

import X.C53122bu;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] A00 = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes(attributeSet, A00));
        setBackgroundDrawable(c53122bu.A02(0));
        c53122bu.A02.recycle();
    }
}
