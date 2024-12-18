package X;

/* renamed from: X.5r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128325r1 extends AbstractC128315r0 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Object[] objArr = this.A02;
        return new C128355r4(objArr[i - 2], objArr[i - 1]);
    }
}
