package com.instagram.direct.messagethread.voice.transcription;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C129805tk;
import X.C14360o3;
import X.C1580477o;
import X.C46102Kb2;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.L7E;
import X.MSW;
import com.meta.cal.AudioSession;
import java.util.zip.CRC32;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1", f = "VoiceMessageTranscriptionApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class VoiceMessageTranscriptionApi$submitAudioForProcessing$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C1580477o A03;
    public final /* synthetic */ L7E A04;
    public final /* synthetic */ byte[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionApi$submitAudioForProcessing$1(C1580477o c1580477o, L7E l7e, InterfaceC23621Ds interfaceC23621Ds, byte[] bArr, byte b, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A03 = c1580477o;
        this.A04 = l7e;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = b;
        this.A05 = bArr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C1580477o c1580477o = this.A03;
        L7E l7e = this.A04;
        int i = this.A01;
        int i2 = this.A02;
        return new VoiceMessageTranscriptionApi$submitAudioForProcessing$1(c1580477o, l7e, interfaceC23621Ds, this.A05, this.A00, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageTranscriptionApi$submitAudioForProcessing$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AudioSession A02;
        AbstractC09560e7.A00(obj);
        C1580477o c1580477o = this.A03;
        L7E l7e = this.A04;
        int i = this.A01;
        C46102Kb2 A00 = C1580477o.A00(c1580477o, l7e, i);
        A02 = c1580477o.A02(A00, this.A00, this.A02, i);
        if (A02 != null) {
            byte[] bArr = this.A05;
            C129805tk c129805tk = c1580477o.A02;
            if (c129805tk != null) {
                c129805tk.A00.markerPoint(331815788, i, "AUDIO_PROCESSING_START");
            }
            A02.submitAudioForProcessing(bArr);
            A02.complete();
            c1580477o.A03.put(A00, A02);
        }
        CRC32 crc32 = new CRC32();
        crc32.update(this.A05);
        C14360o3.A07(String.format("%x", AbstractC166997dE.A1b(MSW.A0z(crc32.getValue()), 1)));
        return C0eB.A00;
    }
}
