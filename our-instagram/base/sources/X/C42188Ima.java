package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ima, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42188Ima implements C5R5 {
    public final C5Qu A00;
    public final C37671Gi4 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        String str2 = this.A02;
        boolean z2 = this.A04;
        C37671Gi4 c37671Gi4 = this.A01;
        if (c37671Gi4 != null) {
            str = c37671Gi4.A01();
        } else {
            str = null;
        }
        String A00 = this.A00.A00();
        String str3 = this.A03;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/chaining/");
        A0c.A9s("chaining_media_id", str2);
        A0c.A0I("should_refetch_chaining_media", z2);
        AbstractC37300Gc1.A0y(A0c, str3);
        A0c.A0H("session_info", str);
        AbstractC37301Gc2.A1N(A0c, "seen_reels", A00, null);
        AbstractC37302Gc3.A1M(A0c, userSession, C37410Gdq.class);
        return A0c.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        String str3 = this.A02;
        C37671Gi4 c37671Gi4 = this.A01;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        String A00 = this.A00.A00();
        String str4 = this.A03;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/chaining/");
        A0c.A9s("chaining_media_id", str3);
        A0c.A9s("should_refetch_chaining_media", "false");
        AbstractC37300Gc1.A0y(A0c, str4);
        A0c.A0H("session_info", str2);
        AbstractC37301Gc2.A1N(A0c, "seen_reels", A00, str);
        AbstractC37302Gc3.A1M(A0c, userSession, C37410Gdq.class);
        return A0c.A0N();
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

    public C42188Ima(C5Qu c5Qu, C37671Gi4 c37671Gi4, String str, String str2, boolean z) {
        this.A02 = str;
        this.A04 = z;
        this.A01 = c37671Gi4;
        this.A00 = c5Qu;
        this.A03 = str2;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
