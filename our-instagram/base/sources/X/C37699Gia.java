package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Gia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37699Gia {
    public static final C37699Gia A00 = new Object();

    public final InterfaceC671531g A00(final JPb jPb, final UserSession userSession, C1PC c1pc, final InterfaceC670931a interfaceC670931a, final InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31H c31h, final C1PY c1py, final AbstractC39459Hbl abstractC39459Hbl, final AbstractC39459Hbl abstractC39459Hbl2, C37556GgC c37556GgC) {
        InterfaceC671531g c672831t;
        ArrayList A12 = AbstractC166997dE.A12(c1pc, 9);
        C06090Tz c06090Tz = C06090Tz.A05;
        final boolean A06 = C18U.A06(c06090Tz, userSession, 36318526923086064L);
        final boolean A062 = C18U.A06(c06090Tz, userSession, 36318526924593414L);
        A12.add(new AbstractC671431f(jPb, userSession, interfaceC670931a, interfaceC62242sP, c1py, abstractC39459Hbl, abstractC39459Hbl2, A06, A062) { // from class: X.5IJ
            public final JPb A00;
            public final UserSession A01;
            public final InterfaceC670931a A02;
            public final AbstractC39459Hbl A03;
            public final AbstractC39459Hbl A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final long A08;
            public final InterfaceC62242sP A09;
            public final C1PY A0A;
            public final boolean A0B;
            public final boolean A0C;
            public final boolean A0D;
            public final boolean A0E;

            private final String A02(int i) {
                if (i < 0) {
                    return null;
                }
                AbstractC39459Hbl abstractC39459Hbl3 = this.A03;
                if (i >= abstractC39459Hbl3.A0B()) {
                    return null;
                }
                C120985dq A0F = abstractC39459Hbl3.A0F(i);
                if (A0F.A01 == EnumC129395t1.A09) {
                    return A0F.getId();
                }
                C38321qM c38321qM = A0F.A02;
                if (c38321qM != null) {
                    return c38321qM.getId();
                }
                return null;
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ C1PZ A09(InterfaceC42381xS interfaceC42381xS, Integer num, Object obj, int i, int i2, int i3) {
                int i4 = 0;
                Integer num2 = num;
                C14360o3.A0B(num2, 2);
                C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
                if (A03(c206239Bg)) {
                    int A002 = A00();
                    if (A002 == -1) {
                        num2 = C05F.A00;
                    } else {
                        i4 = A002;
                    }
                    return super.A09(interfaceC42381xS, num2, obj, i, i4, i3);
                }
                C1PZ A09 = super.A09(interfaceC42381xS, num2, obj, i, i2, i3);
                if (!this.A07) {
                    return A09;
                }
                C14360o3.A0B(c206239Bg, 0);
                C671831j c671831j = (C671831j) c206239Bg.A04;
                if (c671831j == null) {
                    return A09;
                }
                int A08 = A08(interfaceC42381xS, c671831j, num2, A07(interfaceC42381xS, c671831j));
                if (interfaceC42381xS.Boz() || A03(c206239Bg) || A09.A0C != C05F.A00 || A09.A0B == C05F.A0N || A09.A03 != A08) {
                    return A09;
                }
                C1PZ c1pz = new C1PZ(C05F.A0C);
                c1pz.A0B = C05F.A15;
                return c1pz;
            }

            @Override // X.AbstractC671431f
            public final void A0C(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, C671831j c671831j, Integer num, int i) {
                Integer num2;
                C3YO A002;
                C25615BUc c25615BUc;
                C14360o3.A0B(c1pz, 1);
                C14360o3.A0B(num, 4);
                if (this.A0B) {
                    InterfaceC62242sP interfaceC62242sP2 = this.A09;
                    Object BUM = interfaceC42381xS.BUM();
                    if (interfaceC62242sP2.CdX(BUM)) {
                        num2 = C05F.A0C;
                    } else if (!interfaceC62242sP2.CZK(BUM)) {
                        return;
                    } else {
                        num2 = C05F.A0N;
                    }
                    if (c1pz.A0C != C05F.A01) {
                        String str = null;
                        if (!AbstractC114975Hn.A02(num)) {
                            A002 = C3YM.A00(this.A01);
                            C3YP c3yp = C3YP.A06;
                            Integer num3 = C05F.A0j;
                            Integer valueOf = Integer.valueOf(c1pz.A03);
                            C38321qM c38321qM = ((C120985dq) ((C206239Bg) BUM).A03).A02;
                            if (c38321qM != null) {
                                str = c38321qM.getId();
                            }
                            c25615BUc = new C25615BUc(c3yp, num3, valueOf, null, null, null, null, str);
                        } else {
                            if (!c671831j.A0D(num, num2, (c1pz.A03 - i) - 1)) {
                                return;
                            }
                            A002 = C3YM.A00(this.A01);
                            C3YP c3yp2 = C3YP.A06;
                            Integer num4 = C05F.A0j;
                            int i2 = c1pz.A03;
                            int i3 = (i2 - i) - 1;
                            C38321qM c38321qM2 = ((C120985dq) ((C206239Bg) BUM).A03).A02;
                            if (c38321qM2 != null) {
                                str = c38321qM2.getId();
                            }
                            c25615BUc = new C25615BUc(c3yp2, num4, Integer.valueOf(i2), null, null, Integer.valueOf(i3), null, str);
                        }
                        A002.A07(c25615BUc);
                    }
                }
            }

            @Override // X.AbstractC671431f
            public final void A0D(InterfaceC42381xS interfaceC42381xS, C671831j c671831j, Integer num, Integer num2, int i, int i2, int i3) {
                String str;
                C14360o3.A0B(num, 3);
                if (this.A0B) {
                    C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
                    if (!A0H(c206239Bg)) {
                        if ((num2 == C05F.A0C || num2 == C05F.A0N) && !c671831j.A0D(num2, num, i) && i3 < c671831j.A06) {
                            C3YO A002 = C3YM.A00(this.A01);
                            C3YP c3yp = C3YP.A06;
                            Integer num3 = C05F.A01;
                            Integer valueOf = Integer.valueOf(i2);
                            C38321qM c38321qM = ((C120985dq) c206239Bg.A03).A02;
                            if (c38321qM != null) {
                                str = c38321qM.getId();
                            } else {
                                str = null;
                            }
                            A002.A07(new C25615BUc(c3yp, num3, valueOf, null, null, Integer.valueOf(i), null, str));
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
            
                if (r1 == com.instagram.api.schemas.IntentAwareAdsFormatType.A0B) goto L10;
             */
            @Override // X.AbstractC671431f
            /* renamed from: A0J, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean A0H(X.C206239Bg r4) {
                /*
                    r3 = this;
                    r0 = 0
                    X.C14360o3.A0B(r4, r0)
                    java.lang.Object r2 = r4.A03
                    X.5dq r2 = (X.C120985dq) r2
                    X.C14360o3.A0B(r2, r0)
                    X.1qM r1 = r2.A02
                    if (r1 == 0) goto L17
                    com.instagram.common.session.UserSession r0 = r3.A01
                    boolean r0 = X.C5SG.A00(r0, r1)
                    if (r0 != 0) goto L27
                L17:
                    boolean r0 = r2.A0G()
                    if (r0 == 0) goto L29
                    X.Im7 r0 = r2.A03()
                    int r1 = r0.A00
                    r0 = 9
                    if (r1 != r0) goto L29
                L27:
                    r1 = 1
                L28:
                    return r1
                L29:
                    X.5t1 r0 = r2.A01
                    boolean r0 = X.AbstractC37647Ghg.A01(r0)
                    if (r0 == 0) goto L4a
                    X.1v4 r0 = r2.A06()
                    com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r0.A0C
                    if (r0 == 0) goto L48
                    com.instagram.api.schemas.IntentAwareAdsFormatInfo r0 = r0.B7z()
                    if (r0 == 0) goto L48
                    com.instagram.api.schemas.IntentAwareAdsFormatType r1 = r0.B7y()
                L43:
                    com.instagram.api.schemas.IntentAwareAdsFormatType r0 = com.instagram.api.schemas.IntentAwareAdsFormatType.A0B
                    if (r1 != r0) goto L4a
                    goto L27
                L48:
                    r1 = 0
                    goto L43
                L4a:
                    X.Hbl r0 = r3.A04
                    X.Gfh r0 = (X.C37525Gfh) r0
                    com.instagram.clips.intf.ClipsViewerSource r0 = r0.A02
                    boolean r0 = r0.A00()
                    r1 = 0
                    if (r0 == 0) goto L28
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5IJ.A0H(X.9Bg):boolean");
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r16 = this;
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36318526924003582(0x810782001218fe, double:3.031320897484955E-306)
                    r3 = r18
                    boolean r7 = X.C18U.A06(r2, r3, r0)
                    r0 = 36318526925510931(0x81078200291913, double:3.031320898438209E-306)
                    boolean r8 = X.C18U.A06(r2, r3, r0)
                    r0 = 36318526923413749(0x810782000918f5, double:3.0313208971119425E-306)
                    boolean r12 = X.C18U.A06(r2, r3, r0)
                    r0 = 36318526924003582(0x810782001218fe, double:3.031320897484955E-306)
                    boolean r13 = X.C18U.A06(r2, r3, r0)
                    r0 = 36318526925314320(0x81078200261910, double:3.031320898313871E-306)
                    boolean r9 = X.C18U.A06(r2, r3, r0)
                    r0 = 36318526925379857(0x81078200271911, double:3.031320898355317E-306)
                    boolean r15 = X.C18U.A06(r2, r3, r0)
                    r11 = 0
                    r4 = r16
                    r5 = r20
                    r6 = r21
                    r10 = r24
                    r14 = r25
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    r4.A01 = r3
                    r4.A0A = r6
                    r4.A09 = r5
                    r0 = r22
                    r4.A03 = r0
                    r0 = r19
                    r4.A02 = r0
                    r0 = r23
                    r4.A04 = r0
                    r0 = r17
                    r4.A00 = r0
                    r4.A05 = r10
                    r4.A07 = r14
                    r0 = 36322834775026359(0x810b6d00002ab7, double:3.034045199818083E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    r4.A0B = r0
                    r0 = 36318526924986636(0x8107820021190c, double:3.0313208981066426E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    r4.A0E = r0
                    r0 = 36318526925052173(0x8107820022190d, double:3.0313208981480884E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    r4.A0D = r0
                    r0 = 36600001901891250(0x82078200240eb2, double:3.2093268069098785E-306)
                    long r0 = X.C18U.A01(r2, r3, r0)
                    r4.A08 = r0
                    r0 = 36318526924003582(0x810782001218fe, double:3.031320897484955E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    r4.A0C = r0
                    r0 = 36315593460420022(0x8104d700040db6, double:3.029465763302602E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    r4.A06 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5IJ.<init>(X.JPb, com.instagram.common.session.UserSession, X.31a, X.2sP, X.1PY, X.Hbl, X.Hbl, boolean, boolean):void");
            }

            private final int A00() {
                List A0J = this.A03.A0J();
                ListIterator listIterator = A0J.listIterator(A0J.size());
                while (listIterator.hasPrevious()) {
                    if (((C120985dq) listIterator.previous()).A07() != null) {
                        return listIterator.nextIndex();
                    }
                }
                return -1;
            }

            private final Integer A01(int i) {
                if (i >= 0) {
                    AbstractC39459Hbl abstractC39459Hbl3 = this.A03;
                    if (i < abstractC39459Hbl3.A0B()) {
                        C120985dq A0F = abstractC39459Hbl3.A0F(i);
                        if (A0F.A01 == EnumC129395t1.A09) {
                            return A0F.A01().A00;
                        }
                        C38321qM c38321qM = A0F.A02;
                        if (c38321qM == null) {
                            return null;
                        }
                        return c38321qM.A2M();
                    }
                    return null;
                }
                return null;
            }

            private final boolean A03(C206239Bg c206239Bg) {
                C120985dq c120985dq = (C120985dq) c206239Bg.A03;
                if (AbstractC37647Ghg.A01(c120985dq.A01) && c120985dq.A06().A0x) {
                    if (C18U.A06(C06090Tz.A06, this.A01, 36315112423820296L)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.AbstractC671431f
            public final int A04(int i) {
                AbstractC39459Hbl abstractC39459Hbl3 = this.A03;
                List A0L = abstractC39459Hbl3.A0L(EnumC129395t1.A0L);
                ArrayList arrayList = new ArrayList();
                for (Object obj : A0L) {
                    if (abstractC39459Hbl3.A0C((C120985dq) obj) > i) {
                        break;
                    }
                    arrayList.add(obj);
                }
                return arrayList.size();
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r4, 36318526925248783L) != false) goto L13;
             */
            @Override // X.AbstractC671431f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int A08(X.InterfaceC42381xS r8, X.C671831j r9, java.lang.Integer r10, int r11) {
                /*
                    r7 = this;
                    X.Hbl r3 = r7.A03
                    int r0 = r3.A0B()
                    int r0 = r0 + (-1)
                    if (r0 < 0) goto L7d
                    int r0 = r3.A0B()
                    int r0 = r0 + (-1)
                    X.5dq r0 = r3.A0F(r0)
                    X.5t1 r1 = r0.A01
                    X.5t1 r0 = X.EnumC129395t1.A08
                    if (r1 == r0) goto L7d
                    int r6 = r3.A0B()
                L1e:
                    java.lang.Object r0 = r8.BUM()
                    X.9Bg r0 = (X.C206239Bg) r0
                    java.lang.Object r0 = r0.A03
                    X.5dq r0 = (X.C120985dq) r0
                    X.1qM r0 = r0.A02
                    if (r0 == 0) goto L42
                    com.instagram.common.session.UserSession r4 = r7.A01
                    boolean r0 = X.AbstractC41071vF.A0R(r4, r0)
                    if (r0 == 0) goto L42
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36318526925248783(0x8107820025190f, double:3.0313208982724254E-306)
                    boolean r0 = X.C18U.A06(r2, r4, r0)
                    if (r0 == 0) goto L42
                L41:
                    return r6
                L42:
                    boolean r0 = r7.A0C
                    if (r0 == 0) goto L55
                    long r1 = r7.A08
                    r4 = 0
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 <= 0) goto L55
                    int r0 = (int) r1
                    int r11 = r11 + r0
                    int r0 = java.lang.Math.min(r11, r6)
                    return r0
                L55:
                    boolean r0 = r7.A07
                    if (r0 != 0) goto L41
                    boolean r0 = r7.A0D
                    if (r0 != 0) goto L41
                    boolean r0 = r7.A0E
                    r2 = 0
                    if (r0 == 0) goto L7b
                    int r1 = r7.A00
                    if (r1 <= 0) goto L7b
                L66:
                    X.1pl r0 = r9.A00
                    java.lang.Integer r0 = r0.A09
                    if (r0 == 0) goto L70
                    int r2 = r0.intValue()
                L70:
                    int r11 = r11 + r2
                    int r11 = r11 + r1
                    int r0 = r3.A0B()
                    int r6 = java.lang.Math.min(r11, r0)
                    return r6
                L7b:
                    r1 = 0
                    goto L66
                L7d:
                    int r0 = r3.A0B()
                    int r6 = r0 + (-1)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5IJ.A08(X.1xS, X.31j, java.lang.Integer, int):int");
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ C671831j A0A(Object obj) {
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                return (C671831j) c206239Bg.A04;
            }

            @Override // X.AbstractC671431f
            public final List A0B() {
                return this.A03.A0J();
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ void A0E(Object obj, int i, int i2, int i3) {
                C38321qM c38321qM;
                C75113Zb BRZ;
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                if (C18U.A06(C06090Tz.A05, this.A01, 36318526925117710L) && (c38321qM = ((C120985dq) c206239Bg.A03).A02) != null && (BRZ = this.A00.BRZ(c38321qM)) != null) {
                    BRZ.A0V = i;
                    BRZ.A0G = i2;
                    BRZ.A0R = i3;
                }
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ boolean A0F(C671831j c671831j, Object obj) {
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                InterfaceC670931a interfaceC670931a2 = this.A02;
                AbstractC39459Hbl abstractC39459Hbl3 = this.A03;
                return interfaceC670931a2.CQh(AbstractC001800i.A0O(abstractC39459Hbl3.A0J(), c671831j.A09()), AbstractC001800i.A0O(abstractC39459Hbl3.A0J(), c671831j.A09() - 1), c206239Bg.A03);
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ boolean A0G(C671831j c671831j, Object obj) {
                Integer num;
                Integer num2;
                ArrayList arrayList;
                C38321qM c38321qM;
                BrandSafetyContentBlocklistBitmapQLObj AiW;
                List Ag9;
                C38321qM c38321qM2;
                BrandSafetyContentBlocklistBitmapQLObj AiW2;
                List Ag92;
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                C120985dq c120985dq = (C120985dq) c206239Bg.A03;
                C38321qM c38321qM3 = c120985dq.A02;
                int A09 = c671831j.A09();
                if (c38321qM3 != null) {
                    C75113Zb BRZ = this.A04.BRZ(c38321qM3);
                    int i = A09 - 1;
                    Integer A01 = A01(i);
                    Integer A012 = A01(A09);
                    BRZ.A17 = A01;
                    BRZ.A16 = A012;
                    String A02 = A02(i);
                    String A022 = A02(A09);
                    BRZ.A1R = A02;
                    BRZ.A1N = A022;
                    AbstractC39459Hbl abstractC39459Hbl3 = this.A03;
                    C120985dq c120985dq2 = (C120985dq) AbstractC001800i.A0O(abstractC39459Hbl3.A0J(), i);
                    C120985dq c120985dq3 = (C120985dq) AbstractC001800i.A0O(abstractC39459Hbl3.A0J(), A09);
                    ArrayList arrayList2 = null;
                    if (c120985dq2 != null) {
                        num = AbstractC37725Gj0.A00(c120985dq2);
                    } else {
                        num = null;
                    }
                    if (c120985dq3 != null) {
                        num2 = AbstractC37725Gj0.A00(c120985dq3);
                    } else {
                        num2 = null;
                    }
                    BRZ.A0a(num, num2);
                    if (this.A06) {
                        if (c120985dq2 != null && (c38321qM2 = c120985dq2.A02) != null && (AiW2 = c38321qM2.A0C.AiW()) != null && (Ag92 = AiW2.Ag9()) != null) {
                            arrayList = C5IK.A00.A01(Ag92);
                        } else {
                            arrayList = null;
                        }
                        if (c120985dq3 != null && (c38321qM = c120985dq3.A02) != null && (AiW = c38321qM.A0C.AiW()) != null && (Ag9 = AiW.Ag9()) != null) {
                            arrayList2 = C5IK.A00.A01(Ag9);
                        }
                        if (arrayList != null) {
                            BRZ.A1h = arrayList;
                        }
                        if (arrayList2 != null) {
                            BRZ.A1g = arrayList2;
                        }
                    }
                }
                return this.A02.CeG(c120985dq, this.A03.A0J(), c671831j.A09());
            }

            @Override // X.AbstractC671431f
            public final /* bridge */ /* synthetic */ boolean A0I(Object obj) {
                C206239Bg c206239Bg = (C206239Bg) obj;
                C14360o3.A0B(c206239Bg, 0);
                if (!this.A05 && !A03(c206239Bg)) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC671431f
            public final int A05(InterfaceC42381xS interfaceC42381xS, int i, int i2, int i3) {
                if (A03((C206239Bg) interfaceC42381xS.BUM())) {
                    i3 = A00();
                }
                return ((i - i2) - i3) - 1;
            }

            @Override // X.AbstractC671431f
            public final int A06(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
                if (!A03((C206239Bg) interfaceC42381xS.BUM())) {
                    return c1pz.A03;
                }
                return i;
            }

            @Override // X.AbstractC671431f
            public final int A07(InterfaceC42381xS interfaceC42381xS, C671831j c671831j) {
                C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
                if (A03(c206239Bg)) {
                    int i = 0;
                    Iterator it = this.A03.A0J().iterator();
                    while (it.hasNext()) {
                        if (!C14360o3.A0K(((C120985dq) it.next()).getId(), ((C120985dq) c206239Bg.A03).A06().A0f)) {
                            i++;
                        } else {
                            return i;
                        }
                    }
                    return -1;
                }
                return c671831j.A09();
            }
        });
        if (C18U.A06(c06090Tz, userSession, 36318526923741434L)) {
            A12.add(new C672631r(interfaceC62242sP, interfaceC671231d, c1py, new C37715Giq(userSession, c1pc, interfaceC670931a, interfaceC62242sP, interfaceC671231d, c31h, c1py, new C671931k(interfaceC62242sP), new C672131m(true), abstractC39459Hbl2, c37556GgC), false, false));
        }
        if (C1P8.A03(userSession)) {
            c672831t = new C43005Izv(A12);
        } else {
            c672831t = new C672831t(A12);
        }
        return c672831t;
    }
}
