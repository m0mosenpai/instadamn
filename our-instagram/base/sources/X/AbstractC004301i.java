package X;

/* renamed from: X.01i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC004301i implements InterfaceC08830cm {
    public Object A00;

    public abstract Object A00();

    @Override // X.InterfaceC08830cm
    public final synchronized Object get() {
        Object obj;
        obj = this.A00;
        if (obj == null) {
            obj = A00();
            this.A00 = obj;
        }
        return obj;
    }
}
