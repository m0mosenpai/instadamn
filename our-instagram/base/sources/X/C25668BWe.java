package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BWe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25668BWe extends AbstractC51572Yf {
    public final BWM A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C25665BWb A03;
    public final InterfaceC31152Dmw A04;
    public final HashMap A05;
    public final HashMap A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v29, types: [X.Dkw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Dkw, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float f;
        C51759Mti c51759Mti;
        C51759Mti c51759Mti2;
        C51759Mti c51759Mti3;
        C14360o3.A0B(c76223bS, 0);
        if (this.A07) {
            f = C57992lC.A01();
        } else {
            f = 0.0f;
        }
        BWM bwm = this.A00;
        InterfaceC30895Di8 interfaceC30895Di8 = bwm.A08;
        ArrayList arrayList = null;
        if (interfaceC30895Di8 instanceof C26265BjY) {
            C25415BMg A03 = A03(bwm.A06, true);
            if (A03 != null) {
                c51759Mti3 = new C51759Mti(((C26265BjY) interfaceC30895Di8).A00, A03);
            } else {
                c51759Mti3 = null;
            }
            D0X d0x = new D0X(c51759Mti3, null, new Object());
            InterfaceC11380iw interfaceC11380iw = this.A01;
            UserSession userSession = this.A02;
            C25665BWb c25665BWb = this.A03;
            C26265BjY c26265BjY = (C26265BjY) interfaceC30895Di8;
            BVE bve = new BVE(null, interfaceC11380iw, bwm.A05);
            HashMap hashMap = this.A05;
            HashMap hashMap2 = this.A06;
            List list = c26265BjY.A01;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(A03((InterfaceC30893Di6) it.next(), true));
            }
            return new C26526Bnl(interfaceC11380iw, userSession, d0x, c25665BWb, bve, bwm, c26265BjY, bwm.A02.A00, hashMap, hashMap2, A0i, f);
        }
        int i = 0;
        if (interfaceC30895Di8 instanceof C26266BjZ) {
            InterfaceC11380iw interfaceC11380iw2 = this.A01;
            UserSession userSession2 = this.A02;
            boolean A1W = AbstractC167007dF.A1W(bwm.A00);
            C26266BjZ c26266BjZ = (C26266BjZ) interfaceC30895Di8;
            C25665BWb c25665BWb2 = this.A03;
            HashMap hashMap3 = this.A05;
            HashMap hashMap4 = this.A06;
            List list2 = c26266BjZ.A07;
            ArrayList A0i2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        break;
                    }
                    A0i2.add(A03((InterfaceC30893Di6) next, true));
                    i2 = i3;
                } else {
                    List list3 = c26266BjZ.A08;
                    if (list3 != null) {
                        arrayList = AbstractC167007dF.A0i(list3);
                        for (Object obj : list3) {
                            int i4 = i + 1;
                            if (i >= 0) {
                                arrayList.add(A03((InterfaceC30893Di6) obj, true));
                                i = i4;
                            }
                        }
                    }
                    return new C26527Bnm(interfaceC11380iw2, userSession2, c25665BWb2, c26266BjZ, this.A04, bwm.A02.A00, hashMap3, hashMap4, A0i2, arrayList, f, A1W);
                }
            }
            AbstractC16960so.A1U();
            throw C00O.createAndThrow();
        }
        if (interfaceC30895Di8 instanceof C26264BjX) {
            C25415BMg A032 = A03(bwm.A06, true);
            InterfaceC30893Di6 interfaceC30893Di6 = bwm.A07;
            C25415BMg A033 = A03(interfaceC30893Di6, false);
            if (A032 != null) {
                c51759Mti = new C51759Mti(((C26264BjX) interfaceC30895Di8).A01, A032);
            } else {
                c51759Mti = null;
            }
            if (A033 != null) {
                C5QE c5qe = ((C26264BjX) interfaceC30895Di8).A00;
                if (c5qe != null && !(interfaceC30893Di6 instanceof C25671BWh)) {
                    c51759Mti2 = new C51759Mti(BHX.A03(AbstractC25227BEk.A0A(c76223bS), c5qe), A033);
                } else {
                    c51759Mti2 = new C51759Mti((C5QE) null, A033);
                }
            } else {
                c51759Mti2 = null;
            }
            return new C26482Bn3(this.A01, this.A02, new D0X(c51759Mti, c51759Mti2, new Object()), this.A03, bwm, this.A06, this.A05);
        }
        throw B4Z.A00();
    }

    private final C25415BMg A03(InterfaceC30893Di6 interfaceC30893Di6, boolean z) {
        C25665BWb c25665BWb;
        Object dh5;
        String str;
        int i;
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        int i3;
        if (interfaceC30893Di6 instanceof BWX) {
            BWX bwx = (BWX) interfaceC30893Di6;
            C38321qM c38321qM = bwx.A03;
            C22P c22p = bwx.A00;
            InterfaceC88553xD interfaceC88553xD = bwx.A02;
            c25665BWb = this.A03;
            dh5 = new C29722D8s(11, interfaceC88553xD, c38321qM, bwx.A01, c25665BWb, c22p, this);
        } else if (interfaceC30893Di6 instanceof C26262BjV) {
            c25665BWb = this.A03;
            C26262BjV c26262BjV = (C26262BjV) interfaceC30893Di6;
            dh5 = new C57262Pbk(c25665BWb, c26262BjV.A00, c26262BjV.A01, 45);
        } else {
            boolean z2 = interfaceC30893Di6 instanceof C26263BjW;
            if (z2) {
                C26263BjW c26263BjW = (C26263BjW) interfaceC30893Di6;
                if (c26263BjW.A00 == 0) {
                    c25665BWb = this.A03;
                    obj = c26263BjW.A01;
                    i2 = 19;
                    dh5 = new D8I(i2, c25665BWb, obj);
                }
            }
            if (BWV.A00(interfaceC30893Di6, 0)) {
                c25665BWb = this.A03;
                BWV bwv = (BWV) interfaceC30893Di6;
                dh5 = new C29709D8c(10, bwv.A01, c25665BWb, bwv.A02, this);
            } else {
                if (BWV.A00(interfaceC30893Di6, 2)) {
                    c25665BWb = this.A03;
                    BWV bwv2 = (BWV) interfaceC30893Di6;
                    obj2 = bwv2.A01;
                    obj3 = bwv2.A02;
                    i3 = 12;
                } else if (BWV.A00(interfaceC30893Di6, 1)) {
                    c25665BWb = this.A03;
                    BWV bwv3 = (BWV) interfaceC30893Di6;
                    obj2 = bwv3.A03;
                    obj3 = bwv3.A01;
                    i3 = 11;
                } else {
                    boolean z3 = interfaceC30893Di6 instanceof C26261BjU;
                    if (z3) {
                        C26261BjU c26261BjU = (C26261BjU) interfaceC30893Di6;
                        if (c26261BjU.A00 == 0) {
                            c25665BWb = this.A03;
                            str = c26261BjU.A02;
                            i = 36;
                            dh5 = new C57259Pbh(str, c25665BWb, i);
                        }
                    }
                    if (z2) {
                        C26263BjW c26263BjW2 = (C26263BjW) interfaceC30893Di6;
                        if (c26263BjW2.A00 == 1) {
                            c25665BWb = this.A03;
                            obj = c26263BjW2.A01;
                            i2 = 20;
                            dh5 = new D8I(i2, c25665BWb, obj);
                        }
                    }
                    if (z3) {
                        C26261BjU c26261BjU2 = (C26261BjU) interfaceC30893Di6;
                        int i4 = c26261BjU2.A00;
                        if (i4 == 2) {
                            c25665BWb = this.A03;
                            str = c26261BjU2.A02;
                            i = 38;
                        } else if (i4 == 1) {
                            c25665BWb = this.A03;
                            str = c26261BjU2.A02;
                            i = 37;
                        }
                        dh5 = new C57259Pbh(str, c25665BWb, i);
                    }
                    if (interfaceC30893Di6 instanceof C26260BjT) {
                        c25665BWb = this.A03;
                        dh5 = new DH5(c25665BWb, (String) null, ((C26260BjT) interfaceC30893Di6).A00, 47);
                    } else {
                        return null;
                    }
                }
                dh5 = new C29709D8c(i3, obj2, c25665BWb, obj3, this);
            }
        }
        UserSession userSession = this.A02;
        BWM bwm = this.A00;
        InstagramMidcardType instagramMidcardType = bwm.A02;
        ClipsMidCardSubtype clipsMidCardSubtype = bwm.A01;
        AbstractC167027dH.A12(userSession, instagramMidcardType, clipsMidCardSubtype);
        return new C25415BMg(5, instagramMidcardType, userSession, clipsMidCardSubtype, dh5, c25665BWb, z);
    }

    public C25668BWe(InterfaceC11380iw interfaceC11380iw, UserSession userSession, BWM bwm, C25665BWb c25665BWb, InterfaceC31152Dmw interfaceC31152Dmw, HashMap hashMap, HashMap hashMap2, boolean z) {
        AbstractC167017dG.A1T(hashMap, hashMap2);
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A00 = bwm;
        this.A03 = c25665BWb;
        this.A05 = hashMap;
        this.A06 = hashMap2;
        this.A07 = z;
        this.A04 = interfaceC31152Dmw;
    }
}
