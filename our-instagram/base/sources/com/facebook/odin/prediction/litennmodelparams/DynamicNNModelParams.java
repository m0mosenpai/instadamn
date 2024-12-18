package com.facebook.odin.prediction.litennmodelparams;

import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C3R9;
import X.C3RD;
import X.C3SG;
import X.InterfaceC73913Tc;
import X.MSZ;
import X.UQ9;
import X.X0Y;
import X.X0Z;
import com.facebook.odin.model.Matrix;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DynamicNNModelParams extends C0T6 implements InterfaceC73913Tc {
    public static final C3R9[] A08;
    public static final Companion Companion = new Object();
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final float[] A04;
    public final float[] A05;
    public final float[] A06;
    public final int[] A07;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0Y.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams$Companion] */
    static {
        C3RD c3rd = C3RD.A01;
        A08 = new C3R9[]{new C3SG(c3rd), null, null, null, null, new C3SG(X0Z.A00), null, new C3SG(c3rd)};
    }

    public /* synthetic */ DynamicNNModelParams(String str, List list, List list2, List list3, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i) {
        if (255 != (i & 255)) {
            AbstractC68612VXn.A00(X0Y.A01, i, 255);
            throw C00O.createAndThrow();
        }
        this.A01 = list;
        this.A04 = fArr;
        this.A05 = fArr2;
        this.A00 = str;
        this.A06 = fArr3;
        this.A03 = list2;
        this.A07 = iArr;
        this.A02 = list3;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afj(int i) {
        return ((UQ9) this.A03.get(i - 1)).A01;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afk(int i) {
        return ((UQ9) this.A03.get(i - 1)).A02;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afx(int i) {
        return ((UQ9) this.A03.get(i - 1)).A03;
    }

    @Override // X.InterfaceC73913Tc
    public final List BUN() {
        return this.A02;
    }

    @Override // X.InterfaceC73913Tc
    public final int[] BWg() {
        return this.A07;
    }

    @Override // X.InterfaceC73913Tc
    public final String BXI() {
        return this.A00;
    }

    @Override // X.InterfaceC73913Tc
    public final List BfN() {
        return this.A01;
    }

    @Override // X.InterfaceC73913Tc
    public final Matrix CHU(int i) {
        return ((UQ9) this.A03.get(i - 1)).A00;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] BQK(int i) {
        return this.A04;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] CEK(int i) {
        return this.A06;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] CEL(int i) {
        return this.A05;
    }

    public DynamicNNModelParams(String str, List list, List list2, List list3, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr) {
        MSZ.A1O(list, str);
        this.A01 = list;
        this.A04 = fArr;
        this.A05 = fArr2;
        this.A00 = str;
        this.A06 = fArr3;
        this.A03 = list2;
        this.A07 = iArr;
        this.A02 = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DynamicNNModelParams() {
        /*
            r9 = this;
            X.0sl r2 = X.C16930sl.A00
            r0 = 0
            float[] r5 = new float[r0]
            float[] r6 = new float[r0]
            float[] r7 = new float[r0]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r8 = new int[r0]
            java.lang.String r1 = "range"
            r0 = r9
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams.<init>():void");
    }
}
