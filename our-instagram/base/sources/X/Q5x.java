package X;

/* loaded from: classes10.dex */
public final class Q5x extends AbstractC128315r0 {
    public final TTF A00;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        TTF ttf = this.A00;
        Object[] objArr = this.A02;
        return new C128365r5(ttf, objArr[i - 2], objArr[i - 1]);
    }

    public Q5x(TTF ttf) {
        this.A00 = ttf;
    }
}
