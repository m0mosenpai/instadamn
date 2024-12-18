package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1en, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31441en implements InterfaceC29421bJ {
    public static final C0KV A02 = new C0KV() { // from class: X.1eo
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-501209763);
            int A032 = C0f9.A03(-377722829);
            C31441en c31441en = new C31441en(userSession, new B2I(userSession, this));
            C0f9.A0A(-1039254500, A032);
            C0f9.A0A(-957536739, A03);
            return c31441en;
        }
    };
    public final UserSession A00;
    public final InterfaceC08830cm A01;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C81663kb A03;
        ImmutableList copyOf;
        ImmutableList copyOf2;
        boolean A06;
        C31391ei c31391ei = (C31391ei) c1ow;
        String str = c31391ei.A01.A06;
        if (str != null) {
            IGFOAMessagingLocalSendSpeedLogger A00 = C7R5.A00(this.A00, Integer.valueOf(str.hashCode()));
            if (A00 != null) {
                A00.onLogSendServiceEnd();
                A00.onLogShowOptimisticMessageStart();
            }
        }
        C2DS c2ds = (C2DS) this.A01.get();
        DirectThreadKey directThreadKey = c31391ei.A02;
        String str2 = c31391ei.A03;
        String str3 = ((C1OW) c31391ei).A05;
        C47948LGd c47948LGd = c31391ei.A01;
        C2DU c2du = (C2DU) c2ds;
        synchronized (c2du) {
            C14360o3.A0B(directThreadKey, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(c47948LGd, 3);
            C83403nh BSh = c2du.BSh(directThreadKey, str2);
            if (BSh != null && (A03 = C2DU.A03(c2du, directThreadKey)) != null) {
                UserSession userSession = c2du.A0A;
                int C7g = A03.C7g();
                synchronized (BSh) {
                    BSh.A1e = str3;
                    BSh.A0Y = c47948LGd;
                    BSh.A1k = c47948LGd.A06;
                    if (C4GR.A03(C7g)) {
                        String str4 = c47948LGd.A07;
                        if ("created".equals(str4) && c47948LGd.A01 != null) {
                            ImmutableList.Builder builder = new ImmutableList.Builder();
                            List list = BSh.A22;
                            if (list == null) {
                                copyOf2 = ImmutableList.of();
                            } else {
                                copyOf2 = ImmutableList.copyOf((Collection) list);
                            }
                            C1LC it = copyOf2.iterator();
                            boolean z = false;
                            while (it.hasNext()) {
                                DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) it.next();
                                if (directCountBasedReaction.A01.equals(c47948LGd.A01)) {
                                    if (directCountBasedReaction.A02) {
                                        break;
                                    }
                                    directCountBasedReaction.A00++;
                                    directCountBasedReaction.A02 = true;
                                    builder.add((Object) directCountBasedReaction);
                                    z = true;
                                } else {
                                    if (C7g != 29) {
                                        if (C7g != 61) {
                                            if (C7g == 62) {
                                                A06 = C18U.A06(C06090Tz.A06, userSession, 36320232025432219L);
                                            } else {
                                                throw new IllegalStateException("Unsupported thread subtype");
                                            }
                                        } else {
                                            A06 = C18U.A06(C06090Tz.A06, userSession, 36320232025497756L);
                                        }
                                    } else {
                                        A06 = C18U.A06(C06090Tz.A06, userSession, 36320232024842389L);
                                    }
                                    boolean z2 = !A06;
                                    if (directCountBasedReaction.A02 && z2) {
                                        directCountBasedReaction.A00--;
                                        directCountBasedReaction.A02 = false;
                                    }
                                    if (directCountBasedReaction.A00 > 0) {
                                        builder.add((Object) directCountBasedReaction);
                                    }
                                }
                            }
                            if (!z) {
                                String str5 = c47948LGd.A01;
                                str5.getClass();
                                builder.add((Object) new DirectCountBasedReaction(str5, 1, true));
                            }
                            C83403nh.A04(userSession, BSh, builder.build());
                            BSh.A2C = true;
                            C83403nh.A06(BSh);
                        } else if ("deleted".equals(str4)) {
                            ImmutableList.Builder builder2 = new ImmutableList.Builder();
                            List list2 = BSh.A22;
                            if (list2 == null) {
                                copyOf = ImmutableList.of();
                            } else {
                                copyOf = ImmutableList.copyOf((Collection) list2);
                            }
                            String str6 = c47948LGd.A01;
                            boolean z3 = false;
                            if (str6 == null) {
                                z3 = true;
                            }
                            C1LC it2 = copyOf.iterator();
                            boolean z4 = false;
                            while (it2.hasNext()) {
                                DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) it2.next();
                                if (directCountBasedReaction2.A02 && (z3 || directCountBasedReaction2.A01.equals(str6))) {
                                    int i = directCountBasedReaction2.A00 - 1;
                                    directCountBasedReaction2.A00 = i;
                                    directCountBasedReaction2.A02 = false;
                                    if (i > 0) {
                                        builder2.add((Object) directCountBasedReaction2);
                                    }
                                    z4 = true;
                                } else {
                                    builder2.add((Object) directCountBasedReaction2);
                                }
                            }
                            if (z4) {
                                C83403nh.A04(userSession, BSh, builder2.build());
                                BSh.A2C = true;
                                C83403nh.A06(BSh);
                            }
                        }
                    } else {
                        C83403nh.A05(userSession, BSh, "created".equals(c47948LGd.A07));
                    }
                }
                c2du.A06.E4s(new C7MA(directThreadKey, BSh.A0i()));
            }
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C31391ei c31391ei = (C31391ei) c1ow;
        String str = ((JTV) mnp2).A02;
        if (!str.equals("upload_failed_permanent") && !str.equals("upload_failed_transient")) {
            return;
        }
        C2DS c2ds = (C2DS) this.A01.get();
        DirectThreadKey directThreadKey = c31391ei.A02;
        String str2 = c31391ei.A03;
        String str3 = ((C1OW) c31391ei).A05;
        C2DU c2du = (C2DU) c2ds;
        C14360o3.A0B(directThreadKey, 0);
        C14360o3.A0B(str2, 1);
        C83403nh BSh = c2du.BSh(directThreadKey, str2);
        if (BSh == null) {
            return;
        }
        BSh.A13(c2du.A0A, str3);
        c2du.A06.E4s(new C7MA(directThreadKey, BSh.A0i()));
    }

    public C31441en(UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = interfaceC08830cm;
        this.A00 = userSession;
    }
}
