package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.19J, reason: invalid class name */
/* loaded from: classes.dex */
public class C19J {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C19J.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C19J.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(C19J.class, Object.class, "_removedRef$volatile");
    public volatile /* synthetic */ Object _next$volatile = this;
    public volatile /* synthetic */ Object _prev$volatile = this;
    public volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        if (X.C1E0.A00(r4, r0, ((X.C27301Ue) r2).A00, r3) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19J A00(X.C19J r8) {
        /*
            r7 = 0
        L1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = X.C19J.A01
            java.lang.Object r5 = r6.get(r8)
            X.19J r5 = (X.C19J) r5
            r0 = r5
        La:
            r4 = r7
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C19J.A00
            java.lang.Object r2 = r3.get(r0)
            if (r2 != r8) goto L1c
            if (r5 == r0) goto L4d
            boolean r1 = X.C1E0.A00(r8, r5, r0, r6)
            if (r1 != 0) goto L4d
            goto L1
        L1c:
            boolean r1 = r8.A04()
            if (r1 == 0) goto L23
            return r7
        L23:
            if (r2 == r7) goto L4d
            boolean r1 = r2 instanceof X.AbstractC23691Dz
            if (r1 == 0) goto L2f
            X.1Dz r2 = (X.AbstractC23691Dz) r2
            r2.A00(r0)
            goto L1
        L2f:
            boolean r1 = r2 instanceof X.C27301Ue
            if (r1 == 0) goto L48
            if (r4 == 0) goto L41
            X.1Ue r2 = (X.C27301Ue) r2
            X.19J r1 = r2.A00
            boolean r0 = X.C1E0.A00(r4, r0, r1, r3)
            if (r0 == 0) goto L1
            r0 = r4
            goto La
        L41:
            java.lang.Object r0 = r6.get(r0)
            X.19J r0 = (X.C19J) r0
            goto Lb
        L48:
            X.19J r2 = (X.C19J) r2
            r4 = r0
            r0 = r2
            goto Lb
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19J.A00(X.19J):X.19J");
    }

    public static final void A01(C19J c19j, C19J c19j2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        do {
            obj = atomicReferenceFieldUpdater.get(c19j2);
            if (c19j.A02() != c19j2) {
                return;
            }
        } while (!C1E0.A00(c19j2, obj, c19j, atomicReferenceFieldUpdater));
        if (c19j.A04()) {
            A00(c19j2);
        }
    }

    public final Object A02() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC23691Dz)) {
                return obj;
            }
            ((AbstractC23691Dz) obj).A00(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new C01A(this) { // from class: X.Dfx
            @Override // X.InterfaceC016806n
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        });
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final C19J A03() {
        C27301Ue c27301Ue;
        C19J c19j;
        Object A022 = A02();
        if (!(A022 instanceof C27301Ue) || (c27301Ue = (C27301Ue) A022) == null || (c19j = c27301Ue.A00) == null) {
            C14360o3.A0C(A022, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (C19J) A022;
        }
        return c19j;
    }

    public boolean A04() {
        return A02() instanceof C27301Ue;
    }
}
