package com.instagram.creation.base.ui.mediatabbar;

import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC16960so;
import X.AbstractC43592JPx;
import X.AbstractC53242c7;
import X.AbstractC56952jT;
import X.AbstractC58452m4;
import X.C00O;
import X.C05F;
import X.C14360o3;
import X.JQ0;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class MediaTabBar extends LinearLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final ArgbEvaluator A05;
    public final Paint A06;
    public final List A07;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float A07 = this.A00 * AbstractC166987dD.A07(this);
        List list = this.A07;
        float size = A07 / list.size();
        float A08 = AbstractC166987dD.A08(this);
        Paint paint = this.A06;
        float strokeWidth = A08 - (paint.getStrokeWidth() / 2.0f);
        canvas.drawLine(size, strokeWidth, size + (getWidth() / list.size()), strokeWidth, paint);
    }

    public final void setTabs(List list, View.OnClickListener onClickListener) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.media_tab_bar_tab, (ViewGroup) this, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setTag(tab);
            textView.setText(getResources().getString(tab.A01));
            textView.setOnClickListener(onClickListener);
            AbstractC56952jT.A04(textView, C05F.A01);
            addView(textView);
            this.A07.add(textView);
        }
        List list2 = this.A07;
        C14360o3.A0B(list2, 0);
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            View view = (View) obj;
            int size = list2.size();
            C14360o3.A0B(view, 0);
            AbstractC58452m4.A00(view, i2, size, false);
            i = i2;
        }
    }

    public /* synthetic */ MediaTabBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public MediaTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = AbstractC166987dD.A1E();
        this.A03 = -1;
        setOrientation(0);
        Resources resources = getResources();
        this.A04 = AbstractC13620mo.A02(getContext());
        this.A05 = new ArgbEvaluator();
        if (context != null) {
            this.A02 = AbstractC53242c7.A0F(context, R.attr.mediaTabTextColor);
            this.A01 = AbstractC53242c7.A0F(context, R.attr.mediaTabTextColorSelected);
            int A0B = AbstractC166997dE.A0B(resources);
            Paint A0R = AbstractC166987dD.A0R();
            this.A06 = A0R;
            AbstractC43592JPx.A1E(A0R);
            A0R.setStrokeWidth(A0B);
            A0R.setColor(this.A01);
            setWillNotDraw(false);
            AbstractC56952jT.A04(this, C05F.A05);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public MediaTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaTabBar(Context context) {
        this(context, null, 0);
    }
}
