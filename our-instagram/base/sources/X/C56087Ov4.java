package X;

/* renamed from: X.Ov4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56087Ov4 implements InterfaceC66482zP {
    public final boolean A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Boolean.valueOf(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56087Ov4 c56087Ov4 = (C56087Ov4) obj;
        C14360o3.A0B(c56087Ov4, 0);
        return AbstractC167007dF.A1P(c56087Ov4.A00 ? 1 : 0, this.A00 ? 1 : 0);
    }

    public C56087Ov4(boolean z) {
        this.A00 = z;
    }
}
