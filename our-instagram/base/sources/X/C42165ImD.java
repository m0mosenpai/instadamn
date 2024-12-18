package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42165ImD implements C5R5 {
    public final String A00;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36328130469772496L);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/associated_clips/");
        AbstractC37304Gc5.A1B(A0c, "original_media_id", str, null);
        A0c.A0I("should_show_friends_media_at_top", A06);
        return AbstractC25227BEk.A0e(A0c, C38956HDi.class, C41309IPy.class);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/associated_clips/");
        AbstractC37304Gc5.A1B(A0c, "original_media_id", str2, str);
        A0c.A9s("should_show_friends_media_at_top", "false");
        return AbstractC25227BEk.A0e(A0c, C38956HDi.class, C41309IPy.class);
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

    public C42165ImD(String str) {
        this.A00 = str;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
