package X;

/* renamed from: X.TId, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64527TId implements Comparable {
    public final int A02() {
        if (this instanceof RMN) {
            return 3;
        }
        if (this instanceof RMP) {
            return 5;
        }
        if (this instanceof RMQ) {
            int i = 32;
            if (((RMQ) this).A00 >= 0) {
                i = 0;
            }
            return (i >> 5) & 7;
        }
        if (this instanceof RMM) {
            return 2;
        }
        if (this instanceof RML) {
            return 7;
        }
        return 4;
    }

    public final int A03() {
        if (this instanceof RMP) {
            return ((RMP) this).A00;
        }
        if (this instanceof RMO) {
            return ((RMO) this).A00;
        }
        return 0;
    }

    public static final AbstractC64527TId A01(AbstractC64527TId abstractC64527TId, Class cls) {
        if (cls.isInstance(abstractC64527TId)) {
            return (AbstractC64527TId) cls.cast(abstractC64527TId);
        }
        throw new Exception(AnonymousClass001.A0u("Expected a ", cls.getName(), " value, but got ", MSY.A0h(abstractC64527TId)));
    }
}
