package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C196518mh extends C175777rr implements InterfaceC175747ro {
    public InterfaceC178817wt A00;
    public EnumC222819sM A01;
    public InterfaceC175597rZ A02;
    public boolean A03;
    public boolean A04;

    public boolean A0B(EnumC222819sM enumC222819sM, boolean z) {
        C14360o3.A0B(enumC222819sM, 0);
        if (this.A01 == enumC222819sM) {
            return false;
        }
        A01();
        if (A03(enumC222819sM)) {
            return true;
        }
        A03(this.A01);
        return false;
    }

    private final void A01() {
        InterfaceC178067vf Aq0 = ((AbstractC179687yI) this).A00.Aq0(this.A01.A00);
        C14360o3.A07(Aq0);
        if (Aq0 instanceof InterfaceC178667we) {
            Aq0.pause();
            return;
        }
        if (Aq0 instanceof C212349b3) {
            if (this.A04) {
                return;
            }
            Aq0.APM();
            InterfaceC179447xu interfaceC179447xu = ((C212349b3) Aq0).A06;
            if (interfaceC179447xu != null) {
                interfaceC179447xu.EZr(AZL.A00);
                return;
            } else {
                C14360o3.A0F("input");
                throw C00O.createAndThrow();
            }
        }
        if (!(Aq0 instanceof BEN)) {
            return;
        }
        Aq0.APM();
    }

    private final boolean A03(EnumC222819sM enumC222819sM) {
        String str;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        C178087vh c178087vh = enumC222819sM.A00;
        if (!interfaceC178207vu.CRY(c178087vh)) {
            return false;
        }
        InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
        C14360o3.A07(Aq0);
        if (Aq0 instanceof InterfaceC178667we) {
            Aq0.EKd();
        } else {
            if (Aq0 instanceof C212349b3) {
                if (this.A04) {
                    return false;
                }
                C212349b3 c212349b3 = (C212349b3) Aq0;
                InterfaceC179447xu interfaceC179447xu = c212349b3.A06;
                if (interfaceC179447xu != null) {
                    interfaceC179447xu.EZr(new AZJ(this));
                    C179407xq A0C = c212349b3.A0C();
                    C178747wm c178747wm = new C178747wm();
                    InterfaceC179447xu interfaceC179447xu2 = c212349b3.A06;
                    if (interfaceC179447xu2 != null) {
                        C1809380v c1809380v = new C1809380v(c178747wm, interfaceC179447xu2, false);
                        if (this.A03) {
                            c1809380v.A00 = 9;
                        }
                        InterfaceC178817wt interfaceC178817wt = this.A00;
                        str = "mediaGraphController";
                        if (interfaceC178817wt != null) {
                            interfaceC178817wt.BQq().EWA(c1809380v, 0);
                            InterfaceC178817wt interfaceC178817wt2 = this.A00;
                            if (interfaceC178817wt2 != null) {
                                interfaceC178817wt2.FBm(0, A0C.A01, A0C.A00, true, 1080, 1920);
                                c212349b3.ARQ();
                                InterfaceC175597rZ interfaceC175597rZ = this.A02;
                                if (interfaceC175597rZ == null) {
                                    str = "renderController";
                                } else {
                                    interfaceC175597rZ.Emi(new C23403AZc(this));
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                str = "input";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (!(Aq0 instanceof BEN)) {
                return false;
            }
            Aq0.ARQ();
        }
        this.A01 = enumC222819sM;
        return true;
    }

    public void A0A() {
        EnumC222819sM enumC222819sM = this.A01;
        EnumC222819sM enumC222819sM2 = EnumC222819sM.A03;
        if (enumC222819sM != enumC222819sM2) {
            A01();
            this.A01 = enumC222819sM2;
        }
    }

    @Override // X.C175777rr, X.AbstractC178227vw
    public void A09() {
        super.A09();
        C178087vh c178087vh = InterfaceC178817wt.A01;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179687yI) this).A00;
        if (!interfaceC178207vu.CRY(c178087vh)) {
            C175777rr.A00(InterfaceC178817wt.class);
            this.A04 = true;
        }
        C178087vh c178087vh2 = InterfaceC178787wq.A00;
        if (!interfaceC178207vu.CRY(c178087vh2)) {
            C175777rr.A00(InterfaceC178787wq.class);
            this.A04 = true;
        }
        if (C14360o3.A0K(interfaceC178207vu.AqG(InterfaceC175747ro.A00), true)) {
            this.A03 = true;
        }
        this.A00 = (InterfaceC178817wt) interfaceC178207vu.Aq0(c178087vh);
        this.A02 = ((InterfaceC178787wq) interfaceC178207vu.Aq0(c178087vh2)).Bma();
        EnumC222819sM[] values = EnumC222819sM.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC222819sM enumC222819sM : values) {
            if (enumC222819sM != EnumC222819sM.A03 && interfaceC178207vu.CRY(enumC222819sM.A00)) {
                arrayList.add(enumC222819sM);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(((EnumC222819sM) it.next()).A00);
            C14360o3.A07(Aq0);
            arrayList2.add(Aq0);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((InterfaceC178077vg) it2.next()).APM();
        }
    }
}
