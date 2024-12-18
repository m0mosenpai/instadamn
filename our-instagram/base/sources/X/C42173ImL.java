package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42173ImL implements C5R5 {
    public final String A00;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/originality/attribution_feed/");
        AbstractC37304Gc5.A1B(A0c, "uc_media_id", str, null);
        AbstractC37302Gc3.A1M(A0c, userSession, C37410Gdq.class);
        return A0c.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/originality/attribution_feed/");
        AbstractC37304Gc5.A1B(A0c, "uc_media_id", str2, str);
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

    public C42173ImL(String str) {
        this.A00 = str;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
