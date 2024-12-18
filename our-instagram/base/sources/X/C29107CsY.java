package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.CsY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29107CsY implements C5R5 {
    public final String A00;
    public final /* synthetic */ CT7 A01;

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A00;
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A06();
        A0q.A0B("clips/clips_third_party_attribution_pivot_page/");
        A0q.A9s("attribution_app_id", str);
        C14360o3.A0B("max_id", 0);
        return AbstractC25227BEk.A0e(A0q, EPC.class, C34873FYi.class);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A00;
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A06();
        A0q.A0B("clips/clips_third_party_attribution_pivot_page/");
        A0q.A9s("attribution_app_id", str2);
        A0q.A0H("max_id", str);
        return AbstractC25227BEk.A0e(A0q, EPC.class, C34873FYi.class);
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

    public C29107CsY(CT7 ct7, String str) {
        this.A01 = ct7;
        this.A00 = str;
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
