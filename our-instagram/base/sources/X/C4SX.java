package X;

/* renamed from: X.4SX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SX implements InterfaceC02580Ag {
    public final Long A00;

    @Override // X.InterfaceC02580Ag
    public final /* bridge */ /* synthetic */ Object F7g() {
        return this.A00;
    }

    public C4SX(Long l) {
        this.A00 = l;
    }

    public static C4SX A00(String str) {
        return new C4SX(Long.valueOf(Long.parseLong(str)));
    }
}
