package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.6LV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LV<K, V> extends AbstractC17010st<K, V> implements InterfaceC137496Ku<K, V> {
    public static final C6LV A02 = new C6LV(C6LW.A04, 0);
    public final C6LW A00;
    public final int A01;

    public C6LV(C6LW c6lw, int i) {
        C14360o3.A0B(c6lw, 1);
        this.A00 = c6lw;
        this.A01 = i;
    }

    @Override // X.AbstractC17010st
    public final int A00() {
        return this.A01;
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C64930Ta6(this);
    }

    @Override // X.AbstractC17010st
    public final java.util.Set A02() {
        return new C64944TaK(this);
    }

    @Override // X.AbstractC17010st
    public final /* bridge */ /* synthetic */ java.util.Set A03() {
        return new C64945TaL(this);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final boolean containsKey(Object obj) {
        int i;
        C6LW c6lw = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c6lw.A0F(obj, i, 0);
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final boolean equals(Object obj) {
        C6LW c6lw;
        C6LW c6lw2;
        InterfaceC16620sF interfaceC16620sF;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() == map.size()) {
                if (map instanceof C6LT) {
                    c6lw = this.A00;
                    c6lw2 = ((C6LT) obj).A02.A00;
                    interfaceC16620sF = C65091TdO.A00;
                } else if (map instanceof C58476Pw2) {
                    c6lw = this.A00;
                    c6lw2 = ((C58476Pw2) obj).A03.A04;
                    interfaceC16620sF = C65092TdP.A00;
                } else if (map instanceof C6LV) {
                    c6lw = this.A00;
                    c6lw2 = ((C6LV) obj).A00;
                    interfaceC16620sF = C25134BAe.A00;
                } else if (map instanceof Pw1) {
                    c6lw = this.A00;
                    c6lw2 = ((Pw1) obj).A04;
                    interfaceC16620sF = C25135BAf.A00;
                } else {
                    return super.equals(obj);
                }
                return c6lw.A0G(interfaceC16620sF, c6lw2);
            }
        }
        return false;
    }

    @Override // X.AbstractC17010st, java.util.Map
    public final Object get(Object obj) {
        int i;
        C6LW c6lw = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c6lw.A09(i, obj, 0);
    }
}
