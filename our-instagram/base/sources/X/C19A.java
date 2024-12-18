package X;

/* renamed from: X.19A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19A implements C19B {
    public final boolean A00;

    @Override // X.C19B
    public final C27281Uc BNj() {
        return null;
    }

    @Override // X.C19B
    public final boolean isActive() {
        return this.A00;
    }

    public final String toString() {
        String str;
        if (this.A00) {
            str = "Active";
        } else {
            str = "New";
        }
        return AnonymousClass001.A0S("Empty{", str, '}');
    }

    public C19A(boolean z) {
        this.A00 = z;
    }
}
