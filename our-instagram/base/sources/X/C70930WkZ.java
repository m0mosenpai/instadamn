package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WkZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70930WkZ implements GZ9 {
    public final int A00;
    public final Object A01;

    public C70930WkZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(hashtag, 0);
                C31985E3n c31985E3n = (C31985E3n) this.A01;
                if (c31985E3n.getBindingAdapterPosition() == -1) {
                    return;
                }
                C34440FGe c34440FGe = c31985E3n.A05;
                int bindingAdapterPosition = c31985E3n.getBindingAdapterPosition();
                C31440Drk c31440Drk = c34440FGe.A00;
                AbstractC31433Drd abstractC31433Drd = c31440Drk.A03;
                if (abstractC31433Drd != null) {
                    abstractC31433Drd.A01(hashtag, bindingAdapterPosition);
                }
                c31440Drk.A0C.run();
                return;
            case 1:
                V7n v7n = (V7n) this.A01;
                v7n.A0D.A02(V7n.A00(v7n), ((V8M) v7n).A03, v7n.A0C, hashtag, "header_follow_button");
                v7n.A03(hashtag, true);
                C69534Vqy c69534Vqy = v7n.A0I;
                if (c69534Vqy.A00() != null && c69534Vqy.A00().A05) {
                    v7n.A0B.A00();
                    V7n.A01(v7n);
                }
                AbstractC25651Mw.A00(v7n.A08).E4s(new C70033Cn(hashtag, false));
                return;
            case 2:
                C14360o3.A0B(hashtag, 0);
                V1W v1w = (V1W) this.A01;
                C63822v3 c63822v3 = v1w.A03;
                if (c63822v3 == null) {
                    str = "hashtagApi";
                } else {
                    UserSession userSession = v1w.A01;
                    if (userSession == null) {
                        str = "viewerUserSession";
                    } else {
                        c63822v3.A02(V1W.A01(hashtag, v1w), userSession, v1w.A08, hashtag, "following_list_follow_button");
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                V1E v1e = (V1E) this.A01;
                v1e.A02.A05(v1e.A01, new C70925WkU(v1e, 2), hashtag, "header_follow_button");
                return;
        }
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(hashtag, 0);
                C31985E3n c31985E3n = (C31985E3n) this.A01;
                if (c31985E3n.getBindingAdapterPosition() == -1) {
                    return;
                }
                C34440FGe c34440FGe = c31985E3n.A05;
                int bindingAdapterPosition = c31985E3n.getBindingAdapterPosition();
                AbstractC31433Drd abstractC31433Drd = c34440FGe.A00.A03;
                if (abstractC31433Drd == null) {
                    return;
                }
                abstractC31433Drd.A02(hashtag, bindingAdapterPosition);
                return;
            case 1:
                V7n v7n = (V7n) this.A01;
                v7n.A0D.A03(V7n.A00(v7n), ((V8M) v7n).A03, v7n.A0C, hashtag, "header_follow_button");
                v7n.A03(hashtag, false);
                V7n.A01(v7n);
                AbstractC25651Mw.A00(v7n.A08).E4s(new C70033Cn(hashtag, false));
                return;
            case 2:
                C14360o3.A0B(hashtag, 0);
                V1W v1w = (V1W) this.A01;
                C63822v3 c63822v3 = v1w.A03;
                if (c63822v3 == null) {
                    str = "hashtagApi";
                } else {
                    UserSession userSession = v1w.A01;
                    if (userSession == null) {
                        str = "viewerUserSession";
                    } else {
                        c63822v3.A03(V1W.A01(hashtag, v1w), userSession, v1w.A08, hashtag, "following_list_follow_button");
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                V1E v1e = (V1E) this.A01;
                v1e.A02.A06(v1e.A01, new C70925WkU(v1e, 2), hashtag, "header_follow_button");
                return;
        }
    }
}
