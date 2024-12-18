package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.CSc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27917CSc {
    public final UserAccountInfo A00;
    public final UserAccountInfo A01;
    public final FoaUserSession A02;
    public final String A03;
    public final String A04;

    public C27917CSc(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, FoaUserSession foaUserSession, String str, String str2) {
        AbstractC167027dH.A0a(1, foaUserSession, str, str2, userAccountInfo);
        C14360o3.A0B(userAccountInfo2, 5);
        this.A02 = foaUserSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = userAccountInfo;
        this.A01 = userAccountInfo2;
    }
}
