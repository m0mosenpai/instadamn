package X;

import com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100474fB implements InterfaceC100484fC {
    public final AtomicInteger A00;
    public final InterfaceC19390xP A01;
    public final C05A A02;
    public final InterfaceC19630xq A03;

    public C100474fB(InterfaceC19630xq interfaceC19630xq) {
        C14360o3.A0B(interfaceC19630xq, 1);
        this.A03 = interfaceC19630xq;
        C100494fD c100494fD = C100494fD.A00;
        this.A00 = new AtomicInteger(-1);
        this.A02 = C10E.A00(c100494fD);
        this.A01 = new AnonymousClass058(new C9DG(this, (InterfaceC23621Ds) null, 3));
        interfaceC19630xq.EDW(new InterfaceC19620xp() { // from class: X.4fF
            @Override // X.InterfaceC19620xp
            public final void onChanged(InterfaceC19630xq interfaceC19630xq2, String str) {
                C100474fB.A00(C100474fB.this);
            }
        });
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BP4(final String str, final long j) {
        C14360o3.A0B(str, 0);
        final InterfaceC19390xP interfaceC19390xP = this.A01;
        return new InterfaceC19390xP() { // from class: X.4fG
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = interfaceC19390xP.collect(new AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2(str, interfaceC19960yQ, j), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP C2m(String str, String str2) {
        C14360o3.A0B(str, 0);
        return new M9R(str, str2, this.A01);
    }

    public static final C100534fI A00(C100474fB c100474fB) {
        Object value;
        C100534fI c100534fI;
        C05A c05a = c100474fB.A02;
        do {
            value = c05a.getValue();
            Map all = c100474fB.A03.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : all.entrySet()) {
                if (entry.getKey() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c100534fI = new C100534fI(linkedHashMap, c100474fB.A00.incrementAndGet());
        } while (!c05a.AIi(value, c100534fI));
        C14360o3.A0C(c100534fI, "null cannot be cast to non-null type com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper.Data");
        return c100534fI;
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP AJg(String str) {
        return new M9Q(this.A01);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC105054oL ARC() {
        final InterfaceC19610xo ARD = this.A03.ARD();
        return new InterfaceC105054oL(ARD) { // from class: X.4oK
            public final InterfaceC19610xo A00;

            {
                C14360o3.A0B(ARD, 1);
                this.A00 = ARD;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL E7J(String str, String str2) {
                C14360o3.A0B(str2, 1);
                this.A00.E7K(str, str2);
                return this;
            }

            @Override // X.InterfaceC105054oL
            public final Object ABt(InterfaceC23621Ds interfaceC23621Ds) {
                this.A00.apply();
                return C0eB.A00;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL AHV() {
                this.A00.AHW();
                return this;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC50122Sb AIX() {
                Object c09540e5;
                try {
                    c09540e5 = Boolean.valueOf(this.A00.commit());
                } catch (Throwable th) {
                    c09540e5 = new C09540e5(th);
                }
                C09550e6 c09550e6 = new C09550e6(c09540e5);
                C73163Pr c73163Pr = new C73163Pr();
                c73163Pr.A0L(c09550e6);
                return c73163Pr;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL E76(String str, boolean z) {
                this.A00.E77(str, z);
                return this;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL E7C(String str, int i) {
                this.A00.E7D(str, i);
                return this;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL E7F(String str, long j) {
                this.A00.E7G(str, j);
                return this;
            }

            @Override // X.InterfaceC105054oL
            public final InterfaceC105054oL EEi(String str) {
                this.A00.EEj(str);
                return this;
            }
        };
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Aaz() {
        return this.A01;
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Ah9(String str, boolean z) {
        return new PVE(str, this.A01, z);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BIg(String str, int i) {
        return new PVC(str, this.A01);
    }
}
