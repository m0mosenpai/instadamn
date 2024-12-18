package X;

/* renamed from: X.Ov1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56084Ov1 implements InterfaceC66482zP {
    public final C38900HAw A00;

    public C56084Ov1(C38900HAw c38900HAw) {
        C14360o3.A0B(c38900HAw, 1);
        this.A00 = c38900HAw;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A03;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56084Ov1 c56084Ov1 = (C56084Ov1) obj;
        C14360o3.A0B(c56084Ov1, 0);
        String str = this.A00.A03;
        C14360o3.A07(str);
        String str2 = c56084Ov1.A00.A03;
        C14360o3.A07(str2);
        return str.equals(str2);
    }
}
