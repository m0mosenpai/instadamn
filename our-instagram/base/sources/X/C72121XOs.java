package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.XOs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72121XOs implements XP9 {
    public final List A00;

    @Override // X.XP9
    public final void ClC(int i, Integer num) {
        C14360o3.A0B(num, 1);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).ClC(i, num);
        }
    }

    @Override // X.XP9
    public final void ClD(Integer num, Map map, int i) {
        C14360o3.A0B(num, 1);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).ClD(num, map, i);
        }
    }

    @Override // X.XP9
    public final void ClE(int i, Integer num) {
        C14360o3.A0B(num, 1);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).ClE(i, num);
        }
    }

    @Override // X.XP9
    public final void CxU(String str, int i) {
        C14360o3.A0B(str, 0);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).CxU(str, i);
        }
    }

    @Override // X.XP9
    public final void DnK(ImmutableMap immutableMap, Integer num, String str) {
        C14360o3.A0B(num, 0);
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DnK(immutableMap, num, str);
        }
    }

    public static Iterator A00(C72121XOs c72121XOs) {
        return c72121XOs.A00.iterator();
    }

    public C72121XOs(List list) {
        this.A00 = list;
    }

    @Override // X.XP9
    public final void Cuv(String str) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).Cuv(str);
        }
    }

    @Override // X.XP9
    public final void CxS(Throwable th) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).CxS(th);
        }
    }

    @Override // X.XP9
    public final void CxT() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).CxT();
        }
    }

    @Override // X.XP9
    public final void DBB(Throwable th) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DBB(th);
        }
    }

    @Override // X.XP9
    public final void DBC() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DBC();
        }
    }

    @Override // X.XP9
    public final void DBD(String str, int i) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DBD(str, i);
        }
    }

    @Override // X.XP9
    public final void DXj(boolean z) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DXj(z);
        }
    }

    @Override // X.XP9
    public final void DaO(Throwable th) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DaO(th);
        }
    }

    @Override // X.XP9
    public final void DaP() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DaP();
        }
    }

    @Override // X.XP9
    public final void DaQ() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DaQ();
        }
    }

    @Override // X.XP9
    public final void Dfl() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).Dfl();
        }
    }

    @Override // X.XP9
    public final void Dfv(Throwable th) {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).Dfv(th);
        }
    }

    @Override // X.XP9
    public final void DgF() {
        Iterator A00 = A00(this);
        while (A00.hasNext()) {
            ((XP9) A00.next()).DgF();
        }
    }
}
