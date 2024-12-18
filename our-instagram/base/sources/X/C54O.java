package X;

/* renamed from: X.54O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54O extends C0T6 implements C47Q {
    public final C54M A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C54O) && C14360o3.A0K(this.A00, ((C54O) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C47Q
    public final C47R C3q() {
        String str = this.A00.A04;
        C14360o3.A0B(str, 0);
        C47R c47r = (C47R) C47R.A01.get(str);
        if (c47r != null) {
            return c47r;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C54O(C54M c54m) {
        this.A00 = c54m;
    }
}
