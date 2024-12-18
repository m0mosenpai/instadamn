package X;

@Deprecated
/* renamed from: X.8qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198988qy {
    public final boolean A00;
    public final Object A01;

    public final Object A00() {
        if (this.A00) {
            return this.A01;
        }
        throw new IllegalStateException("Cannot get value of EditField that is not set");
    }

    public C198988qy(boolean z, Object obj) {
        this.A00 = z;
        this.A01 = obj;
    }
}
