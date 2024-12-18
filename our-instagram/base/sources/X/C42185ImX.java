package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42185ImX implements C5R5 {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A00;
        String str3 = this.A02;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0R(C38958HDk.class, C41296IPl.class);
        AbstractC37301Gc2.A1M(A0M, "clips/ad_preview/", str);
        A0M.A0H("cta_text", str2);
        A0M.A0H("political_byline_text", str3);
        C1ON A0N = A0M.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A0N;
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A01;
        String str3 = this.A00;
        String str4 = this.A02;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0R(C38958HDk.class, C41296IPl.class);
        AbstractC37301Gc2.A1M(A0M, "clips/ad_preview/", str2);
        A0M.A0H("cta_text", str3);
        A0M.A0H("political_byline_text", str4);
        C1ON A0N = A0M.A0N();
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

    public C42185ImX(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
