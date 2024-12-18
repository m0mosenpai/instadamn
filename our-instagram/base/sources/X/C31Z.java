package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.31Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31Z implements InterfaceC670931a {
    public final C31W A00;
    public final InterfaceC62242sP A01;
    public final boolean A02;

    @Override // X.InterfaceC670931a
    public final boolean CeG(Object obj, List list, int i) {
        boolean z;
        Object obj2;
        C14360o3.A0B(list, 0);
        if (obj == null) {
            return false;
        }
        if (i <= list.size() && i >= 0) {
            Object A0O = AbstractC001800i.A0O(list, i);
            InterfaceC62242sP interfaceC62242sP = this.A01;
            Integer Ai1 = interfaceC62242sP.Ai1(obj);
            if (Ai1 == null) {
                return true;
            }
            if (A0O != null) {
                Integer Ahy = interfaceC62242sP.Ahy(A0O);
                z = true;
                if (Ahy != null && Ai1.intValue() < Ahy.intValue()) {
                    z = false;
                }
            } else {
                z = true;
            }
            if (i == 0) {
                if (!z) {
                    return false;
                }
                obj2 = null;
            } else {
                obj2 = list.get(i - 1);
                if (obj2 != null) {
                    Integer Ahy2 = interfaceC62242sP.Ahy(obj2);
                    boolean z2 = true;
                    if (Ahy2 != null && Ai1.intValue() < Ahy2.intValue()) {
                        z2 = false;
                    }
                    if (!z || !z2) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (!CQh(A0O, obj2, obj)) {
                return false;
            }
            return true;
        }
        return this.A02;
    }

    @Override // X.InterfaceC670931a
    public final Collection Ahv() {
        return C16910sj.A00;
    }

    @Override // X.InterfaceC670931a
    public final boolean CQh(Object obj, Object obj2, Object obj3) {
        C31W c31w = this.A00;
        if (!(c31w instanceof C31X) && c31w.A00) {
            List A01 = c31w.A01(obj3);
            if (!C31W.A00(c31w, obj, A01) || !C31W.A00(c31w, obj2, A01)) {
                return false;
            }
        }
        return true;
    }

    public C31Z(C31W c31w, InterfaceC62242sP interfaceC62242sP, boolean z) {
        this.A01 = interfaceC62242sP;
        this.A02 = z;
        this.A00 = c31w;
    }
}
