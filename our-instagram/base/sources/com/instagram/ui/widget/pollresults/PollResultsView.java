package com.instagram.ui.widget.pollresults;

import X.AbstractC25228BEl;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PollResultsView extends LinearLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.poll_results, (ViewGroup) this, true);
        this.A04 = (TextView) inflate.requireViewById(R.id.row_newsfeed_winning_poll_percentage);
        this.A05 = (TextView) inflate.requireViewById(R.id.row_newsfeed_winning_poll_option);
        this.A01 = (ImageView) inflate.requireViewById(R.id.row_newsfeed_winning_poll_background);
        this.A02 = (TextView) inflate.requireViewById(R.id.row_newsfeed_losing_poll_percentage);
        this.A03 = (TextView) inflate.requireViewById(R.id.row_newsfeed_losing_poll_option);
        this.A00 = (ImageView) inflate.requireViewById(R.id.row_newsfeed_losing_poll_background);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ PollResultsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
