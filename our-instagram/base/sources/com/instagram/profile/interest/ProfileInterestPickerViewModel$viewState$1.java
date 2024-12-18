package com.instagram.profile.interest;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.B4Z;
import X.BHS;
import X.BQO;
import X.C00O;
import X.C05A;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C16930sl;
import X.C17060sy;
import X.C17P;
import X.C18U;
import X.C32046E5y;
import X.C32081E8f;
import X.C32128EAb;
import X.C51758Mth;
import X.Dz6;
import X.E65;
import X.E7Z;
import X.E7t;
import X.EAR;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import X.InterfaceC37246Gav;
import X.InterfaceC37273GbQ;
import X.InterfaceC57806PkY;
import X.MSV;
import X.MU9;
import X.MUG;
import X.MUq;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.interest.ProfileInterestPickerViewModel$viewState$1", f = "ProfileInterestPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ProfileInterestPickerViewModel$viewState$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ Dz6 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileInterestPickerViewModel$viewState$1(Dz6 dz6, InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
        this.A05 = dz6;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj5);
        ProfileInterestPickerViewModel$viewState$1 profileInterestPickerViewModel$viewState$1 = new ProfileInterestPickerViewModel$viewState$1(this.A05, (InterfaceC23621Ds) obj6);
        profileInterestPickerViewModel$viewState$1.A00 = obj;
        profileInterestPickerViewModel$viewState$1.A01 = obj2;
        profileInterestPickerViewModel$viewState$1.A02 = obj3;
        profileInterestPickerViewModel$viewState$1.A03 = obj4;
        profileInterestPickerViewModel$viewState$1.A04 = A1a;
        return profileInterestPickerViewModel$viewState$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object value;
        boolean z;
        String str;
        Object obj3;
        BHS bhs;
        BQO bqo;
        AbstractC09560e7.A00(obj);
        InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) this.A00;
        InterfaceC57806PkY interfaceC57806PkY2 = (InterfaceC57806PkY) this.A01;
        List<C51758Mth> list = (List) this.A02;
        Object obj4 = this.A03;
        boolean z2 = this.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!(interfaceC57806PkY instanceof MUq) && !(interfaceC57806PkY2 instanceof MUq)) {
            if (MU9.A01(interfaceC57806PkY, 1) && MU9.A01(interfaceC57806PkY2, 1)) {
                Dz6 dz6 = this.A05;
                if (!dz6.A01) {
                    dz6.A02(null, MSV.A00(1388), null);
                    dz6.A01 = true;
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                E65 e65 = ((C32128EAb) ((MU9) interfaceC57806PkY).A01).A00;
                if (e65 != null) {
                    List<InterfaceC37246Gav> list2 = e65.A00;
                    if (list2 != null) {
                        ArrayList A0i = AbstractC167007dF.A0i(list2);
                        for (InterfaceC37246Gav interfaceC37246Gav : list2) {
                            ArrayList A1E3 = AbstractC166987dD.A1E();
                            E7t e7t = (E7t) interfaceC37246Gav;
                            List<InterfaceC37273GbQ> list3 = e7t.A02;
                            C32046E5y c32046E5y = ((EAR) ((MU9) interfaceC57806PkY2).A01).A00;
                            if (c32046E5y != null) {
                                List list4 = c32046E5y.A00;
                                if (list3 != null) {
                                    ArrayList A0i2 = AbstractC167007dF.A0i(list3);
                                    for (InterfaceC37273GbQ interfaceC37273GbQ : list3) {
                                        boolean z3 = false;
                                        if (Dz6.A00(interfaceC37273GbQ.B6s(), list) != -1) {
                                            z3 = true;
                                        }
                                        C51758Mth c51758Mth = new C51758Mth(interfaceC37273GbQ, z3);
                                        A1E3.add(c51758Mth);
                                        if (list4 != null && AbstractC001800i.A0u(list4, interfaceC37273GbQ.B6s())) {
                                            A1E2.add(c51758Mth);
                                        }
                                        A0i2.add(C0eB.A00);
                                    }
                                }
                                String str2 = e7t.A00;
                                if (str2 != null) {
                                    bqo = new BQO(str2);
                                } else {
                                    bqo = null;
                                }
                                String str3 = e7t.A01;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                A0i.add(new C32081E8f(bqo, new BQO(str3), A1E3));
                            }
                        }
                        List A0a = AbstractC001800i.A0a(A1E2);
                        if (AbstractC166987dD.A1b(A0a)) {
                            if (!C18U.A06(C06090Tz.A05, dz6.A02, 36316327900025076L)) {
                                bhs = BHS.A00(new Object[0], 2131970180);
                            } else {
                                bhs = null;
                            }
                            A1E.add(new C32081E8f(bhs, BHS.A00(new Object[0], 2131970179), A0a));
                        }
                        A1E.addAll(A0i);
                    }
                }
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            if (MU9.A00(interfaceC57806PkY)) {
                Dz6 dz62 = this.A05;
                AbstractC31176DnK.A1Z(dz62, AbstractC141776au.A00(dz62), 24);
            }
        } else {
            A1E.add(new Object());
        }
        if (MU9.A01(obj4, 1)) {
            Dz6 dz63 = this.A05;
            AbstractC31176DnK.A1Z(dz63, AbstractC141776au.A00(dz63), 25);
            User A01 = C17060sy.A01.A01(dz63.A02);
            ArrayList A0i3 = AbstractC167007dF.A0i(list);
            for (C51758Mth c51758Mth2 : list) {
                if (c51758Mth2 != null) {
                    obj3 = c51758Mth2.A00;
                } else {
                    obj3 = null;
                }
                A0i3.add(obj3);
            }
            List A0a2 = AbstractC001800i.A0a(AbstractC001800i.A0X(A0i3));
            C17P c17p = A01.A03;
            ArrayList A0i4 = AbstractC167007dF.A0i(A0a2);
            Iterator it = A0a2.iterator();
            while (it.hasNext()) {
                A0i4.add(((InterfaceC37273GbQ) it.next()).F2V());
            }
            C14360o3.A0B(A0i4, 1);
            ArrayList A0i5 = AbstractC167007dF.A0i(A0i4);
            Iterator it2 = A0i4.iterator();
            while (it2.hasNext()) {
                A0i5.add(((InterfaceC37273GbQ) it2.next()).F2V());
            }
            c17p.EQH(new E7Z(A0i5));
        } else if (MU9.A00(obj4)) {
            Dz6 dz64 = this.A05;
            AbstractC31176DnK.A1Z(dz64, AbstractC141776au.A00(dz64), 26);
        } else if (!(obj4 instanceof MUq)) {
            throw B4Z.A00();
        }
        Dz6 dz65 = this.A05;
        List<InterfaceC37273GbQ> list5 = dz65.A05;
        if (list5 != null) {
            obj2 = AbstractC167007dF.A0i(list5);
            for (InterfaceC37273GbQ interfaceC37273GbQ2 : list5) {
                if (interfaceC37273GbQ2 != null) {
                    str = interfaceC37273GbQ2.B6s();
                } else {
                    str = null;
                }
                obj2.add(str);
            }
        } else {
            obj2 = C16930sl.A00;
        }
        dz65.A00 = AbstractC25225BEi.A1a(obj2, Dz6.A01((List) dz65.A0B.getValue()));
        C05A c05a = dz65.A09;
        do {
            value = c05a.getValue();
            z = dz65.A00;
            if (z) {
                z = true;
            }
        } while (!c05a.AIi(value, Boolean.valueOf(z)));
        return new MUG(AbstractC001800i.A0a(A1E), list, 18, z2);
    }
}
