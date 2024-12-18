package com.instagram.creator.ghostwriter.ui;

import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C44492Jly;
import X.C50L;
import X.JQ0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class GhostWriterView extends IgFrameLayout {
    public C44492Jly A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final ComposerAutoCompleteTextView A03;

    private final GradientDrawable A00(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(AbstractC167007dF.A09(getContext(), R.attr.igds_color_primary_button_on_media));
        gradientDrawable.setAlpha(i);
        this.A02.setElevation(8.0f);
        gradientDrawable.setCornerRadius(500.0f);
        return gradientDrawable;
    }

    public final ComposerAutoCompleteTextView getEditText() {
        return this.A03;
    }

    public final IgTextView getSubmit() {
        return this.A01;
    }

    public /* synthetic */ GhostWriterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Bitmap bitmap;
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.ghost_writer_composer, this);
        IgImageView A0a = AbstractC31172DnG.A0a(this, R.id.ghost_writer_composer_generate_button);
        this.A02 = A0a;
        this.A01 = AbstractC31172DnG.A0Y(this, R.id.ghost_writer_button_submit);
        this.A03 = (ComposerAutoCompleteTextView) findViewById(R.id.ghost_writer_composer_edittext);
        Resources resources = getResources();
        Drawable drawable = context.getDrawable(R.drawable.instagram_sparkles_filled_16);
        if (drawable != null) {
            bitmap = C50L.A01(context, drawable);
        } else {
            bitmap = null;
        }
        A0a.setImageDrawable(new BitmapDrawable(resources, bitmap));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, A00(179));
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, A00(255));
        stateListDrawable.addState(new int[0], A00(77));
        A0a.setBackground(stateListDrawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
