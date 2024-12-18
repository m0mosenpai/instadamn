package X;

/* loaded from: classes4.dex */
public final class B4Y extends RuntimeException {
    public final int A00;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                if (i != 100) {
                    str = AnonymousClass001.A0c("other(", ")", i);
                } else {
                    str = "server_died";
                }
            } else {
                str = AbstractC111324zv.A00(2323);
            }
        } else {
            str = "unknown";
        }
        return AnonymousClass001.A0g(str, ": ", super.getMessage());
    }

    public B4Y(int i, String str) {
        super(str);
        this.A00 = i;
    }
}
