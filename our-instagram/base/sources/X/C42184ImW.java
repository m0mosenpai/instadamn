package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42184ImW implements C5R5 {
    public String A00;
    public final String A01;
    public final String A02;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/keyword/");
        C14360o3.A0B("max_id", 0);
        A0c.A9s("keyword", str);
        A0c.A0H("rank_token", str2);
        return AbstractC37303Gc4.A0A(A0c, "reels_page_index", str3);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A01;
        String str3 = this.A02;
        String str4 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/keyword/");
        A0c.A0H("max_id", str);
        A0c.A9s("keyword", str2);
        A0c.A0H("rank_token", str3);
        return AbstractC37303Gc4.A0A(A0c, "reels_page_index", str4);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    public C42184ImW(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }

    @Override // X.C5R5
    public final void EcO(String str) {
        this.A00 = str;
    }
}
