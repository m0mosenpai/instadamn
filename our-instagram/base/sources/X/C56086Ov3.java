package X;

/* renamed from: X.Ov3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56086Ov3 implements InterfaceC66482zP {
    public final C3G4 A00;

    public C56086Ov3(C3G4 c3g4) {
        C14360o3.A0B(c3g4, 1);
        this.A00 = c3g4;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A03.A1o;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56086Ov3 c56086Ov3 = (C56086Ov3) obj;
        if (c56086Ov3 != null) {
            str = c56086Ov3.A00.A03.A1o;
            C14360o3.A07(str);
        } else {
            str = null;
        }
        String str2 = this.A00.A03.A1o;
        C14360o3.A07(str2);
        return C14360o3.A0K(str, str2);
    }
}
