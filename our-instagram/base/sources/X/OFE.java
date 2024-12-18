package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OFE {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final C55058OaD A03;
    public final NYR A04;
    public final NYR A05;
    public final NYR A06;
    public final NYR A07;
    public final String A08;

    public OFE(UserSession userSession, C55072OaS c55072OaS, String str) {
        this.A02 = userSession;
        this.A08 = str;
        C55058OaD c55058OaD = new C55058OaD(userSession.userId);
        this.A03 = c55058OaD;
        this.A07 = new NYR(this, str, 3);
        this.A04 = new NYR(this, str, 0);
        this.A06 = new NYR(this, str, 2);
        this.A05 = new NYR(this, str, 1);
        c55058OaD.A00 = c55072OaS;
    }
}
