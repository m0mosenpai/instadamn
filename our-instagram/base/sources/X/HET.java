package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HET extends C2US {
    public H7G A00;
    public final UserSession A01;
    public final C38339GtZ A02;
    public final HFB A03;
    public final HFG A04;
    public final HFC A05;
    public final HFD A06;
    public final HFH A07;
    public final HFI A08;
    public final HFE A09;
    public final JPq A0A;

    public HET(InterfaceC11380iw interfaceC11380iw, UserSession userSession, INQ inq, C38376GuD c38376GuD, JPq jPq, INL inl) {
        super(false);
        this.A01 = userSession;
        this.A0A = jPq;
        this.A02 = new C38339GtZ(this);
        HFB hfb = new HFB(interfaceC11380iw, userSession, c38376GuD, jPq, inl);
        this.A03 = hfb;
        HFG hfg = new HFG(interfaceC11380iw, userSession, inq, c38376GuD, jPq, inl);
        this.A04 = hfg;
        HFC hfc = new HFC(interfaceC11380iw, userSession, c38376GuD, jPq, inl);
        this.A05 = hfc;
        HFD hfd = new HFD(interfaceC11380iw, userSession, c38376GuD, jPq, inl);
        this.A06 = hfd;
        HFH hfh = new HFH(interfaceC11380iw, userSession, inq, c38376GuD, jPq, inl);
        this.A07 = hfh;
        HFI hfi = new HFI(interfaceC11380iw, userSession, inq, c38376GuD, jPq, inl);
        this.A08 = hfi;
        HFE hfe = new HFE(interfaceC11380iw, userSession, c38376GuD, jPq, inl);
        this.A09 = hfe;
        init(hfb, hfg, hfc, hfd, hfh, hfi, hfe);
    }
}
