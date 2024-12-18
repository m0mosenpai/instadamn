package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Mgs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51042Mgs extends AbstractC52922bZ {
    public Location A00;
    public C1VW A01;
    public C05A A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final UserSession A08;
    public final W99 A09;
    public final AbstractC41190ILd A0A;
    public final W58 A0B;
    public final C55168OdW A0C;
    public final OCG A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final InterfaceC24731Iq A0H;
    public final C0UO A0I;
    public final boolean A0J;
    public final InterfaceC19390xP A0K;
    public final InterfaceC19390xP A0L;
    public final InterfaceC19390xP A0M;
    public final InterfaceC19390xP A0N;
    public final InterfaceC19390xP A0O;
    public final InterfaceC19390xP A0P;
    public final C0UO A0Q;

    public C51042Mgs(UserSession userSession, W99 w99, AbstractC41190ILd abstractC41190ILd, W58 w58, C55168OdW c55168OdW, OCG ocg, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        AbstractC25233BEq.A0w(2, str2, str3, c55168OdW);
        AbstractC25229BEm.A1I(ocg, 5, abstractC41190ILd);
        AbstractC25233BEq.A0y(7, userSession, w58, w99);
        this.A0F = str;
        this.A0G = str2;
        this.A0E = str3;
        this.A0C = c55168OdW;
        this.A0D = ocg;
        this.A0A = abstractC41190ILd;
        this.A08 = userSession;
        this.A0B = w58;
        this.A09 = w99;
        this.A0J = C18U.A06(C06090Tz.A05, userSession, 36318750261123534L);
        this.A0H = AbstractC25229BEm.A12();
        C05A A01 = C55168OdW.A01(this.A0C, this.A0F, this.A0G);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A01);
        this.A02 = AbstractC25235BEs.A1A(false);
        MZP mzp = new MZP(A02(this), 23);
        this.A0M = mzp;
        C15150pV A03 = C10Q.A03(new C57176PZz(5, null), A02(this), this.A02);
        this.A0P = A03;
        MZP mzp2 = new MZP(A02(this), 24);
        this.A0N = mzp2;
        C05A A02 = A02(this);
        C14360o3.A0B(A02, 0);
        MZP mzp3 = new MZP(A02, 21);
        this.A0K = mzp3;
        AnonymousClass059 A012 = AbstractC208910l.A01(A01(this).A06.A01, AbstractC141776au.A00(this), new MZP(A02(this), 25), C10I.A01);
        this.A0Q = A012;
        this.A0I = A012;
        this.A04 = AbstractC58232lf.A00(anonymousClass191, mzp3);
        C15180pY A022 = C10Q.A02(new C57189PaU(this, null, 2), mzp, A03, mzp2, mzp3, A02(this));
        this.A0O = A022;
        MZP mzp4 = new MZP(A022, 26);
        this.A0L = mzp4;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, mzp4);
        this.A07 = AbstractC58232lf.A00(anonymousClass191, new MZP(mzp4, 27));
        this.A06 = AbstractC58232lf.A00(anonymousClass191, new MZP(A022, 28));
        AbstractC25232BEp.A1J(this, new PZL((InterfaceC23621Ds) null, this, 24), new MZP(A02(this), 22));
        C1VW c1vw = C1VW.A00;
        this.A01 = c1vw;
        this.A00 = c1vw != null ? c1vw.getLastLocation(userSession, "SerpChildViewModel") : null;
        if (!z) {
            AbstractC23641Du.A05(anonymousClass191, new PZC(this, null, 29), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.VWV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Tx3, X.VA1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.Tx3, X.VA1] */
    public static final C128005qU A00(C65954Twz c65954Twz, C51042Mgs c51042Mgs, Object obj, int i, int i2) {
        Object obj2;
        if (obj instanceof AbstractC65924TwV) {
            AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) obj;
            c65954Twz.A00 = i + i2;
            c65954Twz.A01 = i2;
            Tx0 tx0 = new Tx0(c65954Twz);
            if (abstractC65924TwV instanceof C65741TtG) {
                obj2 = new C50622MWj(tx0, (C65741TtG) abstractC65924TwV);
            } else if (abstractC65924TwV instanceof C68090V9z) {
                obj2 = new NUW((C68090V9z) abstractC65924TwV, tx0);
            } else if (abstractC65924TwV instanceof HYX) {
                obj2 = new NUZ((HYX) abstractC65924TwV, tx0);
            } else if (abstractC65924TwV instanceof C66130U0o) {
                obj2 = new MZR((C66130U0o) abstractC65924TwV, tx0);
            } else {
                if (abstractC65924TwV instanceof HYY) {
                    obj2 = new NUV((HYY) abstractC65924TwV, tx0);
                }
                return null;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            C5qT c5qT = new C5qT(i, 0);
            A1E.add(obj2);
            A1I.put(obj2, c5qT);
            return new C128005qU(null, A1E, A1I, 3);
        }
        if (C51760Mtj.A04(obj, 48)) {
            obj2 = new MZW((C51760Mtj) obj, new Object());
        } else if (obj instanceof C38657Gyy) {
            C38657Gyy c38657Gyy = (C38657Gyy) obj;
            Integer num = c38657Gyy.A01;
            if (num != null && num.intValue() == 3) {
                obj2 = new NUS(c38657Gyy);
            } else {
                List list = c38657Gyy.A0A;
                if (list != null && !list.isEmpty()) {
                    obj2 = new NUU(c38657Gyy);
                } else {
                    obj2 = new NUT(c38657Gyy);
                }
            }
        } else if (obj instanceof Tx3) {
            obj2 = obj;
        } else if (obj instanceof C69727VuM) {
            C69727VuM c69727VuM = (C69727VuM) obj;
            if (c69727VuM.A01() == C05F.A0u) {
                obj2 = new NUQ(c69727VuM);
            } else {
                Integer A01 = c69727VuM.A01();
                String str = c69727VuM.A03;
                AbstractC167017dG.A1P(A01, str);
                ?? tx3 = new Tx3(AnonymousClass001.A0i("hcm_", AbstractC68481VSm.A00(A01), str, '_'));
                tx3.A00 = c69727VuM;
                obj2 = tx3;
            }
        } else {
            if (obj instanceof UPQ) {
                UserSession userSession = c51042Mgs.A08;
                if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328242138922347L)) {
                    UPQ upq = (UPQ) obj;
                    Integer num2 = upq.A04;
                    AbstractC167017dG.A1P(num2, "");
                    ?? tx32 = new Tx3(AnonymousClass001.A0i("hcm_", AbstractC68481VSm.A00(num2), "", '_'));
                    tx32.A01 = upq;
                    obj2 = tx32;
                }
                return null;
            }
            if (obj instanceof C26173Bhy) {
                UserSession userSession2 = c51042Mgs.A08;
                if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36328242138922347L)) {
                    C26173Bhy c26173Bhy = (C26173Bhy) obj;
                    obj2 = new NUP(c26173Bhy, c26173Bhy.A02);
                }
            } else if (obj instanceof C128005qU) {
                return (C128005qU) obj;
            }
            return null;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        C5qT c5qT2 = new C5qT(i, 0);
        A1E2.add(obj2);
        A1I2.put(obj2, c5qT2);
        return new C128005qU(null, A1E2, A1I2, 3);
    }

    public static final C05A A02(C51042Mgs c51042Mgs) {
        return C55168OdW.A02(c51042Mgs.A0C, c51042Mgs.A0F, c51042Mgs.A0G);
    }

    public static C51747MtW A01(C51042Mgs c51042Mgs) {
        return (C51747MtW) A02(c51042Mgs).getValue();
    }

    public final String A03() {
        return A01(this).A0F;
    }

    public final void A04() {
        if (A01(this).A0A instanceof C52715NUb) {
            AbstractC53526Nls abstractC53526Nls = A01(this).A0A;
            C14360o3.A0C(abstractC53526Nls, "null cannot be cast to non-null type com.instagram.search.surface.repository.SerpFeed.PaginationState.Incomplete");
            if (((C52715NUb) abstractC53526Nls).A00 != null) {
                PZC.A02(this, AbstractC141776au.A00(this), 30);
            }
        }
    }

    public final boolean A05() {
        Integer num;
        if (A01(this).A0N) {
            C38657Gyy c38657Gyy = A01(this).A07;
            if (c38657Gyy == null || (num = c38657Gyy.A01) == null || num.intValue() == 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
