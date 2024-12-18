package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.57P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57P implements AnonymousClass577 {
    public Throwable A00;
    public List A01;
    public List A02;
    public final C74983Yo A03;
    public final Object A04;
    public final InterfaceC16820sZ A05;

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 2);
        return interfaceC16620sF.invoke(obj, this);
    }

    @Override // X.AnonymousClass577
    public final Object FE9(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC16820sZ interfaceC16820sZ;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        C62S c62s = new C62S(c24891Jo, interfaceC16660sJ);
        Object obj = this.A04;
        synchronized (obj) {
            Throwable th = this.A00;
            if (th != null) {
                c24891Jo.resumeWith(new C09540e5(th));
            } else {
                boolean z = false;
                if (!this.A01.isEmpty()) {
                    z = true;
                }
                this.A01.add(c62s);
                if (!z) {
                    this.A03.set(1);
                }
                boolean z2 = !z;
                c24891Jo.CPA(new C9F3(4, this, c62s));
                if (z2 && (interfaceC16820sZ = this.A05) != null) {
                    try {
                        interfaceC16820sZ.invoke();
                    } catch (Throwable th2) {
                        synchronized (obj) {
                            if (this.A00 == null) {
                                this.A00 = th2;
                                List list = this.A01;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((C62S) list.get(i)).A00.resumeWith(new C09540e5(th2));
                                }
                                this.A01.clear();
                                this.A03.set(0);
                            }
                        }
                    }
                }
            }
        }
        return c24891Jo.A0E();
    }

    @Override // X.C12V
    public final /* synthetic */ InterfaceC212412b getKey() {
        return AnonymousClass577.A00;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.atomic.AtomicInteger, X.3Yo] */
    public C57P(InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = interfaceC16820sZ;
        this.A04 = new Object();
        this.A01 = new ArrayList();
        this.A02 = new ArrayList();
        this.A03 = new AtomicInteger(0);
    }

    @Override // X.C12V, X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A00(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        return AnonymousClass190.A01(this, interfaceC212412b);
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        return AnonymousClass190.A02(this, c12w);
    }

    public C57P() {
        this(null);
    }
}
