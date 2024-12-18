package com.facebook.facedetection.amlfacetracker;

import X.AbstractC167017dG;
import X.C14360o3;
import android.graphics.Rect;

/* loaded from: classes10.dex */
public final class AMLDetectedFace {
    public byte[] alignedFace;
    public int detectionId;
    public Rect faceRect;
    public float[] headPose;
    public float[] headPoseMat;
    public float[] landmarks2D;

    public AMLDetectedFace(int i, float[] fArr) {
        Rect rect;
        this.detectionId = i;
        this.landmarks2D = fArr;
        float f = Float.MIN_VALUE;
        if (fArr == null) {
            rect = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
        } else {
            int length = fArr.length;
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2 += 2) {
                float f5 = fArr[i2];
                float f6 = fArr[i2 + 1];
                f3 = Math.min(f3, f5);
                f = Math.max(f, f5);
                f4 = Math.min(f4, f6);
                f2 = Math.max(f2, f6);
            }
            rect = new Rect((int) f3, (int) f4, (int) f, (int) f2);
        }
        this.faceRect = rect;
    }

    public AMLDetectedFace(int i, Rect rect, float[] fArr, byte[] bArr) {
        C14360o3.A0B(rect, 2);
        this.detectionId = i;
        this.landmarks2D = fArr;
        this.faceRect = rect;
        this.alignedFace = bArr;
    }

    public AMLDetectedFace(int i, Rect rect, float[] fArr, byte[] bArr, float[] fArr2, float[] fArr3) {
        AbstractC167017dG.A1R(rect, fArr);
        this.detectionId = i;
        this.landmarks2D = fArr;
        this.faceRect = rect;
        this.alignedFace = bArr;
        this.headPoseMat = fArr2;
        this.headPose = fArr3;
    }
}
