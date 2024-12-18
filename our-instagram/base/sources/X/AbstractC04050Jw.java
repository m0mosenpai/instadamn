package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04050Jw {
    public AbstractC04050Jw A00;
    public C04060Jx A01;
    public C0C2 A02;
    public boolean A03;
    public final AtomicInteger A05 = new AtomicInteger(0);
    public boolean A04 = false;

    public abstract void A07();

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A(int i);

    public final void A02() {
        int decrementAndGet = this.A05.decrementAndGet();
        if (decrementAndGet != 1) {
            if (decrementAndGet >= 0) {
                AbstractC04050Jw abstractC04050Jw = this.A00;
                if (abstractC04050Jw == null) {
                    A05();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Trying to release, when added to ");
                sb.append(abstractC04050Jw);
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(AnonymousClass001.A0O("release() has been called with refCount < 0. Ref count: ", decrementAndGet));
        }
    }

    public final void A03() {
        if (!this.A04) {
            AbstractC04050Jw abstractC04050Jw = this.A00;
            if (abstractC04050Jw == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Already added to ");
            sb.append(abstractC04050Jw);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Attempting to re-attach a detached ParamsCollection");
    }

    public final void A04() {
        int decrementAndGet = this.A05.decrementAndGet();
        if (decrementAndGet == 1) {
            this.A04 = true;
            this.A00 = null;
        } else {
            if (decrementAndGet >= 0) {
                A05();
                return;
            }
            throw new IllegalStateException(AnonymousClass001.A0O("releaseFromParent() has been called with refCount < 0. Ref count: ", decrementAndGet));
        }
    }

    public final void A05() {
        if (this.A05.get() == 0) {
            A09();
            if (this.A01 != null) {
                A0A(32);
            }
            A07();
            this.A03 = false;
            this.A04 = false;
            this.A02 = null;
            this.A00 = null;
            if (this.A01 != null) {
                A08();
                return;
            }
            return;
        }
        throw new IllegalStateException("Releasing object with non-zero refCount.");
    }

    public final void A06(C04060Jx c04060Jx) {
        int incrementAndGet = this.A05.incrementAndGet();
        if (incrementAndGet == 1) {
            this.A01 = c04060Jx;
            if (!this.A03) {
                this.A03 = true;
                return;
            }
            throw new IllegalStateException("Internal bug, expected object to be immutable");
        }
        throw new IllegalStateException(AnonymousClass001.A0O("Acquired object with non-zero initial refCount current = ", incrementAndGet));
    }
}
