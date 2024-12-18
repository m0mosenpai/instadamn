package X;

/* renamed from: X.Wpd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71191Wpd implements Comparable {
    public final int A00;
    public final C69472Vnv A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.A00;
        int i2 = ((C71191Wpd) obj).A00;
        if (i == i2) {
            return 0;
        }
        if (i >= i2) {
            return 1;
        }
        return -1;
    }

    public C71191Wpd(C69472Vnv c69472Vnv, int i) {
        this.A00 = i;
        this.A01 = c69472Vnv;
    }
}
