package X;

/* renamed from: X.0M0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M0 {
    public final Class A00;
    public final Object A01;

    public final String toString() {
        String name = this.A00.getName();
        Object obj = this.A01;
        return AnonymousClass001.A15("< SubType Instance cls: ", name, " parma val: ", obj.toString(), " [cls: ", obj.getClass().getName(), "] >");
    }

    public C0M0(Class cls, Object obj) {
        this.A00 = cls;
        this.A01 = obj;
    }
}
