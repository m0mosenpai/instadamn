package X;

/* renamed from: X.1El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23781El {
    public String A00;
    public String A01;
    public String A02;

    public final String toString() {
        String str = this.A02;
        if (str == null) {
            String A0g = AnonymousClass001.A0g(this.A00, ": ", this.A01);
            this.A02 = A0g;
            return A0g;
        }
        return str;
    }

    public C23781El(String str, String str2) {
        this.A00 = str;
        this.A01 = str2 == null ? "" : str2;
    }

    public C23781El() {
    }
}
