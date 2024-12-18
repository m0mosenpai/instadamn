package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.ImO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42176ImO implements C5R5 {
    public final String A00;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        if (C14360o3.A0K(str, "ALL_MEDIA_AUTO_COLLECTION")) {
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("feed/saved/clips/");
            A0M.A9s("max_id", null);
            return AbstractC25227BEk.A0e(A0M, C124275jh.class, C37410Gdq.class);
        }
        return SaveApiUtil.A01(userSession, str, null);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        if (C14360o3.A0K(str2, "ALL_MEDIA_AUTO_COLLECTION")) {
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("feed/saved/clips/");
            A0M.A9s("max_id", str);
            return AbstractC25227BEk.A0e(A0M, C124275jh.class, C37410Gdq.class);
        }
        return SaveApiUtil.A01(userSession, str2, str);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public C42176ImO(String str) {
        this.A00 = str;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
