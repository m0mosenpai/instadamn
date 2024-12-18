package X;

import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;

/* loaded from: classes11.dex */
public final class W1X {
    public final C65981Txa A00;

    public W1X(CdsBottomSheetDimmingBehaviour cdsBottomSheetDimmingBehaviour, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, EnumC68205VFx enumC68205VFx, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, EnumC68200VFs enumC68200VFs, EnumC68201VFt enumC68201VFt, U6G u6g, U6H u6h, CPZ cpz, Integer num, Integer num2, boolean z) {
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback;
        EnumC68200VFs enumC68200VFs2 = enumC68200VFs;
        AbstractC25234BEr.A0j(1, u6h, u6g, enumC68205VFx, enumC68201VFt);
        C69513Vps c69513Vps = C65981Txa.A0O;
        if (cpz != null) {
            cdsOpenScreenCallerDismissCallback = new CdsOpenScreenCallerDismissCallback(new GJT(cpz, 8));
        } else {
            cdsOpenScreenCallerDismissCallback = null;
        }
        if (cdsOpenScreenConfig$BottomSheetMargins == null && AbstractC68607VXi.A00()) {
            enumC68200VFs2 = EnumC68200VFs.A05;
        }
        this.A00 = new C65981Txa(null, null, null, cdsBottomSheetDimmingBehaviour, cdsBottomSheetTopSpan, enumC68205VFx, cdsOpenScreenConfig$BottomSheetMargins, enumC68200VFs2, enumC68201VFt, u6g, u6h, cdsOpenScreenCallerDismissCallback, num, num2, null, null, null, -1, false, false, false, false, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public W1X() {
        /*
            r13 = this;
            r2 = 0
            X.U6H r8 = X.C65981Txa.A0S
            java.lang.Integer r10 = X.C05F.A0C
            X.U6G r7 = X.C65981Txa.A0R
            X.VFx r3 = X.C65981Txa.A0N
            X.VFt r6 = X.C65981Txa.A0Q
            X.VFs r5 = X.EnumC68200VFs.A04
            r12 = 0
            com.meta.foa.cds.CdsBottomSheetDimmingBehaviour$Default r1 = com.meta.foa.cds.CdsBottomSheetDimmingBehaviour.Default.A00
            r0 = r13
            r4 = r2
            r9 = r2
            r11 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1X.<init>():void");
    }
}
