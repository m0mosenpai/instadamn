package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42404Iq5 implements InterfaceC50452MPg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C37658Ghr A02;
    public final /* synthetic */ C37641Gha A03;

    public C42404Iq5(C37658Ghr c37658Ghr, C37641Gha c37641Gha, int i, int i2) {
        this.A03 = c37641Gha;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c37658Ghr;
    }

    @Override // X.InterfaceC50452MPg
    public final void D8I(String str) {
        AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("ClipsMidCardMegacardVideoPlayerViewModel: failed to generate pending media from draft. failure message is: ", MSV.A00(92)), 817892914);
    }

    @Override // X.InterfaceC50452MPg
    public final void D8J(C47Z c47z) {
        MediaComposition mediaComposition = c47z.A0r;
        if (mediaComposition == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "ClipsMidCardMegacardVideoPlayerViewModel: generated draft mediaComposition is null", 817892914);
            return;
        }
        try {
            mediaComposition.A0A();
            AbstractC25227BEk.A1O(mediaComposition, this.A03.A07, this.A01);
        } catch (J6R e) {
            C18950wb c18950wb = C18950wb.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("ClipsMidCardMegacardVideoPlayerViewModel: draft VVP failed, error: ");
            AbstractC166987dD.A1T(c18950wb, AbstractC166997dE.A0v(e.getStackTrace(), A1C), 817892914);
        }
        C37641Gha c37641Gha = this.A03;
        Map map = c37641Gha.A07;
        int size = map.size();
        int i = this.A00;
        if (size != i) {
            return;
        }
        C41711wL.A01(c37641Gha.A06).A0C(i);
        IMB imb = c37641Gha.A00;
        if (imb == null) {
            return;
        }
        List list = this.A02.A0D;
        Number number = (Number) c37641Gha.A02.getValue();
        C14360o3.A0B(list, 1);
        imb.A02 = map;
        imb.A01 = list;
        imb.A00(AbstractC167017dG.A0K(number));
    }
}
