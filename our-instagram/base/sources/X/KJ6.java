package X;

/* loaded from: classes8.dex */
public final class KJ6 extends C4F4 {
    public final Integer A00;
    public final boolean A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KJ6 kj6 = (KJ6) obj;
        C14360o3.A0B(kj6, 0);
        if (C14360o3.A0K(this.A00, kj6.A00) && this.A01 == kj6.A01) {
            return true;
        }
        return false;
    }

    public KJ6(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public KJ6() {
        this(null, false);
    }
}
