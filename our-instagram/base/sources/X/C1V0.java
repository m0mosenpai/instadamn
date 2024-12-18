package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1V0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V0 extends C1V1 {
    public final Map A01 = new HashMap();
    public final Map A00 = new HashMap();

    private void A00(Object obj, String str) {
        if (this.A00.get(str) != null) {
            C68251VJn c68251VJn = (C68251VJn) obj;
            c68251VJn.getClass();
            C1V4.A00(c68251VJn);
            c68251VJn.A00.A0G(VHn.A06.toString(), 1);
        }
    }

    @Override // X.C1V1
    public final String A02(String str) {
        InterfaceC72015XFd interfaceC72015XFd = (InterfaceC72015XFd) this.A01.get(str);
        C18C.A07(interfaceC72015XFd, "Could not find flow for the given id.");
        C69427VnC c69427VnC = ((C71118WoF) interfaceC72015XFd).A01;
        if (c69427VnC != null) {
            return c69427VnC.A08;
        }
        throw new IllegalStateException("Step has not been launched.");
    }

    @Override // X.C1V1
    public final java.util.Set A03() {
        return this.A01.keySet();
    }

    @Override // X.C1V1
    public final void A04(C69028Vg4 c69028Vg4, InterfaceC72015XFd interfaceC72015XFd, Object obj, String str) {
        AbstractC68259VJw vbv;
        Map map = this.A01;
        map.put("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", interfaceC72015XFd);
        Map map2 = this.A00;
        map2.put("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", c69028Vg4);
        C71118WoF c71118WoF = (C71118WoF) interfaceC72015XFd;
        if (c71118WoF.A01 == null) {
            vbv = c71118WoF.AAy(null);
        } else {
            vbv = new VBV(c71118WoF);
        }
        if (vbv.A00()) {
            A00(c71118WoF.A02, "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            map.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
            map2.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        }
    }

    @Override // X.C1V1
    public final void A05(String str) {
        Map map = this.A01;
        map.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        Map map2 = this.A00;
        C69028Vg4 c69028Vg4 = (C69028Vg4) map2.get("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        if (c69028Vg4 != null) {
            C68251VJn c68251VJn = c69028Vg4.A00;
            C1V4.A00(c68251VJn);
            c68251VJn.A00.A0G(VHn.A06.toString(), 1);
        }
        map.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
        map2.remove("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
    }

    @Override // X.C1V1
    public final void A06(String str, Object obj) {
        Map map = this.A01;
        InterfaceC72015XFd interfaceC72015XFd = (InterfaceC72015XFd) map.get(str);
        C18C.A07(interfaceC72015XFd, "Could not find flow for the given id.");
        if (interfaceC72015XFd.AAy(obj).A00()) {
            A00(obj, str);
            map.remove(str);
            this.A00.remove(str);
        }
    }
}
