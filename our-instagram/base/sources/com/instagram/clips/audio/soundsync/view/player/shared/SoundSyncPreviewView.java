package com.instagram.clips.audio.soundsync.view.player.shared;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.AbstractC37302Gc3;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C44336Jib;
import X.C44358Jix;
import X.C44361Jj0;
import X.C47275Kum;
import X.C48212LVm;
import X.C55942hf;
import X.C55982hj;
import X.D8L;
import X.InterfaceC09390do;
import X.JQ0;
import X.LH1;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class SoundSyncPreviewView extends FrameLayout {
    public Bitmap A00;
    public Path A01;
    public PointF A02;
    public final float A03;
    public final RectF A04;
    public final TextureView A05;
    public final IgImageView A06;
    public final int A07;
    public final C48212LVm A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public final void setCornerRadius(PointF pointF) {
        C14360o3.A0B(pointF, 0);
        this.A02 = pointF;
        this.A01 = LH1.A00(this.A04, C05F.A01, pointF.x, pointF.y);
        invalidate();
    }

    public final void setLoadingText(String str) {
        C14360o3.A0B(str, 0);
        C44361Jj0 foreGroundDrawable = getForeGroundDrawable();
        if (!C14360o3.A0K(foreGroundDrawable.A02, str)) {
            foreGroundDrawable.A02 = str;
            foreGroundDrawable.A01 = C44361Jj0.A00(foreGroundDrawable, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44361Jj0 getForeGroundDrawable() {
        return (C44361Jj0) this.A09.getValue();
    }

    private final LayerDrawable getLayerDrawable() {
        return (LayerDrawable) this.A0A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44336Jib getLoadingDrawable() {
        return (C44336Jib) this.A0B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44358Jix getStrokeProgress() {
        return (C44358Jix) this.A0C.getValue();
    }

    public final PointF getCornerRadius() {
        return this.A02;
    }

    public final IgImageView getLoadingImageView() {
        return this.A06;
    }

    public final Bitmap getPreviewImage() {
        return this.A00;
    }

    public final TextureView getVideoTextureView() {
        return this.A05;
    }

    public final void setLoadingState(boolean z) {
        C48212LVm c48212LVm;
        Integer num;
        Double valueOf;
        Double valueOf2;
        if (z) {
            this.A06.setImageDrawable(getLayerDrawable());
            InterfaceC09390do interfaceC09390do = getForeGroundDrawable().A0B;
            if (!((Animator) interfaceC09390do.getValue()).isStarted()) {
                ((Animator) interfaceC09390do.getValue()).start();
            }
            c48212LVm = this.A08;
            num = C05F.A01;
        } else {
            c48212LVm = this.A08;
            num = C05F.A00;
        }
        if (num != c48212LVm.A00) {
            c48212LVm.A00 = num;
            C55942hf c55942hf = c48212LVm.A02;
            double d = 5.0d;
            int intValue = num.intValue();
            if (intValue != 0) {
                valueOf = Double.valueOf(80.0d);
            } else {
                valueOf = Double.valueOf(110.0d);
                d = 3.0d;
            }
            Double valueOf3 = Double.valueOf(d);
            c55942hf.A01 = valueOf.doubleValue();
            c55942hf.A00 = valueOf3.doubleValue();
            C55942hf c55942hf2 = c48212LVm.A01;
            double d2 = 5.0d;
            if (intValue != 0) {
                valueOf2 = Double.valueOf(90.0d);
                d2 = 8.0d;
            } else {
                valueOf2 = Double.valueOf(100.0d);
            }
            Double valueOf4 = Double.valueOf(d2);
            c55942hf2.A01 = valueOf2.doubleValue();
            c55942hf2.A00 = valueOf4.doubleValue();
            C55982hj c55982hj = (C55982hj) c48212LVm.A03.getValue();
            C14360o3.A07(c55982hj);
            c55982hj.A09(c55942hf);
            c55982hj.A03();
        }
    }

    public final void setPreviewImage(Bitmap bitmap) {
        this.A00 = bitmap;
        C44336Jib loadingDrawable = getLoadingDrawable();
        loadingDrawable.A00 = bitmap;
        loadingDrawable.invalidateSelf();
    }

    public /* synthetic */ SoundSyncPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public static final /* synthetic */ C44336Jib A00(SoundSyncPreviewView soundSyncPreviewView) {
        return soundSyncPreviewView.getLoadingDrawable();
    }

    public static final /* synthetic */ C44361Jj0 A01(SoundSyncPreviewView soundSyncPreviewView) {
        return soundSyncPreviewView.getForeGroundDrawable();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1371902612);
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A04;
        rectF.set(0.0f, 0.0f, i, i2);
        float f = this.A07;
        rectF.inset(f, f);
        PointF pointF = this.A02;
        this.A01 = LH1.A00(rectF, C05F.A01, pointF.x, pointF.y);
        C0f9.A0D(-1501202486, A06);
    }

    public final void setProgress(double d) {
        getStrokeProgress().A02(d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = AbstractC166987dD.A0X();
        float dimension = context.getResources().getDimension(R.dimen.abc_dialog_padding_top_material);
        this.A03 = dimension;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        this.A07 = dimensionPixelOffset;
        this.A02 = new PointF(dimension, dimension);
        this.A0B = AbstractC37302Gc3.A0m(this, 22);
        this.A09 = AbstractC37302Gc3.A0m(context, 20);
        this.A0C = AbstractC09440dt.A01(new D8L(7, context, this));
        this.A0A = AbstractC37302Gc3.A0m(this, 21);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setForeground(getStrokeProgress());
        setWillNotDraw(false);
        View.inflate(getContext(), R.layout.layout_sound_sync_player, this);
        this.A05 = (TextureView) requireViewById(R.id.texture);
        IgImageView A0Z = AbstractC31172DnG.A0Z(this, R.id.loading_image);
        this.A06 = A0Z;
        this.A08 = new C48212LVm(A0Z, new C47275Kum(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundSyncPreviewView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
