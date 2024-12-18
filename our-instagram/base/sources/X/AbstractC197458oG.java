package X;

import android.graphics.Rect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.8oG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197458oG {
    public static final TransformMatrixConfig A00(int i, int i2, int i3, int i4, boolean z) {
        Integer num = C05F.A00;
        boolean z2 = !z;
        return new TransformMatrixConfig(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "videos", i, i2, 0, i3, i4, false, false, false, z2, false, z2);
    }

    public static final TransformMatrixConfig A01(TransformMatrixConfig transformMatrixConfig, AGH agh, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        float f;
        Float f2;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (transformMatrixConfig == null) {
            return null;
        }
        if (agh != null && (num4 = agh.A03) != null) {
            i = num4.intValue();
        } else {
            i = transformMatrixConfig.A05;
        }
        if (agh != null && (num3 = agh.A02) != null) {
            i2 = num3.intValue();
        } else {
            i2 = transformMatrixConfig.A03;
        }
        int i5 = transformMatrixConfig.A04;
        if (agh != null && (num2 = agh.A05) != null) {
            i3 = num2.intValue();
        } else {
            i3 = transformMatrixConfig.A07;
        }
        if (agh != null && (num = agh.A04) != null) {
            i4 = num.intValue();
        } else {
            i4 = transformMatrixConfig.A06;
        }
        if (agh != null && (bool = agh.A00) != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = transformMatrixConfig.A08.A04;
        }
        Integer num5 = C05F.A00;
        boolean z5 = !z2;
        TransformMatrixConfig transformMatrixConfig2 = new TransformMatrixConfig(new TransformMatrixParams(num5, num5, 1.0f, 0.0f, 0.0f, 0.0f, z4), transformMatrixConfig.A09, i, i2, i5, i3, i4, transformMatrixConfig.A0A, z, z2, z5, z3, z5);
        transformMatrixConfig2.A08.A00(transformMatrixConfig.A08);
        if (agh != null && (f2 = agh.A01) != null) {
            f = f2.floatValue();
        } else {
            f = transformMatrixConfig.A08.A01;
        }
        transformMatrixConfig2.A08.A01 = f;
        transformMatrixConfig2.A03();
        return transformMatrixConfig2;
    }

    public static final TransformMatrixConfig A02(C183978Ee c183978Ee, float f, int i, int i2) {
        int i3;
        int i4;
        if (c183978Ee.A16) {
            i3 = i;
            i4 = i2;
        } else {
            i3 = c183978Ee.A09;
            i4 = c183978Ee.A06;
        }
        int i5 = c183978Ee.A07;
        boolean z = c183978Ee.A14;
        Rect A00 = c183978Ee.A00();
        int A01 = AbstractC197468oH.A01(i3, A00);
        int A002 = AbstractC197468oH.A00(i4, A00);
        Integer num = C05F.A00;
        TransformMatrixConfig transformMatrixConfig = new TransformMatrixConfig(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "photo", A01, A002, i5, i, i2, z, false, true, false, true, false);
        transformMatrixConfig.A08.A01 = f;
        return transformMatrixConfig;
    }
}
