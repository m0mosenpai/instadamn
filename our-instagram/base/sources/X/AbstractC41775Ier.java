package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ier, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41775Ier {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r5.equals(r6) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC11380iw r7, com.instagram.common.session.UserSession r8, X.C38321qM r9, com.instagram.user.model.Product r10, java.lang.String r11) {
        /*
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            com.instagram.user.model.User r0 = r10.A0B
            r6 = 0
            java.lang.String r5 = X.AbstractC37301Gc2.A0o(r0)
            if (r9 == 0) goto L11
            java.lang.String r6 = X.AbstractC37302Gc3.A0a(r8, r9)
        L11:
            X.0xH r4 = X.AbstractC11060iN.A00(r8)
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.0xC r3 = X.C19280xC.A00(r7, r0)
            java.lang.String r0 = "prior_module"
            r3.A0C(r0, r11)
            boolean r0 = r10.A04()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_checkout_enabled"
            r3.A09(r0, r1)
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r10.A0H
            r3.A0C(r1, r0)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r10.A01
            java.lang.String r1 = r0.A0V
            if (r1 != 0) goto L40
            java.lang.String r1 = r0.A0T
        L40:
            java.lang.String r0 = "current_price"
            r3.A0C(r0, r1)
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "full_price"
            r3.A0C(r0, r1)
            java.lang.String r1 = X.AbstractC25225BEi.A14()
            java.lang.String r0 = "nav_chain"
            r3.A0C(r0, r1)
            X.0j9 r0 = X.C5I8.A5g
            r3.A07(r0, r5)
            java.lang.String r0 = "media_owner_id"
            if (r6 == 0) goto L61
            r3.A0C(r0, r6)
        L61:
            java.lang.String r2 = "is_influencer"
            if (r5 == 0) goto L6e
            if (r6 == 0) goto L6e
            boolean r1 = r5.equals(r6)
            r0 = 1
            if (r1 == 0) goto L6f
        L6e:
            r0 = 0
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L78
            r3.A09(r2, r0)
        L78:
            r4.EHW(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41775Ier.A03(X.0iw, com.instagram.common.session.UserSession, X.1qM, com.instagram.user.model.Product, java.lang.String):void");
    }

    public static final void A07(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2) {
        String id;
        String A00;
        C14360o3.A0B(product, 3);
        if (c38321qM.A5M()) {
            id = c38321qM.A0C.AmM();
        } else {
            id = c38321qM.getId();
        }
        String str3 = null;
        if (id != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_product_tag_tap");
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0l(A0f, id);
                A0f.A9K("carousel_index", AbstractC31171DnF.A0V(c38321qM.A16(userSession)));
                A0f.AAP("carousel_media_id", c38321qM.A1g(userSession).getId());
                C0Zx c0Zx = new C0Zx();
                AbstractC37300Gc1.A0v(c0Zx, str2);
                AbstractC37302Gc3.A0u(A0f, c0Zx, str);
                A0f.AAk("product_ids", C128205qp.A0C(c38321qM.A3J()));
                A0f.A9M("product_merchant_ids", C128205qp.A0D(c38321qM.A3J()));
                AbstractC37302Gc3.A10(A0f, product);
                C76463bq c76463bq = AbstractC76453bp.A00;
                A0f.AAP("product_collection_id", c76463bq.A03(c38321qM));
                C5GU A02 = c76463bq.A02(c38321qM);
                if (A02 != null) {
                    str3 = A02.toString();
                }
                A0f.AAP("product_collection_type", str3);
                A0f.Cht();
            }
        }
        User user = product.A0B;
        if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), AbstractC111324zv.A00(4159));
            if (A0f2.isSampled()) {
                if (str == null) {
                    str = "";
                }
                AbstractC37300Gc1.A0t(A0f2, str);
                A0f2.A8R(EnumC39651Hig.A0B, "analytics_component");
                A0f2.A8R(EnumC39650Hif.A07, "analytics_module");
                A0f2.A8R(EnumC39649Hie.A06, "analytics_page");
                A0f2.AAP("legacy_event_name", "instagram_product_tag_tap");
                AbstractC37302Gc3.A10(A0f2, product);
                A0f2.A9K("merchant_id", AbstractC166997dE.A0j(A00));
                AbstractC37300Gc1.A0l(A0f2, product.A0C);
                A0f2.AAP("carousel_index", String.valueOf(c38321qM.A16(userSession)));
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("review_status", product.A05.toString());
                AbstractC37300Gc1.A0u(A0f2, A1G);
                A0f2.Cht();
            }
        }
    }

    public static final void A0C(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC99144cb interfaceC99144cb, String str, String str2, String str3) {
        String str4;
        String id;
        C14360o3.A0B(str, 3);
        JI4 Aiv = interfaceC99144cb.Aiv();
        if (Aiv != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_product_carousel_action_tap");
            String str5 = null;
            if (!A0f.isSampled()) {
                return;
            }
            switch (Aiv.Ax9().intValue()) {
                case 0:
                    str4 = "view_shop";
                    break;
                case 1:
                    str4 = "dismiss";
                    break;
                case 2:
                    str4 = "cta_with_dismiss";
                    break;
                case 3:
                    str4 = "cta";
                    break;
                case 4:
                    str4 = "bag_from_merchant";
                    break;
                case 5:
                    str4 = "profile_shop_product_collections_feed";
                    break;
                case 6:
                    str4 = "recently_viewed_from_merchant";
                    break;
                case 7:
                    str4 = "saved";
                    break;
                case 8:
                    str4 = "saved_from_merchant";
                    break;
                case 9:
                    str4 = "saved_from_merchants";
                    break;
                case 10:
                    str4 = "products_from_liked_media";
                    break;
                case 11:
                    str4 = "products_from_saved_media";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str4 = "products_from_followed_brands";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str4 = "editorial";
                    break;
                case 14:
                    str4 = "checkout_reconsideration";
                    break;
                case Process.SIGTERM /* 15 */:
                    str4 = "seller_product_collection";
                    break;
                case 16:
                    str4 = "view_checkout_product_feed";
                    break;
                case 17:
                    str4 = "drops_destination";
                    break;
                case 18:
                    str4 = "incentive_details";
                    break;
                default:
                    str4 = "unrecognized";
                    break;
            }
            A0f.AAP("destination_type", str4);
            A0f.AAP("from", str);
            AbstractC37300Gc1.A0n(A0f, str2);
            AbstractC37300Gc1.A0t(A0f, str3);
            EnumC39622HeW B60 = interfaceC99144cb.B60();
            if (B60 == null || (id = B60.toString()) == null) {
                id = interfaceC99144cb.getId();
            }
            AbstractC37300Gc1.A0m(A0f, id);
            User BSW = Aiv.BSW();
            if (BSW != null) {
                str5 = AbstractC76433bn.A00(BSW);
            }
            A0f.AAP("merchant_id", str5);
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0D(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC99144cb interfaceC99144cb, String str, String str2, String str3, int i) {
        C4SX c4sx;
        C14360o3.A0B(str, 4);
        JI4 Aiv = interfaceC99144cb.Aiv();
        if (Aiv != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), AbstractC111324zv.A00(2573));
            User BSW = Aiv.BSW();
            if (BSW != null) {
                c4sx = C4SX.A00(BSW.getId());
            } else {
                c4sx = null;
            }
            A0f.AAK(c4sx, "merchant_id");
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("chaining_session_id", str);
            c0Zx.A05("chaining_position", AbstractC31171DnF.A0V(i));
            c0Zx.A06("m_pk", str3);
            c0Zx.A06("parent_m_pk", str3);
            c0Zx.A06("source_media_type", interfaceC99144cb.Byo());
            A0f.AAQ(c0Zx, "pivots_logging_info");
            C0Zx c0Zx2 = new C0Zx();
            AbstractC37303Gc4.A0z(c0Zx2, "shopping_session_id", str2);
            AbstractC37301Gc2.A13(A0f, c0Zx2, "submodule", interfaceC99144cb.C3N());
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        Long l;
        C76463bq c76463bq = AbstractC76453bp.A00;
        interfaceC02590Ai.AAP("product_collection_id", c76463bq.A03(c38321qM));
        String A05 = c76463bq.A05(c38321qM);
        if (A05 != null) {
            l = AbstractC003100w.A0k(10, A05);
        } else {
            l = null;
        }
        interfaceC02590Ai.A9K("discount_id", l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0192, code lost:
    
        if (r0 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.api.schemas.RankingInfo r16, com.instagram.common.session.UserSession r17, X.C38321qM r18, X.InterfaceC60442pS r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41775Ier.A02(com.instagram.api.schemas.RankingInfo, com.instagram.common.session.UserSession, X.1qM, X.2pS, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c6, code lost:
    
        if (r0 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(com.instagram.common.session.UserSession r22, X.C38321qM r23, X.InterfaceC60442pS r24, X.C75113Zb r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41775Ier.A05(com.instagram.common.session.UserSession, X.1qM, X.2pS, X.3Zb, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    public static final void A08(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        C4SX c4sx;
        List list;
        Map map;
        List list2;
        List list3;
        List list4;
        Boolean bool;
        String str2;
        String str3;
        Long l;
        String str4;
        Long l2;
        Number number;
        AnonymousClass309 anonymousClass309;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_organic_media_show_tags");
        if (A0f.isSampled()) {
            Long l3 = null;
            C38642Gyj A07 = C128205qp.A07(c38321qM.A1g(userSession), AbstractC37301Gc2.A0c(userSession, c38321qM), null);
            if (A07 != null) {
                C11520jB c11520jB = null;
                if ((interfaceC60442pS instanceof AnonymousClass309) && (anonymousClass309 = (AnonymousClass309) interfaceC60442pS) != null) {
                    c11520jB = anonymousClass309.E6Q(c38321qM);
                }
                C9CO A01 = C128205qp.A01(c11520jB);
                C128215qq c128215qq = A07.A03;
                C9C2 c9c2 = A07.A01;
                AbstractC37301Gc2.A0y(A0f, A07.A00);
                AbstractC37300Gc1.A0l(A0f, A07.A05);
                String str5 = null;
                if (c128215qq != null) {
                    c4sx = c128215qq.A00;
                } else {
                    c4sx = null;
                }
                A0f.AAK(c4sx, "merchant_id");
                if (c128215qq != null) {
                    list = c128215qq.A03;
                } else {
                    list = null;
                }
                A0f.AAk("product_ids", list);
                AbstractC37300Gc1.A0m(A0f, "media");
                AbstractC25233BEq.A17(A0f, "shopping_session_id", str);
                if (c128215qq != null) {
                    map = c128215qq.A08;
                } else {
                    map = null;
                }
                A0f.A9M("product_merchant_ids", map);
                if (c128215qq != null) {
                    list2 = c128215qq.A05;
                } else {
                    list2 = null;
                }
                A0f.AAk("tagged_user_ids", list2);
                C26087BgG c26087BgG = A07.A02;
                if (c26087BgG != null) {
                    list3 = (List) c26087BgG.A01;
                } else {
                    list3 = null;
                }
                A0f.AAk("shared_product_ids", list3);
                if (c128215qq != null) {
                    list4 = c128215qq.A02;
                } else {
                    list4 = null;
                }
                A0f.AAk("drops_product_ids", list4);
                if (c128215qq != null) {
                    bool = c128215qq.A01;
                } else {
                    bool = null;
                }
                A0f.A7v("is_checkout_enabled", bool);
                if (A01 != null) {
                    str2 = A01.A04;
                } else {
                    str2 = null;
                }
                A0f.AAP("parent_m_pk", str2);
                if (A01 != null) {
                    str3 = A01.A03;
                } else {
                    str3 = null;
                }
                AbstractC37300Gc1.A0r(A0f, str3);
                if (A01 != null && (number = (Number) A01.A01) != null) {
                    l = AbstractC25229BEm.A0n(number);
                } else {
                    l = null;
                }
                A0f.A9K("chaining_position", l);
                if (c9c2 != null) {
                    str4 = c9c2.A02;
                } else {
                    str4 = null;
                }
                A0f.AAP("carousel_media_id", str4);
                if (c9c2 != null) {
                    l2 = (Long) c9c2.A00;
                } else {
                    l2 = null;
                }
                A0f.A9K("carousel_index", l2);
                C76463bq c76463bq = AbstractC76453bp.A00;
                String A05 = c76463bq.A05(c38321qM);
                if (A05 != null) {
                    l3 = AbstractC003100w.A0k(10, A05);
                }
                A0f.A9K("discount_id", l3);
                A0f.AAP("product_collection_id", c76463bq.A03(c38321qM));
                C5GU A02 = c76463bq.A02(c38321qM);
                if (A02 != null) {
                    str5 = A02.toString();
                }
                A0f.AAP("product_collection_type", str5);
                A0f.Cht();
            }
        }
    }

    public static final void A0E(UserSession userSession, String str, String str2) {
        String A00 = AbstractC111324zv.A00(66);
        if (str2 != null) {
            AbstractC19330xH A002 = AbstractC11060iN.A00(userSession);
            C19280xC A01 = C19280xC.A01(str, A00);
            A01.A0C(AbstractC111324zv.A00(2887), str2);
            A002.EHW(A01);
        }
    }

    public static final List A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        List A0Y;
        List A0Y2;
        if (c38321qM.A5M() && (A0Y = AbstractC37300Gc1.A0Y(c38321qM)) != null && A0Y.get(c75113Zb.A02) != null && ((A0Y2 = AbstractC37300Gc1.A0Y(c38321qM)) == null || (c38321qM = AbstractC25225BEi.A0x(A0Y2, c75113Zb.A02)) == null)) {
            return null;
        }
        return c38321qM.A0C.BNS();
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_shopping_tags_list_entry_point_impression");
        if (A0f.isSampled()) {
            AbstractC25233BEq.A17(A0f, "shopping_session_id", str);
            A0f.A9M("product_merchant_ids", C128205qp.A0D(c38321qM.A3J()));
            A0f.A7v("is_checkout_enabled", C128205qp.A08(c38321qM.A3J()));
            AbstractC37302Gc3.A0x(A0f, c38321qM);
            A0f.Cht();
        }
    }

    public static final void A06(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Product product) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_organic_shopping_remove_tag");
        String id = c38321qM.getId();
        if (id != null) {
            AbstractC37300Gc1.A0l(A0f, id);
            AbstractC37302Gc3.A10(A0f, product);
            AbstractC37300Gc1.A0i(A0f, AbstractC25231BEo.A0j(0, product.A0H));
            A0f.A7v("is_influencer", Boolean.valueOf(c38321qM.A6e(userSession)));
            AbstractC37301Gc2.A17(A0f, AbstractC37304Gc5.A0j(product));
            A0f.AAk("product_ids", C128205qp.A0C(c38321qM.A3J()));
            A0f.Cht();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A09(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        Map map;
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_tap_view_tags_list");
        if (A0f.isSampled()) {
            String str4 = null;
            C38642Gyj A07 = C128205qp.A07(c38321qM.A1g(userSession), AbstractC37301Gc2.A0c(userSession, c38321qM), null);
            if (A07 != null) {
                C128215qq c128215qq = A07.A03;
                C9C2 c9c2 = A07.A01;
                AbstractC37300Gc1.A0l(A0f, A07.A05);
                AbstractC37301Gc2.A0y(A0f, A07.A00);
                if (c128215qq != null && (map = c128215qq.A08) != null) {
                    A0f.A9M("product_merchant_ids", map);
                    A0f.AAk("product_ids", c128215qq.A03);
                    AbstractC37300Gc1.A0n(A0f, str);
                    AbstractC25233BEq.A17(A0f, "prior_submodule", str3);
                    A0f.AAk("tagged_user_ids", c128215qq.A04);
                    AbstractC37300Gc1.A0o(A0f, A07.A06);
                    A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "TAG_INDICATOR_PIVOT");
                    if (c9c2 != null) {
                        l = (Long) c9c2.A00;
                    } else {
                        l = null;
                    }
                    A0f.A9K("carousel_index", l);
                    if (c9c2 != null) {
                        str4 = c9c2.A02;
                    }
                    A0f.AAP("carousel_media_id", str4);
                    AbstractC37300Gc1.A0t(A0f, str2);
                    A0f.AAk("drops_product_ids", c128215qq.A02);
                    A01(A0f, c38321qM);
                    A0f.A7v("is_checkout_enabled", c128215qq.A01);
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    public static final void A0A(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        InterfaceC02590Ai A0f;
        int i;
        Long l;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        if (!z) {
            A0f = AbstractC166987dD.A0f(A01, "instagram_shopping_feed_cta_bar_impression");
            i = 315;
        } else {
            A0f = AbstractC166987dD.A0f(A01, "instagram_shopping_feed_cta_bar_sub_impression");
            i = 316;
        }
        C25531Mh c25531Mh = new C25531Mh(A0f, i);
        C0Zx c0Zx = new C0Zx();
        AbstractC37301Gc2.A1C(c0Zx, "shopping_session_id", str2, str3);
        AbstractC37300Gc1.A0w(c0Zx, str4);
        c25531Mh.A0N(c0Zx, "navigation_info");
        c25531Mh.A0l(c38321qM.getId());
        C76463bq c76463bq = AbstractC76453bp.A00;
        c25531Mh.A0R("product_collection_id", c76463bq.A03(c38321qM));
        String A05 = c76463bq.A05(c38321qM);
        if (A05 != null) {
            l = AbstractC003100w.A0k(10, A05);
        } else {
            l = null;
        }
        c25531Mh.A0Q("discount_id", l);
        c25531Mh.A0R("cta_bar_type", str);
        c25531Mh.A0S("arts_labels", c38321qM.A0C.BNS());
        c25531Mh.A0O("is_ai_suggested", Boolean.valueOf(z2));
        c25531Mh.Cht();
    }

    public static final void A0B(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        C128215qq c128215qq;
        C38642Gyj A07 = C128205qp.A07(c38321qM.A1g(userSession), AbstractC37301Gc2.A0c(userSession, c38321qM), null);
        if (A07 != null && (c128215qq = A07.A03) != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_shopping_feed_shopping_indicator_tap");
            if (A0f.isSampled()) {
                String id = c38321qM.getId();
                if (id != null) {
                    AbstractC37300Gc1.A0l(A0f, id);
                    AbstractC37302Gc3.A0u(A0f, new C0Zx(), str);
                    A0f.A9M("product_merchant_ids", c128215qq.A08);
                    A0f.AAk("product_ids", c128215qq.A03);
                    A0f.A7v(AbstractC111324zv.A00(226), AbstractC31173DnH.A0d(A0f, c128215qq.A01, "is_checkout_enabled", z));
                    A01(A0f, c38321qM);
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
