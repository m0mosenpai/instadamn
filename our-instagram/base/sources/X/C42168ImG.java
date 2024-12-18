package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ImG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42168ImG implements C5R5 {
    public final String A00;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/effect/");
        A0c.A0H("effect_id", str);
        A0c.A0P(null, C124275jh.class, C37410Gdq.class, false);
        C14360o3.A0B("max_id", 0);
        return A0c.A0N();
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/effect/");
        A0c.A0H("effect_id", str2);
        AbstractC37304Gc5.A1A(A0c, C124275jh.class, C37410Gdq.class, str);
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

    public C42168ImG(String str) {
        this.A00 = str;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
