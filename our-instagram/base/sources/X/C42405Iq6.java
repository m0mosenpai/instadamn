package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Iq6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42405Iq6 implements InterfaceC50452MPg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C37658Ghr A01;
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;

    @Override // X.InterfaceC50452MPg
    public final void D8J(C47Z c47z) {
        MediaComposition mediaComposition = c47z.A0r;
        if (mediaComposition == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "ClipsMidcardVirtualVideoPlayerController: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A();
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(this.A00);
            map.put(valueOf, mediaComposition);
            this.A03.put(valueOf, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(AbstractC66047Tyk.A00(null, EnumC1125356h.VIDEO, mediaComposition))));
        } catch (J6R e) {
            C18950wb c18950wb = C18950wb.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("ClipsMidcardVirtualVideoPlayerController: draft VVP failed, error: ");
            AbstractC166987dD.A1T(c18950wb, AbstractC166997dE.A0v(e.getStackTrace(), A1C), 817892914);
        }
        Map map2 = this.A04;
        if (map2.size() != 4) {
            return;
        }
        ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController = this.A02;
        clipsMidcardVirtualVideoPlayerController.A00 = true;
        AbstractC37302Gc3.A1P(clipsMidcardVirtualVideoPlayerController.A05);
        C41594Iah c41594Iah = clipsMidcardVirtualVideoPlayerController.sequentialPlayerManager;
        if (c41594Iah == null) {
            C14360o3.A0F("sequentialPlayerManager");
            throw C00O.createAndThrow();
        }
        Map map3 = this.A03;
        List list = this.A01.A0D;
        AbstractC167007dF.A1D(map3, 1, list);
        c41594Iah.A04 = map2;
        c41594Iah.A03 = map3;
        c41594Iah.A02 = list;
        if (c41594Iah.A00 == -1) {
            c41594Iah.A00 = 0;
        }
        C41594Iah.A00(c41594Iah);
    }

    public C42405Iq6(C37658Ghr c37658Ghr, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, Map map, Map map2, int i) {
        this.A04 = map;
        this.A00 = i;
        this.A03 = map2;
        this.A02 = clipsMidcardVirtualVideoPlayerController;
        this.A01 = c37658Ghr;
    }

    @Override // X.InterfaceC50452MPg
    public final void D8I(String str) {
        AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("ClipsMidcardVirtualVideoPlayerController: failed to generate pending media from draft. failure message is: ", MSV.A00(92)), 817892914);
    }
}
