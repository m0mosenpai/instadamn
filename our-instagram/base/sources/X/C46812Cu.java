package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2Cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46812Cu implements InterfaceC46822Cv {
    public final Map A02 = new ConcurrentHashMap();
    public final Map A00 = new ConcurrentHashMap();
    public final Map A01 = new ConcurrentHashMap();

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                ((InterfaceC27201Tu) it.next()).cancel();
            }
        }
        map.remove(str);
    }

    @Override // X.InterfaceC46822Cv
    public final void AA8(InterfaceC27201Tu interfaceC27201Tu, C1QY c1qy, String str) {
        String str2 = c1qy.A0E;
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(interfaceC27201Tu);
        this.A01.put(interfaceC27201Tu, c1qy);
        if (str2 != null) {
            Map map2 = this.A00;
            if (map2.containsKey(str2)) {
                Object obj = map2.get(str2);
                C14360o3.A0A(obj);
                ((CopyOnWriteArrayList) obj).add(interfaceC27201Tu);
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                copyOnWriteArrayList2.add(interfaceC27201Tu);
                map2.put(str2, copyOnWriteArrayList2);
            }
        }
    }

    @Override // X.InterfaceC46822Cv
    public final void EGB(InterfaceC27201Tu interfaceC27201Tu, C1QY c1qy, String str) {
        String str2 = c1qy.A0E;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.A02.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(interfaceC27201Tu);
        }
        this.A01.remove(interfaceC27201Tu);
        if (str2 != null) {
            Map map = this.A00;
            if (map.containsKey(str2)) {
                Object obj = map.get(str2);
                C14360o3.A0A(obj);
                ((CopyOnWriteArrayList) obj).remove(interfaceC27201Tu);
            }
        }
    }

    @Override // X.InterfaceC46822Cv
    public final void FBX(String str, boolean z) {
        C1Ef c1Ef;
        Map map = this.A02;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                InterfaceC27201Tu interfaceC27201Tu = (InterfaceC27201Tu) it.next();
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
