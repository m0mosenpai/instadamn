package X;

/* renamed from: X.IoB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42287IoB implements InterfaceC66482zP {
    public final C41643IbZ A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42287IoB c42287IoB = (C42287IoB) obj;
        C14360o3.A0B(c42287IoB, 0);
        return AbstractC167007dF.A1M(C14360o3.A0K(this.A00, c42287IoB.A00) ? 1 : 0);
    }

    public C42287IoB(C41643IbZ c41643IbZ) {
        this.A00 = c41643IbZ;
    }
}
