package X;

/* renamed from: X.TeA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65135TeA extends TT7 {
    public final TTG A00;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        TTG ttg = this.A00;
        Object[] objArr = this.A02;
        return new C65124Tdz(objArr[i - 2], objArr[i - 1], ttg);
    }

    public C65135TeA(TTG ttg) {
        this.A00 = ttg;
    }
}
