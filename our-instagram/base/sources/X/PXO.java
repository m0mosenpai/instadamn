package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PXO extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXO(OpalRepository opalRepository, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(1, interfaceC23621Ds);
        this.A01 = i;
        this.A04 = z;
        this.A02 = opalRepository;
        this.A03 = str;
    }

    public static C51751Mta A00(OpalRepository opalRepository) {
        return (C51751Mta) ((C38688GzT) opalRepository.A08.getValue()).A01;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        boolean z = this.A04;
        OpalRepository opalRepository = (OpalRepository) this.A02;
        String str = this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new PXO(opalRepository, str, interfaceC23621Ds, i, z);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PXO) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj2 = obj;
        int i = this.A01;
        C1JX c1jx = C1JX.A02;
        if (i != 0) {
            boolean z = true;
            ArrayList arrayList = null;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj2);
            } else {
                AbstractC09560e7.A00(obj2);
                boolean z2 = this.A04;
                if (z2 || A00((OpalRepository) this.A02).A03) {
                    if (!z2) {
                        OpalRepository.A02((OpalRepository) this.A02, C74.A05);
                    }
                    OpalRepository opalRepository = (OpalRepository) this.A02;
                    UserSession userSession = opalRepository.A03;
                    String str5 = this.A03;
                    Integer num = C05F.A0C;
                    if (z2) {
                        str3 = null;
                    } else {
                        str3 = A00(opalRepository).A02;
                    }
                    C1Dk A01 = C93o.A01(userSession, num, str5, str3, null, null, false, false, false, true, false, false, false, false, false);
                    C40701ud c40701ud = opalRepository.A04;
                    this.A00 = 1;
                    obj2 = c40701ud.A04(A01, this);
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                }
            }
            C3NY c3ny = (C3NY) obj2;
            if (c3ny instanceof C3NX) {
                Object obj3 = ((C3NX) c3ny).A00;
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.facebook.graphql.query.interfaces.IGraphQLResult<com.facebook.graphql.modelutil.GraphQLModel>");
                OpalRepository opalRepository2 = (OpalRepository) this.A02;
                UserSession userSession2 = opalRepository2.A03;
                C123645id A00 = AbstractC37979GnM.A00((AnonymousClass436) obj3, userSession2);
                String str6 = A00.A04;
                List list = A00.A06;
                if (list != null) {
                    arrayList = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C38321qM A0i = AbstractC31172DnG.A0i(it);
                        List list2 = opalRepository2.A07;
                        C14360o3.A0A(A0i);
                        list2.add(A0i);
                        ImageUrl A1S = A0i.A1S();
                        if (A1S != null) {
                            String url = A1S.getUrl();
                            String id = A0i.getId();
                            if (id != null) {
                                boolean A5F = A0i.A5F();
                                EnumC40111tc BRp = A0i.BRp();
                                boolean A5P = A0i.A5P();
                                boolean A5R = A0i.A5R();
                                Integer Bdm = A0i.A0C.Bdm();
                                if (Bdm == null) {
                                    Bdm = A0i.A0C.CFm();
                                }
                                String AXw = A0i.A0C.AXw();
                                User A2E = A0i.A2E(userSession2);
                                if (A2E != null) {
                                    str4 = A2E.getUsername();
                                } else {
                                    str4 = "";
                                }
                                arrayList.add(new C26010Bey(BRp, Bdm, url, id, AXw, str4, A5F, A5P, A5R));
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                if (!this.A04) {
                    A1E.addAll((Collection) A00(opalRepository2).A00);
                }
                A1E.addAll(MSY.A0l(arrayList));
                C74 c74 = C74.A04;
                if (str6 == null) {
                    z = false;
                }
                OpalRepository.A00(new C51751Mta(c74, str6, A1E, z), opalRepository2);
            } else {
                OpalRepository.A02((OpalRepository) this.A02, C74.A03);
            }
        } else {
            boolean z3 = true;
            ArrayList arrayList2 = null;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj2);
            } else {
                AbstractC09560e7.A00(obj2);
                boolean z4 = this.A04;
                if (z4 || A00((OpalRepository) this.A02).A03) {
                    if (!z4) {
                        OpalRepository.A02((OpalRepository) this.A02, C74.A05);
                    }
                    OpalRepository opalRepository3 = (OpalRepository) this.A02;
                    UserSession userSession3 = opalRepository3.A03;
                    AnonymousClass500 anonymousClass500 = new AnonymousClass500(this.A03);
                    if (z4) {
                        str = null;
                    } else {
                        str = A00(opalRepository3).A02;
                    }
                    C1ON A02 = AnonymousClass748.A02(userSession3, anonymousClass500, str, true);
                    this.A00 = 1;
                    obj2 = A02.A00(72627069, this);
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                }
            }
            Object obj4 = (C3NY) obj2;
            boolean z5 = this.A04;
            OpalRepository opalRepository4 = (OpalRepository) this.A02;
            if (obj4 instanceof C3NX) {
                C74293Vk c74293Vk = (C74293Vk) ((C3NX) obj4).A00;
                String str7 = c74293Vk.A04;
                List list3 = c74293Vk.A06;
                if (list3 != null) {
                    arrayList2 = AbstractC166987dD.A1E();
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        C38321qM A0i2 = AbstractC31172DnG.A0i(it2);
                        List list4 = opalRepository4.A07;
                        C14360o3.A0A(A0i2);
                        list4.add(A0i2);
                        ImageUrl A1S2 = A0i2.A1S();
                        if (A1S2 != null) {
                            String url2 = A1S2.getUrl();
                            String id2 = A0i2.getId();
                            if (id2 != null) {
                                boolean A5F2 = A0i2.A5F();
                                EnumC40111tc BRp2 = A0i2.BRp();
                                boolean A5P2 = A0i2.A5P();
                                boolean A5R2 = A0i2.A5R();
                                Integer Bdm2 = A0i2.A0C.Bdm();
                                if (Bdm2 == null) {
                                    Bdm2 = A0i2.A0C.CFm();
                                }
                                String AXw2 = A0i2.A0C.AXw();
                                User A2E2 = A0i2.A2E(opalRepository4.A03);
                                if (A2E2 != null) {
                                    str2 = A2E2.getUsername();
                                } else {
                                    str2 = "";
                                }
                                arrayList2.add(new C26010Bey(BRp2, Bdm2, url2, id2, AXw2, str2, A5F2, A5P2, A5R2));
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (!z5) {
                    A1E2.addAll((Collection) A00(opalRepository4).A00);
                }
                A1E2.addAll(MSY.A0l(arrayList2));
                C74 c742 = C74.A04;
                if (str7 == null) {
                    z3 = false;
                }
                OpalRepository.A00(new C51751Mta(c742, str7, A1E2, z3), opalRepository4);
                obj4 = AbstractC25227BEk.A0i();
            } else if (!(obj4 instanceof C194848jk)) {
                throw B4Z.A00();
            }
            if (!(obj4 instanceof C3NX)) {
                if (obj4 instanceof C194848jk) {
                    OpalRepository.A02(opalRepository4, C74.A03);
                } else {
                    throw B4Z.A00();
                }
            }
        }
        return C0eB.A00;
    }
}
