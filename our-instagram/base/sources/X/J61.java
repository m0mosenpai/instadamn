package X;

/* loaded from: classes7.dex */
public final class J61 implements Runnable, Comparable {
    public final int A00;
    public final Runnable A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        J61 j61 = (J61) obj;
        int i2 = this.A00;
        if (j61 != null) {
            i = j61.A00;
        } else {
            i = 0;
        }
        return i2 - i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.run();
    }

    public final String toString() {
        return AnonymousClass001.A02(this.A00, 0, "vertical ", " horizontal ");
    }

    public J61(int i, Runnable runnable) {
        this.A01 = runnable;
        this.A00 = i;
    }
}
