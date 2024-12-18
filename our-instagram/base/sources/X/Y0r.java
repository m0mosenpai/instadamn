package X;

/* loaded from: classes12.dex */
public final class Y0r {
    public boolean A00;
    public final YQ7 A01;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A00 = true;
            notifyAll();
        }
    }

    public Y0r(YQ7 yq7) {
        this.A01 = yq7;
    }

    public Y0r() {
        this(YQ7.A00);
    }
}
