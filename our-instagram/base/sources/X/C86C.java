package X;

import java.util.Map;

/* renamed from: X.86C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86C implements AnonymousClass866 {
    public final C1810981l A00;
    public final Map A01;

    @Override // X.AnonymousClass866
    public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
        AbstractC191288dX ANN;
        C14360o3.A0B(c85d, 0);
        C14360o3.A0B(c9cb, 1);
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 == null || (ANN = anonymousClass866.ANN(c9cb, c85d)) == null) {
            return new C9KP(AbstractC191248dT.A01(c9cb, c85d), null);
        }
        return ANN;
    }

    @Override // X.AnonymousClass866
    public final boolean Akz() {
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 != null) {
            return anonymousClass866.Akz();
        }
        return false;
    }

    @Override // X.AnonymousClass866
    public final Integer B0k() {
        Integer B0k;
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 != null && (B0k = anonymousClass866.B0k()) != null) {
            return B0k;
        }
        return C05F.A01;
    }

    @Override // X.AnonymousClass866
    public final boolean Bv8() {
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 != null) {
            return anonymousClass866.Bv8();
        }
        return true;
    }

    @Override // X.AnonymousClass866
    public final boolean Bvf() {
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 != null) {
            return anonymousClass866.Bvf();
        }
        return true;
    }

    @Override // X.AnonymousClass866
    public final boolean Bvp() {
        AnonymousClass866 anonymousClass866 = (AnonymousClass866) this.A01.get(this.A00.A08.A00);
        if (anonymousClass866 != null) {
            return anonymousClass866.Bvp();
        }
        return false;
    }

    public C86C(C1810981l c1810981l, Map map) {
        this.A00 = c1810981l;
        this.A01 = map;
    }

    @Override // X.AnonymousClass866
    public final boolean Bv5() {
        return !Bv8();
    }
}
