package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: classes9.dex */
public final class PS8 implements Runnable {
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ C51996Myi A01;
    public final /* synthetic */ boolean A02;

    public PS8(AudioOutputRoute audioOutputRoute, C51996Myi c51996Myi, boolean z) {
        this.A00 = audioOutputRoute;
        this.A01 = c51996Myi;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        EnumC53278NhG enumC53278NhG;
        AudioOutputRoute audioOutputRoute = this.A00;
        C51996Myi c51996Myi = this.A01;
        boolean A0K = C14360o3.A0K(audioOutputRoute, AudioOutputRoute.SPEAKER);
        c51996Myi.A03 = A0K;
        boolean z = this.A02;
        if ((z || (c51996Myi.A0C && !A0K)) && C14360o3.A0K(audioOutputRoute.identifier, AudioOutputRoute.EARPIECE.identifier)) {
            audioOutputRoute = AudioOutputRoute.SPEAKER;
        }
        if (!C14360o3.A0K(c51996Myi.A02, audioOutputRoute.identifier)) {
            if (!audioOutputRoute.identifier.equals(AudioOutputRoute.UNKNOWN.identifier)) {
                C55000OUz c55000OUz = c51996Myi.A0A;
                if (c55000OUz != null) {
                    c55000OUz.A00(AnonymousClass001.A0R("change audio ", audioOutputRoute.name), new Object[0]);
                }
                if (!audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH) && !audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_A2DP) && !audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_LE) && !audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_HFP)) {
                    if (audioOutputRoute.equals(AudioOutputRoute.SPEAKER)) {
                        enumC53278NhG = EnumC53278NhG.A05;
                    } else if (audioOutputRoute.equals(AudioOutputRoute.EARPIECE)) {
                        enumC53278NhG = EnumC53278NhG.A03;
                    } else if (audioOutputRoute.equals(AudioOutputRoute.HEADSET)) {
                        enumC53278NhG = EnumC53278NhG.A04;
                    } else {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("audioOutput = ");
                        A1C.append(audioOutputRoute);
                        throw AbstractC166987dD.A12(AbstractC166997dE.A0x(" is not convertible", A1C));
                    }
                } else {
                    enumC53278NhG = EnumC53278NhG.A02;
                }
                c51996Myi.A09.A00.A08(enumC53278NhG);
            }
            c51996Myi.A02 = audioOutputRoute.identifier;
        }
        if (c51996Myi.A05 && z != c51996Myi.A06) {
            OMu oMu = c51996Myi.A09.A00;
            if (oMu.A0B() || oMu.A0A()) {
                oMu.A09(AbstractC167007dF.A1M(z ? 1 : 0));
            }
            oMu.aomShouldSpeakerOnHeadsetUnplug = z;
            c51996Myi.A06 = z;
        }
        C54580O9h c54580O9h = c51996Myi.A09;
        boolean z2 = !z ? 1 : 0;
        OMu oMu2 = c54580O9h.A00;
        boolean z3 = !z2;
        if (oMu2 instanceof N09) {
            ((N09) oMu2).A06 = z3;
        }
    }
}
