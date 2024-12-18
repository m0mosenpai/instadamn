package com.instagram.direct.messagethread.voice.transcription;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1580477o;
import X.C38321qM;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.L7E;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1", f = "VoiceMessageTranscriptionApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class VoiceMessageTranscriptionApi$startTranscription$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1580477o A01;
    public final /* synthetic */ L7E A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionApi$startTranscription$1(C1580477o c1580477o, L7E l7e, C38321qM c38321qM, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = c1580477o;
        this.A02 = l7e;
        this.A04 = str;
        this.A03 = c38321qM;
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new VoiceMessageTranscriptionApi$startTranscription$1(this.A01, this.A02, this.A03, this.A04, interfaceC23621Ds, this.A00);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageTranscriptionApi$startTranscription$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
