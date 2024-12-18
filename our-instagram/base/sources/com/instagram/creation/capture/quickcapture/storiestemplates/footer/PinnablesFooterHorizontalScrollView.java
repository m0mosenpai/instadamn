package com.instagram.creation.capture.quickcapture.storiestemplates.footer;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C34582FLr;
import X.EZK;
import X.ViewOnClickListenerC35684FpJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PinnablesFooterHorizontalScrollView extends HorizontalScrollView {
    public final IgLinearLayout A00;
    public final Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = AbstractC166987dD.A1I();
        LayoutInflater.from(context).inflate(R.layout.pinnables_footer_horizontal_scroll_view, (ViewGroup) this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.pinnables_footer_linear_layout);
    }

    public final void setButtons(List list) {
        C14360o3.A0B(list, 0);
        IgLinearLayout igLinearLayout = this.A00;
        igLinearLayout.removeAllViews();
        Map map = this.A01;
        map.clear();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C34582FLr c34582FLr = (C34582FLr) it.next();
            EZK ezk = new EZK(AbstractC166997dE.A0L(this));
            ezk.setId(i);
            ezk.setLabel(c34582FLr.A01);
            ezk.setIcon(c34582FLr.A00);
            ezk.setOnClickListener(new ViewOnClickListenerC35684FpJ(11, c34582FLr, this, ezk));
            igLinearLayout.addView(ezk);
            map.put(c34582FLr.A02, Integer.valueOf(i));
            i++;
        }
    }

    public final void A00(String str, int i) {
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            this.A00.getChildAt(number.intValue()).setVisibility(i);
        }
    }

    public final void A01(String str, boolean z) {
        Number number = (Number) this.A01.get(str);
        if (number != null) {
            this.A00.getChildAt(number.intValue()).setSelected(z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ PinnablesFooterHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinnablesFooterHorizontalScrollView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
