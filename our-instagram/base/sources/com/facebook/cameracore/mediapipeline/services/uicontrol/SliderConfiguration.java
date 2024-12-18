package com.facebook.cameracore.mediapipeline.services.uicontrol;

/* loaded from: classes4.dex */
public class SliderConfiguration {
    public final float[] mColorSamplerRGBAData;
    public final byte[] mImageData;
    public final int mSliderType;
    public final int mSteps;

    public SliderConfiguration(int i, int i2, float[] fArr, byte[] bArr) {
        this.mSteps = i;
        this.mSliderType = i2;
        this.mColorSamplerRGBAData = fArr;
        this.mImageData = bArr;
    }
}
