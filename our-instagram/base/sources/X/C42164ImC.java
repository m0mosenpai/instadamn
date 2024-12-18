package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42164ImC implements C5R5 {
    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/templates_on_explore/");
        AbstractC37304Gc5.A1A(A0c, C124275jh.class, C37410Gdq.class, null);
        C1ON A0N = A0c.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A0N;
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

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("clips/templates_on_explore/");
        AbstractC37304Gc5.A1A(A0C, C124275jh.class, C37410Gdq.class, str);
        C1ON A0N = A0C.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A0N;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
