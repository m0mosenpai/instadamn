package com.instagram.filterkit.filter;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.C0f5;
import X.C14360o3;
import X.C18950wb;
import X.C18C;
import X.C8M4;
import X.InterfaceC197718oi;
import X.XOQ;
import X.XOR;
import X.YPq;
import X.YRL;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class GradientBackgroundVideoFilter extends VideoFilter {
    public GradientBackgroundVideoFilter(UserSession userSession, Context context, boolean z) {
        super(context, new XOR(), C8M4.A00(userSession).A01(753));
        C18C.A0H(AbstractC167007dF.A1N(this.A01), "useSamplerExternalOES must be set prior to calling getProgram");
        this.A0G = z;
        A04(true);
    }

    @Override // com.instagram.filterkit.filter.VideoFilter
    public final void A03(YPq yPq, InterfaceC197718oi interfaceC197718oi, YRL yrl) {
        float[] fArr = this.A0I;
        float[] fArr2 = this.A0H;
        Bitmap bitmap = this.A05;
        if ((fArr != null && fArr2 != null) || bitmap != null) {
            XOQ xoq = this.A07;
            if (xoq instanceof XOR) {
                C14360o3.A0C(xoq, "null cannot be cast to non-null type com.instagram.filterkit.filter.GradientBackgroundFilterRenderSetup");
                XOR xor = (XOR) xoq;
                if (fArr != null && fArr2 != null) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    float[] fArr3 = xor.A0A;
                    fArr3[0] = f;
                    fArr3[1] = f2;
                    fArr3[2] = f3;
                    fArr3[3] = 1.0f;
                    float f4 = fArr2[0];
                    float f5 = fArr2[1];
                    float f6 = fArr2[2];
                    float[] fArr4 = xor.A07;
                    fArr4[0] = f4;
                    fArr4[1] = f5;
                    fArr4[2] = f6;
                    fArr4[3] = 1.0f;
                }
                if (bitmap != null) {
                    C0f5 AEp = C18950wb.A01.AEp(AbstractC111324zv.A00(1636), 817895413);
                    AEp.ABW(AbstractC111324zv.A00(3275), "GradientBackgroundVideoFilter");
                    AEp.report();
                    xor.A00 = bitmap;
                }
            }
        }
        super.A03(yPq, interfaceC197718oi, yrl);
    }

    public final void A06(float f, float f2, boolean z) {
        if (f < f2) {
            XOQ xoq = this.A07;
            if (xoq != null) {
                float f3 = (1.0f - (f / f2)) * 0.5f;
                C14360o3.A0C(xoq, "null cannot be cast to non-null type com.instagram.filterkit.filter.GradientBackgroundFilterRenderSetup");
                float f4 = 1.0f - f3;
                float[] fArr = ((XOR) xoq).A08;
                if (z) {
                    fArr[0] = 0.0f;
                    fArr[1] = f3;
                    fArr[2] = 1.0f;
                    fArr[3] = f4;
                    return;
                }
                fArr[0] = f3;
                fArr[1] = 1.0f;
                fArr[2] = f4;
                fArr[3] = 0.0f;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("toAspectRatio taller than fromAspectRatio");
    }
}
