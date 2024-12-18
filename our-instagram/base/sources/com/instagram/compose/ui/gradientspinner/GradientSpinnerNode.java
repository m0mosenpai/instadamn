package com.instagram.compose.ui.gradientspinner;

import X.AbstractC137676Lo;
import X.AnonymousClass195;
import X.AnonymousClass587;
import X.BHN;
import X.C14360o3;
import X.C25287BHf;
import X.C25289BHh;
import X.C58A;
import X.C58J;
import X.C5YC;
import X.C9E0;
import X.InterfaceC1129057z;
import X.InterfaceC1129358c;
import X.InterfaceC113445Ag;
import X.InterfaceC16610sE;
import android.graphics.Matrix;
import android.graphics.Shader;

/* loaded from: classes3.dex */
public final class GradientSpinnerNode extends C58J implements InterfaceC113445Ag, InterfaceC1129358c {
    public float A00;
    public C25287BHf A01;
    public BHN A02;
    public C25289BHh A03;
    public InterfaceC16610sE A04;
    public AnonymousClass195 A05;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        float A01;
        C14360o3.A0B(interfaceC1129057z, 0);
        C25289BHh c25289BHh = this.A03;
        float f = this.A01.A00;
        Shader shader = c25289BHh.A01;
        if (shader != null) {
            Matrix matrix = c25289BHh.A02;
            long j = c25289BHh.A00;
            matrix.setRotate(f, C5YC.A02(j) / 2.0f, C5YC.A00(j) / 2.0f);
            shader.setLocalMatrix(matrix);
        }
        float f2 = this.A00;
        if (!Float.isNaN(f2)) {
            A01 = interfaceC1129057z.EqT(f2);
        } else {
            A01 = C5YC.A01(interfaceC1129057z.Bxc());
        }
        long Bxc = interfaceC1129057z.Bxc();
        float A02 = (C5YC.A02(Bxc) - A01) / 2.0f;
        float A00 = (C5YC.A00(Bxc) - A01) / 2.0f;
        C58A c58a = ((AnonymousClass587) interfaceC1129057z.AzL()).A01;
        c58a.COj(A02, A00, A02, A00);
        try {
            this.A04.invoke(interfaceC1129057z, this.A01, this.A03);
            float f3 = -A02;
            float f4 = -A00;
            c58a.COj(f3, f4, f3, f4);
            interfaceC1129057z.AQf();
        } catch (Throwable th) {
            float f5 = -A02;
            float f6 = -A00;
            c58a.COj(f5, f6, f5, f6);
            throw th;
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0115 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1JX A00(com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.gradientspinner.GradientSpinnerNode.A00(com.instagram.compose.ui.gradientspinner.GradientSpinnerNode, X.1Ds):X.1JX");
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        AbstractC137676Lo.A00(this, new C9E0(this, 21));
    }
}
