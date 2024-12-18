package com.instagram.music.common.musiclabels;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31173DnH;
import X.AbstractC46478Khc;
import X.AbstractC53242c7;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class MusicLabelView extends TextView {
    public final void setLabelModel(AbstractC46478Khc abstractC46478Khc) {
        if (abstractC46478Khc != null) {
            C14360o3.A07(getContext());
            throw AbstractC166987dD.A15("getLabel");
        }
        setVisibility(8);
    }

    public /* synthetic */ MusicLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        AbstractC31173DnH.A0z(context, this, R.drawable.label_bg);
        setMaxLines(1);
        setIncludeFontPadding(false);
        setTextSize(2, 7.0f);
        int A0D = AbstractC166997dE.A0D(context.getResources());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.annotation_hidden_location_pill_nub_padding);
        setPadding(A0D, dimensionPixelSize, A0D, dimensionPixelSize);
        setTypeface(Typeface.DEFAULT_BOLD);
        AbstractC166987dD.A1O(context, this, AbstractC53242c7.A0A(context));
        setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
