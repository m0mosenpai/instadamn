package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68034V7f extends AbstractC38087GpG implements JPS {
    public EnumC68206VFy A00;
    public final C1571273r A02;
    public final InterfaceC62602sz A03;
    public final InterfaceC71926XAk A07;
    public final Map A09;
    public final InterfaceC65952yX A08 = new Wk8(this);
    public final List A04 = new ArrayList();
    public final Map A06 = new HashMap();
    public final C68974VfC A01 = new C68974VfC();
    public final Map A05 = new HashMap();

    public static C38088GpH A00(EnumC68206VFy enumC68206VFy, C68034V7f c68034V7f) {
        C38088GpH c38088GpH = (C38088GpH) c68034V7f.A09.get(enumC68206VFy);
        if (c38088GpH != null) {
            return c38088GpH;
        }
        throw AbstractC37303Gc4.A0M(enumC68206VFy, "Unsupported DiscoveryTabType: ", new StringBuilder());
    }

    public static C68034V7f A01(UserSession userSession, EnumC68206VFy enumC68206VFy, InterfaceC71926XAk interfaceC71926XAk, C1571273r c1571273r, InterfaceC62602sz interfaceC62602sz, List list) {
        HashMap hashMap = new HashMap();
        for (Object obj : list) {
            C14360o3.A0B(userSession, 1);
            hashMap.put(obj, new C38088GpH(C71817X5v.A00, userSession));
        }
        return new C68034V7f(enumC68206VFy, interfaceC71926XAk, c1571273r, interfaceC62602sz, hashMap);
    }

    private void A02(List list) {
        EnumC68206VFy enumC68206VFy = this.A00;
        for (Object obj : this.A04) {
            if (!(obj instanceof InterfaceC66482zP)) {
                if (obj instanceof C132735yw) {
                    obj = new C70798WhE(this.A01, enumC68206VFy);
                }
            }
            list.add(obj);
        }
    }

    @Override // X.AbstractC38087GpG
    public final Iterator A04() {
        ArrayList arrayList;
        C1571273r c1571273r;
        EnumC153216up enumC153216up;
        if (!A00(this.A00, this).A02.isEmpty()) {
            EnumC68206VFy enumC68206VFy = this.A00;
            arrayList = new ArrayList();
            A02(arrayList);
            EnumC68206VFy enumC68206VFy2 = this.A00;
            List list = (List) this.A06.get(enumC68206VFy2);
            if (list != null) {
                for (Object obj : list) {
                    if (!(obj instanceof InterfaceC66482zP)) {
                        if (obj instanceof C132735yw) {
                            obj = new C70798WhE(this.A01, enumC68206VFy2);
                        }
                    }
                    arrayList.add(obj);
                }
            }
            arrayList.addAll(A00(enumC68206VFy, this).A02);
        } else {
            EnumC68206VFy enumC68206VFy3 = this.A00;
            arrayList = new ArrayList();
            A02(arrayList);
            InterfaceC62602sz interfaceC62602sz = this.A03;
            if (!interfaceC62602sz.isLoading()) {
                if (interfaceC62602sz.CUG()) {
                    c1571273r = new C1571273r();
                    enumC153216up = EnumC153216up.A04;
                } else {
                    Map map = this.A05;
                    if (map.containsKey(enumC68206VFy3)) {
                        c1571273r = (C1571273r) map.get(enumC68206VFy3);
                    } else {
                        c1571273r = this.A02;
                    }
                    enumC153216up = EnumC153216up.A02;
                }
                arrayList.add(new C39098HIw(c1571273r, enumC153216up));
            }
        }
        return arrayList.iterator();
    }

    public final int A05() {
        EnumC68206VFy enumC68206VFy = this.A00;
        C68974VfC c68974VfC = this.A01;
        C14360o3.A0B(enumC68206VFy, 0);
        Iterator it = c68974VfC.A01.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((W4N) it.next()).A00() != enumC68206VFy) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void A08(EnumC68206VFy enumC68206VFy, boolean z) {
        if (this.A00 != enumC68206VFy) {
            this.A00 = enumC68206VFy;
            if (z) {
                this.A07.Drt(enumC68206VFy);
            }
            A03();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.5yw] */
    public final void A09(List list) {
        List list2 = this.A04;
        list2.clear();
        for (?? r3 : list) {
            if (!(r3 instanceof InterfaceC66482zP)) {
                if (r3 instanceof C128005qU) {
                    list2.addAll(((C128005qU) r3).A02);
                } else if (r3 instanceof C132735yw) {
                    r3 = (C132735yw) r3;
                    C68974VfC c68974VfC = this.A01;
                    List list3 = r3.A02;
                    C14360o3.A0B(list3, 0);
                    List list4 = c68974VfC.A01;
                    list4.clear();
                    list4.addAll(list3);
                }
            }
            list2.add(r3);
        }
        A03();
    }

    public final boolean A0A(UserSession userSession, String str) {
        User A2E;
        for (InterfaceC127955qO interfaceC127955qO : A00(this.A00, this).A02) {
            if ((interfaceC127955qO instanceof InterfaceC127975qQ) && (A2E = ((InterfaceC127975qQ) interfaceC127955qO).BQN().A2E(userSession)) != null && A2E.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC43401JFq
    public final /* bridge */ /* synthetic */ C5qT BAL(InterfaceC66482zP interfaceC66482zP) {
        return A00(this.A00, this).A03((AbstractC127945qN) interfaceC66482zP);
    }

    @Override // X.InterfaceC57967PnD
    public final /* bridge */ /* synthetic */ C5qT BAM(Object obj) {
        return A00(this.A00, this).A03((AbstractC127945qN) obj);
    }

    @Override // X.XLO
    public final void EWn(C07X c07x, MTQ mtq) {
        super.A00.add(new C42421IqO(this, mtq));
    }

    public C68034V7f(EnumC68206VFy enumC68206VFy, InterfaceC71926XAk interfaceC71926XAk, C1571273r c1571273r, InterfaceC62602sz interfaceC62602sz, Map map) {
        this.A09 = map;
        this.A00 = enumC68206VFy;
        this.A03 = interfaceC62602sz;
        this.A02 = c1571273r;
        this.A07 = interfaceC71926XAk;
    }

    public final void A06(EnumC68206VFy enumC68206VFy) {
        C38088GpH A00 = A00(enumC68206VFy, this);
        A00.A03.clear();
        A00.A05.clear();
        C38088GpH.A00(A00);
        A03();
    }

    public final void A07(EnumC68206VFy enumC68206VFy, List list) {
        C38088GpH A00 = A00(enumC68206VFy, this);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C128005qU) {
                arrayList.add(obj);
            } else {
                throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(340), obj.getClass().toString());
            }
        }
        A00.A06(this.A08, arrayList);
        A03();
    }
}
