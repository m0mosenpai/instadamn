package X;

/* renamed from: X.5tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129815tl extends AbstractC129825tm {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C129815tl) && C14360o3.A0K(this.A00, ((C129815tl) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public C129815tl(String str) {
        this.A00 = str;
    }
}
