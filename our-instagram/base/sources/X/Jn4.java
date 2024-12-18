package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes8.dex */
public final class Jn4 extends AbstractC52922bZ {
    public final C2GT A00;
    public final C42221xC A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C47707L4o A04;
    public final C25804BbL A05;
    public final KPG A06;
    public final KPK A07;
    public final LGY A08;
    public final L1S A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC24731Iq A0F;
    public final InterfaceC19390xP A0G;
    public final InterfaceC19390xP A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C12N A0P;
    public final C48519LdH A0Q;
    public final C44101JeQ A0R;
    public final KPO A0S;
    public final C47814L9w A0T;
    public final InterfaceC16820sZ A0U;
    public final InterfaceC19390xP A0V;
    public final C0UO A0W;
    public final C0UO A0X;
    public final C0UO A0Y;

    public Jn4(C12N c12n, C42221xC c42221xC, UserSession userSession, C47707L4o c47707L4o, C25804BbL c25804BbL, KPG kpg, KPK kpk, LGY lgy, C48519LdH c48519LdH) {
        boolean z;
        AbstractC167007dF.A1F(c48519LdH, 3, c25804BbL);
        AbstractC167017dG.A1U(lgy, c12n);
        C14360o3.A0B(kpg, 8);
        this.A03 = userSession;
        this.A01 = c42221xC;
        this.A0Q = c48519LdH;
        this.A05 = c25804BbL;
        this.A07 = kpk;
        this.A08 = lgy;
        this.A0P = c12n;
        this.A06 = kpg;
        this.A04 = c47707L4o;
        this.A0C = AbstractC09440dt.A01(C50255MHk.A02(this, 30));
        this.A02 = new C41761wQ(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        int i = C3JM.A00;
        C24721Ip c24721Ip = new C24721Ip(i);
        this.A0F = c24721Ip;
        C24721Ip c24721Ip2 = new C24721Ip(i);
        this.A0E = c24721Ip2;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0D = C50255MHk.A01(this, enumC09460dv, 32);
        this.A0A = C50255MHk.A01(this, enumC09460dv, 28);
        this.A0B = C50255MHk.A01(this, enumC09460dv, 29);
        this.A0H = AbstractC07080Za.A03(c24721Ip);
        this.A0G = AbstractC07080Za.A03(c24721Ip2);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC46140Kbe.A02);
        this.A0M = A1H;
        C44100JeP c44100JeP = (C44100JeP) this.A0A.getValue();
        if (!C44100JeP.A04(c44100JeP)) {
            z = false;
        } else {
            z = c44100JeP.A00.getBoolean("EB_SHOULD_OVERRIDE_CUTOVER_TIMESTAMP", false);
        }
        C008002u A00 = C10E.A00(Boolean.valueOf(z));
        this.A0N = A00;
        C008002u A002 = C10E.A00(((C44100JeP) this.A0A.getValue()).A06());
        this.A0K = A002;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0O = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(new C45126Jxv((Object) null, "", "", (String) null, 10));
        this.A0L = A1H3;
        EnumC46151Kbp enumC46151Kbp = EnumC46151Kbp.A02;
        C008002u A1H4 = AbstractC25225BEi.A1H(enumC46151Kbp);
        this.A0I = A1H4;
        C44101JeQ c44101JeQ = new C44101JeQ(userSession);
        this.A0R = c44101JeQ;
        C50196MFd c50196MFd = C50196MFd.A00;
        this.A0U = c50196MFd;
        C006802i c006802i = C006802i.A0p;
        KPO kpo = new KPO(c006802i, C6CE.A00(userSession), AbstractC43592JPx.A0m(userSession, c006802i));
        this.A0S = kpo;
        C50255MHk A02 = C50255MHk.A02(this, 31);
        c44101JeQ.A00();
        C47814L9w c47814L9w = new C47814L9w(userSession, (C3LC) this.A0D.getValue(), kpo, A02, c50196MFd, C50212MFt.A00);
        this.A0T = c47814L9w;
        this.A09 = new L1S(userSession, c44101JeQ, c47814L9w);
        Integer num = C05F.A0C;
        C48519LdH.A03(c48519LdH, num);
        InterfaceC19390xP A15 = AbstractC43593JPy.A15(c12n, new C15340po(new GST(this, null, 13), new C43818JZg(25, c48519LdH.A0P, this)), 1705805791);
        C141796aw A003 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        EnumC46167Kc5 enumC46167Kc5 = EnumC46167Kc5.A05;
        AnonymousClass059 A01 = AbstractC208910l.A01(enumC46167Kc5, A003, A15, c10h);
        this.A0W = A01;
        C45799KPe c45799KPe = C45799KPe.A00;
        C008002u A1H5 = AbstractC25225BEi.A1H(new C51761Mtk(c45799KPe, c45799KPe));
        this.A0J = A1H5;
        C48519LdH.A03(c48519LdH, num);
        AnonymousClass059 A012 = AbstractC208910l.A01(false, AbstractC141776au.A00(this), AbstractC43593JPy.A15(c12n, new C50540MSt(c48519LdH.A0R, 29), 1705805791), c10h);
        this.A0X = A012;
        C48519LdH.A03(c48519LdH, num);
        AnonymousClass059 A013 = AbstractC208910l.A01(false, AbstractC141776au.A00(this), AbstractC43593JPy.A15(c12n, new C50540MSt(c48519LdH.A0S, 30), 1705805791), c10h);
        this.A0Y = A013;
        C43817JZf c43817JZf = new C43817JZf(new InterfaceC19390xP[]{A012, A013, A00, A002, A1H2, A1H3, A1H4}, 15);
        this.A0V = c43817JZf;
        InterfaceC19390xP A152 = AbstractC43593JPy.A15(c12n, C10Q.A01(C50130MCe.A00, A1H, A01, A1H5, c43817JZf), 1705805791);
        this.A00 = AbstractC43594JPz.A0J(new C45033JwO(new C51761Mtk(c45799KPe, c45799KPe), enumC46167Kc5, EnumC46140Kbe.A03, new C45086JxG(new C45126Jxv((Object) null, "", "", (String) null, 10), enumC46151Kbp, null, false, false, false, false)), AbstractC141776au.A00(this), A152, C10I.A00);
    }

    public final void A04(Activity activity, EnumC46167Kc5 enumC46167Kc5) {
        int ordinal = enumC46167Kc5.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                UserSession userSession = this.A03;
                Integer num = C05F.A0C;
                LAF A00 = AbstractC46732Klp.A00(activity, userSession, num);
                C41761wQ c41761wQ = this.A02;
                C42221xC A03 = A00.A03(c41761wQ, userSession);
                this.A0M.F8m(EnumC46140Kbe.A03);
                KPU A002 = AbstractC47844LBm.A00(userSession, num);
                KPU.A00(A002, "NORMAL_RESTORE");
                A002.A07("RESTORE_TYPE", "BLOCKSTORE");
                c41761wQ.A02(A03, new C49798Lz5(9, activity, A002, this));
                return;
            }
            return;
        }
        LGY lgy = this.A08;
        EnumC46208Kck enumC46208Kck = EnumC46208Kck.A0C;
        Integer num2 = C05F.A0C;
        lgy.A01(activity, AbstractC166987dD.A0b(), enumC46208Kck, EnumC46149Kbn.A04, num2, C05F.A00, null);
    }

    public static final void A01(Jn4 jn4) {
        C0K8.A0D("EncryptedBackupsSettingsViewModel", "forceFetchBackupStatus");
        jn4.A0Q.A05(C05F.A0C);
        A02(jn4);
    }

    public static final void A02(Jn4 jn4) {
        if (C6CB.A02(AbstractC43593JPy.A0P(jn4.A0C), 36315928477110080L)) {
            jn4.A0I.F8m(EnumC46151Kbp.A02);
            C41761wQ c41761wQ = jn4.A02;
            C47707L4o c47707L4o = jn4.A04;
            C14360o3.A0B(c41761wQ, 0);
            JQn.A00(C48486Lcd.A00(c47707L4o.A02, c41761wQ, new MM0(c47707L4o, 25), 1), c41761wQ, jn4, 14);
        }
    }

    public final void A05(boolean z) {
        Integer num;
        KPK kpk = this.A07;
        kpk.A03();
        boolean A1a = AbstractC31172DnG.A1a(((C3LC) this.A0D.getValue()).A00, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN");
        kpk.A08("LOW_STORAGE_MODE_TOGGLE", A1a);
        AbstractC31177DnL.A1N(C3LB.A00(this.A03).A00, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN", z);
        if (A1a) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        kpk.A04(num);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.A01();
    }

    public static KPK A00(InterfaceC09390do interfaceC09390do) {
        return ((Jn4) interfaceC09390do.getValue()).A07;
    }

    public static final void A03(Jn4 jn4, int i) {
        AbstractC166987dD.A1Z(new C57155PYz(jn4, null, i, 18), AbstractC141776au.A00(jn4));
    }
}
