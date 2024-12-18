package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LdH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48519LdH implements InterfaceC13000lm {
    public Boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C42221xC A05;
    public final C42221xC A06;
    public final C41761wQ A07;
    public final UserSession A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC19390xP A0H;
    public final InterfaceC19390xP A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final C0UO A0S;
    public final C0UO A0T;
    public final C19L A0U;

    public C48519LdH(C42221xC c42221xC, C42221xC c42221xC2, UserSession userSession, Integer num) {
        AbstractC167007dF.A1F(userSession, 1, num);
        this.A08 = userSession;
        this.A05 = c42221xC;
        this.A06 = c42221xC2;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0G = MHT.A00(this, enumC09460dv, 48);
        this.A0C = MHT.A00(this, enumC09460dv, 43);
        this.A09 = MHT.A00(this, enumC09460dv, 40);
        this.A0F = MHT.A00(this, enumC09460dv, 47);
        this.A0D = MHT.A00(this, enumC09460dv, 45);
        this.A0A = MHT.A00(this, enumC09460dv, 41);
        this.A0B = MHT.A00(this, enumC09460dv, 42);
        C19K A02 = AnonymousClass194.A02(AbstractC25231BEo.A0e(C12L.A00).plus(new AnonymousClass197(null)));
        this.A0U = A02;
        this.A0E = MHT.A00(this, enumC09460dv, 46);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC46172KcA.A07);
        this.A0J = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC46165Kc3.A06);
        this.A0N = A1H2;
        EnumC46166Kc4 enumC46166Kc4 = EnumC46166Kc4.A06;
        C008002u A1H3 = AbstractC25225BEi.A1H(enumC46166Kc4);
        this.A0K = A1H3;
        this.A0I = new C50540MSt(A1H, 27);
        this.A0H = new C50540MSt(A1H, 28);
        this.A0O = AbstractC25235BEs.A1A(false);
        this.A07 = new C41761wQ(null);
        this.A03 = true;
        this.A0P = AbstractC208910l.A02(A1H);
        this.A0T = AbstractC208910l.A02(A1H2);
        this.A0Q = AbstractC208910l.A02(A1H3);
        C008002u A1H4 = AbstractC25225BEi.A1H(enumC46166Kc4);
        this.A0L = A1H4;
        this.A0R = AbstractC208910l.A02(A1H4);
        C008002u A1H5 = AbstractC25225BEi.A1H(enumC46166Kc4);
        this.A0M = A1H5;
        this.A0S = AbstractC208910l.A02(A1H5);
        AbstractC43593JPy.A1X(new GST(this, null, 10), A02, A1H);
        if (((C6CF) this.A0C.getValue()).A00()) {
            A03(this, num);
        }
    }

    private final void A01() {
        this.A03 = true;
        this.A0J.Egh(EnumC46172KcA.A04);
        this.A0N.Egh(EnumC46165Kc3.A02);
        C05A c05a = this.A0K;
        EnumC46166Kc4 enumC46166Kc4 = EnumC46166Kc4.A04;
        c05a.Egh(enumC46166Kc4);
        this.A0L.Egh(enumC46166Kc4);
        this.A0M.Egh(enumC46166Kc4);
    }

    public static final EnumC46166Kc4 A00(EnumC46206Kci enumC46206Kci, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C47805L9n) it.next()).A00 == enumC46206Kci) {
                    return EnumC46166Kc4.A03;
                }
            }
        }
        return EnumC46166Kc4.A02;
    }

    public static final void A03(C48519LdH c48519LdH, Integer num) {
        if (!c48519LdH.A01) {
            InterfaceC09390do interfaceC09390do = c48519LdH.A0B;
            AbstractC2056898s A0b = AbstractC43592JPx.A0b(interfaceC09390do);
            A0b.A03();
            A0b.A07("TRIGGER_SOURCE", AbstractC46735Kls.A00(num));
            c48519LdH.A01 = true;
            c48519LdH.A07.A02(c48519LdH.A05.A0K(new C48358LaY(1, num, c48519LdH)), C49743LyC.A00);
            AbstractC43592JPx.A0b(interfaceC09390do).A02();
        }
        if (c48519LdH.A03) {
            c48519LdH.A04(num);
        }
    }

    private final void A04(Integer num) {
        C0K8.A0D("EncryptedBackupsStatusRepository", "start to refresh backup status");
        C05A c05a = this.A0J;
        Object value = c05a.getValue();
        EnumC46172KcA enumC46172KcA = EnumC46172KcA.A05;
        if (value == enumC46172KcA) {
            C0K8.A0D("EncryptedBackupsStatusRepository", "Repository is already fetching backup status, skipped this refresh");
            return;
        }
        this.A03 = false;
        c05a.Egh(enumC46172KcA);
        this.A0N.Egh(EnumC46165Kc3.A03);
        C05A c05a2 = this.A0K;
        EnumC46166Kc4 enumC46166Kc4 = EnumC46166Kc4.A05;
        c05a2.Egh(enumC46166Kc4);
        this.A0L.Egh(enumC46166Kc4);
        this.A0M.Egh(enumC46166Kc4);
        ((KPT) this.A09.getValue()).A0C(num, C6CB.A02(C6CE.A00(this.A08).A00, 36315928473112343L), false);
        this.A07.A02(C43597JQd.A00(this.A05, this, 11), C49741LyA.A00);
    }

    public final void A05(Integer num) {
        C0K8.A0D("EncryptedBackupsStatusRepository", "force refresh backup status");
        A04(num);
    }

    public final void A06(InterfaceC16620sF interfaceC16620sF) {
        C0UO c0uo = this.A0P;
        if (c0uo.getValue() != EnumC46172KcA.A05 && c0uo.getValue() != EnumC46172KcA.A07) {
            C0UO c0uo2 = this.A0T;
            if (c0uo2.getValue() != EnumC46165Kc3.A03 && c0uo2.getValue() != EnumC46165Kc3.A06) {
                interfaceC16620sF.invoke(c0uo.getValue(), c0uo2.getValue());
                return;
            }
        }
        AbstractC166987dD.A1Z(new C50122MBw(this, interfaceC16620sF, null, 49), AbstractC167017dG.A0w(C12L.A00, 1705805791));
    }

    public final void A07(InterfaceC16600sD interfaceC16600sD) {
        C0UO c0uo = this.A0P;
        if (c0uo.getValue() != EnumC46172KcA.A05 && c0uo.getValue() != EnumC46172KcA.A07) {
            C0UO c0uo2 = this.A0T;
            if (c0uo2.getValue() != EnumC46165Kc3.A03 && c0uo2.getValue() != EnumC46165Kc3.A06) {
                C0UO c0uo3 = this.A0S;
                Object value = c0uo3.getValue();
                EnumC46166Kc4 enumC46166Kc4 = EnumC46166Kc4.A05;
                if (value != enumC46166Kc4) {
                    Object value2 = c0uo3.getValue();
                    EnumC46166Kc4 enumC46166Kc42 = EnumC46166Kc4.A06;
                    if (value2 != enumC46166Kc42) {
                        C0UO c0uo4 = this.A0R;
                        if (c0uo4.getValue() != enumC46166Kc4 && c0uo4.getValue() != enumC46166Kc42) {
                            interfaceC16600sD.invoke(c0uo.getValue(), c0uo2.getValue(), c0uo3.getValue(), c0uo4.getValue());
                            return;
                        }
                    }
                }
            }
        }
        AbstractC166987dD.A1Z(new C50122MBw(this, interfaceC16600sD, null, 48), AbstractC167017dG.A0w(C12L.A00, 1705805791));
    }

    public final boolean A08() {
        int ordinal = ((EnumC46172KcA) this.A0P.getValue()).ordinal();
        if (ordinal == 4 || ordinal == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        JQn.A00(C43597JQd.A00(this.A05, this, 13), this.A07, this, 12);
        this.A02 = false;
    }

    public static final void A02(AbstractC46542Kih abstractC46542Kih, C48519LdH c48519LdH) {
        String str;
        String str2;
        C0K8.A0D("EncryptedBackupsStatusRepository", AbstractC167017dG.A0n(abstractC46542Kih, "backup status updated: ", AbstractC166987dD.A1C()));
        if (abstractC46542Kih instanceof C44826Jt0) {
            C6CC.A03.A03(c48519LdH.A08, new MHT(c48519LdH, 44));
            int ordinal = ((EnumC46197KcZ) ((C44826Jt0) abstractC46542Kih).A00).ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal == 3) {
                            c48519LdH.A01();
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        c48519LdH.A0J.Egh(EnumC46172KcA.A03);
                        c48519LdH.A03 = false;
                        Ld4 ld4 = (Ld4) c48519LdH.A0G.getValue();
                        if (C6CB.A02(AbstractC43593JPy.A0P(ld4.A04), 2342158937684119281L)) {
                            ld4.A02.A02(ld4.A01.A0K(new JQI(0)), C49752LyL.A00);
                            InterfaceC19610xo ARD = ((C3LC) ld4.A05.getValue()).A00.ARD();
                            ARD.E77("EB_DEVICE_ONBOARDED", true);
                            ARD.commit();
                        }
                    }
                } else {
                    c48519LdH.A0J.Egh(EnumC46172KcA.A02);
                    c48519LdH.A03 = false;
                    Ld4 ld42 = (Ld4) c48519LdH.A0G.getValue();
                    if (!ld42.A00 && C6CB.A02(AbstractC43593JPy.A0P(ld42.A04), 2342158937684119281L)) {
                        boolean z = ((C3LC) ld42.A05.getValue()).A00.getBoolean("EB_DEVICE_ONBOARDED", false);
                        ld42.A00 = true;
                        if (z) {
                            ld42.A02.A02(C43597JQd.A00(ld42.A01, ld42, 20), C49751LyK.A00);
                        }
                    }
                }
            } else {
                c48519LdH.A0J.Egh(EnumC46172KcA.A06);
                c48519LdH.A03 = false;
            }
            AbstractC2056898s A0b = AbstractC43592JPx.A0b(c48519LdH.A09);
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal == 3) {
                            str2 = "FETCH_BACKUP_STATUS_ERROR";
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        str2 = "DEVICE_ONBOARDED";
                    }
                } else {
                    str2 = "DEVICE_NOT_ONBOARDED";
                }
            } else {
                str2 = "NO_BACKUPS_PRESENT";
            }
            A0b.A07("BACKUP_STATUS", str2);
            A0b.A02();
            C42221xC A00 = C43597JQd.A00(c48519LdH.A05, c48519LdH, 12);
            C41761wQ c41761wQ = c48519LdH.A07;
            c41761wQ.A02(A00, C49742LyB.A00);
            c41761wQ.A02(C43597JQd.A00(c48519LdH.A06, c48519LdH, 14), C49744LyD.A00);
        } else {
            if (abstractC46542Kih instanceof C44827Jt1) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("failed to refresh backup status with exception: ");
                str = AbstractC166997dE.A0v(((C44827Jt1) abstractC46542Kih).A00, A1C);
            } else if (abstractC46542Kih == null) {
                str = "Unknown error - empty result";
            } else {
                throw B4Z.A00();
            }
            C0K8.A0D("EncryptedBackupsStatusRepository", str);
            c48519LdH.A01();
            AbstractC43592JPx.A0b(c48519LdH.A09).A04(C05F.A01);
        }
        c48519LdH.A07.A02(C43597JQd.A00(c48519LdH.A05, c48519LdH, 15), C49745LyE.A00);
    }
}
