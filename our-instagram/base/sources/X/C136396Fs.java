package X;

/* renamed from: X.6Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136396Fs implements InterfaceC136406Ft {
    public final java.util.Set A00;

    @Override // X.InterfaceC136406Ft
    public final void A7j(String str) {
        C14360o3.A0B(str, 0);
        this.A00.add(str);
    }

    @Override // X.InterfaceC136406Ft
    public final void A7t(Iterable iterable) {
        AnonymousClass016.A16(iterable, this.A00);
    }

    public C136396Fs(java.util.Set set) {
        this.A00 = set;
    }
}
