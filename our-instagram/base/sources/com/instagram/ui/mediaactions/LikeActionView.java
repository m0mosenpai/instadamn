package com.instagram.ui.mediaactions;

import X.AbstractC41371ISy;
import X.C14360o3;
import X.C37905Gm2;
import X.C41612Ib2;
import X.InterfaceC74253Vg;
import X.InterfaceC74263Vh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LikeActionView extends ImageView implements InterfaceC74253Vg, InterfaceC74263Vh {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A00() {
        setScaleX(0.0f);
        setScaleY(0.0f);
        setAlpha(1.0f);
        setRotation(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    @Override // X.InterfaceC74263Vh
    public final void E4K() {
        C41612Ib2 c41612Ib2 = C41612Ib2.A00;
        Context context = getContext();
        C14360o3.A07(context);
        setImageDrawable(c41612Ib2.A00(context));
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        setScaleX(f);
        setScaleY(f);
        if (z) {
            f = (float) Math.min(Math.max(f, getAlpha()), 1.0d);
        }
        setAlpha(f);
    }

    @Override // X.InterfaceC74263Vh
    public final void Cwm(C37905Gm2 c37905Gm2, float f, float f2, float f3, float f4) {
        setScaleX(f);
        setScaleY(f);
        setAlpha(f4);
        setRotation(f3);
        setTranslationX(AbstractC41371ISy.A01(c37905Gm2));
        Context context = getContext();
        C14360o3.A07(context);
        setTranslationY(AbstractC41371ISy.A00(context, c37905Gm2, f2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        setImageDrawable(context.getDrawable(R.drawable.feed_like_big));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LikeActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ LikeActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
