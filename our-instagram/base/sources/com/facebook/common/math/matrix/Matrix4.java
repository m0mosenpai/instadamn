package com.facebook.common.math.matrix;

import X.C14360o3;
import X.C206149Aw;
import X.C206169Az;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
public final class Matrix4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(20);
    public final FloatBuffer A00;
    public final float[] A01;

    public final C206169Az A00(C206169Az c206169Az) {
        C14360o3.A0B(c206169Az, 0);
        C206169Az c206169Az2 = new C206169Az(0.0f, 0.0f, 15, 0.0f, 0, 0.0f);
        float[] fArr = this.A01;
        float f = fArr[0] * c206169Az.A01;
        float f2 = fArr[4];
        float f3 = c206169Az.A02;
        float f4 = f + (f2 * f3);
        float f5 = fArr[8];
        float f6 = c206169Az.A03;
        float f7 = f4 + (f5 * f6);
        float f8 = fArr[12];
        float f9 = c206169Az.A00;
        c206169Az2.A01 = f7 + (f8 * f9);
        float f10 = fArr[1];
        float f11 = c206169Az.A01;
        c206169Az2.A02 = (f10 * f11) + (fArr[5] * f3) + (fArr[9] * f6) + (fArr[13] * f9);
        float f12 = fArr[2] * f11;
        float f13 = fArr[6];
        float f14 = c206169Az.A02;
        c206169Az2.A03 = f12 + (f13 * f14) + (fArr[10] * f6) + (fArr[14] * f9);
        c206169Az2.A00 = (fArr[3] * f11) + (fArr[7] * f14) + (fArr[11] * c206169Az.A03) + (fArr[15] * f9);
        return c206169Az2;
    }

    public final void A04(Matrix4 matrix4) {
        C14360o3.A0B(matrix4, 0);
        System.arraycopy(matrix4.A01, 0, this.A01, 0, 16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloatArray(this.A00.array());
    }

    public final void A01(float f) {
        Matrix.rotateM(this.A01, 0, f, 0.0f, 0.0f, 1.0f);
    }

    public final void A02(float f, float f2) {
        Matrix.scaleM(this.A01, 0, f, f2, 1.0f);
    }

    public final void A03(float f, float f2, float f3) {
        Matrix.translateM(this.A01, 0, f, f2, f3);
    }

    public final void A05(float[] fArr) {
        float[] fArr2 = new float[16];
        float[] fArr3 = this.A01;
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
    }

    public Matrix4(Matrix4 matrix4) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        C14360o3.A07(wrap);
        this.A00 = wrap;
        System.arraycopy(matrix4.A01, 0, fArr, 0, 16);
    }

    public Matrix4(Parcel parcel) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        C14360o3.A07(wrap);
        this.A00 = wrap;
        parcel.readFloatArray(fArr);
    }

    public Matrix4() {
        float[] fArr = new float[16];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        C14360o3.A07(wrap);
        this.A00 = wrap;
        Matrix.setIdentityM(this.A01, 0);
    }
}
