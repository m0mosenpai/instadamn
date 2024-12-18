package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Nno, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53643Nno {
    public final P1C A00() {
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        boolean A05;
        InterfaceC58310Pt2 interfaceC58310Pt2;
        NKK nkk;
        InterfaceC58190Pqw interfaceC58190Pqw;
        if (this instanceof NJP) {
            NJP njp = (NJP) this;
            abstractC59962oe = njp.A00;
            userSession = njp.A02;
            A05 = AbstractC55222Oeo.A01(userSession);
            interfaceC58310Pt2 = njp.A09;
            nkk = njp.A08.A0O;
            interfaceC58190Pqw = njp.A0A;
        } else {
            NJO njo = (NJO) this;
            abstractC59962oe = njo.A01;
            userSession = njo.A06;
            A05 = AbstractC55222Oeo.A05(userSession);
            interfaceC58310Pt2 = njo.A08;
            nkk = njo.A0D.A0Y;
            interfaceC58190Pqw = njo.A09;
        }
        return new P1C(abstractC59962oe, userSession, interfaceC58310Pt2, interfaceC58190Pqw, nkk, A05);
    }

    public final C56339P0a A01() {
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        boolean A05;
        C52473NJr c52473NJr;
        if (this instanceof NJP) {
            NJP njp = (NJP) this;
            abstractC59962oe = njp.A00;
            userSession = njp.A02;
            A05 = AbstractC55222Oeo.A01(userSession);
            c52473NJr = njp.A08.A0J;
        } else {
            NJO njo = (NJO) this;
            abstractC59962oe = njo.A01;
            userSession = njo.A06;
            A05 = AbstractC55222Oeo.A05(userSession);
            c52473NJr = njo.A0D.A0M;
        }
        return new C56339P0a(abstractC59962oe, userSession, c52473NJr, A05);
    }

    public final C56354P0p A02() {
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        boolean A05;
        boolean z;
        C57744PjX c57744PjX;
        String str;
        if (this instanceof NJP) {
            NJP njp = (NJP) this;
            abstractC59962oe = njp.A00;
            userSession = njp.A02;
            A05 = AbstractC55222Oeo.A01(userSession);
            z = njp.A08.A03.A04().A4y;
            str = abstractC59962oe.getString(2131975785);
            c57744PjX = new C57744PjX(njp, 48);
        } else {
            NJO njo = (NJO) this;
            abstractC59962oe = njo.A01;
            userSession = njo.A06;
            A05 = AbstractC55222Oeo.A05(userSession);
            C51754Mtd c51754Mtd = njo.A0D.A01;
            if (c51754Mtd != null) {
                z = c51754Mtd.A0e;
            } else {
                z = false;
            }
            c57744PjX = new C57744PjX(njo, 45);
            str = null;
        }
        return new C56354P0p(abstractC59962oe, userSession, str, c57744PjX, A05, z);
    }

    public final P18 A03() {
        AbstractC59962oe abstractC59962oe;
        UserSession userSession;
        boolean A05;
        InterfaceC58310Pt2 interfaceC58310Pt2;
        EnumC53117NeU enumC53117NeU;
        String str;
        if (this instanceof NJP) {
            NJP njp = (NJP) this;
            abstractC59962oe = njp.A00;
            userSession = njp.A02;
            A05 = AbstractC55222Oeo.A01(userSession);
            interfaceC58310Pt2 = njp.A09;
            enumC53117NeU = EnumC53117NeU.A03;
            str = "feed";
        } else {
            NJO njo = (NJO) this;
            abstractC59962oe = njo.A01;
            userSession = njo.A06;
            A05 = AbstractC55222Oeo.A05(userSession);
            interfaceC58310Pt2 = njo.A08;
            enumC53117NeU = EnumC53117NeU.A02;
            str = "reel";
        }
        return new P18(abstractC59962oe, userSession, interfaceC58310Pt2, enumC53117NeU, str, A05);
    }

    public final InterfaceC58169PqZ A04() {
        if (this instanceof NJP) {
            NJP njp = (NJP) this;
            AbstractC59962oe abstractC59962oe = njp.A00;
            UserSession userSession = njp.A02;
            NJQ njq = njp.A08;
            String str = njq.A03.A04().A3t;
            return new P1E(abstractC59962oe, userSession, njq.A0D, njp.A09, njp.A0D, str);
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00ad. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x046c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC58169PqZ A05(X.AbstractC53462Nkp r22) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC53643Nno.A05(X.Nkp):X.PqZ");
    }
}
