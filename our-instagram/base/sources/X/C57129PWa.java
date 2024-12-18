package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.SoundSyncVideoLoader", f = "SoundSyncVideoLoader.kt", i = {0, 0, 0, 0, 0}, l = {289}, m = "onSoundSyncComplete", n = {"this", "destination$iv$iv", "igClipSegment", "isSkipSoundSync", "index$iv$iv"}, s = {"L$0", "L$1", "L$3", "Z$0", "I$0"})
/* renamed from: X.PWa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57129PWa extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ OX1 A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57129PWa(OX1 ox1, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0A = ox1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A0A.A01(this, false);
    }
}
