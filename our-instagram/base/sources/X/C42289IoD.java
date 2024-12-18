package X;

/* renamed from: X.IoD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42289IoD implements InterfaceC66482zP {
    public final String A00;

    public C42289IoD(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C42289IoD c42289IoD = (C42289IoD) obj;
        String str2 = this.A00;
        if (c42289IoD != null) {
            str = c42289IoD.A00;
        } else {
            str = null;
        }
        return AbstractC167007dF.A1M(C14360o3.A0K(str2, str) ? 1 : 0);
    }
}
