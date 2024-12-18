package com.instagram.music.common.ui;

import X.AbstractC37301Gc2;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C8G4;
import X.C8G6;
import X.C8G7;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class MusicPreviewButton extends IgSimpleImageView {
    public C8G6 A00;
    public boolean A01;
    public boolean A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setProgress(float f) {
        this.A00.A00(f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8G4 A01;
        C14360o3.A0B(context, 1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1l);
            C14360o3.A07(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getBoolean(1, false);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (this.A02) {
            boolean z = this.A01;
            C8G7 c8g7 = C8G6.A0V;
            if (z) {
                A01 = c8g7.A02(context);
            } else {
                A01 = new C8G4(context);
                Resources resources = getResources();
                A01.A0B = AbstractC37301Gc2.A0T(resources, R.dimen.afi_indicator_arrow_margin_top);
                A01.A0A = 0;
                A01.A02(resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
                A01.A06 = 0;
                A01.A00 = context.getDrawable(R.drawable.instagram_play_filled_16);
                A01.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
            }
        } else {
            A01 = C8G6.A0V.A01(context);
        }
        C8G6 A00 = A01.A00();
        this.A00 = A00;
        setImageDrawable(A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicPreviewButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ MusicPreviewButton(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
