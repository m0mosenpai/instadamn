package X;

/* renamed from: X.4Tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95964Tf implements C0SW, InterfaceC05750Sb {
    public static final C95964Tf A02 = new C95964Tf();
    public volatile long A01 = 1;
    public final ThreadLocal A00 = new ThreadLocal() { // from class: X.4Tg
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return 79L;
        }
    };

    @Override // X.InterfaceC05750Sb
    public final boolean AFa(C0SJ c0sj, int i, int i2) {
        long j;
        long BP6 = c0sj.BP6(79L, 131073, 1);
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (BP6 == j) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC05750Sb
    public final void AVG(AbstractC10380h5 abstractC10380h5, C0SJ c0sj, int i, int i2) {
        long j;
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (j == 79) {
            if (c0sj != null) {
                j = c0sj.BP6(79L, 131073, 1);
                if (j == 79) {
                    return;
                }
            } else {
                return;
            }
        }
        AbstractC10380h5.A00(abstractC10380h5, Long.valueOf(j), 131073);
    }

    @Override // X.C0SW
    public final Integer CAQ() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC05750Sb
    public final boolean Eic(int i, int i2) {
        if (this.A01 == 79) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC05750Sb
    public final boolean Eid(C0SJ c0sj, int i, int i2) {
        long j;
        Number number = (Number) this.A00.get();
        if (number != null) {
            j = number.longValue();
        } else {
            j = 79;
        }
        if (j != 79 || (c0sj != null && c0sj.BP6(79L, 131073, 1) != 79)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC05750Sb
    public final void AVF(AbstractC10380h5 abstractC10380h5, int i, int i2) {
        AbstractC10380h5.A00(abstractC10380h5, Long.valueOf(this.A01), 131073);
    }
}
