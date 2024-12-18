package X;

/* renamed from: X.Te7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65132Te7 extends TT7 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A01 + 2;
        this.A01 = i;
        Object[] objArr = this.A02;
        return new C64768TTc(objArr[i - 2], objArr[i - 1]);
    }
}
