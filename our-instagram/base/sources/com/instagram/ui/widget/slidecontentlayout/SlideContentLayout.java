package com.instagram.ui.widget.slidecontentlayout;

import X.AbstractC13560mi;
import X.C55952hg;
import X.C55982hj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class SlideContentLayout extends FrameLayout {
    public final C55952hg A00;
    public final Map A01;

    public static int A00(View view, SlideContentLayout slideContentLayout) {
        if (view.getMeasuredHeight() == 0) {
            slideContentLayout.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(slideContentLayout.getWidth(), Integer.MIN_VALUE), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + slideContentLayout.getPaddingTop() + slideContentLayout.getPaddingBottom();
    }

    public static void A01(C55982hj c55982hj, SlideContentLayout slideContentLayout, int i) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C55982hj c55982hj2 = (C55982hj) map.get(valueOf);
            c55982hj2.A0D.clear();
            c55982hj2.A01();
        }
        map.put(valueOf, c55982hj);
    }

    public static void A02(SlideContentLayout slideContentLayout, int i) {
        Map map = slideContentLayout.A01;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C55982hj c55982hj = (C55982hj) map.get(valueOf);
            if (c55982hj.A09.A00 != c55982hj.A01) {
                c55982hj.A08(1.0d, true);
            }
        }
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AbstractC13560mi.A00();
        this.A01 = new HashMap(4);
        setElevation(getResources().getDimension(R.dimen.abc_button_padding_horizontal_material));
    }

    public SlideContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideContentLayout(Context context) {
        this(context, null);
    }
}
