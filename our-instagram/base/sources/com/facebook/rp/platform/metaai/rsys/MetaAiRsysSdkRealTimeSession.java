package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C12W;
import X.C19L;
import X.C51999Myp;
import X.C52020MzZ;
import X.C57549PgN;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.OEE;
import X.OFJ;
import X.PZW;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;

/* loaded from: classes9.dex */
public final class MetaAiRsysSdkRealTimeSession {
    public final OFJ A00;
    public final C51999Myp A01;
    public final C52020MzZ A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C12W A06;
    public final C19L A07;

    public final void A02(boolean z) {
        EnableAudioParameters enableAudioParameters = new EnableAudioParameters(null, 1, z);
        AudioApi audioApi = (AudioApi) C51999Myp.A00(this.A01);
        if (audioApi != null) {
            audioApi.enableAudio(AbstractC16960so.A1M(enableAudioParameters));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r12) {
        /*
            r11 = this;
            r3 = 31
            boolean r0 = X.MAN.A02(r12, r3)
            if (r0 == 0) goto L53
            r6 = r12
            X.MAN r6 = (X.MAN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L59
            java.lang.Object r0 = r6.A01
            com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession r0 = (com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession) r0
            X.AbstractC09560e7.A00(r1)
        L28:
            X.19L r1 = r0.A07
            r0 = 0
            X.AnonymousClass194.A05(r0, r1)
            X.0eB r4 = X.C0eB.A00
        L30:
            return r4
        L31:
            X.AbstractC09560e7.A00(r1)
            X.Myp r2 = r11.A01
            com.facebook.rsys.callmanager.gen.CallApi r1 = r2.A01()
            java.lang.String r0 = "end_from_MetaAiRsysSdkRealTimeSession"
            r1.end(r3, r0, r3)
            java.lang.String r5 = r2.A05
            X.PhA r7 = X.C57598PhA.A00
            X.PhB r8 = X.C57599PhB.A00
            r6.A01 = r11
            r6.A00 = r3
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = X.ONE.A00(r5, r6, r7, r8, r9)
            if (r0 == r4) goto L30
            r0 = r11
            goto L28
        L53:
            X.MAN r6 = new X.MAN
            r6.<init>(r11, r12, r3)
            goto L16
        L59:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession.A00(X.1Ds):java.lang.Object");
    }

    public final void A01(boolean z) {
        OEE oee = (OEE) this.A05.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        if (oee.A01) {
            oee.A00 = valueOf;
            if (valueOf != null) {
                oee.A02.Egh(valueOf);
            }
        }
        PZW.A01(this, this.A07, 0, z);
    }

    public MetaAiRsysSdkRealTimeSession(C51999Myp c51999Myp, C52020MzZ c52020MzZ, C12W c12w) {
        AbstractC167017dG.A1R(c52020MzZ, c12w);
        this.A01 = c51999Myp;
        this.A02 = c52020MzZ;
        this.A06 = c12w;
        this.A07 = AnonymousClass194.A02(new AnonymousClass197(null).plus(c12w));
        this.A00 = new OFJ(c51999Myp, c12w);
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A05 = C57549PgN.A00(this, enumC09460dv, 13);
        this.A03 = C57549PgN.A00(this, enumC09460dv, 11);
        this.A04 = C57549PgN.A00(this, enumC09460dv, 12);
    }
}
