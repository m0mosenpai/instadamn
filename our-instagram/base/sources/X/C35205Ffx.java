package X;

import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import com.meta.foa.cds.CdsOpenScreenDismissCallback;

/* renamed from: X.Ffx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35205Ffx {
    public CdsOpenScreenDismissCallback A04;
    public U6G A02 = C65981Txa.A0R;
    public U6H A03 = C65981Txa.A0S;
    public EnumC68205VFx A00 = C65981Txa.A0N;
    public EnumC68201VFt A01 = C65981Txa.A0Q;
    public Integer A05 = C05F.A0C;

    public static C65981Txa A02(C68894Vdq c68894Vdq, EnumC68205VFx enumC68205VFx, EnumC68201VFt enumC68201VFt, U6G u6g, U6H u6h, CdsOpenScreenDismissCallback cdsOpenScreenDismissCallback, Integer num, boolean z) {
        EnumC68205VFx enumC68205VFx2 = C65981Txa.A0N;
        return new C65981Txa(c68894Vdq, null, null, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx, null, EnumC68200VFs.A04, enumC68201VFt, u6g, u6h, cdsOpenScreenDismissCallback, num, null, null, C05F.A00, null, 16542, false, z, false, false, false);
    }

    public static C35205Ffx A00() {
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A07;
        c35205Ffx.A02 = U6G.A05;
        return c35205Ffx;
    }

    public static C65981Txa A01(C35205Ffx c35205Ffx, Object obj, int i) {
        c35205Ffx.A04 = new CdsOpenScreenCallerDismissCallback(new GJT(obj, i));
        return c35205Ffx.A03();
    }

    public final C65981Txa A03() {
        EnumC68205VFx enumC68205VFx = C65981Txa.A0N;
        Integer num = this.A05;
        U6G u6g = this.A02;
        U6H u6h = this.A03;
        EnumC68205VFx enumC68205VFx2 = this.A00;
        EnumC68201VFt enumC68201VFt = this.A01;
        return new C65981Txa(null, null, null, CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx2, null, EnumC68200VFs.A04, enumC68201VFt, u6g, u6h, this.A04, num, null, null, C05F.A00, null, 16542, false, false, false, false, false);
    }
}
