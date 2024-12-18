package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HHj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39059HHj extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25842Bbx(this.A00, this.A05, this.A01, this.A02, this.A03, this.A04, this.A07, this.A06);
    }

    public C39059HHj(UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A05 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A07 = z;
        this.A06 = z2;
    }
}
