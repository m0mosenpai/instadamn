package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ESZ extends C1P1 {
    public final /* synthetic */ AnonymousClass971 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public ESZ(AnonymousClass971 anonymousClass971, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = anonymousClass971;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-506027758);
        EDO edo = (EDO) obj;
        int A0N = AbstractC167017dG.A0N(edo, 82257522);
        AnonymousClass970 anonymousClass970 = this.A00.A04;
        Iterator it = edo.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            E6S e6s = (E6S) it.next();
            if (C14360o3.A0K(e6s.A05, anonymousClass970.A00.getString(2131968824))) {
                Iterator it2 = e6s.A06.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    E6O e6o = (E6O) it2.next();
                    if (C14360o3.A0K(e6o.A01, "likes")) {
                        if (e6o.A00 != null && (!r0.booleanValue())) {
                            this.A01.invoke();
                        }
                    }
                }
            }
        }
        C0f9.A0A(-420657279, A0N);
        C0f9.A0A(-1471157005, A03);
    }
}
