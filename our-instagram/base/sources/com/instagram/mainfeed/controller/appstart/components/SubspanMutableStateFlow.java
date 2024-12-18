package com.instagram.mainfeed.controller.appstart.components;

import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C14360o3;
import X.C1EM;
import X.C1IT;
import X.C1JX;
import X.InterfaceC23621Ds;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class SubspanMutableStateFlow implements C05A {
    public final AtomicReference A00;
    public final AtomicReference A01;
    public final C05A A02;

    public SubspanMutableStateFlow(SubspanMutableStateFlow subspanMutableStateFlow) {
        C14360o3.A0B(subspanMutableStateFlow, 1);
        AtomicReference atomicReference = new AtomicReference();
        this.A01 = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.A00 = atomicReference2;
        this.A02 = C10E.A00(subspanMutableStateFlow.A02.getValue());
        atomicReference.set(subspanMutableStateFlow.A01.get());
        atomicReference2.set(subspanMutableStateFlow.A00.get());
    }

    @Override // X.C05A
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void Egh(C1IT c1it) {
        Object value;
        AtomicReference atomicReference;
        C14360o3.A0B(c1it, 0);
        C05A c05a = this.A02;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, c1it));
        C1IT c1it2 = C1IT.A07;
        if (c1it == c1it2 && value != c1it2) {
            atomicReference = this.A01;
        } else if (c1it.A00 < 2 || this.A01.get() == null) {
            return;
        } else {
            atomicReference = this.A00;
        }
        C1EM.A00(null, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime())), atomicReference);
    }

    @Override // X.C05A
    public final /* bridge */ /* synthetic */ boolean AIi(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        return this.A02.AIi(obj, obj2);
    }

    @Override // X.InterfaceC06180Ui
    public final /* bridge */ /* synthetic */ boolean F8m(Object obj) {
        C14360o3.A0B(obj, 0);
        return this.A02.F8m(obj);
    }

    @Override // X.InterfaceC15070pN
    public final List Bn0() {
        return this.A02.Bn0();
    }

    @Override // X.InterfaceC06180Ui
    public final C0UO C3V() {
        return this.A02.C3V();
    }

    @Override // X.InterfaceC06180Ui
    public final void EJt() {
        this.A02.EJt();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC15070pN, X.InterfaceC19390xP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(X.InterfaceC19960yQ r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 40
            boolean r0 = X.PX9.A03(r7, r3)
            if (r0 == 0) goto L29
            r4 = r7
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L3f
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L29:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L31:
            X.AbstractC09560e7.A00(r3)
            X.05A r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r0 = r0.collect(r6, r4)
            if (r0 != r2) goto L42
            return r2
        L3f:
            X.AbstractC09560e7.A00(r3)
        L42:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow.collect(X.0yQ, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC06180Ui, X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object emit = this.A02.emit(obj, interfaceC23621Ds);
        if (emit != C1JX.A02) {
            return C0eB.A00;
        }
        return emit;
    }

    @Override // X.C05A, X.C0UO
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A02.getValue();
    }

    public SubspanMutableStateFlow(C1IT c1it) {
        this.A01 = new AtomicReference();
        this.A00 = new AtomicReference();
        this.A02 = new C008002u(c1it);
    }
}
