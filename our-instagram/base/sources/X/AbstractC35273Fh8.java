package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fh8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35273Fh8 {
    public static final void A03(EnumC39647Hic enumC39647Hic, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC60442pS, userSession, enumC39647Hic, 5), "commerce_feed_server");
        if (A0f.isSampled()) {
            EnumC33463Eqy enumC33463Eqy = EnumC33463Eqy.FAILURE;
            if (z) {
                enumC33463Eqy = EnumC33463Eqy.SUCCESS;
            }
            Map A0n = AbstractC167007dF.A0n("product_id", str);
            String A14 = AbstractC25225BEi.A14();
            if (A14 == null) {
                A14 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            A0f.AAP(AbstractC111324zv.A00(236), A14);
            A0f.A8R(enumC39647Hic, AbstractC111324zv.A00(1259));
            A0f.A8R(enumC33463Eqy, AbstractC111324zv.A00(1260));
            A0f.A8R(EnumC39649Hie.A06, "analytics_page");
            A0f.A8R(EnumC39644HiZ.TAB_FEED, "referral_surface");
            A0f.AAP(AbstractC111324zv.A00(5206), "save_to_collection_bottom_sheet");
            A0f.AAP("shopping_session_id", str2);
            A0f.A9K("product_id", AbstractC25233BEq.A0n(str));
            A0f.A8R(EnumC39651Hig.A0A, "analytics_component");
            A0f.A8R(EnumC39650Hif.A0C, "analytics_module");
            A0f.A9M("extra_data", A0n);
            A0f.Cht();
        }
    }

    public static final void A07(UserSession userSession, C38321qM c38321qM, SavedCollection savedCollection, Integer num, int i) {
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1F(savedCollection, 3, num);
        if (savedCollection.A07 == EnumC33416Epn.A0C) {
            Integer num2 = C05F.A00;
            List A01 = A01(c38321qM, i);
            if (num == num2) {
                if (A01 != null && AbstractC166987dD.A1b(A01)) {
                    ArrayList A1F = AbstractC166987dD.A1F(AbstractC31172DnG.A19(savedCollection.A0M));
                    Iterator it = A01.iterator();
                    while (it.hasNext()) {
                        ProductImageContainer productImageContainer = ((Product) it.next()).A0A;
                        if (productImageContainer != null) {
                            if (!(A1F instanceof Collection) || !A1F.isEmpty()) {
                                Iterator it2 = A1F.iterator();
                                while (it2.hasNext()) {
                                    if (productImageContainer.BGx().equals(((ProductImageContainer) it2.next()).BGx())) {
                                        break;
                                    }
                                }
                            }
                            A1F.add(0, productImageContainer);
                        }
                    }
                    savedCollection.A04(AbstractC001800i.A0a(A1F));
                    return;
                }
                return;
            }
            if (A01 != null && AbstractC166987dD.A1b(A01)) {
                ArrayList A1F2 = AbstractC166987dD.A1F(AbstractC31172DnG.A19(savedCollection.A0M));
                Iterator it3 = A01.iterator();
                while (it3.hasNext()) {
                    ProductImageContainer productImageContainer2 = ((Product) it3.next()).A0A;
                    if (productImageContainer2 != null) {
                        A1F2.remove(productImageContainer2);
                    }
                }
                savedCollection.A04(AbstractC001800i.A0a(A1F2));
            }
            if (Collections.unmodifiableList(savedCollection.A0M).isEmpty()) {
                C36295Fzp A00 = FBA.A00(userSession);
                String str = savedCollection.A0F;
                C14360o3.A07(str);
                A00.A05(str);
            }
        }
    }

    public static final boolean A08(UserSession userSession) {
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (C18U.A06(A0j, userSession, 36315992892575597L)) {
            return C18U.A06(A0j, userSession, 36315992892444524L);
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, C38321qM c38321qM, int i) {
        List A01;
        C14360o3.A0B(userSession, 2);
        if (c38321qM == null || (A01 = A01(c38321qM, i)) == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                if (!AbstractC1563570f.A00(userSession).A03((Product) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, C38321qM c38321qM, int i) {
        List A01 = A01(c38321qM, i);
        if (A01 == null) {
            return false;
        }
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                if (AbstractC1563570f.A00(userSession).A03((Product) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, C38321qM c38321qM, List list, int i) {
        AbstractC167007dF.A1E(list, 0, userSession);
        C36295Fzp A00 = FBA.A00(userSession);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((SavedCollection) it.next()).A07 == EnumC33416Epn.A0C) {
                    break;
                }
            }
        }
        if (!AbstractC166987dD.A1b(A00.A02(AbstractC166987dD.A1J(EnumC33416Epn.A0C), null)) && c38321qM != null && A0C(c38321qM, i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r29, X.C1P1 r30, com.instagram.common.session.UserSession r31, X.C38321qM r32, X.InterfaceC60442pS r33, X.EnumC77213d7 r34, java.lang.String r35, int r36) {
        /*
            r5 = r29
            r7 = r31
            X.AbstractC167017dG.A1N(r5, r7)
            r0 = 4
            r9 = r33
            X.C14360o3.A0B(r9, r0)
            r29 = r36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r8 = r32
            java.util.ArrayList r0 = r8.A3R(r0)
            r13 = 0
            if (r0 == 0) goto L3a
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L24:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r1.next()
            com.instagram.model.shopping.ProductTag r0 = (com.instagram.model.shopping.ProductTag) r0
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.A02
            com.instagram.user.model.Product r0 = X.AbstractC38048Gob.A01(r0)
            r3.add(r0)
            goto L24
        L3a:
            r3 = r13
        L3b:
            X.0ps r2 = X.AbstractC25225BEi.A1F()
            X.Hic r0 = X.EnumC39647Hic.A02
            r2.A00 = r0
            X.3d7 r1 = X.EnumC77213d7.A03
            r11 = r34
            if (r11 != r1) goto L4d
            X.Hic r0 = X.EnumC39647Hic.A03
            r2.A00 = r0
        L4d:
            if (r3 == 0) goto La7
            java.util.Iterator r4 = r3.iterator()
        L53:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r10 = r4.next()
            com.instagram.user.model.Product r10 = (com.instagram.user.model.Product) r10
            X.70g r0 = X.AbstractC1563570f.A00(r7)
            boolean r0 = r0.A03(r10)
            if (r0 == 0) goto L6c
            if (r11 == r1) goto L70
            goto L53
        L6c:
            X.3d7 r0 = X.EnumC77213d7.A04
            if (r11 != r0) goto L53
        L70:
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto La5
            java.lang.String r0 = X.AbstractC76433bn.A00(r0)
        L78:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            X.ETh r6 = new X.ETh
            r20 = r30
            r18 = r35
            r19 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r11
            r25 = r10
            r26 = r18
            r27 = r3
            r28 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r19 = r13
            r20 = r13
            com.instagram.save.api.SaveApiUtil.A06(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L53
        La5:
            r0 = r13
            goto L78
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35273Fh8.A02(android.content.Context, X.1P1, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.3d7, java.lang.String, int):void");
    }

    public static final boolean A0D(SavedCollection savedCollection) {
        EnumC33416Epn enumC33416Epn;
        List A1Q = AbstractC16960so.A1Q(EnumC33416Epn.A0C, EnumC33416Epn.A07);
        if (savedCollection != null) {
            enumC33416Epn = savedCollection.A07;
        } else {
            enumC33416Epn = null;
        }
        return AbstractC001800i.A0u(A1Q, enumC33416Epn);
    }

    public static final List A00(UserSession userSession, C38321qM c38321qM, List list, int i) {
        ArrayList A3R;
        AbstractC167017dG.A1R(userSession, list);
        if (c38321qM != null && c38321qM.A53() && A08(userSession) && (A3R = c38321qM.A3R(Integer.valueOf(i))) != null && AbstractC25226BEj.A1b(A3R)) {
            return AbstractC001800i.A0T(EnumC33416Epn.A0C, list);
        }
        return list;
    }

    public static final List A01(C38321qM c38321qM, int i) {
        ArrayList A3R = c38321qM.A3R(Integer.valueOf(i));
        if (A3R != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A3R.iterator();
            while (it.hasNext()) {
                A1E.add(AbstractC38048Gob.A01(((ProductTag) it.next()).A02));
            }
            return A1E;
        }
        return null;
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        AbstractC167017dG.A1N(userSession, interfaceC60442pS);
        C25531Mh A02 = C25531Mh.A02(AbstractC12220kQ.A01(interfaceC60442pS, userSession));
        if (AbstractC25226BEj.A1Z(A02)) {
            List A01 = A01(c38321qM, i);
            ArrayList arrayList = null;
            if (A01 != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    AbstractC31179DnN.A1X(arrayList, it);
                }
            }
            if (str == null) {
                str = "";
            }
            A02.A0R("shopping_session_id", str);
            A02.A0M(EnumC39651Hig.A0M, "analytics_component");
            A02.A0M(EnumC39649Hie.A06, "analytics_page");
            A02.A0M(EnumC39650Hif.A0C, "analytics_module");
            AbstractC31179DnN.A1C(A02, c38321qM, "instagram_wishlist_save_to_collections_impression", arrayList);
            A02.Cht();
        }
    }

    public static final void A05(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        C25531Mh A01 = C25531Mh.A01(AbstractC31176DnK.A0L(interfaceC60442pS, userSession));
        if (AbstractC25226BEj.A1Z(A01)) {
            List A012 = A01(c38321qM, i);
            ArrayList arrayList = null;
            if (A012 != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    AbstractC31179DnN.A1X(arrayList, it);
                }
            }
            if (str == null) {
                str = "";
            }
            Map A0n = AbstractC167007dF.A0n("extra_ui", "wishlist_saved_unsaved_from_collections_toast");
            A01.A0R("shopping_session_id", str);
            A01.A0M(EnumC39651Hig.A0H, "analytics_component");
            A01.A0M(EnumC39649Hie.A06, "analytics_page");
            A01.A0M(EnumC39650Hif.A0H, "analytics_module");
            AbstractC31179DnN.A1C(A01, c38321qM, "wishlist_save_unsaved_from_collections_toast_click", arrayList);
            A01.A0w(A0n);
            A01.Cht();
        }
    }

    public static final void A06(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        C25531Mh A02 = C25531Mh.A02(AbstractC31176DnK.A0L(interfaceC60442pS, userSession));
        if (AbstractC25226BEj.A1Z(A02)) {
            List A01 = A01(c38321qM, i);
            ArrayList arrayList = null;
            if (A01 != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    AbstractC31179DnN.A1X(arrayList, it);
                }
            }
            if (str == null) {
                str = "";
            }
            Map A0n = AbstractC167007dF.A0n("extra_ui", "wishlist_saved_unsaved_from_collections_toast");
            A02.A0R("shopping_session_id", str);
            A02.A0M(EnumC39651Hig.A0H, "analytics_component");
            A02.A0M(EnumC39649Hie.A06, "analytics_page");
            A02.A0M(EnumC39650Hif.A0H, "analytics_module");
            AbstractC31179DnN.A1C(A02, c38321qM, "wishlist_save_unsaved_from_collections_toast_impression", arrayList);
            A02.A0w(A0n);
            A02.Cht();
        }
    }

    public static final boolean A0C(C38321qM c38321qM, int i) {
        List A01 = A01(c38321qM, i);
        if (A01 == null || !AbstractC166987dD.A1b(A01)) {
            return false;
        }
        return true;
    }
}
