package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class P8Q implements InterfaceC140606Xo {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C51332Mlt A01;
    public final /* synthetic */ C63972vI A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public P8Q(Reel reel, C51332Mlt c51332Mlt, C63972vI c63972vI, Integer num, String str, String str2, List list) {
        this.A02 = c63972vI;
        this.A00 = reel;
        this.A06 = list;
        this.A01 = c51332Mlt;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = num;
    }

    @Override // X.InterfaceC140606Xo
    public final void Cge(long j, boolean z) {
        C63972vI c63972vI = this.A02;
        Reel reel = this.A00;
        ArrayList A00 = C63972vI.A00(c63972vI, this.A06);
        C51332Mlt c51332Mlt = this.A01;
        String str = this.A05;
        C3G2 c3g2 = C3G2.A1F;
        if (!C14360o3.A0K(str, "highlights_in_feed")) {
            c3g2 = C3G2.A1G;
        }
        String str2 = this.A04;
        if (str2 == null) {
            str2 = "";
        }
        Integer num = this.A03;
        RectF A0G = AbstractC13880nE.A0G(c51332Mlt.A00);
        AbstractC60672pq abstractC60672pq = c63972vI.A03;
        C3M4 A06 = C1OU.A06(abstractC60672pq.requireActivity(), c63972vI.A04);
        A06.A0U(null, A0G, abstractC60672pq, reel, c3g2, new C56528P8a(A0G, c3g2, A06, c63972vI, num, str2, A00, j, z), -1);
    }
}
