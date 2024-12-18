package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model;

import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes4.dex */
public interface FilterModel extends Parcelable {
    FilterModel deepCopy();

    float[] getContentTransform();

    String getFilterName();

    float[] getTextureTransform();

    TransformMatrixParams getTransformMatrixParams();

    boolean isEnabled();

    void setEnabled(boolean z);
}
