package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153676vc implements C5R5, C5R4, C5R6 {
    public static final Integer A03 = C05F.A00;
    public final long A00 = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MINUTES.toMillis(60));
    public final String A01;
    public final String A02;

    @Override // X.C5R4
    public final void AHy(UserSession userSession) {
    }

    @Override // X.C5R4
    public final Integer AJT(UserSession userSession, AbstractC154286wd abstractC154286wd, C154796xU c154796xU) {
        C14360o3.A0B(c154796xU, 1);
        return c154796xU.A02(abstractC154286wd, this.A01, this.A00, false, true);
    }

    @Override // X.C5R4
    public final void AQ9(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        C23560AcE c23560AcE = new C23560AcE(this);
        C24531Hw A04 = AnonymousClass755.A00.A04(userSession, A03, this.A02, null, false);
        C1IA A00 = C1I9.A00(userSession);
        String str3 = this.A01;
        C14360o3.A0B(str3, 0);
        C1IA.A00(A00, c23560AcE, null, null, A04, null, str3, this.A00, false, false);
    }

    @Override // X.C5R4
    public final boolean ARZ(UserSession userSession) {
        return false;
    }

    @Override // X.C5R4
    public final C38321qM B6c(UserSession userSession) {
        return null;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        String str = this.A02;
        Integer num = A03;
        C14360o3.A0B(num, 3);
        C25621Ms A00 = AbstractC37797GkC.A00(userSession);
        AnonymousClass755.A02(A00, userSession, num, str, null, null, z);
        return A00.A0N();
    }

    @Override // X.C5R4
    public final Integer BfR(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C1I9.A00(userSession).A06(this.A01, this.A00, false);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = this.A02;
        Integer num = A03;
        C14360o3.A0B(num, 3);
        C25621Ms A00 = AbstractC37797GkC.A00(userSession);
        AnonymousClass755.A02(A00, userSession, num, str2, str, null, false);
        return A00.A0N();
    }

    @Override // X.C5R6
    public final C24531Hw Co7(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 0);
        return AnonymousClass755.A00.A04(userSession, A03, this.A02, null, z);
    }

    @Override // X.C5R6
    public final C24531Hw Co9(Context context, UserSession userSession, String str, List list, boolean z) {
        C14360o3.A0B(userSession, 0);
        return AnonymousClass755.A00.A04(userSession, A03, this.A02, str, false);
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

    public C153676vc(String str) {
        this.A02 = str;
        this.A01 = AnonymousClass001.A0R("clips/user/", str);
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
