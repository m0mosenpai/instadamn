package com.instagram.direct.fragment.writewithai;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C32071E6x;
import X.EZI;
import X.InterfaceC16660sJ;
import X.ViewOnClickListenerC35668Fp3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PromptPills extends HorizontalScrollView {
    public final IgLinearLayout A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.write_with_ai_prompt_pills, (ViewGroup) this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.write_with_ai_prompt_pills_linear_layout);
    }

    public static /* synthetic */ void setPills$default(PromptPills promptPills, List list, int i, InterfaceC16660sJ interfaceC16660sJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        promptPills.setPills(list, i, interfaceC16660sJ);
    }

    public final void setPills(List list, int i, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1O(list, interfaceC16660sJ);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C32071E6x c32071E6x = (C32071E6x) it.next();
            EZI ezi = new EZI(AbstractC166997dE.A0L(this));
            ezi.setId(i2);
            ezi.setText(c32071E6x.A01);
            ezi.setImage(c32071E6x.A00);
            ezi.setOnClickListener(new ViewOnClickListenerC35668Fp3(i2, 3, interfaceC16660sJ));
            this.A00.addView(ezi, i2);
            i2++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ PromptPills(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromptPills(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
