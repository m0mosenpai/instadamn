package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189208Zp implements C8ME {
    public final C8NF A00;
    public final C8MK A01;
    public final C8MA A02;
    public final C8MB A03;
    public final ArrayList A04 = new ArrayList();
    public final List A05;

    @Override // X.C8ME
    public final void AKw(C8MK c8mk) {
        C14360o3.A0B(c8mk, 0);
        C8MK c8mk2 = this.A01;
        synchronized (c8mk2) {
            c8mk.A01 = c8mk2.A01;
            c8mk.A02 = c8mk2.A02;
            c8mk.A00 = c8mk2.A00;
            Integer num = c8mk2.A03;
            if (num != null) {
                c8mk.A03 = num;
            } else {
                C14360o3.A0F("swipeMode");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C8MG
    public final void DDY(Integer num, float f) {
        C14360o3.A0B(num, 0);
        C8NF c8nf = this.A00;
        if (c8nf != null) {
            C141796aw A00 = AbstractC141776au.A00(c8nf);
            C9D6 c9d6 = new C9D6(c8nf, num, null, f, 0);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d6, A00);
        }
    }

    @Override // X.C8MG
    public final void DTu(Integer num, float f) {
        C14360o3.A0B(num, 0);
        C8NF c8nf = this.A00;
        if (c8nf != null) {
            C141796aw A00 = AbstractC141776au.A00(c8nf);
            C9D6 c9d6 = new C9D6(c8nf, num, null, f, 1);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d6, A00);
        }
    }

    @Override // X.C8MF
    public final int AuP() {
        int i;
        C8MK c8mk = this.A01;
        synchronized (c8mk) {
            i = c8mk.A01;
        }
        return i;
    }

    @Override // X.C8ME
    public final void ESb(int i) {
        C8NF c8nf = this.A00;
        if (c8nf != null) {
            C141796aw A00 = AbstractC141776au.A00(c8nf);
            C206669Cx c206669Cx = new C206669Cx(c8nf, (InterfaceC23621Ds) null, i, 2);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206669Cx, A00);
        }
    }

    @Override // X.C8MG
    public final void onStart() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((InterfaceC185628Le) it.next()).DrX();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.8MK] */
    public C189208Zp(C8NF c8nf, C8MA c8ma, C8MB c8mb, List list) {
        this.A00 = c8nf;
        this.A02 = c8ma;
        this.A05 = list;
        this.A03 = c8mb;
        ?? obj = new Object();
        Integer num = C05F.A0N;
        C14360o3.A0B(num, 0);
        obj.A03 = num;
        this.A01 = obj;
        synchronized (obj) {
            if (c8nf != null) {
                C8NG c8ng = (C8NG) c8nf.A07.getValue();
                if (c8ng != null) {
                    obj.A01 = c8ng.A01;
                    obj.A02 = c8ng.A02;
                    obj.A00 = c8ng.A00;
                    Integer num2 = c8ng.A03;
                    C14360o3.A0B(num2, 0);
                    obj.A03 = num2;
                }
            }
        }
    }
}
