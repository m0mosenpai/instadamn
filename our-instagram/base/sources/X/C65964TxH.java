package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TxH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65964TxH implements XDu {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final UserSession A04;
    public final C65966TxJ A05;
    public final C66157U1y A06;
    public final U22 A07;
    public final java.util.Set A08;
    public final boolean A09;
    public final int A0A;
    public final int A0B;
    public final C65966TxJ A0C;
    public final VJV A0D;
    public final C66157U1y A0E;
    public final U22 A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.VJV, java.lang.Object] */
    public C65964TxH(Context context, UserSession userSession, C65966TxJ c65966TxJ, C66157U1y c66157U1y, U22 u22) {
        C14360o3.A0B(userSession, 1);
        this.A07 = u22;
        this.A05 = c65966TxJ;
        this.A06 = c66157U1y;
        this.A08 = new HashSet();
        this.A00 = "";
        C66153U1u A00 = AbstractC66154U1v.A00(userSession);
        boolean z = false;
        if (!AbstractC31178DnM.A1a(A00.A02) && (C2TN.A00(userSession) || !AbstractC31178DnM.A1a(A00.A01))) {
            z = MZJ.A05.A00(userSession).A00();
        }
        this.A02 = z;
        this.A04 = userSession;
        this.A03 = context;
        this.A0F = u22;
        this.A0C = c65966TxJ;
        this.A0E = c66157U1y;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A06(c06090Tz, userSession, 36325308676191213L);
        this.A0B = (int) C18U.A01(c06090Tz, userSession, 36600732044103663L);
        this.A0A = (int) C18U.A01(c06090Tz, userSession, 36592090569965842L);
        ?? obj = new Object();
        obj.A00 = "";
        obj.A01 = false;
        obj.A02 = false;
        this.A0D = obj;
        this.A0G = AbstractC65702TsY.A1Y(userSession);
        this.A0H = AbstractC65702TsY.A1Y(userSession);
    }

    public static final C70789Wh2 A00(C65965TxI c65965TxI, String str) {
        C65954Twz c65954Twz = new C65954Twz();
        c65954Twz.A09 = "typeahead_echo";
        c65954Twz.A05 = "server_results";
        c65954Twz.A00 = ((C65957Tx9) c65965TxI).A00;
        c65954Twz.A01 = ((C65957Tx9) c65965TxI).A01;
        c65954Twz.A0H = true;
        return new C70789Wh2(new Tx0(c65954Twz), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (X.C66156U1x.A00.A00(r24.A04) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d1, code lost:
    
        if (r2 != true) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    @Override // X.XDu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C65956Tx8 E4l(java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65964TxH.E4l(java.lang.String, java.util.List):X.Tx8");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // X.XDu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C65956Tx8 E4n(java.lang.String r22, java.lang.String r23, java.util.List r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65964TxH.E4n(java.lang.String, java.lang.String, java.util.List, java.util.List):X.Tx8");
    }

    private final void A01(C65965TxI c65965TxI) {
        long j;
        UserSession userSession = this.A04;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A00, A00.A1u, C23031Ai.A8c, 487)) {
            Context context = this.A03;
            boolean A01 = C54P.A01(context, userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (A01) {
                j = 36322134695553037L;
            } else {
                j = 36322134696994834L;
            }
            if (C18U.A06(c06090Tz, userSession, j)) {
                c65965TxI.A03(C05F.A01, new VA6(new C68089V9y("search_invites_upsell"), C05F.A0C, AbstractC166997dE.A0q(context.getResources(), 2131973020), AbstractC166997dE.A0q(context.getResources(), 2131973019), "search_invites_upsell", context.getResources().getString(2131973018), ((C65957Tx9) c65965TxI).A00));
            }
        }
    }

    @Override // X.XDu
    public final void DjE(C51621MrE c51621MrE) {
        int i;
        this.A02 = c51621MrE.A02;
        C66155U1w c66155U1w = this.A07.A03;
        if (c51621MrE.A03) {
            i = c51621MrE.A00;
        } else {
            i = c66155U1w.A01;
        }
        c66155U1w.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Tx9, X.U2y] */
    @Override // X.XDu
    public final C65956Tx8 E4m() {
        List A02;
        List A022;
        List A023;
        List list;
        Integer num;
        User user;
        List arrayList;
        int i;
        List list2;
        List list3;
        C34520FJg c34520FJg;
        C34520FJg c34520FJg2;
        int i2;
        int i3;
        int i4;
        ?? c65957Tx9 = new C65957Tx9(this.A02);
        U22 u22 = this.A07;
        C01L A1I = C0eM.A1I();
        UserSession userSession = u22.A02;
        U10 A00 = AbstractC66131U0x.A00(userSession);
        synchronized (A00) {
            A02 = A00.A00.A02();
        }
        A1I.addAll(A02);
        A1I.addAll(U0w.A00(userSession).A00.A02());
        U11 A002 = AbstractC66132U0y.A00(userSession);
        synchronized (A002) {
            A022 = A002.A00.A02();
        }
        A1I.addAll(A022);
        if (AbstractC167007dF.A1Z(u22.A04)) {
            A1I.addAll(U1X.A00(userSession).A00.A02());
        }
        C65740TtF A003 = AbstractC65792TuA.A00(userSession);
        synchronized (A003) {
            A023 = A003.A00.A02();
        }
        A1I.addAll(A023);
        C01T.A1C(A1I);
        C01L A1J = C0eM.A1J(A1I);
        boolean z = u22.A06;
        if (z && !u22.A07) {
            U22.A00(c65957Tx9, u22);
        }
        Context context = u22.A01;
        if (C54P.A00(context, userSession) && C18U.A06(C06090Tz.A05, userSession, 36320429593338358L)) {
            C23031Ai A004 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19630xq interfaceC19630xq = A004.A01;
            long j = interfaceC19630xq.getInt("search_nullstate_ci_upsell_dismissed_count", 0);
            C06090Tz c06090Tz = C06090Tz.A06;
            boolean A1P = AbstractC25230BEn.A1P((j > C18U.A01(c06090Tz, userSession, 36601904570175878L) ? 1 : (j == C18U.A01(c06090Tz, userSession, 36601904570175878L) ? 0 : -1)));
            long j2 = currentTimeMillis - interfaceC19630xq.getLong("search_nullstate_ci_upsell_dismissed_timestamp", 0L);
            TimeUnit timeUnit = TimeUnit.HOURS;
            boolean A1O = AbstractC167007dF.A1O((j2 > timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36601904570110341L)) ? 1 : (j2 == timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36601904570110341L)) ? 0 : -1)));
            if (A1P && A1O) {
                long j3 = interfaceC19630xq.getInt("search_nullstate_ci_upsell_impression_count", 0);
                long A01 = C18U.A01(c06090Tz, userSession, 36601904570306952L);
                long millis = timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36601904570241415L));
                if (j3 <= 0 || millis != 0) {
                    if (j3 >= A01) {
                        if (currentTimeMillis - interfaceC19630xq.getLong("search_nullstate_ci_upsell_impression_timestamp", 0L) > millis) {
                            AbstractC167007dF.A18(interfaceC19630xq, "search_nullstate_ci_upsell_impression_count", 0);
                        }
                    }
                    boolean isEmpty = A1J.isEmpty();
                    Resources resources = context.getResources();
                    if (isEmpty) {
                        c65957Tx9.A04(C05F.A00, new Tx3(AbstractC166997dE.A0q(resources, 2131955172)), null);
                    } else {
                        String A0q = AbstractC166997dE.A0q(resources, 2131955172);
                        String A0q2 = AbstractC166997dE.A0q(context.getResources(), 2131956593);
                        C68089V9y c68089V9y = new C68089V9y("search_nullstate_ci_row_upsell");
                        Integer num2 = C05F.A00;
                        c65957Tx9.A04(num2, new VA6(c68089V9y, num2, A0q, A0q2, "search_nullstate_ci_row_upsell", null, 0), null);
                    }
                }
            }
        }
        if (!A1J.isEmpty()) {
            BHS bhs = new BHS(new Object[0], 2131973059);
            Integer num3 = C05F.A0C;
            c65957Tx9.A04(num3, new C51760Mtj(bhs, num3, C05F.A00), new Object());
            U0M A005 = U0B.A00(userSession);
            int i5 = A005.A01;
            if (i5 != 0 && (!A005.A02.A04.isEmpty()) && i5 != 3) {
                i2 = A005.A00;
            } else {
                i2 = -1;
            }
            U0J A006 = AbstractC65962TxF.A00(userSession);
            if (A006.A07 && (!A006.A03.isEmpty())) {
                i3 = A006.A04;
            } else {
                i3 = -1;
            }
            if (i2 > 0) {
                i4 = Math.min(Integer.MAX_VALUE, i2);
            } else {
                i4 = Integer.MAX_VALUE;
            }
            if (i3 > 0) {
                i4 = Math.min(i4, i3);
            }
            if (u22.A07) {
                i4 = Math.min(i4, 4);
            }
            if (i4 == Integer.MAX_VALUE) {
                i4 = -1;
            }
            List list4 = A1J;
            if (i4 > 0) {
                list4 = A1J.subList(0, Math.min(i4, A1J.size()));
            }
            c65957Tx9.A05("", list4, u22.A05);
        }
        if (z && u22.A07) {
            U22.A00(c65957Tx9, u22);
        }
        if (AbstractC65962TxF.A00(userSession).A07) {
            U0J A007 = AbstractC65962TxF.A00(userSession);
            if (A007.A07) {
                list = A007.A03;
            } else {
                list = C16930sl.A00;
            }
            String str = AbstractC65962TxF.A00(userSession).A01;
            List list5 = AbstractC65962TxF.A00(userSession).A02;
            if ((!list.isEmpty()) && str != null && str.length() != 0) {
                boolean z2 = !C18U.A06(C06090Tz.A06, userSession, 36321082428695694L);
                BQO bqo = new BQO(str);
                if (z2) {
                    num = C05F.A0C;
                } else {
                    num = null;
                }
                c65957Tx9.A04(C05F.A0C, new C51760Mtj(bqo, num, C05F.A1F), new Object());
                C34520FJg c34520FJg3 = AbstractC65975TxT.A00(userSession).A02;
                if (c34520FJg3 != null) {
                    user = c34520FJg3.A00;
                } else {
                    user = null;
                }
                if (AbstractC65975TxT.A00(userSession).A06 && (c34520FJg2 = AbstractC65975TxT.A00(userSession).A02) != null) {
                    arrayList = c34520FJg2.A01;
                } else {
                    arrayList = new ArrayList();
                }
                if (AbstractC65975TxT.A00(userSession).A06 && (c34520FJg = AbstractC65975TxT.A00(userSession).A02) != null) {
                    String id = c34520FJg.A00.getId();
                    i = 0;
                    if (id.length() != 0) {
                        for (Object obj : list) {
                            int i6 = i + 1;
                            if (i < 0) {
                                break;
                            }
                            if (C14360o3.A0K(((AbstractC65924TwV) obj).A01(), id)) {
                                break;
                            }
                            i = i6;
                        }
                    }
                }
                i = -1;
                if (user != null && (!arrayList.isEmpty()) && i != -1) {
                    VA8 va8 = new VA8(user, arrayList);
                    int i7 = 0;
                    for (Object obj2 : list) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            C65954Twz c65954Twz = new C65954Twz();
                            c65954Twz.A09 = "null_state_suggested_users";
                            c65954Twz.A08 = "SUGGESTED_USERS";
                            c65954Twz.A0G = true;
                            if (list5 != null) {
                                list3 = (List) AbstractC001800i.A0O(list5, i7);
                            } else {
                                list3 = null;
                            }
                            c65954Twz.A0B = list3;
                            c65954Twz.A01 = i7;
                            Locale locale = Locale.getDefault();
                            C14360o3.A07(locale);
                            String lowerCase = "SUGGESTED_USERS".toLowerCase(locale);
                            C14360o3.A07(lowerCase);
                            c65954Twz.A05 = lowerCase;
                            c65957Tx9.A01(c65954Twz, obj2);
                            if (i7 == i) {
                                C65954Twz c65954Twz2 = new C65954Twz();
                                c65954Twz2.A09 = "null_state_suggested_users";
                                c65954Twz2.A08 = "SUGGESTED_USERS";
                                c65957Tx9.A04(C05F.A00, va8, new Tx0(c65954Twz2));
                            }
                            i7 = i8;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                } else {
                    int i9 = 0;
                    for (Object obj3 : list) {
                        int i10 = i9 + 1;
                        if (i9 >= 0) {
                            C65954Twz c65954Twz3 = new C65954Twz();
                            c65954Twz3.A09 = "null_state_suggested_users";
                            c65954Twz3.A08 = "SUGGESTED_USERS";
                            c65954Twz3.A0G = true;
                            if (list5 != null) {
                                list2 = (List) AbstractC001800i.A0O(list5, i9);
                            } else {
                                list2 = null;
                            }
                            c65954Twz3.A0B = list2;
                            c65954Twz3.A01 = i9;
                            Locale locale2 = Locale.getDefault();
                            C14360o3.A07(locale2);
                            String lowerCase2 = "SUGGESTED_USERS".toLowerCase(locale2);
                            C14360o3.A07(lowerCase2);
                            c65954Twz3.A05 = lowerCase2;
                            c65957Tx9.A01(c65954Twz3, obj3);
                            i9 = i10;
                        } else {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
            if (C18U.A06(C06090Tz.A06, userSession, 36321082428695694L)) {
                VA7 va7 = new VA7();
                C65959TxB c65959TxB = c65957Tx9.A02;
                c65959TxB.A00.add(va7);
                c65959TxB.A01.add(null);
                c65957Tx9.A00++;
            }
        }
        if (U0B.A00(userSession).A01 != 3) {
            List list6 = U0B.A00(userSession).A02.A04;
            if (!list6.isEmpty()) {
                c65957Tx9.A04(C05F.A0C, new C51760Mtj(new BHS(new Object[0], 2131973058), C05F.A01, C05F.A0u), new Object());
                for (Object obj4 : list6) {
                    C65954Twz c65954Twz4 = new C65954Twz();
                    c65954Twz4.A09 = "null_state_popular";
                    c65954Twz4.A08 = "POPULAR";
                    Locale locale3 = Locale.getDefault();
                    C14360o3.A07(locale3);
                    String lowerCase3 = "POPULAR".toLowerCase(locale3);
                    C14360o3.A07(lowerCase3);
                    c65954Twz4.A05 = lowerCase3;
                    c65957Tx9.A01(c65954Twz4, obj4);
                }
            }
        }
        return c65957Tx9.A00();
    }
}
