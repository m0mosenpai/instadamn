package X;

/* renamed from: X.Wh7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70794Wh7 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C70794Wh7(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A06 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70794Wh7 c70794Wh7 = (C70794Wh7) obj;
        C14360o3.A0B(c70794Wh7, 0);
        if (C14360o3.A0K(this.A06, c70794Wh7.A06) && C14360o3.A0K(this.A04, c70794Wh7.A04) && C14360o3.A0K(this.A03, c70794Wh7.A03)) {
            String str = this.A05;
            String str2 = c70794Wh7.A05;
            if (C14360o3.A0K(str, str2) && C14360o3.A0K(str, str2) && this.A00 == c70794Wh7.A00 && this.A01 == c70794Wh7.A01 && this.A02 == c70794Wh7.A02) {
                return true;
            }
        }
        return false;
    }
}
