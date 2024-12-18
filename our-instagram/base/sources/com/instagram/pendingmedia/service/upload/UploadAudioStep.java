package com.instagram.pendingmedia.service.upload;

import X.AbstractC06930Yk;
import X.AbstractC25228BEl;
import X.C06090Tz;
import X.C115435Kd;
import X.C14360o3;
import X.C16920sk;
import X.C18U;
import X.C47Z;
import X.C70353Dt;
import X.EnumC115415Kb;
import X.EnumC915447k;
import X.InterfaceC70363Du;
import X.MQE;
import X.NRJ;
import X.NRL;
import X.OI2;
import X.OXD;
import X.W63;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* loaded from: classes9.dex */
public final class UploadAudioStep implements MQE {
    public final OI2 A00;
    public final boolean A01;

    private final NRL A01(W63 w63, OXD oxd) {
        C47Z c47z = oxd.A0C;
        oxd.A03 = null;
        if (A03(oxd.A0B, c47z)) {
            c47z.A2I = AbstractC25228BEl.A13(w63.A05);
        }
        c47z.A3v = w63.A05;
        c47z.A0Z(EnumC915447k.A09);
        OI2 oi2 = this.A00;
        InterfaceC70363Du interfaceC70363Du = oi2.A01;
        C47Z c47z2 = oi2.A00;
        C16920sk A0E = AbstractC06930Yk.A0E();
        C14360o3.A0B(A0E, 1);
        ((C70353Dt) interfaceC70363Du).A08(c47z2, A0E, -1L);
        return NRL.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.OXD r19, com.instagram.pendingmedia.service.upload.UploadAudioStep r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadAudioStep.A02(X.OXD, com.instagram.pendingmedia.service.upload.UploadAudioStep, X.1Ds):java.lang.Object");
    }

    public static final boolean A03(UserSession userSession, C47Z c47z) {
        if (c47z.A6C || (c47z.A0D() == ShareType.A0E && C18U.A06(C06090Tz.A05, userSession, 36314167533505003L))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.MQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F8t(X.OXD r13, X.InterfaceC23621Ds r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadAudioStep.F8t(X.OXD, X.1Ds):java.lang.Object");
    }

    @Override // X.MQE
    public final String getName() {
        return "UploadAudio";
    }

    public UploadAudioStep(OI2 oi2, boolean z) {
        this.A00 = oi2;
        this.A01 = z;
    }

    private final NRJ A00(OXD oxd, String str) {
        Throwable th;
        C115435Kd A00 = FbUploaderUtil.A00(oxd, str);
        oxd.A0C.A0Z(EnumC915447k.A07);
        OI2 oi2 = this.A00;
        C115435Kd c115435Kd = oxd.A03;
        if (c115435Kd != null) {
            th = c115435Kd.A08;
        } else {
            th = null;
        }
        EnumC115415Kb enumC115415Kb = A00.A01;
        C14360o3.A0B(str, 0);
        ((C70353Dt) oi2.A01).EHf(enumC115415Kb, oi2.A00, str, th);
        return new NRJ(A00);
    }
}
