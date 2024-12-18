package X;

import com.instagram.api.schemas.ContextualAdResponseExtras;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfo;
import com.instagram.api.schemas.ProductPivotsButton;
import com.instagram.api.schemas.ProductPivotsButtonImpl;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ShoppingBrandWithProducts;
import com.instagram.api.schemas.ShoppingBrandWithProductsImpl;
import com.instagram.api.schemas.ShoppingPivotItemType;
import com.instagram.feed.feeditem.SuggestedChannels;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.3XG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XG {
    public static final C3XH A0A = new Object();
    public C103464lM A00;
    public C40971v4 A01;
    public Boolean A02;
    public boolean A03;
    public final InterfaceC39571se A04;
    public final InterfaceC38381qS A05;
    public final C1XV A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3XG)) {
            return false;
        }
        C3XG c3xg = (C3XG) obj;
        return C14360o3.A0K(this.A09, c3xg.A09) && this.A06 == c3xg.A06 && C14360o3.A0K(this.A05, c3xg.A05);
    }

    public static final C3XG A00(C16L c16l) {
        return A0A.A05(c16l, false);
    }

    public final HBC A01() {
        InterfaceC38381qS interfaceC38381qS = this.A05;
        C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.mainfeed.intentawaread.api.IntentAwareAdPivot");
        return (HBC) interfaceC38381qS;
    }

    public final Integer A02() {
        C88533xB c88533xB;
        C3CL c3cl;
        int ordinal = this.A06.ordinal();
        if (ordinal != 13) {
            if (ordinal != 29) {
                C38321qM A02 = C3XH.A02(this.A05);
                if (A02 == null) {
                    return null;
                }
                return A02.A2M();
            }
            InterfaceC38381qS interfaceC38381qS = this.A05;
            if (!(interfaceC38381qS instanceof C3CL) || (c3cl = (C3CL) interfaceC38381qS) == null) {
                return null;
            }
            return c3cl.A08;
        }
        InterfaceC38381qS interfaceC38381qS2 = this.A05;
        if (!(interfaceC38381qS2 instanceof C88533xB) || (c88533xB = (C88533xB) interfaceC38381qS2) == null) {
            return null;
        }
        return c88533xB.A00.A07;
    }

    public final boolean A03() {
        if (this.A06 == C1XV.A0Y) {
            InterfaceC38381qS interfaceC38381qS = this.A05;
            C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.media.Media");
            if (((C38321qM) interfaceC38381qS).A0B != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.A09.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [X.4lM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.IL5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.Is2] */
    /* JADX WARN: Type inference failed for: r4v20, types: [X.4ca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, X.Is3] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, X.Is4] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.4lM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.4lM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C3XG(XVV xvv, XVV xvv2, QIy qIy, QIy qIy2, QIy qIy3, C26042BfV c26042BfV, C103444lK c103444lK, H2U h2u, C111094zQ c111094zQ, C88523xA c88523xA, H3G h3g, H3G h3g2, H3G h3g3, C38650Gyr c38650Gyr, C33704Eus c33704Eus, C38640Gyh c38640Gyh, C38651Gys c38651Gys, H58 h58, H58 h582, E87 e87, C101264gi c101264gi, C101264gi c101264gi2, E6U e6u, C47J c47j, C47J c47j2, C47J c47j3, C47J c47j4, C47J c47j5, C47J c47j6, C47J c47j7, C47J c47j8, C47J c47j9, C47J c47j10, C38633Gya c38633Gya, C99534dT c99534dT, C99534dT c99534dT2, C38634Gyb c38634Gyb, C38644Gyl c38644Gyl, C110414yD c110414yD, C110414yD c110414yD2, C110414yD c110414yD3, C110394yB c110394yB, C38321qM c38321qM, C38321qM c38321qM2, C37841pN c37841pN, C38611qr c38611qr, Boolean bool) {
        C103464lM c103464lM;
        InterfaceC38381qS interfaceC38381qS;
        C103464lM c103464lM2;
        YFC yfc;
        String str;
        ?? r6;
        EnumC39580Hdq enumC39580Hdq;
        ProductPivotsButtonImpl productPivotsButtonImpl;
        C914346k c914346k;
        InterfaceC38381qS interfaceC38381qS2;
        InterfaceC38381qS interfaceC38381qS3 = c38321qM;
        if (c103444lK != null) {
            c103464lM = new C103464lM(c103444lK);
        } else {
            c103464lM = null;
        }
        this.A00 = c103464lM;
        this.A02 = bool;
        if (c38321qM == null) {
            C47J c47j11 = c47j;
            if (c47j == null) {
                c47j11 = c47j2;
                if (c47j2 == null) {
                    c47j11 = c47j3;
                    if (c47j3 == null) {
                        c47j11 = c47j4;
                        if (c47j4 == null) {
                            c47j11 = c47j5;
                            if (c47j5 == null) {
                                if (c47j6 != null) {
                                    C47K c47k = new C47K(c47j6);
                                    C103464lM c103464lM3 = c47k.A06;
                                    if (c103464lM3 != null) {
                                        this.A00 = c103464lM3;
                                        interfaceC38381qS2 = c103464lM3;
                                    } else {
                                        interfaceC38381qS2 = c47k;
                                    }
                                    interfaceC38381qS3 = interfaceC38381qS2;
                                } else {
                                    c47j11 = c47j7;
                                    if (c47j7 == null) {
                                        c47j11 = c47j8;
                                        if (c47j8 == null) {
                                            c47j11 = c47j9;
                                            if (c47j9 == null) {
                                                if (c38611qr != null) {
                                                    interfaceC38381qS3 = new C105854pw(c38611qr);
                                                } else if (c38634Gyb != null) {
                                                    interfaceC38381qS3 = new C42555IsZ(c38634Gyb);
                                                } else {
                                                    if (c26042BfV != null) {
                                                        List list = (List) c26042BfV.A02;
                                                        list = list == null ? C16930sl.A00 : list;
                                                        String str2 = c26042BfV.A05;
                                                        if (str2 == null) {
                                                            str2 = UUID.randomUUID().toString();
                                                            C14360o3.A07(str2);
                                                        }
                                                        Integer num = (Integer) c26042BfV.A03;
                                                        String str3 = c26042BfV.A06;
                                                        Integer num2 = (Integer) c26042BfV.A01;
                                                        C14360o3.A0B(str2, 3);
                                                        ?? obj = new Object();
                                                        obj.A04 = list;
                                                        obj.A02 = str2;
                                                        obj.A01 = num;
                                                        obj.A03 = str3;
                                                        obj.A00 = num2;
                                                        interfaceC38381qS = obj;
                                                    } else {
                                                        c47j11 = c47j10;
                                                        if (c47j10 == null) {
                                                            if (c37841pN != null) {
                                                                ?? obj2 = new Object();
                                                                String id = c37841pN.getId();
                                                                obj2.A06 = id == null ? "" : id;
                                                                String CAR = c37841pN.CAR();
                                                                obj2.A07 = CAR != null ? CAR : "";
                                                                obj2.A01 = c37841pN.BMP();
                                                                obj2.A02 = c37841pN.AgU();
                                                                obj2.A05 = c37841pN.CFr();
                                                                obj2.A04 = c37841pN.BA3();
                                                                InterfaceC39571se BJz = c37841pN.BJz();
                                                                obj2.A00 = BJz == null ? null : BJz.Eyq();
                                                                C103434lJ c103434lJ = obj2.A01;
                                                                if (c103434lJ == null && (c914346k = obj2.A02) != null) {
                                                                    c103434lJ = AbstractC40567Hyn.A00(c914346k).A01;
                                                                    obj2.A01 = c103434lJ;
                                                                }
                                                                if (c103434lJ != null) {
                                                                    String str4 = obj2.A06;
                                                                    String str5 = obj2.A07;
                                                                    ?? obj3 = new Object();
                                                                    obj3.A06 = str4;
                                                                    obj3.A08 = str5;
                                                                    obj3.A02 = c103434lJ;
                                                                    obj2.A03 = obj3;
                                                                }
                                                                C103464lM c103464lM4 = obj2.A03;
                                                                if (c103464lM4 != null) {
                                                                    this.A00 = c103464lM4;
                                                                } else {
                                                                    c103464lM4 = obj2;
                                                                }
                                                                interfaceC38381qS3 = c103464lM4;
                                                            } else if (c38650Gyr != null) {
                                                                interfaceC38381qS = new C42520Irz(c38650Gyr);
                                                            } else if (c38633Gya != null) {
                                                                interfaceC38381qS = new C3CM(c38633Gya);
                                                            } else if (c101264gi != null) {
                                                                interfaceC38381qS = new C101274gj(c101264gi, C1XV.A0m);
                                                            } else if (c101264gi2 != null) {
                                                                interfaceC38381qS = new C101274gj(c101264gi2, C1XV.A0Q);
                                                            } else if (h2u != null) {
                                                                interfaceC38381qS = new C123675ig(h2u);
                                                            } else if (h58 != null) {
                                                                interfaceC38381qS = new C42519Iry(h58, false);
                                                            } else if (h582 != null) {
                                                                interfaceC38381qS = new C42519Iry(h582, true);
                                                            } else if (e87 != null) {
                                                                interfaceC38381qS = new G7N(e87);
                                                            } else if (h3g != null) {
                                                                interfaceC38381qS = new C3Py(h3g);
                                                            } else if (c110394yB != null) {
                                                                interfaceC38381qS = new C110424yE(c110394yB);
                                                            } else if (c88523xA != null) {
                                                                interfaceC38381qS = new C88533xB(c88523xA);
                                                            } else if (h3g2 != null) {
                                                                interfaceC38381qS = new C3Py(h3g2);
                                                            } else if (h3g3 != null) {
                                                                interfaceC38381qS = new C3Py(h3g3);
                                                            } else if (c33704Eus != null) {
                                                                interfaceC38381qS = new C42518Irx(c33704Eus);
                                                            } else if (c110414yD != null) {
                                                                interfaceC38381qS = new C3CL(c110414yD, C1XV.A0F);
                                                            } else if (c110414yD2 != null) {
                                                                interfaceC38381qS = new C3CL(c110414yD2, C1XV.A0E);
                                                            } else if (c110414yD3 != null) {
                                                                interfaceC38381qS = new C3CL(c110414yD3, C1XV.A0D);
                                                            } else if (c38651Gys != null) {
                                                                ?? obj4 = new Object();
                                                                String str6 = c38651Gys.A06;
                                                                obj4.A05 = str6 == null ? "" : str6;
                                                                String str7 = c38651Gys.A09;
                                                                obj4.A09 = str7 != null ? str7 : "";
                                                                obj4.A0A = c38651Gys.A0B;
                                                                List list2 = c38651Gys.A0A;
                                                                ArrayList arrayList = new ArrayList();
                                                                if (list2 != null) {
                                                                    Iterator it = list2.iterator();
                                                                    while (it.hasNext()) {
                                                                        H5A h5a = (H5A) ((InterfaceC43486JIy) it.next());
                                                                        ShoppingBrandWithProducts shoppingBrandWithProducts = h5a.A01;
                                                                        ProductDetailsProductItemDict productDetailsProductItemDict = h5a.A02;
                                                                        InterfaceC43479JIr interfaceC43479JIr = h5a.A00;
                                                                        InterfaceC43479JIr interfaceC43479JIr2 = null;
                                                                        ShoppingBrandWithProductsImpl EzU = shoppingBrandWithProducts != null ? shoppingBrandWithProducts.EzU(new C1DY((C1DV) new C37761pD(null), 6, false)) : null;
                                                                        ProductDetailsProductItemDict productDetailsProductItemDict2 = productDetailsProductItemDict != null ? productDetailsProductItemDict : null;
                                                                        if (interfaceC43479JIr != null) {
                                                                            interfaceC43479JIr2 = interfaceC43479JIr;
                                                                        }
                                                                        arrayList.add(new H5A(interfaceC43479JIr2, EzU, productDetailsProductItemDict2));
                                                                    }
                                                                }
                                                                obj4.A0C = arrayList.isEmpty() ? null : arrayList;
                                                                ShoppingPivotItemType shoppingPivotItemType = c38651Gys.A03;
                                                                if (shoppingPivotItemType == null) {
                                                                    enumC39580Hdq = EnumC39580Hdq.A0A;
                                                                } else {
                                                                    String str8 = shoppingPivotItemType.A00;
                                                                    C14360o3.A0B(str8, 0);
                                                                    Object obj5 = EnumC39580Hdq.A01.get(str8);
                                                                    if (obj5 == null) {
                                                                        throw new IllegalStateException("Required value was null.");
                                                                    }
                                                                    enumC39580Hdq = (EnumC39580Hdq) obj5;
                                                                }
                                                                obj4.A02 = enumC39580Hdq;
                                                                ProductPivotsButton productPivotsButton = c38651Gys.A00;
                                                                if (productPivotsButton == null) {
                                                                    productPivotsButtonImpl = null;
                                                                } else {
                                                                    C69420Vn5 AKS = productPivotsButton.AKS();
                                                                    new C1DY((C1DV) new C37761pD(null), 6, false);
                                                                    productPivotsButtonImpl = new ProductPivotsButtonImpl(AKS.A00, AKS.A01, AKS.A02, AKS.A03, AKS.A04, AKS.A05, AKS.A06, AKS.A07);
                                                                }
                                                                obj4.A00 = productPivotsButtonImpl;
                                                                obj4.A07 = c38651Gys.A08;
                                                                obj4.A06 = c38651Gys.A07;
                                                                ProductPivotsSourceMediaType productPivotsSourceMediaType = c38651Gys.A01;
                                                                obj4.A08 = productPivotsSourceMediaType != null ? productPivotsSourceMediaType.A00 : null;
                                                                obj4.A04 = c38651Gys.A05;
                                                                obj4.A03 = c38651Gys.A04;
                                                                InterfaceC39571se interfaceC39571se = c38651Gys.A02;
                                                                obj4.A01 = interfaceC39571se != null ? interfaceC39571se.Eyq() : null;
                                                                List list3 = obj4.A0C;
                                                                interfaceC38381qS = obj4;
                                                                if (list3 != null) {
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    Iterator it2 = list3.iterator();
                                                                    while (it2.hasNext()) {
                                                                        arrayList2.add(new IEZ((InterfaceC43486JIy) it2.next()));
                                                                    }
                                                                    obj4.A0B = arrayList2;
                                                                    interfaceC38381qS = obj4;
                                                                }
                                                            } else if (c103444lK != null) {
                                                                this.A00 = new C103464lM(c103444lK);
                                                                interfaceC38381qS = new C103464lM(c103444lK);
                                                            } else if (qIy != null) {
                                                                interfaceC38381qS = new C42526Is5(qIy);
                                                            } else if (c111094zQ != null) {
                                                                interfaceC38381qS = new C76403bk(c111094zQ);
                                                            } else if (c38644Gyl != null) {
                                                                HBC hbc = new HBC();
                                                                List<C3XG> list4 = c38644Gyl.A07;
                                                                if (list4 != null) {
                                                                    r6 = new ArrayList(AbstractC06950Ym.A1E(list4, 10));
                                                                    for (C3XG c3xg : list4) {
                                                                        ?? obj6 = new Object();
                                                                        C38321qM A02 = C3XH.A02(c3xg.A05);
                                                                        if (A02 != null) {
                                                                            obj6.A00 = A02;
                                                                            r6.add(obj6);
                                                                        } else {
                                                                            throw new IllegalStateException("Required value was null.");
                                                                        }
                                                                    }
                                                                } else {
                                                                    r6 = C16930sl.A00;
                                                                }
                                                                hbc.A0B = r6;
                                                                String str9 = c38644Gyl.A06;
                                                                hbc.A09 = str9 != null ? str9 : "";
                                                                C38011pl c38011pl = c38644Gyl.A03;
                                                                if (c38011pl != null) {
                                                                    hbc.A06 = c38011pl;
                                                                }
                                                                ContextualAdResponseExtras contextualAdResponseExtras = c38644Gyl.A00;
                                                                if (contextualAdResponseExtras != null) {
                                                                    hbc.A01 = contextualAdResponseExtras.EsX();
                                                                }
                                                                Boolean bool2 = c38644Gyl.A04;
                                                                hbc.A0D = bool2 != null ? bool2.booleanValue() : false;
                                                                hbc.A03 = c38644Gyl.A02;
                                                                ContextualAdResponseOrganicInfo contextualAdResponseOrganicInfo = c38644Gyl.A01;
                                                                hbc.A02 = contextualAdResponseOrganicInfo != null ? contextualAdResponseOrganicInfo.EsY() : null;
                                                                interfaceC38381qS = hbc;
                                                            } else if (c38321qM2 != null) {
                                                                interfaceC38381qS3 = c38321qM2;
                                                            } else {
                                                                if (qIy2 != null) {
                                                                    ?? c42523Is2 = new C42523Is2(qIy2);
                                                                    C103464lM c103464lM5 = c42523Is2.A01;
                                                                    yfc = c42523Is2;
                                                                    c103464lM2 = c103464lM5;
                                                                    if (c103464lM5 == null) {
                                                                        QIy qIy4 = c42523Is2.A02;
                                                                        String str10 = qIy4.A05;
                                                                        yfc = c42523Is2;
                                                                        c103464lM2 = c103464lM5;
                                                                        if (str10 != null) {
                                                                            String str11 = qIy4.A06;
                                                                            C103434lJ c103434lJ2 = c42523Is2.A00;
                                                                            if (c103434lJ2 == null) {
                                                                                c103434lJ2 = (C103434lJ) qIy4.A03;
                                                                                if (c103434lJ2 == null) {
                                                                                    C914346k c914346k2 = (C914346k) qIy4.A00;
                                                                                    if (c914346k2 != null && (str = c914346k2.A01) != null) {
                                                                                        c103434lJ2 = AbstractC102744kB.A01(str);
                                                                                    } else {
                                                                                        c103434lJ2 = null;
                                                                                    }
                                                                                }
                                                                                c42523Is2.A00 = c103434lJ2;
                                                                            }
                                                                            ?? obj7 = new Object();
                                                                            obj7.A06 = str10;
                                                                            obj7.A08 = str11;
                                                                            obj7.A02 = c103434lJ2;
                                                                            obj7.A09 = true;
                                                                            c42523Is2.A01 = obj7;
                                                                            yfc = c42523Is2;
                                                                            c103464lM2 = obj7;
                                                                        }
                                                                    }
                                                                } else if (qIy3 != null) {
                                                                    C42522Is1 c42522Is1 = new C42522Is1(qIy3);
                                                                    C103464lM c103464lM6 = c42522Is1.A00;
                                                                    interfaceC38381qS = c42522Is1;
                                                                    if (c103464lM6 != null) {
                                                                        this.A00 = c103464lM6;
                                                                        interfaceC38381qS = c42522Is1;
                                                                    }
                                                                } else if (xvv != null) {
                                                                    YFC yfc2 = new YFC(xvv);
                                                                    C103464lM c103464lM7 = yfc2.A00;
                                                                    yfc = yfc2;
                                                                    c103464lM2 = c103464lM7;
                                                                    if (c103464lM7 == null) {
                                                                        XVV xvv3 = yfc2.A01;
                                                                        String str12 = xvv3.A05;
                                                                        String str13 = xvv3.A06;
                                                                        C103434lJ c103434lJ3 = (C103434lJ) xvv3.A03;
                                                                        yfc = yfc2;
                                                                        yfc = yfc2;
                                                                        yfc = yfc2;
                                                                        c103464lM2 = c103464lM7;
                                                                        c103464lM2 = c103464lM7;
                                                                        c103464lM2 = c103464lM7;
                                                                        if (str12 != null && str13 != null && c103434lJ3 != null) {
                                                                            ?? obj8 = new Object();
                                                                            obj8.A06 = str12;
                                                                            obj8.A08 = str13;
                                                                            obj8.A02 = c103434lJ3;
                                                                            yfc2.A00 = obj8;
                                                                            yfc = yfc2;
                                                                            c103464lM2 = obj8;
                                                                        }
                                                                    }
                                                                } else if (e6u != null) {
                                                                    interfaceC38381qS = new SuggestedChannels(e6u);
                                                                } else if (c38640Gyh != null) {
                                                                    interfaceC38381qS = new C42521Is0(c38640Gyh);
                                                                } else {
                                                                    C99534dT c99534dT3 = c99534dT;
                                                                    if (c99534dT == null) {
                                                                        c99534dT3 = c99534dT2;
                                                                        if (c99534dT2 == null) {
                                                                            if (xvv2 != null) {
                                                                                interfaceC38381qS = new YFD(xvv2);
                                                                            } else {
                                                                                EnumSet complementOf = EnumSet.complementOf(EnumSet.of(C1XV.A12));
                                                                                StringBuilder sb = new StringBuilder();
                                                                                sb.append("Unknown FeedItem Type. PLEASE FIX ASAP BECAUSE YOU ARE SENDING UNKNOWN FEED ITEM JSON TO CLIENT.  The FeedItemType that the client supported are ");
                                                                                sb.append(complementOf);
                                                                                C0w9.A03("FeedItem", sb.toString());
                                                                                interfaceC38381qS3 = new Object();
                                                                            }
                                                                        }
                                                                    }
                                                                    interfaceC38381qS = new C4dV(c99534dT3);
                                                                }
                                                                this.A00 = c103464lM2;
                                                                interfaceC38381qS3 = yfc;
                                                            }
                                                        }
                                                    }
                                                    interfaceC38381qS3 = interfaceC38381qS;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            interfaceC38381qS = new C47K(c47j11);
            interfaceC38381qS3 = interfaceC38381qS;
        }
        this.A05 = interfaceC38381qS3;
        String id2 = interfaceC38381qS3.getId();
        if (id2 != null) {
            this.A09 = id2;
            this.A06 = interfaceC38381qS3.B5n();
            this.A08 = interfaceC38381qS3.CFr();
            this.A07 = interfaceC38381qS3.BA3();
            this.A04 = interfaceC38381qS3.BK1();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C3XG(InterfaceC38381qS interfaceC38381qS, C1XV c1xv, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c1xv, 3);
        this.A09 = str;
        this.A06 = c1xv;
        this.A08 = interfaceC38381qS.CFr();
        this.A07 = interfaceC38381qS.BA3();
        this.A04 = interfaceC38381qS.BK1();
        this.A05 = interfaceC38381qS;
    }

    public C3XG(InterfaceC38381qS interfaceC38381qS, C40971v4 c40971v4, String str, boolean z) {
        Integer num;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(interfaceC38381qS, 2);
        this.A09 = str;
        this.A06 = interfaceC38381qS.B5n();
        if (z) {
            num = interfaceC38381qS.CFr();
        } else {
            num = null;
        }
        this.A08 = num;
        this.A07 = interfaceC38381qS.BA3();
        this.A04 = interfaceC38381qS.BK1();
        this.A05 = interfaceC38381qS;
        this.A01 = c40971v4;
    }
}
