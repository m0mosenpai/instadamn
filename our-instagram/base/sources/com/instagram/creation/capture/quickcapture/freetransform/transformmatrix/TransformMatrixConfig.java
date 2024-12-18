package com.instagram.creation.capture.quickcapture.freetransform.transformmatrix;

import X.AbstractC12120kG;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.C1122855d;
import X.C14360o3;
import X.InterfaceC1122755a;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* loaded from: classes3.dex */
public final class TransformMatrixConfig implements InterfaceC1122755a {
    public static boolean A0M;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public TransformMatrixParams A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public C1122855d A0K;
    public boolean A0L;

    public final synchronized void A03() {
        float f;
        C1122855d A00 = A00();
        A00.A00 = this.A0H;
        C1122855d.A00(A00);
        float f2 = this.A08.A01;
        float f3 = f2 * this.A00;
        float f4 = f2 * this.A0I;
        C1122855d A002 = A00();
        A002.A02 = f3;
        C1122855d.A00(A002);
        C1122855d A003 = A00();
        A003.A03 = f4;
        C1122855d.A00(A003);
        C1122855d A004 = A00();
        A004.A07 = this.A0L;
        C1122855d.A00(A004);
        float f5 = -(this.A08.A00 + this.A0J);
        if (!this.A0G) {
            f5 = -f5;
        }
        C1122855d A005 = A00();
        A005.A01 = f5;
        C1122855d.A00(A005);
        C1122855d A006 = A00();
        A006.A06 = this.A0J;
        C1122855d.A00(A006);
        TransformMatrixParams transformMatrixParams = this.A08;
        float f6 = transformMatrixParams.A02 / f3;
        float f7 = transformMatrixParams.A03 / f4;
        int i = this.A0J;
        double d = (i * 3.141592653589793d) / 180.0d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f8 = (cos * f6) + (sin * f7);
        float f9 = (cos * f7) - (sin * f6);
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        AbstractC12120kG.A07(this.A09, AnonymousClass001.A0O("Unsupported exif=", i), null);
                    } else {
                        f = f9;
                    }
                } else {
                    f8 = -f8;
                }
                f = f8;
                f8 = f9;
            } else {
                f = -f9;
                f8 = -f8;
            }
        } else {
            f = f8;
            f8 = -f9;
        }
        if (!this.A0G) {
            f8 = -f8;
        }
        C1122855d A007 = A00();
        A007.A04 = f;
        C1122855d.A00(A007);
        C1122855d A008 = A00();
        A008.A05 = f8;
        C1122855d.A00(A008);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformMatrixConfig(TransformMatrixParams transformMatrixParams, String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this();
        C14360o3.A0B(str, 13);
        if (i4 > 0 && i5 > 0) {
            this.A05 = i;
            this.A03 = i2;
            this.A04 = i3;
            this.A0C = z3;
            this.A07 = i4;
            this.A06 = i5;
            TransformMatrixParams transformMatrixParams2 = this.A08;
            transformMatrixParams2.A04 = transformMatrixParams.A04;
            transformMatrixParams2.A00(transformMatrixParams);
            this.A0A = z;
            this.A0F = z2;
            this.A0D = z5;
            this.A0G = z4;
            this.A0E = z6;
            this.A09 = AnonymousClass001.A0T(getClass().getSimpleName(), str, '_');
            A01();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final C1122855d A00() {
        C1122855d c1122855d = this.A0K;
        if (c1122855d != null) {
            return c1122855d;
        }
        C14360o3.A0F("transformMatrix");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r14.A0F == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig.A01():void");
    }

    public final void A02() {
        TransformMatrixParams transformMatrixParams = this.A08;
        synchronized (transformMatrixParams) {
            transformMatrixParams.A01 = 1.0f;
            transformMatrixParams.A00 = 0.0f;
            transformMatrixParams.A02 = 0.0f;
            transformMatrixParams.A03 = 0.0f;
        }
    }

    public final void A04(float f) {
        this.A08.A02 = f / this.A07;
    }

    public final void A05(float f) {
        this.A08.A03 = f / this.A06;
    }

    @Override // X.InterfaceC1122755a
    public final float[] C6v() {
        return A00().A08.A01;
    }

    public TransformMatrixConfig() {
        this.A0G = true;
        this.A09 = "";
        Integer num = C05F.A00;
        this.A08 = new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }
}
