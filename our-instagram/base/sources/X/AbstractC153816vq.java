package X;

import java.util.LinkedHashMap;

/* renamed from: X.6vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153816vq implements InterfaceC153826vr {
    public InterfaceC153776vm A00;
    public boolean A01;
    public final LinkedHashMap A02 = new LinkedHashMap();
    public final boolean A03;

    public void A02(InterfaceC154036wC interfaceC154036wC, Object obj, String str) {
        LinkedHashMap linkedHashMap = this.A02;
        boolean containsKey = linkedHashMap.containsKey(str);
        if (containsKey) {
            InterfaceC154036wC interfaceC154036wC2 = (InterfaceC154036wC) linkedHashMap.remove(str);
            int i = 0;
            if (interfaceC154036wC2 != null) {
                interfaceC154036wC2.EdT(false, -1);
            }
            for (InterfaceC154036wC interfaceC154036wC3 : linkedHashMap.values()) {
                i++;
                if (interfaceC154036wC3 != null) {
                    interfaceC154036wC3.EdT(true, i);
                }
            }
        } else {
            if (interfaceC154036wC == null && (interfaceC154036wC = A00(obj)) == null) {
                return;
            }
            interfaceC154036wC.EdT(true, linkedHashMap.size() + 1);
            linkedHashMap.put(str, interfaceC154036wC);
        }
        InterfaceC153776vm interfaceC153776vm = this.A00;
        if (interfaceC153776vm != null) {
            interfaceC153776vm.CgM(str, !containsKey);
        }
        InterfaceC153776vm interfaceC153776vm2 = this.A00;
        if (interfaceC153776vm2 == null) {
            return;
        }
        interfaceC153776vm2.update();
    }

    public final void A01() {
        LinkedHashMap linkedHashMap = this.A02;
        for (InterfaceC154036wC interfaceC154036wC : linkedHashMap.values()) {
            if (interfaceC154036wC != null) {
                interfaceC154036wC.EdT(false, -1);
            }
        }
        linkedHashMap.clear();
    }

    public final void A03(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (z) {
                A01();
            }
            InterfaceC153776vm interfaceC153776vm = this.A00;
            if (interfaceC153776vm != null) {
                interfaceC153776vm.EdR(this.A01);
            }
            InterfaceC153776vm interfaceC153776vm2 = this.A00;
            if (interfaceC153776vm2 != null) {
                interfaceC153776vm2.update();
            }
        }
    }

    @Override // X.InterfaceC153826vr
    public final boolean CWN() {
        return this.A01;
    }

    @Override // X.InterfaceC153826vr
    public final boolean Ejk() {
        return this.A03;
    }

    public AbstractC153816vq(boolean z, boolean z2) {
        this.A01 = z;
        this.A03 = z2;
    }

    public InterfaceC154036wC A00(Object obj) {
        return null;
    }
}
