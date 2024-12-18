package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GfC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37494GfC extends MTJ {
    public C69613Av A00;
    public C69613Av A01;
    public String A02;
    public final C69613Av A03;
    public final C69613Av A04;
    public final C69613Av A05;
    public final C69613Av A06;
    public final C69613Av A07;
    public final C69613Av A08;
    public final C37495GfD A09;
    public final C31374Dqe A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    @Override // X.AbstractC69603Au
    public final void A05() {
        A0K("is_self", this.A0D);
        A0J("trigger", this.A0C);
        String str = this.A02;
        if (str != null) {
            A0J("content_source", str);
        }
        String str2 = this.A0B;
        A0J("destination", str2);
        C31374Dqe c31374Dqe = this.A0A;
        C14360o3.A0B(str2, 1);
        c31374Dqe.A00.A0J("profile_destination", str2);
        c31374Dqe.A01();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37494GfC(UserSession userSession, String str, String str2, boolean z) {
        super(userSession, "profile", 31784979);
        AbstractC167017dG.A1Q(userSession, str);
        this.A0D = z;
        this.A0C = str;
        this.A09 = new C37495GfD();
        this.A0B = str2 == null ? "profile_media_grid" : str2;
        this.A0A = AbstractC37492GfA.A00(userSession);
        this.A05 = A02("media_load");
        this.A04 = A02("fetch_user");
        this.A07 = A02("story_highlights");
        this.A03 = A02("bio");
        this.A08 = A02("user_metric");
        this.A06 = A02("profile_picture");
    }

    @Override // X.AbstractC69603Au
    public final void A0A(long j, short s) {
        super.A0A(j, s);
        C37495GfD c37495GfD = this.A09;
        for (HJG hjg : c37495GfD.A00) {
            if (hjg.A00 || s == 2) {
                c37495GfD.A01.ATO(hjg);
            }
        }
    }
}
