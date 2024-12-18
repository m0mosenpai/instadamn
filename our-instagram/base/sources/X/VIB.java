package X;

/* loaded from: classes11.dex */
public final class VIB extends Exception {
    public final Integer A00;

    public VIB(Exception exc, Integer num) {
        super(exc);
        this.A00 = num;
    }

    public VIB(String str, Integer num) {
        super(str);
        this.A00 = num;
    }
}
