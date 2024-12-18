package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.19H, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19H extends C19I implements C19D, C19B {
    public AnonymousClass198 A00;

    @Override // X.C19B
    public final C27281Uc BNj() {
        return null;
    }

    @Override // X.C19B
    public final boolean isActive() {
        return true;
    }

    public final AnonymousClass198 A06() {
        AnonymousClass198 anonymousClass198 = this.A00;
        if (anonymousClass198 != null) {
            return anonymousClass198;
        }
        C14360o3.A0F("job");
        throw C00O.createAndThrow();
    }

    @Override // X.C19J
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[job@");
        sb.append(Integer.toHexString(System.identityHashCode(A06())));
        sb.append(']');
        return sb.toString();
    }

    @Override // X.C19D
    public final void dispose() {
        Object A0C;
        Object A02;
        C19J c19j;
        Object obj;
        AnonymousClass198 A06 = A06();
        do {
            A0C = A06.A0C();
            if (A0C instanceof C19H) {
                if (A0C == this) {
                } else {
                    return;
                }
            } else {
                if (!(A0C instanceof C19B) || ((C19B) A0C).BNj() == null) {
                    return;
                }
                do {
                    A02 = A02();
                    if ((A02 instanceof C27301Ue) || A02 == this) {
                        return;
                    }
                    C14360o3.A0C(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    c19j = (C19J) A02;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C19J.A02;
                    obj = atomicReferenceFieldUpdater.get(c19j);
                    if (obj == null) {
                        obj = new C27301Ue(c19j);
                        atomicReferenceFieldUpdater.set(c19j, obj);
                    }
                } while (!C1E0.A00(this, A02, obj, C19J.A00));
                C19J.A00(c19j);
                return;
            }
        } while (!C1E0.A00(A06, A0C, AnonymousClass199.A00, AnonymousClass198.A01));
    }
}
