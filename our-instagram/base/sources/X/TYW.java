package X;

/* loaded from: classes10.dex */
public final class TYW extends ThreadLocal {
    public final /* synthetic */ int A00;

    public TYW(int i) {
        this.A00 = i;
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new Object[this.A00];
    }
}
