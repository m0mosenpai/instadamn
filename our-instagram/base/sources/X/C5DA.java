package X;

/* renamed from: X.5DA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DA implements C5DB {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5DA) && this.A00 == ((C5DA) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("AndroidFontResolveInterceptor(fontWeightAdjustment=", ')', this.A00);
    }

    public C5DA(int i) {
        this.A00 = i;
    }
}
