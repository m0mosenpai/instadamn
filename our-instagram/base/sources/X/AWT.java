package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes4.dex */
public final class AWT implements BCT, BE4 {
    public C90D A00;
    public Integer A03 = 0;
    public Boolean A01 = false;
    public Boolean A02 = false;
    public final List A04 = AbstractC166987dD.A1E();

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        C90D c90d = this.A00;
        if (c90d != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                c90d.start();
            } else {
                if (i != 1) {
                    return;
                }
                c90d.stop();
            }
        }
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167017dG.A0T("executionMode", this.A03, AbstractC167007dF.A0o("serviceType", 51));
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C90D c90d;
        Integer B2u;
        int i;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90B.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C90B c90b = (C90B) anonymousClass904.A02(c203848zt);
                Integer num = null;
                if (c90b != null) {
                    c90d = c90b.A00;
                } else {
                    c90d = null;
                }
                this.A00 = c90d;
                if (c90d != null && (B2u = c90d.B2u()) != null) {
                    if (1 - B2u.intValue() != 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    num = Integer.valueOf(i);
                }
                this.A03 = num;
                C90D c90d2 = this.A00;
                if (c90d2 != null) {
                    c90d2.A8z(this);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r2 != false) goto L20;
     */
    @Override // X.BE4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Epn() {
        /*
            r6 = this;
            java.lang.Boolean r1 = r6.A01
            X.90D r0 = r6.A00
            r4 = 0
            if (r0 == 0) goto L8c
            boolean r0 = r0.CLa()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        Lf:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r3 = 0
            if (r0 != 0) goto L8a
            X.90D r0 = r6.A00
            if (r0 == 0) goto L88
            boolean r0 = r0.CLa()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L22:
            r6.A01 = r0
            r2 = 1
        L25:
            java.lang.Boolean r1 = r6.A02
            X.90D r0 = r6.A00
            if (r0 == 0) goto L86
            boolean r0 = r0.Ccq(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L33:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L83
            X.90D r0 = r6.A00
            if (r0 == 0) goto L45
            boolean r0 = r0.Ccq(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L45:
            r6.A02 = r4
        L47:
            java.util.List r5 = r6.A04
            java.lang.String r1 = "serviceType"
            r0 = 51
            X.0e4 r4 = X.AbstractC167007dF.A0o(r1, r0)
            java.lang.Integer r0 = X.C05F.A0Y
            X.0e4 r3 = X.AbstractC167027dH.A0Y(r0)
            java.lang.Boolean r1 = r6.A01
            java.lang.String r0 = "hasRawData"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.Boolean r1 = r6.A02
            java.lang.String r0 = "isSensorAvailable"
            android.os.Bundle r0 = X.AbstractC167027dH.A09(r0, r1, r4, r3, r2)
            r5.add(r0)
        L6a:
            java.util.List r2 = r6.A04
            java.util.ArrayList r1 = X.AbstractC001800i.A0U(r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7f
            r0 = 51
            android.os.Bundle r0 = X.AbstractC167027dH.A08(r0)
            r1.add(r0)
        L7f:
            r2.clear()
            return r1
        L83:
            if (r2 == 0) goto L6a
            goto L47
        L86:
            r0 = r4
            goto L33
        L88:
            r0 = r4
            goto L22
        L8a:
            r2 = 0
            goto L25
        L8c:
            r0 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWT.Epn():java.util.List");
    }

    @Override // X.BCT
    public final void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        this.A04.add(AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 51), AbstractC167027dH.A0Y(C05F.A0C), AbstractC166987dD.A1L("deviceRotationMatrix", fArr), AbstractC166987dD.A1L("acceleration", fArr2), AbstractC166987dD.A1L("gravity", fArr3), AbstractC166987dD.A1L("rotation", fArr4), AbstractC166987dD.A1L("timestampNs", Long.valueOf(j))));
    }

    @Override // X.BCT
    public final void onRawSensorMeasurementChanged(EnumC222959sa enumC222959sa, float[] fArr, long j) {
        C14360o3.A0B(enumC222959sa, 0);
        C14360o3.A0B(fArr, 1);
        this.A04.add(AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 51), AbstractC167027dH.A0Y(C05F.A0N), AbstractC167007dF.A0o("measurementType", enumC222959sa.ordinal()), AbstractC166987dD.A1L("data", fArr), AbstractC166987dD.A1L("timestampNs", Long.valueOf(j))));
    }
}
