package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.2s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61992s0 implements InterfaceC62002s1 {
    public final java.util.Set A00;

    @Override // X.InterfaceC62002s1
    public final void Dfw(AbstractC115105If abstractC115105If, C1I1 c1i1, int i) {
        C14360o3.A0B(c1i1, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).Dfw(abstractC115105If, c1i1, i);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void DgH(C1I1 c1i1) {
        C14360o3.A0B(c1i1, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).DgH(c1i1);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        C14360o3.A0B(c1i1, 0);
        C14360o3.A0B(c74283Vj, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).DgP(c1i1, c74283Vj);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void DgV(C1I1 c1i1, C74283Vj c74283Vj) {
        C14360o3.A0B(c1i1, 0);
        C14360o3.A0B(c74283Vj, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).DgV(c1i1, c74283Vj);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void Dfx(C1I1 c1i1) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).Dfx(c1i1);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void Dg1(C1I1 c1i1) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).Dg1(c1i1);
        }
    }

    @Override // X.InterfaceC62002s1
    public final void onStop() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC62002s1) it.next()).onStop();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0JO, java.lang.Object] */
    public C61992s0(final Context context, final AbstractC018607g abstractC018607g, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, C61602rN c61602rN, C61582rL c61582rL, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A00 = linkedHashSet;
        linkedHashSet.add(new C62012s2(new Object(), userSession));
        linkedHashSet.add(new C62032s4(C13920nI.A00, (C449725c) userSession.A01(C449725c.class, C25Z.A00)));
        linkedHashSet.add(new AbstractC62022s3(userSession) { // from class: X.2s5
            public final UserSession A00;

            @Override // X.AbstractC62022s3, X.InterfaceC62002s1
            public final void DgH(C1I1 c1i1) {
                C25671My A00;
                Object obj;
                C14360o3.A0B(c1i1, 0);
                C1EU c1eu = c1i1.A00;
                if (!c1eu.A02()) {
                    A00 = AbstractC25651Mw.A00(this.A00);
                    obj = new Object();
                } else {
                    C1EN c1en = c1eu.A04;
                    if (c1en != C1EN.A0K && c1en != C1EN.A0I) {
                        return;
                    }
                    A00 = AbstractC25651Mw.A00(this.A00);
                    obj = new Object();
                }
                A00.E4s((InterfaceC41141vN) obj);
            }

            {
                this.A00 = userSession;
            }
        });
        if (z) {
            linkedHashSet.add(new AbstractC62022s3(context, abstractC018607g, userSession) { // from class: X.2s6
                public boolean A00;
                public final C61972ry A01;
                public final UserSession A02;

                @Override // X.AbstractC62022s3, X.InterfaceC62002s1
                public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
                    if (!this.A00) {
                        this.A00 = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        UserSession userSession2 = this.A02;
                        final C3YT A00 = C3YS.A00(userSession2);
                        InterfaceC19630xq interfaceC19630xq = A00.A00;
                        if (currentTimeMillis < interfaceC19630xq.getLong("lastSyncMediaIdsTime", 0L) || currentTimeMillis > interfaceC19630xq.getLong("lastSyncMediaIdsTime", 0L) + 43200000) {
                            C61972ry c61972ry = this.A01;
                            C25621Ms c25621Ms = new C25621Ms(userSession2);
                            c25621Ms.A09(C05F.A0N);
                            c25621Ms.A0B("media/blocked/");
                            c25621Ms.A0S(C103884m7.class, C103894m8.class);
                            C1ON A0N = c25621Ms.A0N();
                            A0N.A00 = new C1P1() { // from class: X.4m9
                                @Override // X.C1P1
                                public final void onFail(AbstractC115105If abstractC115105If) {
                                    C0f9.A0A(-1320912487, C0f9.A03(-1624821820));
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                                    int A03 = C0f9.A03(778837497);
                                    C103884m7 c103884m7 = (C103884m7) obj;
                                    int A032 = C0f9.A03(-1882074600);
                                    C14360o3.A0B(c103884m7, 0);
                                    C3YT c3yt = C3YT.this;
                                    List list = c103884m7.A00;
                                    C14360o3.A07(list);
                                    c3yt.A04(list);
                                    long time = new Date().getTime();
                                    InterfaceC19610xo ARD = c3yt.A00.ARD();
                                    ARD.E7G("lastSyncMediaIdsTime", time);
                                    ARD.apply();
                                    C0f9.A0A(1147028153, A032);
                                    C0f9.A0A(1119078124, A03);
                                }
                            };
                            c61972ry.schedule(A0N);
                        }
                    }
                }

                {
                    this.A02 = userSession;
                    this.A01 = new C61972ry(context, abstractC018607g, null);
                }
            });
            linkedHashSet.add(new AbstractC62022s3(context, userSession, interfaceC60442pS) { // from class: X.2s7
                public final Context A00;
                public final UserSession A01;
                public final InterfaceC60442pS A02;
                public final boolean A03;
                public final boolean A04;

                @Override // X.AbstractC62022s3, X.InterfaceC62002s1
                public final void DgV(C1I1 c1i1, C74283Vj c74283Vj) {
                    UserSession userSession2;
                    AndroidLink A02;
                    C38687GzS A01;
                    Iterator it = c74283Vj.A00().iterator();
                    C38321qM c38321qM = null;
                    while (true) {
                        boolean z2 = false;
                        if (it.hasNext()) {
                            C3XG c3xg = (C3XG) it.next();
                            if (c3xg.A06 == C1XV.A0Y) {
                                C38321qM A022 = C3XH.A02(c3xg.A05);
                                if (A022 == null) {
                                    continue;
                                } else if (A022.CdW()) {
                                    boolean z3 = this.A03;
                                    if (z3) {
                                        UserSession userSession3 = this.A01;
                                        InterfaceC60442pS interfaceC60442pS2 = this.A02;
                                        C5SE c5se = new C5SE(userSession3, A022);
                                        int i = -1;
                                        if (A022.A5M()) {
                                            i = 0;
                                        }
                                        c5se.A00 = i;
                                        C32U.A0N(userSession3, c5se, A022, interfaceC60442pS2, null, "delivery");
                                    }
                                    Context context2 = this.A00;
                                    if (context2 != null && (A02 = AbstractC905941u.A02(context2, (userSession2 = this.A01), A022, 0, false)) != null) {
                                        if (AbstractC114965Hm.A01(A02) == EnumC906041v.AD_DESTINATION_CANVAS) {
                                            if (A022.A0C.BNL() != null) {
                                                String BNL = A022.A0C.BNL();
                                                if (BNL != null) {
                                                    android.net.Uri A03 = AbstractC08820cl.A03(BNL);
                                                    if (A03 != null && AbstractC41668Ic0.A02(A03, "NonOrganicMediaRequestObserver")) {
                                                        AbstractC41668Ic0.A01(context2, A03, userSession2, "NonOrganicMediaRequestObserver");
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            String AlS = A02.AlS();
                                            if (AlS != null) {
                                                String A07 = AbstractC41071vF.A07(userSession2, A022);
                                                C14360o3.A0B(userSession2, 3);
                                                new C69645Vsm(null, userSession2, AbstractC41071vF.A0F(userSession2, A022), A07, AlS, AbstractC13880nE.A09(context2), AbstractC13880nE.A0A(context2), false).A00();
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else if (AbstractC114965Hm.A01(A02) == EnumC906041v.AD_DESTINATION_LEAD_AD) {
                                            String BMm = A02.BMm();
                                            if (BMm != null) {
                                                C14360o3.A0B(userSession2, 2);
                                                OZD.A01(new C54689ODp(userSession2, BMm, A022.CAR(), AbstractC41071vF.A07(userSession2, A022), new ArrayList(), false));
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else if (AbstractC114965Hm.A01(A02) == EnumC906041v.IG_DESTINATION_BLOKS) {
                                            String Aw8 = A02.Aw8();
                                            if (Aw8 != null) {
                                                if (AbstractC001900j.A0a(Aw8, "com.bloks.www.minishops.ad.collection", false)) {
                                                    A01 = AbstractC41355ISa.A00(userSession2, A022);
                                                } else {
                                                    String Aw82 = A02.Aw8();
                                                    if (Aw82 != null) {
                                                        if (AbstractC001900j.A0a(Aw82, "com.bloks.www.minishops.ad.dynamic.shop.collection", false)) {
                                                            A01 = AbstractC41355ISa.A01(userSession2, A022, A02, this.A02.getModuleName());
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                                if (A01 != null) {
                                                    AbstractC191798eb.A04(context2, new C191778eZ(userSession2), A01.A01, (HashMap) A01.A00, AbstractC22797A3q.A00);
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    }
                                    if (z3) {
                                        AbstractC75103Za.A0D(this.A01, A022, this.A02, this.A04);
                                    }
                                    if (c38321qM == null && c1i1.A00.A02()) {
                                        c38321qM = A022;
                                    }
                                }
                            }
                            if ((c3xg.A05 instanceof InterfaceC73233Pz) && this.A03) {
                                C5I6.A00(this.A01, c3xg, this.A02, c1i1.A00.A0A);
                            }
                        } else {
                            if (c38321qM != null) {
                                C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
                                String id = c38321qM.getId();
                                String id2 = c38321qM.getId();
                                InterfaceC19630xq interfaceC19630xq = A00.A01;
                                if (C14360o3.A0K(id2, interfaceC19630xq.getString("current_ad_id", null)) && interfaceC19630xq.getBoolean("has_seen_current_ad", true)) {
                                    z2 = true;
                                }
                                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                ARD.E7K("current_ad_id", id);
                                ARD.E77("has_seen_current_ad", z2);
                                ARD.apply();
                                return;
                            }
                            return;
                        }
                    }
                }

                {
                    this.A00 = context;
                    this.A01 = userSession;
                    this.A02 = interfaceC60442pS;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    this.A03 = !C18U.A06(c06090Tz, userSession, 36311839658738461L);
                    this.A04 = C18U.A06(c06090Tz, userSession, 36312866155922778L);
                }
            });
            linkedHashSet.add(new C62072s8(userSession));
            linkedHashSet.add(new C62082s9(userSession, context));
            linkedHashSet.add(new C62092sA(userSession, context));
            linkedHashSet.add(new C62102sB(userSession));
        }
        if (c61582rL != null) {
            linkedHashSet.add(new C62122sD(new C62112sC(c61582rL)));
        }
        if (c61602rN != null) {
            linkedHashSet.add(new C62132sE(c61602rN));
        }
    }
}
