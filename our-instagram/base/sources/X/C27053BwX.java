package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27053BwX extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public C27053BwX(UserSession userSession, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A07 = z;
        this.A00 = i;
        this.A05 = str4;
        this.A06 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        boolean z = this.A07;
        return new C25834Bbp(userSession, str, str2, str3, this.A05, this.A00, z, this.A06);
    }
}
