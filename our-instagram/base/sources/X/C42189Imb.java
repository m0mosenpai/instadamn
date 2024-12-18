package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Imb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42189Imb implements C5R5 {
    public Context A00;
    public final C9CJ A03;
    public final InterfaceC116925Qy A04;
    public final String A05;
    public InterfaceC120815dY A02 = null;
    public C37682GiJ A01 = null;

    public C42189Imb(Context context, C9CJ c9cj, InterfaceC116925Qy interfaceC116925Qy, String str) {
        this.A00 = context;
        this.A03 = c9cj;
        this.A05 = str;
        this.A04 = interfaceC116925Qy;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        Map map;
        C14360o3.A0B(userSession, 0);
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        String str = A00.A00;
        String str2 = A00.A01;
        Context context = this.A00;
        if (context == null) {
            context = AbstractC25225BEi.A0F(userSession);
        }
        C9CJ c9cj = this.A03;
        String str3 = this.A05;
        InterfaceC120815dY interfaceC120815dY = this.A02;
        String str4 = null;
        if (interfaceC120815dY != null) {
            map = interfaceC120815dY.Bkt();
        } else {
            map = null;
        }
        InterfaceC116925Qy interfaceC116925Qy = this.A04;
        C37682GiJ c37682GiJ = this.A01;
        if (c37682GiJ != null) {
            str4 = c37682GiJ.A00();
        }
        C1ON A002 = C37814GkU.A00(context, c9cj, interfaceC116925Qy, userSession, str, str2, str3, str4, map);
        C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A002;
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        Map map;
        C14360o3.A0B(userSession, 0);
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        String str2 = A00.A00;
        String str3 = A00.A01;
        Context context = this.A00;
        if (context == null) {
            context = AbstractC25225BEi.A0F(userSession);
        }
        C9CJ c9cj = this.A03;
        String str4 = this.A05;
        InterfaceC120815dY interfaceC120815dY = this.A02;
        String str5 = null;
        if (interfaceC120815dY != null) {
            map = interfaceC120815dY.Bkt();
        } else {
            map = null;
        }
        InterfaceC116925Qy interfaceC116925Qy = this.A04;
        C37682GiJ c37682GiJ = this.A01;
        if (c37682GiJ != null) {
            str5 = c37682GiJ.A00();
        }
        C1ON A002 = C37814GkU.A00(context, c9cj, interfaceC116925Qy, userSession, str2, str3, str4, str5, map);
        C14360o3.A0C(A002, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.clips.api.ClipsItemsListResponse, com.instagram.clips.api.ClipsItemsListResponse>");
        return A002;
    }

    @Override // X.C5R5
    public final void ERc(C37682GiJ c37682GiJ) {
        C14360o3.A0B(c37682GiJ, 0);
        this.A01 = c37682GiJ;
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }

    @Override // X.C5R5
    public final void ES6(Context context) {
        this.A00 = context;
    }

    @Override // X.C5R5
    public final void Eee(InterfaceC120815dY interfaceC120815dY) {
        this.A02 = interfaceC120815dY;
    }
}
