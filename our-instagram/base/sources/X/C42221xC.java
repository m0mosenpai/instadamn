package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42221xC {
    public final AbstractC42051wv A00;

    public static C42221xC A00() {
        return new C42221xC(C137776Lz.A00);
    }

    public static C42221xC A01(YO2 yo2, C42221xC c42221xC, C42221xC c42221xC2) {
        AbstractC42051wv abstractC42051wv = c42221xC.A00;
        AbstractC42051wv abstractC42051wv2 = c42221xC2.A00;
        C72091XNl c72091XNl = new C72091XNl(yo2);
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        return new C42221xC(AbstractC42051wv.A00(new XNY(c72091XNl), new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2}, AbstractC137366Kh.A00));
    }

    public static C42221xC A02(YO2 yo2, C42221xC c42221xC, C42221xC c42221xC2) {
        AbstractC42051wv abstractC42051wv = c42221xC.A00;
        AbstractC42051wv abstractC42051wv2 = c42221xC2.A00;
        C72091XNl c72091XNl = new C72091XNl(yo2);
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        XNY xny = new XNY(c72091XNl);
        int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A00(i, "bufferSize");
        return new C42221xC(new C132685yr(xny, null, new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2}, i));
    }

    public static C42221xC A03(MOI moi, C42221xC c42221xC, C42221xC c42221xC2, C42221xC c42221xC3) {
        AbstractC42051wv abstractC42051wv = c42221xC.A00;
        AbstractC42051wv abstractC42051wv2 = c42221xC2.A00;
        AbstractC42051wv abstractC42051wv3 = c42221xC3.A00;
        C43903JbE c43903JbE = new C43903JbE(moi);
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        AbstractC42141x4.A01(abstractC42051wv3, "source3 is null");
        return new C42221xC(AbstractC42051wv.A00(new JRH(c43903JbE), new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2, abstractC42051wv3}, AbstractC137366Kh.A00));
    }

    public static C42221xC A04(MOJ moj, C42221xC c42221xC, C42221xC c42221xC2, C42221xC c42221xC3, C42221xC c42221xC4) {
        AbstractC42051wv abstractC42051wv = c42221xC.A00;
        AbstractC42051wv abstractC42051wv2 = c42221xC2.A00;
        AbstractC42051wv abstractC42051wv3 = c42221xC3.A00;
        AbstractC42051wv abstractC42051wv4 = c42221xC4.A00;
        C43948Jbx c43948Jbx = new C43948Jbx(moj);
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        AbstractC42141x4.A01(abstractC42051wv3, "source3 is null");
        AbstractC42141x4.A01(abstractC42051wv4, "source4 is null");
        return new C42221xC(AbstractC42051wv.A00(new JSQ(c43948Jbx), new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2, abstractC42051wv3, abstractC42051wv4}, AbstractC137366Kh.A00));
    }

    public static C42221xC A05(C6D2 c6d2, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new C124985l4(((C42221xC) it.next()).A00));
        }
        C132675yq c132675yq = new C132675yq(c6d2);
        int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A00(i, "bufferSize");
        return new C42221xC(new C72090XNk(c132675yq, arrayList, null, i << 1));
    }

    public static C42221xC A06(final InterfaceC1345866i interfaceC1345866i) {
        return new C42221xC(new C1346166l(new InterfaceC1346066k() { // from class: X.69n
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [X.66r, java.lang.Object] */
            @Override // X.InterfaceC1346066k
            public final void EpE(InterfaceC1346666q interfaceC1346666q) {
                InterfaceC1345866i interfaceC1345866i2 = InterfaceC1345866i.this;
                ?? obj = new Object();
                obj.A00 = interfaceC1346666q;
                interfaceC1345866i2.EpD(obj);
            }
        }));
    }

    public static C42221xC A07(final InterfaceC1345866i interfaceC1345866i, C5Fn c5Fn) {
        C1346166l c1346166l = new C1346166l(new InterfaceC1346066k() { // from class: X.66j
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [X.66r, java.lang.Object] */
            @Override // X.InterfaceC1346066k
            public final void EpE(InterfaceC1346666q interfaceC1346666q) {
                InterfaceC1345866i interfaceC1345866i2 = InterfaceC1345866i.this;
                ?? obj = new Object();
                obj.A00 = interfaceC1346666q;
                interfaceC1345866i2.EpD(obj);
            }
        });
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        return new C42221xC(new C1346266m(c1346166l, abstractC150996r0));
    }

    public static C42221xC A09(Object obj) {
        AbstractC42141x4.A01(obj, "The item is null");
        return new C42221xC(new C6AD(obj));
    }

    public final C42221xC A0A() {
        AbstractC42051wv abstractC42051wv = this.A00;
        C6D7 c6d7 = new C6D7();
        AtomicReference atomicReference = new AtomicReference();
        return new C42221xC(new C6DJ(C6DB.A01, new C6D9(new C6D8(c6d7, atomicReference), abstractC42051wv, c6d7, atomicReference)));
    }

    public final C42221xC A0B() {
        AbstractC42051wv abstractC42051wv = this.A00;
        C6D7 c6d7 = new C6D7();
        AtomicReference atomicReference = new AtomicReference();
        C6D9 c6d9 = new C6D9(new C6D8(c6d7, atomicReference), abstractC42051wv, c6d7, atomicReference);
        AbstractC150996r0 abstractC150996r0 = AbstractC44053Jde.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        return new C42221xC(new C72092XNm(abstractC150996r0, c6d9));
    }

    public final C42221xC A0C() {
        AbstractC42051wv abstractC42051wv = this.A00;
        C6D4 c6d4 = C6DB.A02;
        AbstractC42141x4.A01(c6d4, "keySelector is null");
        return new C42221xC(new C72085XNe(abstractC42051wv, AbstractC42141x4.A00, c6d4));
    }

    public final C42221xC A0D() {
        final AbstractC42051wv abstractC42051wv = this.A00;
        final InterfaceC42111x1 interfaceC42111x1 = C6DB.A03;
        AbstractC42141x4.A01(interfaceC42111x1, "predicate is null");
        return new C42221xC(new C6D6(abstractC42051wv, interfaceC42111x1) { // from class: X.607
            public final InterfaceC42111x1 A00;

            @Override // X.AbstractC42051wv
            public final void A02(InterfaceC42071wx interfaceC42071wx) {
                super.A00.EpF(new AnonymousClass609(interfaceC42071wx, this.A00));
            }

            {
                this.A00 = interfaceC42111x1;
            }
        });
    }

    public final C42221xC A0E() {
        AbstractC42051wv abstractC42051wv = this.A00;
        AtomicReference atomicReference = new AtomicReference();
        return new C42221xC(new C72092XNm(AbstractC142866cm.A04, new C72100XNu(new C72101XNv(atomicReference), abstractC42051wv, atomicReference)));
    }

    public final C42221xC A0F() {
        final AbstractC42051wv abstractC42051wv = this.A00;
        return new C42221xC(new C6D6(abstractC42051wv) { // from class: X.9AM
            public final long A00 = 1;

            @Override // X.AbstractC42051wv
            public final void A02(InterfaceC42071wx interfaceC42071wx) {
                super.A00.EpF(new C9AO(interfaceC42071wx, this.A00));
            }
        });
    }

    public final C42221xC A0G() {
        return new C42221xC(new C124985l4(this.A00));
    }

    public final C42221xC A0H(final MN1 mn1) {
        return new C42221xC(new C72085XNe(this.A00, new InterfaceC42161x6() { // from class: X.JRI
            @Override // X.InterfaceC42161x6
            public final boolean Eq1(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (3 - ((C43923JbY) MN1.this).A00 != 0) {
                    AbstractC167017dG.A1N(list, list2);
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Object obj3 = list.get(i);
                        Object obj4 = list2.get(i);
                        C14360o3.A0B(obj4, 0);
                        if (!obj3.equals(obj4)) {
                            return false;
                        }
                    }
                } else {
                    AbstractC167017dG.A1N(list, list2);
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj5 = list.get(i2);
                        Object obj6 = list2.get(i2);
                        C14360o3.A0B(obj6, 0);
                        if (!obj5.equals(obj6)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }, C6DB.A02));
    }

    public final C42221xC A0I(final C6D2 c6d2) {
        AbstractC42051wv c72336XbY;
        InterfaceC42061ww interfaceC42061ww = this.A00;
        C6D4 c6d4 = new C6D4() { // from class: X.LzA
            @Override // X.C6D4
            public final Object apply(Object obj) {
                return ((C42221xC) C6D2.this.apply(obj)).A00;
            }
        };
        if (interfaceC42061ww instanceof InterfaceCallableC206009Ad) {
            Object call = ((InterfaceCallableC206009Ad) interfaceC42061ww).call();
            if (call == null) {
                c72336XbY = C137776Lz.A00;
            } else {
                c72336XbY = new C72329XbR(c6d4, call);
            }
        } else {
            c72336XbY = new C72336XbY(interfaceC42061ww, c6d4, C05F.A00, 2);
        }
        return new C42221xC(c72336XbY);
    }

    public final C42221xC A0J(final C6D2 c6d2) {
        AbstractC42051wv abstractC42051wv;
        final InterfaceC42061ww interfaceC42061ww = this.A00;
        final C6D4 c6d4 = new C6D4() { // from class: X.6Iy
            @Override // X.C6D4
            public final Object apply(Object obj) {
                return ((C42221xC) C6D2.this.apply(obj)).A00;
            }
        };
        final int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A00(i, "bufferSize");
        if (interfaceC42061ww instanceof InterfaceCallableC206009Ad) {
            Object call = ((InterfaceCallableC206009Ad) interfaceC42061ww).call();
            if (call == null) {
                abstractC42051wv = C137776Lz.A00;
            } else {
                abstractC42051wv = new C72329XbR(c6d4, call);
            }
        } else {
            abstractC42051wv = new C6D6(interfaceC42061ww, c6d4, i) { // from class: X.6Iz
                public final int A00;
                public final int A01 = Integer.MAX_VALUE;
                public final C6D4 A02;

                @Override // X.AbstractC42051wv
                public final void A02(InterfaceC42071wx interfaceC42071wx) {
                    InterfaceC42061ww interfaceC42061ww2 = super.A00;
                    C6D4 c6d42 = this.A02;
                    if (!C6JA.A00(interfaceC42061ww2, interfaceC42071wx, c6d42)) {
                        interfaceC42061ww2.EpF(new C6JB(interfaceC42071wx, c6d42, this.A01, this.A00));
                    }
                }

                {
                    this.A02 = c6d4;
                    this.A00 = i;
                }
            };
        }
        return new C42221xC(abstractC42051wv);
    }

    public final C42221xC A0K(final C6D2 c6d2) {
        final AbstractC42051wv abstractC42051wv = this.A00;
        final C6D4 c6d4 = new C6D4() { // from class: X.6D3
            @Override // X.C6D4
            public final Object apply(Object obj) {
                C6D2 c6d22 = C6D2.this;
                Object apply = c6d22.apply(obj);
                AbstractC42141x4.A01(apply, c6d22.toString());
                return apply;
            }
        };
        return new C42221xC(new C6D6(abstractC42051wv, c6d4) { // from class: X.6D5
            public final C6D4 A00;

            @Override // X.AbstractC42051wv
            public final void A02(final InterfaceC42071wx interfaceC42071wx) {
                InterfaceC42061ww interfaceC42061ww = super.A00;
                final C6D4 c6d42 = this.A00;
                interfaceC42061ww.EpF(new C6KR(interfaceC42071wx, c6d42) { // from class: X.6KQ
                    public final C6D4 A00;

                    @Override // X.InterfaceC42071wx
                    public final void DVo(Object obj) {
                        if (!this.A03) {
                            if (super.A00 != 0) {
                                this.A04.DVo(null);
                                return;
                            }
                            try {
                                Object apply = this.A00.apply(obj);
                                AbstractC42141x4.A01(apply, "The mapper function returned a null value.");
                                this.A04.DVo(apply);
                            } catch (Throwable th) {
                                A00(th);
                            }
                        }
                    }

                    @Override // X.InterfaceC136006Df
                    public final int EJ7(int i) {
                        InterfaceC135996De interfaceC135996De = this.A01;
                        if (interfaceC135996De != null && (i & 4) == 0) {
                            int EJ7 = interfaceC135996De.EJ7(i);
                            if (EJ7 != 0) {
                                super.A00 = EJ7;
                            }
                            return EJ7;
                        }
                        return 0;
                    }

                    @Override // X.InterfaceC136016Dg
                    public final Object poll() {
                        Object poll = this.A01.poll();
                        if (poll != null) {
                            Object apply = this.A00.apply(poll);
                            AbstractC42141x4.A01(apply, "The mapper function returned a null value.");
                            return apply;
                        }
                        return null;
                    }

                    {
                        this.A00 = c6d42;
                    }
                });
            }

            {
                this.A00 = c6d4;
            }
        });
    }

    public final C42221xC A0L(final C6D2 c6d2) {
        AbstractC42051wv abstractC42051wv;
        final InterfaceC42061ww interfaceC42061ww = this.A00;
        final C6D4 c6d4 = new C6D4() { // from class: X.6J1
            @Override // X.C6D4
            public final Object apply(Object obj) {
                return ((C42221xC) C6D2.this.apply(obj)).A00;
            }
        };
        final int i = AbstractC137366Kh.A00;
        AbstractC42141x4.A00(i, "bufferSize");
        if (interfaceC42061ww instanceof InterfaceCallableC206009Ad) {
            Object call = ((InterfaceCallableC206009Ad) interfaceC42061ww).call();
            if (call == null) {
                abstractC42051wv = C137776Lz.A00;
            } else {
                abstractC42051wv = new C72329XbR(c6d4, call);
            }
        } else {
            abstractC42051wv = new C6D6(interfaceC42061ww, c6d4, i) { // from class: X.6J2
                public final int A00;
                public final C6D4 A01;

                @Override // X.AbstractC42051wv
                public final void A02(InterfaceC42071wx interfaceC42071wx) {
                    InterfaceC42061ww interfaceC42061ww2 = super.A00;
                    C6D4 c6d42 = this.A01;
                    if (!C6JA.A00(interfaceC42061ww2, interfaceC42071wx, c6d42)) {
                        interfaceC42061ww2.EpF(new C6JF(interfaceC42071wx, c6d42, this.A00));
                    }
                }

                {
                    this.A01 = c6d4;
                    this.A00 = i;
                }
            };
        }
        return new C42221xC(abstractC42051wv);
    }

    public final C42221xC A0M(final C6J5 c6j5) {
        final AbstractC42051wv abstractC42051wv = this.A00;
        final InterfaceC42111x1 interfaceC42111x1 = new InterfaceC42111x1() { // from class: X.6J6
            @Override // X.InterfaceC42111x1
            public final boolean test(Object obj) {
                return C6J5.this.test(obj);
            }
        };
        return new C42221xC(new C6D6(abstractC42051wv, interfaceC42111x1) { // from class: X.6J7
            public final InterfaceC42111x1 A00;

            @Override // X.AbstractC42051wv
            public final void A02(final InterfaceC42071wx interfaceC42071wx) {
                InterfaceC42061ww interfaceC42061ww = super.A00;
                final InterfaceC42111x1 interfaceC42111x12 = this.A00;
                interfaceC42061ww.EpF(new C6KR(interfaceC42071wx, interfaceC42111x12) { // from class: X.6JE
                    public final InterfaceC42111x1 A00;

                    @Override // X.InterfaceC42071wx
                    public final void DVo(Object obj) {
                        if (super.A00 == 0) {
                            try {
                                if (this.A00.test(obj)) {
                                    this.A04.DVo(obj);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                A00(th);
                                return;
                            }
                        }
                        this.A04.DVo(null);
                    }

                    @Override // X.InterfaceC136006Df
                    public final int EJ7(int i) {
                        InterfaceC135996De interfaceC135996De = this.A01;
                        if (interfaceC135996De != null && (i & 4) == 0) {
                            int EJ7 = interfaceC135996De.EJ7(i);
                            if (EJ7 != 0) {
                                super.A00 = EJ7;
                            }
                            return EJ7;
                        }
                        return 0;
                    }

                    @Override // X.InterfaceC136016Dg
                    public final Object poll() {
                        Object poll;
                        do {
                            poll = this.A01.poll();
                            if (poll == null) {
                                break;
                            }
                        } while (!this.A00.test(poll));
                        return poll;
                    }

                    {
                        this.A00 = interfaceC42111x12;
                    }
                });
            }

            {
                this.A00 = interfaceC42111x1;
            }
        });
    }

    public final C42221xC A0N(C5Fn c5Fn) {
        AbstractC42051wv abstractC42051wv = this.A00;
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        C6D7 c6d7 = new C6D7();
        AtomicReference atomicReference = new AtomicReference();
        C6D9 c6d9 = new C6D9(new C6D8(c6d7, atomicReference), abstractC42051wv, c6d7, atomicReference);
        return new C42221xC(new C6DJ(C6DB.A01, new C137156Iu(c6d9.A01(abstractC150996r0), c6d9)));
    }

    public final C42221xC A0O(C5Fn c5Fn) {
        return new C42221xC(this.A00.A01(c5Fn.A00));
    }

    @Deprecated
    public final C42221xC A0P(C5Fn c5Fn) {
        AbstractC42051wv abstractC42051wv = this.A00;
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        return new C42221xC(new C1346266m(abstractC42051wv, abstractC150996r0));
    }

    public final C42221xC A0Q(C5Fn c5Fn, TimeUnit timeUnit, long j) {
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        AbstractC42051wv abstractC42051wv = this.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        return new C42221xC(new C72089XNj(abstractC42051wv, abstractC150996r0, timeUnit, j));
    }

    public final C42221xC A0R(final InterfaceC42241xE interfaceC42241xE) {
        AbstractC42051wv abstractC42051wv = this.A00;
        C6DH c6dh = new C6DH() { // from class: X.Lz9
            @Override // X.C6DH
            public final void accept(Object obj) {
                InterfaceC42241xE.this.accept(obj);
            }
        };
        C6DH c6dh2 = C6DB.A01;
        C6DF c6df = C6DB.A00;
        AbstractC42141x4.A01(c6dh2, "onError is null");
        AbstractC42141x4.A01(c6df, "onComplete is null");
        AbstractC42141x4.A01(c6df, "onAfterTerminate is null");
        return new C42221xC(new C72337XbZ(abstractC42051wv, c6df, c6df, c6dh, c6dh2));
    }

    public final C42221xC A0S(Object obj) {
        AbstractC42051wv abstractC42051wv = this.A00;
        AbstractC42141x4.A01(obj, "item is null");
        AbstractC42141x4.A01(obj, "The item is null");
        return new C42221xC(new C72336XbY(new C72328XbQ(new InterfaceC42061ww[]{new C6AD(obj), abstractC42051wv}), C6DB.A02, C05F.A01, AbstractC137366Kh.A00));
    }

    public final C42221xC A0T(final Runnable runnable) {
        AbstractC42051wv abstractC42051wv = this.A00;
        C6DF c6df = new C6DF() { // from class: X.YFu
            @Override // X.C6DF
            public final void run() {
                runnable.run();
            }
        };
        C6DH c6dh = C6DB.A01;
        C6DF c6df2 = C6DB.A00;
        AbstractC42141x4.A01(c6dh, "onNext is null");
        AbstractC42141x4.A01(c6dh, "onError is null");
        AbstractC42141x4.A01(c6df2, "onAfterTerminate is null");
        return new C42221xC(new C72337XbZ(abstractC42051wv, c6df, c6df2, c6dh, c6dh));
    }

    public final void A0U(final InterfaceC42561xk interfaceC42561xk) {
        this.A00.EpF(new InterfaceC42071wx() { // from class: X.1xm
            @Override // X.InterfaceC42071wx
            public final void DVo(Object obj) {
                interfaceC42561xk.DVo(obj);
            }

            @Override // X.InterfaceC42071wx
            public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
                interfaceC42561xk.Dpb(new C42631xr(interfaceC41801wU));
            }

            @Override // X.InterfaceC42071wx
            public final void onComplete() {
                interfaceC42561xk.onComplete();
            }

            @Override // X.InterfaceC42071wx
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Uncaught error for ");
                sb.append(interfaceC42561xk);
                throw new RuntimeException(sb.toString(), th);
            }
        });
    }

    public C42221xC(AbstractC42051wv abstractC42051wv) {
        this.A00 = abstractC42051wv;
    }

    public static C42221xC A08(Iterable iterable) {
        AbstractC42141x4.A01(iterable, "source is null");
        return new C42221xC(new XMd(iterable));
    }
}
