package X;

/* renamed from: X.7se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176217se {
    public InterfaceC175967sB A00;
    public final /* synthetic */ C176177sa A01;

    public C176217se(C176177sa c176177sa) {
        this.A01 = c176177sa;
    }

    public final void A00(C212399b8 c212399b8) {
        C176177sa c176177sa = this.A01;
        if (c176177sa.A06 != null && c212399b8.A01 == 22004) {
            c176177sa.A0C.A01("idAPEn");
            ABV abv = c176177sa.A06;
            C212409b9 c212409b9 = new C212409b9(c212399b8);
            C176097sS c176097sS = abv.A02;
            c176097sS.A04(c212409b9);
            c176097sS.A06(abv.A01);
            c176177sa.A06 = null;
            return;
        }
        c176177sa.A0C.A01("idAPe");
        c176177sa.A0F.ClA(c212399b8, "inprogress_recording_audio_failure", "AudioRecordingTrack", "", "low", "AudioPipelineRecorder.Output", c176177sa.hashCode());
    }

    public final void A01(C73493YFw c73493YFw, int i, long j) {
        C176177sa c176177sa = this.A01;
        if (c176177sa.A06 != null) {
            c176177sa.A0C.A01("idAP");
            InterfaceC176037sM interfaceC176037sM = c176177sa.A0F;
            interfaceC176037sM.Ckz(19, "recording_start_audio_finished");
            AH7 ah7 = c176177sa.A01;
            if (ah7 != null) {
                interfaceC176037sM.ABc(19, "isEffectOnDuringRecording", String.valueOf(ah7.A09));
            }
            c176177sa.A06.A00();
            c176177sa.A06 = null;
        }
        if (c176177sa.A0J) {
            c176177sa.A03.COX(c73493YFw, i, j);
        } else {
            String.format(null, "[DROP] Audio sample dropped at %d us", Long.valueOf(j));
        }
    }

    public final void A02(byte[] bArr, int i, long j) {
        C176177sa c176177sa = this.A01;
        if (c176177sa.A06 != null) {
            c176177sa.A0C.A01("idAP");
            InterfaceC176037sM interfaceC176037sM = c176177sa.A0F;
            interfaceC176037sM.Ckz(19, "recording_start_audio_finished");
            AH7 ah7 = c176177sa.A01;
            if (ah7 != null) {
                interfaceC176037sM.ABc(19, "isEffectOnDuringRecording", String.valueOf(ah7.A09));
            }
            c176177sa.A06.A00();
            c176177sa.A06 = null;
        }
        if (c176177sa.A0J) {
            c176177sa.A03.COY(bArr, i, j);
        } else {
            String.format(null, "[DROP] Audio sample dropped at %d us", Long.valueOf(j));
        }
    }
}
