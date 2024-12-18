package X;

/* renamed from: X.6w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154006w9 extends C4F4 {
    public final C51756Mtf A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C154006w9) && C14360o3.A0K(this.A00, ((C154006w9) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51756Mtf c51756Mtf;
        C154006w9 c154006w9 = (C154006w9) obj;
        C51756Mtf c51756Mtf2 = this.A00;
        if (c154006w9 != null) {
            c51756Mtf = c154006w9.A00;
        } else {
            c51756Mtf = null;
        }
        return C14360o3.A0K(c51756Mtf2, c51756Mtf);
    }

    public C154006w9(C51756Mtf c51756Mtf) {
        this.A00 = c51756Mtf;
    }
}
