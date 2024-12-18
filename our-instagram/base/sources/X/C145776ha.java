package X;

import android.content.Intent;
import com.instagram.model.reels.Reel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145776ha implements InterfaceC145136gY {
    public final List A00 = new CopyOnWriteArrayList();

    public final void A00(InterfaceC145136gY interfaceC145136gY) {
        C14360o3.A0B(interfaceC145136gY, 0);
        List list = this.A00;
        if (!list.contains(interfaceC145136gY)) {
            list.add(interfaceC145136gY);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void D8t(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, C141596ac c141596ac) {
        C14360o3.A0B(interfaceC143576dw, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c141596ac, 2);
        C14360o3.A0B(c41551w4, 3);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).D8t(c41181vS, c41551w4, interfaceC143576dw, c141596ac);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DNK(Reel reel) {
        C14360o3.A0B(reel, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DNK(reel);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DXv(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DXv(str);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
        C14360o3.A0B(c41181vS, 0);
        C14360o3.A0B(interfaceC143586dx, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).E00(c41181vS, interfaceC143586dx);
        }
    }

    @Override // X.InterfaceC145136gY
    public final boolean BWM() {
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC145136gY) it.next()).BWM()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final int Bs6() {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InterfaceC145136gY) obj).Bs6() > 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC145136gY interfaceC145136gY = (InterfaceC145136gY) obj;
        if (interfaceC145136gY == null) {
            return 0;
        }
        return interfaceC145136gY.Bs6();
    }

    @Override // X.InterfaceC145136gY
    public final boolean Buz() {
        Iterator it = this.A00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((InterfaceC145136gY) it.next()).Buz();
        }
        return z;
    }

    @Override // X.InterfaceC145136gY
    public final boolean Cc5() {
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC145136gY) it.next()).Cc5()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void DOJ(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DOJ(i);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DPQ() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DPQ();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DPR() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DPR();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DWn() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DWn();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void DhB() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).DhB();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Djr(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Djr(i);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Djs(int i, int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Djs(i, i2);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dju(int i, int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Dju(i, i2);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Djv() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Djv();
        }
    }

    @Override // X.InterfaceC145136gY
    public final boolean DrR() {
        Iterator it = this.A00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((InterfaceC145136gY) it.next()).DrR();
        }
        return z;
    }

    @Override // X.InterfaceC145136gY
    public final boolean Dra() {
        Iterator it = this.A00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((InterfaceC145136gY) it.next()).Dra();
        }
        return z;
    }

    @Override // X.InterfaceC145136gY
    public final boolean DsD() {
        Iterator it = this.A00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((InterfaceC145136gY) it.next()).DsD();
        }
        return z;
    }

    @Override // X.InterfaceC145136gY
    public final void Dyy() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Dyy();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dz0() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Dz0();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dz7() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).Dz7();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroy() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).onDestroy();
        }
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC145136gY) it.next()).onDestroyView();
        }
    }
}
