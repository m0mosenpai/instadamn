package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42177ImP implements C5R5 {
    public final String A00;
    public final boolean A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        boolean z2 = this.A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/creative_tool/");
        A0c.A9s("creative_tool_id", str);
        A0c.A0P(null, HBZ.class, IPX.class, false);
        C14360o3.A0B("max_id", 0);
        A0c.A0I("should_show_friends_media_at_top", z2);
        if (!z) {
            A0c.A0A = AnonymousClass001.A0R("creative_tools_page_cache_", str);
            ((AbstractC23721Ec) A0c).A01 = 900000L;
            A0c.A08(C05F.A0N);
        }
        return A0c.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/creative_tool/");
        A0c.A9s("creative_tool_id", str2);
        AbstractC37304Gc5.A1A(A0c, HBZ.class, IPX.class, str);
        return AbstractC31172DnG.A0T(A0c, "should_show_friends_media_at_top", "false");
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

    public C42177ImP(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
