package X;

import com.instagram.api.schemas.ProductMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HLD extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public HLD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(EnumC74603Ws enumC74603Ws, C38285GsU c38285GsU) {
        java.util.Set set = c38285GsU.A06;
        if (set != null) {
            c38285GsU.A0H.FCF(enumC74603Ws, set);
            c38285GsU.A06 = null;
        }
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        C53093Ne6 c53093Ne6;
        if (this.A00 != 0) {
            A03 = AbstractC167017dG.A0N(abstractC115105If, -1697682501);
            C40791um c40791um = (C40791um) abstractC115105If.A00();
            int i2 = -1;
            if (c40791um != null) {
                i2 = c40791um.mStatusCode;
            } else {
                Throwable A01 = abstractC115105If.A01();
                if ((A01 instanceof C53093Ne6) && (c53093Ne6 = (C53093Ne6) A01) != null) {
                    i2 = c53093Ne6.A00;
                }
            }
            C38285GsU c38285GsU = (C38285GsU) this.A02;
            c38285GsU.A0G.Dfw(abstractC115105If, (C1I1) this.A01, i2);
            c38285GsU.A0E.Dfp();
            A00(EnumC74603Ws.A04, c38285GsU);
            i = 139187528;
        } else {
            A03 = C0f9.A03(-134468791);
            i = 1705160315;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        if (1 - this.A00 != 0) {
            super.onFailInBackground(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(-35130037);
        C38285GsU c38285GsU = (C38285GsU) this.A02;
        c38285GsU.A0G.Dfx((C1I1) this.A01);
        A00(EnumC74603Ws.A04, c38285GsU);
        C0f9.A0A(-1531939931, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(920100946);
            C1I1 c1i1 = (C1I1) this.A01;
            if (c1i1.A00.A02()) {
                ((C38285GsU) this.A02).A02 = AbstractC31173DnH.A0g();
            }
            C38285GsU c38285GsU = (C38285GsU) this.A02;
            c38285GsU.A0G.Dg1(c1i1);
            c38285GsU.A0E.Dfz();
            i = -1810994341;
        } else {
            A03 = C0f9.A03(1457638069);
            i = 1344104329;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(513749897);
            C38285GsU c38285GsU = (C38285GsU) this.A02;
            c38285GsU.A0G.DgH((C1I1) this.A01);
            c38285GsU.A0E.DgF();
            i = 2132473582;
        } else {
            A03 = C0f9.A03(-319175395);
            i = -733640888;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        Product A02;
        String A00;
        ProductImageContainer productImageContainer;
        List AZV;
        EnumC73363Qm enumC73363Qm;
        int i2;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1625850294);
            C74283Vj c74283Vj = (C74283Vj) obj;
            int A032 = C0f9.A03(-1396041387);
            C14360o3.A0B(c74283Vj, 0);
            C38285GsU c38285GsU = (C38285GsU) this.A02;
            if (c38285GsU.A0A.getContext() == null) {
                i2 = -89208284;
            } else {
                A00(EnumC74603Ws.A05, c38285GsU);
                C1I1 c1i1 = (C1I1) this.A01;
                C1EU c1eu = c1i1.A00;
                c38285GsU.A00 = c74283Vj.A00;
                InterfaceC17600tv interfaceC17600tv = c38285GsU.A0F;
                C17590tu c17590tu = c1eu.A03;
                List A002 = c74283Vj.A00();
                boolean A022 = c1eu.A02();
                interfaceC17600tv.Dg5(c17590tu, A002, A022);
                ArrayList A1F = AbstractC166987dD.A1F(c74283Vj.A00());
                JIJ jij = c38285GsU.A0E;
                int size = jij.AZV().size();
                if (A022) {
                    AZV = AbstractC166987dD.A1E();
                } else {
                    AZV = jij.AZV();
                    C14360o3.A07(AZV);
                }
                HashMap A1G = AbstractC166987dD.A1G();
                int size2 = AZV.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    A1G.put(((C3XG) AZV.get(i4)).A09, Integer.valueOf(i4));
                }
                UserSession userSession = c38285GsU.A0D;
                C3Z8.A00(userSession, c1eu.A09, AbstractC31173DnH.A0L(AZV), AbstractC31173DnH.A0L(A1F), false);
                Iterator it = A1F.iterator();
                while (it.hasNext()) {
                    C3XG A0D = AbstractC37300Gc1.A0D(it);
                    if (A1G.get(A0D.A09) != null) {
                        C74493Wh.A04(C74493Wh.A00(c1eu), userSession, A0D, AZV.size() + i3);
                        it.remove();
                    }
                    i3++;
                }
                List A0a = AbstractC001800i.A0a(A1F);
                if (c74283Vj.A04 != null) {
                    C17280tP A003 = C17280tP.A4E.A00();
                    if (!AbstractC167017dG.A1b(A003, A003.A1D, C17280tP.A4G, 203)) {
                        ArrayList A1F2 = AbstractC166987dD.A1F(A0a);
                        C84543q2 c84543q2 = c74283Vj.A04;
                        if (c84543q2 != null) {
                            A0a = C41716Idm.A00(userSession, c84543q2, A0a, AZV, false);
                            C74493Wh.A07(C74493Wh.A00(c1eu), userSession, A1F2, A0a);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                ArrayList A0U = AbstractC001800i.A0U(A0a);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it2 = A0U.iterator();
                while (it2.hasNext()) {
                    C3XG A0D2 = AbstractC37300Gc1.A0D(it2);
                    C38321qM A0E = AbstractC37300Gc1.A0E(A0D2);
                    if (A0E != null) {
                        if ("feed_timeline_older".equals(c38285GsU.A0J)) {
                            C75113Zb BRa = jij.BRa(A0D2);
                            C14360o3.A07(BRa);
                            BRa.A2a = AbstractC167007dF.A1X(A0D2.A06, C1XV.A0H);
                        }
                        A1E.add(A0E);
                    }
                }
                AbstractC002900t.A10(A1E);
                Iterator it3 = A1E.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C38321qM A0i = AbstractC31172DnG.A0i(it3);
                    if (!A0i.A5D()) {
                        c38285GsU.A04 = String.valueOf(A0i.A1B());
                        break;
                    }
                }
                C9CB A004 = C74493Wh.A00(c1eu);
                int size3 = AZV.size();
                C14360o3.A0B(userSession, 1);
                List A06 = C3XG.A0A.A06(A1E);
                int i5 = size3;
                C14360o3.A0B(A06, 2);
                Iterator it4 = A06.iterator();
                while (it4.hasNext()) {
                    size3++;
                    C74493Wh.A05(A004, userSession, AbstractC37300Gc1.A0D(it4), i5);
                    i5 = size3;
                }
                c38285GsU.A0G.DgP(c1i1, c74283Vj);
                boolean z = false;
                jij.DgU(null, null, A0U, null, false, A022);
                C61862rn A005 = C61852rm.A00(userSession);
                if (c74283Vj.CR4()) {
                    enumC73363Qm = EnumC73363Qm.A03;
                } else {
                    enumC73363Qm = null;
                }
                int size4 = AZV.size() + A0U.size();
                if (size != 0 && A022) {
                    z = true;
                }
                A005.A0B(c1eu, enumC73363Qm, null, null, size, size4, z, !A022);
                i2 = 975856928;
            }
            C0f9.A0A(i2, A032);
            i = 1147309990;
        } else {
            A03 = C0f9.A03(-196329223);
            C38856H9e c38856H9e = (C38856H9e) obj;
            int A033 = C0f9.A03(120736880);
            ArrayList A12 = AbstractC166997dE.A12(c38856H9e, 0);
            C14360o3.A0A(c38856H9e.A00);
            List list = c38856H9e.A02;
            C14360o3.A0A(list);
            C40928IBa c40928IBa = new C40928IBa(list);
            C38371Gu8 c38371Gu8 = (C38371Gu8) this.A02;
            User A006 = C38371Gu8.A00(c38371Gu8);
            for (C50627MWo c50627MWo : c40928IBa.A00) {
                InterfaceC58248Prs interfaceC58248Prs = (InterfaceC58248Prs) c50627MWo.A00;
                Object obj2 = c50627MWo.A01;
                if (interfaceC58248Prs != null) {
                    H6a h6a = (H6a) interfaceC58248Prs;
                    JJ0 jj0 = h6a.A00;
                    if (obj2 == ProductMediaType.A04) {
                        C38321qM c38321qM = h6a.A01;
                        if (c38321qM != null && (r6 = c38321qM.getId()) != null && (r5 = c38321qM.A1t()) != null) {
                            A12.add(new ProductTileMedia(r5, A006, r6, null));
                        }
                    } else if (obj2 == ProductMediaType.A05 && jj0 != null && (productImageContainer = ((H6Z) jj0).A00) != null && productImageContainer.BGx() != null) {
                        String id = ((ProductFeedItem) this.A01).getId();
                        ImageInfo A1t = productImageContainer.BGx();
                        A12.add(new ProductTileMedia(A1t, A006, id, null));
                    }
                }
            }
            if (A12.size() < 2 && c38371Gu8.A07 != null) {
                ProductFeedItem productFeedItem = (ProductFeedItem) this.A01;
                if (productFeedItem.A00() != null) {
                    A12.clear();
                    A12.add(new ProductTileMedia(productFeedItem.A00(), A006, productFeedItem.getId(), null));
                    A12.add(productFeedItem.A01(c38371Gu8.A05));
                }
            }
            List list2 = c38371Gu8.A0F;
            if (!A12.equals(list2)) {
                list2.clear();
                if (AbstractC25226BEj.A1b(A12)) {
                    list2.addAll(C15500q5.A02(A12));
                }
                c38371Gu8.notifyDataSetChanged();
                C38321qM c38321qM2 = c38371Gu8.A07;
                if (c38321qM2 != null && (A02 = ((ProductFeedItem) this.A01).A02()) != null) {
                    InterfaceC11380iw interfaceC11380iw = c38371Gu8.A04;
                    C14360o3.A0C(interfaceC11380iw, AbstractC111324zv.A00(7));
                    UserSession userSession2 = c38371Gu8.A05;
                    int size5 = list2.size();
                    String str = c38371Gu8.A0C;
                    String str2 = c38371Gu8.A0D;
                    User user = A02.A0B;
                    if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "instagram_shopping_bottomsheet_product_row_tile_impression");
                        if (A0f.isSampled()) {
                            A0f.AAK(C4SX.A00(userSession2.userId), "ig_user_id");
                            AbstractC37301Gc2.A17(A0f, A00);
                            AbstractC37303Gc4.A0j(A0f, A02);
                            String id2 = c38321qM2.getId();
                            if (id2 != null) {
                                AbstractC37300Gc1.A0l(A0f, id2);
                                C0Zx c0Zx = new C0Zx();
                                AbstractC37301Gc2.A1C(c0Zx, "prior_module", str, "tagged_products");
                                AbstractC37301Gc2.A13(A0f, c0Zx, "prior_submodule", str2);
                                A0f.A9K("num_media_in_product_row", AbstractC31171DnF.A0V(size5));
                                A0f.Cht();
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                }
            }
            C0f9.A0A(-2100739961, A033);
            i = -953890070;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(1119974932);
            C74283Vj c74283Vj = (C74283Vj) obj;
            int A0N = AbstractC167017dG.A0N(c74283Vj, 861626462);
            C38285GsU c38285GsU = (C38285GsU) this.A02;
            c38285GsU.A0G.DgV((C1I1) this.A01, c74283Vj);
            A00(EnumC74603Ws.A05, c38285GsU);
            C0f9.A0A(-119102060, A0N);
            i = 1903028235;
        } else {
            A03 = C0f9.A03(-1686524151);
            C0f9.A0A(83102256, C0f9.A03(1757615448));
            i = -544983327;
        }
        C0f9.A0A(i, A03);
    }
}
