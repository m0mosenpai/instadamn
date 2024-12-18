package X;

/* renamed from: X.Ioy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42336Ioy implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0T(this.A01, this.A02, ':');
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42336Ioy c42336Ioy = (C42336Ioy) obj;
        C14360o3.A0B(c42336Ioy, 0);
        if (C14360o3.A0K(this.A02, c42336Ioy.A02) && C14360o3.A0K(this.A03, c42336Ioy.A03) && C14360o3.A0K(this.A00, c42336Ioy.A00)) {
            return true;
        }
        return false;
    }

    public C42336Ioy(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public C42336Ioy() {
        this("", "", "", "");
    }
}
