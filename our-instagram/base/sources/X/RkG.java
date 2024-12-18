package X;

/* loaded from: classes10.dex */
public final class RkG extends Exception {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RkG(String str, Throwable th) {
        super(str, th);
        C3U5.A06(str, "Provided message must not be empty.");
        this.A00 = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RkG(String str, int i) {
        super(str);
        C3U5.A06(str, "Provided message must not be empty.");
        this.A00 = i;
    }
}
