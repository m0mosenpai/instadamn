package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Ipg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42379Ipg implements InterfaceC43071ya {
    public final C41587Iaa A00;
    public final java.util.Set A01 = AbstractC166987dD.A1H();
    public final C41552Ia1 A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        InterfaceC02590Ai A09;
        C11520jB E6P;
        C19260xA A00;
        C0Zx c0Zx;
        C41587Iaa c41587Iaa;
        int i;
        int i2;
        C38321qM c38321qM;
        C127995qS c127995qS;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A00 && this.A01.add(abstractC127945qN.getKey())) {
            if (abstractC127945qN instanceof HKZ) {
                HKZ hkz = (HKZ) abstractC127945qN;
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                c41587Iaa = this.A00;
                C5qT c5qT = ((C38162GqT) obj2).A00;
                i = c5qT.A01;
                i2 = c5qT.A00;
                C14360o3.A0B(hkz, 0);
                c38321qM = hkz.A03;
                c127995qS = hkz;
            } else if (abstractC127945qN instanceof C127995qS) {
                C127995qS c127995qS2 = (C127995qS) abstractC127945qN;
                Object obj3 = c59062n7.A04;
                C14360o3.A06(obj3);
                c41587Iaa = this.A00;
                C5qT c5qT2 = ((C38162GqT) obj3).A00;
                i = c5qT2.A01;
                i2 = c5qT2.A00;
                C14360o3.A0B(c127995qS2, 0);
                c38321qM = c127995qS2.A01;
                c127995qS = c127995qS2;
            } else {
                if (abstractC127945qN instanceof HKV) {
                    HKV hkv = (HKV) abstractC127945qN;
                    if (hkv.A02.intValue() != 0) {
                        String str = hkv.A03;
                        C38321qM c38321qM2 = hkv.A01;
                        Object obj4 = c59062n7.A04;
                        C14360o3.A06(obj4);
                        C41587Iaa c41587Iaa2 = this.A00;
                        C5qT c5qT3 = ((C38162GqT) obj4).A00;
                        int i3 = c5qT3.A01;
                        int i4 = c5qT3.A00;
                        A09 = AbstractC37302Gc3.A09(c41587Iaa2.A00, c41587Iaa2.A01);
                        if (!A09.isSampled()) {
                            return;
                        }
                        String str2 = c41587Iaa2.A03;
                        if (str2 != null) {
                            AbstractC37301Gc2.A16(A09, str2);
                        }
                        A09.AAP(AbstractC43591JPw.A00(358), str);
                        A09.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM2.getId());
                        AbstractC37302Gc3.A0x(A09, c38321qM2);
                        AbstractC37301Gc2.A0x(A09, i3, i4);
                        A09.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1L);
                        A09.AAP("endpoint_type", "CHANNEL");
                        InterfaceC43409JFz interfaceC43409JFz = c41587Iaa2.A02;
                        if (interfaceC43409JFz != null) {
                            A00 = interfaceC43409JFz.E6Z(hkv, c38321qM2);
                            c0Zx = new C0Zx();
                            AbstractC37302Gc3.A0w(A09, A00, "search_session_id");
                            AbstractC37302Gc3.A0w(A09, A00, "rank_token");
                            AbstractC37302Gc3.A0w(A09, A00, "query_text");
                            AbstractC37303Gc4.A0y(c0Zx, A00);
                            A09.AAQ(c0Zx, "search_context");
                        }
                        AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
                        A09.Cht();
                        return;
                    }
                    Object obj5 = c59062n7.A04;
                    C14360o3.A06(obj5);
                    C41587Iaa c41587Iaa3 = this.A00;
                    C5qT c5qT4 = ((C38162GqT) obj5).A00;
                    C41587Iaa.A00(hkv, c41587Iaa3, hkv.A01, c5qT4.A01, c5qT4.A00);
                    return;
                }
                if (abstractC127945qN instanceof C127935qM) {
                    C127935qM c127935qM = (C127935qM) abstractC127945qN;
                    Object obj6 = c59062n7.A04;
                    C14360o3.A06(obj6);
                    C41587Iaa c41587Iaa4 = this.A00;
                    C5qT c5qT5 = ((C38162GqT) obj6).A00;
                    int i5 = c5qT5.A01;
                    int i6 = c5qT5.A00;
                    C14360o3.A0B(c127935qM, 0);
                    A09 = AbstractC37302Gc3.A09(c41587Iaa4.A00, c41587Iaa4.A01);
                    if (!A09.isSampled()) {
                        return;
                    }
                    C130535uy c130535uy = c127935qM.A01;
                    C38321qM c38321qM3 = c130535uy.A00().A02;
                    if (c38321qM3 != null) {
                        String A1G = AbstractC25226BEj.A1G(c38321qM3);
                        if (A1G != null) {
                            A09.AAP("ranking_info_token", A1G);
                        }
                        String str3 = c41587Iaa4.A03;
                        if (str3 != null) {
                            AbstractC37301Gc2.A16(A09, str3);
                        }
                        A09.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c130535uy.A0A);
                        AbstractC37302Gc3.A0x(A09, c38321qM3);
                        AbstractC37301Gc2.A0x(A09, i5, i6);
                        AbstractC37303Gc4.A0g(A09, c38321qM3);
                        A09.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 24L);
                        InterfaceC43409JFz interfaceC43409JFz2 = c41587Iaa4.A02;
                        if (interfaceC43409JFz2 != null) {
                            C19260xA E6Z = interfaceC43409JFz2.E6Z(c127935qM, c38321qM3);
                            C0Zx c0Zx2 = new C0Zx();
                            AbstractC37302Gc3.A0w(A09, E6Z, "search_session_id");
                            AbstractC37302Gc3.A0w(A09, E6Z, "rank_token");
                            AbstractC37302Gc3.A0w(A09, E6Z, "query_text");
                            AbstractC37303Gc4.A0y(c0Zx2, E6Z);
                            A09.AAQ(c0Zx2, "search_context");
                            C19260xA E6Z2 = interfaceC43409JFz2.E6Z(c127935qM, c38321qM3);
                            String A05 = E6Z2.A05("hashtag_id");
                            if (A05 != null) {
                                try {
                                    A09.A9K("hashtag_id", AbstractC166997dE.A0j(A05));
                                } catch (NumberFormatException e) {
                                    C0K8.A0G("DiscoveryImpressionHelper", "Failed to convert hashtag id to long", e);
                                }
                            }
                            AbstractC37302Gc3.A0w(A09, E6Z2, "hashtag_name");
                            AbstractC37302Gc3.A0w(A09, E6Z2, "hashtag_follow_status");
                            String A052 = E6Z2.A05("query_text");
                            if (A052 != null) {
                                A09.A7v("is_tag", Boolean.valueOf(AbstractC85443rZ.A02(A052)));
                            }
                            String A053 = E6Z2.A05(AbstractC111324zv.A00(1643));
                            if (A053 != null) {
                                A09.AAP("tag_navigation_source", A053);
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else if (abstractC127945qN instanceof HKW) {
                    C132795z2 c132795z2 = ((HKW) abstractC127945qN).A01;
                    Object obj7 = c59062n7.A04;
                    C14360o3.A06(obj7);
                    C41587Iaa c41587Iaa5 = this.A00;
                    C5qT c5qT6 = ((C38162GqT) obj7).A00;
                    int i7 = c5qT6.A01;
                    int i8 = c5qT6.A00;
                    A09 = AbstractC37302Gc3.A09(c41587Iaa5.A00, c41587Iaa5.A01);
                    if (!A09.isSampled()) {
                        return;
                    }
                    Object obj8 = c132795z2.A03.get(0);
                    C14360o3.A07(obj8);
                    C38321qM c38321qM4 = (C38321qM) obj8;
                    String str4 = c41587Iaa5.A03;
                    if (str4 != null) {
                        AbstractC37301Gc2.A16(A09, str4);
                    }
                    AbstractC37302Gc3.A0x(A09, c38321qM4);
                    AbstractC37301Gc2.A0x(A09, i7, i8);
                    AbstractC37303Gc4.A0g(A09, c38321qM4);
                    A09.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AbstractC167007dF.A0d());
                    InterfaceC43409JFz interfaceC43409JFz3 = c41587Iaa5.A02;
                    if (interfaceC43409JFz3 != null) {
                        C42430IqX c42430IqX = (C42430IqX) interfaceC43409JFz3;
                        switch (c42430IqX.A00) {
                            case 0:
                                E6P = ((V1R) c42430IqX.A01).E6P();
                                break;
                            case 1:
                                E6P = ((V1B) c42430IqX.A01).E6P();
                                break;
                            case 2:
                                E6P = ((AbstractC67878V0j) c42430IqX.A01).E6P();
                                E6P.A04(AbstractC128995sK.A02, c132795z2.A01);
                                E6P.A04(AbstractC128995sK.A06, "SHOPPING_CATEGORY");
                                E6P.A04(AbstractC128995sK.A05, "KEYWORD");
                                break;
                            default:
                                E6P = ((C38934HCh) c42430IqX.A01).E6P();
                                E6P.A04(AbstractC128995sK.A02, c132795z2.A01);
                                E6P.A04(AbstractC128995sK.A06, "SHOPPING_CATEGORY");
                                E6P.A04(AbstractC128995sK.A05, "KEYWORD");
                                break;
                        }
                        A00 = E6P.A00();
                        c0Zx = new C0Zx();
                        AbstractC37302Gc3.A0w(A09, A00, "search_session_id");
                        AbstractC37302Gc3.A0w(A09, A00, "rank_token");
                        AbstractC37302Gc3.A0w(A09, A00, "query_text");
                        AbstractC37303Gc4.A0y(c0Zx, A00);
                        A09.AAQ(c0Zx, "search_context");
                    }
                } else {
                    if (!(abstractC127945qN instanceof HKT) && !(abstractC127945qN instanceof HKX) && !(abstractC127945qN instanceof HKS)) {
                        return;
                    }
                    C14360o3.A06(c59062n7.A04);
                    return;
                }
                AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
                A09.Cht();
                return;
            }
            C41587Iaa.A00(c127995qS, c41587Iaa, c38321qM, i, i2);
        }
    }

    public C42379Ipg(C41587Iaa c41587Iaa, C41552Ia1 c41552Ia1) {
        this.A00 = c41587Iaa;
        this.A02 = c41552Ia1;
    }
}
