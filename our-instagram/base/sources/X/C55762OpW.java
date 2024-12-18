package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.OpW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55762OpW implements InterfaceC46822Cv {
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A00 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();

    public final synchronized void A00(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A02;
        java.util.Set set = (java.util.Set) map.get(str);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC27201Tu) it.next()).cancel();
            }
        }
        map.remove(str);
    }

    @Override // X.InterfaceC46822Cv
    public final synchronized void AA8(InterfaceC27201Tu interfaceC27201Tu, C1QY c1qy, String str) {
        java.util.Set A1H;
        String str2 = c1qy.A0E;
        Map map = this.A02;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            C14360o3.A0A(obj);
            A1H = (java.util.Set) obj;
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        A1H.add(interfaceC27201Tu);
        map.put(str, A1H);
        this.A01.put(interfaceC27201Tu, c1qy);
        if (str2 != null) {
            Map map2 = this.A00;
            if (map2.containsKey(str2)) {
                Object obj2 = map2.get(str2);
                C14360o3.A0A(obj2);
                ((java.util.Set) obj2).add(interfaceC27201Tu);
            } else {
                HashSet A1H2 = AbstractC166987dD.A1H();
                A1H2.add(interfaceC27201Tu);
                map2.put(str2, A1H2);
            }
        }
    }

    @Override // X.InterfaceC46822Cv
    public final synchronized void EGB(InterfaceC27201Tu interfaceC27201Tu, C1QY c1qy, String str) {
        String str2 = c1qy.A0E;
        java.util.Set set = (java.util.Set) this.A02.get(str);
        if (set != null) {
            set.remove(interfaceC27201Tu);
        }
        this.A01.remove(interfaceC27201Tu);
        if (str2 != null) {
            Map map = this.A00;
            if (map.containsKey(str2)) {
                Object obj = map.get(str2);
                C14360o3.A0A(obj);
                ((java.util.Set) obj).remove(interfaceC27201Tu);
            }
        }
    }

    @Override // X.InterfaceC46822Cv
    public final synchronized void FBX(String str, boolean z) {
        C1Ef c1Ef;
        Map map = this.A02;
        java.util.Set<InterfaceC27201Tu> set = (java.util.Set) map.get(str);
        if (set != null) {
            for (InterfaceC27201Tu interfaceC27201Tu : set) {
                if (z) {
                    c1Ef = C1Ef.OnScreen;
                } else {
                    c1Ef = C1Ef.OffScreen;
                }
                interfaceC27201Tu.FAL(c1Ef);
            }
        }
        map.remove(str);
    }
}
