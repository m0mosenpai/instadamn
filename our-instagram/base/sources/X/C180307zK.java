package X;

import java.util.HashMap;

/* renamed from: X.7zK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180307zK {
    public InterfaceC180227zC A00;
    public final C178847ww A01;
    public final C178907x2 A02;
    public final C180317zL A03;
    public final HashMap A04;

    public C180307zK(C178847ww c178847ww, C178907x2 c178907x2) {
        C180317zL c180317zL;
        C14360o3.A0B(c178907x2, 1);
        this.A02 = c178907x2;
        this.A01 = c178847ww;
        this.A04 = new HashMap();
        if (A01()) {
            C178847ww c178847ww2 = this.A01;
            c180317zL = new C180317zL(c178847ww2);
            Object obj = c178847ww2.A00.get(C178847ww.A08);
            c180317zL.A01 = ((Boolean) (obj != null ? obj : false)).booleanValue();
        } else {
            c180317zL = null;
        }
        this.A03 = c180317zL;
    }

    public final boolean A00() {
        C178847ww c178847ww = this.A01;
        Object obj = false;
        Object obj2 = c178847ww.A00.get(C178847ww.A0C);
        if (obj2 != null) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final boolean A01() {
        C178847ww c178847ww = this.A01;
        Object obj = false;
        Object obj2 = c178847ww.A00.get(C178847ww.A0D);
        if (obj2 != null) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final boolean A02() {
        if (!A00()) {
            return false;
        }
        C178847ww c178847ww = this.A01;
        Object obj = false;
        Object obj2 = c178847ww.A00.get(C178847ww.A0E);
        if (obj2 != null) {
            obj = obj2;
        }
        if (!((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }
}
