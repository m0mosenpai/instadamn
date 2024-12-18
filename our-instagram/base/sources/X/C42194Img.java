package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Img, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42194Img implements C5R4 {
    public static final long A04;
    public static final long A05;
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // X.C5R4
    public final void AHy(UserSession userSession) {
    }

    @Override // X.C5R4
    public final Integer AJT(UserSession userSession, AbstractC154286wd abstractC154286wd, C154796xU c154796xU) {
        C14360o3.A0B(c154796xU, 1);
        return c154796xU.A01(abstractC154286wd, this.A02, A05, false);
    }

    @Override // X.C5R4
    public final void AQ9(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        C42133Ilh c42133Ilh = new C42133Ilh(this, 0);
        String str3 = this.A01;
        Integer num = C05F.A01;
        boolean z3 = this.A03;
        C1ON A00 = AbstractC41302IPr.A00(userSession, num, str3, null, false, true, true, z3);
        C1P3 A002 = C1P2.A00(userSession);
        String str4 = this.A02;
        C14360o3.A0B(str4, 0);
        C1P3.A00(A002, c42133Ilh, null, null, A00, AbstractC41302IPr.A00(userSession, C05F.A0C, str3, null, false, true, true, z3), str4, A05, false, false);
    }

    @Override // X.C5R4
    public final boolean ARZ(UserSession userSession) {
        return true;
    }

    @Override // X.C5R4
    public final C38321qM B6c(UserSession userSession) {
        return null;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return AbstractC41302IPr.A00(userSession, C05F.A0N, this.A01, null, z, true, false, this.A03);
    }

    @Override // X.C5R4
    public final Integer BfR(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C1P2.A00(userSession).A06(this.A02, A05, false);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return AbstractC41302IPr.A00(userSession, null, this.A01, str, false, false, false, false);
    }

    @Override // X.C5R4
    public final /* synthetic */ void CoG(UserSession userSession, String str) {
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

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A05 = timeUnit.toSeconds(60L);
        A04 = timeUnit.toMillis(60L);
    }

    public C42194Img(String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = i;
        this.A02 = AnonymousClass001.A0R("effect_page_cache_", str);
    }

    @Override // X.C5R4
    public final String BfW() {
        throw C00O.createAndThrow();
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
