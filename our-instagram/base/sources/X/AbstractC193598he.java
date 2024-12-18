package X;

/* renamed from: X.8he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC193598he {
    public final int A00;
    public final Object A01;

    public final Object A00() {
        Object obj = this.A01;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Calling #get() on Resource [", getClass().getCanonicalName(), "] without data"));
    }

    public final boolean A01() {
        if (!(this instanceof C193648hk) && !(this instanceof C187398Sh)) {
            return false;
        }
        return true;
    }

    public AbstractC193598he(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }
}
