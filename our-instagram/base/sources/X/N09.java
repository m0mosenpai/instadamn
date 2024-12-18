package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class N09 extends OMu {
    public PhoneStateListener A00;
    public Integer A01;
    public Runnable A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final C54757OHm A08;
    public final C55038OZk A09;
    public final C53738Npq A0A;
    public final InterfaceC09390do A0B;
    public final C12W A0C;
    public volatile boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N09(Context context, AudioManager audioManager, C54757OHm c54757OHm, C55038OZk c55038OZk, C53738Npq c53738Npq, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz, OMO omo, C54156Nws c54156Nws, ExecutorService executorService, C12W c12w) {
        super(context, audioManager, c53738Npq, interfaceC58103PpS, c55000OUz, omo, c54156Nws, executorService);
        C14360o3.A0B(audioManager, 3);
        this.A09 = c55038OZk;
        this.A08 = c54757OHm;
        this.A0A = c53738Npq;
        this.A0C = c12w;
        this.A07 = AbstractC167007dF.A0J();
        this.A0B = C57549PgN.A00(context, EnumC09460dv.A02, 15);
    }

    public final void A0C() {
        EnumC53278NhG enumC53278NhG;
        EnumC53278NhG enumC53278NhG2 = this.aomCurrentAudioOutput;
        int i = this.A09.A05.A00;
        if (i != 1 && i != 2) {
            if (this.A0D) {
                enumC53278NhG = EnumC53278NhG.A05;
            } else if (this.aomIsHeadsetAttached) {
                enumC53278NhG = EnumC53278NhG.A04;
            } else {
                enumC53278NhG = EnumC53278NhG.A03;
            }
        } else {
            enumC53278NhG = EnumC53278NhG.A02;
        }
        this.aomCurrentAudioOutput = enumC53278NhG;
        if (enumC53278NhG2 != this.aomCurrentAudioOutput) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("determineAndSetCurrentAudioOutput from ");
            A1C.append(enumC53278NhG2);
            A1C.append(" to ");
            String A0v = AbstractC166997dE.A0v(this.aomCurrentAudioOutput, A1C);
            super.A05.A00(A0v, new Object[0]);
            this.audioManagerQplLogger.Cnc("current_audio_output_changed", A0v);
            A05();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r6.aomIsHeadsetAttached != false) goto L14;
     */
    @Override // X.OMu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r6 = this;
            super.A03()
            X.OZk r4 = r6.A09
            android.content.Context r3 = r6.A01
            r5 = 0
            boolean r1 = X.AbstractC53742Npu.A00()
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = X.AbstractC58317Pt9.A00(r0)
            if (r1 == 0) goto L1b
            int r1 = X.C02G.A00(r3, r2)
            r0 = -1
            if (r1 == r0) goto L28
        L1b:
            boolean r0 = X.AbstractC53742Npu.A00()
            if (r0 == 0) goto La5
            int r1 = r3.checkSelfPermission(r2)
            r0 = -1
            if (r1 != r0) goto La5
        L28:
            X.O1X r0 = new X.O1X
            r0.<init>(r6)
            r4.A01 = r0
            X.ObB r1 = r4.A05
            X.OGv r0 = r4.A04
            r1.A03(r0)
            X.OMO r2 = r6.A06
            r2.A00(r3)
            boolean r0 = r6.aomDisableEarpieceMode
            if (r0 == 0) goto L44
            boolean r1 = r6.aomIsHeadsetAttached
            r0 = 1
            if (r1 == 0) goto L45
        L44:
            r0 = 0
        L45:
            r6.A0D = r0
            boolean r0 = r6.A0D
            r2.A02(r0)
            r6.A0D()
            X.195 r0 = r6.A03
            X.AbstractC25229BEm.A1R(r0)
            java.lang.Runnable r1 = r6.A02
            if (r1 == 0) goto L5d
            android.os.Handler r0 = r6.A07
            r0.removeCallbacks(r1)
        L5d:
            java.lang.Runnable r4 = r6.A02
            if (r4 != 0) goto L68
            X.PL5 r4 = new X.PL5
            r4.<init>(r6)
            r6.A02 = r4
        L68:
            X.Npq r1 = r6.A0A
            boolean r0 = r1 instanceof X.N0A
            if (r0 == 0) goto Lc7
            X.N0A r1 = (X.N0A) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316151806169099(0x8105590004100b, double:3.0298188634025964E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9d
            X.12W r0 = r6.A0C
            X.19K r3 = X.AnonymousClass194.A02(r0)
            r2 = 0
            r1 = 34
            X.PZA r0 = new X.PZA
            r0.<init>(r4, r2, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r3)
            r6.A03 = r0
        L93:
            r6.A07()
            r6.A06()
            r6.A05()
            return
        L9d:
            android.os.Handler r2 = r6.A07
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r4, r0)
            goto L93
        La5:
            boolean r0 = r6.A04
            if (r0 == 0) goto Lb8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = "RtcAudioOutputManager"
            java.lang.String r1 = "Missed unregistering PhoneStateListener."
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            X.C0K8.A0O(r2, r1, r0)
            goto L28
        Lb8:
            r0 = 1
            r6.A04 = r0
            X.PL6 r1 = new X.PL6
            r1.<init>(r6)
            android.os.Handler r0 = r6.A07
            r0.post(r1)
            goto L28
        Lc7:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N09.A03():void");
    }

    @Override // X.OMu
    public final void A04() {
        super.A04();
        this.A0D = false;
        AbstractC25229BEm.A1R(this.A03);
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }

    public final void A0D() {
        A0C();
        C55124Obl.A02(this.audioRecordMonitor, "recording_config_on_updating_audio_output", null);
        this.A08.A00(this.aomCurrentAudioOutput);
    }
}
