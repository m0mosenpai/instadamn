package com.facebook.messaging.caa.common.ui;

import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC58814QAx;
import X.C14360o3;
import X.CCO;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class MaaMessengerBrandingBackgroundDrawable extends AbstractC58814QAx {
    public static final String COLOR_1 = "#0099FF";
    public static final String COLOR_2 = "#A033FF";
    public static final String COLOR_3 = "#FF5280";
    public static final String COLOR_4 = "#FF7061";
    public static final CCO Companion = new Object();
    public static final float POSITION_1 = 0.0f;
    public static final float POSITION_2 = 0.6f;
    public static final float POSITION_3 = 0.9f;
    public static final float POSITION_4 = 1.0f;
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaaMessengerBrandingBackgroundDrawable(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.context = context;
    }

    @Override // X.AbstractC58814QAx
    public Drawable getIconDrawable() {
        return this.context.getDrawable(R.drawable.messenger_logo_white);
    }

    @Override // X.AbstractC58814QAx
    public Drawable getBrandingDrawable() {
        float A0A = AbstractC25229BEm.A0A(r0) * 0.35f;
        RadialGradient radialGradient = new RadialGradient(0.0f, A0A, (float) Math.hypot(AbstractC25230BEn.A0F(getDisplayMetrics()), A0A), new int[]{Color.parseColor(COLOR_1), Color.parseColor(COLOR_2), Color.parseColor(COLOR_3), Color.parseColor(COLOR_4)}, new float[]{0.0f, 0.6f, 0.9f, 1.0f}, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(radialGradient);
        return shapeDrawable;
    }
}
