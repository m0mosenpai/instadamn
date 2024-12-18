package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

/* renamed from: X.Tyd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66041Tyd extends Property {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66041Tyd(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto Ld;
                case 1: goto L12;
                case 2: goto L17;
                case 3: goto L17;
                case 4: goto L12;
                case 5: goto L1c;
                case 6: goto L21;
                case 7: goto L26;
                case 8: goto L5;
                case 9: goto L2b;
                case 10: goto L30;
                case 11: goto L5;
                case 12: goto L2b;
                case 13: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "growFraction"
        L9:
            r2.<init>(r1, r0)
            return
        Ld:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "thumbPos"
            goto L9
        L12:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "topLeft"
            goto L9
        L17:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "bottomRight"
            goto L9
        L1c:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "position"
            goto L9
        L21:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L9
        L26:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
            goto L9
        L2b:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "animationFraction"
            goto L9
        L30:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "completeEndFraction"
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66041Tyd.<init>(int):void");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        switch (this.A00) {
            case 0:
                f = ((SwitchCompat) obj).A00;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return null;
            case 6:
                f = VZP.A02.A00((View) obj);
                break;
            case 7:
                return ((View) obj).getClipBounds();
            case 8:
                FaceCaptureProgressView faceCaptureProgressView = (FaceCaptureProgressView) obj;
                C14360o3.A0B(faceCaptureProgressView, 0);
                f = faceCaptureProgressView.A00;
                break;
            case 9:
                Property property = C67764Uxf.A08;
                f = ((C67764Uxf) obj).A00;
                break;
            case 10:
                Property property2 = C67764Uxf.A08;
                f = ((C67764Uxf) obj).A01;
                break;
            case 11:
                AbstractC66307U8g abstractC66307U8g = (AbstractC66307U8g) obj;
                AbstractC69617VsK abstractC69617VsK = abstractC66307U8g.A09;
                if (abstractC69617VsK.A01 == 0 && abstractC69617VsK.A00 == 0) {
                    f = 1.0f;
                    break;
                } else {
                    f = abstractC66307U8g.A00;
                    break;
                }
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Property property3 = C67762Uxd.A06;
                f = ((C67762Uxd) obj).A00;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Property property4 = C67763Uxe.A08;
                f = ((C67763Uxe) obj).A00;
                break;
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.Uxd, X.Vrc] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.Uxf, X.Vrc] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.Vrc] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.Uxe, X.Vrc] */
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view;
        int round;
        int round2;
        int width;
        int height;
        ?? r0;
        AbstractC66307U8g abstractC66307U8g;
        C128935sB c128935sB;
        float interpolation;
        C69368VmE c69368VmE;
        int round3;
        int round4;
        View view2;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Number) obj2).floatValue());
                return;
            case 1:
                c69368VmE = (C69368VmE) obj;
                PointF pointF = (PointF) obj2;
                i = Math.round(pointF.x);
                c69368VmE.A02 = i;
                i2 = Math.round(pointF.y);
                c69368VmE.A04 = i2;
                int i3 = c69368VmE.A05 + 1;
                c69368VmE.A05 = i3;
                if (i3 != c69368VmE.A01) {
                    return;
                }
                view2 = c69368VmE.A06;
                round3 = c69368VmE.A03;
                round4 = c69368VmE.A00;
                VZP.A02.A05(view2, i, i2, round3, round4);
                c69368VmE.A05 = 0;
                c69368VmE.A01 = 0;
                return;
            case 2:
                c69368VmE = (C69368VmE) obj;
                PointF pointF2 = (PointF) obj2;
                round3 = Math.round(pointF2.x);
                c69368VmE.A03 = round3;
                round4 = Math.round(pointF2.y);
                c69368VmE.A00 = round4;
                int i4 = c69368VmE.A01 + 1;
                c69368VmE.A01 = i4;
                if (c69368VmE.A05 != i4) {
                    return;
                }
                view2 = c69368VmE.A06;
                i = c69368VmE.A02;
                i2 = c69368VmE.A04;
                VZP.A02.A05(view2, i, i2, round3, round4);
                c69368VmE.A05 = 0;
                c69368VmE.A01 = 0;
                return;
            case 3:
                view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                round = view.getLeft();
                round2 = view.getTop();
                width = Math.round(pointF3.x);
                height = Math.round(pointF3.y);
                VZP.A02.A05(view, round, round2, width, height);
                return;
            case 4:
                view = (View) obj;
                PointF pointF4 = (PointF) obj2;
                round = Math.round(pointF4.x);
                round2 = Math.round(pointF4.y);
                width = view.getRight();
                height = view.getBottom();
                VZP.A02.A05(view, round, round2, width, height);
                return;
            case 5:
                view = (View) obj;
                PointF pointF5 = (PointF) obj2;
                round = Math.round(pointF5.x);
                round2 = Math.round(pointF5.y);
                width = view.getWidth() + round;
                height = view.getHeight() + round2;
                VZP.A02.A05(view, round, round2, width, height);
                return;
            case 6:
                VZP.A02.A03((View) obj, ((Number) obj2).floatValue());
                return;
            case 7:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            case 8:
                FaceCaptureProgressView faceCaptureProgressView = (FaceCaptureProgressView) obj;
                float floatValue = ((Number) obj2).floatValue();
                C14360o3.A0B(faceCaptureProgressView, 0);
                faceCaptureProgressView.setDrawingAlpha(floatValue);
                return;
            case 9:
                r0 = (C67764Uxf) obj;
                float floatValue2 = ((Number) obj2).floatValue();
                r0.A00 = floatValue2;
                int i5 = (int) (5400.0f * floatValue2);
                float[] fArr = r0.A01;
                float f = floatValue2 * 1520.0f;
                fArr[0] = (-20.0f) + f;
                fArr[1] = f;
                int i6 = 0;
                do {
                    float f2 = fArr[1];
                    c128935sB = r0.A06;
                    fArr[1] = f2 + (c128935sB.getInterpolation((i5 - C67764Uxf.A0B[i6]) / 667.0f) * 250.0f);
                    interpolation = fArr[0] + (c128935sB.getInterpolation((i5 - C67764Uxf.A0A[i6]) / 667.0f) * 250.0f);
                    fArr[0] = interpolation;
                    i6++;
                } while (i6 < 4);
                float f3 = interpolation + ((fArr[1] - interpolation) * r0.A01);
                fArr[0] = f3;
                fArr[0] = f3 / 360.0f;
                fArr[1] = fArr[1] / 360.0f;
                int i7 = 0;
                while (true) {
                    float f4 = (i5 - C67764Uxf.A0C[i7]) / 333.0f;
                    if (f4 >= 0.0f && f4 <= 1.0f) {
                        int i8 = i7 + r0.A02;
                        AbstractC69617VsK abstractC69617VsK = r0.A07;
                        int[] iArr = abstractC69617VsK.A05;
                        int length = iArr.length;
                        int i9 = i8 % length;
                        int i10 = (i9 + 1) % length;
                        int A01 = AbstractC69853Vwe.A01(iArr[i9], ((AbstractC66307U8g) r0.A00).A01);
                        int A012 = AbstractC69853Vwe.A01(abstractC69617VsK.A05[i10], ((AbstractC66307U8g) r0.A00).A01);
                        float interpolation2 = c128935sB.getInterpolation(f4);
                        int[] iArr2 = r0.A02;
                        Integer valueOf = Integer.valueOf(A01);
                        Integer valueOf2 = Integer.valueOf(A012);
                        int intValue = valueOf.intValue();
                        float f5 = ((intValue >> 24) & 255) / 255.0f;
                        float f6 = ((intValue >> 16) & 255) / 255.0f;
                        float f7 = ((intValue >> 8) & 255) / 255.0f;
                        float f8 = (intValue & 255) / 255.0f;
                        int intValue2 = valueOf2.intValue();
                        float pow = (float) Math.pow(f6, 2.2d);
                        float pow2 = (float) Math.pow(f7, 2.2d);
                        float pow3 = (float) Math.pow(f8, 2.2d);
                        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * interpolation2);
                        float pow6 = pow3 + (interpolation2 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
                        float pow7 = ((float) Math.pow(pow + ((pow4 - pow) * interpolation2), 0.45454545454545453d)) * 255.0f;
                        iArr2[0] = (Math.round(pow7) << 16) | (Math.round((f5 + (((((intValue2 >> 24) & 255) / 255.0f) - f5) * interpolation2)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f);
                    } else {
                        i7++;
                        if (i7 < 4) {
                        }
                    }
                }
                abstractC66307U8g = r0.A00;
                abstractC66307U8g.invalidateSelf();
                return;
            case 10:
                float floatValue3 = ((Number) obj2).floatValue();
                Property property = C67764Uxf.A08;
                ((C67764Uxf) obj).A01 = floatValue3;
                return;
            case 11:
                abstractC66307U8g = (AbstractC66307U8g) obj;
                float floatValue4 = ((Number) obj2).floatValue();
                if (abstractC66307U8g.A00 == floatValue4) {
                    return;
                }
                abstractC66307U8g.A00 = floatValue4;
                abstractC66307U8g.invalidateSelf();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                r0 = (C67762Uxd) obj;
                r0.A00 = ((Number) obj2).floatValue();
                float[] fArr2 = r0.A01;
                fArr2[0] = 0.0f;
                float f9 = ((int) (r2 * 333.0f)) / 667.0f;
                C128935sB c128935sB2 = r0.A03;
                float interpolation3 = c128935sB2.getInterpolation(f9);
                fArr2[2] = interpolation3;
                fArr2[1] = interpolation3;
                float interpolation4 = c128935sB2.getInterpolation(f9 + 0.49925038f);
                fArr2[4] = interpolation4;
                fArr2[3] = interpolation4;
                fArr2[5] = 1.0f;
                if (r0.A04 && fArr2[3] < 1.0f) {
                    int[] iArr3 = r0.A02;
                    iArr3[2] = iArr3[1];
                    iArr3[1] = iArr3[0];
                    iArr3[0] = AbstractC69853Vwe.A01(r0.A05.A05[r0.A01], ((AbstractC66307U8g) r0.A00).A01);
                    r0.A04 = false;
                }
                abstractC66307U8g = r0.A00;
                abstractC66307U8g.invalidateSelf();
                return;
            default:
                r0 = (C67763Uxe) obj;
                float floatValue5 = ((Number) obj2).floatValue();
                r0.A00 = floatValue5;
                int i11 = (int) (floatValue5 * 1800.0f);
                int i12 = 0;
                do {
                    r0.A01[i12] = AbstractC58322PtE.A01(1.0f, r0.A07[i12].getInterpolation((i11 - C67763Uxe.A09[i12]) / C67763Uxe.A0A[i12]), 0.0f);
                    i12++;
                } while (i12 < 4);
                if (r0.A05) {
                    Arrays.fill(r0.A02, AbstractC69853Vwe.A01(r0.A06.A05[r0.A01], ((AbstractC66307U8g) r0.A00).A01));
                    r0.A05 = false;
                }
                abstractC66307U8g = r0.A00;
                abstractC66307U8g.invalidateSelf();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66041Tyd(Class cls) {
        super(cls, "drawingAlpha");
        this.A00 = 8;
    }
}
