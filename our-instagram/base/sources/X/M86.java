package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M86 implements Callable {
    public final /* synthetic */ C26069Bfx A00;
    public final /* synthetic */ C7TG A01;
    public final /* synthetic */ C3o9 A02;
    public final /* synthetic */ boolean A03;

    public M86(C26069Bfx c26069Bfx, C7TG c7tg, C3o9 c3o9, boolean z) {
        this.A01 = c7tg;
        this.A02 = c3o9;
        this.A00 = c26069Bfx;
        this.A03 = z;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [X.1eW, X.1ae, X.1OW] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        L1W l1w;
        C7TG c7tg = this.A01;
        DirectThreadKey A01 = JRE.A01(this.A02);
        C26069Bfx c26069Bfx = this.A00;
        boolean z = this.A03;
        Boolean A0a = AbstractC166997dE.A0a();
        Context context = c7tg.A02;
        UserSession userSession = c7tg.A03;
        C40121td A012 = C40121td.A0G.A01(context, userSession);
        AbstractC167017dG.A1R(c26069Bfx, A012);
        ShareType shareType = ShareType.A0E;
        C47Z A0i = AbstractC43594JPz.A0i();
        EnumC40111tc enumC40111tc = EnumC40111tc.A0E;
        A0i.A0T(enumC40111tc);
        String str = c26069Bfx.A01;
        A0i.A2t = str;
        A0i.A3L = str;
        A0i.A0c(shareType);
        A0i.A0T(enumC40111tc);
        A0i.A2s = c26069Bfx.A00;
        A0i.A3B = c26069Bfx.A03;
        A0i.A2u = c26069Bfx.A02;
        A0i.A53 = true;
        A0i.A6C = true;
        PendingMediaStore pendingMediaStore = A012.A04;
        pendingMediaStore.A0C(enumC40111tc, AbstractC43592JPx.A16(A0i.A35));
        pendingMediaStore.A0D(A0i, A0i.A35);
        A012.A05.A04();
        A0i.A0a(EnumC915447k.A09);
        C40121td.A02(A0i);
        C40121td.A04(A0i, A012, "pre-upload");
        C7Q4 A00 = AbstractC47064KrL.A00(A0i);
        C81663kb B3U = C2JD.A00(userSession).B3U(A01);
        if (B3U != null) {
            l1w = B3U.B2W();
        } else {
            l1w = null;
        }
        JTa A013 = AbstractC31277Doz.A01(userSession, l1w, A0a, C31191eO.class, null, "direct_file_share", null, z, c7tg.A00);
        Long A014 = LCT.A01(userSession, A01);
        long A05 = AbstractC31177DnL.A05();
        C14360o3.A0B(A01, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A013, A01, A014, A05);
        abstractC29011ae.A02 = A00.A06;
        abstractC29011ae.A01 = A01;
        abstractC29011ae.A00 = A00;
        AbstractC31173DnH.A1U(userSession, abstractC29011ae);
        return C0eB.A00;
    }
}
