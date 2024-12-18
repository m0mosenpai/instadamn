package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.7y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179557y5 extends AbstractC178657wd implements InterfaceC179567y6 {
    public InterfaceC176367st A00;
    public HashMap A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final InterfaceC174727q7 A06;
    public final InterfaceC179577y7 A07;
    public final InterfaceC179227xY A08;
    public final boolean A09;
    public final C175677rh A0A;
    public final C175617rb A0B;
    public volatile InterfaceC179497xz A0C;
    public volatile InterfaceC175067qg A0D;

    public static synchronized void A01(C179557y5 c179557y5, Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        HashMap hashMap;
        boolean z3;
        C175727rm c175727rm;
        WeakReference weakReference;
        synchronized (c179557y5) {
            InterfaceC175067qg interfaceC175067qg = c179557y5.A0D;
            if (interfaceC175067qg != null && c179557y5.A05) {
                boolean z4 = c179557y5.A04;
                boolean z5 = c179557y5.A03;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = z4;
                }
                c179557y5.A04 = z;
                if (bool2 == null) {
                    z2 = z5;
                } else {
                    z2 = bool2.booleanValue();
                }
                c179557y5.A03 = z2;
                if (z != z4 || z2 != z5) {
                    HashMap hashMap2 = c179557y5.A01;
                    if (hashMap2 != null) {
                        hashMap = (HashMap) hashMap2.clone();
                    } else {
                        hashMap = new HashMap();
                    }
                    if (c179557y5.A03) {
                        C14360o3.A0B(hashMap, 0);
                        hashMap.put(AbstractC111324zv.A00(911), true);
                        hashMap.put(AbstractC111324zv.A00(909), true);
                        hashMap.put(AbstractC111324zv.A00(910), true);
                        hashMap.put(AbstractC111324zv.A00(912), true);
                    }
                    C176837tf c176837tf = new C176837tf();
                    C176807tc c176807tc = AbstractC176797tb.A0M;
                    if (!c179557y5.A04) {
                        z3 = false;
                        if (c179557y5.A03) {
                        }
                        c176837tf.A01(c176807tc, Boolean.valueOf(z3));
                        C176807tc c176807tc2 = AbstractC176797tb.A02;
                        hashMap.getClass();
                        c176837tf.A01(c176807tc2, hashMap);
                        interfaceC175067qg.Cpo(new C197088nd(c179557y5), c176837tf.A00());
                        if (c179557y5.A04 && !c179557y5.A03) {
                            c175727rm = c179557y5.A0A.A00;
                            WeakReference weakReference2 = c175727rm.A00;
                            if (weakReference2 != null) {
                                weakReference2.clear();
                                weakReference = null;
                            }
                        } else {
                            C175677rh c175677rh = c179557y5.A0A;
                            c175727rm = c175677rh.A00;
                            weakReference = new WeakReference(c175677rh);
                        }
                        c175727rm.A00 = weakReference;
                    }
                    z3 = true;
                    c176837tf.A01(c176807tc, Boolean.valueOf(z3));
                    C176807tc c176807tc22 = AbstractC176797tb.A02;
                    hashMap.getClass();
                    c176837tf.A01(c176807tc22, hashMap);
                    interfaceC175067qg.Cpo(new C197088nd(c179557y5), c176837tf.A00());
                    if (c179557y5.A04) {
                    }
                    C175677rh c175677rh2 = c179557y5.A0A;
                    c175727rm = c175677rh2.A00;
                    weakReference = new WeakReference(c175677rh2);
                    c175727rm.A00 = weakReference;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.C56D.A00(r1) < 223040000) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C179557y5 r2) {
        /*
            boolean r0 = r2.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AbstractC177217uH.A00 = r0
            X.7st r0 = r2.A00
            boolean r0 = r0.isARCoreSupported()
            if (r0 == 0) goto L24
            X.7vu r0 = r2.A00
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r2 = X.C56D.A00(r1)
            r1 = 223040000(0xd4b5200, float:6.265291E-31)
            r0 = 1
            if (r2 >= r1) goto L25
        L24:
            r0 = 0
        L25:
            X.AbstractC177217uH.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179557y5.A00(X.7y5):void");
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC179567y6.A00;
    }

    public C179557y5(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        boolean z;
        C175617rb c175617rb = new C175617rb(this);
        this.A0B = c175617rb;
        this.A08 = new InterfaceC179227xY() { // from class: X.7re
            @Override // X.InterfaceC179227xY
            public final void APM() {
                C179557y5 c179557y5 = C179557y5.this;
                synchronized (c179557y5) {
                    C179557y5.A01(c179557y5, false, null);
                }
            }

            @Override // X.InterfaceC179227xY
            public final void ARQ() {
                C179557y5 c179557y5 = C179557y5.this;
                synchronized (c179557y5) {
                    C179557y5.A01(c179557y5, true, null);
                }
            }

            @Override // X.InterfaceC179227xY
            public final EnumC179217xX Bmo() {
                return EnumC179217xX.A0C;
            }
        };
        this.A07 = new InterfaceC179577y7() { // from class: X.7rf
            @Override // X.InterfaceC179577y7
            public final void Ecb(InterfaceC179187xU interfaceC179187xU) {
            }

            @Override // X.InterfaceC179577y7
            public final void DfO(InterfaceC179247xa interfaceC179247xa) {
                if (interfaceC179247xa.CBM() == EnumC179217xX.A09) {
                    Ab9 ab9 = (Ab9) interfaceC179247xa;
                    C179557y5 c179557y5 = C179557y5.this;
                    synchronized (c179557y5) {
                        if (c179557y5.A05) {
                            c179557y5.A01 = ab9.A00;
                        }
                    }
                }
            }
        };
        this.A06 = new InterfaceC174727q7() { // from class: X.7rg
            @Override // X.InterfaceC174727q7
            public final void DWd(String str) {
            }

            @Override // X.InterfaceC174727q7
            public final void Dea(String str) {
            }

            @Override // X.InterfaceC174727q7
            public final void Do5() {
                C179557y5 c179557y5 = C179557y5.this;
                if (c179557y5.A02) {
                    boolean z2 = c179557y5.A03;
                    if (z2 || c179557y5.A04) {
                        boolean z3 = c179557y5.A04;
                        c179557y5.A04 = false;
                        c179557y5.A03 = false;
                        C179557y5.A01(c179557y5, Boolean.valueOf(z3), Boolean.valueOf(z2));
                    }
                }
            }
        };
        this.A0A = new C175677rh(c175617rb);
        Boolean bool = (Boolean) ((AbstractC178657wd) this).A00.AqG(AbstractC175737rn.A00);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.A09 = z;
    }
}
