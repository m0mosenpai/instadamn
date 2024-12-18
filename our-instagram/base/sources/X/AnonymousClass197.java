package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.197, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass197 extends AnonymousClass198 implements AnonymousClass195 {
    public final boolean A00;

    @Override // X.AnonymousClass198
    public final boolean A0R() {
        return true;
    }

    @Override // X.AnonymousClass198
    public final boolean A0Q() {
        return this.A00;
    }

    public AnonymousClass197(AnonymousClass195 anonymousClass195) {
        C19H c19h;
        this._state$volatile = AnonymousClass199.A00;
        A0P(anonymousClass195);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass198.A00;
        Object obj = (C19E) atomicReferenceFieldUpdater.get(this);
        if (obj instanceof C19F) {
            c19h = (C19H) obj;
        } else {
            c19h = null;
        }
        boolean z = false;
        while (true) {
            if (c19h == null) {
                break;
            }
            AnonymousClass198 A06 = c19h.A06();
            if (A06.A0Q()) {
                z = true;
                break;
            }
            Object obj2 = (C19E) atomicReferenceFieldUpdater.get(A06);
            if (!(obj2 instanceof C19F)) {
                break;
            } else {
                c19h = (C19H) obj2;
            }
        }
        this.A00 = z;
    }
}
