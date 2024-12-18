package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.My1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51965My1 extends C83P {
    public final int A00;
    public final Object A01;

    public C51965My1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C83P
    public final void A04() {
        if (this.A00 != 0) {
            super.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r6 == X.EnumC53240Ngd.A09) goto L18;
     */
    @Override // X.C83P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51965My1.A06(java.lang.String):void");
    }

    @Override // X.C83P
    public final void A07(String str) {
        if (this.A00 != 0) {
            super.A07(str);
        } else {
            ((AAB) this.A01).A05.A00.A02().A02(EnumC223239t9.A0L, "", null);
        }
    }

    @Override // X.C83P
    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        String str2;
        C51887MwV A00;
        if (this.A00 != 0) {
            AKM akm = (AKM) this.A01;
            EnumC201398vU enumC201398vU = effectManifest.specifiedCameraFacing;
            InterfaceC179927yi interfaceC179927yi = akm.A00;
            if (interfaceC179927yi != null && ((enumC201398vU == EnumC201398vU.BACK && ((AbstractC179917yh) interfaceC179927yi).A00 == 1) || (enumC201398vU == EnumC201398vU.FRONT && ((AbstractC179917yh) interfaceC179927yi).A00 == 0))) {
                interfaceC179927yi.Epf();
            }
            O4V o4v = akm.A05;
            if (o4v != null) {
                C14360o3.A0B(str, 0);
                NU5 nu5 = o4v.A00;
                CameraAREffect cameraAREffect = NU5.A00(nu5).A05;
                if (cameraAREffect != null) {
                    str2 = cameraAREffect.A0K;
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    A00 = C51887MwV.A00(effectAttribution, null, null, null, null, null, NU5.A00(nu5), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -262145, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    NU5.A0A(nu5, A00);
                    return;
                }
                return;
            }
            return;
        }
        ((AAB) this.A01).A05.A00.A03 = effectAttribution;
    }

    @Override // X.C83P
    public final void A09(String str) {
        if (this.A00 != 0) {
            super.A09(str);
        } else {
            ((AAB) this.A01).A05.A00.A02().A02(EnumC223239t9.A0M, "", null);
        }
    }

    @Override // X.C83P
    public final void A0A(String str, Throwable th) {
        String str2;
        if (this.A00 != 0) {
            O4V o4v = ((AKM) this.A01).A05;
            if (o4v != null) {
                th.getMessage();
                C14360o3.A0B(str, 0);
                NU5 nu5 = o4v.A00;
                nu5.A0P.A02.put(EnumC53240Ngd.A08, null);
                NU5.A0D(nu5, C05F.A0C);
                if (nu5.A0F.A00() instanceof NUJ) {
                    CameraAREffect cameraAREffect = nu5.A03;
                    if (cameraAREffect != null) {
                        str2 = cameraAREffect.A0K;
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str2, str)) {
                        C05A c05a = nu5.A0X;
                        EnumC53154Nf9 enumC53154Nf9 = EnumC53154Nf9.A02;
                        C14360o3.A0B(c05a, 0);
                        c05a.F8m(enumC53154Nf9);
                        OWf oWf = nu5.A0Q;
                        oWf.A02(PAZ.A00);
                        Integer num = C05F.A15;
                        NU1.A01(nu5.A0N.A00, C05F.A02, System.currentTimeMillis());
                        oWf.A02(new PAT(num));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0B(str, 0);
        C214899fR c214899fR = ((AAB) this.A01).A05.A00;
        C176567tE.A00(new RunnableC24292Apx(c214899fR));
        c214899fR.A02().A02(EnumC223239t9.A0K, "", th.getMessage());
        throw AbstractC166987dD.A18(str);
    }
}
