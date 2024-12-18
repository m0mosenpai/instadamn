package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.MomentAdsTypeEnum;
import com.instagram.common.session.UserSession;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.39c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C691639c {
    public final UserSession A00;
    public final InterfaceC686036x A01;
    public final InterfaceC60442pS A02;
    public final C65502xm A03;
    public final C57462kL A04;

    public C691639c(UserSession userSession, InterfaceC686036x interfaceC686036x, InterfaceC60442pS interfaceC60442pS, C65502xm c65502xm, C57462kL c57462kL) {
        C14360o3.A0B(c65502xm, 5);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A01 = interfaceC686036x;
        this.A04 = c57462kL;
        this.A03 = c65502xm;
    }

    public final void A05(AnonymousClass306 anonymousClass306, C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        EnumC65592xv A00;
        if (c38321qM.A5M()) {
            A00 = this.A03.A00(c38321qM, EnumC65542xq.A03, this.A02.getModuleName());
        } else if (c38321qM.A5Q()) {
            A00 = EnumC65592xv.A0G;
        } else if (c38321qM.BRp() == EnumC40111tc.A0G) {
            A00 = EnumC65592xv.A12;
        } else {
            C57462kL c57462kL = this.A04;
            if (c57462kL != null) {
                InterfaceC60442pS interfaceC60442pS = this.A02;
                interfaceC60442pS.getModuleName();
                if (c57462kL.A05(c38321qM)) {
                    if (c75113Zb.A2e) {
                        A00 = EnumC65592xv.A0k;
                    } else {
                        A00 = this.A03.A01(c38321qM, interfaceC60442pS.getModuleName());
                    }
                }
            }
            UserSession userSession = this.A00;
            if (C14360o3.A0K(str, "main_feed") && c38321qM.A0C.Aso() != null && C18U.A06(C06090Tz.A05, userSession, 36313222638208842L)) {
                A00 = EnumC65592xv.A0x;
            } else if (c38321qM.BRp() == EnumC40111tc.A0S) {
                A00 = EnumC65592xv.A1N;
            } else {
                A00 = this.A03.A00(c38321qM, EnumC65542xq.A09, this.A02.getModuleName());
            }
        }
        A06(anonymousClass306, c38321qM, c75113Zb, A00.ordinal());
    }

    public final void A07(C76873cZ c76873cZ, C75113Zb c75113Zb) {
        C3HM c3hm = C3HM.A00;
        UserSession userSession = this.A00;
        if (c3hm.A03(userSession) && c76873cZ.A07) {
            for (C84923qg c84923qg : Collections.unmodifiableList(c76873cZ.A02)) {
                if ((c84923qg != null && c84923qg.A0k) || C3HM.A01(userSession)) {
                    C14360o3.A0A(c84923qg);
                    this.A01.BS6().A8A(new C79233gU(c84923qg, c76873cZ.A01, c75113Zb, c76873cZ.A04), EnumC65592xv.A0r.ordinal());
                }
            }
        }
    }

    public final boolean A08(AnonymousClass306 anonymousClass306, C38321qM c38321qM, C75113Zb c75113Zb) {
        EnumC65592xv enumC65592xv;
        if (!c75113Zb.Ceb() || !c75113Zb.A27 || C41765Ieg.A05(c38321qM, c75113Zb.A0m, c75113Zb)) {
            return false;
        }
        if (c38321qM.CdW()) {
            if (c75113Zb.A0m == EnumC75193Zm.A05) {
                enumC65592xv = EnumC65592xv.A1V;
            } else {
                enumC65592xv = EnumC65592xv.A1Z;
            }
        } else {
            enumC65592xv = EnumC65592xv.A1Y;
        }
        A06(anonymousClass306, c38321qM, c75113Zb, enumC65592xv.ordinal());
        return true;
    }

    public static final List A00(C76873cZ c76873cZ, C75113Zb c75113Zb) {
        if (!c76873cZ.A06 && c76873cZ.A07) {
            List<C84923qg> unmodifiableList = Collections.unmodifiableList(c76873cZ.A02);
            C14360o3.A07(unmodifiableList);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(unmodifiableList, 10));
            for (C84923qg c84923qg : unmodifiableList) {
                C14360o3.A0A(c84923qg);
                arrayList.add(new C79233gU(c84923qg, c76873cZ.A01, c75113Zb, c76873cZ.A04));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final void A01(AnonymousClass306 anonymousClass306, C76873cZ c76873cZ, C38321qM c38321qM, C75113Zb c75113Zb) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("addLithoFooterRowAndViewpointData", -696072328);
        }
        int ordinal = EnumC65592xv.A0f.ordinal();
        anonymousClass306.A7b(ordinal, c38321qM, c75113Zb);
        InterfaceC75403a7 BS6 = this.A01.BS6();
        BS6.AAH(ordinal);
        if (c38321qM.CdW()) {
            BS6.AAH(EnumC65592xv.A1K.ordinal());
        }
        Iterator it = A00(c76873cZ, c75113Zb).iterator();
        while (it.hasNext()) {
            BS6.A8A((C79233gU) it.next(), ordinal);
        }
        if (Systrace.A0E(1L)) {
            C0fO.A00(1738581562);
        }
    }

    public final void A02(AnonymousClass306 anonymousClass306, C76873cZ c76873cZ, C38321qM c38321qM, C75113Zb c75113Zb) {
        anonymousClass306.A7b(EnumC65592xv.A0h.ordinal(), c38321qM, c75113Zb);
        InterfaceC75403a7 BS6 = this.A01.BS6();
        BS6.AAH(EnumC65592xv.A0o.ordinal());
        BS6.A8D(EnumC65592xv.A0n.ordinal());
        BS6.AAH(EnumC65592xv.A0p.ordinal());
        Iterator it = A00(c76873cZ, c75113Zb).iterator();
        while (it.hasNext()) {
            BS6.A8A((C79233gU) it.next(), EnumC65592xv.A0f.ordinal());
        }
    }

    public final void A03(AnonymousClass306 anonymousClass306, C38321qM c38321qM, C75113Zb c75113Zb) {
        int ordinal = EnumC65592xv.A0g.ordinal();
        anonymousClass306.A7b(ordinal, c38321qM, c75113Zb);
        InterfaceC75403a7 BS6 = this.A01.BS6();
        if (this.A03.A0V) {
            BS6.AAH(EnumC65592xv.A0o.ordinal());
        } else {
            BS6.AAH(ordinal);
        }
    }

    public final void A04(AnonymousClass306 anonymousClass306, C38321qM c38321qM, C75113Zb c75113Zb) {
        Integer num;
        EnumC65592xv enumC65592xv;
        int ordinal;
        if (AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03) && c75113Zb.A0o != AnonymousClass341.A0N && !C76253bV.A03(this.A00, c38321qM) && c38321qM.A0C.BUm() != MomentAdsTypeEnum.A0B) {
            A06(anonymousClass306, c38321qM, c75113Zb, this.A03.A00(c38321qM, EnumC65542xq.A02, this.A02.getModuleName()).ordinal());
            ordinal = EnumC65592xv.A06.ordinal();
        } else {
            if (c38321qM.A5Q()) {
                return;
            }
            UserSession userSession = this.A00;
            if (AbstractC76443bo.A01(userSession, c38321qM)) {
                num = C05F.A0C;
            } else if (AbstractC76443bo.A02(userSession, c38321qM)) {
                num = C05F.A0N;
            } else if (AbstractC76453bp.A00.A09(c38321qM)) {
                num = C05F.A00;
            } else if (!C76473br.A00(userSession, c38321qM)) {
                return;
            } else {
                num = C05F.A01;
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            enumC65592xv = EnumC65592xv.A1c;
                        } else {
                            throw new IllegalArgumentException(AnonymousClass001.A0R("Unsupported UpcomingEventRowType: ", "COLLECTION"));
                        }
                    } else {
                        enumC65592xv = EnumC65592xv.A1b;
                    }
                } else {
                    enumC65592xv = EnumC65592xv.A0F;
                }
            } else {
                enumC65592xv = EnumC65592xv.A1T;
            }
            ordinal = enumC65592xv.ordinal();
            A06(anonymousClass306, c38321qM, c75113Zb, ordinal);
        }
        c75113Zb.A09(ordinal);
    }

    public final boolean A09(C38321qM c38321qM) {
        return this.A03.A03(c38321qM, EnumC65542xq.A05, this.A02.getModuleName());
    }

    public final boolean A0A(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        EnumC65592xv enumC65592xv;
        C65502xm c65502xm = this.A03;
        EnumC65542xq enumC65542xq = EnumC65542xq.A06;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        if (c65502xm.A03(c38321qM, enumC65542xq, interfaceC60442pS.getModuleName())) {
            if (c38321qM.A5M()) {
                enumC65592xv = EnumC65592xv.A0B;
            } else if (c38321qM.A5Q()) {
                enumC65592xv = EnumC65592xv.A0G;
            } else if (c38321qM.BRp() == EnumC40111tc.A0G) {
                enumC65592xv = EnumC65592xv.A12;
            } else {
                C57462kL c57462kL = this.A04;
                if (c57462kL != null) {
                    interfaceC60442pS.getModuleName();
                    if (c57462kL.A05(c38321qM)) {
                        enumC65592xv = EnumC65592xv.A0S;
                    }
                }
                UserSession userSession = this.A00;
                if (C14360o3.A0K(str, "main_feed") && c38321qM.A0C.Aso() != null && C18U.A06(C06090Tz.A05, userSession, 36313222638208842L)) {
                    enumC65592xv = EnumC65592xv.A0x;
                } else if (c38321qM.BRp() == EnumC40111tc.A0S) {
                    enumC65592xv = EnumC65592xv.A1N;
                } else {
                    enumC65592xv = EnumC65592xv.A0w;
                }
            }
            if (enumC65592xv == EnumC65592xv.A0w && !c75113Zb.A2v) {
                return true;
            }
        }
        return false;
    }

    public final void A06(AnonymousClass306 anonymousClass306, Object obj, Object obj2, int i) {
        try {
            EnumC65592xv enumC65592xv = EnumC65592xv.values()[i];
            if (Systrace.A0E(1L)) {
                C0fO.A01(AnonymousClass001.A0R("addRowAndViewpointData: ", enumC65592xv.A00), -570864331);
            }
            if (obj != null && obj2 != null) {
                anonymousClass306.A7b(i, obj, obj2);
            } else {
                anonymousClass306.A7a(i);
            }
            switch (enumC65592xv.ordinal()) {
                case 6:
                case 95:
                    this.A01.BS6().A87(i);
                    break;
                case 11:
                case 36:
                case 37:
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                case 87:
                    this.A01.BS6().A8D(i);
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                    this.A01.BS6().A8C(i);
                    break;
                case Process.SIGTERM /* 15 */:
                    this.A01.BS6().A8a(i);
                    break;
                case 22:
                case 88:
                    InterfaceC686036x interfaceC686036x = this.A01;
                    interfaceC686036x.BS6().AAH(i);
                    interfaceC686036x.BS6().A8D(EnumC65592xv.A0w.ordinal());
                    break;
                case 35:
                    InterfaceC75403a7 BS6 = this.A01.BS6();
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.FeedCommentRowModelAndState");
                    BS6.A8A((C79233gU) obj2, i);
                    break;
                case 49:
                    this.A01.BS6().A8n(i);
                    break;
                case 65:
                    break;
                case 89:
                case 90:
                    InterfaceC686036x interfaceC686036x2 = this.A01;
                    interfaceC686036x2.BS6().AAH(i);
                    interfaceC686036x2.BS6().A8D(i);
                    break;
                default:
                    this.A01.BS6().AAH(i);
                    break;
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-9972989);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(57655622);
            }
            throw th;
        }
    }
}
