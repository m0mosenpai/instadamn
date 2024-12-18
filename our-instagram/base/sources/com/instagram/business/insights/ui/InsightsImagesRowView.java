package com.instagram.business.insights.ui;

import X.C14360o3;
import X.JQ0;
import X.MOB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class InsightsImagesRowView extends LinearLayout implements MOB {
    public int A00;
    public MOB A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context) {
        this(context, (AttributeSet) null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.MOB
    public final void DLS(View view, String str) {
        C14360o3.A0B(view, 0);
        MOB mob = this.A01;
        if (mob != null) {
            mob.DLS(view, str);
        }
    }

    public final void setDelegate(MOB mob) {
        this.A01 = mob;
    }

    public /* synthetic */ InsightsImagesRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = 3;
        setOrientation(0);
        setImportantForAccessibility(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightsImagesRowView(Context context, int i) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = i;
        setOrientation(0);
        setImportantForAccessibility(2);
    }
}
