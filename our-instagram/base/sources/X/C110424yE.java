package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110424yE implements InterfaceC38381qS {
    public final InterfaceC110404yC A00;
    public final String A01;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r5.length() == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C110434yF A00(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L9
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            r3 = 0
            if (r0 != 0) goto L2d
            java.util.List r0 = r4.A01()
            java.util.Iterator r2 = r0.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4yF r0 = (X.C110434yF) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 == 0) goto L15
            r3 = r1
        L2b:
            X.4yF r3 = (X.C110434yF) r3
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110424yE.A00(java.lang.String):X.4yF");
    }

    public final List A01() {
        List list = ((C110394yB) this.A00).A07;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C110434yF((InterfaceC110384yA) it.next()));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    public final boolean A02() {
        String str;
        C110434yF A00 = A00(C3ZF.A04.A00);
        if (A00 == null) {
            A00 = A00(C3ZF.A06.A00);
        }
        C110434yF A002 = A00(C3ZF.A06.A00);
        if (A002 != null && C14360o3.A0K(A00, A002) && (str = A002.A04) != null && str.length() != 0) {
            if (!(!A002.A06.isEmpty())) {
                String str2 = A002.A00;
                if (str2 != null && str2.length() != 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0O;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return ((C110394yB) this.A00).A02;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        InterfaceC39571se interfaceC39571se = ((C110394yB) this.A00).A00;
        if (interfaceC39571se != null) {
            return interfaceC39571se.Eyq();
        }
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return ((C110394yB) this.A00).A06;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return ((C110394yB) this.A00).A03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            C14360o3.A0B(obj.getClass(), 1);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return ((C110394yB) this.A00).A06;
    }

    public final int hashCode() {
        String str = ((C110394yB) this.A00).A06;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public C110424yE(InterfaceC110404yC interfaceC110404yC) {
        this.A00 = interfaceC110404yC;
        this.A01 = ((C110394yB) interfaceC110404yC).A04;
    }
}
