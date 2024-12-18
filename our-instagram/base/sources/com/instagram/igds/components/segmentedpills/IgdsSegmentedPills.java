package com.instagram.igds.components.segmentedpills;

import X.C0w9;
import X.C14360o3;
import X.C31200Dnj;
import X.InterfaceC16660sJ;
import X.JQ0;
import X.JWE;
import X.LPK;
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

/* loaded from: classes8.dex */
public final class IgdsSegmentedPills extends HorizontalScrollView {
    public final IgLinearLayout A00;

    public final void setPills(List list) {
        C14360o3.A0B(list, 0);
        setPills(list, 0, null);
    }

    public static /* synthetic */ void setPills$default(IgdsSegmentedPills igdsSegmentedPills, List list, int i, InterfaceC16660sJ interfaceC16660sJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            interfaceC16660sJ = null;
        }
        igdsSegmentedPills.setPills(list, i, interfaceC16660sJ);
    }

    public /* synthetic */ IgdsSegmentedPills(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.igds_segmented_pills, (ViewGroup) this, true);
        this.A00 = (IgLinearLayout) findViewById(R.id.igds_segmented_pills_linear_layout);
    }

    public final void setPills(List list, int i, InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        C14360o3.A0B(list, 0);
        if (list.size() < 3) {
            str = "Number of pills is below minimum requirement";
        } else {
            IgLinearLayout igLinearLayout = this.A00;
            igLinearLayout.removeAllViews();
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                C31200Dnj c31200Dnj = (C31200Dnj) it.next();
                if (i2 >= 8) {
                    str = "Number of pills exceeds max requirement";
                } else {
                    Context context = getContext();
                    C14360o3.A07(context);
                    JWE jwe = new JWE(context);
                    jwe.setId(i2);
                    jwe.setLabel(c31200Dnj.A00);
                    jwe.setOnClickListener(new LPK(i2, 5, jwe, this, interfaceC16660sJ));
                    if (i2 == i) {
                        jwe.setSelected(true);
                    }
                    igLinearLayout.addView(jwe, i2);
                    i2 = i3;
                }
            }
            return;
        }
        C0w9.A03("IgdsSegmentedPills", str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgdsSegmentedPills(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
