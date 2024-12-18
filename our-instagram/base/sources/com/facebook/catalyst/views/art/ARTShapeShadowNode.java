package com.facebook.catalyst.views.art;

import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC61750Rt5;
import X.AnonymousClass001;
import X.C0I2;
import X.MSV;
import X.TXV;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.messaging.caa.common.ui.MaaMessengerBrandingBackgroundDrawable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public class ARTShapeShadowNode extends ARTVirtualNode {
    public Path A00;
    public float A01 = 1.0f;
    public int A02 = 1;
    public int A03 = 1;
    public float[] A04;
    public float[] A05;
    public float[] A06;

    public final boolean A0F(Paint paint, float f) {
        float f2;
        float[] fArr;
        float[] fArr2 = this.A04;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        AbstractC166987dD.A1R(paint);
        float[] fArr3 = this.A04;
        int i2 = (int) fArr3[0];
        if (i2 != 0) {
            if (i2 != 1) {
                C0I2.A04("ReactNative", AnonymousClass001.A0c("ART: Color type ", MSV.A00(614), i2));
            } else {
                int length = fArr3.length;
                if (length < 5) {
                    C0I2.A04("ReactNative", AnonymousClass001.A0O("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ", length));
                    return false;
                }
                float f3 = fArr3[1];
                float f4 = ((ARTVirtualNode) this).A02;
                float f5 = f3 * f4;
                float f6 = fArr3[2] * f4;
                float f7 = fArr3[3] * f4;
                float f8 = fArr3[4] * f4;
                int i3 = (length - 5) / 5;
                int[] iArr = null;
                if (i3 > 0) {
                    iArr = new int[i3];
                    fArr = new float[i3];
                    do {
                        float[] fArr4 = this.A04;
                        fArr[i] = fArr4[(i3 * 4) + 5 + i];
                        int i4 = (i * 4) + 5;
                        iArr[i] = Color.argb((int) (fArr4[i4 + 3] * 255.0f), (int) (fArr4[i4] * 255.0f), (int) (fArr4[i4 + 1] * 255.0f), (int) (fArr4[i4 + 2] * 255.0f));
                        i++;
                    } while (i < i3);
                } else {
                    fArr = null;
                }
                paint.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
            }
            return true;
        }
        if (fArr3.length > 4) {
            f2 = fArr3[4] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint.setARGB((int) f2, (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f), (int) (fArr3[3] * 255.0f));
        return true;
    }

    public final boolean A0G(Paint paint, float f) {
        float[] fArr;
        Paint.Cap cap;
        Paint.Join join;
        float f2;
        int length;
        int i = 0;
        if (this.A01 == 0.0f || (fArr = this.A05) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        AbstractC43592JPx.A1E(paint);
        int i2 = this.A02;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    throw TXV.A00("strokeCap ", " unrecognized", i2);
                }
            } else {
                cap = Paint.Cap.ROUND;
            }
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        int i3 = this.A03;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    throw TXV.A00("strokeJoin ", " unrecognized", i3);
                }
            } else {
                join = Paint.Join.ROUND;
            }
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        float f3 = this.A01;
        float f4 = ((ARTVirtualNode) this).A02;
        paint.setStrokeWidth(f3 * f4);
        float[] fArr2 = this.A05;
        if (fArr2.length > 3) {
            f2 = fArr2[3] * f * 255.0f;
        } else {
            f2 = f * 255.0f;
        }
        paint.setARGB((int) f2, (int) (fArr2[0] * 255.0f), (int) (fArr2[1] * 255.0f), (int) (fArr2[2] * 255.0f));
        float[] fArr3 = this.A06;
        if (fArr3 != null && (length = fArr3.length) > 0) {
            float[] fArr4 = new float[length];
            do {
                fArr4[i] = fArr3[i] * f4;
                i++;
            } while (i < length);
            paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
        }
        return true;
    }

    @ReactProp(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.A02 = i;
        A07();
    }

    @ReactProp(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.A03 = i;
        A07();
    }

    @ReactProp(defaultFloat = MaaMessengerBrandingBackgroundDrawable.POSITION_4, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.A01 = f;
        A07();
    }

    @ReactProp(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.A04 = AbstractC61750Rt5.A00(readableArray);
        A07();
    }

    @ReactProp(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        Path.Direction direction;
        float[] A00 = AbstractC61750Rt5.A00(readableArray);
        Path A0T = AbstractC166987dD.A0T();
        A0T.moveTo(0.0f, 0.0f);
        int i = 0;
        while (i < A00.length) {
            int i2 = i + 1;
            int i3 = (int) A00[i];
            if (i3 != 0) {
                boolean z = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                int i4 = i2 + 1;
                                float f = A00[i2];
                                float f2 = ((ARTVirtualNode) this).A02;
                                float f3 = f * f2;
                                int i5 = i4 + 1;
                                float f4 = A00[i4] * f2;
                                float f5 = A00[i5] * f2;
                                float degrees = (float) Math.toDegrees(A00[r0]);
                                int i6 = i5 + 1 + 1 + 1;
                                float degrees2 = (float) Math.toDegrees(A00[r3]);
                                i = i6 + 1;
                                if (A00[i6] == 1.0f) {
                                    z = false;
                                }
                                float f6 = degrees2 - degrees;
                                if (Math.abs(f6) >= 360.0f) {
                                    if (z) {
                                        direction = Path.Direction.CCW;
                                    } else {
                                        direction = Path.Direction.CW;
                                    }
                                    A0T.addCircle(f3, f4, f5, direction);
                                } else {
                                    float f7 = f6 % 360.0f;
                                    if (f7 < 0.0f) {
                                        f7 += 360.0f;
                                    }
                                    if (z && f7 < 360.0f) {
                                        f7 = (360.0f - f7) * (-1.0f);
                                    }
                                    A0T.arcTo(new RectF(f3 - f5, f4 - f5, f3 + f5, f4 + f5), degrees, f7);
                                }
                            } else {
                                throw new RuntimeException(AnonymousClass001.A0O("Unrecognized drawing instruction ", i3));
                            }
                        } else {
                            int i7 = i2 + 1;
                            float f8 = A00[i2];
                            float f9 = ((ARTVirtualNode) this).A02;
                            int i8 = i7 + 1;
                            float f10 = f9 * A00[i7];
                            int i9 = i8 + 1;
                            float f11 = f9 * A00[i8];
                            int i10 = i9 + 1;
                            float f12 = f9 * A00[i9];
                            int i11 = i10 + 1;
                            i = i11 + 1;
                            A0T.cubicTo(f8 * f9, f10, f11, f12, f9 * A00[i10], A00[i11] * f9);
                        }
                    } else {
                        int i12 = i2 + 1;
                        float f13 = A00[i2];
                        float f14 = ((ARTVirtualNode) this).A02;
                        i = i12 + 1;
                        A0T.lineTo(f13 * f14, A00[i12] * f14);
                    }
                } else {
                    A0T.close();
                    i = i2;
                }
            } else {
                int i13 = i2 + 1;
                float f15 = A00[i2];
                float f16 = ((ARTVirtualNode) this).A02;
                i = i13 + 1;
                A0T.moveTo(f15 * f16, A00[i13] * f16);
            }
        }
        this.A00 = A0T;
        A07();
    }

    @ReactProp(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.A05 = AbstractC61750Rt5.A00(readableArray);
        A07();
    }

    @ReactProp(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.A06 = AbstractC61750Rt5.A00(readableArray);
        A07();
    }
}
