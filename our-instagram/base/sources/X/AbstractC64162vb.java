package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC64162vb implements InterfaceC43071ya {
    public final long A00;
    public final C1BX A01;
    public final C62792tI A02;
    public final InterfaceC62702t9 A03;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.2t9] */
    public AbstractC64162vb(C1BX c1bx) {
        C62792tI c62792tI = new C62792tI(c1bx, C13920nI.A00);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(1L);
        ?? obj = new Object();
        this.A02 = c62792tI;
        this.A00 = c1bx.A0G("override_staleTime_in_testMode", false) ? timeUnit.toMillis(0L) : millis;
        this.A01 = c1bx;
        this.A03 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 3351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64162vb.A03(java.lang.Object, java.lang.Object):void");
    }

    public void A04(Object obj, Object obj2) {
        InterfaceC02590Ai A00;
        String id;
        C4SX A002;
        User BSW;
        String A07;
        String A072;
        int position;
        if (this instanceof C34A) {
            C34A c34a = (C34A) this;
            C38321qM c38321qM = (C38321qM) obj;
            C75113Zb c75113Zb = (C75113Zb) obj2;
            C14360o3.A0B(c38321qM, 0);
            C14360o3.A0B(c75113Zb, 1);
            boolean A0p = c75113Zb.A0p();
            UserSession userSession = c34a.A00;
            Boolean valueOf = Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36313424502523884L));
            if (!A0p) {
                C0w9.A03("OrganicImpressionEventAction:handleSubImpression", AnonymousClass001.A0R("position in media state is not set, media type is ", c38321qM.BRp().name()));
                position = -1;
            } else {
                position = c75113Zb.getPosition();
            }
            AbstractC61692rW abstractC61692rW = c34a.A03;
            if (abstractC61692rW != null && abstractC61692rW.A09(c75113Zb.A0o)) {
                abstractC61692rW.A06(c38321qM, c75113Zb.A03);
            }
            C82623mQ.A02(userSession, c34a.A01, c38321qM, c34a.A02, true, valueOf, position, c75113Zb.A03);
            return;
        }
        if (this instanceof C34J) {
            C34J c34j = (C34J) this;
            C38321qM c38321qM2 = (C38321qM) obj;
            C75113Zb c75113Zb2 = (C75113Zb) obj2;
            C14360o3.A0B(c38321qM2, 0);
            C14360o3.A0B(c75113Zb2, 1);
            AbstractC61692rW abstractC61692rW2 = c34j.A04;
            if (abstractC61692rW2 != null && abstractC61692rW2.A09(c75113Zb2.A0o)) {
                abstractC61692rW2.A06(c38321qM2, c75113Zb2.A03);
            }
            if (c75113Zb2.A0o == AnonymousClass341.A0A && (A072 = AbstractC41071vF.A07(c34j.A01, c38321qM2)) != null) {
                c34j.A05.EI6(EnumC64262vl.A05, AnonymousClass317.A0M, EnumC64222vh.A04, A072);
            }
            UserSession userSession2 = c34j.A01;
            Context context = c34j.A00;
            InterfaceC60442pS interfaceC60442pS = c34j.A03;
            C30W c30w = c34j.A02;
            C14360o3.A0B(c30w, 5);
            C82713mZ A02 = c30w.A02(c38321qM2, interfaceC60442pS, c75113Zb2.getPosition());
            if (A02 == null) {
                return;
            }
            A02.A03();
            A02.A02();
            A02.A8I = c75113Zb2.A2Q;
            A02.A8J = AbstractC41071vF.A0R(userSession2, c38321qM2);
            C82623mQ c82623mQ = C82623mQ.A00;
            A02.A8H = AbstractC82643mS.A00(userSession2);
            String str = C1QM.A00.A02.A00;
            if (str != null) {
                A02.A6C = str;
            }
            C30W.A02.A03(userSession2, A02, c38321qM2, c75113Zb2, new StringBuilder());
            C30U.A00(A02, c38321qM2, interfaceC60442pS, c75113Zb2.getPosition());
            c82623mQ.A03(userSession2, A02, c38321qM2, interfaceC60442pS, c75113Zb2);
            C82623mQ.A00(context, A02, c75113Zb2);
            if (AbstractC61652rS.A02(userSession2)) {
                A02.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession2)).toString();
                A02.A4e = AbstractC61652rS.A00(userSession2).toString();
            }
            C32U.A0E(userSession2, A02, c38321qM2, interfaceC60442pS, c75113Zb2.A03);
            return;
        }
        if (this instanceof C35Z) {
            return;
        }
        if (this instanceof C681335b) {
            C681335b c681335b = (C681335b) this;
            C38321qM c38321qM3 = (C38321qM) obj;
            C14360o3.A0B(c38321qM3, 0);
            C681335b.A00(c38321qM3, c681335b);
            C681335b.A01(c38321qM3, c681335b);
            return;
        }
        if (this instanceof C34O) {
            C34O c34o = (C34O) this;
            C38321qM c38321qM4 = (C38321qM) obj;
            C42C c42c = (C42C) obj2;
            C14360o3.A0B(c38321qM4, 0);
            C14360o3.A0B(c42c, 1);
            C75113Zb c75113Zb3 = c42c.A01;
            if (c75113Zb3.A0o == AnonymousClass341.A0A && (A07 = AbstractC41071vF.A07(c34o.A00, c38321qM4)) != null) {
                c34o.A03.EI6(EnumC64262vl.A05, AnonymousClass317.A0M, EnumC64222vh.A04, A07);
            }
            UserSession userSession3 = c34o.A00;
            int i = c42c.A00;
            InterfaceC60442pS interfaceC60442pS2 = c34o.A02;
            C30W c30w2 = c34o.A01;
            C14360o3.A0B(c30w2, 5);
            C82713mZ A03 = c30w2.A03(c38321qM4, interfaceC60442pS2, "sub_impression", i, c75113Zb3.getPosition());
            if (A03 == null) {
                return;
            }
            A03.A03();
            A03.A02();
            A03.A8I = c75113Zb3.A2Q;
            A03.A8J = AbstractC41071vF.A0R(userSession3, c38321qM4);
            if (AbstractC61652rS.A02(userSession3)) {
                A03.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession3)).toString();
                A03.A4e = AbstractC61652rS.A00(userSession3).toString();
            }
            C32U.A0F(userSession3, A03, c38321qM4, interfaceC60442pS2, C05F.A00, i, true);
            return;
        }
        if (!(this instanceof C38V)) {
            if (this instanceof C38S) {
                C38S c38s = (C38S) this;
                C38321qM c38321qM5 = (C38321qM) obj;
                C14360o3.A0B(c38321qM5, 0);
                InterfaceC60442pS interfaceC60442pS3 = c38s.A02;
                UserSession userSession4 = c38s.A01;
                AbstractC41775Ier.A0A(userSession4, c38321qM5, interfaceC60442pS3, AbstractC40636Hzu.A00(AbstractC76443bo.A00(userSession4, c38321qM5, interfaceC60442pS3)), c38s.A05, c38s.A06, c38s.A04, true, c38s.A07);
                return;
            }
            if (this instanceof C35E) {
                C35E c35e = (C35E) this;
                C38321qM c38321qM6 = (C38321qM) obj;
                C14360o3.A0B(c38321qM6, 0);
                C41771Ien.A07(c35e.A01, c35e.A00, c38321qM6, "on_impression", true);
                return;
            }
            if (this instanceof C689138c) {
                C38321qM c38321qM7 = (C38321qM) obj;
                ((Number) obj2).intValue();
                C14360o3.A0B(c38321qM7, 0);
                C689138c.A00((C689138c) this, c38321qM7);
                return;
            }
            if (this instanceof C64942ws) {
                C39692HjO c39692HjO = (C39692HjO) obj;
                IJ0 ij0 = (IJ0) obj2;
                C14360o3.A0B(c39692HjO, 0);
                C14360o3.A0B(ij0, 1);
                ProductFeedItem productFeedItem = c39692HjO.A00;
                InterfaceC99144cb interfaceC99144cb = ij0.A02;
                C64952wt c64952wt = ((C64942ws) this).A00;
                Object obj3 = ij0.A04.get(productFeedItem.getId());
                obj3.getClass();
                C41075IGs c41075IGs = new C41075IGs(productFeedItem, c64952wt, 0, ((Number) obj3).intValue());
                C25531Mh c25531Mh = c41075IGs.A01;
                c25531Mh.A0R("product_collection_type", String.valueOf(interfaceC99144cb.B60()));
                String Byk = interfaceC99144cb.Byk();
                if (Byk != null) {
                    c25531Mh.A0l(Byk);
                }
                String Byo = interfaceC99144cb.Byo();
                if (Byo != null) {
                    c25531Mh.A0R("source_media_type", Byo);
                }
                if (interfaceC99144cb instanceof MultiProductComponent) {
                    c25531Mh.A0R("submodule", ((MultiProductComponent) interfaceC99144cb).A00());
                }
                String Byo2 = interfaceC99144cb.Byo();
                int i2 = ij0.A01;
                Integer valueOf2 = Integer.valueOf(i2);
                if (Byo2 != null) {
                    c25531Mh.A0R("source_media_type", Byo2);
                }
                if (valueOf2 != null) {
                    c25531Mh.A0Q("chaining_position", Long.valueOf(i2));
                }
                String C3N = interfaceC99144cb.C3N();
                if (C3N != null) {
                    c25531Mh.A0R("submodule", C3N);
                }
                if (!((AbstractC02600Aj) c41075IGs.A00).A00.isSampled()) {
                    return;
                }
                c25531Mh.Cht();
                return;
            }
            if (this instanceof C64922wq) {
                C64922wq c64922wq = (C64922wq) this;
                C39693HjP c39693HjP = (C39693HjP) obj;
                int intValue = ((Number) obj2).intValue();
                C14360o3.A0B(c39693HjP, 0);
                InterfaceC99144cb interfaceC99144cb2 = c39693HjP.A00;
                if (interfaceC99144cb2 instanceof C99134ca) {
                    String str2 = null;
                    C99134ca c99134ca = (C99134ca) interfaceC99144cb2;
                    C64902wo c64902wo = c64922wq.A00;
                    if (c99134ca != null) {
                        str2 = c99134ca.A02.A00;
                    }
                    C14360o3.A0B(interfaceC99144cb2, 0);
                    C18920wW c18920wW = c64902wo.A01;
                    A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2575));
                    if (!A00.isSampled()) {
                        return;
                    }
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("submodule", str2);
                    c0Zx.A06("prior_module", c64902wo.A05);
                    c0Zx.A06("prior_submodule", c64902wo.A06);
                    c0Zx.A06("shopping_session_id", c64902wo.A07);
                    c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
                    A00.AAQ(c0Zx, "navigation_info");
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A05("chaining_position", Long.valueOf(intValue));
                    c0Zx2.A06("chaining_session_id", c64902wo.A02);
                    c0Zx2.A06("m_pk", interfaceC99144cb2.Byk());
                    c0Zx2.A06("parent_m_pk", c64902wo.A04);
                    c0Zx2.A05("m_t", Long.valueOf(c64902wo.A00));
                    c0Zx2.A06("source_media_type", interfaceC99144cb2.Byo());
                    A00.AAQ(c0Zx2, "pivots_logging_info");
                    JI4 Aiv = interfaceC99144cb2.Aiv();
                    String str3 = null;
                    if (Aiv != null && Aiv.BSW() != null) {
                        JI4 Aiv2 = interfaceC99144cb2.Aiv();
                        if (Aiv2 != null && (BSW = Aiv2.BSW()) != null) {
                            str3 = AbstractC76433bn.A00(BSW);
                        }
                        A002 = C4SX.A00(str3);
                        A00.AAK(A002, "merchant_id");
                    }
                } else {
                    C64902wo c64902wo2 = c64922wq.A00;
                    String str4 = c39693HjP.A01;
                    C14360o3.A0B(interfaceC99144cb2, 0);
                    C18920wW c18920wW2 = c64902wo2.A01;
                    A00 = c18920wW2.A00(c18920wW2.A00, "instagram_shopping_product_hscroll_sub_impression");
                    if (!A00.isSampled()) {
                        return;
                    }
                    A00.AAP("prior_module", c64902wo2.A05);
                    A00.AAP("prior_submodule", c64902wo2.A06);
                    A00.AAP("submodule", str4);
                    A00.AAP("shopping_session_id", c64902wo2.A07);
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    EnumC39622HeW B60 = interfaceC99144cb2.B60();
                    if (B60 == null || (id = B60.toString()) == null) {
                        id = interfaceC99144cb2.getId();
                    }
                    A00.AAP("product_collection_type", id);
                    String str5 = c64902wo2.A03;
                    if (str5 != null) {
                        A002 = C4SX.A00(str5);
                        A00.AAK(A002, "merchant_id");
                    }
                }
            } else {
                if ((this instanceof C65052x3) || (this instanceof C65072x5)) {
                    return;
                }
                if (this instanceof C86323t4) {
                    C86323t4 c86323t4 = (C86323t4) this;
                    C38321qM c38321qM8 = (C38321qM) obj;
                    C14360o3.A0B(c38321qM8, 0);
                    UserSession userSession5 = c86323t4.A00;
                    if (c38321qM8.A1g(userSession5).CdW()) {
                        InterfaceC60442pS interfaceC60442pS4 = c86323t4.A01;
                        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS4, AnonymousClass001.A0R("instagram_ad_", "tags_list_entry_point_sub_impression"));
                        c82713mZ.A0G(userSession5, c38321qM8);
                        c82713mZ.A6Z = null;
                        c82713mZ.A4P = "shopping";
                        c82713mZ.A02();
                        AbstractC41665Ibx.A00(userSession5, c82713mZ, c38321qM8, interfaceC60442pS4);
                        return;
                    }
                    InterfaceC60442pS interfaceC60442pS5 = c86323t4.A01;
                    String str6 = c86323t4.A02;
                    C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS5, userSession5);
                    A00 = A01.A00(A01.A00, "instagram_shopping_tags_list_entry_point_sub_impression");
                    if (!A00.isSampled()) {
                        return;
                    }
                    A00.AAP("shopping_session_id", str6);
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.A9M("product_merchant_ids", C128205qp.A0D(c38321qM8.A3J()));
                    A00.A7v("is_checkout_enabled", C128205qp.A08(c38321qM8.A3J()));
                    A00.AAP("m_pk", c38321qM8.getId());
                } else if (!(this instanceof C64152va)) {
                    if (!(this instanceof C64182vd)) {
                        return;
                    }
                    C38626GyT c38626GyT = (C38626GyT) obj;
                    int intValue2 = ((Number) obj2).intValue();
                    C14360o3.A0B(c38626GyT, 0);
                    C64042vP c64042vP = ((C64182vd) this).A00;
                    HBC hbc = c38626GyT.A03;
                    IntentAwareAdPivotState intentAwareAdPivotState = c38626GyT.A01;
                    C14360o3.A0B(hbc, 0);
                    C14360o3.A0B(intentAwareAdPivotState, 1);
                    C64042vP.A07(intentAwareAdPivotState, hbc, c64042vP, "sub_impression", intValue2);
                    return;
                }
            }
            A00.Cht();
            return;
        }
        ((Number) obj2).intValue();
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
            String BKe = this.A03.BKe(c59062n7);
            C62792tI c62792tI = this.A02;
            if (!c62792tI.A00.A0F(BKe)) {
                A03(c59062n7.A03, c59062n7.A04);
            } else if (!c62792tI.A03(BKe, this.A00)) {
                return;
            } else {
                A04(c59062n7.A03, c59062n7.A04);
            }
            c62792tI.A02(BKe);
        }
    }

    public AbstractC64162vb(C1BX c1bx, InterfaceC62702t9 interfaceC62702t9) {
        C62792tI c62792tI = new C62792tI(c1bx, C13920nI.A00);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(1L);
        this.A02 = c62792tI;
        this.A00 = c1bx.A0G("override_staleTime_in_testMode", false) ? timeUnit.toMillis(0L) : millis;
        this.A01 = c1bx;
        this.A03 = interfaceC62702t9;
    }
}
