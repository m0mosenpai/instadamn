package X;

/* renamed from: X.18R, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C18R implements C18P {
    public final int A00;
    public final Object A01;

    @Override // X.C18P
    public C18P BWo() {
        return null;
    }

    @Override // X.C18P
    public final int BD2() {
        return this.A00;
    }

    @Override // X.C18P
    public final Object getKey() {
        return this.A01;
    }

    public C18R(Object key, int hash) {
        this.A01 = key;
        this.A00 = hash;
    }
}
