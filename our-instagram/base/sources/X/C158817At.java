package X;

/* renamed from: X.7At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158817At extends AbstractC158777Ao {
    public final XVU A00;
    public final AbstractC27437C9f A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158817At) {
                C158817At c158817At = (C158817At) obj;
                if (!C14360o3.A0K(this.A00, c158817At.A00) || !C14360o3.A0K(this.A01, c158817At.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        XVU xvu = this.A00;
        int hashCode = (xvu == null ? 0 : xvu.hashCode()) * 31;
        AbstractC27437C9f abstractC27437C9f = this.A01;
        return hashCode + (abstractC27437C9f != null ? abstractC27437C9f.hashCode() : 0);
    }

    public C158817At(XVU xvu, AbstractC27437C9f abstractC27437C9f) {
        this.A00 = xvu;
        this.A01 = abstractC27437C9f;
    }
}
