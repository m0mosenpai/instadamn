package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.io.File;
import java.util.List;

/* renamed from: X.LXx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48274LXx implements MPZ {
    public final /* synthetic */ C101584hT A00;
    public final /* synthetic */ C101594hU A01;
    public final /* synthetic */ C47754L7a A02;
    public final /* synthetic */ FJ6 A03;

    @Override // X.MPZ
    public final /* synthetic */ void DEI(String str, int i, String str2) {
        C14360o3.A0B(str, 1);
        this.A03.A00.post(new RunnableC49886M1f(this.A02));
    }

    @Override // X.MPZ
    public final void DqE(String str, boolean z) {
        C14360o3.A0B(str, 0);
        C101584hT c101584hT = this.A00;
        C101594hU c101594hU = this.A01;
        String canonicalPath = new File(java.net.URI.create(str)).getCanonicalPath();
        String str2 = c101594hU.A0F;
        Long l = c101594hU.A0C;
        float f = c101594hU.A01;
        Integer num = c101594hU.A0B;
        CreativeConfigIntf creativeConfigIntf = c101594hU.A00;
        String str3 = c101594hU.A0G;
        long j = c101594hU.A02;
        boolean z2 = c101594hU.A0N;
        boolean z3 = c101594hU.A0Q;
        boolean z4 = c101594hU.A0P;
        String str4 = c101594hU.A0H;
        C75363a3 c75363a3 = c101594hU.A09;
        ImageInfo imageInfo = c101594hU.A06;
        String str5 = c101594hU.A0I;
        boolean z5 = c101594hU.A0R;
        boolean z6 = c101594hU.A0S;
        boolean z7 = c101594hU.A0T;
        boolean z8 = c101594hU.A0V;
        EnumC40111tc enumC40111tc = c101594hU.A07;
        Long l2 = c101594hU.A0D;
        MusicOverlayStickerModel musicOverlayStickerModel = c101594hU.A08;
        String str6 = c101594hU.A0L;
        Long l3 = c101594hU.A0E;
        List list = c101594hU.A0M;
        ImageUrl imageUrl = c101594hU.A04;
        InterfaceC216113n interfaceC216113n = c101594hU.A03;
        C101634hY c101634hY = c101594hU.A05;
        AbstractC25229BEm.A1L(str3, 5, c75363a3);
        C14360o3.A0B(enumC40111tc, 20);
        C14360o3.A0B(list, 25);
        C14360o3.A0B(interfaceC216113n, 27);
        c101584hT.A04 = new C101594hU(interfaceC216113n, imageUrl, c101634hY, creativeConfigIntf, imageInfo, enumC40111tc, musicOverlayStickerModel, c75363a3, num, l, l2, l3, str2, str3, str4, str5, canonicalPath, str6, list, f, j, z2, true, z3, z4, z5, z6, z7, z8);
        this.A03.A00.post(new RunnableC49887M1g(this.A02));
    }

    public C48274LXx(C101584hT c101584hT, C101594hU c101594hU, C47754L7a c47754L7a, FJ6 fj6) {
        this.A00 = c101584hT;
        this.A01 = c101594hU;
        this.A03 = fj6;
        this.A02 = c47754L7a;
    }
}
