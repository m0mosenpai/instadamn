package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.VmN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69377VmN {
    public ByteBuffer A00 = AbstractC65702TsY.A0j(0);
    public final InterfaceC71995XEj A01;
    public final XEI A02;
    public final C55070OaQ A03;
    public final WDG A04;
    public final C69489VoC A05;
    public final ByteBuffer[] A06;

    public C69377VmN(InterfaceC71995XEj interfaceC71995XEj, XEI xei, C55070OaQ c55070OaQ, WDG wdg, C69489VoC c69489VoC) {
        HashMap A07;
        int i = 0;
        this.A01 = interfaceC71995XEj;
        this.A02 = xei;
        this.A05 = c69489VoC;
        MediaComposition mediaComposition = c69489VoC.A08;
        if (mediaComposition != null && (A07 = mediaComposition.A07(EnumC1125356h.AUDIO)) != null) {
            i = A07.size();
        }
        this.A06 = new ByteBuffer[i];
        this.A03 = c55070OaQ;
        this.A04 = wdg;
    }
}
