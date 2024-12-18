package com.instagram.creation.capture.video.view;

import X.AbstractC55922hc;
import X.AnonymousClass841;
import X.C14360o3;
import X.C5L6;
import X.EnumC95184Qe;
import X.JQ0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgCaptureVideoPreviewView extends VideoPreviewView {
    public float A00;
    public AnonymousClass841 A01;

    @Override // com.instagram.common.ui.widget.videopreviewview.VideoPreviewView
    public float getMaxFitAspectRatio() {
        return 1.91f;
    }

    public final AnonymousClass841 getCreationCameraSession() {
        return this.A01;
    }

    public final float getMinAspectRatio() {
        return this.A00;
    }

    @Override // com.instagram.common.ui.widget.videopreviewview.VideoPreviewView
    public float getMinFitAspectRatio() {
        return this.A00;
    }

    @Override // com.instagram.common.ui.widget.videopreviewview.VideoPreviewView
    public EnumC95184Qe getScaleType() {
        C5L6 c5l6;
        AnonymousClass841 anonymousClass841 = this.A01;
        if (anonymousClass841 != null) {
            c5l6 = anonymousClass841.ANZ();
        } else {
            c5l6 = null;
        }
        if (c5l6 == C5L6.A08) {
            return EnumC95184Qe.A05;
        }
        if (anonymousClass841 != null) {
            return EnumC95184Qe.A03;
        }
        EnumC95184Qe enumC95184Qe = this.A02;
        C14360o3.A0A(enumC95184Qe);
        return enumC95184Qe;
    }

    public final void setCreationCameraSession(AnonymousClass841 anonymousClass841) {
        this.A01 = anonymousClass841;
    }

    public final void setMinAspectRatio(float f) {
        this.A00 = f;
    }

    public /* synthetic */ IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public final void setAspectRatio(float f) {
        int height;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (f > 1.0f) {
            Object parent = getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            layoutParams.width = width;
            height = (int) (width / f);
        } else {
            Object parent2 = getParent();
            C14360o3.A0C(parent2, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent2;
            if (f < 1.0f) {
                height = view.getHeight();
                layoutParams.width = (int) (height * f);
            } else {
                layoutParams.width = view.getWidth();
                Object parent3 = getParent();
                C14360o3.A0C(parent3, "null cannot be cast to non-null type android.view.View");
                height = ((View) parent3).getHeight();
            }
        }
        layoutParams.height = height;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 0.8f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A10);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
