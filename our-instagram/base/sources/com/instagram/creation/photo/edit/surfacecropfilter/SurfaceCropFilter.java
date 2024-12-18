package com.instagram.creation.photo.edit.surfacecropfilter;

import X.AKZ;
import X.AbstractC199788sU;
import X.AnonymousClass001;
import X.C138856Qq;
import X.C14360o3;
import X.C206139Av;
import X.C206169Az;
import X.LHK;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.common.math.matrix.Matrix3;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider;

/* loaded from: classes4.dex */
public class SurfaceCropFilter implements FilterModelProvider {
    public static final double A01;
    public static final double A02;
    public static final C138856Qq[] A03;
    public static final C206169Az[] A04;
    public static final Parcelable.Creator CREATOR = new C206139Av(71);
    public SurfaceCropFilterModel A00;

    public SurfaceCropFilter(boolean z) {
        SurfaceCropFilterModel surfaceCropFilterModel = new SurfaceCropFilterModel();
        this.A00 = surfaceCropFilterModel;
        surfaceCropFilterModel.A0D = z;
        surfaceCropFilterModel.A0C = false;
    }

    public static PointF A01(Matrix4 matrix4, float f, float f2) {
        C206169Az A00 = matrix4.A00(new C206169Az(0, f, f2, 0.0f, 1.0f));
        float f3 = A00.A01;
        float f4 = A00.A00;
        return new PointF(f3 / f4, A00.A02 / f4);
    }

    private synchronized void A03() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = true;
        transformSteps.A00 = true;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = true;
        A06();
    }

    private synchronized void A04() {
        A03();
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        if (surfaceCropFilterModel.A06.A06 > surfaceCropFilterModel.A02) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = surfaceCropFilterModel.A0I;
            A0Q(fitTransformParams);
            A0N(fitTransformParams, false);
        }
    }

    private synchronized void A05() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = false;
        A06();
    }

    private synchronized void A06() {
        float f;
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        if (transformSteps.A03) {
            A0A(true);
        }
        if (transformSteps.A00) {
            SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
            Matrix4 matrix4 = surfaceCropFilterModel.A07;
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
            float A00 = A00(matrix4, fullTransform.A01, fullTransform.A02);
            SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel.A06;
            fullTransform2.A06 = (fullTransform2.A06 * A00) / fullTransform2.A00;
            fullTransform2.A00 = A00;
        }
        if (transformSteps.A01) {
            SurfaceCropFilterModel surfaceCropFilterModel2 = this.A00;
            Matrix4 matrix42 = surfaceCropFilterModel2.A07;
            SurfaceCropFilterModel.FullTransform fullTransform3 = surfaceCropFilterModel2.A06;
            PointF A012 = A01(matrix42, fullTransform3.A01, fullTransform3.A02);
            SurfaceCropFilterModel surfaceCropFilterModel3 = this.A00;
            Matrix4 matrix43 = surfaceCropFilterModel3.A0M;
            Matrix.setIdentityM(matrix43.A01, 0);
            if (surfaceCropFilterModel3.A0C) {
                f = 1.0f;
            } else {
                f = surfaceCropFilterModel3.A01;
                if (f < 1.0f) {
                    float f2 = surfaceCropFilterModel3.A06.A06;
                    matrix43.A02(f2 / f, f2);
                    float f3 = -A012.x;
                    float f4 = -A012.y;
                    Matrix4 matrix44 = new Matrix4();
                    matrix44.A03(f3, f4, 0.0f);
                    matrix43.A05(matrix44.A01);
                }
            }
            float f5 = surfaceCropFilterModel3.A06.A06;
            matrix43.A02(f5, f5 * f);
            float f32 = -A012.x;
            float f42 = -A012.y;
            Matrix4 matrix442 = new Matrix4();
            matrix442.A03(f32, f42, 0.0f);
            matrix43.A05(matrix442.A01);
        }
        if (transformSteps.A02) {
            SurfaceCropFilterModel surfaceCropFilterModel4 = this.A00;
            if (surfaceCropFilterModel4.A0C) {
                A0A(false);
            }
            Matrix4 matrix45 = surfaceCropFilterModel4.A0N;
            matrix45.A04(surfaceCropFilterModel4.A0M);
            matrix45.A05(surfaceCropFilterModel4.A07.A01);
            if (!surfaceCropFilterModel4.A0D) {
                float f6 = 1.0f;
                if (surfaceCropFilterModel4.A0E) {
                    f6 = -1.0f;
                }
                Matrix4 matrix46 = new Matrix4();
                matrix46.A02(f6, -1.0f);
                matrix45.A05(matrix46.A01);
            }
            AbstractC199788sU.A00(surfaceCropFilterModel4, matrix45.A01);
        }
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = false;
        transformSteps.A02 = false;
        transformSteps.A04 = false;
    }

    private synchronized void A07() {
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = true;
        transformSteps.A00 = true;
        transformSteps.A01 = false;
        transformSteps.A02 = false;
        transformSteps.A04 = false;
        A06();
    }

    public static synchronized void A08(SurfaceCropFilter surfaceCropFilter) {
        synchronized (surfaceCropFilter) {
            SurfaceCropFilterModel.TransformSteps transformSteps = surfaceCropFilter.A00.A0K;
            transformSteps.A03 = false;
            transformSteps.A00 = false;
            transformSteps.A01 = true;
            transformSteps.A02 = true;
            transformSteps.A04 = true;
            surfaceCropFilter.A06();
        }
    }

    public static synchronized void A09(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        synchronized (surfaceCropFilter) {
            SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter.A00;
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
            fullTransform.A01 = f;
            fullTransform.A02 = f2;
            fullTransform.A00 = surfaceCropFilter.A00(surfaceCropFilterModel.A07, f, f2);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.6Qq] */
    public static C138856Qq[] A0B(Matrix4 matrix4) {
        double d;
        double d2;
        C138856Qq[] c138856QqArr = new C138856Qq[4];
        int i = 0;
        do {
            C206169Az A00 = matrix4.A00(A04[i]);
            float f = A00.A01;
            float f2 = A00.A00;
            c138856QqArr[i] = new C138856Qq(f / f2, A00.A02 / f2);
            i++;
        } while (i < 4);
        ?? obj = new Object();
        int i2 = 0;
        do {
            double d3 = obj.A00;
            C138856Qq c138856Qq = c138856QqArr[i2];
            d = d3 + c138856Qq.A00;
            obj.A00 = d;
            d2 = obj.A01 + c138856Qq.A01;
            obj.A01 = d2;
            i2++;
        } while (i2 < 4);
        obj.A00 = d / 4.0d;
        obj.A01 = d2 / 4.0d;
        int i3 = 0;
        while (true) {
            C138856Qq c138856Qq2 = c138856QqArr[i3];
            i3++;
            if (!AKZ.A01(c138856Qq2, c138856QqArr[i3 % 4], obj)) {
                int i4 = 0;
                do {
                    C138856Qq c138856Qq3 = c138856QqArr[i4];
                    C138856Qq c138856Qq4 = c138856QqArr[3 - i4];
                    double d4 = c138856Qq3.A00;
                    double d5 = c138856Qq3.A01;
                    c138856Qq3.A00 = c138856Qq4.A00;
                    c138856Qq3.A01 = c138856Qq4.A01;
                    c138856Qq4.A00 = d4;
                    c138856Qq4.A01 = d5;
                    i4++;
                } while (i4 < 2);
            } else if (i3 >= 4) {
                break;
            }
        }
        return c138856QqArr;
    }

    public final synchronized Point A0C(boolean z) {
        float f;
        int i;
        float f2;
        int i2;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        int i3 = surfaceCropFilterModel.A05;
        int i4 = surfaceCropFilterModel.A04;
        if (i3 > i4) {
            float f3 = i3;
            f = surfaceCropFilterModel.A06.A06;
            i2 = (int) ((f3 / f) + 0.5f);
            f2 = surfaceCropFilterModel.A01;
            i = (int) ((f3 / (f * f2)) + 0.5f);
        } else {
            float f4 = i4;
            f = surfaceCropFilterModel.A06.A06;
            i = (int) ((f4 / f) + 0.5f);
            f2 = surfaceCropFilterModel.A01;
            i2 = (int) (((f2 * f4) / f) + 0.5f);
        }
        if (z && !surfaceCropFilterModel.A0A && !LHK.A01(i2 / i, surfaceCropFilterModel.A03)) {
            throw new IllegalStateException(AnonymousClass001.A0R("Aspect ratio error: ", StringFormatUtil.formatStrLocaleSafe("size:%d x %d  input:%d x %d  scale:%f cropAspectRatio:%f", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f), Float.valueOf(f2))));
        }
        return new Point(i2, i);
    }

    public final synchronized PointF A0D(float f, float f2) {
        PointF A022;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        Matrix4 matrix4 = surfaceCropFilterModel.A07;
        SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
        PointF A012 = A01(matrix4, fullTransform.A01, fullTransform.A02);
        float f3 = A012.x;
        float f4 = this.A00.A06.A06;
        float f5 = f3 + (((-f) * 2.0f) / f4);
        A012.x = f5;
        float f6 = A012.y + ((f2 * 2.0f) / f4);
        A012.y = f6;
        A022 = A02(this, f5, f6);
        A09(this, A022.x, A022.y);
        A08(this);
        return A022;
    }

    public final synchronized void A0E() {
        SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A00.A0I;
        if (A0Q(fitTransformParams)) {
            A0M(fitTransformParams);
        }
    }

    public final synchronized void A0F(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A03 != f) {
            fullTransform.A03 = f;
            A04();
        }
    }

    public final synchronized void A0G(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A04 != f) {
            fullTransform.A04 = f;
            A04();
        }
    }

    public final synchronized void A0H(float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (fullTransform.A05 != f) {
            fullTransform.A05 = f;
            A04();
        }
    }

    public final synchronized void A0I(int i) {
        this.A00.A06.A07 = i;
        A03();
    }

    public final synchronized void A0J(PointF pointF, float f) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        if (f != fullTransform.A06) {
            fullTransform.A06 = f;
        }
        A09(this, pointF.x, pointF.y);
        A08(this);
        A0E();
    }

    public final synchronized void A0K(Rect rect, int i, int i2, int i3, boolean z) {
        PointF A022;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        surfaceCropFilterModel.A0F = false;
        float f = i;
        float f2 = i2;
        surfaceCropFilterModel.A00 = f / f2;
        A07();
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        C14360o3.A0B(rect, 3);
        float width = rect.width();
        float height = rect.height();
        if (f != 0.0f && f2 != 0.0f && width != 0.0f && height != 0.0f) {
            if (f > f2) {
                if (width > height) {
                    f5 = f / width;
                } else {
                    f5 = f / height;
                }
                f3 = ((rect.left + rect.right) - f) / f;
                f4 = ((rect.top + rect.bottom) - f2) / f;
            } else {
                if (height > width) {
                    f5 = f2 / height;
                } else {
                    f5 = f2 / width;
                }
                f3 = ((rect.left + rect.right) - f) / f2;
                f4 = ((rect.top + rect.bottom) - f2) / f2;
            }
        }
        surfaceCropFilterModel.A06.A06 = 1.0f;
        if (!z || i3 % 180 == 0) {
            A022 = A02(this, f3, -f4);
        } else {
            A022 = A02(this, -f4, f3);
        }
        A09(this, A022.x, A022.y);
        A05();
        surfaceCropFilterModel.A06.A06 = f5;
        A08(this);
        int i4 = i2;
        if (i > i2) {
            i4 = i;
        }
        float f6 = i4 / 320.0f;
        surfaceCropFilterModel.A02 = f6;
        surfaceCropFilterModel.A02 = Math.max(surfaceCropFilterModel.A06.A06 * 3.8f, f6);
        if (i3 != 0 && !surfaceCropFilterModel.A0D) {
            if (!surfaceCropFilterModel.A0E) {
                i3 = -i3;
            }
            surfaceCropFilterModel.A03 = i3;
        }
        if (surfaceCropFilterModel.A03 % 180 == 0) {
            surfaceCropFilterModel.A05 = i;
            surfaceCropFilterModel.A04 = i2;
            surfaceCropFilterModel.A01 = rect.width() / rect.height();
        } else {
            surfaceCropFilterModel.A05 = i2;
            surfaceCropFilterModel.A04 = i;
            surfaceCropFilterModel.A01 = rect.height() / rect.width();
        }
        if (surfaceCropFilterModel.A0G) {
            surfaceCropFilterModel.A0G = false;
            SurfaceCropFilterModel surfaceCropFilterModel2 = this.A00;
            surfaceCropFilterModel2.A06 = surfaceCropFilterModel2.A0J;
        }
        SurfaceCropFilterModel.TransformSteps transformSteps = this.A00.A0K;
        transformSteps.A03 = true;
        transformSteps.A00 = false;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = true;
        A06();
    }

    public final synchronized void A0L(SurfaceCropFilterModel.FitTransformParams fitTransformParams) {
        SurfaceCropFilterModel.FullTransform fullTransform = this.A00.A06;
        fitTransformParams.A02 = fullTransform.A06;
        fitTransformParams.A00 = fullTransform.A01;
        fitTransformParams.A01 = fullTransform.A02;
    }

    public final synchronized void A0M(SurfaceCropFilterModel.FitTransformParams fitTransformParams) {
        A0N(fitTransformParams, true);
    }

    public final synchronized void A0N(SurfaceCropFilterModel.FitTransformParams fitTransformParams, boolean z) {
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        surfaceCropFilterModel.A06.A06 = fitTransformParams.A02;
        A09(this, fitTransformParams.A00, fitTransformParams.A01);
        SurfaceCropFilterModel.TransformSteps transformSteps = surfaceCropFilterModel.A0K;
        transformSteps.A03 = false;
        transformSteps.A00 = false;
        transformSteps.A01 = true;
        transformSteps.A02 = true;
        transformSteps.A04 = z;
        A06();
    }

    public final synchronized void A0O(SurfaceCropFilterModel.FullTransform fullTransform) {
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        SurfaceCropFilterModel.FullTransform fullTransform2 = surfaceCropFilterModel.A06;
        fullTransform2.A03 = fullTransform.A03;
        fullTransform2.A04 = fullTransform.A04;
        fullTransform2.A05 = fullTransform.A05;
        fullTransform2.A07 = fullTransform.A07;
        A07();
        SurfaceCropFilterModel.FullTransform fullTransform3 = surfaceCropFilterModel.A06;
        fullTransform3.A06 = fullTransform.A06;
        fullTransform3.A00 = fullTransform.A00;
        fullTransform3.A01 = fullTransform.A01;
        fullTransform3.A02 = fullTransform.A02;
        A08(this);
    }

    public final synchronized void A0P(boolean z) {
        this.A00.A0E = z;
        A03();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SurfaceCropFilter";
    }

    static {
        A03 = r6;
        C206169Az[] c206169AzArr = new C206169Az[4];
        A04 = c206169AzArr;
        int i = 0;
        C138856Qq[] c138856QqArr = {new C138856Qq(-1.0d, 1.0d), new C138856Qq(-1.0d, -1.0d), new C138856Qq(1.0d, -1.0d), new C138856Qq(1.0d, 1.0d)};
        double d = c138856QqArr[2].A00 - c138856QqArr[1].A00;
        A01 = d;
        A02 = d * 1.001d;
        do {
            C138856Qq c138856Qq = c138856QqArr[i];
            c206169AzArr[i] = new C206169Az(0, (float) c138856Qq.A00, (float) c138856Qq.A01, 0.0f, 1.0f);
            i++;
        } while (i < 4);
    }

    private float A00(Matrix4 matrix4, float f, float f2) {
        float f3;
        PointF A012 = A01(matrix4, f, f2);
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        float f4 = surfaceCropFilterModel.A01;
        if (f4 > 1.0f) {
            A012.x /= f4;
        } else if (f4 < 1.0f) {
            A012.y *= f4;
        }
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        int i2 = 0;
        do {
            C206169Az c206169Az = A04[i2];
            PointF A013 = A01(matrix4, c206169Az.A01, c206169Az.A02);
            float f5 = surfaceCropFilterModel.A01;
            if (f5 > 1.0f) {
                A013.x /= f5;
            } else if (f5 < 1.0f) {
                A013.y *= f5;
            }
            pointFArr[i2] = A013;
            i2++;
        } while (i2 < 4);
        float f6 = Float.MAX_VALUE;
        do {
            PointF pointF = pointFArr[i];
            float f7 = pointF.x;
            float f8 = pointF.y;
            i++;
            PointF pointF2 = pointFArr[i % 4];
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            float f11 = A012.x;
            float f12 = A012.y;
            if (Math.abs(f7 - f9) < 1.0E-7f) {
                f3 = Math.abs(f11 - f7);
            } else {
                float f13 = (f10 - f8) / (f9 - f7);
                f3 = Float.MAX_VALUE;
                if (Math.abs(f13 - 1.0f) > 1.0E-7f) {
                    f3 = Math.min(Float.MAX_VALUE, Math.abs((((f8 - (f13 * f7)) - (f12 - f11)) / (1.0f - f13)) - f11));
                }
                float f14 = 1.0f + f13;
                if (Math.abs(f14) > 1.0E-7f) {
                    f3 = Math.min(f3, Math.abs(((((f13 * f7) - f8) + (f12 + f11)) / f14) - f11));
                }
            }
            f6 = Math.min(f6, f3);
        } while (i < 4);
        return 1.0f / f6;
    }

    public static PointF A02(SurfaceCropFilter surfaceCropFilter, float f, float f2) {
        Matrix3 matrix3 = new Matrix3();
        float[] fArr = surfaceCropFilter.A00.A07.A01;
        float[] fArr2 = matrix3.A01;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[3];
        fArr2[3] = fArr[4];
        fArr2[4] = fArr[5];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[12];
        fArr2[7] = fArr[13];
        float f3 = fArr[15];
        fArr2[8] = f3;
        float f4 = fArr2[0];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[5];
        float f8 = (f5 * f3) - (f6 * f7);
        float f9 = fArr2[3];
        float f10 = fArr2[2];
        float f11 = fArr2[1];
        float f12 = (f4 * f8) + (f9 * ((f6 * f10) - (f3 * f11))) + (fArr2[6] * ((f11 * f7) - (f5 * f10)));
        int i = 0;
        float f13 = fArr2[2];
        float f14 = fArr2[1];
        float f15 = fArr2[6];
        float f16 = fArr2[0];
        float f17 = fArr2[2];
        float f18 = fArr2[3];
        float f19 = fArr2[4];
        float[] fArr3 = {f8, (f6 * f13) - (fArr2[1] * f3), (f14 * f7) - (f5 * f13), (f15 * f7) - (fArr2[3] * f3), (f3 * f16) - (f15 * f17), (f17 * f18) - (f7 * f16), (f18 * f6) - (f15 * f19), (fArr2[6] * f14) - (f6 * f16), (f16 * f19) - (f18 * f14)};
        do {
            fArr2[i] = fArr3[i] / f12;
            i++;
        } while (i < 9);
        float f20 = (fArr2[0] * f) + (fArr2[3] * f2) + (fArr2[6] * 1.0f);
        float f21 = (fArr2[1] * f) + (fArr2[4] * f2) + (fArr2[7] * 1.0f);
        float f22 = (fArr2[2] * f) + (fArr2[5] * f2) + (fArr2[8] * 1.0f);
        return new PointF(f20 / f22, f21 / f22);
    }

    private void A0A(boolean z) {
        Matrix4 matrix4;
        SurfaceCropFilterModel surfaceCropFilterModel = this.A00;
        Matrix.setIdentityM(surfaceCropFilterModel.A07.A01, 0);
        float[] fArr = new float[16];
        Matrix.frustumM(fArr, 0, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 4.0f);
        surfaceCropFilterModel.A07.A05(fArr);
        Matrix4 matrix42 = new Matrix4();
        matrix42.A03(0.0f, 0.0f, -2.0f);
        surfaceCropFilterModel.A07.A05(matrix42.A01);
        float f = -surfaceCropFilterModel.A06.A05;
        Matrix4 matrix43 = new Matrix4();
        matrix43.A01(f);
        surfaceCropFilterModel.A07.A05(matrix43.A01);
        float f2 = surfaceCropFilterModel.A06.A04;
        float[] fArr2 = new Matrix4().A01;
        Matrix.rotateM(fArr2, 0, f2, 0.0f, 1.0f, 0.0f);
        surfaceCropFilterModel.A07.A05(fArr2);
        float f3 = surfaceCropFilterModel.A06.A03;
        float[] fArr3 = new Matrix4().A01;
        Matrix.rotateM(fArr3, 0, f3, 1.0f, 0.0f, 0.0f);
        surfaceCropFilterModel.A07.A05(fArr3);
        float f4 = surfaceCropFilterModel.A06.A07 + surfaceCropFilterModel.A03;
        Matrix4 matrix44 = new Matrix4();
        matrix44.A01(f4);
        surfaceCropFilterModel.A07.A05(matrix44.A01);
        float f5 = surfaceCropFilterModel.A00;
        if (f5 < 1.0f) {
            matrix4 = new Matrix4();
            matrix4.A02(f5, 1.0f);
        } else {
            matrix4 = new Matrix4();
            matrix4.A02(1.0f, 1.0f / f5);
        }
        Matrix4 matrix45 = new Matrix4(surfaceCropFilterModel.A07);
        surfaceCropFilterModel.A07.A05(matrix4.A01);
        float f6 = Float.MAX_VALUE;
        int i = 0;
        do {
            C206169Az A00 = surfaceCropFilterModel.A07.A00(A04[i]);
            float f7 = A00.A01;
            float f8 = A00.A00;
            f6 = Math.min(f6, Math.min(1.0f / Math.abs(f7 / f8), 1.0f / Math.abs(A00.A02 / f8)));
            i++;
        } while (i < 4);
        Matrix4 matrix46 = new Matrix4();
        matrix46.A02(f6, f6);
        if (z) {
            matrix45 = surfaceCropFilterModel.A07;
        }
        matrix46.A05(matrix45.A01);
        surfaceCropFilterModel.A07 = matrix46;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r4 < 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (r4 < 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, X.6Qq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0Q(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel.FitTransformParams r27) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter.A0Q(com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams):boolean");
    }

    @Override // com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider
    public final /* bridge */ /* synthetic */ FilterModel B6R() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
