package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GpG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38087GpG implements XLO, JPS {
    public final List A00 = AbstractC166987dD.A1E();

    public final void A03() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC43404JFu) it.next()).Dwz();
        }
    }

    public Iterator A04() {
        C1571273r c1571273r;
        EnumC153216up enumC153216up;
        if (this instanceof C38086GpF) {
            C38086GpF c38086GpF = (C38086GpF) this;
            C38088GpH c38088GpH = c38086GpF.A01;
            InterfaceC65952yX interfaceC65952yX = c38086GpF.A02;
            C14360o3.A0B(interfaceC65952yX, 0);
            Iterator it = c38088GpH.A03.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Iterator it2 = ((C128005qU) it.next()).A02.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!interfaceC65952yX.EjD(it2.next())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                List A0a = AbstractC001800i.A0a(c38088GpH.A03);
                c38088GpH.A03.clear();
                c38088GpH.A05.clear();
                C38088GpH.A00(c38088GpH);
                c38088GpH.A06(interfaceC65952yX, A0a);
            }
            if (AbstractC166987dD.A1b(c38088GpH.A02)) {
                return c38088GpH.A02.iterator();
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            InterfaceC62602sz interfaceC62602sz = c38086GpF.A04;
            if (!interfaceC62602sz.isLoading()) {
                if (interfaceC62602sz.CUG()) {
                    c1571273r = AbstractC37300Gc1.A0J();
                    enumC153216up = EnumC153216up.A04;
                } else {
                    c1571273r = c38086GpF.A03;
                    if (c1571273r != null) {
                        enumC153216up = EnumC153216up.A02;
                    }
                }
                A1E.add(new C39098HIw(c1571273r, enumC153216up));
            }
            return A1E.iterator();
        }
        HKK hkk = (HKK) this;
        J69 j69 = hkk.A00;
        j69.A01 = hkk.A02.iterator();
        j69.A00 = j69.A00();
        return j69;
    }
}
