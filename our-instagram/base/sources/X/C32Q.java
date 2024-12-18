package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.32Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32Q {
    public static final C32Q A00 = new Object();

    public final C32O A00(final Context context, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession) {
        C32O c42940Iys;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36313222638208842L)) {
            final boolean A06 = C18U.A06(c06090Tz, userSession, 36313222638470987L);
            final boolean A062 = C18U.A06(c06090Tz, userSession, 2342156231852623696L);
            final int A01 = (int) C18U.A01(c06090Tz, userSession, 36594697615247167L);
            final boolean A063 = C18U.A06(c06090Tz, userSession, 36313222638602060L);
            final boolean A064 = C18U.A06(c06090Tz, userSession, 36313222638995281L);
            c42940Iys = new C32O(context, interfaceC11380iw, userSession, A01, A06, A062, A063, A064) { // from class: X.32R
                public final InterfaceC11380iw A00;
                public final UserSession A01;
                public final boolean A02;
                public final int A03;
                public final Context A04;
                public final boolean A05;
                public final boolean A06;
                public final boolean A07;

                @Override // X.C32O
                public final void DyU(Collection collection, int i) {
                    List<C38321qM> AmB;
                    C14360o3.A0B(collection, 0);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collection) {
                        C38321qM A02 = C3XH.A02(((C82373m0) obj).A01.A05);
                        if (A02 != null && A02.A4n()) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C38321qM A022 = C3XH.A02(((C82373m0) it.next()).A01.A05);
                        if (A022 != null) {
                            UserSession userSession2 = this.A01;
                            Context context2 = this.A04;
                            EnumC140736Yb enumC140736Yb = EnumC140736Yb.A04;
                            InterfaceC104804nl Aso = A022.A0C.Aso();
                            if (Aso != null) {
                                IgShowreelNativeAnimationIntf Bx7 = Aso.Bx7();
                                if (Bx7 != null) {
                                    C14120nc.A00().ATO(new HJW(context2, userSession2, new C139366Sr(AbstractC41071vF.A07(userSession2, A022), AbstractC41071vF.A0F(userSession2, A022)), Bx7, enumC140736Yb));
                                } else {
                                    throw new IllegalStateException(AbstractC111324zv.A00(857));
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (this.A05) {
                        if (!collection.isEmpty()) {
                            Iterator it2 = collection.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C38321qM A023 = C3XH.A02(((C82373m0) it2.next()).A01.A05);
                                if (A023 != null && !A023.A5M() && A023.A0C.Aso() != null) {
                                    Xz7.A00(this.A04, EnumC72358Xbu.A02, new C72737Xm9(this.A07, this.A03));
                                    break;
                                }
                            }
                        }
                        if (this.A06 && !collection.isEmpty()) {
                            Iterator it3 = collection.iterator();
                            while (it3.hasNext()) {
                                C38321qM A024 = C3XH.A02(((C82373m0) it3.next()).A01.A05);
                                if (A024 != null && A024.A5M() && (AmB = A024.A0C.AmB()) != null && (!(AmB instanceof Collection) || !AmB.isEmpty())) {
                                    for (C38321qM c38321qM : AmB) {
                                        if (c38321qM.A0C.Aso() != null || c38321qM.A0C.CDS() != null) {
                                            Xz7.A00(this.A04, EnumC72358Xbu.A02, new C72737Xm9(this.A07, this.A03));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // X.C32O
                public final void D3D() {
                    if (this.A05) {
                        EnumC72358Xbu enumC72358Xbu = EnumC72358Xbu.A02;
                        Map map = Xz7.A00;
                        Y09 y09 = (Y09) map.get(enumC72358Xbu);
                        if (y09 != null) {
                            y09.A03.clear();
                            y09.A00 = true;
                        }
                        map.remove(enumC72358Xbu);
                        Y09 y092 = (Y09) map.get(enumC72358Xbu);
                        if (y092 != null) {
                            y092.A03.clear();
                            y092.A00 = true;
                        }
                        map.remove(enumC72358Xbu);
                    }
                    if (this.A02) {
                        C6V4.A01(this.A01);
                    }
                }

                @Override // X.C32O
                public final /* bridge */ /* synthetic */ void D7b(Object obj, List list, int i) {
                    C38321qM A02;
                    List AmB;
                    Object obj2;
                    JM9 CDS;
                    String Bmu;
                    Integer Bmr;
                    C82373m0 c82373m0 = (C82373m0) obj;
                    C14360o3.A0B(c82373m0, 0);
                    if (this.A02 && (A02 = C3XH.A02(c82373m0.A01.A05)) != null && A02.A5M() && (AmB = A02.A0C.AmB()) != null) {
                        Iterator it = AmB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                JM9 CDS2 = ((C38321qM) obj2).A0C.CDS();
                                if (CDS2 != null && (Bmr = CDS2.Bmr()) != null && Bmr.intValue() == 1) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C38321qM c38321qM = (C38321qM) obj2;
                        if (c38321qM != null && (CDS = c38321qM.A0C.CDS()) != null && (Bmu = CDS.Bmu()) != null) {
                            C6V4.A00(this.A01).A01(Bmu, this.A00.getModuleName(), CDS.Acq());
                        }
                    }
                }

                {
                    this.A04 = context;
                    this.A01 = userSession;
                    this.A00 = interfaceC11380iw;
                    this.A05 = A06;
                    this.A06 = A062;
                    this.A03 = A01;
                    this.A07 = A063;
                    this.A02 = A064;
                }
            };
        } else {
            c42940Iys = new C42940Iys();
        }
        return c42940Iys;
    }
}
