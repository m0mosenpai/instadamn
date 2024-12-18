package X;

import com.meta.foa.accountswitcher.UserAccountInfo;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.CSy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27939CSy {
    public final UserAccountInfo A00;
    public final UserAccountInfo A01;
    public final CWZ A02;
    public final FoaUserSession A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C27939CSy(UserAccountInfo userAccountInfo, UserAccountInfo userAccountInfo2, CWZ cwz, FoaUserSession foaUserSession, Integer num, String str, String str2) {
        AbstractC167027dH.A13(foaUserSession, str, str2);
        C14360o3.A0B(cwz, 6);
        this.A03 = foaUserSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = userAccountInfo;
        this.A01 = userAccountInfo2;
        this.A02 = cwz;
        this.A04 = num;
    }
}
